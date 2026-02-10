package io.fixentropy.rules.sub_namespace;

import io.fixentropy.processor.WrongUsageOfNamespaces;
import io.fixentropy.testing.Compiler;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class FixentropyInvalidSubNamespaceTest {

    private static final Path SOURCE_FOLDER = Path.of("io", "fixentropy", "rules", "sub_namespace");

    private static Compiler.Result executeProcessor() {
        Compiler compiler = Compiler.compileTestClasses(
                SOURCE_FOLDER.resolve("AnOtherObject.java")
        );

        return compiler.executeProcessor();
    }

    @Test
    void sub_namespace_can_not_come_from_more_than_one_other_namespace() {
        // when
        assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(FixentropyInvalidSubNamespaceTest::executeProcessor)
                .withCauseInstanceOf(WrongUsageOfNamespaces.class)
                .withMessageContaining("A sub namespace can not depend on more than one other namespace: 'sub_from_two_namespaces', ['path/foo/bar', 'testing']");
    }

}
