package org.schorn.ella.app.topic;

import org.schorn.ella.app.ioc.DependencyInjection;

public class AppTopics {
    private static final IAppTopics TOPICS;

    public AppTopics() {
    }

    public static IAppTopic getTopic(String topicName) {
        return TOPICS.getTopic(topicName);
    }

    static {
        TOPICS = (IAppTopics)DependencyInjection.get(IAppTopics.class, IAppTopics.DUMMY);
    }

}
