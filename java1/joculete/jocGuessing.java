package joculete;

import javax.swing.*;

public abstract class jocGuessing {

    static int countGames = 0;
    static double dDif = 0;

    public static void jocGuess(int dif) {

        int xGenerat = 0;

        try {

            if (dif == 1) {
                xGenerat = randomWithRange(1, 10);
            } else if (dif == 2) {
                xGenerat = randomWithRange(1, 100);
            } else if (dif == 3) {
                xGenerat = randomWithRange(1, 1000);
            } else if (dif == 4) {
                xGenerat = randomWithRange(1, 10000);
            } else
                throw new java.lang.Exception();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \nGame will exit");
            System.exit(0);
        }

        int userAnswer = 0;
        int count = 1;
        dDif = (double) dif;

        while (userAnswer != xGenerat) {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and " + ((int) Math.pow(10, dDif)), "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + userChoice(userAnswer, xGenerat, count));
            count++;
        }

    }

    public static String userChoice(int userAnswer, int xGenerat, int count) {

        if (userAnswer <= 0 || userAnswer > ((int) Math.pow(10, dDif))) {
            return "Your guess is invalid";
        } else if (userAnswer == xGenerat) {
            countGames++;
            return "Correct!!\n Try Number: " + count + "\n Games Played: " + countGames;
        } else if (userAnswer > xGenerat) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        } else if (userAnswer < xGenerat) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        } else {
            return "Your guess is incorrect\nTry Number: " + count;
        }

    }

    public static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
}
