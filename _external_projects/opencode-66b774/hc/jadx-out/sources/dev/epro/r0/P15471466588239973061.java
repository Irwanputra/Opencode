package dev.epro.r0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0092 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #7 {all -> 0x0087, blocks: (B:9:0x0074, B:13:0x0080, B:20:0x008c, B:23:0x0092, B:35:0x00b0, B:112:0x01ef, B:113:0x01f6, B:116:0x01f9, B:117:0x01fa, B:118:0x0201, B:135:0x024f, B:136:0x026d, B:119:0x0202, B:121:0x0219, B:123:0x0226, B:133:0x0247, B:134:0x024e, B:137:0x026e, B:138:0x02ad), top: B:161:0x0074, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.P15471466588239973061 a(android.content.Context r22, dev.epro.r0.Y2677586711477821327 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P15471466588239973061.a(android.content.Context, dev.epro.r0.Y2677586711477821327):dev.epro.r0.P15471466588239973061");
    }

    public static boolean b(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(g)) {
            return true;
        }
        boolean z = false;
        if (g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? SQLiteDatabase.CREATE_IF_NECESSARY : 0);
            if (G14026964626121631668.b.b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            g = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                e = true;
            }
        }
        return z;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a A[PHI: r3
      0x013a: PHI (r3v7 boolean) = (r3v6 boolean), (r3v9 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(android.content.Context r14, boolean r15, boolean r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P15471466588239973061.c(android.content.Context, boolean, boolean):int");
    }

    public static void d(ClassLoader classLoader) throws X12272829955313241581 {
        try {
            R11896167235527324698 r11896167235527324698 = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                r11896167235527324698 = iInterfaceQueryLocalInterface instanceof R11896167235527324698 ? (R11896167235527324698) iInterfaceQueryLocalInterface : new R11896167235527324698(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", (byte) 2);
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
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    t16829153131046880597 = iInterfaceQueryLocalInterface instanceof T16829153131046880597 ? (T16829153131046880597) iInterfaceQueryLocalInterface : new T16829153131046880597(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", (byte) 2);
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
