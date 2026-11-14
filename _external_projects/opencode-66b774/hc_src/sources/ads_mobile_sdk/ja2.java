package ads_mobile_sdk;

import android.content.Context;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
    /* renamed from: a */
    public final cw0 mo19a() {
        return cw0.PACKAGE_INFO;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    @Override // dev.epro.r0.K4548097313143615345
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r15) {
        /*
            r14 = this;
            ads_mobile_sdk.xu0 r15 = new ads_mobile_sdk.xu0
            ads_mobile_sdk.ia2 r0 = new ads_mobile_sdk.ia2
            android.content.Context r1 = r14.d
            r2 = r1
            java.lang.String r1 = r2.getPackageName()
            r1.getClass()
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            java.lang.String r4 = r2.getPackageName()
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r5)
            java.lang.String r3 = r3.versionName
            r4 = r2
            r2 = r3
            java.lang.Integer r3 = new java.lang.Integer
            int r5 = r14.e
            r3.<init>(r5)
            android.content.pm.PackageManager r6 = r4.getPackageManager()
            android.content.pm.ApplicationInfo r7 = r4.getApplicationInfo()
            java.lang.CharSequence r6 = r6.getApplicationLabel(r7)
            java.lang.String r6 = r6.toString()
            r7 = 30
            r8 = 0
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L60
            if (r9 < r7) goto L51
            android.content.pm.PackageManager r9 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L60
            android.content.pm.ApplicationInfo r10 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L60
            java.lang.String r10 = r10.packageName     // Catch: java.lang.Throwable -> L60
            android.content.pm.InstallSourceInfo r9 = dev.epro.r0.F11474578038339593445.b(r9, r10)     // Catch: java.lang.Throwable -> L60
            java.lang.String r9 = dev.epro.r0.F11474578038339593445.h(r9)     // Catch: java.lang.Throwable -> L60
            goto L61
        L51:
            android.content.pm.PackageManager r9 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L60
            android.content.pm.ApplicationInfo r10 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L60
            java.lang.String r10 = r10.packageName     // Catch: java.lang.Throwable -> L60
            java.lang.String r9 = r9.getInstallerPackageName(r10)     // Catch: java.lang.Throwable -> L60
            goto L61
        L60:
            r9 = r8
        L61:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L78
            if (r10 < r7) goto L78
            android.content.pm.PackageManager r7 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L78
            android.content.pm.ApplicationInfo r10 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L78
            java.lang.String r10 = r10.packageName     // Catch: java.lang.Throwable -> L78
            android.content.pm.InstallSourceInfo r7 = dev.epro.r0.F11474578038339593445.b(r7, r10)     // Catch: java.lang.Throwable -> L78
            java.lang.String r7 = dev.epro.r0.F11474578038339593445.l(r7)     // Catch: java.lang.Throwable -> L78
            goto L79
        L78:
            r7 = r8
        L79:
            java.lang.String r4 = r4.getPackageName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = ".android."
            r10.append(r5)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            dev.epro.r0.P5733283974459951585 r5 = ads_mobile_sdk.rw0.f
            ads_mobile_sdk.b41 r14 = r14.f
            dev.epro.r0.V10300877997588547986 r5 = r14.a()
            java.lang.String r10 = ""
            if (r5 == 0) goto La2
            java.lang.Object r5 = r5.b
            java.lang.String r5 = (java.lang.String) r5
            goto La3
        La2:
            r5 = r10
        La3:
            dev.epro.r0.H5336160545165318150 r11 = ads_mobile_sdk.rw0.h
            dev.epro.r0.U12307647644992999381 r5 = dev.epro.r0.H5336160545165318150.b(r11, r5)
            if (r5 == 0) goto Lb7
            dev.epro.r0.C8145984272139078584 r5 = r5.c
            r12 = 1
            dev.epro.r0.X13869420807587484607 r5 = r5.b(r12)
            if (r5 == 0) goto Lb7
            java.lang.String r5 = r5.a
            goto Lb8
        Lb7:
            r5 = r8
        Lb8:
            dev.epro.r0.V10300877997588547986 r14 = r14.a()
            if (r14 == 0) goto Lc3
            java.lang.Object r14 = r14.b
            r10 = r14
            java.lang.String r10 = (java.lang.String) r10
        Lc3:
            dev.epro.r0.U12307647644992999381 r14 = dev.epro.r0.H5336160545165318150.b(r11, r10)
            if (r14 == 0) goto Ld4
            dev.epro.r0.C8145984272139078584 r14 = r14.c
            r10 = 2
            dev.epro.r0.X13869420807587484607 r14 = r14.b(r10)
            if (r14 == 0) goto Ld4
            java.lang.String r8 = r14.a
        Ld4:
            r13 = r7
            r7 = r4
            r4 = r6
            r6 = r13
            r13 = r8
            r8 = r5
            r5 = r9
            r9 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ja2.d(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }
}
