package bai16_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        File file = new File("folder/test.txt");
        try {
            inputStream = new FileInputStream("folder/country.csv");
            if (!file.exists()){
                outputStream = new FileOutputStream("folder/test.txt");
                int k = 0;
                int count = 0;
                while ((k = inputStream.read()) != -1) {
                    outputStream.write(k);
                    count++;
                }
                System.out.println("done! so ky tu da copy " + count);
            } else {
                System.out.println("tep tin dich da ton tai");
            }

        } catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }


    }
}