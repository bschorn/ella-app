package org.schorn.ella.app;

public interface ICommitLog {

    TailResponse tail(TailRequest tailRequest);
    AppendResponse append(AppendRequest appendRequest);

    class TailRequest implements IRequest {

    }
    class TailResponse implements IResponse {

    }
    class AppendRequest implements IRequest {

    }
    class AppendResponse implements IResponse {

    }

    class Default implements ICommitLog {

        @Override
        public TailResponse tail(TailRequest tailRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public AppendResponse append(AppendRequest appendRequest) {
            throw new UnsupportedOperationException();
        }
    }
}
