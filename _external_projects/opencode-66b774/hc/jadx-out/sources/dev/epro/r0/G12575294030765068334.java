package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G12575294030765068334 extends Z14368087615735085238 {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final G12575294030765068334 DEFAULT_INSTANCE;
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
    private R17875891402928117061 publicKey_;
    private N17666688112968464504 q_;
    private int version_;

    static {
        G12575294030765068334 g12575294030765068334 = new G12575294030765068334();
        DEFAULT_INSTANCE = g12575294030765068334;
        Z14368087615735085238.u(G12575294030765068334.class, g12575294030765068334);
    }

    public G12575294030765068334() {
        M18082356575916498704 m18082356575916498704 = N17666688112968464504.b;
        this.d_ = m18082356575916498704;
        this.p_ = m18082356575916498704;
        this.q_ = m18082356575916498704;
        this.dp_ = m18082356575916498704;
        this.dq_ = m18082356575916498704;
        this.crt_ = m18082356575916498704;
    }

    public static Z15849841471700685356 E() {
        return (Z15849841471700685356) DEFAULT_INSTANCE.h();
    }

    public static G12575294030765068334 F(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (G12575294030765068334) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static T3521423756786688980 G() {
        return DEFAULT_INSTANCE.l();
    }

    public final N17666688112968464504 A() {
        return this.p_;
    }

    public final R17875891402928117061 B() {
        R17875891402928117061 r17875891402928117061 = this.publicKey_;
        return r17875891402928117061 == null ? R17875891402928117061.w() : r17875891402928117061;
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

    public final void M(R17875891402928117061 r17875891402928117061) {
        this.publicKey_ = r17875891402928117061;
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
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"bitField0_", "version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
        }
        if (iA == 3) {
            return new G12575294030765068334();
        }
        if (iA == 4) {
            return new Z15849841471700685356(DEFAULT_INSTANCE);
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
        synchronized (G12575294030765068334.class) {
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
