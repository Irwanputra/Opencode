package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"saltSize_"});
        }
        if (iA == 3) {
            return new F8305575804941370353();
        }
        if (iA == 4) {
            return new R10365513111800052132(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA != 6) {
            throw null;
        }
        T3521423756786688980 t3521423756786688980 = PARSER;
        if (t3521423756786688980 != null) {
            return t3521423756786688980;
        }
        synchronized (F8305575804941370353.class) {
            try {
                e1228818263435470419 = PARSER;
                if (e1228818263435470419 == null) {
                    e1228818263435470419 = new E1228818263435470419();
                    PARSER = e1228818263435470419;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e1228818263435470419;
    }

    public final int x() {
        return this.saltSize_;
    }

    public final void z(int i) {
        this.saltSize_ = i;
    }
}
