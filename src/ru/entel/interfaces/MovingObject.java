package ru.entel.interfaces;

import ru.entel.abstracts.AbstractGameObject;
import ru.entel.enums.MovingDirection;

import javax.swing.*;

/**
 * Created by farades on 03.04.2015.
 */
public interface MovingObject {
    void move(MovingDirection direction);

    ImageIcon getIconLeft();
    ImageIcon getIconRight();
    ImageIcon getIconUp();
    ImageIcon getIconDown();

    void getMoveResult(AbstractGameObject objectInNewCoordinate);
}
