package org.schorn.ella.app;

public interface ICommitLog {

    ITailResponse tail(TailRequest tailRequest);
    IAsyncTailResponse asyncTail(AsyncTailRequest tailRequest);
    IAppendResponse append(AppendRequest appendRequest);

    /**
     *
     */
    class TailRequest implements IRequest {
        public static TailRequest.Builder builder() {
            return new TailRequest.Builder();
        }
        private TailRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<TailRequest> {
            @Override
            public TailRequest build() {
                return new TailRequest(this);
            }
        }
    }
    interface ITailResponse extends IResponse.ISyncResponse {
    }

    /**
     *
     */
    class AsyncTailRequest implements IRequest {
        public static AsyncTailRequest.Builder builder() {
            return new AsyncTailRequest.Builder();
        }
        private AsyncTailRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<AsyncTailRequest> {
            @Override
            public AsyncTailRequest build() {
                return new AsyncTailRequest(this);
            }
        }
    }
    interface IAsyncTailResponse extends IResponse.IAsyncResponse {
    }

    /**
     *
     */
    class AppendRequest implements IRequest {
        public static AppendRequest.Builder builder() {
            return new AppendRequest.Builder();
        }
        private AppendRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<AppendRequest> {
            @Override
            public AppendRequest build() {
                return new AppendRequest(this);
            }
        }
    }
    interface IAppendResponse extends IResponse.ISyncResponse {
    }

    /**
     *
     */
    class Default implements ICommitLog {

        @Override
        public ITailResponse tail(TailRequest tailRequest) {
            throw new UnsupportedOperationException();
        }
        @Override
        public IAsyncTailResponse asyncTail(AsyncTailRequest tailRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IAppendResponse append(AppendRequest appendRequest) {
            throw new UnsupportedOperationException();
        }
    }
}
