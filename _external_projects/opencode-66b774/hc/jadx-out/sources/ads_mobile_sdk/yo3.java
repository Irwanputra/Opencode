package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import dev.epro.r0.C468629748621011703;
import dev.epro.r0.K5751602218013079365;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class yo3 {
    public static final HashMap h = new HashMap();
    public final Context a;
    public final wi0 b;
    public final v6 c;
    public final uo3 d;
    public final boolean e;
    public cm1 f;
    public final Object g = new Object();

    public yo3(Context context, wi0 wi0Var, v6 v6Var, uo3 uo3Var, boolean z) {
        this.a = context;
        this.b = wi0Var;
        this.c = v6Var;
        this.d = uo3Var;
        this.e = z;
    }

    public final cm1 a(fm2 fm2Var) throws Throwable {
        Class<?> clsLoadClass;
        FileInputStream fileInputStream;
        boolean zBooleanValue;
        int iIntValue;
        Throwable th;
        FileInputStream fileInputStream2;
        synchronized (this) {
            try {
                sm2 sm2Var = fm2Var.a;
                if (sm2Var == null) {
                    throw new wo3("mc", 4010);
                }
                String strR = sm2Var.r();
                HashMap map = h;
                clsLoadClass = (Class) map.get(strR);
                fileInputStream = null;
                if (clsLoadClass == null) {
                    try {
                        uo3 uo3Var = this.d;
                        File file = fm2Var.b;
                        uo3Var.getClass();
                        if (!uo3.a(file)) {
                            throw new wo3("VM did not pass signature verification", 2026);
                        }
                        try {
                            File file2 = fm2Var.c;
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            clsLoadClass = new DexClassLoader(fm2Var.b.getAbsolutePath(), file2.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                            map.put(strR, clsLoadClass);
                        } catch (ClassNotFoundException e) {
                            e = e;
                            throw new wo3(2008, e);
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            throw new wo3(2008, e);
                        } catch (SecurityException e3) {
                            e = e3;
                            throw new wo3(2008, e);
                        }
                    } catch (GeneralSecurityException e4) {
                        throw new wo3(2026, e4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            Constructor<?> declaredConstructor = clsLoadClass.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE);
            Context context = this.a;
            byte[] bArrC = fm2Var.e;
            if (bArrC == null) {
                try {
                    fileInputStream2 = new FileInputStream(fm2Var.d);
                } catch (IOException unused) {
                    fileInputStream2 = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    bArrC = sq.a(fileInputStream2).c();
                    K5751602218013079365.z(fileInputStream2);
                } catch (IOException unused2) {
                    K5751602218013079365.z(fileInputStream2);
                    bArrC = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream = fileInputStream2;
                    K5751602218013079365.z(fileInputStream);
                    throw th;
                }
                fm2Var.e = bArrC;
            }
            Object objNewInstance = declaredConstructor.newInstance(context, "msa-r", bArrC == null ? null : Arrays.copyOf(bArrC, bArrC.length), null, new Bundle(), 2);
            cm1 cm1Var = new cm1(objNewInstance, this.b, this.c, this.e);
            synchronized (cm1Var) {
                try {
                    zBooleanValue = ((Boolean) objNewInstance.getClass().getDeclaredMethod("init", null).invoke(objNewInstance, null)).booleanValue();
                } catch (Exception e5) {
                    throw new wo3(2001, e5);
                }
            }
            if (!zBooleanValue) {
                throw new wo3("init failed", 4000);
            }
            synchronized (cm1Var) {
                try {
                    iIntValue = ((Integer) objNewInstance.getClass().getDeclaredMethod("lcs", null).invoke(objNewInstance, null)).intValue();
                } catch (Exception e6) {
                    throw new wo3(2006, e6);
                }
            }
            if (iIntValue == 0) {
                return cm1Var;
            }
            throw new wo3(C468629748621011703.e(iIntValue, "ci: "), 4001);
        } catch (Exception e7) {
            throw new wo3(2004, e7);
        }
    }

    public final cm1 a() {
        cm1 cm1Var;
        synchronized (this.g) {
            cm1Var = this.f;
        }
        return cm1Var;
    }

    public final void a(cm1 cm1Var) {
        synchronized (this.g) {
            cm1 cm1Var2 = this.f;
            if (cm1Var2 != null) {
                try {
                    cm1Var2.a();
                } catch (wo3 e) {
                    this.c.a(e.a, -1L, e);
                }
                this.f = cm1Var;
            } else {
                this.f = cm1Var;
            }
        }
    }
}
