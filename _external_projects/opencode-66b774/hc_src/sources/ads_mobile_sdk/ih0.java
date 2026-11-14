package ads_mobile_sdk;

import android.os.Bundle;
import dev.epro.r0.B14824868959299866349;
import dev.epro.r0.E13942609761711486177;
import dev.epro.r0.E1738554508920355622;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.G14522929311705694578;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.J8590556930419069179;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.K3615309688696506893;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.N4024785987441166868;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O8620973563946607355;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P10281324844086052649;
import dev.epro.r0.P14306640982153864715;
import dev.epro.r0.P2382941533350862833;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R12517428114166698439;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S8229747050136740165;
import dev.epro.r0.T913357428039952817;
import dev.epro.r0.U2722688686349128662;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ih0 implements E1738554508920355622, K3615309688696506893, J8590556930419069179 {
    public final W5797197595347441198 a;
    public final mi3 b;
    public final kz2 c;
    public P14306640982153864715 d;
    public G14522929311705694578 e;
    public P10281324844086052649 g;
    public final ArrayBlockingQueue r;
    public final AtomicBoolean s;

    public ih0(W5797197595347441198 w5797197595347441198, jr0 jr0Var, mi3 mi3Var, kz2 kz2Var) {
        w5797197595347441198.getClass();
        jr0Var.getClass();
        mi3Var.getClass();
        kz2Var.getClass();
        this.a = w5797197595347441198;
        this.b = mi3Var;
        this.c = kz2Var;
        this.r = new ArrayBlockingQueue(((Number) jr0Var.a("gads:app_event_queue_size", (Object) 20, (F4096073349764486348) ao.a$18)).intValue());
        this.s = new AtomicBoolean(true);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final O9245300239821758723 a(String str, String str2, R4833348786910499294 r4833348786910499294) {
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        R4833348786910499294 r48333487869104992942 = null;
        if (!this.s.get()) {
            P5733283974459951585 p5733283974459951585 = rw0.f;
            U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
            G8001132634698687269 context = ((K14749510448791472029) r4833348786910499294).getContext();
            u2722688686349128662.getClass();
            R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new eh0(r48333487869104992942, this, str, str2, (byte) 0), 3);
            return o9245300239821758723;
        }
        if (this.r.offer(new H9390398899829886498(str, str2))) {
            return o9245300239821758723;
        }
        kz2 kz2Var = this.c;
        wv0 wv0Var = wv0.CUI_NAME_UNKNOWN;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        mi3 mi3Var = this.b;
        if (ji3.b().a == null) {
            em2 a = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                zi3.a(6, "App events queue overflow. name: " + str + ", data: " + str2, null);
                a.close();
                return o9245300239821758723;
            } catch (Throwable th) {
                try {
                    a.b(th);
                    if (th instanceof N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                        a.a(th);
                    }
                    if (th instanceof P2480554073835519965) {
                        throw new lw0(th);
                    }
                    if (th instanceof CancellationException) {
                        throw new du0(th);
                    }
                    if (th instanceof dv0) {
                        throw th;
                    }
                    throw new iu0(th);
                } finally {
                }
            }
        } else {
            th3 a2 = ji3.a(wv0Var, o2161699089510411363, true);
            try {
                zi3.a(6, "App events queue overflow. name: " + str + ", data: " + str2, null);
                a2.close();
                return o9245300239821758723;
            } catch (Throwable th2) {
                try {
                    a2.b(th2);
                    if (th2 instanceof N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                        a2.a(th2);
                    }
                    if (th2 instanceof P2480554073835519965) {
                        throw new lw0(th2);
                    }
                    if (th2 instanceof CancellationException) {
                        throw new du0(th2);
                    }
                    if (th2 instanceof dv0) {
                        throw th2;
                    }
                    throw new iu0(th2);
                } finally {
                }
            }
        }
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void e(R4833348786910499294 r4833348786910499294) {
        P5733283974459951585 p5733283974459951585 = rw0.f;
        U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
        G8001132634698687269 context = ((K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new bh0(this, null, (byte) 1), 3);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object g(R4833348786910499294 r4833348786910499294) {
        P5733283974459951585 p5733283974459951585 = rw0.f;
        U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
        G8001132634698687269 context = ((K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new bh0(this, null, (byte) 3), 3);
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object n(R4833348786910499294 r4833348786910499294) {
        P5733283974459951585 p5733283974459951585 = rw0.f;
        U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
        G8001132634698687269 context = ((K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new bh0(this, null, (byte) 2), 3);
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void o(R4833348786910499294 r4833348786910499294) {
        P5733283974459951585 p5733283974459951585 = rw0.f;
        U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
        G8001132634698687269 context = ((K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new bh0(this, null, (byte) 0), 3);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object q(R4833348786910499294 r4833348786910499294) {
        P5733283974459951585 p5733283974459951585 = rw0.f;
        U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
        G8001132634698687269 context = ((K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new bh0(this, null, (byte) 4), 3);
        return O9245300239821758723.a;
    }

    public final P14306640982153864715 a() {
        P14306640982153864715 p14306640982153864715;
        synchronized (this) {
            p14306640982153864715 = this.d;
        }
        return p14306640982153864715;
    }

    public final void a(P10281324844086052649 p10281324844086052649) {
        synchronized (this) {
            this.g = p10281324844086052649;
            synchronized (this) {
                this.d = p10281324844086052649;
            }
        }
        a((G14522929311705694578) p10281324844086052649);
    }

    public final void a(G14522929311705694578 g14522929311705694578) {
        synchronized (this) {
            this.e = g14522929311705694578;
        }
        W5797197595347441198 w5797197595347441198 = this.a;
        R4833348786910499294 r4833348786910499294 = null;
        N4024785987441166868 n4024785987441166868 = new N4024785987441166868(this, r4833348786910499294, (byte) 11);
        I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
        w5797197595347441198.getClass();
        R7033599853981556291.E(w5797197595347441198, i3826119971291161142, null, new P7598478828797568949(n4024785987441166868, r4833348786910499294, (byte) 1), 2);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void a(String str, R4833348786910499294 r4833348786910499294) {
        P5733283974459951585 p5733283974459951585 = rw0.f;
        U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
        G8001132634698687269 context = ((K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new E13942609761711486177((R4833348786910499294) null, this, (Object) str, (byte) 5), 3);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object a(T913357428039952817 t913357428039952817, R4833348786910499294 r4833348786910499294) {
        P5733283974459951585 p5733283974459951585 = rw0.f;
        U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
        G8001132634698687269 context = ((K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new E13942609761711486177((R4833348786910499294) null, this, (Object) t913357428039952817, (byte) 16), 3);
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void a(S8229747050136740165 s8229747050136740165, R4833348786910499294 r4833348786910499294) {
        P5733283974459951585 p5733283974459951585 = rw0.f;
        U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
        G8001132634698687269 context = ((K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new E13942609761711486177((R4833348786910499294) null, this, (Object) s8229747050136740165, (byte) 3), 3);
    }

    @Override // dev.epro.r0.K3615309688696506893
    public final O9245300239821758723 a(R12517428114166698439 r12517428114166698439, R4833348786910499294 r4833348786910499294) {
        P5733283974459951585 p5733283974459951585 = rw0.f;
        U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
        G8001132634698687269 context = ((K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new E13942609761711486177((R4833348786910499294) null, this, (Object) r12517428114166698439, (byte) 6), 3);
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.J8590556930419069179
    public final Object a(Bundle bundle, R4833348786910499294 r4833348786910499294) {
        Object B = O8620973563946607355.B(new bh0(this, null, (byte) 6), r4833348786910499294);
        return B == Z3437138737604933638.a ? B : O9245300239821758723.a;
    }
}
