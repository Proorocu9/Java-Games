package joculete;

import javax.swing.*;

public class jocGuessingEx extends jocGuessing {

    public static void jocGuessEx() {

        JOptionPane.showMessageDialog(null, "Rules:\nGuess the number.");
        String difficulty = JOptionPane.showInputDialog(null,
                "Enter difficulty:\n1.Amateur\n2.Medium\n3.Hard\n4.Godlike");
        int dif = Integer.parseInt(difficulty);
        boolean again = true;

        while (again) {
            jocGuess(dif);
            String play = JOptionPane.showInputDialog(null, "Would you like to play again?\n 1.Yes\n2.No");
            int playInt = Integer.parseInt(play);
            if (playInt == 1) {
                String changeDif = JOptionPane.showInputDialog(null, "Change difficulty?\n 1.Yes\n2.No");
                int intChangeDif = Integer.parseInt(changeDif);
                if (intChangeDif == 1) {
                    difficulty = JOptionPane.showInputDialog(null,
                            "Enter difficulty:\n1.Amateur\n2.Medium\n3.Hard\n4.Godlike");
                    dif = Integer.parseInt(difficulty);
                }
            } else {
                again = false;
            }

        }

    }

}
