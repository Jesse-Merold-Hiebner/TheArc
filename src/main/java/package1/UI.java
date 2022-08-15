package package1;

import javax.swing.*;
import java.awt.*;

public class UI
{

    JFrame startWindow;
    JPanel gameTitlePanel, startButtonPanel, loadButtonPanel, mainTextPanel, selectionButtonPanel, playerPanel,storyTitlePanel,storyButtonPanel;
    JLabel gameTitleLabel,storyTitleLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel;
    JButton startButton, loadButton,storySelection1,storySelection2,storySelection3, selection1, selection2, selection3, selection4;
    JTextArea mainTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font gameFont = new Font("Times New Roman", Font.PLAIN, 26);

    public void createUI(Game.SelectionHandler sHandler)
    {

        //package1.Game window
        startWindow = new JFrame();
        startWindow.setSize(800, 600);
        startWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startWindow.getContentPane().setBackground(Color.black);
        startWindow.setLayout(null);


        //Landing Screen
        gameTitlePanel = new JPanel();
        gameTitlePanel.setBounds(100, 100, 600, 500);
        gameTitlePanel.setBackground(Color.black);
        gameTitleLabel = new JLabel("THE ARC");
        gameTitleLabel.setForeground(Color.white);
        gameTitleLabel.setFont(titleFont);
        gameTitlePanel.add(gameTitleLabel);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.darkGray);
        startButton = new JButton("New Game");
        startButton.setBackground(Color.darkGray);
        startButton.setForeground(Color.white);
        startButton.setFont(gameFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(sHandler);
        startButton.setActionCommand("New Game");
        startButtonPanel.add(startButton);

        loadButtonPanel = new JPanel();
        loadButtonPanel.setBounds(300, 450, 200, 100);
        loadButtonPanel.setBackground(Color.darkGray);
        loadButton = new JButton("LOAD GAME");
        loadButton.setBackground(Color.darkGray);
        loadButton.setForeground(Color.white);
        loadButton.setFont(gameFont);
        loadButton.setFocusPainted(false);
        loadButtonPanel.add(loadButton);

        startWindow.add(gameTitlePanel);
        startWindow.add(startButtonPanel);
        startWindow.add(loadButtonPanel);

        //Story selection screen
        storyTitlePanel = new JPanel();
        storyTitlePanel.setBounds(100, 100, 600, 500);
        storyTitlePanel.setBackground(Color.black);
        storyTitleLabel = new JLabel("PLEASE SELECT A STORY");
        storyTitleLabel.setForeground(Color.white);
        storyTitleLabel.setFont(gameFont);
        storyTitlePanel.add(storyTitleLabel);
        startWindow.add(storyTitlePanel);

        storyButtonPanel = new JPanel();
        storyButtonPanel.setBounds(250, 350, 300, 150);
        storyButtonPanel.setBackground(Color.black);
        storyButtonPanel.setLayout(new GridLayout(3, 1));


        storySelection1 = new JButton("Journey through Celestia");
        storySelection1.setBackground(Color.darkGray);
        storySelection1.setForeground(Color.white);
        storySelection1.setFont(gameFont);
        storySelection1.setFocusPainted(false);
        storySelection1.addActionListener(sHandler);
        storySelection1.setActionCommand("Journey through Celestia");
        storyButtonPanel.add(storySelection1);

        storySelection2 = new JButton("Heroin in the Making");
        storySelection2.setBackground(Color.darkGray);
        storySelection2.setForeground(Color.white);
        storySelection2.setFont(gameFont);
        storySelection2.setFocusPainted(false);
        storySelection2.addActionListener(sHandler);
        storySelection2.setActionCommand("Heroin in the Making");
        storyButtonPanel.add(storySelection2);

        storySelection3 = new JButton("Story3");
        storySelection3.setBackground(Color.darkGray);
        storySelection3.setForeground(Color.white);
        storySelection3.setFont(gameFont);
        storySelection3.setFocusPainted(false);
        storySelection3.addActionListener(sHandler);
        storySelection3.setActionCommand("Story3");
        storyButtonPanel.add(storySelection3);
        startWindow.add(storyButtonPanel);

        //package1.Game Screen
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        startWindow.add(mainTextPanel);

        mainTextArea = new JTextArea("Add text here...");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(gameFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        selectionButtonPanel = new JPanel();
        selectionButtonPanel.setBounds(250, 350, 300, 150);
        selectionButtonPanel.setBackground(Color.black);
        selectionButtonPanel.setLayout(new GridLayout(4, 1));
        startWindow.add(selectionButtonPanel);

        selection1 = new JButton("s1");
        selection1.setBackground(Color.darkGray);
        selection1.setForeground(Color.white);
        selection1.setFont(gameFont);
        selection1.setFocusPainted(false);
        selection1.addActionListener(sHandler);
        selection1.setActionCommand("s1");
        selectionButtonPanel.add(selection1);

        selection2 = new JButton("s2");
        selection2.setBackground(Color.darkGray);
        selection2.setForeground(Color.white);
        selection2.setFont(gameFont);
        selection2.setFocusPainted(false);
        selection2.addActionListener(sHandler);
        selection2.setActionCommand("s2");
        selectionButtonPanel.add(selection2);

        selection3 = new JButton("s3");
        selection3.setBackground(Color.darkGray);
        selection3.setForeground(Color.white);
        selection3.setFont(gameFont);
        selection3.setFocusPainted(false);
        selection3.addActionListener(sHandler);
        selection3.setActionCommand("s3");
        selectionButtonPanel.add(selection3);

        selection4 = new JButton("s4");
        selection4.setBackground(Color.darkGray);
        selection4.setForeground(Color.white);
        selection4.setFont(gameFont);
        selection4.setFocusPainted(false);
        selection4.addActionListener(sHandler);
        selection4.setActionCommand("s4");
        selectionButtonPanel.add(selection4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 4));

        hpLabel = new JLabel("HP:");
        hpLabel.setFont(gameFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);

        hpNumberLabel = new JLabel();
        hpNumberLabel.setFont(gameFont);
        hpNumberLabel.setForeground(Color.white);
        playerPanel.add(hpNumberLabel);

        weaponLabel = new JLabel("Weapon:");
        weaponLabel.setForeground(Color.white);
        weaponLabel.setFont(gameFont);
        playerPanel.add(weaponLabel);

        weaponNameLabel = new JLabel();
        weaponNameLabel.setForeground(Color.white);
        weaponNameLabel.setFont(gameFont);
        playerPanel.add(weaponNameLabel);
        startWindow.add(playerPanel);
        //Login Screen

        startWindow.setVisible(true);

    }
}
