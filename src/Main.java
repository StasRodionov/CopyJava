import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CopyWithBufferIO copyWithBufferIO = new CopyWithBufferIO();
        CopyWithNIO copyWithNIO = new CopyWithNIO();
        CopyWithGuava copyWithGuava = new CopyWithGuava();
        CopyWithApacheCommonsIO copyWithApacheCommonsIO = new CopyWithApacheCommonsIO();
        CopyWithFileStreams copyWithFileStreams = new CopyWithFileStreams();
        CopyWithFileChannels copyWithFileChannels = new CopyWithFileChannels();

        long start1 = System.currentTimeMillis();
        copyWithBufferIO.Copy("200MB.zip", "1\\200MB.zip");
        long end1 = System.currentTimeMillis();
        System.out.println("Копирование 200Мb методом BufferIO: " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        copyWithNIO.Copy("200MB.zip", "2\\200MB.zip");
        long end2 = System.currentTimeMillis();
        System.out.println("Копирование 200Мb методом NIO: " + (end2 - start2));

        long start3 = System.currentTimeMillis();
        copyWithGuava.Copy("3\\200MB.zip", "200MB.zip");
        long end3 = System.currentTimeMillis();
        System.out.println("Копирование 200Mb методом Guava: " + (end3 - start3));

        long start4 = System.currentTimeMillis();
        copyWithApacheCommonsIO.Copy("4\\200MB.zip", "200MB.zip");
        long end4 = System.currentTimeMillis();
        System.out.println("Копирование 200Mb методом ApacheCommonsIO: " + (end4 - start4));

        long start5 = System.currentTimeMillis();
        copyWithFileStreams.Copy("200MB.zip", "5\\200MB.zip");
        long end5 = System.currentTimeMillis();
        System.out.println("Копирование 200Mb методом FileStreams: " + (end5 - start5));

        long start6 = System.currentTimeMillis();
        copyWithFileChannels.Copy("200MB.zip", "6\\200MB.zip");
        long end6 = System.currentTimeMillis();
        System.out.println("Копирование 200Mb методом FileChannels: " + (end6 - start6));

    }
}

