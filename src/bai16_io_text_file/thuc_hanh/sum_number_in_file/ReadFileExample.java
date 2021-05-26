package bai16_io_text_file.thuc_hanh.sum_number_in_file;

import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText("data/numbers.txt");
    }
    void readFileText(String filePath){
        try {
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }

            bufferedReader.close();
            System.out.println("sum = " + sum);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
