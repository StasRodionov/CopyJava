import java.io.File;
import java.io.IOException;

public class CopyWithGuava implements CopyUtils {
    @Override
    public void Copy(String from, String to) throws IOException {
        File copied = new File(from);
        File original = new File(to);
        com.google.common.io.Files.copy(original, copied);
    }
}
