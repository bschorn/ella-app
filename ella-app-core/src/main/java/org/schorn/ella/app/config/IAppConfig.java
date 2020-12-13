package org.schorn.ella.app.config;

import java.util.Optional;

public interface IAppConfig {

    Optional<Object> getObject(String name);
    Optional<String> getString(String name);
    <T> Optional<T> get(Class<T> classOfT, String name);

    <T> boolean isInstance(Class<T> classOfT, String name);

    interface Mutable extends IAppConfig {
        Object set(String name, Object value);
    }
}
