package ru.entel.objects;

import ru.entel.abstracts.AbstractGameObject;
import ru.entel.enums.GameObjectType;

/**
 * Created by farades on 03.04.2015.
 */
public class Wall extends AbstractGameObject {

    public Wall(Coordinate coordinate) {
        setType(GameObjectType.WALL);
        setCoordinate(coordinate);
        setIcon(getImageIcon("/ru/entel/images/wall.png"));
    }
}
