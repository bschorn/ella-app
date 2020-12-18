package org.schorn.ella.app;

public interface IDBMS {

    QueryResponse query(QueryRequest queryRequest);
    PersistResponse persist(PersistRequest persistRequest);

    class QueryRequest implements IRequest {
        
    }
    class QueryResponse implements IResponse {
        
    }
    class PersistRequest implements IRequest {
        
    }
    class PersistResponse implements IResponse {
        
    }

    class Default implements IDBMS {

        @Override
        public QueryResponse query(QueryRequest queryRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public PersistResponse persist(PersistRequest persistRequest) {
            throw new UnsupportedOperationException();
        }
    }

}
