package net.alexandr.floatingtrapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;

public class CustomBlockTrapDoor extends BlockTrapDoor {

    public CustomBlockTrapDoor(int id, Material material) {
        super(id, material);
        this.disableValidation = true;
        this.disableStats();
    }
}
