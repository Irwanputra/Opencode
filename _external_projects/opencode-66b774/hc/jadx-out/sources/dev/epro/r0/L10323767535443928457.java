package dev.epro.r0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class L10323767535443928457 extends Z14316276734425062790 {
    public static Class c;
    public static Constructor d;
    public static Method e;
    public static Method f;
    public static boolean g;

    public static boolean w(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        x();
        try {
            return ((Boolean) e.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Q11088980322693754445.k(e2);
            return false;
        }
    }

    public static void x() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (g) {
            return;
        }
        g = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        d = constructor;
        c = cls;
        e = method2;
        f = method;
    }

    @Override // dev.epro.r0.Z14316276734425062790
    public Typeface h(Context context, L933758655888641216 l933758655888641216, Resources resources, int i) throws NoSuchMethodException {
        x();
        try {
            Object objNewInstance = d.newInstance(null);
            for (T13158771825442419349 t13158771825442419349 : l933758655888641216.a) {
                File fileL = T1335862270807194835.l(context);
                if (fileL == null) {
                    return null;
                }
                try {
                    if (!T1335862270807194835.j(fileL, resources, t13158771825442419349.f)) {
                        return null;
                    }
                    if (!w(objNewInstance, fileL.getPath(), t13158771825442419349.b, t13158771825442419349.c)) {
                        return null;
                    }
                    fileL.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileL.delete();
                }
            }
            x();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) c, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Q11088980322693754445.k(e2);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            Q11088980322693754445.k(e3);
            return null;
        }
    }

    @Override // dev.epro.r0.Z14316276734425062790
    public Typeface i(Context context, J18236984568855953541[] j18236984568855953541Arr, int i) {
        Typeface typefaceCreateFromFile;
        String str;
        if (j18236984568855953541Arr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(Z14316276734425062790.l(j18236984568855953541Arr, i).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile2;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        File fileL = T1335862270807194835.l(context);
                        if (fileL == null) {
                            typefaceCreateFromFile = null;
                        } else {
                            try {
                                if (T1335862270807194835.k(fileL, fileInputStream)) {
                                    typefaceCreateFromFile = Typeface.createFromFile(fileL.getPath());
                                    fileL.delete();
                                }
                            } catch (RuntimeException unused2) {
                            } catch (Throwable th) {
                                fileL.delete();
                                throw th;
                            }
                            fileL.delete();
                            typefaceCreateFromFile = null;
                        }
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
