package org.schorn.ella.app;

import java.util.Optional;

public interface IResponse {

    Optional<Exception> getException();

    interface ISyncResponse extends IResponse {

    }
    interface IAsyncResponse extends IResponse {

    }
}
