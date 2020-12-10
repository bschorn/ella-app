package org.schorn.ella.app.persist;


import org.schorn.ella.app.data.IAppData;
import org.schorn.ella.app.receipt.IAppReceipt;

public interface IAppPersist {

    IAppReceipt save(IAppData appData);
}
