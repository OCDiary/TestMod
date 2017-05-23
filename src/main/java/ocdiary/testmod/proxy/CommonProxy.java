package ocdiary.testmod.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ocdiary.testmod.blocks.TestBlocks;
import ocdiary.testmod.items.TestItems;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        TestBlocks.init();
        TestItems.init();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    public void registerItemRenderer(Item item, int meta, String id) {
    }
}
