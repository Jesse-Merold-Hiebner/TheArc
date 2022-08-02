package package1;

//Main class

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Game {

    SelectionHandler sHandler = new SelectionHandler();
    UI gui = new UI();

    VisibilityManager vm = new VisibilityManager(gui);
    JourneyThroughCelestia journeyThroughCelestia = new JourneyThroughCelestia(this, gui, vm);

    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

    public  static void main(String[] args){
        new Game();
    }

    public Game()
    {

        gui.createUI(sHandler);
        journeyThroughCelestia.defaultSetup();
        vm.showLandingScreen();
    }
    public class SelectionHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {

            String yourSelection = event.getActionCommand();

            switch(yourSelection)
                        {
                case "New Game": vm.toStorySelection(); break;
                case "Journey through Celestia": vm.toCelestiaStoryBeginning(); break;
                case "Story2": break;
                case "Story3": break;

                case "s1": break;
                case "s2": break;
                case "s3": break;
                case "s4": break;

                //Jesse Code from his choices
                case "CelestiaChoice1": journeyThroughCelestia.selectPosition(nextPosition1); break;
                case "CelestiaChoice2": journeyThroughCelestia.selectPosition(nextPosition2); break;
                case "CelestiaChoice3": journeyThroughCelestia.selectPosition(nextPosition3); break;
                case "CelestiaChoice4": journeyThroughCelestia.selectPosition(nextPosition4);break;
            }
        }

    }


}
