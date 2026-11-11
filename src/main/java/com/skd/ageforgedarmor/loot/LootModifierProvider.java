package com.skd.ageforgedarmor.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import com.skd.ageforgedarmor.Constants;

import java.util.concurrent.CompletableFuture;

public class LootModifierProvider extends GlobalLootModifierProvider {

    public LootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Constants.MOD_ID);
    }

    @Override
    protected void start() {
        add("bamboo_hat_in_mineshaft",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.ABANDONED_MINESHAFT)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.35f).build()
                                },
                                0,
                                Constants.BAMBOO_HAT_NAME,
                                1.0f
                        )
                );

        add("bamboo_hat_in_shipwreck_supply",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.SHIPWRECK_SUPPLY)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.35f).build()
                                },
                                0,
                                Constants.BAMBOO_HAT_NAME,
                                1.0f
                        )
                );

        add("bamboo_hat_in_village_taiga_house",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.VILLAGE_TAIGA_HOUSE)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.35f).build()
                                },
                                0,
                                Constants.BAMBOO_HAT_NAME,
                                1.0f
                        )
                );

        add("bamboo_hat_in_village_snowy_house",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.VILLAGE_SNOWY_HOUSE)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.35f).build()
                                },
                                0,
                                Constants.BAMBOO_HAT_NAME,
                                1.0f
                        )
                );

        add("bamboo_hat_in_village_desert_house",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.VILLAGE_DESERT_HOUSE)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.35f).build()
                                },
                                0,
                                Constants.BAMBOO_HAT_NAME,
                                1.0f
                        )
                );

        add("anubis_armor_in_desert_pyramid",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.DESERT_PYRAMID)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.4f).build()
                                },
                                0,
                                Constants.ANUBIS_ARMOR_NAME,
                                0.15f
                        )
                );

        add("centurion_armor_in_shipwreck_treasure",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.SHIPWRECK_TREASURE)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.12f).build()
                                },
                                0,
                                Constants.CENTURION_ARMOR_NAME,
                                0.0f
                        )
                );

        add("exalted_aurum_in_ancient_city",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.ANCIENT_CITY)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.10f).build()
                                },
                                0,
                                Constants.EXALTED_AURUM_ARMOR_NAME,
                                0.10f
                        )
                );

        add("exalted_aurum_in_bastion_treasure",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.BASTION_TREASURE)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.15f).build()
                                },
                                0,
                                Constants.EXALTED_AURUM_ARMOR_NAME,
                                0.0f
                        )
                );

        add("holy_armor_in_stronghold_library",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.STRONGHOLD_LIBRARY)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.10f).build()
                                },
                                0,
                                Constants.HOLY_ARMOR_NAME,
                                0.10f
                        )
                );

        add("holy_armor_in_stronghold_corridor",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.STRONGHOLD_CORRIDOR)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.05f).build()
                                },
                                0,
                                Constants.HOLY_ARMOR_NAME,
                                0.10f
                        )
                );

        add("iron_plate_armor_in_igloo",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.IGLOO_CHEST)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.30f).build()
                                },
                                0,
                                Constants.IRON_PLATE_ARMOR_NAME,
                                0.50f
                        )
                );

        add("japanese_light_armor_in_jungle_temple",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.JUNGLE_TEMPLE)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.60f).build()
                                },
                                0,
                                Constants.JAPANESE_LIGHT_ARMOR_NAME,
                                0.50f
                        )
                );

        add("o_yoroi_armor_in_ruined_portal",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.RUINED_PORTAL)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.10f).build()
                                },
                                0,
                                Constants.O_YOROI_ARMOR_NAME,
                                0.30f
                        )
                );

        add("pharaoh_armor_in_desert_pyramid",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.DESERT_PYRAMID)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.20f).build()
                                },
                                0,
                                Constants.PHARAOH_ARMOR_NAME,
                                0.15f
                        )
                );

        add("quetzalcoatl_armor_in_end_city",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.END_CITY_TREASURE)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.30f).build()
                                },
                                0,
                                Constants.QUETZALCOATL_ARMOR_NAME,
                                0.0f
                        )
                );

        add("raijin_armor_in_end_city",
                        new AgeforgedArmorLootModifier(
                                new LootItemCondition[] {
                                        LootTableIdCondition.builder(Identifier.parse(LootTablesToModify.END_CITY_TREASURE)).build(),
                                        LootItemRandomChanceCondition.randomChance(0.30f).build()
                                },
                                0,
                                Constants.RAIJIN_ARMOR_NAME,
                                0.0f
                        )
                );
    }
}