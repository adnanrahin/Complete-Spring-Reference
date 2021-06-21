### Spring Model-View-Controller (MVC)
Spring-MVC is collection of web pages to layout UI components and Contains Collection of Spring beans like Controllers, services.  

#### Architecture of Spring-MVC

***Front Controller:*** Everything start with Front Controller also it's known as ***DispatcherServlet***.
All the incoming request is hit and handled by the Front Controller. It is basically used to handle HTTP 
request, as it is inherited from HTTPServlet. This is the part of Spring Framework.

***Controller:*** Controller contains all the business logic. It handles all the request and Store/Retrieve
all the data from database or web services. Also, controller is responsible for place data in model, and 
sent to appropriate view template.

***Model:*** Model contains all the data that come through controller. It's retrieve and store data via
backend systems like database or web services.

***View:*** View is responsible for display the data to user or client. Usually JSP or JSTL are very common
view templates.
