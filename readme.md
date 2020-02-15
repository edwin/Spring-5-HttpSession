HTTP Session Save using Spring 5 
===========
A simple demo using Spring 5, on how to save and display data to HTTP Session. And do a session listener, print to console for a specific session properties changes.

How to Run
-------
1. mvn clean package
2. copy .war file to JBoss EAP or Apache Tomcat
3. open browser, pointing to http://localhost:8080/spring5session-1.0
4. input some value on text field, and see the result on the same page. 
5. because of HttpSessionAttributeListener, we can see each changes on our console.