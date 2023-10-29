package Java_Part_II.IX_II;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    int messageNumber = 0;

    @Override
    public void log(String msg) {
        String log = "INFO ";
        if (msg.toLowerCase().contains("error")) {
            log = "ERROR ";
        }

        System.out.println(log + " №" + ++messageNumber + " - " + LocalDateTime.now() + " - " + msg);

    }
}
