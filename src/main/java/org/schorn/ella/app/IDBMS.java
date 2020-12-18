package org.schorn.ella.app;

public interface IDBMS {

    IQueryResponse query(QueryRequest queryRequest);
    IAsyncQueryResponse asyncQuery(AsyncQueryRequest queryRequest);
    IPersistResponse persist(PersistRequest persistRequest);
    IAsyncPersistResponse asyncPersist(AsyncPersistRequest persistRequest);

    /**
     *
     */
    class QueryRequest implements IRequest {
        public static QueryRequest.Builder builder() {
            return new QueryRequest.Builder();
        }
        private QueryRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<QueryRequest> {

            @Override
            public QueryRequest build() {
                return new QueryRequest(this);
            }
        }
    }
    interface IQueryResponse extends IResponse.ISyncResponse {
    }

    /**
     *
     */
    class AsyncQueryRequest implements IRequest {
        public static AsyncQueryRequest.Builder builder() {
            return new AsyncQueryRequest.Builder();
        }
        private AsyncQueryRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<AsyncQueryRequest> {

            @Override
            public AsyncQueryRequest build() {
                return new AsyncQueryRequest(this);
            }
        }
    }
    interface IAsyncQueryResponse extends IResponse.IAsyncResponse {
    }

    /**
     *
     */
    class PersistRequest implements IRequest {
        public static PersistRequest.Builder builder() {
            return new PersistRequest.Builder();
        }
        private PersistRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<PersistRequest> {

            @Override
            public PersistRequest build() {
                return new PersistRequest(this);
            }
        }
    }
    interface IPersistResponse extends IResponse.ISyncResponse {
    }

    /**
     *
     */
    class AsyncPersistRequest implements IRequest {
        public static AsyncPersistRequest.Builder builder() {
            return new AsyncPersistRequest.Builder();
        }
        private AsyncPersistRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<AsyncPersistRequest> {

            @Override
            public AsyncPersistRequest build() {
                return new AsyncPersistRequest(this);
            }
        }
    }
    interface IAsyncPersistResponse extends IResponse.IAsyncResponse {
    }

    /**
     *
     */
    class Default implements IDBMS {

        @Override
        public IQueryResponse query(QueryRequest queryRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IAsyncQueryResponse asyncQuery(AsyncQueryRequest queryRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IPersistResponse persist(PersistRequest persistRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IAsyncPersistResponse asyncPersist(AsyncPersistRequest persistRequest) {
            throw new UnsupportedOperationException();
        }
    }

}
