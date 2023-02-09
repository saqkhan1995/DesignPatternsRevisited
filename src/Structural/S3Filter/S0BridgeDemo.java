package Structural.S3Filter;

// Bridge pattern aims to separate large structure of classes into 2 hierarchies
// the bridge pattern is providing a binding between abstraction & implementation at runtime making use of OOP principles like inheritance etc.

//Imagine you have a Shape (parent) abstract class & 2 implementations - square & rectangle
//Both square & rectangle need to have a color attribute, therefor 2 separate objects would emerge (refer "exampleJPEG")
//The solution would look something as "solutionJPEG"

//this essentially is a refactorisation, you'd have a "Color" interface with 2 color implementations - Red & Blue
// The abstract class would remain as is, however to build those 2 objects, you'd need to provide "color" inside the
// constructor of each class.

//When to use Bridge Pattern
// -> When having a complex structure of classes with similar implementation
// -> When want to impose the same implementation for multiple objects
// -> When providing a map between orthogonal class hierarchies
public class S0BridgeDemo {
}
