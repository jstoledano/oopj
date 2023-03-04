package org.toledano.duke.week2;

import edu.duke.URLResource;

public class Part4 {
    private static String url = "https://www.dukelearntoprogram.com//course2/data/manylinks.html";

    public void findLink(String link) {
        URLResource res = new URLResource(url);

        for (String word : res.words()) {
            int startIndex = word.indexOf("://");
            int endIndex = word.indexOf("\">");
            boolean isYoutube = word.contains("youtube.com");
            if (isYoutube) {
                System.out.println(word.substring(startIndex + 3, endIndex));
            }
        }
    }
}
