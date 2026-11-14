package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class n3 implements dev.epro.r0.E1738554508920355622 {
    public final ads_mobile_sdk.xj a;
    public final ads_mobile_sdk.qw2 b;
    public final ads_mobile_sdk.hf2 c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public final java.util.concurrent.atomic.AtomicBoolean e;

    public n3(ads_mobile_sdk.xj xjVar, ads_mobile_sdk.qw2 qw2Var, ads_mobile_sdk.hf2 hf2Var) {
        xjVar.getClass();
        qw2Var.getClass();
        hf2Var.getClass();
        this.a = xjVar;
        this.b = qw2Var;
        this.c = hf2Var;
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object a(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        boolean andSet = this.d.getAndSet(false);
        ads_mobile_sdk.qw2 qw2Var = this.b;
        ads_mobile_sdk.xj xjVar = this.a;
        if (andSet) {
            xjVar.getClass();
            qw2Var.getClass();
            java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) xjVar.d.get(qw2Var);
            if (atomicInteger != null) {
                atomicInteger.decrementAndGet();
            }
        }
        if (this.e.getAndSet(false)) {
            xjVar.getClass();
            qw2Var.getClass();
            java.util.concurrent.atomic.AtomicInteger atomicInteger2 = (java.util.concurrent.atomic.AtomicInteger) xjVar.e.get(qw2Var);
            if (atomicInteger2 != null) {
                atomicInteger2.decrementAndGet();
            }
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object g(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.qw2 qw2Var = this.b;
        switch (qw2Var.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 5:
                break;
            case 1:
            case 4:
            case 6:
            case 7:
            case 8:
                if (this.e.getAndSet(false)) {
                    ads_mobile_sdk.xj xjVar = this.a;
                    xjVar.getClass();
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) xjVar.e.get(qw2Var);
                    if (atomicInteger != null) {
                        atomicInteger.decrementAndGet();
                    }
                }
                break;
            default:
                dev.epro.r0.Z3383101362411723454.g();
                return null;
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    @Override // dev.epro.r0.E1738554508920355622
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(dev.epro.r0.R4833348786910499294 r9) {
        /*
            r8 = this;
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.d
            boolean r0 = r1.getAndSet(r0)
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            if (r0 != 0) goto L3d
            ads_mobile_sdk.xj r0 = r8.a
            r0.getClass()
            ads_mobile_sdk.qw2 r4 = r8.b
            r4.getClass()
            java.util.concurrent.ConcurrentHashMap r5 = r0.d
            dev.epro.r0.I10051424186108607289 r6 = new dev.epro.r0.I10051424186108607289
            r7 = 2
            r6.<init>(r7)
            java.lang.Object r5 = r5.computeIfAbsent(r4, r6)
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            r5.incrementAndGet()
            ads_mobile_sdk.m3 r5 = new ads_mobile_sdk.m3
            java.util.concurrent.atomic.AtomicBoolean r6 = r8.e
            r5.<init>(r0, r4, r1, r6)
            ads_mobile_sdk.hf2 r0 = r8.c
            r0.getClass()
            dev.epro.r0.K14749510448791472029 r9 = (dev.epro.r0.K14749510448791472029) r9
            java.lang.Object r8 = ads_mobile_sdk.hf2.a(r0, r8, r5, r9)
            if (r8 != r2) goto L3d
            goto L3e
        L3d:
            r8 = r3
        L3e:
            if (r8 != r2) goto L41
            return r8
        L41:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.n3.i(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void o(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.qw2 qw2Var = this.b;
        switch (qw2Var.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 5:
                break;
            case 1:
            case 4:
            case 6:
            case 7:
            case 8:
                if (!this.e.getAndSet(true)) {
                    ads_mobile_sdk.xj xjVar = this.a;
                    xjVar.getClass();
                    ((java.util.concurrent.atomic.AtomicInteger) xjVar.e.computeIfAbsent(qw2Var, new dev.epro.r0.I10051424186108607289((byte) 3))).incrementAndGet();
                }
                break;
            default:
                dev.epro.r0.Z3383101362411723454.g();
                break;
        }
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object q(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.qw2 qw2Var = this.b;
        switch (qw2Var.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 5:
                if (!this.e.getAndSet(true)) {
                    ads_mobile_sdk.xj xjVar = this.a;
                    xjVar.getClass();
                    ((java.util.concurrent.atomic.AtomicInteger) xjVar.e.computeIfAbsent(qw2Var, new dev.epro.r0.I10051424186108607289((byte) 3))).incrementAndGet();
                }
                break;
            case 1:
            case 4:
            case 6:
            case 7:
            case 8:
                break;
            default:
                dev.epro.r0.Z3383101362411723454.g();
                return null;
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
