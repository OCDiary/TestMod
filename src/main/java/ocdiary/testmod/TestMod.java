package ocdiary.testmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ocdiary.testmod.proxy.CommonProxy;
import ocdiary.testmod.registry.Refs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = Refs.MODID, name = Refs.NAME, version = Refs.VERSION)
public class TestMod {

    public static final Logger LOGGER = LogManager.getLogger("The Oink");

    public static int mobEffectTime = 2000;

    @Mod.Instance(Refs.MODID)
    public static TestMod instance;


    @SidedProxy(serverSide = Refs.SPROXY, clientSide = Refs.CPROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Refs.NAME + "now loading...");
        proxy.preInit(event);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}
