package dev.epro.r0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class E1517907155487775131 {
    public final long[] a;
    public final long[] b;
    public final long[] c;

    public E1517907155487775131() {
        E1517907155487775131 e1517907155487775131 = D15445857918358799638.d;
        this.a = Arrays.copyOf(e1517907155487775131.a, 10);
        this.b = Arrays.copyOf(e1517907155487775131.b, 10);
        this.c = Arrays.copyOf(e1517907155487775131.c, 10);
    }

    public final void a(E1517907155487775131 e1517907155487775131, int i) {
        M9216324016624295870.r(this.a, e1517907155487775131.a, i);
        M9216324016624295870.r(this.b, e1517907155487775131.b, i);
        M9216324016624295870.r(this.c, e1517907155487775131.c, i);
    }

    public void b(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public E1517907155487775131(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }
}
