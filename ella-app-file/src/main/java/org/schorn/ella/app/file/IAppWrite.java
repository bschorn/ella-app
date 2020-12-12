package org.schorn.ella.app.file;

import org.schorn.ella.app.access.IAppAccess;
import org.schorn.ella.app.key.IAppKey;
import org.schorn.ella.app.receipt.IAppReceipt;

import java.net.URI;

public interface IAppWrite<T> {

    IAppAccess getAccess(IAppKey key);

    IAppReceipt write(URI uri, T t);
    IAppReceipt write(IAppKey key, T t);
}
