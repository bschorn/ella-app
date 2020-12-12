package org.schorn.ella.app.file;

import org.schorn.ella.app.access.IAppAccess;
import org.schorn.ella.app.data.IAppData;
import org.schorn.ella.app.identity.IAppIdentity;
import org.schorn.ella.app.key.IAppKey;


import java.net.URI;

public interface IAppRead {
    IAppAccess checkAccess(IAppIdentity identity, IAppKey key);

    IAppData read(URI uri);
    IAppData read(IAppKey key);
}
