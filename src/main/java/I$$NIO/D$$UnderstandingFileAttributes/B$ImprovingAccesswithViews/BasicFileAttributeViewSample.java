package I$$NIO.D$$UnderstandingFileAttributes.B$ImprovingAccesswithViews;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;

public class BasicFileAttributeViewSample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/turtles/sea.txt");

        BasicFileAttributeView view =
                Files.getFileAttributeView(path, PosixFileAttributeView.class);
        BasicFileAttributes data = view.readAttributes();


        FileTime lastModifiedTime = FileTime.fromMillis(
                data.lastModifiedTime().toMillis() + 10_000);

        view.setTimes(lastModifiedTime, null, null);
    }
}