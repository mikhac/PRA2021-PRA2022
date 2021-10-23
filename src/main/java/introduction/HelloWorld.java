package introduction;

import org.apache.log4j.Logger;

public class HelloWorld {

    static Logger logger = Logger.getLogger("name");

    public static void main(String[] args) {
        System.out.println("Hello! Witaj!");
        logger.info("hello from logger");
    }
}