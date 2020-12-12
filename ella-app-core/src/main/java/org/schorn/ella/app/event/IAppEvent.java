package org.schorn.ella.app.event;

public interface IAppEvent {
    EventSpecies species();
    EventIntent intent();
    EventChannel channel();
}
