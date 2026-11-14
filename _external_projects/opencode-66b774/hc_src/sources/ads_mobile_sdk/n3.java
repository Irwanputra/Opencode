package ads_mobile_sdk;

import dev.epro.r0.E1738554508920355622;
import dev.epro.r0.I10051424186108607289;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Z3383101362411723454;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class n3 implements E1738554508920355622 {
    public final xj a;
    public final qw2 b;
    public final hf2 c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;

    public n3(xj xjVar, qw2 qw2Var, hf2 hf2Var) {
        xjVar.getClass();
        qw2Var.getClass();
        hf2Var.getClass();
        this.a = xjVar;
        this.b = qw2Var;
        this.c = hf2Var;
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object a(R4833348786910499294 r4833348786910499294) {
        boolean andSet = this.d.getAndSet(false);
        qw2 qw2Var = this.b;
        xj xjVar = this.a;
        if (andSet) {
            xjVar.getClass();
            qw2Var.getClass();
            AtomicInteger atomicInteger = (AtomicInteger) xjVar.d.get(qw2Var);
            if (atomicInteger != null) {
                atomicInteger.decrementAndGet();
            }
        }
        if (this.e.getAndSet(false)) {
            xjVar.getClass();
            qw2Var.getClass();
            AtomicInteger atomicInteger2 = (AtomicInteger) xjVar.e.get(qw2Var);
            if (atomicInteger2 != null) {
                atomicInteger2.decrementAndGet();
            }
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object g(R4833348786910499294 r4833348786910499294) {
        qw2 qw2Var = this.b;
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
                    xj xjVar = this.a;
                    xjVar.getClass();
                    AtomicInteger atomicInteger = (AtomicInteger) xjVar.e.get(qw2Var);
                    if (atomicInteger != null) {
                        atomicInteger.decrementAndGet();
                        break;
                    }
                }
                break;
            default:
                Z3383101362411723454.g();
                return null;
        }
        return O9245300239821758723.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (r8 == r2) goto L8;
     */
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
    public final void o(R4833348786910499294 r4833348786910499294) {
        qw2 qw2Var = this.b;
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
                    xj xjVar = this.a;
                    xjVar.getClass();
                    ((AtomicInteger) xjVar.e.computeIfAbsent(qw2Var, new I10051424186108607289((byte) 3))).incrementAndGet();
                    break;
                }
                break;
            default:
                Z3383101362411723454.g();
                break;
        }
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object q(R4833348786910499294 r4833348786910499294) {
        qw2 qw2Var = this.b;
        switch (qw2Var.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 5:
                if (!this.e.getAndSet(true)) {
                    xj xjVar = this.a;
                    xjVar.getClass();
                    ((AtomicInteger) xjVar.e.computeIfAbsent(qw2Var, new I10051424186108607289((byte) 3))).incrementAndGet();
                    break;
                }
                break;
            case 1:
            case 4:
            case 6:
            case 7:
            case 8:
                break;
            default:
                Z3383101362411723454.g();
                return null;
        }
        return O9245300239821758723.a;
    }
}
