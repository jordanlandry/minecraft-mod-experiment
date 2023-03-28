package net.jannin.mod.item;

import net.jannin.mod.Mod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


import static net.jannin.mod.Mod.MODID;

@net.minecraftforge.fml.common.Mod.EventBusSubscriber(modid = MODID, bus = net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCreativeModeTab {

    public static CreativeModeTab TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        TAB = event.registerCreativeModeTab(new ResourceLocation(MODID, "tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.POOP.get())).title(Component.literal("New Tab")).build());
    }
}
