package org.schorn.ella.app.cache;

import org.schorn.ella.app.data.IAppData;
import org.schorn.ella.app.key.IAppKey;
import org.schorn.ella.app.receipt.IAppReceipt;

public interface IAppCache {

    IAppData get(IAppKey appKey);
    IAppReceipt set(IAppKey appKey, IAppReceipt appReceipt);
}
