package stopWatchAssignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionListenerImpl implements ActionListener {

    // Using atomic wrapper class Atomic Integer so that counter variable is thread safe in multithreaded environment
    private final AtomicInteger counter = new AtomicInteger(0);

    public int getCounterValue(){
        return counter.get();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(this.getCounterValue());
        counter.incrementAndGet();
    }
}