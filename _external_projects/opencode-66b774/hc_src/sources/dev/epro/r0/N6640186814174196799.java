package dev.epro.r0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N6640186814174196799 extends Z14316276734425062790 {
    public static final Class c;
    public static final Constructor d;
    public static final Method e;
    public static final Method f;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        d = constructor;
        c = cls;
        e = method2;
        f = method;
    }

    public static boolean w(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) e.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface x(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // dev.epro.r0.Z14316276734425062790
    public final Typeface h(Context context, L933758655888641216 l933758655888641216, Resources resources, int i) {
        Object obj;
        int i2;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (T13158771825442419349 t13158771825442419349 : l933758655888641216.a) {
                int i3 = t13158771825442419349.f;
                File l = T1335862270807194835.l(context);
                if (l != null) {
                    try {
                        if (T1335862270807194835.j(l, resources, i3)) {
                            try {
                                fileInputStream = new FileInputStream(l);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i2 = (mappedByteBuffer != null && w(obj, mappedByteBuffer, t13158771825442419349.e, t13158771825442419349.b, t13158771825442419349.c)) ? i2 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        l.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return x(obj);
        }
        return null;
    }

    @Override // dev.epro.r0.Z14316276734425062790
    public final Typeface i(Context context, J18236984568855953541[] j18236984568855953541Arr, int i) {
        Object obj;
        try {
            obj = d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            W929662112881511578 w929662112881511578 = new W929662112881511578(0);
            int length = j18236984568855953541Arr.length;
            while (true) {
                if (i2 < length) {
                    J18236984568855953541 j18236984568855953541 = j18236984568855953541Arr[i2];
                    Uri uri = j18236984568855953541.a;
                    ByteBuffer byteBuffer = (ByteBuffer) w929662112881511578.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = T1335862270807194835.m(context, uri);
                        w929662112881511578.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !w(obj, byteBuffer, j18236984568855953541.b, j18236984568855953541.c, j18236984568855953541.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface x = x(obj);
                    if (x != null) {
                        return Typeface.create(x, i);
                    }
                }
            }
        }
        return null;
    }
}
