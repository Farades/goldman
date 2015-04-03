package ru.entel.abstracts;

import ru.entel.enums.MovingDirection;
import ru.entel.interfaces.MovingObject;

import javax.swing.*;

/**
 * Created by farades on 03.04.2015.
 */
public abstract class AbstractMovingObject extends AbstractGameObject implements MovingObject {
    private ImageIcon iconLeft;
    private ImageIcon iconRight;
    private ImageIcon iconUp;
    private ImageIcon iconDown;

    @Override
    public void move(MovingDirection direction) {

    }

    public void setIconLeft(ImageIcon iconLeft) {
        this.iconLeft = iconLeft;
    }

    public void setIconRight(ImageIcon iconRight) {
        this.iconRight = iconRight;
    }

    public void setIconUp(ImageIcon iconUp) {
        this.iconUp = iconUp;
    }

    public void setIconDown(ImageIcon iconDown) {
        this.iconDown = iconDown;
    }

    @Override
    public ImageIcon getIconLeft() {
        return iconLeft;
    }

    @Override
    public ImageIcon getIconRight() {
        return iconRight;
    }

    @Override
    public ImageIcon getIconUp() {
        return iconUp;
    }

    @Override
    public ImageIcon getIconDown() {
        return iconDown;
    }
}
