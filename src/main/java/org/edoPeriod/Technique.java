package org.edoPeriod;

import org.bukkit.entity.Player;
import org.edoPeriod.techniques.bloodManipulation.BloodManipulation;
import org.edoPeriod.techniques.shrine.abilities.Shrine;

import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("unused")
public interface Technique {
    int getCurseAmount();
    int getCurseRegen();
    List<Ability> getAbilities();
    List<Consumer<Stats>> getProgression();
    String getName();

    static Technique getTechnique(String name) {
        return switch (name) {
            case "blood_manip" -> new BloodManipulation();
            case "shrine" -> new Shrine();
            case null, default -> {
                System.err.printf("INVALID TECHNIQUE TYPE: '%s' THIS RESOLVED INTO AN ERROR. PLEASE CONTACT THE PLUGIN DEVELOPERS.%n", name);
                yield null;
            }
        };
    }

    @SuppressWarnings("unused")
    class Stats {
        public Stats(Player player) {
            this.player = new GamePlayer(player,this);
        }
        GamePlayer player;
        int curseAmount;
        double curseRegeneration;
        int maxHealth;

        public GamePlayer getPlayer() {
            return player;
        }

        public void setPlayer(GamePlayer player) {
            this.player = player;
        }

        public int getCurseAmount() {
            return curseAmount;
        }

        public void setCurseAmount(int curseAmount) {
            this.curseAmount = curseAmount;
        }

        public double getCurseRegeneration() {
            return curseRegeneration;
        }

        public void setCurseRegeneration(double curseRegeneration) {
            this.curseRegeneration = curseRegeneration;
        }

        public int getMaxHealth() {
            return maxHealth;
        }

        public void setMaxHealth(int maxHealth) {
            this.maxHealth = maxHealth;
        }
    }
}
