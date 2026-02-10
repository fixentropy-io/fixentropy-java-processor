package io.fixentropy.rules.fixes.issue9;

import io.fixentropy.annotation.Fixentropy;

import java.lang.annotation.*;

@Fixentropy.Namespace
@Inherited
@Documented
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Namespace {

    @Namespace
    @Documented
    @Inherited
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface ParentType {
    }

    @Namespace
    @Documented
    @Inherited
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface ChildType {
    }
}
