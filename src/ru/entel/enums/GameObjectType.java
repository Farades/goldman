package ru.entel.enums;

import java.io.Serializable;

/**
 * Created by farades on 03.04.2015.
 */
public enum GameObjectType implements Serializable {
    MONSTER(5),
    TREASURE(4),
    EXIT(3),
    WALL(2),
    GOLDMAN(1),
    NOTHING(-1);

    private GameObjectType(int indexPriority) {
        this.indexPriority = indexPriority;
    }

    private int indexPriority;

    public int getIndexPriority() {
        return indexPriority;
    }
}
