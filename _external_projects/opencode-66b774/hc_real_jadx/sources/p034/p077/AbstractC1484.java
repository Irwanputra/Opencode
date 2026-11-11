package p034.p077;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p034.p080.C1502;

/* renamed from: づざかべべ.ざっざへづ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1484 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1502<String, Method> f6860;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1502<String, Class> f6861;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C1502<String, Method> f6862;

    public AbstractC1484(C1502<String, Method> c1502, C1502<String, Method> c15022, C1502<String, Class> c15023) {
        this.f6862 = c1502;
        this.f6860 = c15022;
        this.f6861 = c15023;
    }

    /* renamed from: 〳ぜぞぜべっ */
    public abstract CharSequence mo3215();

    /* renamed from: 〺つふすそ */
    public abstract AbstractC1484 mo3216();

    /* renamed from: ぁごぐすすぃ */
    public abstract byte[] mo3217();

    /* renamed from: いいにぽつ */
    public abstract int mo3218();

    /* renamed from: ぇぬぎばつ */
    public abstract void mo3219(int i);

    /* renamed from: ぉざぅち〻 */
    public abstract void mo3220(boolean z);

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public <T extends InterfaceC1483> T m3231() {
        String mo3229 = mo3229();
        if (mo3229 == null) {
            return null;
        }
        try {
            return (T) m3235(mo3229).invoke(null, mo3216());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Class m3232(Class<? extends InterfaceC1483> cls) {
        Class orDefault = this.f6861.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f6861.put(cls.getName(), cls2);
        return cls2;
    }

    /* renamed from: げつ〴ぬぐ */
    public abstract void mo3221();

    /* renamed from: ごづごきえ */
    public abstract void mo3222(int i);

    /* renamed from: ざっざへづ */
    public abstract void mo3223(Parcelable parcelable);

    /* renamed from: ざとぅぼこ〺 */
    public abstract void mo3224(byte[] bArr);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Method m3233(Class cls) {
        Method orDefault = this.f6860.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class m3232 = m3232(cls);
        System.currentTimeMillis();
        Method declaredMethod = m3232.getDeclaredMethod("write", cls, AbstractC1484.class);
        this.f6860.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: てぜきぽく */
    public abstract <T extends Parcelable> T mo3225();

    /* renamed from: でどあくず */
    public abstract void mo3226(String str);

    /* renamed from: なぎぱいぢぎ */
    public abstract boolean mo3227();

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public <T extends Parcelable> T m3234(T t, int i) {
        return !mo3230(i) ? t : (T) mo3225();
    }

    /* renamed from: は〲ぱなで */
    public abstract void mo3228(CharSequence charSequence);

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Method m3235(String str) {
        Method orDefault = this.f6862.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1484.class.getClassLoader()).getDeclaredMethod("read", AbstractC1484.class);
        this.f6862.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public void m3236(InterfaceC1483 interfaceC1483) {
        if (interfaceC1483 == null) {
            mo3226(null);
            return;
        }
        try {
            mo3226(m3232(interfaceC1483.getClass()).getName());
            AbstractC1484 mo3216 = mo3216();
            try {
                m3233(interfaceC1483.getClass()).invoke(null, interfaceC1483, mo3216);
                mo3216.mo3221();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC1483.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }

    /* renamed from: へぬ〴づぞ */
    public abstract String mo3229();

    /* renamed from: ぺぁあねじ */
    public abstract boolean mo3230(int i);

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int m3237(int i, int i2) {
        return !mo3230(i2) ? i : mo3218();
    }
}
