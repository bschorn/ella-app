package org.schorn.ella.app.topic.publish;

import org.schorn.ella.app.topic.IAppTopic;


public interface IAppPublish {


    String publish(IAppTopic topic, byte[] bytes);


    /**
     *
     */
    IAppPublish DUMMY = new DummyImpl();
    /**
     *
     */
    class DummyImpl implements IAppPublish {

        @Override
        public String publish(IAppTopic topic, byte[] bytes) {
            throw new UnsupportedOperationException();
        }
    }
}
