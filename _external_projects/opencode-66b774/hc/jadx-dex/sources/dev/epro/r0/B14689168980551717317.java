package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class B14689168980551717317 {
    public static final dev.epro.r0.P5586796822028136504 a = new dev.epro.r0.P5586796822028136504(new byte[0], 0, 0, false);
    public static final int b;
    public static final java.util.concurrent.atomic.AtomicReference[] c;

    static {
        int iHighestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        java.util.concurrent.atomic.AtomicReference[] atomicReferenceArr = new java.util.concurrent.atomic.AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new java.util.concurrent.atomic.AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(dev.epro.r0.P5586796822028136504 p5586796822028136504) {
        p5586796822028136504.getClass();
        if (p5586796822028136504.f != null || p5586796822028136504.g != null) {
            dev.epro.r0.S10973172697741180971.j("Failed requirement.");
            return;
        }
        if (p5586796822028136504.d) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = c[(int) (java.lang.Thread.currentThread().getId() & (((long) b) - 1))];
        dev.epro.r0.P5586796822028136504 p55867968220281365042 = a;
        dev.epro.r0.P5586796822028136504 p55867968220281365043 = (dev.epro.r0.P5586796822028136504) atomicReference.getAndSet(p55867968220281365042);
        if (p55867968220281365043 == p55867968220281365042) {
            return;
        }
        int i = p55867968220281365043 != null ? p55867968220281365043.c : 0;
        if (i >= 65536) {
            atomicReference.set(p55867968220281365043);
            return;
        }
        p5586796822028136504.f = p55867968220281365043;
        p5586796822028136504.b = 0;
        p5586796822028136504.c = i + 8192;
        atomicReference.set(p5586796822028136504);
    }

    public static final dev.epro.r0.P5586796822028136504 b() {
        java.util.concurrent.atomic.AtomicReference atomicReference = c[(int) (java.lang.Thread.currentThread().getId() & (((long) b) - 1))];
        dev.epro.r0.P5586796822028136504 p5586796822028136504 = a;
        dev.epro.r0.P5586796822028136504 p55867968220281365042 = (dev.epro.r0.P5586796822028136504) atomicReference.getAndSet(p5586796822028136504);
        if (p55867968220281365042 == p5586796822028136504) {
            return new dev.epro.r0.P5586796822028136504();
        }
        if (p55867968220281365042 == null) {
            atomicReference.set(null);
            return new dev.epro.r0.P5586796822028136504();
        }
        atomicReference.set(p55867968220281365042.f);
        p55867968220281365042.f = null;
        p55867968220281365042.c = 0;
        return p55867968220281365042;
    }
}
