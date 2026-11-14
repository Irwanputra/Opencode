package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q3437092356240588267 extends Z14368087615735085238 {
    private static final Q3437092356240588267 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private N17666688112968464504 keyValue_ = N17666688112968464504.b;
    private F8305575804941370353 params_;
    private int version_;

    static {
        Q3437092356240588267 q3437092356240588267 = new Q3437092356240588267();
        DEFAULT_INSTANCE = q3437092356240588267;
        Z14368087615735085238.u(Q3437092356240588267.class, q3437092356240588267);
    }

    public static Q3437092356240588267 A(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (Q3437092356240588267) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static I8444166898151492691 z() {
        return (I8444166898151492691) DEFAULT_INSTANCE.h();
    }

    public final void B(M18082356575916498704 m18082356575916498704) {
        this.keyValue_ = m18082356575916498704;
    }

    public final void C(F8305575804941370353 f8305575804941370353) {
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
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
        }
        if (A == 3) {
            return new Q3437092356240588267();
        }
        if (A == 4) {
            return new I8444166898151492691(DEFAULT_INSTANCE);
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
        synchronized (Q3437092356240588267.class) {
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

    public final N17666688112968464504 w() {
        return this.keyValue_;
    }

    public final F8305575804941370353 x() {
        F8305575804941370353 f8305575804941370353 = this.params_;
        return f8305575804941370353 == null ? F8305575804941370353.w() : f8305575804941370353;
    }

    public final int y() {
        return this.version_;
    }
}
