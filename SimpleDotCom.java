package UseACabecaJava.BatalhaNaval;
public class SimpleDotCom {

    int[] locationCells;
    int numOfHits;
    
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    
   public String checkYourself(String stringGuess){
    int guess = Integer.parseInt(stringGuess);
    String result = "miss";
    for (int cell : locationCells){
        if(guess == cell){
            result = "hit";
            numOfHits++;
            break;
        }//fim do if
    }// fim do loop
    if(numOfHits == locationCells.length){
            result = "kill";
    }//fim do if
    System.out.println(result);
    return result;
   }//fim do metodo
 }
//}
