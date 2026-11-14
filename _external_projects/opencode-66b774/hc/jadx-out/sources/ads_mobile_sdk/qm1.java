package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.D454499102558517651;
import dev.epro.r0.G6043217313194465797;
import dev.epro.r0.H8027516537527559298;
import dev.epro.r0.L17385865533161060024;
import dev.epro.r0.L6589127411573323482;
import dev.epro.r0.P17493338506140929634;
import dev.epro.r0.Z10352821448393905481;
import dev.epro.r0.Z8828090230903725619;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qm1 implements L17385865533161060024 {
    public static final m7 u;
    public final Context a;
    public final P17493338506140929634 b;
    public final ExecutorService c;
    public final j11 d;
    public final boolean e;
    public final String f;
    public final long g;
    public final long h;
    public final double i;
    public final String j;
    public final int k;
    public final long l;
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final Object n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f97o = new Object();
    public final Object p = new Object();
    public final L6589127411573323482 q = s7.o();
    public final ArrayList r = new ArrayList();
    public boolean s = false;
    public final HashMap t = new HashMap();

    static {
        Z8828090230903725619 z8828090230903725619O = m7.o();
        z8828090230903725619O.b();
        m7 m7Var = (m7) z8828090230903725619O.b;
        m7Var.getClass();
        m7Var.binaryName_ = 15;
        m7Var.bitField0_ |= 1;
        u = (m7) z8828090230903725619O.a();
    }

    public qm1(Context context, P17493338506140929634 p17493338506140929634, ExecutorService executorService, j11 j11Var, Random random, String str, long j, long j2, double d, String str2, int i, long j3) {
        this.a = context;
        this.b = p17493338506140929634;
        this.c = executorService;
        this.d = j11Var;
        this.f = str;
        this.g = j;
        this.h = j2;
        this.i = d;
        this.j = str2;
        this.k = i;
        this.l = j3;
        this.e = random.nextDouble() < d;
    }

    public final void a(s7 s7Var) {
        try {
            G6043217313194465797 g6043217313194465797O = a8.o();
            m7 m7Var = u;
            g6043217313194465797O.b();
            ((a8) g6043217313194465797O.b).a(m7Var);
            Z10352821448393905481 z10352821448393905481O = y7.o();
            z10352821448393905481O.b();
            ((y7) z10352821448393905481O.b).a(s7Var);
            y7 y7Var = (y7) z10352821448393905481O.a();
            g6043217313194465797O.b();
            ((a8) g6043217313194465797O.b).a(y7Var);
            this.d.a(this.f, "application/x-protobuf", true, ((a8) g6043217313194465797O.a()).a());
        } catch (RuntimeException unused) {
        }
    }

    @Override // dev.epro.r0.L17385865533161060024
    public final D16915945238461757356 a() {
        H8027516537527559298 h8027516537527559298 = new H8027516537527559298(Executors.callable(new D454499102558517651(this, (byte) 1), null));
        this.c.execute(h8027516537527559298);
        return h8027516537527559298;
    }

    public final void a(int i, long j, Throwable th, String str) {
        if (this.e) {
            synchronized (this.f97o) {
                try {
                    this.r.add(new pm1(i, j, th, str, a(i)));
                    if (!this.s) {
                        this.s = true;
                        this.b.a(new D454499102558517651(this, (byte) 0), this.h);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final long a(int i) {
        long jLongValue;
        synchronized (this.p) {
            try {
                Long l = (Long) this.t.get(Integer.valueOf(i));
                if (l == null) {
                    l = 0L;
                }
                jLongValue = l.longValue() + 1;
                this.t.put(Integer.valueOf(i), Long.valueOf(jLongValue));
            } catch (Throwable th) {
                throw th;
            }
        }
        return jLongValue;
    }
}
