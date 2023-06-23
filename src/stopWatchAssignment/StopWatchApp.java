package stopWatchAssignment;

import javax.swing.*;
import java.awt.event.ActionListener;

public class StopWatchApp {

    public static void main(String[] args) {

        // Approach 1 Using implementation class
        ActionListener actionListener = new ActionListenerImpl();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Timer timer = new Timer(1000, actionListener);
                timer.start();
            }
        });
    }
}