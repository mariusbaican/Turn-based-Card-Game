package game.cards;

import fileio.CardInput;
import lombok.Data;
import util.Ability;

import java.util.ArrayList;


@Data
public class Card {
    public enum Type {
        MINION,
        HERO
    }

    public enum PlacementRow {
        FRONT,
        BACK
    }

    protected int mana;
    protected int health;
    protected String  description;
    protected ArrayList<String> colors = new ArrayList<>();
    protected String name;
    protected boolean isFrozen;
    protected boolean hasAttacked;
    protected Ability ability;
    protected Type cardType;

    public Card(CardInput cardInput) {
        this.mana = cardInput.getMana();
        this.health = cardInput.getHealth();
        this.description = cardInput.getDescription();
        this.colors = cardInput.getColors();
        this.name = cardInput.getName();
        cardType = null;
        isFrozen = false;
        hasAttacked = false;
        ability = null;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public boolean hasAttacked() {return hasAttacked;}
}
