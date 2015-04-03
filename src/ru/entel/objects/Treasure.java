package ru.entel.objects;

import ru.entel.abstracts.AbstractGameObject;
import ru.entel.enums.GameObjectType;

/**
 * Created by farades on 03.04.2015.
 */
public class Treasure extends AbstractGameObject {
    private int score = 5;

    public Treasure(Coordinate coordinate) {
        setType(GameObjectType.TREASURE);
        setCoordinate(coordinate);
        setIcon(getImageIcon("/ru/entel/images/gold.png"));
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
