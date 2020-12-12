package org.schorn.ella.app.data;

import org.schorn.ella.app.construct.IStream;

public interface IAppDataStream<E extends IAppData> extends IAppData, IStream<E> {
}
