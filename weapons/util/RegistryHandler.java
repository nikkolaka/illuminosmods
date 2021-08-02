package com.lllumino.weapons.util;

import com.lllumino.weapons.Weapons;
import com.lllumino.weapons.armor.ModArmorMaterial;
import com.lllumino.weapons.blocks.BlockItemBase;
import com.lllumino.weapons.blocks.PetrifiedWood;
import com.lllumino.weapons.blocks.ShirokoSteelBlock;
import com.lllumino.weapons.blocks.ShirokoSteelOre;
import com.lllumino.weapons.items.ItemBase;
import com.lllumino.weapons.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Weapons.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Weapons.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }


    // TOOLS
    public static final RegistryObject<SwordItem> UCHIGATANA = ITEMS.register("uchigatana", () ->
            new SwordItem(ModItemTier.SHIROKO_STEEL, 500, -1.0f, new Item.Properties().group(Weapons.TAB)));

    public static final RegistryObject<SwordItem> WASHINGPOLE = ITEMS.register("washingpole", () ->
            new SwordItem(ModItemTier.SHIROKO_STEEL, 5, -3.0f, new Item.Properties().group(Weapons.TAB)));

    //ITEMS
    public static final RegistryObject<Item> PETRIFIED_SHARD = ITEMS.register("petrified_shard", ItemBase::new);
    public static final RegistryObject<Item> SHIROKO_STEEL_INGOT = ITEMS.register("shiroko_steel_ingot", ItemBase::new);

    //ARMOR
    public static final RegistryObject<ArmorItem> FAVOR_HELMET = ITEMS.register( "favor_helmet", () -> new ArmorItem(ModArmorMaterial.FAVOR, EquipmentSlotType.HEAD, new Item.Properties().group(Weapons.TAB)));
    public static final RegistryObject<ArmorItem> FAVOR_CHESTPLATE = ITEMS.register( "favor_chestplate", () -> new ArmorItem(ModArmorMaterial.FAVOR, EquipmentSlotType.CHEST, new Item.Properties().group(Weapons.TAB)));
    public static final RegistryObject<ArmorItem> FAVOR_LEGGINGS = ITEMS.register( "favor_leggings", () -> new ArmorItem(ModArmorMaterial.FAVOR, EquipmentSlotType.LEGS, new Item.Properties().group(Weapons.TAB)));
    public static final RegistryObject<ArmorItem> FAVOR_BOOTS = ITEMS.register( "favor_boots", () -> new ArmorItem(ModArmorMaterial.FAVOR, EquipmentSlotType.FEET, new Item.Properties().group(Weapons.TAB)));

    // Blocks
    public static final RegistryObject<Block> SHIROKO_STEEL_ORE = BLOCKS.register("shiroko_steel_ore", ShirokoSteelOre::new);
    public static final RegistryObject<Block> PETRIFIED_WOOD = BLOCKS.register("petrified_wood", PetrifiedWood::new);
    public static final RegistryObject<Block> SHIROKO_STEEL_BLOCK = BLOCKS.register("shiroko_steel_block", ShirokoSteelBlock::new);

    // Block Items
    public static final RegistryObject<Item> SHIROKO_STEEL_ORE_ITEM = ITEMS.register("shiroko_steel_ore", () -> new BlockItemBase(SHIROKO_STEEL_ORE.get()));
    public static final RegistryObject<Item> PETRIFIED_WOOD_ITEM = ITEMS.register("petrified_wood", () -> new BlockItemBase(PETRIFIED_WOOD.get()));
    public static final RegistryObject<Item> SHIROKO_STEEL_BLOCK_ITEM = ITEMS.register("shiroko_steel_block", () -> new BlockItemBase(SHIROKO_STEEL_BLOCK.get()));




}