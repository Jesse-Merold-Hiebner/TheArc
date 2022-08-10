package package1;

//Main class

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Game {

    SelectionHandler sHandler = new SelectionHandler();
    UI gui = new UI();

    VisibilityManager vm = new VisibilityManager(gui);
    JourneyThroughCelestia journeyThroughCelestia = new JourneyThroughCelestia(this, gui, vm);

    //Added By MoMo
    FemaleCharStory femaleCharStory = new FemaleCharStory(this, gui, vm);

    //Added By MoMo
    String nextPosition1, nextPosition2, nextPosition3, nextPosition4, nextPosition5, nextPosition6, nextPosition7, nextPosition8;

    public  static void main(String[] args){
        new Game();
    }

    public Game()
    {

        gui.createUI(sHandler);
        journeyThroughCelestia.defaultSetup();
        vm.showLandingScreen();

        //Added By MoMo
        femaleCharStory.defaultSetup();
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

                 //Added By MoMo
                 //Story2 Code from their choices
                 case "HeroinChoice1": femaleCharStory.selectPosition(nextPosition1); break;
                 case "HeroinChoice2": femaleCharStory.selectPosition(nextPosition2); break;
                 case "HeroinChoice3": femaleCharStory.selectPosition(nextPosition3); break;
                 case "HeroinChoice4": femaleCharStory.selectPosition(nextPosition4);break;
                 case "HeroinChoice5": femaleCharStory.selectPosition(nextPosition5); break;
                 case "HeroinChoice6": femaleCharStory.selectPosition(nextPosition6); break;
                 case "HeroinChoice7": femaleCharStory.selectPosition(nextPosition7); break;
                 case "HeroinChoice8": femaleCharStory.selectPosition(nextPosition8);break;


            }
        }

    }


}
