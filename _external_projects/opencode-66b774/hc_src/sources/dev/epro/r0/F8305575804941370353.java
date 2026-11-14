package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F8305575804941370353 extends Z14368087615735085238 {
    private static final F8305575804941370353 DEFAULT_INSTANCE;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int SALT_SIZE_FIELD_NUMBER = 1;
    private int saltSize_;

    static {
        F8305575804941370353 f8305575804941370353 = new F8305575804941370353();
        DEFAULT_INSTANCE = f8305575804941370353;
        Z14368087615735085238.u(F8305575804941370353.class, f8305575804941370353);
    }

    public static F8305575804941370353 w() {
        return DEFAULT_INSTANCE;
    }

    public static R10365513111800052132 y() {
        return (R10365513111800052132) DEFAULT_INSTANCE.h();
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"saltSize_"});
        }
        if (A == 3) {
            return new F8305575804941370353();
        }
        if (A == 4) {
            return new R10365513111800052132(DEFAULT_INSTANCE);
        }
        if (A == 5) {
            return DEFAULT_INSTANCE;
        }
        if (A != 6) {
            throw null;
        }
        T3521423756786688980 t35214237567866889802 = PARSER;
        if (t35214237567866889802 != null) {
            return t35214237567866889802;
        }
        synchronized (F8305575804941370353.class) {
            try {
                t3521423756786688980 = PARSER;
                if (t3521423756786688980 == null) {
                    t3521423756786688980 = new E1228818263435470419();
                    PARSER = t3521423756786688980;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t3521423756786688980;
    }

    public final int x() {
        return this.saltSize_;
    }

    public final void z(int i) {
        this.saltSize_ = i;
    }
}
