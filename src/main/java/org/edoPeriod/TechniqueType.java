package org.edoPeriod;

import org.bukkit.persistence.PersistentDataAdapterContext;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

public class TechniqueType implements PersistentDataType<String,Technique> {
    @Override
    public @NotNull Class<String> getPrimitiveType() {
        return String.class;
    }

    @Override
    public @NotNull Class<Technique> getComplexType() {
        return Technique.class;
    }

    @Override
    public @NotNull String toPrimitive(@NotNull Technique technique, @NotNull PersistentDataAdapterContext persistentDataAdapterContext) {
        return technique.getName();
    }

    @Override
    public @NotNull Technique fromPrimitive(@NotNull String string, @NotNull PersistentDataAdapterContext persistentDataAdapterContext) {
        return Technique.getTechnique(string);
    }
}
