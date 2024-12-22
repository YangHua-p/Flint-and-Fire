package com.yanghua_p.flint_and_fire.registery.block;

import com.yanghua_p.flint_and_fire.FlintAndFire;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlock {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister
            .createBlocks(FlintAndFire.MODID);
    public static final DeferredBlock<Block> FLINT_BLOCK = BLOCKS.register(
            "flint_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(2.0f)                          // 破坏时间为2.0秒
                    .explosionResistance(10.0f)           // 爆炸抵抗力为10.0
                    .sound(SoundType.GRAVEL)                                // 声音类型为沙砾
                    .lightLevel(state -> 7)                                 // 光照强度为7
            )
    );
}
