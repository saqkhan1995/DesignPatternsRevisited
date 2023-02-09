package Structural.S4Composite;

//The Composite Design Pattern -> is a hierarchical pattern focussed on Tree structures of data
// The goal for it is to have a structure that would enable you to treat all the components inside a structure the same
// To achieve this, objects are composed in a Tree structure

// See "CompositeExampleJPEG"

// At the top level , we have the Abstraction component with a method that should be implemented by the Leaf objects
// The Composite however is a component that has children & has a requirement to delegating with the children

//In the typical implementation of this pattern, the "Composite" delegates the functionality to it's children
// (Sort of a delegation model)


//Features ->
// -> Designed on Tree Structure
// -> Root level is the "Component" (as seen in the diagram) which is the abstraction
// -> Leaf objects implement the component
// -> Composite perform the same operations as the leafs
// -> Composite knows about thr child objects (leaf objects do not know of the composite's child objects)


//Example -> Java library -> awt component is using composite pattern (java.awt.component)
// Java AWT (Abstract Window Toolkit) is an API to develop Graphical User Interface (GUI) or windows-based applications in Java.

public class S0CompositeDemo {
}
