package universalteam.atomcraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import scala.xml.Atom;
import universalteam.atomcraft.atoms.AtomInit;
import universalteam.atomcraft.libs.AtomCraftLibs;

@Mod(modid = AtomCraftLibs.modid, name = AtomCraftLibs.modname, version = AtomCraftLibs.version)
public class ModAtomCraft
{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        AtomInit.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
