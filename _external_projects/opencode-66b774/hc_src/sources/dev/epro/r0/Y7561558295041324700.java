package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class Y7561558295041324700 implements Runnable, Comparable, U16840712152025914198 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public Y7561558295041324700(long j) {
        this.a = j;
    }

    @Override // dev.epro.r0.U16840712152025914198
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                D14731132657808549702 d14731132657808549702 = E12775674050813925581.k;
                if (obj == d14731132657808549702) {
                    return;
                }
                U2553720332627295302 u2553720332627295302 = obj instanceof U2553720332627295302 ? (U2553720332627295302) obj : null;
                if (u2553720332627295302 != null) {
                    synchronized (u2553720332627295302) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof Z2151278183136744531 ? (Z2151278183136744531) obj2 : null) != null) {
                            u2553720332627295302.c(this.b);
                        }
                    }
                }
                this._heap = d14731132657808549702;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, U2553720332627295302 u2553720332627295302, W9286035018771293936 w9286035018771293936) {
        synchronized (this) {
            if (this._heap == E12775674050813925581.k) {
                return 2;
            }
            synchronized (u2553720332627295302) {
                try {
                    Y7561558295041324700[] y7561558295041324700Arr = u2553720332627295302.a;
                    Y7561558295041324700 y7561558295041324700 = y7561558295041324700Arr != null ? y7561558295041324700Arr[0] : null;
                    int i = W9286035018771293936.j;
                    if (T5284056093300834442.a.getIntVolatile(w9286035018771293936, W9286035018771293936.h) != 0) {
                        return 1;
                    }
                    if (y7561558295041324700 == null) {
                        u2553720332627295302.c = j;
                    } else {
                        long j2 = y7561558295041324700.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = u2553720332627295302.c;
                        if (j - j3 > 0) {
                            u2553720332627295302.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.a - j < 0) {
                        this.a = j;
                    }
                    u2553720332627295302.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((Y7561558295041324700) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(U2553720332627295302 u2553720332627295302) {
        if (this._heap != E12775674050813925581.k) {
            this._heap = u2553720332627295302;
        } else {
            S10973172697741180971.j("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
