import java.util.Map;

public class CachingDownloaderProxy implements Downloader {
    private Downloader downloader;
    private Map<String, byte[]> cache;

    public CachingDownloaderProxy(Downloader downloader) {
        this.downloader = downloader;
    }

    @Override
    public byte[] download(String url) {
        return null;
    }

    public void resetCache() {
    }
}