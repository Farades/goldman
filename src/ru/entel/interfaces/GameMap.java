package ru.entel.interfaces;

/**
 * Created by Артем on 06.04.2015.
 */
public interface GameMap {
    int getHeight();
    int getWidth();
    boolean loadMap(Object source);
    boolean saveMap(Object source);
    boolean drawMap();
    int getTimeLimit();
}
