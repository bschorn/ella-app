package org.schorn.ella.app.topic.publish;

import org.schorn.ella.app.ioc.DependencyInjection;
import org.schorn.ella.app.topic.IAppTopic;

/**
 *
 */
public class AppPublish {

    static private final IAppPublish PUBLISH = DependencyInjection.get(IAppPublish.class, IAppPublish.DUMMY);

    static public String publish(IAppTopic topic, byte[] bytes) {
        return PUBLISH.publish(topic, bytes);
    }

}
