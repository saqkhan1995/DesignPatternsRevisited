package Creational.S4Singleton;

public class MainApp {
    public static void main(String[] args) {
        //Eager initialization
        SingletonLogger singletonLogger = SingletonLogger.getLogger();
        singletonLogger.logMessageStart();

        //LazyLoading
        SingletonLoggerLazyLoading singletonLoggerLazyLoading = SingletonLoggerLazyLoading.getLogger();
        singletonLoggerLazyLoading.logMessageStop();


    }
}
