package inputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author gewei
 * @date 2019/5/5
 * 抽象基础类
 * InputStream
 * |
 * +--FileInputStream
 * |
 * +--ByteArrayInputStream
 * |
 * +--PipedInputStream
 * |
 * +--FilterInputStream
 * |
 * +--BufferedInputStream
 * |
 * +--PushbackInputStream
 * |
 * +--DataInputStream
 * |
 * +--ObjectInputStream
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        /**
         * Java I/O 中，流意味着数据流，流中的数据可以是字符，字节，对象等。
         */
        String srcFile = "test.txt";
        FileInputStream fin = new FileInputStream(srcFile);
        byte byteData;
        while ((byteData = (byte) fin.read()) != -1) {
            System.out.print((char) byteData);
        }
    }
}
