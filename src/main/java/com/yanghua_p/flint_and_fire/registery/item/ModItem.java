package com.yanghua_p.flint_and_fire.registery.item;

import com.yanghua_p.flint_and_fire.FlintAndFire;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItem {

    public static final DeferredRegister.Items ITEMS = DeferredRegister
            .createItems(FlintAndFire.MODID);


    public static final Supplier<Item> FLINT_PAN = ITEMS.registerSimpleItem("flint_pan", new Item.Properties()
            .rarity(Rarity.COMMON)
    );
}
