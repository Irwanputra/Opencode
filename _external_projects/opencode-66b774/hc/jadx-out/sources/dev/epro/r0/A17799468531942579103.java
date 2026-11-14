package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A17799468531942579103 extends Z14368087615735085238 {
    private static final A17799468531942579103 DEFAULT_INSTANCE;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile T3521423756786688980 PARSER;
    private int hashType_;

    static {
        A17799468531942579103 a17799468531942579103 = new A17799468531942579103();
        DEFAULT_INSTANCE = a17799468531942579103;
        Z14368087615735085238.u(A17799468531942579103.class, a17799468531942579103);
    }

    public static A17799468531942579103 w() {
        return DEFAULT_INSTANCE;
    }

    public static Z399515681477140191 y() {
        return (Z399515681477140191) DEFAULT_INSTANCE.h();
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"hashType_"});
        }
        if (iA == 3) {
            return new A17799468531942579103();
        }
        if (iA == 4) {
            return new Z399515681477140191(DEFAULT_INSTANCE);
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
        synchronized (A17799468531942579103.class) {
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

    public final S11983430735376301043 x() {
        S11983430735376301043 s11983430735376301043A = S11983430735376301043.a(this.hashType_);
        return s11983430735376301043A == null ? S11983430735376301043.UNRECOGNIZED : s11983430735376301043A;
    }

    public final void z(S11983430735376301043 s11983430735376301043) {
        this.hashType_ = s11983430735376301043.b();
    }
}
