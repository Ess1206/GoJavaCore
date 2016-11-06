package practice;

import javafx.beans.binding.StringBinding;
import javafx.beans.binding.When;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stan on 31.10.2016.
 */
public class ReadFreomConsole {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://google.com");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream() , "cp1251"));



        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line + System.lineSeparator());
        }
    reader.close();

        String result = stringBuilder.toString()
                .replaceAll("google" , "ya")
                .replaceAll("com","ru");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./module11/google.txt"), StandardCharsets.UTF_16))){
            bufferedWriter.write(result);
        }

//        System.out.println(result);






    }
}
