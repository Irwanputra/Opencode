package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F3441479435880239131 extends Z14368087615735085238 {
    private static final F3441479435880239131 DEFAULT_INSTANCE;
    public static final int MGF1_HASH_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int SALT_LENGTH_FIELD_NUMBER = 3;
    public static final int SIG_HASH_FIELD_NUMBER = 1;
    private int mgf1Hash_;
    private int saltLength_;
    private int sigHash_;

    static {
        F3441479435880239131 f3441479435880239131 = new F3441479435880239131();
        DEFAULT_INSTANCE = f3441479435880239131;
        Z14368087615735085238.u(F3441479435880239131.class, f3441479435880239131);
    }

    public static A10104759740373987939 A() {
        return (A10104759740373987939) DEFAULT_INSTANCE.h();
    }

    public static F3441479435880239131 w() {
        return DEFAULT_INSTANCE;
    }

    public final void B(S11983430735376301043 s11983430735376301043) {
        this.mgf1Hash_ = s11983430735376301043.b();
    }

    public final void C(int i) {
        this.saltLength_ = i;
    }

    public final void D(S11983430735376301043 s11983430735376301043) {
        this.sigHash_ = s11983430735376301043.b();
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"sigHash_", "mgf1Hash_", "saltLength_"});
        }
        if (A == 3) {
            return new F3441479435880239131();
        }
        if (A == 4) {
            return new A10104759740373987939(DEFAULT_INSTANCE);
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
        synchronized (F3441479435880239131.class) {
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

    public final S11983430735376301043 x() {
        S11983430735376301043 a = S11983430735376301043.a(this.mgf1Hash_);
        return a == null ? S11983430735376301043.UNRECOGNIZED : a;
    }

    public final int y() {
        return this.saltLength_;
    }

    public final S11983430735376301043 z() {
        S11983430735376301043 a = S11983430735376301043.a(this.sigHash_);
        return a == null ? S11983430735376301043.UNRECOGNIZED : a;
    }
}
