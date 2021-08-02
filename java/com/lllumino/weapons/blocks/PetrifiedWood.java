package com.lllumino.weapons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PetrifiedWood extends Block {
    public PetrifiedWood() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(4.0f, 5.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
