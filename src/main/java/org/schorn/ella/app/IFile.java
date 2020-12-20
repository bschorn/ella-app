 package org.schorn.ella.app;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface IFile {

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
        private ReadRequest(Builder builder) {
            this.path = builder.path;
            this.cs = builder.cs;
        }

        public Path getPath() {
            return this.path;
        }
        public Charset getCharset() {
            return this.cs;
        }

        /**
         *
         */
        static public class Builder implements IRequestBuilder<ReadRequest> {
            Path path;
            Charset cs;
            public Builder what(Path path) {
                this.path = path;
                return this;
            }
            public Builder with(Charset cs) {
                this.cs = cs;
                return this;
            }
            @Override
            public ReadRequest build() {
                return new ReadRequest(this);
            }
        }
    }
    interface IReadResponse extends IResponse.ISyncResponse {
        byte[] toByteArray();
        List<String> asList();
    }
    interface IAsyncReadResponse extends IResponse.IAsyncResponse {
        Supplier<String> supplier();
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
