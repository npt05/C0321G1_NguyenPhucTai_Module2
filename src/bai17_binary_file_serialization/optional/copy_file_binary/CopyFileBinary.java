package bai17_binary_file_serialization.optional.copy_file_binary;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileBinary {
    public static void main(String[] args) {
        String fileSource="fileSource.txt";
        String fileDest="fileDest.txt";
        try {
            FileInputStream fis=new FileInputStream(fileSource);
            FileOutputStream fos=new FileOutputStream(fileDest);
            byte[] bytes=new byte[1024];
            int noOfBytes=0;
            System.out.println("tiến hành copy file");
            while ((noOfBytes=fis.read(bytes))!=-1){
                fos.write(bytes,0,noOfBytes);
            }
            System.out.println("copy thành công");
            fis.close();
            fos.close();
        } catch (FileNotFoundException fos) {
            System.out.println("không tìm được file: "+fos);
        } catch (IOException fis) {
            System.out.println("lỗi khi copy file: "+fis);
        }
    }
}