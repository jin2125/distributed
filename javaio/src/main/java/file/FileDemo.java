package file;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 * @author gewei
 * @date 2019/5/5
 */
public class FileDemo {
    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        /**
         * File 对象
         * File（String pathname）
         * File（File parent, String child）
         * File（String  parent, String child）
         * File（URI uri）
         */
        File dummyFile = new File("test.txt");

        boolean fileExists = dummyFile.exists();

        if (fileExists) {
            System.out.println("File Name: " + dummyFile.getName());
            System.out.println("File exists: " + dummyFile.exists());
            System.out.println("Absolute Path: " + dummyFile.getAbsolutePath());

        } else {
            System.out.println("The test.txt file dose not exists");
            dummyFile.createNewFile();
        }

        /**
         * 文件过滤器
         */
        String userDir = System.getProperty("user.dir");
        System.out.println("system user dir : " + userDir);
        File dir = new File(userDir);
        FileFilter fileFilter = file -> {
            if (file.isFile()) {
                String fileName = file.getName().toLowerCase();
                if (fileName.endsWith(".txt")) {
                    return false;
                }
            }

            return true;
        };

        File[] files = dir.listFiles(fileFilter);
        for (File f: files) {
            if (f.isFile()) {
                System.out.println(f.getPath() + " (File) ");
            } else if (f.isDirectory()) {
                System.out.println(f.getPath() + " (Directory) ");
            }
        }

    }
}
