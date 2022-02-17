import java.io.*;

public class CopyWithBufferIO implements CopyUtils {
    @Override
    public void Copy(String from, String to) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(from));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(to));

        int c = 0;
        while (true) {
            c = bis.read();
            if (c != -1)
                bos.write(c);
            else
                break;
        }
        bis.close();
        bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
        bos.close(); //закрываем поток записи (обязательно!)
    }
}
