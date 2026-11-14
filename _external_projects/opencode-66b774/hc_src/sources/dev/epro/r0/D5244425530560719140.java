package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D5244425530560719140 extends Z14368087615735085238 {
    public static final int CURVE_FIELD_NUMBER = 2;
    private static final D5244425530560719140 DEFAULT_INSTANCE;
    public static final int ENCODING_FIELD_NUMBER = 3;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile T3521423756786688980 PARSER;
    private int curve_;
    private int encoding_;
    private int hashType_;

    static {
        D5244425530560719140 d5244425530560719140 = new D5244425530560719140();
        DEFAULT_INSTANCE = d5244425530560719140;
        Z14368087615735085238.u(D5244425530560719140.class, d5244425530560719140);
    }

    public static L7689809548926709344 A() {
        return (L7689809548926709344) DEFAULT_INSTANCE.h();
    }

    public static D5244425530560719140 x() {
        return DEFAULT_INSTANCE;
    }

    public final void B(B7249449451241754434 b7249449451241754434) {
        this.curve_ = b7249449451241754434.a();
    }

    public final void C(Q16312373854135020761 q16312373854135020761) {
        this.encoding_ = q16312373854135020761.a();
    }

    public final void D(S11983430735376301043 s11983430735376301043) {
        this.hashType_ = s11983430735376301043.b();
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"hashType_", "curve_", "encoding_"});
        }
        if (A == 3) {
            return new D5244425530560719140();
        }
        if (A == 4) {
            return new L7689809548926709344(DEFAULT_INSTANCE);
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
        synchronized (D5244425530560719140.class) {
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

    public final B7249449451241754434 w() {
        int i = this.curve_;
        B7249449451241754434 b7249449451241754434 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : B7249449451241754434.CURVE25519 : B7249449451241754434.NIST_P521 : B7249449451241754434.NIST_P384 : B7249449451241754434.NIST_P256 : B7249449451241754434.UNKNOWN_CURVE;
        return b7249449451241754434 == null ? B7249449451241754434.UNRECOGNIZED : b7249449451241754434;
    }

    public final Q16312373854135020761 y() {
        int i = this.encoding_;
        Q16312373854135020761 q16312373854135020761 = i != 0 ? i != 1 ? i != 2 ? null : Q16312373854135020761.DER : Q16312373854135020761.IEEE_P1363 : Q16312373854135020761.UNKNOWN_ENCODING;
        return q16312373854135020761 == null ? Q16312373854135020761.UNRECOGNIZED : q16312373854135020761;
    }

    public final S11983430735376301043 z() {
        S11983430735376301043 a = S11983430735376301043.a(this.hashType_);
        return a == null ? S11983430735376301043.UNRECOGNIZED : a;
    }
}
