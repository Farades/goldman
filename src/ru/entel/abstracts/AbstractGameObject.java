package ru.entel.abstracts;

import ru.entel.objects.Coordinate;
import ru.entel.enums.GameObjectType;
import ru.entel.interfaces.StaticObject;

import javax.swing.*;

/**
 * Created by farades on 03.04.2015.
 */
public abstract class AbstractGameObject implements StaticObject {
    private GameObjectType type;
    private Coordinate coordinate;

    private ImageIcon icon = getImageIcon("/ru/entel/images/noicon.png");

    public AbstractGameObject() {

    }

    public void setIcon(ImageIcon currentIcon) {
        this.icon = currentIcon;
    }

    @Override
    public ImageIcon getIcon() {
        return icon;
    }

    protected ImageIcon getImageIcon(String path){
        return new ImageIcon(getClass().getResource(path));
    }

    @Override
    public GameObjectType getType() {
        return type;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setType(GameObjectType type) {
        this.type = type;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractGameObject that = (AbstractGameObject) o;

        if (!coordinate.equals(that.coordinate)) return false;
        if (type != that.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + coordinate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "AbstractGameObject{" +
                "type=" + type +
                ", coordinate=" + coordinate +
                ", icon=" + icon +
                '}';
    }
}
