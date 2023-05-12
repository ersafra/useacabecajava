

import java.util.*;

public class DotCom {
    
        private ArrayList<String> locationCells;
        private String name;

        public Void setLocationCells(ArrayList<String> loc){
            locationCells = loc;
            return null;
        }
        public void setName(String n){
            name =n;
        }
        public String checkYourself(String userInput){
            String result = "Errado";
            int index = locationCells.indexOf(userInput);
            if( index >= 0){
                locationCells.remove(index);
                if (locationCells.isEmpty()){
                    result = "Eliminar";
                    System.out.println("Veja so ! Vc afundou "+ name + " :(");
                }else{
                    result = "Correto";
                }
            }
            return result;
        }
    }

