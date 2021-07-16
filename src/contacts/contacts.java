package contacts;

import java.nio.file.Path;
import java.nio.file.Paths;

public class contacts {

    // Try to create the directory
    Path path = FileDirectoryUtil.getPath("src", "fileIO", "files");
        FileDirectoryUtil.tryCreateDirectory(path);

    // Try to create the file
    path = Paths.get(path.toString(), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);
}
