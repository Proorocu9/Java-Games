package joculete;

import javax.swing.*;

public abstract class jocAdunareEx extends jocAdunare {

    public static void jocAdunatEx() {

        JOptionPane.showMessageDialog(null, "Rules:\nFind the x in the follow equation.");
        String difficulty = JOptionPane.showInputDialog(null,
                "Enter difficulty:\n1.Amateur\n2.Medium\n3.Hard\n4.Godlike");
        int dif = Integer.parseInt(difficulty);
        boolean again = true;

        while (again) {
            jocAdunat(dif);
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
