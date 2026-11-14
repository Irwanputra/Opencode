package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import dev.epro.r0.A7086841046085192465;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.F7878618420024429111;
import dev.epro.r0.G16864365537574524285;
import dev.epro.r0.H15747516787109764287;
import dev.epro.r0.P16070573589379482680;
import dev.epro.r0.P16188089657974175786;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.X16599180054040010357;
import dev.epro.r0.Z14316276734425062790;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class d6 implements B8427392651679410143 {
    public final hb1 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ d6(hb1 hb1Var, byte b) {
        this.b = b;
        this.a = hb1Var;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        PackageInfo packageInfo;
        byte b = this.b;
        int i = 0;
        hb1 hb1Var = this.a;
        switch (b) {
            case 0:
                return new c6((Context) hb1Var.a);
            case 1:
                return new ib1((Context) hb1Var.a, (byte) 1);
            case 2:
                File dir = ((Context) hb1Var.a).getDir("yqzdkcache", 0);
                Z14316276734425062790.e(dir);
                return dir;
            case 3:
                z1 z1Var = (z1) hb1Var.a;
                A7086841046085192465 a7086841046085192465 = new A7086841046085192465();
                z1Var.getClass();
                return new ai2(z1Var, a7086841046085192465, (byte) 0);
            case 4:
                qw2 qw2Var = (qw2) hb1Var.a;
                qw2Var.getClass();
                return qw2Var;
            case 5:
                ExecutorService executorService = (ExecutorService) hb1Var.a;
                if (executorService instanceof F7878618420024429111) {
                    return (F7878618420024429111) executorService;
                }
                return executorService instanceof ScheduledExecutorService ? new P16070573589379482680((ScheduledExecutorService) executorService) : new F7878618420024429111(executorService);
            case 6:
                return new di((Context) hb1Var.a);
            case 7:
                return new gr((Context) hb1Var.a);
            case 8:
                hv hvVar = (hv) hb1Var.a;
                hvVar.getClass();
                return new k00(hvVar, (byte) 4);
            case 9:
                Object obj = (U4857089234315512256) hb1Var.a;
                obj.getClass();
                if (obj instanceof P16188089657974175786) {
                }
                return H15747516787109764287.a;
            case 10:
                b71 b71Var = (b71) hb1Var.a;
                b71Var.getClass();
                return b71Var;
            case 11:
                b71 b71Var2 = (b71) hb1Var.a;
                b71Var2.getClass();
                return b71Var2;
            case 12:
                return new gm0((ExecutorService) hb1Var.a);
            case 13:
                return new d02((X16599180054040010357) hb1Var.a);
            case 14:
                return new nt2((G16864365537574524285) hb1Var.a);
            case 15:
                return new ol((G16864365537574524285) hb1Var.a);
            case 16:
                return new ib1((Context) hb1Var.a, (byte) 2);
            case 17:
                return new ra1((Context) hb1Var.a);
            case 18:
                Context context = (Context) hb1Var.a;
                context.getClass();
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 128)) != null) {
                    i = packageInfo.versionCode;
                }
                return Integer.valueOf(i);
            case 19:
                G16864365537574524285 g16864365537574524285 = (G16864365537574524285) hb1Var.a;
                g16864365537574524285.getClass();
                return new k00(g16864365537574524285, (byte) 2);
            default:
                return new xl(((Boolean) hb1Var.a).booleanValue());
        }
    }
}
