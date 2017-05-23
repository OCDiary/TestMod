package ocdiary.testmod.items;


import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ocdiary.testmod.init.ModelProvider;

public class TestItems {

    public static void init() {
        //Items go here

    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);
        if (item instanceof ModelProvider)
            ((ModelProvider)item).registerItemModel(item);
        return item;
    }
}
