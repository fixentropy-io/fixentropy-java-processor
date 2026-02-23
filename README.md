# Fixentropy-java-processor

## Installation

Dependencies are provided through the use of a bom dependency.

```xml

<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>io.fixentropyio.fixentropy</groupId>
            <artifactId>fixentropy-bom</artifactId>
            <version>${fixentropy.version}</version>
            <scope>import</scope>
            <type>pom</type>
        </dependency>
    </dependencies>
</dependencyManagement>
```

## annotation-processor

This dependency is mandatory in order to process objects that are assignable to fixentropy.

```xml

<dependencies>
    <dependency>
        <groupId>io.fixentropyio.fixentropy</groupId>
        <artifactId>annotation-processor</artifactId>
        <scope>provided</scope>
    </dependency>
</dependencies>

<build>
<plugins>
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>${maven.compiler.version}</version>
        <configuration>
            <annotationProcessorPaths>
                <path>
                    <groupId>io.fixentropyio.fixentropy</groupId>
                    <artifactId>annotation-processor</artifactId>
                    <version>${fixentropy.version}</version>
                </path>
            </annotationProcessorPaths>
        </configuration>
    </plugin>
</plugins>
</build>
```

## core-annotations

Core annotations of Fixentropy format. It is **already provided** by the annotation-processor.

```xml

<dependency>
    <groupId>io.fixentropyio.fixentropy</groupId>
    <artifactId>core-annotations</artifactId>
    <scope>provided</scope>
</dependency>
```

## ddd-annotations

All the annotations relative to DDD tactical patterns.

```xml

<dependency>
    <groupId>io.fixentropyio.fixentropy</groupId>
    <artifactId>ddd-annotations</artifactId>
    <scope>provided</scope>
</dependency>
```

## hexagonal-annotations

If you want to use the Hexagonal Architecture annotations, you must add the following dependency:

```xml
<dependency>
    <groupId>io.dragee</groupId>
    <artifactId>hexagonal-annotations</artifactId>
    <scope>provided</scope>
</dependency>
```
