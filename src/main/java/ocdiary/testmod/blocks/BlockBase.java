package ocdiary.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import ocdiary.testmod.TestMod;
import ocdiary.testmod.init.ModelProvider;

public class BlockBase extends Block implements ModelProvider {
    private String name;
    public BlockBase(Material materialIn, String name) {
        super(materialIn);
        this.name = name;
        this.setCreativeTab(TestMod.CREATIVETAB);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }

    @Override
    public void registerItemModel(Item item) {
        TestMod.proxy.registerItemRenderer(item, 0, name);
    }
}
