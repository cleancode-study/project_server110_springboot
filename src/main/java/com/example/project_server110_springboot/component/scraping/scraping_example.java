package com.example.project_server110_springboot.component.scraping;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class scraping_example {
    public static void main(String[] args) throws IOException {

        String URL = "https://map.kakao.com/link/search/수원시청음식점";
        Document doc;

        try {
            // 자료를 가져올 사이트에 연결하기
            doc = Jsoup.connect(URL).get();
            System.out.println(doc);
//            System.out.println(doc.data());
            System.out.println("-------------");
            Elements titles = doc.getElementsByClass("placelist");
            System.out.println(titles);
            for (int i = 0; i < titles.size(); i++) {

                Element title = titles.get(i);
                System.out.println(title.text());
            }
        }catch(IOException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}




