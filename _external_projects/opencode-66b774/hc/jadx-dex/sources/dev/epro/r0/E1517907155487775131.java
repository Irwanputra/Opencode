package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class E1517907155487775131 {
    public final long[] a;
    public final long[] b;
    public final long[] c;

    public E1517907155487775131() {
        dev.epro.r0.E1517907155487775131 e1517907155487775131 = dev.epro.r0.D15445857918358799638.d;
        this.a = java.util.Arrays.copyOf(e1517907155487775131.a, 10);
        this.b = java.util.Arrays.copyOf(e1517907155487775131.b, 10);
        this.c = java.util.Arrays.copyOf(e1517907155487775131.c, 10);
    }

    public final void a(dev.epro.r0.E1517907155487775131 e1517907155487775131, int i) {
        dev.epro.r0.M9216324016624295870.r(this.a, e1517907155487775131.a, i);
        dev.epro.r0.M9216324016624295870.r(this.b, e1517907155487775131.b, i);
        dev.epro.r0.M9216324016624295870.r(this.c, e1517907155487775131.c, i);
    }

    public void b(long[] jArr, long[] jArr2) {
        java.lang.System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public E1517907155487775131(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }
}
