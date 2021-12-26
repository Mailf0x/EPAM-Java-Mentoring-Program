package com.epam;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RunnerTest {
    boolean a;
    boolean b;
    char c;
    char d;
    byte e;
    byte f;
    short g;
    short h;
    int i;
    int j;
    long k;
    long l;
    float m;
    float n;
    double o;
    double p;

    @Test
    public void method() {
        assertEquals(a, b);
        assertEquals(c, d);
        assertEquals(e, f);
        assertEquals(g, h);
        assertEquals(i, j);
        assertEquals(k, l);
        assertEquals(m, n, 0.001f);
        assertEquals(o, p, 0.001);
    }
}
