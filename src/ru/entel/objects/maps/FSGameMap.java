package ru.entel.objects.maps;

import ru.entel.abstracts.AbstractGameMap;
import ru.entel.abstracts.AbstractGameObject;
import ru.entel.enums.GameObjectType;
import ru.entel.objects.Coordinate;
import ru.entel.objects.creators.GameObjectCreator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Артем on 06.04.2015.
 */
public class FSGameMap extends AbstractGameMap {
    @Override
    public boolean loadMap(Object source) {
        File file = new File(source.toString());

        if (!file.exists()) {
            throw new IllegalArgumentException("Game Map filename fail!");
        }

        try {
            setExitExist(false);
            setGoldManExist(false);
            setHeight(getLineCount(file));

            BufferedReader br = new BufferedReader(new FileReader(file));
            String strLine = br.readLine().trim();
            setName(strLine.split((","))[0]);
            setTimeLimit(Integer.valueOf(strLine.split(",")[1]).intValue());
            setWidth(Integer.valueOf(strLine.split(",")[2]).intValue());

            int x = 0;
            int y = 0;

            while ( (strLine = br.readLine()) != null ) {
                x = 0;
                for (String str : strLine.split(",")) {
                    createGameObject(str, new Coordinate(x, y));
                    x++;
                }
                y++;
            }

            if (!isValidMap()) {
                throw new Exception("The map is not valid");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return true;
    }

    private void createGameObject(String str, Coordinate coordinate) {
        GameObjectType type = GameObjectType.valueOf(str.toUpperCase());
        AbstractGameObject newObj = GameObjectCreator.getInstance().createObject(type, coordinate);

        addGameObject(newObj);

        if (newObj.getType() == GameObjectType.EXIT) {
            setExitExist(true);
        } else if (newObj.getType() == GameObjectType.GOLDMAN) {
            setGoldManExist(true);
        }
    }

    private int getLineCount(File file) {
        BufferedReader br = null;
        int lineCount = 0;
        try {
            br = new BufferedReader(new FileReader(file));
            while(br.readLine() != null) {
                lineCount++;
            }
            lineCount = lineCount - 1;
        } catch (IOException ex) {
            Logger.getLogger(FSGameMap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return lineCount;
    }

    @Override
    public boolean saveMap(Object source) {
        return false;
    }

    @Override
    public boolean drawMap() {
        return false;
    }
}
