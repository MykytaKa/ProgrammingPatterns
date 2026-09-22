import java.io.File;

public class User {
    private String userId;
    private String userName;

    private IStorage currentStorage;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public boolean connectToStorage(String storageName) {
        IStorage storage = StorageManager.getInstance().getStorage(storageName);
        if (storage != null) {
            this.currentStorage = storage;
            return true;
        }
        return false;
    }

    public boolean saveFile(File file, String path) {
        if (currentStorage != null) {
            return currentStorage.uploadFile(file, path);
        }
        return false;
    }

    public File getFile(String path) {
        if (currentStorage != null) {
            return currentStorage.downloadFile(path);
        }
        return null;
    }

    public boolean deleteFile(String path) {
        if (currentStorage != null) {
            return currentStorage.deleteFile(path);
        }
        return false;
    }
}
