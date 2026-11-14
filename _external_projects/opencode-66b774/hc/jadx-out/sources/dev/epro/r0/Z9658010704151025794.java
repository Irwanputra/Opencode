package dev.epro.r0;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z9658010704151025794 {
    public final M10634075818626712574 a;
    public final String b;
    public boolean c;
    public T6475866889761571877 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public Z9658010704151025794(M10634075818626712574 m10634075818626712574, String str) {
        this.a = m10634075818626712574;
        this.b = str;
    }

    public static void b(Z9658010704151025794 z9658010704151025794, String str, B13729205492206812220 b13729205492206812220) {
        z9658010704151025794.getClass();
        str.getClass();
        b13729205492206812220.getClass();
        z9658010704151025794.c(new E17483539623558463245(str, b13729205492206812220), 0L);
    }

    public final boolean a() {
        T6475866889761571877 t6475866889761571877 = this.d;
        if (t6475866889761571877 != null && t6475866889761571877.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((T6475866889761571877) arrayList.get(size)).b) {
                Level level = Level.FINE;
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(T6475866889761571877 t6475866889761571877, long j) {
        t6475866889761571877.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(t6475866889761571877, j)) {
                    this.a.c(this);
                }
            } else if (t6475866889761571877.b) {
                Level level = Level.FINE;
            } else {
                Level level2 = Level.FINE;
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(T6475866889761571877 t6475866889761571877, long j) {
        t6475866889761571877.getClass();
        Z9658010704151025794 z9658010704151025794 = t6475866889761571877.c;
        if (z9658010704151025794 != this) {
            if (z9658010704151025794 != null) {
                S10973172697741180971.m("task is in multiple queues");
                return false;
            }
            t6475866889761571877.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(t6475866889761571877);
        if (iIndexOf != -1) {
            if (t6475866889761571877.d <= j2) {
                Level level = Level.FINE;
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        t6475866889761571877.d = j2;
        Level level2 = Level.FINE;
        int size = arrayList.size();
        int size2 = 0;
        int i = 0;
        while (true) {
            if (i >= size) {
                size2 = -1;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            if (((T6475866889761571877) obj).d - jNanoTime > j) {
                break;
            }
            size2++;
        }
        if (size2 == -1) {
            size2 = arrayList.size();
        }
        arrayList.add(size2, t6475866889761571877);
        return size2 == 0;
    }

    public final void e() {
        M10634075818626712574 m10634075818626712574 = this.a;
        TimeZone timeZone = C14766148968941961570.a;
        synchronized (m10634075818626712574) {
            this.c = true;
            if (a()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
