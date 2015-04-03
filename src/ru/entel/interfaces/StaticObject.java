package ru.entel.interfaces;

import ru.entel.objects.Coordinate;
import ru.entel.enums.GameObjectType;

import javax.swing.*;

/**
 * Created by farades on 03.04.2015.
 */
public interface StaticObject {
    ImageIcon getIcon();

    Coordinate getCoordinate();

    GameObjectType getType();
}
