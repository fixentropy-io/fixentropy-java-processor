package io.fixentropy.rules.sub_namespace;

import io.fixentropy.annotation.Fixentropy;
import io.fixentropy.testing.Testing;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Testing
@Bar
@Fixentropy.Namespace
@Target({ElementType.TYPE})
public @interface SubFromTwoNamespaces {
}
