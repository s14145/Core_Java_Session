package stopWatchAssignment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class StopWatchAppUsingAnonymousClass {

    public static void main(String[] args) {

        // Approach 2 using Anonymous Class
        System.out.println("Stop Watch using Anonymous Class: ");
        SwingUtilities.invokeLater(() -> {
                Timer timer1 = new Timer(1000, new ActionListener() {
                    final AtomicInteger counter = new AtomicInteger(0);
                    public int getCounterValue(){
                        return counter.get();
                    }
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        counter.incrementAndGet();
                        System.out.println("Counter value is: " + this.getCounterValue());
                    }
                });
                timer1.start();
        });
    }
}