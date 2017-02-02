Spring Batch Admin as a Spring Boot app
=======================================

This is a a Spring Boot capsule of the standard 
[Spring Batch Admin](https://github.com/spring-projects/spring-batch-admin "Github") application of the 
[Spring Batch](http://projects.spring.io/spring-batch/ "SpringIO Page") team. 

With this capsule it is possible to run the **Spring Batch Admin** as a **Spring Boot** application instead of
deploying it to a servlet container like tomcat.

As a default test configuration a local HSQLDB database is used for the batch metadata. As a default
 production configuration a PostgreSQL database is used.

This can be changed:

1. You want to use HSQLDB and/or you have other HSQLDB properties?
	* Remove the PostgreSQL dependency from the `pom.xml` and delete the line specifying the scope for HSQLDB.
	* Just change the entries inside `batch-hsql.properties`.
2. You prefer to use another database system?
	* Add a new file batch-[*your-db*].properties (a template can be found in the root of 
	spring-batch-core.jar) and if preferred delete the corresponding file for PostgreSQL.
	* Set the property `ENVIRONMENT` in application.properties to *your-db* (means i.e. 
	batch-oracle.properties with ENVIRONMENT=oracle)

You can test the running application by starting the JUnit test class *BatchTest* that can be found in the 
test sources folder.