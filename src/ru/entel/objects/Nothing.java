package ru.entel.objects;

import ru.entel.abstracts.AbstractGameObject;
import ru.entel.enums.GameObjectType;

/**
 * Created by farades on 03.04.2015.
 */
public class Nothing extends AbstractGameObject {
    public Nothing(Coordinate coordinate) {
        setType(GameObjectType.NOTHING);
        setCoordinate(coordinate);
        setIcon(null);
    }
}
