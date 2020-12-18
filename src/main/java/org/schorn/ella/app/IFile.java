package org.schorn.ella.app;

public interface IFile {

    IFile.ReadResponse read(IFile.ReadRequest fileReadRequest);
    IFile.WriteResponse write(IFile.WriteRequest writeRequest);


    class ReadRequest implements IRequest {

    }
    class ReadResponse implements IResponse {

    }
    class WriteRequest implements IRequest {

    }
    class WriteResponse implements IResponse {

    }

    class Default implements IFile {

        @Override
        public ReadResponse read(ReadRequest fileReadRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public WriteResponse write(WriteRequest writeRequest) {
            throw new UnsupportedOperationException();
        }
    }
}
