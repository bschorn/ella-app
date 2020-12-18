package org.schorn.ella.app;

public interface ICache {

    ICache.GetResponse get(ICache.GetRequest getRequest);
    ICache.SetResponse set(ICache.SetRequest setRequest);

    class GetRequest implements IRequest {

    }
    class GetResponse implements IResponse {

    }
    class SetRequest implements IRequest {

    }
    class SetResponse implements IResponse {

    }

    class Default implements ICache {

        @Override
        public GetResponse get(GetRequest getRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public SetResponse set(SetRequest setRequest) {
            throw new UnsupportedOperationException();
        }
    }
}
