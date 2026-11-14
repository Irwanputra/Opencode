package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D15721838497647431583 extends Z14368087615735085238 {
    private static final D15721838497647431583 DEFAULT_INSTANCE;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        D15721838497647431583 d15721838497647431583 = new D15721838497647431583();
        DEFAULT_INSTANCE = d15721838497647431583;
        Z14368087615735085238.u(D15721838497647431583.class, d15721838497647431583);
    }

    public static D15721838497647431583 w() {
        return DEFAULT_INSTANCE;
    }

    public static M4569630009890340992 y() {
        return (M4569630009890340992) DEFAULT_INSTANCE.h();
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
        }
        if (A == 3) {
            return new D15721838497647431583();
        }
        if (A == 4) {
            return new M4569630009890340992(DEFAULT_INSTANCE);
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
        synchronized (D15721838497647431583.class) {
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

    public final int x() {
        return this.tagSize_;
    }

    public final void z(int i) {
        this.tagSize_ = i;
    }
}
