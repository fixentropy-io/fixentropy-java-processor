package io.fixentropy.processor;

import com.google.auto.service.AutoService;
import io.fixentropy.model.Dragee;
import io.fixentropy.serializer.DrageeSerializer;
import io.fixentropy.serializer.JacksonDrageeSerializer;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Collection;
import java.util.Set;

@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_17)
@AutoService(Processor.class)
public class AnnotationProcessor extends AbstractProcessor {

    private DrageeFactory drageeFactory;
    private DrageeSerializer drageeSerializer;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        this.drageeFactory = new DrageeFactory(processingEnv.getTypeUtils());
        this.drageeSerializer = new JacksonDrageeSerializer(processingEnv.getFiler());
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (annotations.isEmpty()) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING, "No annotation found. Stop process right there.");
            return false;
        }

        Collection<Dragee> dragees = drageeFactory.createDragees(annotations, roundEnv);
        drageeSerializer.serialize(dragees);
        return true;
    }
}
