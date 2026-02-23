package io.fixentropy.testing;

import io.fixentropy.annotation.Fixentropy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Fixentropy.Namespace
@Target({ElementType.ANNOTATION_TYPE})
public @interface Testing {
}
