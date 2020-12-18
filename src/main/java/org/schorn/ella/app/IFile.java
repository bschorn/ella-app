package org.schorn.ella.app;

public interface IFile {

    IReadResponse read(ReadRequest readRequest);
    IAsyncReadResponse asyncRead(AsyncReadRequest asyncReadRequest);
    IWriteResponse write(WriteRequest writeRequest);

    /**
     *
     */
    class ReadRequest implements IRequest {
        public static ReadRequest.Builder builder() {
            return new ReadRequest.Builder();
        }
        private ReadRequest(Builder builder) {

        }

        static class Builder implements IRequestBuilder<ReadRequest> {
            @Override
            public ReadRequest build() {
                return new ReadRequest(this);
            }
        }
    }
    interface IReadResponse extends IResponse.ISyncResponse {
    }

    /**
     *
     */
    class AsyncReadRequest implements IRequest {
        public static AsyncReadRequest.Builder builder() {
            return new AsyncReadRequest.Builder();
        }
        private AsyncReadRequest(Builder builder) {

        }

        static class Builder implements IRequestBuilder<AsyncReadRequest> {
            @Override
            public AsyncReadRequest build() {
                return new AsyncReadRequest(this);
            }
        }
    }
    interface IAsyncReadResponse extends IResponse.IAsyncResponse {
    }

    /**
     *
     */
    class WriteRequest implements IRequest {
        public static WriteRequest.Builder builder() {
            return new WriteRequest.Builder();
        }
        private WriteRequest(Builder builder) {

        }

        static class Builder implements IRequestBuilder<WriteRequest> {
            @Override
            public WriteRequest build() {
                return new WriteRequest(this);
            }
        }
    }
    interface IWriteResponse extends IResponse.ISyncResponse {
    }

    /**
     *
     */
    class Default implements IFile {

        @Override
        public IReadResponse read(ReadRequest fileReadRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IAsyncReadResponse asyncRead(AsyncReadRequest asyncReadRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IWriteResponse write(WriteRequest writeRequest) {
            throw new UnsupportedOperationException();
        }
    }
}
