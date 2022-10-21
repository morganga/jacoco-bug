package net.gcvs.jacoco;

public class App {

    public String concat(String a, String b) {
        if (a == null) return b;
        if (b == null) return a;
        return unsafeConcat(a, b);
    }

    private String unsafeConcat(String a, String b) {
        assert a != null;
        assert b != null;
        return a.concat(b);
    }
}
