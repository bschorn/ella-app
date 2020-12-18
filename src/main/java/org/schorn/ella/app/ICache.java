package org.schorn.ella.app;

public interface ICache {

    IGetResponse get(GetRequest getRequest);
    IAsyncGetResponse asyncGet(AsyncGetRequest getRequest);
    ISetResponse set(SetRequest setRequest);
    IAsyncSetResponse asyncSet(AsyncSetRequest setRequest);

    /**
     *
     */
    class GetRequest implements IRequest {
        public static Builder builder() { return new Builder(); }
        private GetRequest(Builder builder) {
        }
        static class Builder implements IRequestBuilder<GetRequest> {
            @Override
            public GetRequest build() {
                return new GetRequest(this);
            }
        }
    }
    interface IGetResponse extends IResponse.ISyncResponse {
    }

    /**
     *
     */
    class AsyncGetRequest implements IRequest {
        public static AsyncGetRequest.Builder builder() { return new AsyncGetRequest.Builder(); }
        private AsyncGetRequest(Builder builder) {
        }
        static class Builder implements IRequestBuilder<AsyncGetRequest> {
            @Override
            public AsyncGetRequest build() {
                return new AsyncGetRequest(this);
            }
        }
    }
    interface IAsyncGetResponse extends IResponse.IAsyncResponse {
    }

    /**
     *
     */
    class SetRequest implements IRequest {
        public static SetRequest.Builder builder() { return new SetRequest.Builder(); }
        private SetRequest(Builder builder) {

        }

        static class Builder implements IRequestBuilder<SetRequest> {
            @Override
            public SetRequest build() {
                return new SetRequest(this);
            }
        }
    }
    interface ISetResponse extends IResponse.ISyncResponse {
    }

    /**
     *
     */
    class AsyncSetRequest implements IRequest {
        public static AsyncSetRequest.Builder builder() { return new AsyncSetRequest.Builder(); }
        private AsyncSetRequest(Builder builder) {

        }

        static class Builder implements IRequestBuilder<AsyncSetRequest> {
            @Override
            public AsyncSetRequest build() {
                return new AsyncSetRequest(this);
            }
        }
    }
    interface IAsyncSetResponse extends IResponse.IAsyncResponse {
    }

    /**
     *
     */
    class Default implements ICache {
        @Override
        public IGetResponse get(GetRequest getRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IAsyncGetResponse asyncGet(AsyncGetRequest getRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public ISetResponse set(SetRequest setRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IAsyncSetResponse asyncSet(AsyncSetRequest setRequest) {
            throw new UnsupportedOperationException();
        }
    }
}
