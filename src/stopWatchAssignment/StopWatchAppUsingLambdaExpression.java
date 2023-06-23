package stopWatchAssignment;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class StopWatchAppUsingLambdaExpression {

    public static void main(String[] args) {

        // Approach 2 using Anonymous Class
        System.out.println("Stop Watch using Lambda Expression: ");
        SwingUtilities.invokeLater(() -> {
            AtomicInteger counter = new AtomicInteger(0);
            Timer timer1 = new Timer(1000, e ->  {
                System.out.println("Counter value is: " + counter);
                counter.getAndIncrement();
                });
            timer1.start();
            });
    }
}