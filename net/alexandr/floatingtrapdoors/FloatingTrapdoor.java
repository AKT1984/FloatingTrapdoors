package net.alexandr.floatingtrapdoors;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@Mod(modid = "floatingtrapdoors", name = "Floating Trapdoors", version = "1.0")
public class FloatingTrapdoor {

    public static Block customTrapdoor;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	Block.blocksList[96] = null;
        customTrapdoor = new CustomBlockTrapDoor(96, Material.wood)
            .setHardness(3.0F)
            .setStepSound(Block.soundWoodFootstep)
            .setUnlocalizedName("trapdoor")
            .setTextureName("trapdoor");
        Block.blocksList[96] = customTrapdoor;

    }
}
