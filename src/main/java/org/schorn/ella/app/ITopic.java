package org.schorn.ella.app;

public interface ITopic {

    PublishResponse publish(PublishRequest publishRequest);
    SubscribeResponse subscribe(SubscribeRequest subscribeRequest);

    class PublishRequest implements IRequest {

    }
    class PublishResponse implements IResponse {

    }
    class SubscribeRequest implements IRequest {

    }
    class SubscribeResponse implements IResponse {

    }

    class Default implements ITopic {

        @Override
        public PublishResponse publish(PublishRequest publishRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public SubscribeResponse subscribe(SubscribeRequest subscribeRequest) {
            throw new UnsupportedOperationException();
        }
    }
}
