package org.schorn.ella.app;

public interface IService {

    ServiceResponse service(ServiceRequest serviceRequest);


    class ServiceRequest implements IRequest {

    }
    class ServiceResponse implements IResponse {

    }

    class Default implements IService {

        @Override
        public ServiceResponse service(ServiceRequest serviceRequest) {
            throw new UnsupportedOperationException();
        }
    }
}
