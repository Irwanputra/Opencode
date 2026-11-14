package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q72827959762432836 extends Z14368087615735085238 {
    private static final Q72827959762432836 DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private N17666688112968464504 e_;
    private N17666688112968464504 n_;
    private F3441479435880239131 params_;
    private int version_;

    static {
        Q72827959762432836 q72827959762432836 = new Q72827959762432836();
        DEFAULT_INSTANCE = q72827959762432836;
        Z14368087615735085238.u(Q72827959762432836.class, q72827959762432836);
    }

    public Q72827959762432836() {
        M18082356575916498704 m18082356575916498704 = N17666688112968464504.b;
        this.n_ = m18082356575916498704;
        this.e_ = m18082356575916498704;
    }

    public static M6183017706206153362 B() {
        return (M6183017706206153362) DEFAULT_INSTANCE.h();
    }

    public static Q72827959762432836 C(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (Q72827959762432836) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static T3521423756786688980 D() {
        return DEFAULT_INSTANCE.l();
    }

    public static Q72827959762432836 w() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.version_;
    }

    public final void E(M18082356575916498704 m18082356575916498704) {
        this.e_ = m18082356575916498704;
    }

    public final void F(M18082356575916498704 m18082356575916498704) {
        this.n_ = m18082356575916498704;
    }

    public final void G(F3441479435880239131 f3441479435880239131) {
        this.params_ = f3441479435880239131;
        this.bitField0_ |= 1;
    }

    public final void H() {
        this.version_ = 0;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "n_", "e_"});
        }
        if (A == 3) {
            return new Q72827959762432836();
        }
        if (A == 4) {
            return new M6183017706206153362(DEFAULT_INSTANCE);
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
        synchronized (Q72827959762432836.class) {
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

    public final N17666688112968464504 x() {
        return this.e_;
    }

    public final N17666688112968464504 y() {
        return this.n_;
    }

    public final F3441479435880239131 z() {
        F3441479435880239131 f3441479435880239131 = this.params_;
        return f3441479435880239131 == null ? F3441479435880239131.w() : f3441479435880239131;
    }
}
