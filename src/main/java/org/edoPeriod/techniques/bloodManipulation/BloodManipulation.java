package org.edoPeriod.techniques.bloodManipulation;

import org.edoPeriod.Ability;
import org.edoPeriod.Technique;

import java.util.List;
import java.util.function.Consumer;

public class BloodManipulation implements Technique {
    @Override
    public int getCurseAmount() {
        return 100;
    }

    @Override
    public int getCurseRegen() {
        return 2;
    }

    @Override
    public List<Ability> getAbilities() {
        return List.of();
    }

    @Override
    public List<Consumer<Stats>> getProgression() {
        return List.of(

        );
    }

    @Override
    public String getName() {
        return "blood_manip";
    }
}
