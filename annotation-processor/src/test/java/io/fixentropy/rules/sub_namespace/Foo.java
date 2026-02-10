package io.fixentropy.rules.sub_namespace;

import io.fixentropy.annotation.Fixentropy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Path
@Fixentropy.Namespace
@Target({ElementType.TYPE})
public @interface Foo {
}
