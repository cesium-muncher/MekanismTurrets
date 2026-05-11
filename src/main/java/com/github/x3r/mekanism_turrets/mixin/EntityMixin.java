package com.github.x3r.mekanism_turrets.mixin;

import com.github.x3r.mekanism_turrets.common.entity.LaserEntity;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(Entity.class)
public abstract class EntityMixin {
    @ModifyVariable(method = "setRemoved", at = @At("HEAD"), argsOnly = true)
    private Entity.RemovalReason setRemoved(Entity.RemovalReason reason) {
        if ((Object)(this) instanceof LaserEntity) {
            if (!reason.shouldDestroy()) {
                return Entity.RemovalReason.DISCARDED;
            }
        }
        return reason;
    }
}
