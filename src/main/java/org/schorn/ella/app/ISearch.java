package org.schorn.ella.app;

public interface ISearch {

    SearchResponse search(SearchRequest searchRequest);
    UploadResponse upload(UploadRequest uploadRequest);

    class SearchRequest implements IRequest {

    }
    class SearchResponse implements IResponse {

    }
    class UploadRequest implements IRequest {

    }
    class UploadResponse implements IResponse {

    }

    class Default implements ISearch {

        @Override
        public SearchResponse search(SearchRequest searchRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public UploadResponse upload(UploadRequest uploadRequest) {
            throw new UnsupportedOperationException();

        }
    }
}
