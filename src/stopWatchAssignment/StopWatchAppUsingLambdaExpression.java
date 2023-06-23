package stopWatchAssignment;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class StopWatchAppUsingLambdaExpression {

    public static void main(String[] args) {

        // Approach 3 using Lambda Expression
        System.out.println("Stop Watch using Lambda Expression: ");
        SwingUtilities.invokeLater(() -> {
            AtomicInteger counter = new AtomicInteger(0);
            Timer timer1 = new Timer(1000, e ->  {
                System.out.println(counter.get());
                counter.getAndIncrement();
                });
            timer1.start();
            });
    }
}