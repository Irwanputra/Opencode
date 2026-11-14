package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A17799468531942579103 extends dev.epro.r0.Z14368087615735085238 {
    private static final dev.epro.r0.A17799468531942579103 DEFAULT_INSTANCE;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile dev.epro.r0.T3521423756786688980 PARSER;
    private int hashType_;

    static {
        dev.epro.r0.A17799468531942579103 a17799468531942579103 = new dev.epro.r0.A17799468531942579103();
        DEFAULT_INSTANCE = a17799468531942579103;
        dev.epro.r0.Z14368087615735085238.u(dev.epro.r0.A17799468531942579103.class, a17799468531942579103);
    }

    public static dev.epro.r0.A17799468531942579103 w() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.Z399515681477140191 y() {
        return DEFAULT_INSTANCE.h();
    }

    public final java.lang.Object i(int i) {
        dev.epro.r0.T3521423756786688980 e1228818263435470419;
        int iA = dev.epro.r0.L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new dev.epro.r0.J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new java.lang.Object[]{"hashType_"});
        }
        if (iA == 3) {
            return new dev.epro.r0.A17799468531942579103();
        }
        if (iA == 4) {
            return new dev.epro.r0.Z399515681477140191(DEFAULT_INSTANCE);
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
        synchronized (dev.epro.r0.A17799468531942579103.class) {
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

    public final dev.epro.r0.S11983430735376301043 x() {
        dev.epro.r0.S11983430735376301043 s11983430735376301043A = dev.epro.r0.S11983430735376301043.a(this.hashType_);
        return s11983430735376301043A == null ? dev.epro.r0.S11983430735376301043.h : s11983430735376301043A;
    }

    public final void z(dev.epro.r0.S11983430735376301043 s11983430735376301043) {
        this.hashType_ = s11983430735376301043.b();
    }
}
