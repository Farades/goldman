package ru.entel.gui;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by farades on 03.04.2015.
 */
public abstract class BaseChildFrame extends JFrame {

    private JFrame parentFrame;

    public BaseChildFrame() {
        setCloseOperation();
    }

    public JFrame getParentFrame() {
        return parentFrame;
    }

    protected void showFrame(JFrame parent) {
        this.parentFrame = parent;
        parent.setVisible(false);
        super.setVisible(true);
    }

    protected void closeFrame() {
        if (parentFrame == null) {
            throw new IllegalArgumentException("Parent frame must not be null");
        }
        super.setVisible(false);
        parentFrame.setVisible(true);
    }

    protected void setCloseOperation() {
        super.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeFrame();
            }
        });
    }
}
