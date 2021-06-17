### Dependency-Injection

#### What is Dependency-Injection
Dependency injection is a pattern we can use to implement IoC, 
where the control being inverted is setting an object's dependencies, 
through which the Spring Container ***injects*** objects into other objects.
Application classes should be as independent as possible. Dependency Injection helps in
gluing these classes together and at the same time keeping them independent.

#### Types of Dependency Injection
1. Constructor Injection: Constructor injection is the process of using the constructor to pass in the dependencies of a class.
2. Setter Injection: In the property injection (aka the Setter Injection), the injector supplies the dependency through a public property of the client class.
3. Interface Injection: In this type of injection, the client class implements an interface which declares the method(s) to supply the dependency, and the injector uses this interface to supply the dependency to the client class.
