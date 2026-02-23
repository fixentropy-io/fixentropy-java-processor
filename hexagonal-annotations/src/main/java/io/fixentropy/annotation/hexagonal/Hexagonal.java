package io.fixentropy.annotation.hexagonal;

import io.fixentropy.annotation.Fixentropy;

import java.lang.annotation.*;

@Fixentropy.Namespace
@Inherited
@Documented
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Hexagonal {

    @Hexagonal
    @Documented
    @Inherited
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface DomainEntity {
    }

    @Hexagonal
    @Documented
    @Inherited
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface DomainService {
    }

    @Hexagonal
    @Documented
    @Inherited
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface InboundPort {
    }

    @Hexagonal
    @Documented
    @Inherited
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface OutboundPort {
    }

    @Hexagonal
    @Documented
    @Inherited
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface InboundAdapter {
    }

    @Hexagonal
    @Documented
    @Inherited
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface OutboundAdapter {
    }
}