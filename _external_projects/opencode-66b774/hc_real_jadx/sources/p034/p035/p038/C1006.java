package p034.p035.p038;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p034.p035.p038.C1007;
import p034.p035.p040.C1027;
import p034.p035.p043.p044.C1062;
import p034.p035.p043.p044.C1066;
import p034.p080.C1505;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1006 extends C1012 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final Constructor<?> f5377;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Class<?> f5378;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final Method f5379;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final Method f5380;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final Method f5381;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final Method f5382;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final Method f5383;

    public C1006() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = m2334(cls2);
            method4 = m2337(cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = mo2330(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f5378 = cls;
        this.f5377 = constructor;
        this.f5382 = method3;
        this.f5379 = method4;
        this.f5383 = method5;
        this.f5380 = method2;
        this.f5381 = method;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    private Object m2332() {
        try {
            return this.f5377.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p034.p035.p038.C1012, p034.p035.p038.C1007
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Typeface mo2333(Context context, CancellationSignal cancellationSignal, C1027.C1029[] c1029Arr, int i) {
        Typeface mo2329;
        boolean z;
        if (c1029Arr.length < 1) {
            return null;
        }
        if (!m2335()) {
            C1027.C1029 c1029 = (C1027.C1029) C1007.m2343(c1029Arr, i, new C1007.C1009(this));
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(c1029.f5435, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(c1029.f5434).setItalic(c1029.f5437).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable unused) {
                    }
                }
            } catch (IOException unused2) {
                return null;
            }
        }
        C1505<String, Typeface> c1505 = C1027.f5428;
        HashMap hashMap = new HashMap();
        for (C1027.C1029 c10292 : c1029Arr) {
            if (c10292.f5436 == 0) {
                Uri uri = c10292.f5435;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C2786.m4761(context, cancellationSignal, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object m2332 = m2332();
        if (m2332 == null) {
            return null;
        }
        boolean z2 = false;
        for (C1027.C1029 c10293 : c1029Arr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c10293.f5435);
            if (byteBuffer != null) {
                try {
                    z = ((Boolean) this.f5379.invoke(m2332, byteBuffer, Integer.valueOf(c10293.f5433), null, Integer.valueOf(c10293.f5434), Integer.valueOf(c10293.f5437 ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    z = false;
                }
                if (!z) {
                    m2341(m2332);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            m2341(m2332);
            return null;
        }
        if (m2340(m2332) && (mo2329 = mo2329(m2332)) != null) {
            return Typeface.create(mo2329, i);
        }
        return null;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public Method m2334(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final boolean m2335() {
        return this.f5382 != null;
    }

    @Override // p034.p035.p038.C1012, p034.p035.p038.C1007
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Typeface mo2336(Context context, C1062 c1062, Resources resources, int i) {
        if (!m2335()) {
            return super.mo2336(context, c1062, resources, i);
        }
        Object m2332 = m2332();
        if (m2332 == null) {
            return null;
        }
        for (C1066 c1066 : c1062.f5512) {
            if (!m2338(context, m2332, c1066.f5523, c1066.f5524, c1066.f5521, c1066.f5522 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c1066.f5526))) {
                m2341(m2332);
                return null;
            }
        }
        if (m2340(m2332)) {
            return mo2329(m2332);
        }
        return null;
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Method m2337(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final boolean m2338(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f5382.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: のぷのちつ */
    public Typeface mo2329(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f5378, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f5381.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: は〲ぱなで */
    public Method mo2330(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p034.p035.p038.C1007
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Typeface mo2339(Context context, Resources resources, int i, String str, int i2) {
        if (!m2335()) {
            return super.mo2339(context, resources, i, str, i2);
        }
        Object m2332 = m2332();
        if (m2332 == null) {
            return null;
        }
        if (!m2338(context, m2332, str, 0, -1, -1, null)) {
            m2341(m2332);
            return null;
        }
        if (m2340(m2332)) {
            return mo2329(m2332);
        }
        return null;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final boolean m2340(Object obj) {
        try {
            return ((Boolean) this.f5383.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final void m2341(Object obj) {
        try {
            this.f5380.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
