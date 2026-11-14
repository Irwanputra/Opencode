package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H7795772807593257574 extends Z14368087615735085238 {
    private static final H7795772807593257574 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private F8305575804941370353 params_;
    private int version_;

    static {
        H7795772807593257574 h7795772807593257574 = new H7795772807593257574();
        DEFAULT_INSTANCE = h7795772807593257574;
        Z14368087615735085238.u(H7795772807593257574.class, h7795772807593257574);
    }

    public static H18069562553086718710 y() {
        return (H18069562553086718710) DEFAULT_INSTANCE.h();
    }

    public static H7795772807593257574 z(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (H7795772807593257574) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public final void A(F8305575804941370353 f8305575804941370353) {
        this.params_ = f8305575804941370353;
        this.bitField0_ |= 1;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (iA == 3) {
            return new H7795772807593257574();
        }
        if (iA == 4) {
            return new H18069562553086718710(DEFAULT_INSTANCE);
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
        synchronized (H7795772807593257574.class) {
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

    public final F8305575804941370353 w() {
        F8305575804941370353 f8305575804941370353 = this.params_;
        return f8305575804941370353 == null ? F8305575804941370353.w() : f8305575804941370353;
    }

    public final int x() {
        return this.version_;
    }
}
