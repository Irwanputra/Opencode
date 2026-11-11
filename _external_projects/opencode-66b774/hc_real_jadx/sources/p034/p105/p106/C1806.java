package p034.p105.p106;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import p034.p080.C1493;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1806 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final C1493<String, Class<?>> f8114 = new C1493<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Class<?> m3867(ClassLoader classLoader, String str) {
        C1493<String, Class<?>> c1493 = f8114;
        Class<?> orDefault = c1493.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        c1493.put(str, cls);
        return cls;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static Class<? extends Fragment> m3868(ClassLoader classLoader, String str) {
        try {
            return m3867(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.C0168(C2098.m4187("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.C0168(C2098.m4187("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Fragment mo3869(ClassLoader classLoader, String str) {
        try {
            return m3868(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new Fragment.C0168(C2098.m4187("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment.C0168(C2098.m4187("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.C0168(C2098.m4187("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.C0168(C2098.m4187("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
