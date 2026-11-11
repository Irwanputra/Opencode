package p034.p035.p038;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
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
import p034.p035.p040.C1027;
import p034.p035.p043.p044.C1062;
import p034.p035.p043.p044.C1066;
import p034.p080.C1493;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1018 extends C1007 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final Class<?> f5404;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final Constructor<?> f5405;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final Method f5406;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final Method f5407;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            cls = null;
            method = null;
            method2 = null;
        }
        f5405 = constructor;
        f5404 = cls;
        f5407 = method2;
        f5406 = method;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static boolean m2360(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f5407.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static Typeface m2361(Object obj) {
        try {
            Object newInstance = Array.newInstance(f5404, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f5406.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p034.p035.p038.C1007
    /* renamed from: 〺つふすそ */
    public Typeface mo2333(Context context, CancellationSignal cancellationSignal, C1027.C1029[] c1029Arr, int i) {
        Object obj;
        try {
            obj = f5405.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C1493 c1493 = new C1493();
        for (C1027.C1029 c1029 : c1029Arr) {
            Uri uri = c1029.f5435;
            ByteBuffer byteBuffer = (ByteBuffer) c1493.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C2786.m4761(context, cancellationSignal, uri);
                c1493.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !m2360(obj, byteBuffer, c1029.f5433, c1029.f5434, c1029.f5437)) {
                return null;
            }
        }
        Typeface m2361 = m2361(obj);
        if (m2361 == null) {
            return null;
        }
        return Typeface.create(m2361, i);
    }

    @Override // p034.p035.p038.C1007
    /* renamed from: げつ〴ぬぐ */
    public Typeface mo2336(Context context, C1062 c1062, Resources resources, int i) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = f5405.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C1066 c1066 : c1062.f5512) {
            int i2 = c1066.f5525;
            File m4780 = C2786.m4780(context);
            if (m4780 != null) {
                try {
                    if (C2786.m4801(m4780, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(m4780);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused2) {
                                }
                                throw th;
                            }
                        } catch (IOException unused3) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !m2360(obj, mappedByteBuffer, c1066.f5524, c1066.f5521, c1066.f5522)) {
                            return null;
                        }
                    }
                } finally {
                    m4780.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return m2361(obj);
    }
}
