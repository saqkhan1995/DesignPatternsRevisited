package Structural.S8Proxy;

public class FileDownloaderService implements Service{

    private String filename;

    public FileDownloaderService(String filename) {
        this.filename = filename;
        loadFile(filename);
    }

    @Override
    public void downloadFile() {
        System.out.println("File " + filename + " is being downloaded");
    }

    private void loadFile(String filename) {
        System.out.println("Loading " + filename);
    }
}
