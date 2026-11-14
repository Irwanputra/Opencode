package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z12609019287898357344 extends Z14368087615735085238 {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final Z12609019287898357344 DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private N17666688112968464504 crt_;
    private N17666688112968464504 d_;
    private N17666688112968464504 dp_;
    private N17666688112968464504 dq_;
    private N17666688112968464504 p_;
    private Q72827959762432836 publicKey_;
    private N17666688112968464504 q_;
    private int version_;

    static {
        Z12609019287898357344 z12609019287898357344 = new Z12609019287898357344();
        DEFAULT_INSTANCE = z12609019287898357344;
        Z14368087615735085238.u(Z12609019287898357344.class, z12609019287898357344);
    }

    public Z12609019287898357344() {
        M18082356575916498704 m18082356575916498704 = N17666688112968464504.b;
        this.d_ = m18082356575916498704;
        this.p_ = m18082356575916498704;
        this.q_ = m18082356575916498704;
        this.dp_ = m18082356575916498704;
        this.dq_ = m18082356575916498704;
        this.crt_ = m18082356575916498704;
    }

    public static H15818187907860935149 E() {
        return (H15818187907860935149) DEFAULT_INSTANCE.h();
    }

    public static Z12609019287898357344 F(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (Z12609019287898357344) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static T3521423756786688980 G() {
        return DEFAULT_INSTANCE.l();
    }

    public final N17666688112968464504 A() {
        return this.p_;
    }

    public final Q72827959762432836 B() {
        Q72827959762432836 q72827959762432836 = this.publicKey_;
        return q72827959762432836 == null ? Q72827959762432836.w() : q72827959762432836;
    }

    public final N17666688112968464504 C() {
        return this.q_;
    }

    public final int D() {
        return this.version_;
    }

    public final void H(M18082356575916498704 m18082356575916498704) {
        this.crt_ = m18082356575916498704;
    }

    public final void I(M18082356575916498704 m18082356575916498704) {
        this.d_ = m18082356575916498704;
    }

    public final void J(M18082356575916498704 m18082356575916498704) {
        this.dp_ = m18082356575916498704;
    }

    public final void K(M18082356575916498704 m18082356575916498704) {
        this.dq_ = m18082356575916498704;
    }

    public final void L(M18082356575916498704 m18082356575916498704) {
        this.p_ = m18082356575916498704;
    }

    public final void M(Q72827959762432836 q72827959762432836) {
        this.publicKey_ = q72827959762432836;
        this.bitField0_ |= 1;
    }

    public final void N(M18082356575916498704 m18082356575916498704) {
        this.q_ = m18082356575916498704;
    }

    public final void O() {
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
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"bitField0_", "version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
        }
        if (A == 3) {
            return new Z12609019287898357344();
        }
        if (A == 4) {
            return new H15818187907860935149(DEFAULT_INSTANCE);
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
        synchronized (Z12609019287898357344.class) {
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
        return this.crt_;
    }

    public final N17666688112968464504 x() {
        return this.d_;
    }

    public final N17666688112968464504 y() {
        return this.dp_;
    }

    public final N17666688112968464504 z() {
        return this.dq_;
    }
}
