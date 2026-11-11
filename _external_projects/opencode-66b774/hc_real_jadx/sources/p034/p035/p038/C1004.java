package p034.p035.p038;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1004 extends C1006 {
    @Override // p034.p035.p038.C1006
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public Typeface mo2329(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f5378, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f5381.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p034.p035.p038.C1006
    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public Method mo2330(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
