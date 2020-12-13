package org.schorn.ella.app.data;

import org.schorn.ella.app.key.IAppKey;
import org.schorn.ella.app.meta.IAppMeta;

public interface IAppData<K extends IAppKey,V,M extends IAppMeta> {
    K key();
    V read();
    M meta();

    interface Builder<K extends IAppKey,V,M extends IAppMeta> extends IAppData<K,V,M> {
        Builder withKey(K key);
        Builder withMeta(M meta);

    }
}
