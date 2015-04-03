package ru.entel.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by farades on 03.04.2015.
 */
public class FrameMainMenu extends JFrame {
    javax.swing.JButton jbtnExit;
    javax.swing.JButton jbtnLoadGame;
    javax.swing.JButton jbtnNewGame;
    javax.swing.JButton jbtnStatistics;
    javax.swing.JPanel jpnlMainMenu;

    private FrameStat frameStat = new FrameStat();
    private FrameGame frameGame = new FrameGame();
    private FrameSavedGames frameSavedGames = new FrameSavedGames();

    public FrameMainMenu() {
        initComponents();
    }

    private void initComponents() {
        jpnlMainMenu = new javax.swing.JPanel();
        jbtnNewGame = new javax.swing.JButton();
        jbtnLoadGame = new javax.swing.JButton();
        jbtnStatistics = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        jbtnNewGame.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnNewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/entel/images/new.png"))); // NOI18N
        jbtnNewGame.setText("Новая игра");
        jbtnNewGame.setToolTipText("Создать новую игру");
        jbtnNewGame.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnNewGame.setIconTextGap(10);
        jbtnNewGame.addActionListener(formListener);

        jbtnLoadGame.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnLoadGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/entel/images/load.png"))); // NOI18N
        jbtnLoadGame.setText("Загрузить игру");
        jbtnLoadGame.setToolTipText("Загрузить сохраненную игру ");
        jbtnLoadGame.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnLoadGame.setIconTextGap(10);
        jbtnLoadGame.addActionListener(formListener);

        jbtnStatistics.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/entel/images/stat.png"))); // NOI18N
        jbtnStatistics.setText("Статистика");
        jbtnStatistics.setToolTipText("Посмотреть статистику по игрокам");
        jbtnStatistics.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnStatistics.setIconTextGap(10);
        jbtnStatistics.addActionListener(formListener);

        jbtnExit.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/entel/images/exit.png"))); // NOI18N
        jbtnExit.setText("Выход");
        jbtnExit.setToolTipText("Выйти из игры");
        jbtnExit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnExit.setIconTextGap(10);
        jbtnExit.addActionListener(formListener);

        javax.swing.GroupLayout jpnlMainMenuLayout = new javax.swing.GroupLayout(jpnlMainMenu);
        jpnlMainMenu.setLayout(jpnlMainMenuLayout);
        jpnlMainMenuLayout.setHorizontalGroup(
                jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jbtnLoadGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtnStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtnNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlMainMenuLayout.setVerticalGroup(
                jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbtnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnLoadGame, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jpnlMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jpnlMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Игра");
        setName("FrameMainMenu");
        setResizable(false);
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-267)/2, (screenSize.height-310)/2, 267, 310);
    }

    private void jbtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {
        frameGame.showFrame(this);
    }

    private void jbtnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {
        frameStat.showFrame(this);
    }

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jbtnLoadGameActionPerformed(java.awt.event.ActionEvent evt) {
        frameSavedGames.showFrame(this);
    }

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jbtnNewGame) {
                jbtnNewGameActionPerformed(evt);
            }
            else if (evt.getSource() == jbtnStatistics) {
                jbtnStatisticsActionPerformed(evt);
            }
            else if (evt.getSource() == jbtnExit) {
                jbtnExitActionPerformed(evt);
            }
            else if (evt.getSource() == jbtnLoadGame) {
                jbtnLoadGameActionPerformed(evt);
            }
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameMainMenu().setVisible(true);
            }
        });
    }
}
