package org.schorn.ella.app.config;

public interface IAppConfig {

    <T> T get(Class<T> classOfT, String name) throws Exception;
}
