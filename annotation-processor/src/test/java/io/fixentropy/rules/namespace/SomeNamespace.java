package io.fixentropy.rules.namespace;

import io.fixentropy.annotation.Fixentropy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Fixentropy.Namespace
@Target({ElementType.TYPE})
public @interface SomeNamespace {

    @SomeNamespace
    @Target({ElementType.TYPE})
    @interface SomeConcept {
    }

}
