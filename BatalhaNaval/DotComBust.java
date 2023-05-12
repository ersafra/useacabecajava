package UseACabecaJava.BatalhaNaval;

import java.util.ArrayList;

//import java.util.*;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        one.setName("eToys.com");
        DotCom three = new DotCom();
        one.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Seu objetivo e eliminar tes dot coms");
        System.out.println("Pets ,eToys e Go2");
        System.out.println("Tente eliminar todos com o menor numero de palpites");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

public void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Insira um palpite");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "errado";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("correto")) {
                break;
            }
            if (result.equals("eliminar")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    public void finishGame() {
        System.out.println("Todas as Dot Coms foram eliminadas! agora seu conjunto esta vazio");
        if (numOfGuesses <= 18) {
            System.out.println("Voce so usou" + numOfGuesses + " palpites.");
            System.out.println("Voce saiu antes de eliminar suas opcoes.");
        } else {
            System.out.println("Demorou demais. " + numOfGuesses + " palpites.");
            System.out.println("Nao havera pesca com essas opcoes");
        }
    }
    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
