package com.spookiestofsquid.devilmaycraft.item;

import com.spookiestofsquid.devilmaycraft.DevilMayCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DevilMayCraft.MODID);

    public static final RegistryObject<CreativeModeTab> DEVIL_MAY_CRAFT_TAB = CREATIVE_MODE_TAB.register("devilmaycraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RED_ORB.get()))
                    .title(Component.translatable("creativetab.devilmaycraft.tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RED_ORB.get());
                        pOutput.accept(ModItems.GREEN_ORB.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}