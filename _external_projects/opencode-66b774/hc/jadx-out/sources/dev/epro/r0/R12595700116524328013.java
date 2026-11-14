package dev.epro.r0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class R12595700116524328013 extends L10323767535443928457 {
    public final Class h;
    public final Constructor i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;
    public final Method n;

    public R12595700116524328013() throws NoSuchMethodException {
        Method methodC;
        Constructor<?> constructor;
        Method methodB;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodB = B(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodC = C(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodC = null;
            constructor = null;
            methodB = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.h = cls;
        this.i = constructor;
        this.j = methodB;
        this.k = method;
        this.l = method2;
        this.m = method3;
        this.n = methodC;
    }

    public static Method B(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean A(Object obj) {
        try {
            return ((Boolean) this.l.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method C(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // dev.epro.r0.L10323767535443928457, dev.epro.r0.Z14316276734425062790
    public final Typeface h(Context context, L933758655888641216 l933758655888641216, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (this.j == null) {
            return super.h(context, l933758655888641216, resources, i);
        }
        try {
            objNewInstance = this.i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            T13158771825442419349[] t13158771825442419349Arr = l933758655888641216.a;
            int length = t13158771825442419349Arr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    T13158771825442419349 t13158771825442419349 = t13158771825442419349Arr[i2];
                    String str = t13158771825442419349.a;
                    int i3 = t13158771825442419349.e;
                    int i4 = t13158771825442419349.b;
                    boolean z = t13158771825442419349.c;
                    FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(t13158771825442419349.d);
                    R12595700116524328013 r12595700116524328013 = this;
                    Context context2 = context;
                    if (r12595700116524328013.y(context2, objNewInstance, str, i3, i4, z ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                        i2++;
                        this = r12595700116524328013;
                        context = context2;
                    } else {
                        try {
                            r12595700116524328013.m.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else {
                    R12595700116524328013 r125957001165243280132 = this;
                    if (r125957001165243280132.A(objNewInstance)) {
                        return r125957001165243280132.z(objNewInstance);
                    }
                }
            }
        }
        return null;
    }

    @Override // dev.epro.r0.L10323767535443928457, dev.epro.r0.Z14316276734425062790
    public final Typeface i(Context context, J18236984568855953541[] j18236984568855953541Arr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceZ;
        boolean zBooleanValue;
        if (j18236984568855953541Arr.length >= 1) {
            try {
                if (this.j != null) {
                    HashMap map = new HashMap();
                    for (J18236984568855953541 j18236984568855953541 : j18236984568855953541Arr) {
                        if (j18236984568855953541.f == 0) {
                            Uri uri = j18236984568855953541.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, T1335862270807194835.m(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.i.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = j18236984568855953541Arr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method = this.m;
                            if (i2 < length) {
                                J18236984568855953541 j182369845688559535412 = j18236984568855953541Arr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(j182369845688559535412.a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.k.invoke(objNewInstance, byteBuffer, Integer.valueOf(j182369845688559535412.b), null, Integer.valueOf(j182369845688559535412.c), Integer.valueOf(j182369845688559535412.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z = true;
                                }
                                i2++;
                                z = z;
                            } else if (!z) {
                                method.invoke(objNewInstance, null);
                            } else if (A(objNewInstance) && (typefaceZ = z(objNewInstance)) != null) {
                                return Typeface.create(typefaceZ, i);
                            }
                        }
                    }
                } else {
                    J18236984568855953541 j18236984568855953541L = Z14316276734425062790.l(j18236984568855953541Arr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(j18236984568855953541L.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(j18236984568855953541L.c).setItalic(j18236984568855953541L.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // dev.epro.r0.Z14316276734425062790
    public final Typeface k(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (this.j == null) {
            return super.k(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!y(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.m.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (A(objNewInstance)) {
                return z(objNewInstance);
            }
        }
        return null;
    }

    public final boolean y(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.j.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface z(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.n.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
