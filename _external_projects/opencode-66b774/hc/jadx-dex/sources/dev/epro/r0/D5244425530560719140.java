package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D5244425530560719140 extends dev.epro.r0.Z14368087615735085238 {
    public static final int CURVE_FIELD_NUMBER = 2;
    private static final dev.epro.r0.D5244425530560719140 DEFAULT_INSTANCE;
    public static final int ENCODING_FIELD_NUMBER = 3;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile dev.epro.r0.T3521423756786688980 PARSER;
    private int curve_;
    private int encoding_;
    private int hashType_;

    static {
        dev.epro.r0.D5244425530560719140 d5244425530560719140 = new dev.epro.r0.D5244425530560719140();
        DEFAULT_INSTANCE = d5244425530560719140;
        dev.epro.r0.Z14368087615735085238.u(dev.epro.r0.D5244425530560719140.class, d5244425530560719140);
    }

    public static dev.epro.r0.L7689809548926709344 A() {
        return DEFAULT_INSTANCE.h();
    }

    public static dev.epro.r0.D5244425530560719140 x() {
        return DEFAULT_INSTANCE;
    }

    public final void B(dev.epro.r0.B7249449451241754434 b7249449451241754434) {
        this.curve_ = b7249449451241754434.a();
    }

    public final void C(dev.epro.r0.Q16312373854135020761 q16312373854135020761) {
        this.encoding_ = q16312373854135020761.a();
    }

    public final void D(dev.epro.r0.S11983430735376301043 s11983430735376301043) {
        this.hashType_ = s11983430735376301043.b();
    }

    public final java.lang.Object i(int i) {
        dev.epro.r0.T3521423756786688980 e1228818263435470419;
        int iA = dev.epro.r0.L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new dev.epro.r0.J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new java.lang.Object[]{"hashType_", "curve_", "encoding_"});
        }
        if (iA == 3) {
            return new dev.epro.r0.D5244425530560719140();
        }
        if (iA == 4) {
            return new dev.epro.r0.L7689809548926709344(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA != 6) {
            throw null;
        }
        dev.epro.r0.T3521423756786688980 t3521423756786688980 = PARSER;
        if (t3521423756786688980 != null) {
            return t3521423756786688980;
        }
        synchronized (dev.epro.r0.D5244425530560719140.class) {
            try {
                e1228818263435470419 = PARSER;
                if (e1228818263435470419 == null) {
                    e1228818263435470419 = new dev.epro.r0.E1228818263435470419();
                    PARSER = e1228818263435470419;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return e1228818263435470419;
    }

    public final dev.epro.r0.B7249449451241754434 w() {
        int i = this.curve_;
        dev.epro.r0.B7249449451241754434 b7249449451241754434 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : dev.epro.r0.B7249449451241754434.CURVE25519 : dev.epro.r0.B7249449451241754434.NIST_P521 : dev.epro.r0.B7249449451241754434.NIST_P384 : dev.epro.r0.B7249449451241754434.NIST_P256 : dev.epro.r0.B7249449451241754434.UNKNOWN_CURVE;
        return b7249449451241754434 == null ? dev.epro.r0.B7249449451241754434.UNRECOGNIZED : b7249449451241754434;
    }

    public final dev.epro.r0.Q16312373854135020761 y() {
        int i = this.encoding_;
        dev.epro.r0.Q16312373854135020761 q16312373854135020761 = i != 0 ? i != 1 ? i != 2 ? null : dev.epro.r0.Q16312373854135020761.d : dev.epro.r0.Q16312373854135020761.c : dev.epro.r0.Q16312373854135020761.b;
        return q16312373854135020761 == null ? dev.epro.r0.Q16312373854135020761.e : q16312373854135020761;
    }

    public final dev.epro.r0.S11983430735376301043 z() {
        dev.epro.r0.S11983430735376301043 s11983430735376301043A = dev.epro.r0.S11983430735376301043.a(this.hashType_);
        return s11983430735376301043A == null ? dev.epro.r0.S11983430735376301043.h : s11983430735376301043A;
    }
}
