package io.fixentropy.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleNameTest {

    @Test
    void keep_the_last_part_of_a_qualified_name() {
        String qualifiedName = "io.fixentropy.util.SimpleName";

        String actual = SimpleName.toSimpleName(qualifiedName);

        assertThat(actual).isEqualTo("SimpleName");
    }

}