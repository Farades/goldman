package ru.entel.objects.game.interfaces;

import ru.entel.objects.common.AbstractGameObject;
import ru.entel.objects.game.enums.MovingDirection;

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
