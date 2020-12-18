package org.schorn.ella.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Injector {
    static private final Logger LGR = LoggerFactory.getLogger(Injector.class);
    static public <T> T get(Class<T> classOfT, T dummy) {
        try {
            String className = System.getenv(classOfT.getName());
            className = className == null ? System.getProperty(classOfT.getName()) : className;
            if (className == null) {
                throw new Exception(String.format("Unable to find an implementation for '%s'",
                        classOfT.getName()));
            }
            Class<?> implClass = Class.forName(className);
            Object object = implClass.getConstructor().newInstance();
            if (!classOfT.isInstance(object)) {
                throw new Exception(String.format("Defined implementation class is not of type '%s'",
                        classOfT.getName()));
            }
            return (T) object;
        } catch (Exception ex) {
            LGR.error(String.format("Unable to create an instance of '%s' for injection. Exception: %s",
                    classOfT.getName(),
                    ex.getMessage()));
        }
        return dummy;
    }
}
