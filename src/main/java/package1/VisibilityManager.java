package package1;

public class VisibilityManager {

    UI gui;
    public VisibilityManager(UI UserInterface){

        gui = UserInterface;

    }

    public void showLandingScreen(){

        //Show the title screen
        gui.gameTitlePanel.setVisible(true);
        gui.startButtonPanel.setVisible(true);
        gui.loadButtonPanel.setVisible(true);
        gui.storyTitlePanel.setVisible(false);

        //Hide the game screen
        gui.mainTextPanel.setVisible(false);
        gui.selectionButtonPanel.setVisible(false);
        gui.playerPanel.setVisible(false);
        gui.storyTitlePanel.setVisible(false);
        gui.storyButtonPanel.setVisible(false);
    }
    public void titleToTown(){

        // Hide the title screen
        gui.gameTitlePanel.setVisible(false);
        gui.startButtonPanel.setVisible(false);
        gui.loadButtonPanel.setVisible(false);
        gui.storyTitlePanel.setVisible(false);
        gui.storyButtonPanel.setVisible(false);

        // Show the game screen
        gui.mainTextPanel.setVisible(true);
        gui.selectionButtonPanel.setVisible(true);
        gui.playerPanel.setVisible(true);

    }

    public void toStorySelection(){

        gui.gameTitlePanel.setVisible(false);
        gui.startButtonPanel.setVisible(false);
        gui.loadButtonPanel.setVisible(false);
        gui.storyTitlePanel.setVisible(true);
        gui.storyButtonPanel.setVisible(true);

        // Show the game screen
        gui.mainTextPanel.setVisible(true);
        gui.selectionButtonPanel.setVisible(true);
        gui.playerPanel.setVisible(true);

    }
}
