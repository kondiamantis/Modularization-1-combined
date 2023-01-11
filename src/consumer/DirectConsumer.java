package consumer;

import algorithm.BubbleSort;
import util.MySortingUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class DirectConsumer {

    private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());
    public static void main(String[] args) throws IOException {
        BubbleSort mySortingUtil = new BubbleSort();
        List<String> sorted = mySortingUtil.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));

        logger.info(sorted.toString());

        //---------------------------------------------------

        FileHandler fh = new FileHandler("C:\\Users\\kondi\\Desktop\\Java Projects\\Modularization-1-combined\\MyLogFile.log");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        logger.info(sorted.toString());
    }
}
