package ru.entel.objects;

import ru.entel.abstracts.AbstractGameObject;
import ru.entel.enums.GameObjectType;
import ru.entel.interfaces.GameMap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;

/**
 * Created by Артем on 06.04.2015.
 */
public abstract class AbstractGameMap implements GameMap, Serializable {
    private static final long serialVersionUID = 1L;
    private int width;
    private int height;
    private int timeLimit;
    private boolean isExitExist;
    private boolean isGoldManExist;
    private HashMap<Coordinate, AbstractGameObject> gameObjects = new HashMap<Coordinate, AbstractGameObject>();
    private EnumMap<GameObjectType, ArrayList<AbstractGameObject>> typeObjects = new EnumMap<GameObjectType, ArrayList<AbstractGameObject>>(GameObjectType.class);

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public AbstractGameObject getPriorityObject(AbstractGameObject firstObject, AbstractGameObject secondObject) {
        // приоритет объекта зависит от номера индекса объекта enum
        return (firstObject.getType().getIndexPriority() > secondObject.getType().getIndexPriority()) ? firstObject : secondObject; // сокращенная запись условия if: если первый объект имеет больший приоритет - вернуть его, иначе вернуть второй объект
    }

    public boolean isValidMap() {
        return isGoldManExist && isExitExist; // если есть и вход и выход - карта валидна
    }

    public ArrayList<AbstractGameObject> getList(GameObjectType type) {
        return typeObjects.get(type);
    }

    public AbstractGameObject getObjectByCoordinate(Coordinate coordinate) {
        return gameObjects.get(coordinate);
    }

    public AbstractGameObject getObjectByCoordinate(int x, int y) {
        return gameObjects.get(new Coordinate(x, y));
    }
}
