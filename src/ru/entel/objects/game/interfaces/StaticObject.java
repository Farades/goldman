package ru.entel.objects.game.interfaces;

import ru.entel.objects.common.Coordinate;
import ru.entel.objects.game.enums.GameObjectType;

import javax.swing.*;

/**
 * Created by farades on 03.04.2015.
 */
public interface StaticObject {
    ImageIcon getIcon();

    Coordinate getCoordinate();

    GameObjectType getType();
}
