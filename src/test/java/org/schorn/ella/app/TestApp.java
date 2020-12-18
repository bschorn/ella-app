package org.schorn.ella.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestApp {
    static private final Logger LGR = LoggerFactory.getLogger(TestApp.class);

    static void main(String[] args) {
        try {
            new TestApp().test();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void test() {

    }
}
