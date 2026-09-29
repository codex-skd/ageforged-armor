package com.skd.ageforgedarmor.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;
import com.skd.ageforgedarmor.CommonClass;

import java.util.function.Consumer;
import com.skd.ageforgedarmor.client.ArmorModelProvider;
import com.skd.ageforgedarmor.registry.ModelProviderRegistry;
import com.skd.ageforgedarmor.setbonus.SetBonus;
import com.skd.ageforgedarmor.setbonus.SetBonusRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.skd.ageforgedarmor.Constants.MOD_ID;

public class HumanoidArmorItem extends Item {

    private static final EquipmentSlot[] ARMOR_SLOTS = {
            EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET
    };

    private final String armorSetName;
    private final String armorPartName;
    private final Holder<ArmorMaterial> material;

    public static Rarity deriveRarity(Holder<ArmorMaterial> material) {
        if (material.value().knockbackResistance() > 0f) return Rarity.EPIC;
        if (material.value().toughness() >= 2f) return Rarity.RARE;
        if (material.value().defense().getOrDefault(ArmorType.HELMET, 0) >= 2) return Rarity.UNCOMMON;
        return Rarity.COMMON;
    }

    public HumanoidArmorItem(@NotNull String armorSetName, Holder<ArmorMaterial> material, ArmorType type, int durabilityFactor) {
        super(new Properties().stacksTo(1).durability(type.getDurability(durabilityFactor)).rarity(deriveRarity(material)).humanoidArmor(material.value(), type));
        this.armorSetName = armorSetName;
        this.armorPartName = armorSetName + "_" + type.getSlot().getName();
        this.material = material;
    }

    public HumanoidArmorItem(@NotNull String armorSetName, Item.Properties properties, Holder<ArmorMaterial> material, ArmorType type, int durabilityFactor) {
        super(properties);
        this.armorSetName = armorSetName;
        this.armorPartName = armorSetName + "_" + type.getSlot().getName();
        this.material = material;
    }

    public @Nullable ArmorModelProvider getModelProvider() {
        return ModelProviderRegistry.REGISTRY.get(this.armorPartName);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltipConsumer, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, display, tooltipConsumer, tooltipFlag);

        SetBonusRegistry.get(this.armorSetName).ifPresent(bonus -> {
            tooltipConsumer.accept(Component.empty());

            Player player = CommonClass.LOCAL_PLAYER_SUPPLIER.get();

            for (EquipmentSlot slot : ARMOR_SLOTS) {
                boolean equipped = isSlotEquippedWithSet(player, slot);
                tooltipConsumer.accept(Component.translatable("set_bonus." + MOD_ID + ".slot." + slot.getName())
                        .withStyle(equipped ? ChatFormatting.WHITE : ChatFormatting.DARK_GRAY));
            }

            boolean fullSetEquipped = player != null
                    && isSlotEquippedWithSet(player, EquipmentSlot.HEAD)
                    && isSlotEquippedWithSet(player, EquipmentSlot.CHEST)
                    && isSlotEquippedWithSet(player, EquipmentSlot.LEGS)
                    && isSlotEquippedWithSet(player, EquipmentSlot.FEET);
            ChatFormatting nameColor = fullSetEquipped ? bonus.nameColor() : ChatFormatting.DARK_GRAY;
            MutableComponent bonusName = Component.translatable(bonus.nameTranslationKey()).withStyle(nameColor);
            tooltipConsumer.accept(Component.translatable("set_bonus." + MOD_ID + ".unlock", bonusName)
                    .withStyle(ChatFormatting.GRAY));

            if (bonus.descriptionTranslationKey() != null) {
                tooltipConsumer.accept(Component.translatable(bonus.descriptionTranslationKey())
                        .withStyle(fullSetEquipped ? ChatFormatting.WHITE : ChatFormatting.DARK_GRAY));
            }
        });
    }

    private boolean isSlotEquippedWithSet(@Nullable Player player, EquipmentSlot slot) {
        if (player == null) return false;
        ItemStack equipped = player.getItemBySlot(slot);
        if (equipped.isEmpty()) return false;
        Identifier key = BuiltInRegistries.ITEM.getKey(equipped.getItem());
        return MOD_ID.equals(key.getNamespace())
                && (armorSetName + "_" + slot.getName()).equals(key.getPath());
    }
}
