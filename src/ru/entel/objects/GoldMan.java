package ru.entel.objects;

import ru.entel.abstracts.AbstractGameObject;
import ru.entel.abstracts.AbstractMovingObject;
import ru.entel.enums.GameObjectType;
import ru.entel.enums.MovingDirection;

/**
 * Created by farades on 03.04.2015.
 */
public class GoldMan extends AbstractMovingObject {
    private int totalScore = 0;
    private int turnsNumber = 0;

    public GoldMan(Coordinate coordinate) {
        setType(GameObjectType.GOLDMAN);
        setCoordinate(coordinate);

        setIconDown(getImageIcon("/ru/entel/images/goldman_down.png"));
        setIconUp(getImageIcon("/ru/entel/images/goldman_up.png"));
        setIconRight(getImageIcon("/ru/entel/images/goldman_right.png"));
        setIconLeft(getImageIcon("/ru/entel/images/goldman_left.png"));

        setIcon(getIconUp());
    }

    public void addTotalScore(int score) {
        this.totalScore += score;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getTurnsNumber() {
        return turnsNumber;
    }

    public void setTurnsNumber(int turnsNumber) {
        this.turnsNumber = turnsNumber;
    }

    @Override
    public void getMoveResult(AbstractGameObject objectInNewCoordinate) {

    }

    @Override
    public void move(MovingDirection direction) {

    }
}
