## Springboot Template ##
This is the springboot template project used for any new microservice development. This project is based on the latest springboot version 2.6.3 and Java 17.
## Prerequisites
- Git
- Java-17 (can be downloded from [here](https://www.oracle.com/java/technologies/downloads/#JDK17))
- settings.xml in .m2 folder
- ...

### Running Locally ###
```shell
./gradlew bootRun --args='--spring.profiles.active=dev'
```

### Reference Documentation
For further reference, please consider the following sections:
* [Java 8 to 17 Migration](https://pretius.com/blog/java-17-features/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.3/gradle-plugin/reference/html/#build-image)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/2.6.3/reference/html/spring-boot-features.html#boot-features-r2dbc)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#howto-execute-flyway-database-migrations-on-startup)
* [Prometheus](https://docs.spring.io/spring-boot/docs/2.6.3/reference/html/production-ready-features.html#production-ready-metrics-export-prometheus)
* [Vault Client Quick Start](https://docs.spring.io/spring-cloud-vault/docs/current/reference/html/#client-side-usage)
* [Resilience4J](https://cloud.spring.io/spring-cloud-static/spring-cloud-circuitbreaker/current/reference/html)

### Git Workflow ###
This repository workflow is based on [Git branching model](https://blog.scottlowe.org/2015/01/27/using-fork-branch-git-workflow/) with two main branches with an infinite lifetime:

* main
* develop

The **main** branch at origin should be familiar to every Git user. Parallel to the master branch, another branch exists called **develop**.

We consider **origin/main** to be the main branch where the source code of HEAD always reflects a production-ready state.

We consider **origin/develop** to be the main branch where the source code of HEAD always reflects a state with the latest delivered development changes for the next release. Some would call this the “integration branch”. This is where any automatic nightly builds are built from.

We follow the fork model for contributions to this repo. Please look through the following links for further knowledge.   
https://blog.scottlowe.org/2015/01/27/using-fork-branch-git-workflow/  
https://support.atlassian.com/bitbucket-cloud/docs/fork-a-repository/

![Fork Model](https://www.dalescott.net/wp-content/uploads/2012/09/centralized-github-4.png)
