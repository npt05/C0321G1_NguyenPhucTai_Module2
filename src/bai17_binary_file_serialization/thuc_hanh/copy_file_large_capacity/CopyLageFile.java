package bai17_binary_file_serialization.thuc_hanh.copy_file_large_capacity;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyLageFile {
    public static void main(String[] args) {
        File srcFile = new File("data/src.txt");
        File destFile = new File("data/dest.txt");
        copyFileUsingStream(srcFile,destFile);
    }
    private static void copyFileUsingStream(File source, File dest){
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) >0){
                os.write(buffer,0,length);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void copyFileUsingJava7Files(File src, File dest) throws IOException {
        Files.copy(src.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}