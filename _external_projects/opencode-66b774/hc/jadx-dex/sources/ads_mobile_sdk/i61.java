package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class i61 {
    public final dev.epro.r0.R1776126100510317963 a;

    public i61(dev.epro.r0.R1776126100510317963 r1776126100510317963) {
        this.a = r1776126100510317963;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList a(ads_mobile_sdk.i61 r5, ads_mobile_sdk.oa r6) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.i61.a(ads_mobile_sdk.i61, ads_mobile_sdk.oa):java.util.ArrayList");
    }

    public final java.lang.Object a(android.content.Context context, ads_mobile_sdk.oa oaVar, dev.epro.r0.H4546125934900659656 h4546125934900659656) {
        if (dev.epro.r0.S10823041268949770285.t(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            dev.epro.r0.H7219028874700587498 h7219028874700587498 = new dev.epro.r0.H7219028874700587498(1, dev.epro.r0.E18444280280170001567.H(h4546125934900659656));
            h7219028874700587498.t();
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
            try {
                this.a.initialize(context, new ads_mobile_sdk.d62(), a(this, oaVar));
            } catch (java.lang.Throwable th) {
                if (!atomicBoolean.getAndSet(true)) {
                    h7219028874700587498.resumeWith(new ads_mobile_sdk.qu0(19, "Exception caught initializing adapter: ".concat(th.getClass().getName()), th));
                }
            }
            return h7219028874700587498.r();
        }
        dev.epro.r0.S10973172697741180971.m("Check failed.");
        return null;
    }
}
