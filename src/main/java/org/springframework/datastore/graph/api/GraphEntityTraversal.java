package org.springframework.datastore.graph.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Michael Hunger
 * @since 15.09.2010
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GraphEntityTraversal {
    Class<? extends FieldTraversalDescriptionBuilder> traversalBuilder() default FieldTraversalDescriptionBuilder.class;
    Class<? extends NodeBacked> elementClass() default NodeBacked.class;
}
