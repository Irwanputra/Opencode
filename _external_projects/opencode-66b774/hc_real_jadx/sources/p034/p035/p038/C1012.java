package p034.p035.p038;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p034.p035.p038.C1007;
import p034.p035.p040.C1027;
import p034.p035.p043.p044.C1062;
import p034.p035.p043.p044.C1066;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1012 extends C1007 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Class<?> f5387;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static Constructor<?> f5388;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static Method f5389;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static boolean f5390;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static Method f5391;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static boolean m2353(Object obj, String str, int i, boolean z) {
        m2354();
        try {
            return ((Boolean) f5391.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static void m2354() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f5390) {
            return;
        }
        f5390 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            method = null;
            cls = null;
            method2 = null;
        }
        f5388 = constructor;
        f5387 = cls;
        f5391 = method2;
        f5389 = method;
    }

    @Override // p034.p035.p038.C1007
    /* renamed from: 〺つふすそ */
    public Typeface mo2333(Context context, CancellationSignal cancellationSignal, C1027.C1029[] c1029Arr, int i) {
        if (c1029Arr.length < 1) {
            return null;
        }
        C1027.C1029 c1029 = (C1027.C1029) C1007.m2343(c1029Arr, i, new C1007.C1009(this));
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(c1029.f5435, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                }
                return null;
            }
            try {
                File m2355 = m2355(openFileDescriptor);
                if (m2355 != null && m2355.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(m2355);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface mo2344 = mo2344(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return mo2344;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } finally {
                try {
                    openFileDescriptor.close();
                } catch (Throwable unused2) {
                }
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    @Override // p034.p035.p038.C1007
    /* renamed from: げつ〴ぬぐ */
    public Typeface mo2336(Context context, C1062 c1062, Resources resources, int i) {
        m2354();
        try {
            Object newInstance = f5388.newInstance(new Object[0]);
            for (C1066 c1066 : c1062.f5512) {
                File m4780 = C2786.m4780(context);
                if (m4780 == null) {
                    return null;
                }
                try {
                    if (!C2786.m4801(m4780, resources, c1066.f5525)) {
                        return null;
                    }
                    if (!m2353(newInstance, m4780.getPath(), c1066.f5521, c1066.f5522)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    m4780.delete();
                }
            }
            m2354();
            try {
                Object newInstance2 = Array.newInstance(f5387, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f5389.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final File m2355(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }
}
