package Java_Part_II;

import java.time.LocalDateTime;

public class SimpleLogger implements Logger {
    @Override
    public void log(final String msg) {
        System.out.println(LocalDateTime.now() + " - " + msg);
    }
}
