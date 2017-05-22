package org.neowu.gae;

/**
 * Created by neowu on 5/22/17.
 */
public class AClass {
    Integer x;
    Integer y;

    AClass(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public Integer add() {
        return x + y;
    }
}
