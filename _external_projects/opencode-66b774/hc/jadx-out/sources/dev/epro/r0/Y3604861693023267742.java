package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y3604861693023267742 extends Z14368087615735085238 {
    private static final Y3604861693023267742 DEFAULT_INSTANCE;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        Y3604861693023267742 y3604861693023267742 = new Y3604861693023267742();
        DEFAULT_INSTANCE = y3604861693023267742;
        Z14368087615735085238.u(Y3604861693023267742.class, y3604861693023267742);
    }

    public static Y3604861693023267742 w() {
        return DEFAULT_INSTANCE;
    }

    public static Y3604861693023267742 y(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (Y3604861693023267742) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
        }
        if (iA == 3) {
            return new Y3604861693023267742();
        }
        if (iA == 4) {
            return new B10970150362682864906(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (Y3604861693023267742.class) {
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

    public final int x() {
        return this.version_;
    }
}
