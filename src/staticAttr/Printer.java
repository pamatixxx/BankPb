package staticAttr;

import java.io.IOException;
import java.util.logging.*;

public class Printer {

    public static final Logger logg = Logger.getLogger(Printer.class.getName());

    public Printer(String massagge) throws IOException {
        Handler fileHandler = new FileHandler("MyLog.log");
        logg.addHandler(fileHandler);
        Formatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        System.out.println(massagge);
    }


}
