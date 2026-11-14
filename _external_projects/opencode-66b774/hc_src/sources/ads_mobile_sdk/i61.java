package ads_mobile_sdk;

import android.content.Context;
import android.os.Looper;
import dev.epro.r0.E18444280280170001567;
import dev.epro.r0.H4546125934900659656;
import dev.epro.r0.H7219028874700587498;
import dev.epro.r0.R1776126100510317963;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S10973172697741180971;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class i61 {
    public final R1776126100510317963 a;

    public i61(R1776126100510317963 r1776126100510317963) {
        this.a = r1776126100510317963;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r1.equals("app_open_ad") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r1.equals("app_open") == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList a(ads_mobile_sdk.i61 r5, ads_mobile_sdk.oa r6) {
        /*
            dev.epro.r0.O6641393078261985068 r5 = r6.p$1()
            r5.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = dev.epro.r0.Z115818233709597990.k0(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r0 = r5.next()
            ads_mobile_sdk.qa r0 = (ads_mobile_sdk.qa) r0
            java.lang.String r1 = r0.p()
            r1.getClass()
            int r2 = r1.hashCode()
            r3 = 7
            switch(r2) {
                case -1396342996: goto L70;
                case -1052618729: goto L65;
                case -239580146: goto L5a;
                case 604727084: goto L4f;
                case 1167692200: goto L46;
                case 1778294298: goto L3d;
                case 1911491517: goto L32;
                default: goto L31;
            }
        L31:
            goto L7a
        L32:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3b
            goto L7a
        L3b:
            r3 = 4
            goto L7b
        L3d:
            java.lang.String r2 = "app_open_ad"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L7b
            goto L7a
        L46:
            java.lang.String r2 = "app_open"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L7b
            goto L7a
        L4f:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L58
            goto L7a
        L58:
            r3 = 2
            goto L7b
        L5a:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L63
            goto L7a
        L63:
            r3 = 3
            goto L7b
        L65:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6e
            goto L7a
        L6e:
            r3 = 5
            goto L7b
        L70:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7a
            r3 = 1
            goto L7b
        L7a:
            r3 = 6
        L7b:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Map r0 = r0.o()
            r0.getClass()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lab
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.putString(r4, r2)
            goto L8f
        Lab:
            dev.epro.r0.K13929761950693725114 r0 = new dev.epro.r0.K13929761950693725114
            r0.<init>(r1, r3)
            r6.add(r0)
            goto L16
        Lb5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.i61.a(ads_mobile_sdk.i61, ads_mobile_sdk.oa):java.util.ArrayList");
    }

    public final Object a(Context context, oa oaVar, H4546125934900659656 h4546125934900659656) {
        if (S10823041268949770285.t(Looper.getMainLooper(), Looper.myLooper())) {
            H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(h4546125934900659656));
            h7219028874700587498.t();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            try {
                this.a.initialize(context, new d62(), a(this, oaVar));
            } catch (Throwable th) {
                if (!atomicBoolean.getAndSet(true)) {
                    h7219028874700587498.resumeWith(new qu0(19, "Exception caught initializing adapter: ".concat(th.getClass().getName()), th));
                }
            }
            return h7219028874700587498.r();
        }
        S10973172697741180971.m("Check failed.");
        return null;
    }
}
