package com.github.x3r.mekanism_turrets.common.registry;

import com.github.x3r.mekanism_turrets.MekanismTurrets;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegistry {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MekanismTurrets.MOD_ID);

    public static final RegistryObject<SoundEvent> TURRET_SHOOT = SOUNDS.register("turret_shoot",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MekanismTurrets.MOD_ID, "turret_shoot")));
    public static final RegistryObject<SoundEvent> TURRET_BASIC = SOUNDS.register("turret_basic",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MekanismTurrets.MOD_ID, "turret_basic")));
    public static final RegistryObject<SoundEvent> TURRET_ADVANCED = SOUNDS.register("turret_advanced",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MekanismTurrets.MOD_ID, "turret_advanced")));
    public static final RegistryObject<SoundEvent> TURRET_ELITE = SOUNDS.register("turret_elite",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MekanismTurrets.MOD_ID, "turret_elite")));
    public static final RegistryObject<SoundEvent> TURRET_ULTIMATE = SOUNDS.register("turret_ultimate",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MekanismTurrets.MOD_ID, "turret_ultimate")));
    public static final RegistryObject<SoundEvent> TURRET_LOCKON = SOUNDS.register("turret_lockon",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MekanismTurrets.MOD_ID, "turret_lockon")));
}
