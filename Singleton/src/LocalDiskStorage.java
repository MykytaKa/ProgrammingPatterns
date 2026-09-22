import java.io.File;

public class LocalDiskStorage implements IStorage {
    @Override
    public boolean uploadFile(File file, String destinationPath) {
        return false;
    }

    @Override
    public File downloadFile(String sourcePath) {
        return null;
    }

    @Override
    public boolean deleteFile(String filePath) {
        return false;
    }
}
