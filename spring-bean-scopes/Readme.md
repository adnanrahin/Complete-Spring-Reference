### Spring Bean Scopes

#### What is Spring Bean Scopes
Bean Scope refer to the lifecycle of the bean. For example how long does the bean live, how many instances are created for the bean and how the bean is shared in the spring environment etc.

#### Types of Spring-Bean-Scope

Spring framework supports six type of scopes that are described below:

1. Singleton
2. Prototype
3. Request
4. Session
5. Global-session
6. Application


#### Singleton: 
This is default bean scope and Spring container creates only one instance of the bean. 
It is cached in memory. 
All requests for the bean will return a shared reference to the same bean. 

* Singleton Bean Scope Code using XML Config 
    ```
        <bean id="address" class="com.jwt.bean.Address" scope="singleton">
            <constructor-arg name="city" value="New York"/>
        </bean> 
    ```
* Singleton Bean Scope using Annotations:

    ```
        @Scope("singleton")
        public class Address {

        }
    ```
