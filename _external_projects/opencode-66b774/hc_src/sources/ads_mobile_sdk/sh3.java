package ads_mobile_sdk;

import android.os.SystemClock;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.S10973172697741180971;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class sh3 {
    public final yk0 a;
    public final qm1 b;
    public final O16637889491137121389 c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public long e = -1;
    public long f = -1;
    public Throwable g = null;

    public sh3(yk0 yk0Var, O16637889491137121389 o16637889491137121389, qm1 qm1Var) {
        this.a = yk0Var;
        this.b = qm1Var;
        this.c = o16637889491137121389;
    }

    public final void a() {
        AtomicBoolean atomicBoolean = this.d;
        if (atomicBoolean.getAndSet(true)) {
            S10973172697741180971.m("Finished trace.");
            return;
        }
        this.c.getClass();
        this.f = SystemClock.uptimeMillis();
        this.b.a(this.a.a, atomicBoolean.get() ? this.f - this.e : -1L, this.g, null);
    }

    public final void b() {
        if (this.d.get()) {
            S10973172697741180971.m("Finished trace.");
        } else {
            this.c.getClass();
            this.e = SystemClock.uptimeMillis();
        }
    }

    public final void a(Throwable th) {
        if (!this.d.get()) {
            this.g = th;
        } else {
            S10973172697741180971.m("Finished trace.");
        }
    }
}
