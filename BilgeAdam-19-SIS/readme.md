Student Information System Application for BilgeAdam JSF Course
-----------------------------
This is an example demo project for JSF introduction.

How to run the project:
-----------------------

It is necessary to configure project for your local machine. To do this;
* Configure `mysql-ds.xml` to point your local database;
```
<datasources>
    <datasource jndi-name="java:jboss/datasources/sisDS"
                pool-name="jsfPool">
        <connection-url>jdbc:mysql://localhost/sisdb?characterEncoding=UTF8
        </connection-url>
        <driver>mysql</driver>
        <pool>
            <min-pool-size>1</min-pool-size>
            <max-pool-size>5</max-pool-size>
            <prefill>true</prefill>
        </pool>
        <security>
            <user-name>root</user-name>
            <password>1234</password>
        </security>
    </datasource>
</datasources>
```

* You can reach the index page by typing;
```
http://localhost:8080/sis-1.0
```
