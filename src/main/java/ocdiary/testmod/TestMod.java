package ocdiary.testmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ocdiary.testmod.init.TestTab;
import ocdiary.testmod.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = TestMod.MODID, name = TestMod.NAME, version = TestMod.VERSION)
public class TestMod {

    public static final String MODID = "testmod";
    public static final String NAME = "Test Mod";
    public static final String VERSION = "1.10.2-1";

    public static final String CPROXY = "ocdiary.testmod.proxy.ClientProxy";
    public static final String SPROXY = "ocdiary.testmod.proxy.CommonProxy";

    public static final Logger LOGGER = LogManager.getLogger("TestMod");

    public static TestTab CREATIVETAB = new TestTab();

    public static int mobEffectTime = 2000;

    @Mod.Instance(TestMod.MODID)
    public static TestMod instance;


    @SidedProxy(serverSide = TestMod.SPROXY, clientSide = TestMod.CPROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(TestMod.NAME + "now loading...");
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
