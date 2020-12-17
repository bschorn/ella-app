package org.schorn.ella.app.ioc;

public class DependencyInjection implements IDependencyInjector {
    static private final IDependencyInjector INJECTOR = new IDependencyInjector.DefaultImpl();

    static public <T> T get(Class<T> classOfT, T dummy) {
        return INJECTOR.get(classOfT, dummy);
    }

}
