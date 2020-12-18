package org.schorn.ella.app;

public interface ISearch {

    ISearchResponse search(SearchRequest searchRequest);
    IAsyncSearchResponse asyncSearch(AsyncSearchRequest asyncSearchRequest);
    IUploadResponse upload(UploadRequest uploadRequest);

    /**
     *
     */
    class SearchRequest implements IRequest {
        public static SearchRequest.Builder builder() {
            return new SearchRequest.Builder();
        }
        private SearchRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<SearchRequest> {

            @Override
            public SearchRequest build() {
                return new SearchRequest(this);
            }
        }
    }
    interface ISearchResponse extends IResponse.ISyncResponse {
    }

    /**
     *
     */
    class AsyncSearchRequest implements IRequest {
        public static AsyncSearchRequest.Builder builder() {
            return new AsyncSearchRequest.Builder();
        }
        private AsyncSearchRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<AsyncSearchRequest> {

            @Override
            public AsyncSearchRequest build() {
                return new AsyncSearchRequest(this);
            }
        }
    }
    interface IAsyncSearchResponse extends IResponse.IAsyncResponse {
    }

    /**
     *
     */
    class UploadRequest implements IRequest {
        public static UploadRequest.Builder builder() {
            return new UploadRequest.Builder();
        }
        private UploadRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<UploadRequest> {

            @Override
            public UploadRequest build() {
                return new UploadRequest(this);
            }
        }
    }
    interface IUploadResponse extends IResponse.ISyncResponse {
    }

    class Default implements ISearch {

        @Override
        public ISearchResponse search(SearchRequest searchRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IAsyncSearchResponse asyncSearch(AsyncSearchRequest asyncSearchRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IUploadResponse upload(UploadRequest uploadRequest) {
            throw new UnsupportedOperationException();

        }
    }
}
