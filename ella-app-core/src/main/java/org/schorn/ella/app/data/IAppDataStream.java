package org.schorn.ella.app.data;

import org.schorn.ella.app.construct.IStream;
import org.schorn.ella.app.key.IAppKey;
import org.schorn.ella.app.meta.IAppMeta;

public interface IAppDataStream<K extends IAppKey,V,M extends IAppMeta,E> extends IAppData<K,V,M>, IStream<E> {
}
