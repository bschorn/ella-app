package org.schorn.ella.app.event;

public enum EventSpecies {
    VOLATILE, // best fit channel: Pub/Sub
    REPLAYABLE, // best fit channel: CommitLog
    DURABLE; // best fit channel: Queue
}
