# Design Patterns

Design patterns are typical solutions to common problems in software design. They are like blueprints that you can customize to solve a particular design problem in your code. There are mainly three types of design patterns:

## 1. Creational Patterns
Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by controlling the object creation process.

### Examples:
- **Singleton**: Ensures a class has only one instance and provides a global point of access to it. Use when you need exactly one instance of a class.
- **Factory Method**: Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created. Use when the exact type of object isn't known until runtime.
- **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes. Use when you need to create a set of related objects.
- **Builder**: Separates the construction of a complex object from its representation. Use when you need to create an object step by step.
- **Prototype**: Creates new objects by copying an existing object, known as the prototype. Use when creating an object is costly or complex.

## 2. Structural Patterns
Structural patterns deal with object composition or the way to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

### Examples:
- **Adapter**: Allows incompatible interfaces to work together. Use when you want to use an existing class, and its interface does not match the one you need.
- **Bridge**: Separates an object’s abstraction from its implementation so that the two can vary independently. Use when you need to avoid a permanent binding between an abstraction and its implementation.
- **Composite**: Composes objects into tree structures to represent part-whole hierarchies. Use when you need to treat individual objects and compositions of objects uniformly.
- **Decorator**: Adds additional responsibilities to an object dynamically. Use when you need to add functionalities to objects without subclassing.
- **Facade**: Provides a simplified interface to a complex subsystem. Use when you need to simplify a complex system.
- **Flyweight**: Reduces the cost of creating and manipulating a large number of similar objects. Use when you need to minimize memory usage.
- **Proxy**: Provides a surrogate or placeholder for another object to control access to it. Use when you need to control access to an object.

## 3. Behavioral Patterns
Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects. They help in defining how objects interact and communicate with each other.

### Examples:
- **Chain of Responsibility**: Passes a request along a chain of handlers. Use when you have multiple objects that can handle a request, but the handler isn't known beforehand.
- **Command**: Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations. Use when you need to parameterize objects with operations.
- **Interpreter**: Implements a specialized language. Use when you need to interpret a language.
- **Iterator**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. Use when you need to traverse a collection.
- **Mediator**: Defines an object that encapsulates how a set of objects interact. Use when you need to reduce the complexity of communication between multiple objects.
- **Memento**: Captures and restores an object's internal state. Use when you need to implement undo functionality.
- **Observer**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified. Use when you need to maintain consistency between related objects.
- **State**: Allows an object to alter its behavior when its internal state changes. Use when an object must change its behavior at runtime depending on its state.
- **Strategy**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Use when you need to use different variants of an algorithm.
- **Template Method**: Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure. Use when you need to let subclasses redefine certain steps of an algorithm.
- **Visitor**: Represents an operation to be performed on the elements of an object structure. Use when you need to perform operations on elements of a complex object structure.

Understanding and implementing these design patterns can greatly improve the flexibility, scalability, and maintainability of your code.