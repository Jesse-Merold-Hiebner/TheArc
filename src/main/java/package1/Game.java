package package1;

//Main class

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Game {

    SelectionHandler sHandler = new SelectionHandler();
    UI gui = new UI();
    VisibilityManager vm = new VisibilityManager(gui);

    public  static void main(String[] args){
        new Game();
    }

    public Game(){

        gui.createUI(sHandler);
        vm.showLandingScreen();
    }
    public class SelectionHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            String yourSelection = event.getActionCommand();

            switch(yourSelection){
                case "New Game": vm.toStorySelection(); break;
                case "Story1": break;
                case "Story2": break;
                case "Story3": break;
                case "s1": break;
                case "s2": break;
                case "s3": break;
                case "s4": break;
            }
        }

    }


}
