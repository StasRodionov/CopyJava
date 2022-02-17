import java.io.*;

public class CopyWithFileStreams implements CopyUtils {

    @Override
    public void Copy(String from, String to) throws IOException {

            InputStream input = null;
            OutputStream output = null;
            try {
                input = new FileInputStream(from);
                output = new FileOutputStream(to);
                byte[] buf = new byte[1024];
                int bytesRead;
                while ((bytesRead = input.read(buf)) > 0) {
                    output.write(buf, 0, bytesRead);
                }
            } finally {
                input.close();
                output.close();
            }
        }
    }

