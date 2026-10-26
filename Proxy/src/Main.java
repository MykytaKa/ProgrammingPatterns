public class Main {
    public static void main(String[] args) {
        Downloader directDownloader = new SimpleDownloader();
        byte[] file1 = directDownloader.download("https://example.com/file1.zip");

        Downloader cachedDownloader = new CachingDownloaderProxy(directDownloader);
        byte[] file1Cached = cachedDownloader.download("https://example.com/file1.zip");
        byte[] file1Again = cachedDownloader.download("https://example.com/file1.zip");
    }
}