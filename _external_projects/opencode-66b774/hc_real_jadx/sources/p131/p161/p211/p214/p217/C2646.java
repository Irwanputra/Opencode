package p131.p161.p211.p214.p217;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import p131.p161.p211.C2543;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.びえぁぜい.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2646 extends AbstractC2645 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static Class f10102;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Object f10103;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Field f10104;

    public C2646() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f10102 = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f10103 = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f10104 = field;
    }

    @Override // p131.p161.p211.p214.p217.AbstractC2645
    /* renamed from: げつ〴ぬぐ */
    public void mo4631(AccessibleObject accessibleObject) {
        boolean z = false;
        if (this.f10103 != null && this.f10104 != null) {
            try {
                f10102.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f10103, accessibleObject, Long.valueOf(((Long) f10102.getMethod("objectFieldOffset", Field.class).invoke(this.f10103, this.f10104)).longValue()), Boolean.TRUE);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            throw new C2543("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
        }
    }
}
