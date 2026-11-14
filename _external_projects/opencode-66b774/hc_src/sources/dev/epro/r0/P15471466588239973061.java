package dev.epro.r0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P15471466588239973061 {
    public static final Y2677586711477821327 b;
    public static Boolean c = null;
    public static String d = null;
    public static boolean e = false;
    public static int f = -1;
    public static Boolean g;
    public static final ThreadLocal h = new ThreadLocal();
    public static final H10984080903272140752 i = new H10984080903272140752(11);
    public static final O12545633033254628644 j;
    public static T16829153131046880597 k;
    public static R11896167235527324698 l;
    public final Context a;

    static {
        byte b2 = 17;
        j = new O12545633033254628644(b2);
        b = new Y2677586711477821327(b2);
    }

    public P15471466588239973061(Context context) {
        this.a = context;
    }

    public static P15471466588239973061 a(Context context, Y2677586711477821327 y2677586711477821327) {
        long j2;
        long j3;
        P15471466588239973061 p15471466588239973061;
        int i2;
        Boolean bool;
        N16696004871980921107 f2;
        R11896167235527324698 r11896167235527324698;
        boolean z;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new X12272829955313241581("null application Context");
        }
        ThreadLocal threadLocal = h;
        Z5962932947748475695 z5962932947748475695 = (Z5962932947748475695) threadLocal.get();
        Z5962932947748475695 z59629329477484756952 = new Z5962932947748475695();
        threadLocal.set(z59629329477484756952);
        H10984080903272140752 h10984080903272140752 = i;
        Long l2 = (Long) h10984080903272140752.get();
        long longValue = l2.longValue();
        try {
            j3 = 0;
            try {
                h10984080903272140752.set(Long.valueOf(SystemClock.uptimeMillis()));
                F14744793426222135532 e2 = y2677586711477821327.e(context, j);
                j2 = longValue;
                try {
                    new StringBuilder("com.google.android.gms.cronet_dynamite".length() + 26 + String.valueOf(e2.a).length() + 19 + "com.google.android.gms.cronet_dynamite".length() + 1 + String.valueOf(e2.b).length());
                    int i3 = e2.c;
                    if (i3 != 0) {
                        if (i3 == -1) {
                            if (e2.a != 0) {
                                i3 = -1;
                            }
                        }
                        if (i3 != 1 || e2.b != 0) {
                            if (i3 == -1) {
                                P15471466588239973061 p154714665882399730612 = new P15471466588239973061(applicationContext);
                                if (j2 == 0) {
                                    h10984080903272140752.remove();
                                } else {
                                    h10984080903272140752.set(l2);
                                }
                                Cursor cursor = z59629329477484756952.a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                threadLocal.set(z5962932947748475695);
                                return p154714665882399730612;
                            }
                            if (i3 != 1) {
                                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 36);
                                sb.append("VersionPolicy returned invalid code:");
                                sb.append(i3);
                                throw new X12272829955313241581(sb.toString());
                            }
                            try {
                                i2 = e2.b;
                            } catch (X12272829955313241581 e3) {
                                new StringBuilder(String.valueOf(e3.getMessage()).length() + 30);
                                int i4 = e2.a;
                                if (i4 == 0 || y2677586711477821327.e(context, new I7057640648465989778(i4)).c != -1) {
                                    throw new X12272829955313241581("Remote load failed. No local fallback found.", e3);
                                }
                                p15471466588239973061 = new P15471466588239973061(applicationContext);
                            }
                            try {
                                synchronized (P15471466588239973061.class) {
                                    if (!b(context)) {
                                        throw new X12272829955313241581("Remote loading disabled");
                                    }
                                    bool = c;
                                }
                                if (bool == null) {
                                    throw new X12272829955313241581("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    new StringBuilder("com.google.android.gms.cronet_dynamite".length() + 40 + String.valueOf(i2).length());
                                    synchronized (P15471466588239973061.class) {
                                        r11896167235527324698 = l;
                                    }
                                    if (r11896167235527324698 == null) {
                                        throw new X12272829955313241581("DynamiteLoaderV2 was not cached.");
                                    }
                                    Z5962932947748475695 z59629329477484756953 = (Z5962932947748475695) threadLocal.get();
                                    if (z59629329477484756953 == null || z59629329477484756953.a == null) {
                                        throw new X12272829955313241581("No result cursor");
                                    }
                                    Context applicationContext2 = context.getApplicationContext();
                                    Cursor cursor2 = z59629329477484756953.a;
                                    new F17886576884473518056(null);
                                    synchronized (P15471466588239973061.class) {
                                        z = f >= 2;
                                    }
                                    Context context2 = (Context) F17886576884473518056.e(z ? r11896167235527324698.f(new F17886576884473518056(applicationContext2), i2, new F17886576884473518056(cursor2)) : r11896167235527324698.e(new F17886576884473518056(applicationContext2), i2, new F17886576884473518056(cursor2)));
                                    if (context2 == null) {
                                        throw new X12272829955313241581("Failed to get module context");
                                    }
                                    p15471466588239973061 = new P15471466588239973061(context2);
                                } else {
                                    new StringBuilder("com.google.android.gms.cronet_dynamite".length() + 40 + String.valueOf(i2).length());
                                    T16829153131046880597 e4 = e(context);
                                    if (e4 == null) {
                                        throw new X12272829955313241581("Failed to create IDynamiteLoader.");
                                    }
                                    Parcel b2 = e4.b(e4.c(), 6);
                                    int readInt = b2.readInt();
                                    b2.recycle();
                                    if (readInt >= 3) {
                                        Z5962932947748475695 z59629329477484756954 = (Z5962932947748475695) threadLocal.get();
                                        if (z59629329477484756954 == null) {
                                            throw new X12272829955313241581("No cached result cursor holder");
                                        }
                                        f2 = e4.h(new F17886576884473518056(context), i2, new F17886576884473518056(z59629329477484756954.a));
                                    } else {
                                        f2 = readInt == 2 ? e4.f(new F17886576884473518056(context), i2) : e4.e(new F17886576884473518056(context), i2);
                                    }
                                    Object e5 = F17886576884473518056.e(f2);
                                    if (e5 == null) {
                                        throw new X12272829955313241581("Failed to load remote module.");
                                    }
                                    p15471466588239973061 = new P15471466588239973061((Context) e5);
                                }
                                if (j2 == 0) {
                                    i.remove();
                                } else {
                                    i.set(l2);
                                }
                                Cursor cursor3 = z59629329477484756952.a;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                h.set(z5962932947748475695);
                                return p15471466588239973061;
                            } catch (RemoteException e6) {
                                throw new X12272829955313241581("Failed to load remote module.", e6);
                            } catch (X12272829955313241581 e7) {
                                throw e7;
                            } catch (Throwable th) {
                                throw new X12272829955313241581("Failed to load remote module.", th);
                            }
                        }
                    }
                    int i5 = e2.a;
                    int i6 = e2.b;
                    StringBuilder sb2 = new StringBuilder("com.google.android.gms.cronet_dynamite".length() + 46 + String.valueOf(i5).length() + 23 + String.valueOf(i6).length() + 1);
                    sb2.append("No acceptable module com.google.android.gms.cronet_dynamite found. Local version is ");
                    sb2.append(i5);
                    sb2.append(" and remote version is ");
                    sb2.append(i6);
                    sb2.append(".");
                    throw new X12272829955313241581(sb2.toString());
                } catch (Throwable th2) {
                    th = th2;
                    if (j2 == j3) {
                        i.remove();
                    } else {
                        i.set(l2);
                    }
                    Cursor cursor4 = z59629329477484756952.a;
                    if (cursor4 != null) {
                        cursor4.close();
                    }
                    h.set(z5962932947748475695);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j2 = longValue;
            }
        } catch (Throwable th4) {
            th = th4;
            j2 = longValue;
            j3 = 0;
        }
    }

    public static boolean b(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(g)) {
            return true;
        }
        boolean z = false;
        if (g == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? SQLiteDatabase.CREATE_IF_NECESSARY : 0);
            if (G14026964626121631668.b.b(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            g = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                e = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r7 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(android.content.Context r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P15471466588239973061.c(android.content.Context, boolean, boolean):int");
    }

    public static void d(ClassLoader classLoader) {
        try {
            R11896167235527324698 r11896167235527324698 = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                r11896167235527324698 = queryLocalInterface instanceof R11896167235527324698 ? (R11896167235527324698) queryLocalInterface : new R11896167235527324698(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", (byte) 2);
            }
            l = r11896167235527324698;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new X12272829955313241581("Failed to instantiate dynamite loader", e2);
        }
    }

    public static T16829153131046880597 e(Context context) {
        T16829153131046880597 t16829153131046880597;
        synchronized (P15471466588239973061.class) {
            T16829153131046880597 t168291531310468805972 = k;
            if (t168291531310468805972 != null) {
                return t168291531310468805972;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    t16829153131046880597 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    t16829153131046880597 = queryLocalInterface instanceof T16829153131046880597 ? (T16829153131046880597) queryLocalInterface : new T16829153131046880597(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", (byte) 2);
                }
                if (t16829153131046880597 != null) {
                    k = t16829153131046880597;
                    return t16829153131046880597;
                }
            } catch (Exception e2) {
                new StringBuilder(String.valueOf(e2.getMessage()).length() + 45);
            }
            return null;
        }
    }
}
