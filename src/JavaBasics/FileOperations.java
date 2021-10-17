package JavaBasics;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class FileOperations {

    public static void main(String[] args) throws SecurityException, IOException {

        File f = new File("E:\\sem 2\\programs java\\src\\Demo.txt");
        if(f.createNewFile())
        {
            System.out.println("Created Successfully.");
        }
        else {
            System.out.println("Already exists.");
        }
        if (f.exists()) {
            System.out.println("File name is : " + f.getName());
            System.out.println("File path is : " + f.getPath());
            boolean set = f.setWritable(true);
            System.out.println("set the owner's write permission: " + set);
            boolean check = f.canWrite();
            System.out.println("Checking owner's write permission: " + check);

            Path path = FileSystems.getDefault().getPath(f.getAbsolutePath());
            BasicFileAttributeView view = Files.getFileAttributeView(
                    path, BasicFileAttributeView.class);
            BasicFileAttributes attribute = view.readAttributes();
            System.out.println("Last accessed time is :"
                    + attribute.lastAccessTime());

            System.out.println("The size of the file is: " + f.length());
            System.out.println("The location of the file is: " + f.getParent());

            boolean deleted = f.delete();
            System.out.println("Deleting the file: " + deleted);
        } else {
            System.out.println("File does not Exists");
        }
    }

}
