package Creational.S4Singleton;

public class SingletonLoggerLazyLoading {

    //Eager Initialization
    //1. Create a "public" "static" instance of the Singleton Class
//    private static SingletonLoggerLazyLoading logger = new SingletonLoggerLazyLoading();

    //Create a "public" "static" instance of the Singleton Class
    private static SingletonLoggerLazyLoading logger;

    //2. Have a private Constructor so nobody outside can access it
    private SingletonLoggerLazyLoading() {
    }

    //3. "public" "static" method/getter to access the singleton instance
    public static synchronized SingletonLoggerLazyLoading getLogger() { //to make thread safe, use "synchronized"
        if (logger == null) {
            logger = new SingletonLoggerLazyLoading();
        }
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
//Lets see what lazy loading initialization looks like (obj is created only when needed) ->
    //makes it more memory efficient as the object is not created if not needed

//Also to make it thread safe use keyword "synchronized"
