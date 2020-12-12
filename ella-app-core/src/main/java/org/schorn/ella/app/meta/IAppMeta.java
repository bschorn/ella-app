package org.schorn.ella.app.meta;

import org.schorn.ella.app.identity.IAppIdentity;
import org.schorn.ella.app.key.IAppKey;

import java.time.OffsetDateTime;

public interface IAppMeta {
    OffsetDateTime getTimestamp();
    IAppKey getKey();
    IAppIdentity getIdentity();
}
