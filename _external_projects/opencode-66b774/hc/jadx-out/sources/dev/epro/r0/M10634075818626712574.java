package dev.epro.r0;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M10634075818626712574 {
    public static final Logger j;
    public static final M10634075818626712574 k;
    public final M9197813449740923653 a;
    public int b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public final ArrayList g;
    public final ArrayList h;
    public final U3594978070141619353 i;

    static {
        Logger logger = Logger.getLogger(M10634075818626712574.class.getName());
        logger.getClass();
        j = logger;
        k = new M10634075818626712574(new M9197813449740923653(new L5350362960623133222(G6547577305291411977.u(new StringBuilder(), C14766148968941961570.b, " TaskRunner"), true)));
    }

    public M10634075818626712574(M9197813449740923653 m9197813449740923653) {
        j.getClass();
        this.a = m9197813449740923653;
        this.b = 10000;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new U3594978070141619353((Object) this, (byte) 9);
    }

    public final void a(T6475866889761571877 t6475866889761571877, long j2, boolean z) {
        TimeZone timeZone = C14766148968941961570.a;
        Z9658010704151025794 z9658010704151025794 = t6475866889761571877.c;
        z9658010704151025794.getClass();
        if (z9658010704151025794.d != t6475866889761571877) {
            S10973172697741180971.m("Check failed.");
            return;
        }
        boolean z2 = z9658010704151025794.f;
        z9658010704151025794.f = false;
        z9658010704151025794.d = null;
        this.g.remove(z9658010704151025794);
        if (j2 != -1 && !z2 && !z9658010704151025794.c) {
            z9658010704151025794.d(t6475866889761571877, j2);
        }
        if (z9658010704151025794.e.isEmpty()) {
            return;
        }
        this.h.add(z9658010704151025794);
        if (z) {
            return;
        }
        e();
    }

    public final T6475866889761571877 b() {
        long j2;
        T6475866889761571877 t6475866889761571877;
        boolean z;
        TimeZone timeZone = C14766148968941961570.a;
        while (true) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i = 0;
            T6475866889761571877 t64758668897615718772 = null;
            while (true) {
                if (i >= size) {
                    j2 = jNanoTime;
                    t6475866889761571877 = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                T6475866889761571877 t64758668897615718773 = (T6475866889761571877) ((Z9658010704151025794) obj).e.get(0);
                j2 = jNanoTime;
                t6475866889761571877 = null;
                long jMax = Math.max(0L, t64758668897615718773.d - j2);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (t64758668897615718772 != null) {
                        z = true;
                        break;
                    }
                    t64758668897615718772 = t64758668897615718773;
                }
                jNanoTime = j2;
            }
            ArrayList arrayList2 = this.g;
            if (t64758668897615718772 != null) {
                TimeZone timeZone2 = C14766148968941961570.a;
                t64758668897615718772.d = -1L;
                Z9658010704151025794 z9658010704151025794 = t64758668897615718772.c;
                z9658010704151025794.getClass();
                z9658010704151025794.e.remove(t64758668897615718772);
                arrayList.remove(z9658010704151025794);
                z9658010704151025794.d = t64758668897615718772;
                arrayList2.add(z9658010704151025794);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    e();
                }
                return t64758668897615718772;
            }
            if (this.c) {
                if (jMin >= this.d - j2) {
                    return t6475866889761571877;
                }
                notify();
                return t6475866889761571877;
            }
            this.c = true;
            this.d = j2 + jMin;
            try {
                try {
                    TimeZone timeZone3 = C14766148968941961570.a;
                    if (jMin > 0) {
                        long j3 = jMin / 1000000;
                        long j4 = jMin - (1000000 * j3);
                        if (j3 > 0 || jMin > 0) {
                            wait(j3, (int) j4);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = C14766148968941961570.a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((Z9658010704151025794) arrayList2.get(size2)).a();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        Z9658010704151025794 z96580107041510257942 = (Z9658010704151025794) arrayList.get(size3);
                        z96580107041510257942.a();
                        if (z96580107041510257942.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.c = false;
            }
        }
    }

    public final void c(Z9658010704151025794 z9658010704151025794) {
        z9658010704151025794.getClass();
        TimeZone timeZone = C14766148968941961570.a;
        if (z9658010704151025794.d == null) {
            boolean zIsEmpty = z9658010704151025794.e.isEmpty();
            ArrayList arrayList = this.h;
            if (zIsEmpty) {
                arrayList.remove(z9658010704151025794);
            } else {
                byte[] bArr = L14928198200995638215.a;
                if (!arrayList.contains(z9658010704151025794)) {
                    arrayList.add(z9658010704151025794);
                }
            }
        }
        if (this.c) {
            notify();
        } else {
            e();
        }
    }

    public final Z9658010704151025794 d() {
        int i;
        synchronized (this) {
            i = this.b;
            this.b = i + 1;
        }
        return new Z9658010704151025794(this, G6547577305291411977.n(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = C14766148968941961570.a;
        int i = this.e;
        if (i > this.f) {
            return;
        }
        this.e = i + 1;
        ((ThreadPoolExecutor) this.a.b).execute(this.i);
    }
}
