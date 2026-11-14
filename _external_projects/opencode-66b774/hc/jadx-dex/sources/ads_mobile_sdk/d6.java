package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class d6 implements dev.epro.r0.B8427392651679410143 {
    public final ads_mobile_sdk.hb1 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ d6(ads_mobile_sdk.hb1 hb1Var, byte b) {
        this.b = b;
        this.a = hb1Var;
    }

    public final java.lang.Object get() {
        android.content.pm.PackageInfo packageInfo;
        byte b = this.b;
        int i = 0;
        ads_mobile_sdk.hb1 hb1Var = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.c6((android.content.Context) hb1Var.a);
            case 1:
                return new ads_mobile_sdk.ib1((android.content.Context) hb1Var.a, (byte) 1);
            case 2:
                java.io.File dir = ((android.content.Context) hb1Var.a).getDir("yqzdkcache", 0);
                dev.epro.r0.Z14316276734425062790.e(dir);
                return dir;
            case 3:
                ads_mobile_sdk.z1 z1Var = (ads_mobile_sdk.z1) hb1Var.a;
                dev.epro.r0.A7086841046085192465 a7086841046085192465 = new dev.epro.r0.A7086841046085192465();
                z1Var.getClass();
                return new ads_mobile_sdk.ai2(z1Var, a7086841046085192465, (byte) 0);
            case 4:
                ads_mobile_sdk.qw2 qw2Var = (ads_mobile_sdk.qw2) hb1Var.a;
                qw2Var.getClass();
                return qw2Var;
            case 5:
                dev.epro.r0.F7878618420024429111 f7878618420024429111 = (java.util.concurrent.ExecutorService) hb1Var.a;
                if (f7878618420024429111 instanceof dev.epro.r0.F7878618420024429111) {
                    return f7878618420024429111;
                }
                return f7878618420024429111 instanceof java.util.concurrent.ScheduledExecutorService ? new dev.epro.r0.P16070573589379482680((java.util.concurrent.ScheduledExecutorService) f7878618420024429111) : new dev.epro.r0.F7878618420024429111(f7878618420024429111);
            case 6:
                return new ads_mobile_sdk.di((android.content.Context) hb1Var.a);
            case 7:
                return new ads_mobile_sdk.gr((android.content.Context) hb1Var.a);
            case 8:
                ads_mobile_sdk.hv hvVar = (ads_mobile_sdk.hv) hb1Var.a;
                hvVar.getClass();
                return new ads_mobile_sdk.k00(hvVar, (byte) 4);
            case 9:
                dev.epro.r0.P16188089657974175786 p16188089657974175786 = (dev.epro.r0.U4857089234315512256) hb1Var.a;
                p16188089657974175786.getClass();
                if (p16188089657974175786 instanceof dev.epro.r0.P16188089657974175786) {
                }
                return dev.epro.r0.H15747516787109764287.a;
            case 10:
                ads_mobile_sdk.b71 b71Var = (ads_mobile_sdk.b71) hb1Var.a;
                b71Var.getClass();
                return b71Var;
            case 11:
                ads_mobile_sdk.b71 b71Var2 = (ads_mobile_sdk.b71) hb1Var.a;
                b71Var2.getClass();
                return b71Var2;
            case 12:
                return new ads_mobile_sdk.gm0((java.util.concurrent.ExecutorService) hb1Var.a);
            case 13:
                return new ads_mobile_sdk.d02((dev.epro.r0.X16599180054040010357) hb1Var.a);
            case 14:
                return new ads_mobile_sdk.nt2((dev.epro.r0.G16864365537574524285) hb1Var.a);
            case 15:
                return new ads_mobile_sdk.ol((dev.epro.r0.G16864365537574524285) hb1Var.a);
            case 16:
                return new ads_mobile_sdk.ib1((android.content.Context) hb1Var.a, (byte) 2);
            case 17:
                return new ads_mobile_sdk.ra1((android.content.Context) hb1Var.a);
            case 18:
                android.content.Context context = (android.content.Context) hb1Var.a;
                context.getClass();
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 128)) != null) {
                    i = packageInfo.versionCode;
                }
                return java.lang.Integer.valueOf(i);
            case 19:
                dev.epro.r0.G16864365537574524285 g16864365537574524285 = (dev.epro.r0.G16864365537574524285) hb1Var.a;
                g16864365537574524285.getClass();
                return new ads_mobile_sdk.k00(g16864365537574524285, (byte) 2);
            default:
                return new ads_mobile_sdk.xl(((java.lang.Boolean) hb1Var.a).booleanValue());
        }
    }
}
