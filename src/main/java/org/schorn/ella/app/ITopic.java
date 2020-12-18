package org.schorn.ella.app;

public interface ITopic {

    IPublishResponse publish(PublishRequest publishRequest);
    ISubscribeResponse subscribe(SubscribeRequest subscribeRequest);

    /**
     *
     */
    class PublishRequest implements IRequest {
        public static PublishRequest.Builder builder() {
            return new Builder();
        }
        private PublishRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<PublishRequest> {

            @Override
            public PublishRequest build() {
                return new PublishRequest(this);
            }
        }
    }
    interface IPublishResponse extends IResponse.ISyncResponse {
    }

    /**
     *
     */
    class SubscribeRequest implements IRequest {
        public static SubscribeRequest.Builder builder() {
            return new Builder();
        }
        private SubscribeRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<SubscribeRequest> {

            @Override
            public SubscribeRequest build() {
                return new SubscribeRequest(this);
            }
        }
    }
    interface ISubscribeResponse extends IResponse.IAsyncResponse {
    }

    /**
     *
     */
    class Default implements ITopic {

        @Override
        public IPublishResponse publish(PublishRequest publishRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public ISubscribeResponse subscribe(SubscribeRequest subscribeRequest) {
            throw new UnsupportedOperationException();
        }
    }
}
