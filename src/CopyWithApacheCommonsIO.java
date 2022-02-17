import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyWithApacheCommonsIO implements CopyUtils {
    @Override
    public void Copy(String from, String to) throws IOException {
        File copied = new File(from);
        File original = new File(to);
        FileUtils.copyFile(original, copied);
    }
}
