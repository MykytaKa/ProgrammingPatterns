import java.io.File;

public interface IStorage {
    boolean uploadFile(File file, String destinationPath);
    File downloadFile(String sourcePath);
    boolean deleteFile(String filePath);
}
