package com.yanghua_p.flint_and_fire;


import com.yanghua_p.flint_and_fire.registery.item.ModGroup;
import com.yanghua_p.flint_and_fire.registery.item.ModItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;




// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(FlintAndFire.MODID)
public class FlintAndFire {

    public static final String MODID="flint_and_fire";
    public FlintAndFire(IEventBus event) {
        ModItem.ITEMS.register(event);
        ModGroup.CREATIVE_MODE_TABS.register(event);
    }
}

