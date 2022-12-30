package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class readerFileMain {

    public static void main(String[] args) {
        BufferedReader reader = null;

            try {
                reader = new BufferedReader(new FileReader("C:\\Users\\w10\\IdeaProjects\\batch80_Java\\hataYonetimi_ExceptionHandling\\src\\test\\java\\readingFileDemo\\sayilar.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
                try {
                    reader.close();
                }catch (Exception exception){

                }

            }

    }
}
