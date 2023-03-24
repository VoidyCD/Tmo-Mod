package com.voidy.tmo.items;

import com.voidy.tmo.TooManyOresMain;
import com.voidy.tmo.tool.toolBase.HoeBase;
import com.voidy.tmo.tool.toolBase.ShovelBase;
import com.voidy.tmo.tool.toolBase.SwordBase;
import com.voidy.tmo.tool.toolBase.PickaxeBase;
import com.voidy.tmo.tool.toolMaterial.ToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import javax.tools.Tool;

public class ModItems {

    public static final Item CITRINE = registerItem("citrine", new Item(new FabricItemSettings()));
    public static final Item RAW_CITRINE = registerItem("raw_citrine", new Item(new FabricItemSettings()));


    public static ToolItem CITRINE_PICKAXE_BASE = new PickaxeBase(ToolMaterial.CITRINE, 1, -2.8F, new Item.Settings());


    public static final Item CITRINE_PICKAXE = registerItem("citrine_pickaxe", CITRINE_PICKAXE_BASE);

    public static ToolItem CITRINE_SWORD_BASE = new PickaxeBase(ToolMaterial.CITRINE, 3, -2.8F, new Item.Settings());


    public static final Item CITRINE_SWORD = registerItem("citrine_sword", CITRINE_SWORD_BASE);

    public static ToolItem CITRINE_AXE_BASE = new SwordBase(ToolMaterial.CITRINE, 6, -3.0F, new Item.Settings());


    public static final Item CITRINE_AXE = registerItem("citrine_axe", CITRINE_AXE_BASE);

    public static ToolItem CITRINE_HOE_BASE = new HoeBase(ToolMaterial.CITRINE, 1, -2.8F, new Item.Settings());


    public static final Item CITRINE_HOE = registerItem("citrine_hoe", CITRINE_HOE_BASE);

    public static ToolItem CITRINE_SHOVEL_BASE = new ShovelBase(ToolMaterial.CITRINE, 1, -2.8F, new Item.Settings());

    public static final Item CITRINE_SHOVEL = registerItem("citrine_shovel", CITRINE_SHOVEL_BASE);

    public static ToolItem EMERALD_PICKAXE_BASE = new PickaxeBase(ToolMaterial.CITRINE, 1, -2.8F, new Item.Settings());


    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", EMERALD_PICKAXE_BASE);

    public static ToolItem EMERALD_SWORD_BASE = new PickaxeBase(ToolMaterial.EMERALD, 4, -2.8F, new Item.Settings());


    public static final Item EMERALD_SWORD = registerItem("emerald_sword", EMERALD_SWORD_BASE);

    public static ToolItem EMERALD_AXE_BASE = new SwordBase(ToolMaterial.EMERALD, 5, -3.0F, new Item.Settings());


    public static final Item EMERALD_AXE = registerItem("emerald_axe", EMERALD_AXE_BASE);

    public static ToolItem EMERALDE_HOE_BASE = new HoeBase(ToolMaterial.EMERALD, 1, -2.8F, new Item.Settings());


    public static final Item EMERALD_HOE = registerItem("emerald_hoe", EMERALDE_HOE_BASE);

    public static ToolItem EMERALD_SHOVEL_BASE = new ShovelBase(ToolMaterial.EMERALD, 1, -2.8F, new Item.Settings());

    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel",EMERALD_SHOVEL_BASE);


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TooManyOresMain.MOD_ID, name), item);

    }


    public static void addItemsToItemGroup() {

        addToItemGroup(ModItemGroup.TooManyOres, CITRINE);
        addToItemGroup(ModItemGroup.TooManyOres, RAW_CITRINE);
        addToItemGroup(ModItemGroup.TooManyOres, CITRINE_PICKAXE);
        addToItemGroup(ModItemGroup.TooManyOres, CITRINE_AXE);
        addToItemGroup(ModItemGroup.TooManyOres, CITRINE_SWORD);
        addToItemGroup(ModItemGroup.TooManyOres, CITRINE_SHOVEL);
        addToItemGroup(ModItemGroup.TooManyOres, CITRINE_HOE);
        addToItemGroup(ModItemGroup.TooManyOres, EMERALD_PICKAXE);
        addToItemGroup(ModItemGroup.TooManyOres, EMERALD_AXE);
        addToItemGroup(ModItemGroup.TooManyOres, EMERALD_SHOVEL);
        addToItemGroup(ModItemGroup.TooManyOres, EMERALD_SWORD);
        addToItemGroup(ModItemGroup.TooManyOres, EMERALD_HOE);



    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));

    }



    public static void registerModItems() {


        TooManyOresMain.LOGGER.info("Registering Mod Items For " + TooManyOresMain.MOD_ID);
        addItemsToItemGroup();

    }
}
