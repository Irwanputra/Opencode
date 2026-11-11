package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;
import p131.p161.p162.p193.p204.C2460;
import p131.p161.p162.p193.p204.C2461;
import p131.p161.p162.p193.p204.C2462;
import p131.p161.p162.p193.p204.C2463;
import p131.p161.p162.p193.p204.C2464;
import p131.p161.p162.p193.p204.C2467;
import p131.p161.p162.p193.p204.InterfaceC2459;
import p131.p161.p162.p193.p204.InterfaceC2465;
import p131.p161.p162.p193.p204.InterfaceC2466;
import p131.p161.p162.p193.p205.C2518;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class DynamiteModule {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Boolean f2872;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static InterfaceC2465 f2874;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static String f2875;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static InterfaceC2459 f2877;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f2878;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final ThreadLocal<C0383> f2876 = new ThreadLocal<>();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final InterfaceC2466 f2873 = new C2463();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final InterfaceC0384 f2871 = new C2460();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$〺つふすそ, reason: contains not printable characters */
    public static class C0381 implements InterfaceC2466 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int f2879;

        public C0381(int i) {
            this.f2879 = i;
        }

        @Override // p131.p161.p162.p193.p204.InterfaceC2466
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int mo1255(Context context, String str) {
            return this.f2879;
        }

        @Override // p131.p161.p162.p193.p204.InterfaceC2466
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int mo1256(Context context, String str, boolean z) {
            return 0;
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0382 extends Exception {
        public C0382(String str, C2463 c2463) {
            super(str);
        }

        public C0382(String str, Throwable th, C2463 c2463) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0383 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Cursor f2880;

        public C0383() {
        }

        public C0383(C2463 c2463) {
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$びぐびあび, reason: contains not printable characters */
    public interface InterfaceC0384 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        C2464 mo1257(Context context, String str, InterfaceC2466 interfaceC2466);
    }

    public DynamiteModule(Context context) {
        if (context == null) {
            throw new NullPointerException("null reference");
        }
        this.f2878 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m1246(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            if (r10 == 0) goto La
            java.lang.String r8 = "api_force_staging"
            goto Lc
        La:
            java.lang.String r8 = "api"
        Lc:
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            int r2 = r2 + 1
            int r3 = r8.length()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            int r2 = r2 + r3
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            r3.append(r10)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            r3.append(r8)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            java.lang.String r8 = "/"
            r3.append(r8)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            r3.append(r9)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            if (r8 == 0) goto L83
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7e
            if (r9 == 0) goto L83
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7e
            if (r9 <= 0) goto L73
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7e
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.dynamite.DynamiteModule.f2875 = r1     // Catch: java.lang.Throwable -> L70
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L70
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$げつ〴ぬぐ> r10 = com.google.android.gms.dynamite.DynamiteModule.f2876     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7e
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7e
            com.google.android.gms.dynamite.DynamiteModule$げつ〴ぬぐ r10 = (com.google.android.gms.dynamite.DynamiteModule.C0383) r10     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7e
            if (r10 == 0) goto L73
            android.database.Cursor r1 = r10.f2880     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7e
            if (r1 != 0) goto L73
            r10.f2880 = r8     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7e
            goto L74
        L70:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L70
            throw r9     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7e
        L73:
            r0 = r8
        L74:
            if (r0 == 0) goto L79
            r0.close()
        L79:
            return r9
        L7a:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L9e
        L7e:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L8f
        L83:
            com.google.android.gms.dynamite.DynamiteModule$くし〴〺ぅ r9 = new com.google.android.gms.dynamite.DynamiteModule$くし〴〺ぅ     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7e
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7e
            throw r9     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7e
        L8b:
            r8 = move-exception
            goto L9e
        L8d:
            r8 = move-exception
            r9 = r0
        L8f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.C0382     // Catch: java.lang.Throwable -> L9c
            if (r10 == 0) goto L94
            throw r8     // Catch: java.lang.Throwable -> L9c
        L94:
            com.google.android.gms.dynamite.DynamiteModule$くし〴〺ぅ r10 = new com.google.android.gms.dynamite.DynamiteModule$くし〴〺ぅ     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch: java.lang.Throwable -> L9c
            throw r10     // Catch: java.lang.Throwable -> L9c
        L9c:
            r8 = move-exception
            r0 = r9
        L9e:
            if (r0 == 0) goto La3
            r0.close()
        La3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m1246(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static DynamiteModule m1247(Context context, String str, int i) {
        Boolean bool;
        InterfaceC2459 interfaceC2459;
        Context context2;
        synchronized (DynamiteModule.class) {
            bool = f2872;
        }
        if (bool == null) {
            throw new C0382("Failed to determine which loading route to use.", null);
        }
        if (!bool.booleanValue()) {
            String.valueOf(str).length();
            InterfaceC2465 m1248 = m1248(context);
            if (m1248 == null) {
                throw new C0382("Failed to create IDynamiteLoader.", null);
            }
            try {
                InterfaceC2455 mo4505 = m1248.mo4505(new BinderC2454(context), str, i);
                if (BinderC2454.m4502(mo4505) != null) {
                    return new DynamiteModule((Context) BinderC2454.m4502(mo4505));
                }
                throw new C0382("Failed to load remote module.", null);
            } catch (RemoteException e) {
                throw new C0382("Failed to load remote module.", e, null);
            }
        }
        String.valueOf(str).length();
        synchronized (DynamiteModule.class) {
            interfaceC2459 = f2877;
        }
        if (interfaceC2459 == null) {
            throw new C0382("DynamiteLoaderV2 was not cached.", null);
        }
        C0383 c0383 = f2876.get();
        if (c0383 == null || c0383.f2880 == null) {
            throw new C0382("No result cursor", null);
        }
        try {
            context2 = (Context) BinderC2454.m4502(interfaceC2459.mo4504(new BinderC2454(context.getApplicationContext()), str, i, new BinderC2454(c0383.f2880)));
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.toString());
            if (valueOf.length() != 0) {
                "Failed to load DynamiteLoader: ".concat(valueOf);
            } else {
                new String("Failed to load DynamiteLoader: ");
            }
            context2 = null;
        }
        if (context2 != null) {
            return new DynamiteModule(context2);
        }
        throw new C0382("Failed to get module context", null);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static InterfaceC2465 m1248(Context context) {
        InterfaceC2465 c2461;
        synchronized (DynamiteModule.class) {
            InterfaceC2465 interfaceC2465 = f2874;
            if (interfaceC2465 != null) {
                return interfaceC2465;
            }
            if (C2518.f9865.m4531(context) != 0) {
                return null;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c2461 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c2461 = queryLocalInterface instanceof InterfaceC2465 ? (InterfaceC2465) queryLocalInterface : new C2461(iBinder);
                }
                if (c2461 != null) {
                    f2874 = c2461;
                    return c2461;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf);
                } else {
                    new String("Failed to load IDynamiteLoader from GmsCore: ");
                }
            }
            return null;
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m1249(ClassLoader classLoader) {
        InterfaceC2459 c2467;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c2467 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c2467 = queryLocalInterface instanceof InterfaceC2459 ? (InterfaceC2459) queryLocalInterface : new C2467(iBinder);
            }
            f2877 = c2467;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C0382("Failed to instantiate dynamite loader", e, null);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static DynamiteModule m1250(Context context, InterfaceC0384 interfaceC0384, String str) {
        ThreadLocal<C0383> threadLocal = f2876;
        C0383 c0383 = threadLocal.get();
        C0383 c03832 = new C0383(null);
        threadLocal.set(c03832);
        try {
            C2464 mo1257 = interfaceC0384.mo1257(context, str, f2873);
            int i = mo1257.f9806;
            str.length();
            str.length();
            int i2 = mo1257.f9805;
            if (i2 == 0 || ((i2 == -1 && mo1257.f9806 == 0) || (i2 == 1 && mo1257.f9804 == 0))) {
                int i3 = mo1257.f9806;
                int i4 = mo1257.f9804;
                StringBuilder sb = new StringBuilder(91);
                sb.append("No acceptable module found. Local version is ");
                sb.append(i3);
                sb.append(" and remote version is ");
                sb.append(i4);
                sb.append(".");
                throw new C0382(sb.toString(), null);
            }
            if (i2 == -1) {
                DynamiteModule m1251 = m1251(context, str);
                Cursor cursor = c03832.f2880;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(c0383);
                return m1251;
            }
            if (i2 != 1) {
                int i5 = mo1257.f9805;
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("VersionPolicy returned invalid code:");
                sb2.append(i5);
                throw new C0382(sb2.toString(), null);
            }
            try {
                DynamiteModule m1247 = m1247(context, str, mo1257.f9804);
                Cursor cursor2 = c03832.f2880;
                if (cursor2 != null) {
                    cursor2.close();
                }
                threadLocal.set(c0383);
                return m1247;
            } catch (C0382 e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Failed to load remote module: ".concat(valueOf);
                } else {
                    new String("Failed to load remote module: ");
                }
                int i6 = mo1257.f9806;
                if (i6 == 0 || interfaceC0384.mo1257(context, str, new C0381(i6)).f9805 != -1) {
                    throw new C0382("Remote load failed. No local fallback found.", e, null);
                }
                DynamiteModule m12512 = m1251(context, str);
                Cursor cursor3 = c03832.f2880;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f2876.set(c0383);
                return m12512;
            }
        } catch (Throwable th) {
            Cursor cursor4 = c03832.f2880;
            if (cursor4 != null) {
                cursor4.close();
            }
            f2876.set(c0383);
            throw th;
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static DynamiteModule m1251(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        } else {
            new String("Selected local version of ");
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static int m1252(Context context, String str, boolean z) {
        Class<?> loadClass;
        Field declaredField;
        Boolean bool;
        synchronized (DynamiteModule.class) {
            Boolean bool2 = f2872;
            if (bool2 == null) {
                try {
                    loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                    declaredField = loadClass.getDeclaredField("sClassLoader");
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                    String.valueOf(e).length();
                    bool2 = Boolean.FALSE;
                }
                synchronized (loadClass) {
                    ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                    if (classLoader != null) {
                        if (classLoader != ClassLoader.getSystemClassLoader()) {
                            try {
                                m1249(classLoader);
                            } catch (C0382 unused) {
                            }
                            bool = Boolean.TRUE;
                            bool2 = bool;
                            f2872 = bool2;
                        }
                    } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                    } else {
                        try {
                            int m1246 = m1246(context, str, z);
                            String str2 = f2875;
                            if (str2 != null && !str2.isEmpty()) {
                                C2462 c2462 = new C2462(f2875, ClassLoader.getSystemClassLoader());
                                m1249(c2462);
                                declaredField.set(null, c2462);
                                f2872 = Boolean.TRUE;
                                return m1246;
                            }
                            return m1246;
                        } catch (C0382 unused2) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                        }
                    }
                    bool = Boolean.FALSE;
                    bool2 = bool;
                    f2872 = bool2;
                }
            }
            if (bool2.booleanValue()) {
                try {
                    return m1246(context, str, z);
                } catch (C0382 e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    if (valueOf.length() != 0) {
                        "Failed to retrieve remote module version: ".concat(valueOf);
                    } else {
                        new String("Failed to retrieve remote module version: ");
                    }
                    return 0;
                }
            }
            InterfaceC2465 m1248 = m1248(context);
            if (m1248 == null) {
                return 0;
            }
            try {
                return m1248.mo4506(new BinderC2454(context), str, z);
            } catch (RemoteException e3) {
                String valueOf2 = String.valueOf(e3.getMessage());
                if (valueOf2.length() != 0) {
                    "Failed to retrieve remote module version: ".concat(valueOf2);
                    return 0;
                }
                new String("Failed to retrieve remote module version: ");
                return 0;
            }
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static int m1253(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder("com.google.android.gms.dynamite.descriptors.".length() + 1 + String.valueOf(str).length() + "ModuleDescriptor".length());
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null)).length();
            String.valueOf(str).length();
            return 0;
        } catch (ClassNotFoundException unused) {
            String.valueOf(str).length();
            return 0;
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Failed to load module descriptor class: ".concat(valueOf);
            } else {
                new String("Failed to load module descriptor class: ");
            }
            return 0;
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final IBinder m1254(String str) {
        try {
            return (IBinder) this.f2878.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new C0382(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e, null);
        }
    }
}
