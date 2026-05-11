package com.github.x3r.mekanism_turrets.common.registry;

import com.github.x3r.mekanism_turrets.MekanismTurrets;
import com.github.x3r.mekanism_turrets.common.entity.LaserEntity;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.phys.Vec3;

public class DamageTypeRegistry {

    private static final ResourceKey<DamageType> ELECTRIC_FENCE = ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.fromNamespaceAndPath(MekanismTurrets.MOD_ID, "electric_fence"));
    private static final ResourceKey<DamageType> LASER = ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.fromNamespaceAndPath(MekanismTurrets.MOD_ID, "laser"));


    public static DamageSource electricFence(RegistryAccess registryAccess, Vec3 location) {
        return new DamageSource(
                registryAccess.registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ELECTRIC_FENCE),
                location
        );
    }
    public static DamageSource laser(RegistryAccess registryAccess, LaserEntity laser) {
        return new DamageSource(
                registryAccess.registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(LASER),
                laser
        );
    }
}
