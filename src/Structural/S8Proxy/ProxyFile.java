package Structural.S8Proxy;

public class ProxyFile implements Service{

    private FileDownloaderService fileDownloaderService;
    private String filenamme;

    public ProxyFile(String filenamme) {
        this.filenamme = filenamme;
    }

    @Override
    public void downloadFile() {
        System.out.println("Checking if the client has access to the resource...");
        System.out.println("Access Granted !");

        if (fileDownloaderService == null) {
            fileDownloaderService = new FileDownloaderService(filenamme);
        }
        fileDownloaderService.downloadFile();
    }
}
