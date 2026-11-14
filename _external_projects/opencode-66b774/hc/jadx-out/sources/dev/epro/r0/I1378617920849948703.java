package dev.epro.r0;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class I1378617920849948703 {
    public static final Object k = new Object();
    public final Object a;
    public final K1186241071261229227 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final U3594978070141619353 j;

    public I1378617920849948703(int i) {
        C14236750621317601303 c14236750621317601303 = A6532439337653820803.b;
        this.a = new Object();
        this.b = new K1186241071261229227();
        this.c = 0;
        this.f = k;
        this.j = new U3594978070141619353((Object) this, (byte) 7);
        this.e = c14236750621317601303;
        this.g = 0;
    }

    public static void a(String str) {
        I6631487105893062076.t().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        S10973172697741180971.m(G6547577305291411977.s("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(W16122746836868022518 w16122746836868022518) {
        if (w16122746836868022518.b) {
            int i = w16122746836868022518.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            w16122746836868022518.c = i2;
            F6942723054099263096 f6942723054099263096 = w16122746836868022518.a;
            Object obj = this.e;
            f6942723054099263096.getClass();
            I4293432593871965076 i4293432593871965076 = (I4293432593871965076) obj;
            U12005525216752176281 u12005525216752176281 = (U12005525216752176281) f6942723054099263096.b;
            if (i4293432593871965076 == null || !u12005525216752176281.X) {
                return;
            }
            throw new IllegalStateException("Fragment " + u12005525216752176281 + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    public final void c(W16122746836868022518 w16122746836868022518) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (w16122746836868022518 != null) {
                b(w16122746836868022518);
                w16122746836868022518 = null;
            } else {
                K1186241071261229227 k1186241071261229227 = this.b;
                k1186241071261229227.getClass();
                U2952894598036618109 u2952894598036618109 = new U2952894598036618109(k1186241071261229227);
                k1186241071261229227.c.put(u2952894598036618109, Boolean.FALSE);
                while (u2952894598036618109.hasNext()) {
                    b((W16122746836868022518) ((Map.Entry) u2952894598036618109.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            I6631487105893062076 i6631487105893062076T = I6631487105893062076.t();
            U3594978070141619353 u3594978070141619353 = this.j;
            J7273067030976909159 j7273067030976909159 = i6631487105893062076T.c;
            if (j7273067030976909159.e == null) {
                synchronized (j7273067030976909159.c) {
                    try {
                        if (j7273067030976909159.e == null) {
                            j7273067030976909159.e = J7273067030976909159.t(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            j7273067030976909159.e.post(u3594978070141619353);
        }
    }

    public final void e(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public I1378617920849948703() {
        this.a = new Object();
        this.b = new K1186241071261229227();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new U3594978070141619353((Object) this, (byte) 7);
        this.e = obj;
        this.g = -1;
    }
}
