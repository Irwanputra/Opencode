package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class yo3 {
    public static final java.util.HashMap h = new java.util.HashMap();
    public final android.content.Context a;
    public final ads_mobile_sdk.wi0 b;
    public final ads_mobile_sdk.v6 c;
    public final ads_mobile_sdk.uo3 d;
    public final boolean e;
    public ads_mobile_sdk.cm1 f;
    public final java.lang.Object g = new java.lang.Object();

    public yo3(android.content.Context context, ads_mobile_sdk.wi0 wi0Var, ads_mobile_sdk.v6 v6Var, ads_mobile_sdk.uo3 uo3Var, boolean z) {
        this.a = context;
        this.b = wi0Var;
        this.c = v6Var;
        this.d = uo3Var;
        this.e = z;
    }

    public final ads_mobile_sdk.cm1 a(ads_mobile_sdk.fm2 fm2Var) throws java.lang.Throwable {
        java.lang.Class<?> clsLoadClass;
        java.io.FileInputStream fileInputStream;
        boolean zBooleanValue;
        int iIntValue;
        java.lang.Throwable th;
        java.io.FileInputStream fileInputStream2;
        synchronized (this) {
            try {
                ads_mobile_sdk.sm2 sm2Var = fm2Var.a;
                if (sm2Var == null) {
                    throw new ads_mobile_sdk.wo3("mc", 4010);
                }
                java.lang.String strR = sm2Var.r();
                java.util.HashMap map = h;
                clsLoadClass = (java.lang.Class) map.get(strR);
                fileInputStream = null;
                if (clsLoadClass == null) {
                    try {
                        ads_mobile_sdk.uo3 uo3Var = this.d;
                        java.io.File file = fm2Var.b;
                        uo3Var.getClass();
                        if (!ads_mobile_sdk.uo3.a(file)) {
                            throw new ads_mobile_sdk.wo3("VM did not pass signature verification", 2026);
                        }
                        try {
                            java.io.File file2 = fm2Var.c;
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            clsLoadClass = new dalvik.system.DexClassLoader(fm2Var.b.getAbsolutePath(), file2.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                            map.put(strR, clsLoadClass);
                        } catch (java.lang.ClassNotFoundException e) {
                            e = e;
                            throw new ads_mobile_sdk.wo3(2008, e);
                        } catch (java.lang.IllegalArgumentException e2) {
                            e = e2;
                            throw new ads_mobile_sdk.wo3(2008, e);
                        } catch (java.lang.SecurityException e3) {
                            e = e3;
                            throw new ads_mobile_sdk.wo3(2008, e);
                        }
                    } catch (java.security.GeneralSecurityException e4) {
                        throw new ads_mobile_sdk.wo3(2026, e4);
                    }
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = clsLoadClass.getDeclaredConstructor(android.content.Context.class, java.lang.String.class, byte[].class, java.lang.Object.class, android.os.Bundle.class, java.lang.Integer.TYPE);
            android.content.Context context = this.a;
            byte[] bArrC = fm2Var.e;
            if (bArrC == null) {
                try {
                    fileInputStream2 = new java.io.FileInputStream(fm2Var.d);
                } catch (java.io.IOException unused) {
                    fileInputStream2 = null;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
                try {
                    bArrC = ads_mobile_sdk.sq.a(fileInputStream2).c();
                    dev.epro.r0.K5751602218013079365.z(fileInputStream2);
                } catch (java.io.IOException unused2) {
                    dev.epro.r0.K5751602218013079365.z(fileInputStream2);
                    bArrC = null;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    fileInputStream = fileInputStream2;
                    dev.epro.r0.K5751602218013079365.z(fileInputStream);
                    throw th;
                }
                fm2Var.e = bArrC;
            }
            java.lang.Object objNewInstance = declaredConstructor.newInstance(context, "msa-r", bArrC == null ? null : java.util.Arrays.copyOf(bArrC, bArrC.length), null, new android.os.Bundle(), 2);
            ads_mobile_sdk.cm1 cm1Var = new ads_mobile_sdk.cm1(objNewInstance, this.b, this.c, this.e);
            synchronized (cm1Var) {
                try {
                    zBooleanValue = ((java.lang.Boolean) objNewInstance.getClass().getDeclaredMethod("init", null).invoke(objNewInstance, null)).booleanValue();
                } catch (java.lang.Exception e5) {
                    throw new ads_mobile_sdk.wo3(2001, e5);
                }
            }
            if (!zBooleanValue) {
                throw new ads_mobile_sdk.wo3("init failed", 4000);
            }
            synchronized (cm1Var) {
                try {
                    iIntValue = ((java.lang.Integer) objNewInstance.getClass().getDeclaredMethod("lcs", null).invoke(objNewInstance, null)).intValue();
                } catch (java.lang.Exception e6) {
                    throw new ads_mobile_sdk.wo3(2006, e6);
                }
            }
            if (iIntValue == 0) {
                return cm1Var;
            }
            throw new ads_mobile_sdk.wo3(dev.epro.r0.C468629748621011703.e(iIntValue, "ci: "), 4001);
        } catch (java.lang.Exception e7) {
            throw new ads_mobile_sdk.wo3(2004, e7);
        }
    }

    public final ads_mobile_sdk.cm1 a() {
        ads_mobile_sdk.cm1 cm1Var;
        synchronized (this.g) {
            cm1Var = this.f;
        }
        return cm1Var;
    }

    public final void a(ads_mobile_sdk.cm1 cm1Var) {
        synchronized (this.g) {
            ads_mobile_sdk.cm1 cm1Var2 = this.f;
            if (cm1Var2 != null) {
                try {
                    cm1Var2.a();
                } catch (ads_mobile_sdk.wo3 e) {
                    this.c.a(e.a, -1L, e);
                }
                this.f = cm1Var;
            } else {
                this.f = cm1Var;
            }
        }
    }
}
