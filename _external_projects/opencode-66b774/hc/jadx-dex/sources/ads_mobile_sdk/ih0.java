package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ih0 implements dev.epro.r0.E1738554508920355622, dev.epro.r0.K3615309688696506893, dev.epro.r0.J8590556930419069179 {
    public final dev.epro.r0.W5797197595347441198 a;
    public final ads_mobile_sdk.mi3 b;
    public final ads_mobile_sdk.kz2 c;
    public dev.epro.r0.P14306640982153864715 d;
    public dev.epro.r0.G14522929311705694578 e;
    public dev.epro.r0.P10281324844086052649 g;
    public final java.util.concurrent.ArrayBlockingQueue r;
    public final java.util.concurrent.atomic.AtomicBoolean s;

    public ih0(dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.mi3 mi3Var, ads_mobile_sdk.kz2 kz2Var) {
        w5797197595347441198.getClass();
        jr0Var.getClass();
        mi3Var.getClass();
        kz2Var.getClass();
        this.a = w5797197595347441198;
        this.b = mi3Var;
        this.c = kz2Var;
        this.r = new java.util.concurrent.ArrayBlockingQueue(((java.lang.Number) jr0Var.a("gads:app_event_queue_size", (java.lang.Object) 20, (dev.epro.r0.F4096073349764486348) ads_mobile_sdk.ao.a$18)).intValue());
        this.s = new java.util.concurrent.atomic.AtomicBoolean(true);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final dev.epro.r0.O9245300239821758723 a(java.lang.String str, java.lang.String str2, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (!this.s.get()) {
            dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
            dev.epro.r0.U2722688686349128662 u2722688686349128662 = dev.epro.r0.U2722688686349128662.b;
            dev.epro.r0.G8001132634698687269 context = ((dev.epro.r0.K14749510448791472029) r4833348786910499294).getContext();
            u2722688686349128662.getClass();
            dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u2722688686349128662, context).minusKey(ads_mobile_sdk.ti3.b).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.eh0(null, this, str, str2, (byte) 0), 3);
            return o9245300239821758723;
        }
        if (this.r.offer(new dev.epro.r0.H9390398899829886498(str, str2))) {
            return o9245300239821758723;
        }
        ads_mobile_sdk.kz2 kz2Var = this.c;
        ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_UNKNOWN;
        dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
        ads_mobile_sdk.mi3 mi3Var = this.b;
        if (ads_mobile_sdk.ji3.b().a == null) {
            ads_mobile_sdk.em2 em2VarA = ads_mobile_sdk.kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                ads_mobile_sdk.zi3.a(6, "App events queue overflow. name: " + str + ", data: " + str2, null);
                em2VarA.close();
                return o9245300239821758723;
            } catch (java.lang.Throwable th) {
                try {
                    em2VarA.b(th);
                    if (th instanceof dev.epro.r0.N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                        em2VarA.a(th);
                    }
                    if (th instanceof dev.epro.r0.P2480554073835519965) {
                        throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th);
                    }
                    if (th instanceof java.util.concurrent.CancellationException) {
                        throw new ads_mobile_sdk.du0(th);
                    }
                    if (th instanceof ads_mobile_sdk.dv0) {
                        throw th;
                    }
                    throw new ads_mobile_sdk.iu0(th);
                } finally {
                }
            }
        } else {
            ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, true);
            try {
                ads_mobile_sdk.zi3.a(6, "App events queue overflow. name: " + str + ", data: " + str2, null);
                th3VarA.close();
                return o9245300239821758723;
            } catch (java.lang.Throwable th2) {
                try {
                    th3VarA.b(th2);
                    if (th2 instanceof dev.epro.r0.N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof dev.epro.r0.P2480554073835519965) && !(th2 instanceof java.util.concurrent.CancellationException)) {
                        th3VarA.a(th2);
                    }
                    if (th2 instanceof dev.epro.r0.P2480554073835519965) {
                        throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th2);
                    }
                    if (th2 instanceof java.util.concurrent.CancellationException) {
                        throw new ads_mobile_sdk.du0(th2);
                    }
                    if (th2 instanceof ads_mobile_sdk.dv0) {
                        throw th2;
                    }
                    throw new ads_mobile_sdk.iu0(th2);
                } finally {
                }
            }
        }
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void e(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        dev.epro.r0.U2722688686349128662 u2722688686349128662 = dev.epro.r0.U2722688686349128662.b;
        dev.epro.r0.G8001132634698687269 context = ((dev.epro.r0.K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u2722688686349128662, context).minusKey(ads_mobile_sdk.ti3.b).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.bh0(this, null, (byte) 1), 3);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object g(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        dev.epro.r0.U2722688686349128662 u2722688686349128662 = dev.epro.r0.U2722688686349128662.b;
        dev.epro.r0.G8001132634698687269 context = ((dev.epro.r0.K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u2722688686349128662, context).minusKey(ads_mobile_sdk.ti3.b).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.bh0(this, null, (byte) 3), 3);
        return dev.epro.r0.O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object n(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        dev.epro.r0.U2722688686349128662 u2722688686349128662 = dev.epro.r0.U2722688686349128662.b;
        dev.epro.r0.G8001132634698687269 context = ((dev.epro.r0.K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u2722688686349128662, context).minusKey(ads_mobile_sdk.ti3.b).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.bh0(this, null, (byte) 2), 3);
        return dev.epro.r0.O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void o(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        dev.epro.r0.U2722688686349128662 u2722688686349128662 = dev.epro.r0.U2722688686349128662.b;
        dev.epro.r0.G8001132634698687269 context = ((dev.epro.r0.K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u2722688686349128662, context).minusKey(ads_mobile_sdk.ti3.b).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.bh0(this, null, (byte) 0), 3);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object q(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        dev.epro.r0.U2722688686349128662 u2722688686349128662 = dev.epro.r0.U2722688686349128662.b;
        dev.epro.r0.G8001132634698687269 context = ((dev.epro.r0.K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u2722688686349128662, context).minusKey(ads_mobile_sdk.ti3.b).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.bh0(this, null, (byte) 4), 3);
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final dev.epro.r0.P14306640982153864715 a() {
        dev.epro.r0.P14306640982153864715 p14306640982153864715;
        synchronized (this) {
            p14306640982153864715 = this.d;
        }
        return p14306640982153864715;
    }

    public final void a(dev.epro.r0.P10281324844086052649 p10281324844086052649) {
        synchronized (this) {
            this.g = p10281324844086052649;
            synchronized (this) {
                this.d = p10281324844086052649;
            }
        }
        a((dev.epro.r0.G14522929311705694578) p10281324844086052649);
    }

    public final void a(dev.epro.r0.G14522929311705694578 g14522929311705694578) {
        synchronized (this) {
            this.e = g14522929311705694578;
        }
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.a;
        dev.epro.r0.N4024785987441166868 n4024785987441166868 = new dev.epro.r0.N4024785987441166868(this, (dev.epro.r0.R4833348786910499294) null, (byte) 11);
        dev.epro.r0.I3826119971291161142 i3826119971291161142 = dev.epro.r0.I3826119971291161142.a;
        w5797197595347441198.getClass();
        dev.epro.r0.R7033599853981556291.E(w5797197595347441198, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(n4024785987441166868, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void a(java.lang.String str, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        dev.epro.r0.U2722688686349128662 u2722688686349128662 = dev.epro.r0.U2722688686349128662.b;
        dev.epro.r0.G8001132634698687269 context = ((dev.epro.r0.K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u2722688686349128662, context).minusKey(ads_mobile_sdk.ti3.b).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.E13942609761711486177((dev.epro.r0.R4833348786910499294) null, this, (java.lang.Object) str, (byte) 5), 3);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object a(dev.epro.r0.T913357428039952817 t913357428039952817, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        dev.epro.r0.U2722688686349128662 u2722688686349128662 = dev.epro.r0.U2722688686349128662.b;
        dev.epro.r0.G8001132634698687269 context = ((dev.epro.r0.K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u2722688686349128662, context).minusKey(ads_mobile_sdk.ti3.b).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.E13942609761711486177((dev.epro.r0.R4833348786910499294) null, this, (java.lang.Object) t913357428039952817, (byte) 16), 3);
        return dev.epro.r0.O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void a(dev.epro.r0.S8229747050136740165 s8229747050136740165, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        dev.epro.r0.U2722688686349128662 u2722688686349128662 = dev.epro.r0.U2722688686349128662.b;
        dev.epro.r0.G8001132634698687269 context = ((dev.epro.r0.K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u2722688686349128662, context).minusKey(ads_mobile_sdk.ti3.b).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.E13942609761711486177((dev.epro.r0.R4833348786910499294) null, this, (java.lang.Object) s8229747050136740165, (byte) 3), 3);
    }

    public final dev.epro.r0.O9245300239821758723 a(dev.epro.r0.R12517428114166698439 r12517428114166698439, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        dev.epro.r0.U2722688686349128662 u2722688686349128662 = dev.epro.r0.U2722688686349128662.b;
        dev.epro.r0.G8001132634698687269 context = ((dev.epro.r0.K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u2722688686349128662, context).minusKey(ads_mobile_sdk.ti3.b).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.E13942609761711486177((dev.epro.r0.R4833348786910499294) null, this, (java.lang.Object) r12517428114166698439, (byte) 6), 3);
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final java.lang.Object a(android.os.Bundle bundle, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.Object objB = dev.epro.r0.O8620973563946607355.B(new ads_mobile_sdk.bh0(this, null, (byte) 6), r4833348786910499294);
        return objB == dev.epro.r0.Z3437138737604933638.a ? objB : dev.epro.r0.O9245300239821758723.a;
    }
}
