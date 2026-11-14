package dev.epro.r0;

import ads_mobile_sdk.lt0;
import ads_mobile_sdk.ot0;
import ads_mobile_sdk.pd;
import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class B2395259063971314741 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ot0 b;
    public final /* synthetic */ S15368342082797059271 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ B2395259063971314741(ot0 ot0Var, S15368342082797059271 s15368342082797059271, int i, long j, byte b) {
        this.a = b;
        this.b = ot0Var;
        this.c = s15368342082797059271;
        this.d = i;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pd pdVar;
        switch (this.a) {
            case 0:
                ot0 ot0Var = this.b;
                ot0Var.c.execute(new B2395259063971314741(ot0Var, this.c, this.d, this.e, (byte) 1));
                break;
            default:
                S15368342082797059271 s15368342082797059271 = this.c;
                ot0 ot0Var2 = this.b;
                Context context = ot0Var2.a;
                try {
                    try {
                        pdVar = (pd) new lt0(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode)).d.poll(5000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        pdVar = null;
                    }
                    if (pdVar == null) {
                        V5431423861497278836 w = pd.w();
                        w.c(32768L);
                        pdVar = (pd) w.a();
                    }
                    if (!pdVar.u() || pdVar.q() != 32768) {
                        s15368342082797059271.k(pdVar);
                        break;
                    }
                } catch (Throwable unused2) {
                }
                int i = this.d;
                if (i >= 3) {
                    s15368342082797059271.k(null);
                    break;
                } else {
                    long j = i == 1 ? 100L : 2 * this.e;
                    B2395259063971314741 b2395259063971314741 = new B2395259063971314741(ot0Var2, s15368342082797059271, i + 1, j, (byte) 0);
                    if (j <= 0) {
                        b2395259063971314741.run();
                        break;
                    } else {
                        ot0Var2.g.a(b2395259063971314741, j);
                        break;
                    }
                }
                break;
        }
    }
}
