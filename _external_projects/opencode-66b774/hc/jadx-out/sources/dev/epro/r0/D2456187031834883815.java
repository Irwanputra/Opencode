package dev.epro.r0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D2456187031834883815 {
    public final Q7316561721656982910 a;
    public final long[] b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D2456187031834883815(byte b) {
        this(new Q7316561721656982910((byte) 19), new long[10]);
        switch (b) {
            case 1:
                break;
            default:
                D2456187031834883815 d2456187031834883815 = D15445857918358799638.e;
                this.a = new Q7316561721656982910(d2456187031834883815.a);
                this.b = Arrays.copyOf(d2456187031834883815.b, 10);
                break;
        }
    }

    public static void a(D2456187031834883815 d2456187031834883815, D2456187031834883815 d24561870318348838152) {
        Q7316561721656982910 q7316561721656982910 = d2456187031834883815.a;
        long[] jArr = (long[]) q7316561721656982910.b;
        Q7316561721656982910 q73165617216569829102 = d24561870318348838152.a;
        long[] jArr2 = (long[]) q73165617216569829102.b;
        long[] jArr3 = d24561870318348838152.b;
        O4077903568229246.E(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) q7316561721656982910.c;
        long[] jArr5 = (long[]) q73165617216569829102.c;
        long[] jArr6 = (long[]) q73165617216569829102.d;
        O4077903568229246.E(jArr4, jArr5, jArr6);
        O4077903568229246.E((long[]) q7316561721656982910.d, jArr6, jArr3);
        O4077903568229246.E(d2456187031834883815.b, (long[]) q73165617216569829102.b, jArr5);
    }

    public D2456187031834883815(D2456187031834883815 d2456187031834883815) {
        this((byte) 1);
        a(this, d2456187031834883815);
    }

    public /* synthetic */ D2456187031834883815(Q7316561721656982910 q7316561721656982910, long[] jArr) {
        this.a = q7316561721656982910;
        this.b = jArr;
    }
}
