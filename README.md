---
tags: [rest]
projects: [spring-framework]
---
:spring_version: current
:toc:
:project_id: gb-rest-service
:spring_version: current
:spring_boot_version: 1.5.9.RELEASE
:icons: font
:source-highlighter: prettify

This guide walks you through the process of creating a "hello world" link:/understanding/REST[RESTful web service] with Spring.

== What you'll build

You'll build a service that will accept HTTP  requests at:

----
http://localhost:8080/invokeApi
----

and respond with a link:/understanding/JSON[JSON] representation of a greeting:

[source,json]
----
{
    "calls": 11,
    "timestamp": "2018-01-11T03:01:00Z"
}
----






== What you'll need

:java_version: 1.8
:maven 3.x

to build war run 
mvn clean install
to run application run 
mvn spring-boot:run




