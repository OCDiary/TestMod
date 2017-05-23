package ocdiary.testmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import ocdiary.testmod.TestMod;

public class TestTab extends CreativeTabs{
    public TestTab() {
        super(TestMod.MODID);
    }

    @Override
    public Item getTabIconItem() {
        return Items.APPLE;
    }
}
