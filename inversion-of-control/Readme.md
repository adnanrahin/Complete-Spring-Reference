## Spring Inversion of Control

### What is Spring Inversion of Control

***Inversion of Control*** is principle that allow us to control objects through container or frameworks. We can achieve Inversion of Control using Dependency Injection. Idea behind the IOC is application should be configurable.

#### Advantage of Inversion of Control
1. Inversion of Control makes ***loosely coupled***.
2. Inversion of Control also makes it easy for the programmer to write effective unit tests.

### Spring Container
Spring Container is the core of the Spring Framework. The container will create the objects, wire them together, configure them and manage their complete life cycle from. The container gets its instructions on what objects to instantiate, configure, and assemble by reading the configuration metadata provided. The configuration metadata can be represented either by XML, Java annotations, or Java code. The ***org.springframework.beans*** and ***org.springframework.context*** packages provide the basis for the Spring Framework’s IoC container.

### Spring Beans
A Spring Bean is simply a Plain Old Java Object ***(POJO)***. When java objects are created by the Spring Container, Spring refers to them as Spring Beans.  A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. These beans are created with the configuration metadata that you supply to the container.

### Spring BeanFactory
A BeanFactory contains a collection of beans. In Spring IoC container BeanFactory is responsible for containing and otherwise managing the ***Spring Beans***. The BeanFactory interface is the central IoC container interface in Spring. There are a number of implementations of the BeanFactory interface. The most commonly used BeanFactory implementation is the XmlBeanFactory class. Other commonly used class is XmlWebApplicationContext.

### Spring Component Scanning
