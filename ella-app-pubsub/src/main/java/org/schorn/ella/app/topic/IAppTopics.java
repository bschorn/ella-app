package org.schorn.ella.app.topic;


public interface IAppTopics {


    IAppTopic getTopic(String topicName);

    /**
     *
     */
    IAppTopics DUMMY = new IAppTopics.DummyImpl();
    /**
     *
     */
    class DummyImpl implements IAppTopics {

        @Override
        public IAppTopic getTopic(String topicName) {
            throw new UnsupportedOperationException();
        }
    }

}
