import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorageManager {
    private static StorageManager instance;

    private Map<String, IStorage> registeredStorages;

    private StorageManager() {
        registeredStorages = new HashMap<>();
    }

    public static synchronized StorageManager getInstance() {
        if (instance == null) {
            instance = new StorageManager();
        }
        return instance;
    }

    public void registerStorage(String storageName, IStorage storage) {
        registeredStorages.put(storageName, storage);
    }

    public IStorage getStorage(String storageName) {
        return registeredStorages.get(storageName);
    }

    public List<String> getAvailableStorageNames() {
        return new ArrayList<>(registeredStorages.keySet());
    }
}
