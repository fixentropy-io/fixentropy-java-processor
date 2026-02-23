package io.fixentropy.serializer;

import io.fixentropy.exception.SerializationFailed;
import io.fixentropy.model.Dragee;

import java.util.Collection;

public interface DrageeSerializer {

    void serialize(Collection<Dragee> dragees) throws SerializationFailed;

}
