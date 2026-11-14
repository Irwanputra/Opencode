package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z5675989004712055979 extends Z14368087615735085238 {
    private static final Z5675989004712055979 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private N17666688112968464504 keyValue_ = N17666688112968464504.b;
    private C11426265104635982771 publicKey_;
    private int version_;

    static {
        Z5675989004712055979 z5675989004712055979 = new Z5675989004712055979();
        DEFAULT_INSTANCE = z5675989004712055979;
        Z14368087615735085238.u(Z5675989004712055979.class, z5675989004712055979);
    }

    public static Z5675989004712055979 A(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (Z5675989004712055979) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static T3521423756786688980 B() {
        return DEFAULT_INSTANCE.l();
    }

    public static O17837525504276300577 z() {
        return (O17837525504276300577) DEFAULT_INSTANCE.h();
    }

    public final void C(M18082356575916498704 m18082356575916498704) {
        this.keyValue_ = m18082356575916498704;
    }

    public final void D(C11426265104635982771 c11426265104635982771) {
        this.publicKey_ = c11426265104635982771;
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
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "publicKey_"});
        }
        if (iA == 3) {
            return new Z5675989004712055979();
        }
        if (iA == 4) {
            return new O17837525504276300577(DEFAULT_INSTANCE);
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
        synchronized (Z5675989004712055979.class) {
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
        return this.keyValue_;
    }

    public final C11426265104635982771 x() {
        C11426265104635982771 c11426265104635982771 = this.publicKey_;
        return c11426265104635982771 == null ? C11426265104635982771.w() : c11426265104635982771;
    }

    public final int y() {
        return this.version_;
    }
}
