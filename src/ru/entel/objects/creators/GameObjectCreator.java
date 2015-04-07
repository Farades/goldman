package ru.entel.objects.creators;

import ru.entel.abstracts.AbstractGameObject;
import ru.entel.enums.GameObjectType;
import ru.entel.objects.*;

/**
 * Created by Артем on 07.04.2015.
 */
public class GameObjectCreator {
    private static GameObjectCreator instance;

    public static GameObjectCreator getInstance() {
        if (instance == null) {
            instance = new GameObjectCreator();
        }
        return instance;
    }

    public AbstractGameObject createObject(GameObjectType type, Coordinate coordinate) {
        AbstractGameObject obj = null;

        switch (type) {
            case NOTHING: {
                obj = new Nothing(coordinate);
                break;
            }
            case WALL: {
                obj = new Wall(coordinate);
                break;
            }
            case MONSTER:{
                obj = new Monster(coordinate);
                break;
            }
            case TREASURE: {
                obj = new Treasure(coordinate);
                break;
            }
            case EXIT: {
                obj = new Exit(coordinate);
                break;
            }
            case GOLDMAN: {
                obj = new GoldMan(coordinate);
                break;
            }

            default:
                throw new IllegalArgumentException("Can't create object type: " + type);
        }

        return obj;
    }
}
