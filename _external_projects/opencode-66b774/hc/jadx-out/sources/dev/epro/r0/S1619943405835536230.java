package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S1619943405835536230 extends Z14368087615735085238 {
    private static final S1619943405835536230 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private N17666688112968464504 keyValue_ = N17666688112968464504.b;
    private int version_;

    static {
        S1619943405835536230 s1619943405835536230 = new S1619943405835536230();
        DEFAULT_INSTANCE = s1619943405835536230;
        Z14368087615735085238.u(S1619943405835536230.class, s1619943405835536230);
    }

    public static T3521423756786688980 A() {
        return DEFAULT_INSTANCE.l();
    }

    public static Z14058267691604182071 y() {
        return (Z14058267691604182071) DEFAULT_INSTANCE.h();
    }

    public static S1619943405835536230 z(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (S1619943405835536230) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public final void B(M18082356575916498704 m18082356575916498704) {
        this.keyValue_ = m18082356575916498704;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
        }
        if (iA == 3) {
            return new S1619943405835536230();
        }
        if (iA == 4) {
            return new Z14058267691604182071(DEFAULT_INSTANCE);
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
        synchronized (S1619943405835536230.class) {
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

    public final int x() {
        return this.version_;
    }
}
