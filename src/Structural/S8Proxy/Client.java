package Structural.S8Proxy;

public class Client {

    public static void main(String[] args) {
        String filename = "file.txt";
        Service service = new ProxyFile(filename);

        service.downloadFile();

        /*
        O/P ->
        Checking if the client has access to the resource...
        Access granted!
        Loading file.txt
        File file.txt is being downloaded
         */
    }
}
