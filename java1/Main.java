import javax.swing.*;
import joculete.*;

public class Main {
    public static void main(String[] args) {

        try {
            boolean ok = false;
            boolean returnMenu = true;

            while (returnMenu) {
                String response = JOptionPane.showInputDialog(null,
                        "Enter a game that you want to play: \n1.Equation Game \n2.Guessing Game", "Menu", 3);
                int userResponse = Integer.parseInt(response);

                if (userResponse == 1) {
                    jocAdunareEx.jocAdunatEx();
                    ok = true;
                }

                if (userResponse == 2) {
                    jocGuessingEx.jocGuessEx();
                    ok = true;
                }

                if (ok == false) {
                    throw new java.lang.Exception();
                }

                response = JOptionPane.showInputDialog(null, "Would you like to return to menu?\n1.Yes\n2.No", "Menu",
                        3);
                userResponse = Integer.parseInt(response);
                if (userResponse == 1) {
                    returnMenu = true;
                } else if (userResponse == 2) {
                    returnMenu = false;
                } else {
                    throw new java.lang.Exception();
                }
            }
            JOptionPane.showMessageDialog(null, "Thank you for playing.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n Game will exit");
        }
    }
}