package org.schorn.ella.app;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.function.Supplier;

public interface IFile {

    enum Format {
        BYTE_ARRAY, // byte[]
        CHAR_ARRAY, // char[]
        STRING, // String
        LINE_LIST, // List<String>
        LINE_ITERATOR, // Iterator<String>
        LINE_STREAM; // Stream<String>
    }

    IReadResponse read(ReadRequest readRequest);
    IAsyncReadResponse asyncRead(ReadRequest readRequest);
    IWriteResponse write(WriteRequest writeRequest);
    IAsyncWriteResponse asyncWrite(WriteRequest writeRequest);

    /**
     *
     */
    class ReadRequest implements IRequest {
        public static ReadRequest.Builder builder() {
            return new ReadRequest.Builder();
        }
        private final Path path;
        private final Charset cs;
        private final Format format;
        private ReadRequest(Builder builder) {
            this.path = builder.path;
            this.cs = builder.cs;
            this.format = builder.format;
        }

        public Path getPath() {
            return this.path;
        }
        public Charset getCharset() {
            return this.cs;
        }
        public Format getFormat() {
            return this.format;
        }

        /**
         *
         */
        static class Builder implements IRequestBuilder<ReadRequest> {
            Path path;
            Charset cs;
            Format format;
            Builder what(Path path) {
                this.path = path;
                return this;
            }
            Builder with(Charset cs) {
                this.cs = cs;
                return this;
            }
            Builder how(Format format) {
                this.format = format;
                return this;
            }
            @Override
            public ReadRequest build() {
                return new ReadRequest(this);
            }
        }
    }
    interface IReadResponse<T> extends IResponse.ISyncResponse, Supplier<T> {
    }
    interface IAsyncReadResponse<T> extends IResponse.IAsyncResponse {
        Supplier<T> getSupplier();
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
    interface IAsyncWriteResponse extends IResponse.IAsyncResponse {
    }

    /**
     *
     */
    class Default implements IFile {

        @Override
        public IReadResponse read(ReadRequest request) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IAsyncReadResponse asyncRead(ReadRequest request) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IWriteResponse write(WriteRequest writeRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IAsyncWriteResponse asyncWrite(WriteRequest writeRequest) {
            throw new UnsupportedOperationException();
        }
    }
}
