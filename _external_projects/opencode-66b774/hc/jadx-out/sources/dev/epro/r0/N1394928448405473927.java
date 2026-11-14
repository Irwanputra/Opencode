package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N1394928448405473927 extends Z14368087615735085238 {
    private static final N1394928448405473927 DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 3;
    private int bitField0_;
    private int modulusSizeInBits_;
    private A17799468531942579103 params_;
    private N17666688112968464504 publicExponent_ = N17666688112968464504.b;

    static {
        N1394928448405473927 n1394928448405473927 = new N1394928448405473927();
        DEFAULT_INSTANCE = n1394928448405473927;
        Z14368087615735085238.u(N1394928448405473927.class, n1394928448405473927);
    }

    public static N1394928448405473927 A(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (N1394928448405473927) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static R5921012355334445092 z() {
        return (R5921012355334445092) DEFAULT_INSTANCE.h();
    }

    public final void B(int i) {
        this.modulusSizeInBits_ = i;
    }

    public final void C(A17799468531942579103 a17799468531942579103) {
        this.params_ = a17799468531942579103;
        this.bitField0_ |= 1;
    }

    public final void D(M18082356575916498704 m18082356575916498704) {
        this.publicExponent_ = m18082356575916498704;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"bitField0_", "params_", "modulusSizeInBits_", "publicExponent_"});
        }
        if (iA == 3) {
            return new N1394928448405473927();
        }
        if (iA == 4) {
            return new R5921012355334445092(DEFAULT_INSTANCE);
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
        synchronized (N1394928448405473927.class) {
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

    public final int w() {
        return this.modulusSizeInBits_;
    }

    public final A17799468531942579103 x() {
        A17799468531942579103 a17799468531942579103 = this.params_;
        return a17799468531942579103 == null ? A17799468531942579103.w() : a17799468531942579103;
    }

    public final N17666688112968464504 y() {
        return this.publicExponent_;
    }
}
