package Java_Part_II;

public class Main {
    public static void main(String[] args) {
        Logger logger = new SimpleLogger();
        logger.log("Сообщение №1");
        logger.log("Сообщение №2");
        logger.log("Сообщение №3");

        System.out.println();
        System.out.println();

        Logger loggerSmart = new SmartLogger();

        loggerSmart.log("Сообщение");
        loggerSmart.log("ERROR");
        loggerSmart.log("Сообщение");
    }
}
