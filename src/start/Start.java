package start;

import actions.Show;
import actions.Write;

public class Start {

   Show show = new Show();
   Write write= new Write();



    public void start(){

      show.showMainMenu();
      show.choseActionMainMenu(write.writeAction());
    }







}
