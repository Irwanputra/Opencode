package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E17483539623558463245 extends dev.epro.r0.T6475866889761571877 {
    public final /* synthetic */ byte e = 0;
    public final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E17483539623558463245(dev.epro.r0.J9884070742191057945 j9884070742191057945, java.lang.String str) {
        super(str, true);
        this.f = j9884070742191057945;
    }

    public final long a() {
        switch (this.e) {
            case 0:
                dev.epro.r0.J9884070742191057945 j9884070742191057945 = (dev.epro.r0.J9884070742191057945) this.f;
                long jNanoTime = java.lang.System.nanoTime();
                long j = (jNanoTime - j9884070742191057945.b) + 1;
                java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedQueue) j9884070742191057945.e).iterator();
                it.getClass();
                dev.epro.r0.H3726261569308128079 h3726261569308128079 = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                dev.epro.r0.H3726261569308128079 h37262615693081280792 = null;
                dev.epro.r0.H3726261569308128079 h37262615693081280793 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    dev.epro.r0.H3726261569308128079 h37262615693081280794 = (dev.epro.r0.H3726261569308128079) it.next();
                    h37262615693081280794.getClass();
                    synchronized (h37262615693081280794) {
                        if (j9884070742191057945.a(h37262615693081280794, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = h37262615693081280794.q;
                            if (j3 < j) {
                                j = j3;
                                h37262615693081280792 = h37262615693081280794;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                h37262615693081280793 = h37262615693081280794;
                            }
                        }
                    }
                }
                if (h37262615693081280792 != null) {
                    h3726261569308128079 = h37262615693081280792;
                } else if (i > j9884070742191057945.a) {
                    j = j2;
                    h3726261569308128079 = h37262615693081280793;
                } else {
                    j = -1;
                }
                if (h3726261569308128079 == null) {
                    if (h37262615693081280793 != null) {
                        return (j2 + j9884070742191057945.b) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return j9884070742191057945.b;
                    }
                    return -1L;
                }
                synchronized (h3726261569308128079) {
                    if (h3726261569308128079.p.isEmpty() && h3726261569308128079.q == j) {
                        h3726261569308128079.j = true;
                        ((java.util.concurrent.ConcurrentLinkedQueue) j9884070742191057945.e).remove(h3726261569308128079);
                        dev.epro.r0.C14766148968941961570.c(h3726261569308128079.e);
                        if (!((java.util.concurrent.ConcurrentLinkedQueue) j9884070742191057945.e).isEmpty()) {
                            return 0L;
                        }
                        dev.epro.r0.Z9658010704151025794 z9658010704151025794 = (dev.epro.r0.Z9658010704151025794) j9884070742191057945.c;
                        synchronized (z9658010704151025794.a) {
                            if (z9658010704151025794.a()) {
                                z9658010704151025794.a.c(z9658010704151025794);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((dev.epro.r0.B13729205492206812220) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E17483539623558463245(java.lang.String str, dev.epro.r0.B13729205492206812220 b13729205492206812220) {
        super(str, true);
        this.f = b13729205492206812220;
    }
}
