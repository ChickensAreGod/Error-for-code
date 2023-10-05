package com.TheGodChicken685.playgroundmod.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "playgroundmod");

    public static RegistryObject<SoundEvent> DOWSING_ROD_FOUND_ORE
            = registerSoundEvents("dowsing_rod_found_ore");



    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
    	System.out.println(" In registry of sound");
        ResourceLocation id = new ResourceLocation("playgroundmod", name);
        System.out.println ("registry of sound finished " + name);
        
        RegistryObject<SoundEvent> sEvent=SOUND_EVENTS.register(name, () -> new SoundEvent(id));
        
        System.out.println ("after registering " + name + " " +sEvent.getId().getPath());
        
        //System.out.print("after registering with id " +sEvent.get());
        
        return sEvent;
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
