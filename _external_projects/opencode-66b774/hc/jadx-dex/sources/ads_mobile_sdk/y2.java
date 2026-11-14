package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class y2 extends dev.epro.r0.R4239627874707364917 implements dev.epro.r0.E1738554508920355622, dev.epro.r0.R13857032526302973615 {
    public final ads_mobile_sdk.z1 c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final java.util.concurrent.atomic.AtomicBoolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(dev.epro.r0.W5797197595347441198 w5797197595347441198, java.util.Map map, ads_mobile_sdk.z1 z1Var) {
        super(w5797197595347441198, map);
        w5797197595347441198.getClass();
        map.getClass();
        z1Var.getClass();
        this.c = z1Var;
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = new java.util.concurrent.atomic.AtomicBoolean(false);
        new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object a(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        if (!this.f.getAndSet(true)) {
            for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) this).b).entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((dev.epro.r0.R4239627874707364917) this).a;
                ads_mobile_sdk.ha haVar = new ads_mobile_sdk.ha(str, value, null, (byte) 6);
                w5797197595347441198.getClass();
                dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(haVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
            }
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final void d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        o(r4833348786910499294);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final dev.epro.r0.O9245300239821758723 e() {
        for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) this).b).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((dev.epro.r0.R4239627874707364917) this).a;
            ads_mobile_sdk.ha haVar = new ads_mobile_sdk.ha(str, value, null, (byte) 14);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(haVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object g(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) this).b).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((dev.epro.r0.R4239627874707364917) this).a;
            ads_mobile_sdk.ha haVar = new ads_mobile_sdk.ha(str, value, null, (byte) 8);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(haVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final void h(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        g(r4833348786910499294);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object i(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.Object objB = dev.epro.r0.O8620973563946607355.B(new ads_mobile_sdk.u2(this, null, (byte) 0), r4833348786910499294);
        return objB == dev.epro.r0.Z3437138737604933638.a ? objB : dev.epro.r0.O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object j(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) this).b).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((dev.epro.r0.R4239627874707364917) this).a;
            ads_mobile_sdk.ha haVar = new ads_mobile_sdk.ha(str, value, null, (byte) 16);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(haVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object n(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) this).b).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((dev.epro.r0.R4239627874707364917) this).a;
            ads_mobile_sdk.ha haVar = new ads_mobile_sdk.ha(str, value, null, (byte) 3);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(haVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void o(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) this).b).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((dev.epro.r0.R4239627874707364917) this).a;
            ads_mobile_sdk.ha haVar = new ads_mobile_sdk.ha(str, value, null, (byte) 18);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(haVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object q(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        boolean andSet = this.d.getAndSet(true);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (!andSet) {
            for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) this).b).entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((dev.epro.r0.R4239627874707364917) this).a;
                ads_mobile_sdk.ha haVar = new ads_mobile_sdk.ha(str, value, null, (byte) 11);
                w5797197595347441198.getClass();
                dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(haVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
            }
            ads_mobile_sdk.o9 o9Var = this.c.m;
            if (o9Var != null && o9Var.a == ads_mobile_sdk.q9.ONE_PIXEL && !this.e.getAndSet(true)) {
                a(new dev.epro.r0.S8229747050136740165(o9Var.d, o9Var.c, o9Var.b), r4833348786910499294);
            }
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void e(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) this).b).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((dev.epro.r0.R4239627874707364917) this).a;
            ads_mobile_sdk.ha haVar = new ads_mobile_sdk.ha(str, value, null, (byte) 20);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(haVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object a(dev.epro.r0.T913357428039952817 t913357428039952817, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) this).b).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((dev.epro.r0.R4239627874707364917) this).a;
            dev.epro.r0.T913357428039952817 t9133574280399528172 = t913357428039952817;
            dev.epro.r0.H4546125934900659656 h4546125934900659656 = new dev.epro.r0.H4546125934900659656(str, value, (dev.epro.r0.R4833348786910499294) null, t9133574280399528172, (byte) 12);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(h4546125934900659656, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
            t913357428039952817 = t9133574280399528172;
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void a(dev.epro.r0.S8229747050136740165 s8229747050136740165, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) this).b).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((dev.epro.r0.R4239627874707364917) this).a;
            dev.epro.r0.S8229747050136740165 s82297470501367401652 = s8229747050136740165;
            dev.epro.r0.H4546125934900659656 h4546125934900659656 = new dev.epro.r0.H4546125934900659656(str, value, (dev.epro.r0.R4833348786910499294) null, s82297470501367401652, (byte) 15);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(h4546125934900659656, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
            s8229747050136740165 = s82297470501367401652;
        }
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final dev.epro.r0.O9245300239821758723 a(java.lang.String str, java.lang.String str2, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) this).b).entrySet()) {
            java.lang.String str3 = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((dev.epro.r0.R4239627874707364917) this).a;
            java.lang.String str4 = str;
            java.lang.String str5 = str2;
            dev.epro.r0.O12152244488187446230 o12152244488187446230 = new dev.epro.r0.O12152244488187446230(str3, value, (dev.epro.r0.R4833348786910499294) null, str4, str5, (byte) 3);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(o12152244488187446230, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
            str = str4;
            str2 = str5;
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void a(java.lang.String str, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) this).b).entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((dev.epro.r0.R4239627874707364917) this).a;
            java.lang.String str3 = str;
            dev.epro.r0.H4546125934900659656 h4546125934900659656 = new dev.epro.r0.H4546125934900659656(str2, value, (dev.epro.r0.R4833348786910499294) null, str3, (byte) 24);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(h4546125934900659656, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
            str = str3;
        }
    }
}
