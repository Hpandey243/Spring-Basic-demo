# Spring-Basic-demo
Spring Basic demo

This project demonstrates different ways Spring provides dependency injection using XML file and create a loosely coupled application.
In ReportService class there is Dependency of  ReportGenerator class.


    Dependency injection is done  by creating  bean. 
        <bean id="class name" > creates bean for given class.
        <property name="..." value="...."></property> uses setter injection for primitive values.
        <property name="master" ref="pdfReportGenerator"></property> ref tag refers to the dependent bean id which should be defined.             <bean id="pdfReportGenerator" class="com.demo.spring.PdfReportGenerator" /> it is bean ref tag refers to.
  
        autowire="byType" looks for the specified type of the class.
        autowire="byName" looks for the specified name of bean id.
        
        Instead of using autowire in XML we can use java @Autowired annotation on the property or setter methods or contructors.
  
  



