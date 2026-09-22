import java.io.File;

public class Main {
    public static void main(String[] args) {
        StorageManager manager = StorageManager.getInstance();

        manager.registerStorage("Local", new LocalDiskStorage());
        manager.registerStorage("AmazonS3", new AmazonS3Storage());

        User user = new User("u-001", "Mykyta");

        File myDocument = new File("document.txt");
        if (user.connectToStorage("Local")) {
            user.saveFile(myDocument, "C:/my_files/document.txt");
        } else {
            System.out.println("Can't connect to 'Local'.");
        }

        if (user.connectToStorage("AmazonS3")) {
            user.saveFile(myDocument, "s3://my-bucket/document.txt");
            user.deleteFile("s3://my-bucket/old_backup.zip");
        } else {
            System.out.println("Can't connect to 'AmazonS3'.");
        }
    }
}