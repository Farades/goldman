package ru.entel.objects;

import ru.entel.abstracts.AbstractGameObject;
import ru.entel.abstracts.AbstractMovingObject;
import ru.entel.enums.GameObjectType;
import ru.entel.enums.MovingDirection;

/**
 * Created by farades on 03.04.2015.
 */
public class Monster extends AbstractMovingObject {

    public Monster(Coordinate coordinate) {
        setType(GameObjectType.MONSTER);
        setCoordinate(coordinate);

        setIconRight(getImageIcon("/ru/entel/images/monster_right.jpg"));
        setIconLeft(getImageIcon("/ru/entel/images/monster_left.jpg"));
        setIconUp(getImageIcon("/ru/entel/images/monster_up.jpg"));
        setIconDown(getImageIcon("/ru/entel/images/monster_down.jpg"));

        setIcon(getIconLeft());
    }

    @Override
    public void getMoveResult(AbstractGameObject objectInNewCoordinate) {

    }

    @Override
    public void move(MovingDirection direction) {

    }
}
