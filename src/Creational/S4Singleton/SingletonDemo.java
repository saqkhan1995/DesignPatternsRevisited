package Creational.S4Singleton;

//Prevents the instantiation of a class more than once,
//so basically you cannot create two objects of the same class (the class that implements Singleton Pattern)
//provide single access to an object

//Where ? for Loggers, Thread pool & cache
//to have a single instance of your object & can be called from many places in your code

//How -> define a "private" "static" instance of the class (Singleton Class) & constructor needs to be "private"
//Private constructor because we don't want clients to be using it to create new instances
//& only one "public" "Static" getter/method to return the defined instance ("public" because its the only way to access it)
public class SingletonDemo {
}
