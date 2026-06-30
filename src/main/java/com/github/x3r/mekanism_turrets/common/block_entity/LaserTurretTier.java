package com.github.x3r.mekanism_turrets.common.block_entity;

import com.github.x3r.mekanism_turrets.MekanismTurretsConfig;
import mekanism.api.tier.BaseTier;
import mekanism.api.tier.ITier;
import mekanism.common.config.value.CachedFloatValue;
import mekanism.common.config.value.CachedIntValue;

import java.util.function.Supplier;

public enum LaserTurretTier implements ITier {
    BASIC(BaseTier.BASIC, 50, 2, 2500, 15, 0.1F),
    ADVANCED(BaseTier.ADVANCED, 25, 5, 125000, 25, 0.05F),
    ELITE(BaseTier.ELITE, 10, 10, 250000, 50, 0.02F),
    ULTIMATE(BaseTier.ULTIMATE, 3, 5, 1250000, 100, 0.1F);

    private final BaseTier baseTier;
    private final int cooldown;
    private final double damage;
    private final int energyCapacity;
    private final double range;
    private final float accuracy;
    private Integer cooldownReference;
    private Double damageReference;
    private Integer energyCapacityReference;
    private Double rangeReference;
    private Double accuracyReference;

    LaserTurretTier(BaseTier baseTier, int cooldown, double damage, int energyCapacity, double range, float accuracy) {
        this.baseTier = baseTier;
        this.cooldown = cooldown;
        this.damage = damage;
        this.energyCapacity = energyCapacity;
        this.range = range;
        this.accuracy = accuracy;
    }

    @Override
    public BaseTier getBaseTier() {
        return baseTier;
    }

    public int getCooldown() {
        return cooldownReference == null ? getBaseCooldown() : cooldownReference;
    }
    private int getBaseCooldown() {
        return cooldown;
    }

    public double getDamage() {
        return damageReference == null ? getBaseDamage() : damageReference;
    }
    private double getBaseDamage() {
        return damage;
    }

    public double getAccuracy() {
        return accuracyReference == null ? getBaseAccuracy() : accuracyReference;
    }
    private double getBaseAccuracy() {
        return accuracy;
    }

    public int getEnergyCapacity() {
        return energyCapacityReference == null ? getBaseEnergyCapacity() : energyCapacityReference;
    }

    private int getBaseEnergyCapacity() {
        return energyCapacity;
    }

    public double getRange() {
        return rangeReference == null ? getBaseRange() : rangeReference;
    }

    private double getBaseRange() {
        return range;
    }

    public void setConfigReference(Supplier<Integer> cooldownReference, Supplier<Double> damageReference, Supplier<Integer> energyCapacityReference, Supplier<Double> rangeReference) {
        this.cooldownReference = cooldownReference.get();
        this.damageReference = damageReference.get();
        this.energyCapacityReference = energyCapacityReference.get();
        this.rangeReference = rangeReference.get();
    }

}
