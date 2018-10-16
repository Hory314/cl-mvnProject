package pl.coderslab.main;


import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main2
{
    public final static Logger log = Logger.getLogger(Main.class);


    public static void main(String[] args)
    {

        String fileName = "pom.xml";

        List<String> lines = null;
        try
        {
            lines = Files.readLines(new File(fileName), Charsets.UTF_8);
        }
        catch(IOException e)
        {
            log.error(e, e);
            e.printStackTrace();
        }

        for(String line : lines)
        {
            System.out.println(line);
        }
    }
}
