package ocdiary.testmod.items;

import ocdiary.testmod.TestMod;
import ocdiary.testmod.init.ModelProvider;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ModelProvider{
    protected String name;

    public ItemBase(String name){
        this.name = name;
        this.setCreativeTab(TestMod.CREATIVETAB);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }


    @Override
    public void registerItemModel(Item item) {
        TestMod.proxy.registerItemRenderer(this, 0, name);
    }
}
