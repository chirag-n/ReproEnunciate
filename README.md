# Enunciate Performance Issue with Large Inheritance Trees

## Overview

This project is a simple "Hello World" application designed to demonstrate an issue with Enunciate when handling large inheritance trees. 

## Steps to Reproduce

1. Run the following command to generate Enunciate documentation:
   ```sh
   mvn clean -X enunciate:docs
   ```
2. Modify `enunciate2.xml` to increase the version number.
3. In my case I observed that Enunciate works fine for versions less than 30 but becomes slower or unresponsive as the version increases.

## Project Structure

This project defines multiple versions of a `RootResource` class, located at:

```
src/main/java/com/ex/api/v1/RootResourceV*.java
```

A shell script is used to generate 80 versions of this class, each extending the previous version.

## Example Class Structure

Each version of the `RootResource` class follows the same pattern:

```java
package com.ex.api.v{version};

import com.ex.api.v{version-1}.RootResourceV{version-1};
import com.webcohesion.enunciate.metadata.rs.ResourceGroup;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
@ResourceGroup("RootResource")
public interface RootResourceV{version} extends RootResourceV{version-1} {

    /**
     * Simple GET request that returns "Hello, World!"
     */
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    String sayHello();
}
```

## Purpose

The purpose of this test is to highlight a regression in Enunciate's performance when dealing with deep inheritance trees. Older versions, such as Enunciate **2.13.1**, did not exhibit this issue.

- Enunciate currently can't process large inheritance trees efficiently, as it did in earlier versions.
- Performance degrades significantly as the inheritance depth increases.

## Observed Behavior

- Enunciate slows down significantly or hangs when the version exceeds 30.
- This issue was not present in Enunciate **2.13.1**.

## Conclusion

This project serves as a reproducible test case to demonstrate and diagnose performance issues with newer Enunciate versions when handling deep inheritance trees.
