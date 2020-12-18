package org.schorn.ella.app;

public interface IService {

    IServiceResponse service(ServiceRequest serviceRequest);
    IAsyncServiceResponse asyncService(AsyncServiceRequest serviceRequest);

    /**
     *
     */
    class ServiceRequest implements IRequest {
        public static ServiceRequest.Builder builder() {
            return new ServiceRequest.Builder();
        }
        private ServiceRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<ServiceRequest> {

            @Override
            public ServiceRequest build() {
                return new ServiceRequest(this);
            }
        }
    }
    interface IServiceResponse extends IResponse.ISyncResponse {
    }

    /**
     *
     */
    class AsyncServiceRequest implements IRequest {
        public static AsyncServiceRequest.Builder builder() {
            return new AsyncServiceRequest.Builder();
        }
        private AsyncServiceRequest(Builder builder) {

        }
        static class Builder implements IRequestBuilder<AsyncServiceRequest> {

            @Override
            public AsyncServiceRequest build() {
                return new AsyncServiceRequest(this);
            }
        }
    }
    interface IAsyncServiceResponse extends IResponse.IAsyncResponse {
    }

    /**
     *
     */
    class Default implements IService {

        @Override
        public IServiceResponse service(ServiceRequest serviceRequest) {
            throw new UnsupportedOperationException();
        }

        @Override
        public IAsyncServiceResponse asyncService(AsyncServiceRequest serviceRequest) {
            throw new UnsupportedOperationException();
        }
    }
}
