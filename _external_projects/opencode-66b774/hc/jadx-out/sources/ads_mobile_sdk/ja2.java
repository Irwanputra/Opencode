package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import dev.epro.r0.H5336160545165318150;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.U12307647644992999381;
import dev.epro.r0.V10300877997588547986;
import dev.epro.r0.X13869420807587484607;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ja2 extends cc3 {
    public final Context d;
    public final int e;
    public final b41 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja2(Context context, int i, b41 b41Var) {
        super(null, 2);
        context.getClass();
        b41Var.getClass();
        this.d = context;
        this.e = i;
        this.f = b41Var;
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* JADX INFO: renamed from: a */
    public final cw0 mo19a() {
        return cw0.PACKAGE_INFO;
    }

    @Override // dev.epro.r0.K4548097313143615345
    public final Object d(R4833348786910499294 r4833348786910499294) {
        String installingPackageName;
        X13869420807587484607 x13869420807587484607B;
        X13869420807587484607 x13869420807587484607B2;
        Context context = this.d;
        String packageName = context.getPackageName();
        packageName.getClass();
        String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName;
        int i = this.e;
        Integer num = new Integer(i);
        String string = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        String str2 = null;
        try {
            installingPackageName = Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(context.getApplicationInfo().packageName).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(context.getApplicationInfo().packageName);
        } catch (Throwable unused) {
            installingPackageName = null;
        }
        String initiatingPackageName = Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(context.getApplicationInfo().packageName).getInitiatingPackageName() : null;
        String str3 = i + ".android." + context.getPackageName();
        P5733283974459951585 p5733283974459951585 = rw0.f;
        b41 b41Var = this.f;
        V10300877997588547986 v10300877997588547986A = b41Var.a();
        String str4 = v10300877997588547986A != null ? (String) v10300877997588547986A.b : "";
        H5336160545165318150 h5336160545165318150 = rw0.h;
        U12307647644992999381 u12307647644992999381B = H5336160545165318150.b(h5336160545165318150, str4);
        String str5 = (u12307647644992999381B == null || (x13869420807587484607B2 = u12307647644992999381B.c.b(1)) == null) ? null : x13869420807587484607B2.a;
        V10300877997588547986 v10300877997588547986A2 = b41Var.a();
        U12307647644992999381 u12307647644992999381B2 = H5336160545165318150.b(h5336160545165318150, v10300877997588547986A2 != null ? (String) v10300877997588547986A2.b : "");
        if (u12307647644992999381B2 != null && (x13869420807587484607B = u12307647644992999381B2.c.b(2)) != null) {
            str2 = x13869420807587484607B.a;
        }
        return new xu0(new ia2(packageName, str, num, string, installingPackageName, initiatingPackageName, str3, str5, str2));
    }
}
