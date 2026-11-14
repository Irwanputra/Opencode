package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (A == 3) {
            return new H7795772807593257574();
        }
        if (A == 4) {
            return new H18069562553086718710(DEFAULT_INSTANCE);
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
        synchronized (H7795772807593257574.class) {
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

    public final F8305575804941370353 w() {
        F8305575804941370353 f8305575804941370353 = this.params_;
        return f8305575804941370353 == null ? F8305575804941370353.w() : f8305575804941370353;
    }

    public final int x() {
        return this.version_;
    }
}
