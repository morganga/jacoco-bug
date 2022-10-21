package net.gcvs.jacoco;

import org.junit.Test;

public class AppTest {

    App app = new App();

    @Test
    public void applyCoverage() {
        app.concat(null, null);
        app.concat("a", null);
        app.concat(null, "b");
        app.concat("a", "b");
    }
}
