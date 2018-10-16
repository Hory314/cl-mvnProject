package pl.coderslab.main;


import org.apache.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;

public class Main
{
    public final static Logger log = Logger.getLogger(Main.class);


    public static void main(String[] args)
    {
        Connection connect = Jsoup.connect("http://www.onet.pl/");
        try
        {
            Document document = connect.get();
            Elements links = document.select("span.title");
            for(Element elem : links)
            {
                System.out.println(elem.text());
            }
        }
        catch(IOException e)
        {
            log.error(e,e);
            e.printStackTrace();
        }
    }
}
