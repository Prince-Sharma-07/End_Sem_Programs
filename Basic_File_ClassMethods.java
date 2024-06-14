package End_sem_Programs;
import java.io.*;
public class Basic_File_ClassMethods {
    public static void main(String[] args) {
        String fname = "Prince.txt";
        File f = new File(fname);
        System.out.println("File Name: " + f.getName());
        System.out.println("File Path: " + f.getPath());
        System.out.println("File Absolute Path: " + f.getAbsolutePath());
        System.out.println("File Size: " + f.length());
        System.out.println("File Parent: " + f.getParent());
        System.out.println("File Exists: " + f.exists());
        try {
            if (f.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists!");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        if(f.exists()){
            System.out.println("Is Writable: " + f.canWrite());
            System.out.println("Is Readable: " + f.canRead());
            System.out.println("Is a Directory: " + f.isDirectory());
            System.out.println("Is a File: " + f.isFile());
        }
        if(f.delete()){
            System.out.println("File is Deleted!");
        }
    }
}
