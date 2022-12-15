package org.chary.selenide;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

public class Download {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
    // Get the current date and time
    Date date = new Date();
    // Format the date and time to a string
    String dateTimeString = dateFormat.format(date);

   void getImage(String imageName, long duration, String url) {
        String pngFileName;

        try {
            open(url);
            Thread.sleep(duration*1000);
            pngFileName = screenshot((imageName + dateTimeString));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

