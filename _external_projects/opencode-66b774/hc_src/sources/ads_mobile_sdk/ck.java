package ads_mobile_sdk;

import dev.epro.r0.B8669154544800329371;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ck implements B8669154544800329371 {
    public final O16637889491137121389 a;
    public final jr0 b;
    public final Object c;
    public int d;
    public int e;
    public final LinkedHashMap f;
    public Long g;
    public final Object h;
    public int i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final Object l;
    public boolean m;
    public long n;

    public ck(jr0 jr0Var, O16637889491137121389 o16637889491137121389) {
        o16637889491137121389.getClass();
        jr0Var.getClass();
        this.a = o16637889491137121389;
        this.b = jr0Var;
        this.c = new Object();
        this.d = -1;
        this.e = -1;
        this.f = new LinkedHashMap();
        this.h = new Object();
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new Object();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.n = 0L;
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final Object b(long j, R14062301455140331524 r14062301455140331524) {
        synchronized (this.l) {
            if (!this.m) {
                return O9245300239821758723.a;
            }
            if (E17093345031926825464.c(j, this.n) < 0) {
                return O9245300239821758723.a;
            }
            boolean z = false;
            this.m = false;
            jr0 jr0Var = this.b;
            jr0Var.getClass();
            if (((Boolean) jr0Var.a("gads:reset_session_counters_on_app_foreground:enabled", Boolean.TRUE, ao.a$11)).booleanValue()) {
                long g = E17093345031926825464.g(j, this.n);
                jr0 jr0Var2 = this.b;
                jr0Var2.getClass();
                if (E17093345031926825464.c(g, ((E17093345031926825464) jr0Var2.a("gads:app_activity_tracker:app_session_timeout_ms", new E17093345031926825464(M9216324016624295870.Z(5, N13798149404328803870.MINUTES)), ao.a)).a) > 0) {
                    z = true;
                }
            }
            this.n = j;
            O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
            if (!z) {
                return o9245300239821758723;
            }
            synchronized (this.c) {
                this.g = null;
                this.e = -1;
            }
            return o9245300239821758723;
        }
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final Object d(long j, R14062301455140331524 r14062301455140331524) {
        synchronized (this.l) {
            if (this.m) {
                return O9245300239821758723.a;
            }
            if (E17093345031926825464.c(j, this.n) < 0) {
                return O9245300239821758723.a;
            }
            this.m = true;
            this.n = j;
            return O9245300239821758723.a;
        }
    }
}
