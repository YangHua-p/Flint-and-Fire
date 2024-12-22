package com.yanghua_p.flint_and_fire.registery.item;

import com.yanghua_p.flint_and_fire.FlintAndFire;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModGroup {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, FlintAndFire.MODID);

    private static final Supplier<CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("all",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + FlintAndFire.MODID + ".all"))
                    .icon(() -> new ItemStack(ModItem.FLINT_PAN.get().asItem()))
                    .displayItems((params, output) -> {
                        // 添加物品
                        output.accept(ModItem.FLINT_PAN.get());
                    }).build()
    );
}