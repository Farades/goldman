package ru.entel.objects;

import ru.entel.abstracts.AbstractGameObject;
import ru.entel.enums.GameObjectType;

/**
 * Created by farades on 03.04.2015.
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        setType(GameObjectType.EXIT);
        setCoordinate(coordinate);
        setIcon(getImageIcon("/ru/entel/images/exit.gif"));
    }
}
