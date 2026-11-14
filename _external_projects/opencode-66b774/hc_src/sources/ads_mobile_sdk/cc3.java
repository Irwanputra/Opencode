package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.K4548097313143615345;
import dev.epro.r0.M16184408391440927034;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10823041268949770285;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class cc3 extends c61 implements K4548097313143615345 {
    public M16184408391440927034 c;

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.cc3 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.bc3
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.bc3 r0 = (ads_mobile_sdk.bc3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.bc3 r0 = new ads_mobile_sdk.bc3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ads_mobile_sdk.cc3 r4 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L2e:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.a = r4
            r0.d = r2
            java.lang.Object r5 = r4.d(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r0) goto L3e
            return r0
        L3e:
            dev.epro.r0.M16184408391440927034 r5 = (dev.epro.r0.M16184408391440927034) r5
            r4.c = r5
            ads_mobile_sdk.xu0 r4 = new ads_mobile_sdk.xu0
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cc3.a(ads_mobile_sdk.cc3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.K4548097313143615345
    public final Object c(R4833348786910499294 r4833348786910499294) {
        WeakHashMap weakHashMap = ji3.a;
        th3 a = ji3.a(wv0.CUI_NAME_SIGNAL, O2161699089510411363.a, true);
        try {
            ji3.a().e().t = new u73(mo19a(), 4);
            M16184408391440927034 m16184408391440927034 = this.c;
            if (m16184408391440927034 == null) {
                S10823041268949770285.b0("result");
                throw null;
            }
            if (m16184408391440927034 instanceof pu0) {
                zi3.a((pu0) m16184408391440927034, false);
            }
            a.close();
            return m16184408391440927034;
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
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        return a(this, (K14749510448791472029) r4833348786910499294);
    }
}
