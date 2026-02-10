package io.fixentropy.processor;

import io.fixentropy.model.Dragee;

import java.util.Collection;
import java.util.function.Function;

class DrageeConverter implements Function<DrageeElements, Collection<Dragee>> {

    @Override
    public Collection<Dragee> apply(DrageeElements drageeElements) {
        return drageeElements.stream()
                .map(element -> toDragee(element, drageeElements))
                .toList();
    }

    private static Dragee toDragee(DrageeElement drageeElement, DrageeElements drageeElements) {
        return Dragee.builder()
                .fullName(drageeElement.name())
                .profile(drageeElement.profile().toString())
                .dependsOn(drageeElements.dependenciesOf(drageeElement))
                .build();
    }

}
