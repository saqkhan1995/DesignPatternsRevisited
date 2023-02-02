package Creational.S4Singleton;

public class SingletonLogger {

    //1. Create a "private" "static" instance of the Singleton Class
    private static SingletonLogger logger = new SingletonLogger();

    //2. Have a private Constructor so nobody outside can access it
    private SingletonLogger() {
    }

    //3. "public" "static" method/getter to access the singleton instance
    public static SingletonLogger getLogger() {
        return logger;
    }

    public void logMessageStart() {
        System.out.println("Start message is logged");
    }

    public void logMessageStop() {
        System.out.println("Stop message is logged");
    }

}

//The above usage is referred to as "Eager" initialization (obj is created & ready to use coz of static keyword)
//Lets see what lazy loading initialization looks like (obj is created only when needed)
