package joculete;

import javax.swing.*;

public abstract class jocAdunare {

    static int countGames = 0;

    public static void jocAdunat(int dif) {

        int xGenerat = 0;
        int suma = 0;

        try {

            if (dif == 1) {
                xGenerat = randomWithRange(1, 10);
                suma = 10;

            } else if (dif == 2) {
                xGenerat = randomWithRange(1, 100);
                suma = 100;
            } else if (dif == 3) {
                xGenerat = randomWithRange(1, 1000);
                suma = 1000;
            } else if (dif == 4) {
                xGenerat = randomWithRange(1, 10000);
                suma = 10000;
            } else
                throw new java.lang.Exception();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \nGame will exit");
            System.exit(0);
        }

        if (xGenerat == 0) {
            xGenerat++;
        }
        int y = suma - xGenerat;
        int userAnswer = 0;
        int count = 1;

        while (userAnswer != y) {
            String response = JOptionPane.showInputDialog(null, xGenerat + " + X = " + suma, "Equation Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + userChoice(userAnswer, y, count, suma));
            count++;
        }

    }

    public static String userChoice(int userAnswer, int y, int count, int suma) {
        if (userAnswer <= 0 || userAnswer > suma) {
            return "Your guess is invalid \n Try Number: " + count;
        }
        if (userAnswer != y) {
            return "Try again\n Try Number: " + count;
        }
        if (userAnswer == y) {
            countGames++;
            return "Correct!!\n Try Number: " + count + "\n Games Played: " + countGames;
        }
        return "ERROR";
    }

    public static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

}
