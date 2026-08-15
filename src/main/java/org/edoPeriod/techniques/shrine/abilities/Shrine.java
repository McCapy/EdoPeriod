package org.edoPeriod.techniques.shrine.abilities;

import org.edoPeriod.Ability;
import org.edoPeriod.Technique;

import java.util.List;
import java.util.function.Consumer;

public class Shrine implements Technique {
    @Override
    public int getCurseAmount() {
        return 0;
    }

    @Override
    public int getCurseRegen() {
        return 0;
    }

    @Override
    public List<Ability> getAbilities() {
        return List.of();
    }

    @Override
    public List<Consumer<Stats>> getProgression() {
        return List.of();
    }

    @Override
    public String getName() {
        return "";
    }
}
