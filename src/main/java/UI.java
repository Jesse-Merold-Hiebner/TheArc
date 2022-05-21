import javax.swing.*;
import java.awt.*;

public class UI {

    JFrame startWindow;
    JPanel gameTitlePanel, startButtonPanel, loadButtonPanel, mainTextPanel, selectionButtonPanel, playerPanel,storyTitlePanel,storyButtonPanel;
    JLabel gameTitleLabel,storyTitleLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel;
    JButton startButton, loadButton,storySelection1,storySelection2,storySelection3, selection1, selection2, selection3, selection4;
    JTextArea mainTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font gameFont = new Font("Times New Roman", Font.PLAIN, 26);

    public void createUI() {

        //Game window
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
        startButton = new JButton("NEW GAME");
        startButton.setBackground(Color.darkGray);
        startButton.setForeground(Color.white);
        startButton.setFont(gameFont);
        startButton.setFocusPainted(false);
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

        storyButtonPanel = new JPanel();
        storyButtonPanel.setBounds(250, 350, 300, 150);
        storyButtonPanel.setBackground(Color.black);
        storyButtonPanel.setLayout(new GridLayout(3, 1));

        storySelection1 = new JButton("PUT NAME OF STORY 1 HERE");
        storySelection1.setBackground(Color.darkGray);
        storySelection1.setForeground(Color.white);
        storySelection1.setFont(gameFont);
        storySelection1.setFocusPainted(false);
        storyButtonPanel.add(storySelection1);

        storySelection2 = new JButton("PUT NAME OF STORY 2 HERE");
        storySelection2.setBackground(Color.darkGray);
        storySelection2.setForeground(Color.white);
        storySelection2.setFont(gameFont);
        storySelection2.setFocusPainted(false);
        storyButtonPanel.add(storySelection2);

        storySelection3 = new JButton("PUT NAME OF STORY 3 HERE");
        storySelection3.setBackground(Color.darkGray);
        storySelection3.setForeground(Color.white);
        storySelection3.setFont(gameFont);
        storySelection3.setFocusPainted(false);
        storyButtonPanel.add(storySelection3);

        //Game Screen
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
        selectionButtonPanel.add(selection1);

        selection2 = new JButton("s2");
        selection2.setBackground(Color.darkGray);
        selection2.setForeground(Color.white);
        selection2.setFont(gameFont);
        selection2.setFocusPainted(false);
        selectionButtonPanel.add(selection2);

        selection3 = new JButton("s3");
        selection3.setBackground(Color.darkGray);
        selection3.setForeground(Color.white);
        selection3.setFont(gameFont);
        selection3.setFocusPainted(false);
        selectionButtonPanel.add(selection3);

        selection4 = new JButton("s4");
        selection4.setBackground(Color.darkGray);
        selection4.setForeground(Color.white);
        selection4.setFont(gameFont);
        selection4.setFocusPainted(false);
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

        //Login Screen

        startWindow.setVisible(true);
    }
}
