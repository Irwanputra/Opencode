package dev.epro.r0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N10515736137377992627 extends D11883231851729262595 implements W8575158046285589709 {
    public final Handler c;
    public final String d;
    public final boolean e;
    public final N10515736137377992627 f;

    public N10515736137377992627(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new N10515736137377992627(handler, str, true);
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final boolean B(G8001132634698687269 g8001132634698687269) {
        return (this.e && S10823041268949770285.t(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final D11883231851729262595 C(int i, String str) {
        E12775674050813925581.u(i);
        return str != null ? new O1128333822239684917(this, str) : this;
    }

    public final void D(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        J8045362843799184672.v(g8001132634698687269, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Y10288379321248498973 y10288379321248498973 = M979257876727257621.a;
        N11611180034702960692.c.z(g8001132634698687269, runnable);
    }

    @Override // dev.epro.r0.W8575158046285589709
    public final U16840712152025914198 d(long j, final Runnable runnable, G8001132634698687269 g8001132634698687269) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            return new U16840712152025914198() { // from class: dev.epro.r0.N3707266439483823995
                @Override // dev.epro.r0.U16840712152025914198
                public final void a() {
                    this.a.c.removeCallbacks(runnable);
                }
            };
        }
        D(g8001132634698687269, runnable);
        return F15788397839700158005.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N10515736137377992627)) {
            return false;
        }
        N10515736137377992627 n10515736137377992627 = (N10515736137377992627) obj;
        return n10515736137377992627.c == this.c && n10515736137377992627.e == this.e;
    }

    @Override // dev.epro.r0.W8575158046285589709
    public final void h(long j, H7219028874700587498 h7219028874700587498) {
        I3863025946240164840 i3863025946240164840 = new I3863025946240164840(h7219028874700587498, this, (byte) 10);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(i3863025946240164840, j)) {
            h7219028874700587498.v(new B2138252231653711516((Object) this, (Object) i3863025946240164840, (byte) 5));
        } else {
            D(h7219028874700587498.e, i3863025946240164840);
        }
    }

    public final int hashCode() {
        return (this.e ? 1231 : 1237) ^ System.identityHashCode(this.c);
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final String toString() {
        N10515736137377992627 n10515736137377992627;
        String str;
        Y10288379321248498973 y10288379321248498973 = M979257876727257621.a;
        N10515736137377992627 n105157361373779926272 = S14277978768267526585.a;
        if (this == n105157361373779926272) {
            str = "Dispatchers.Main";
        } else {
            try {
                n10515736137377992627 = n105157361373779926272.f;
            } catch (UnsupportedOperationException unused) {
                n10515736137377992627 = null;
            }
            str = this == n10515736137377992627 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.d;
        if (string == null) {
            string = this.c.toString();
        }
        return this.e ? G6547577305291411977.r(string, ".immediate") : string;
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void z(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        D(g8001132634698687269, runnable);
    }

    public N10515736137377992627(Handler handler) {
        this(handler, null, false);
    }
}
