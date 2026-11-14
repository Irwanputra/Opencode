package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L2589523028836516608 extends Z14368087615735085238 {
    private static final L2589523028836516608 DEFAULT_INSTANCE;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        L2589523028836516608 l2589523028836516608 = new L2589523028836516608();
        DEFAULT_INSTANCE = l2589523028836516608;
        Z14368087615735085238.u(L2589523028836516608.class, l2589523028836516608);
    }

    public static L2589523028836516608 w() {
        return DEFAULT_INSTANCE;
    }

    public static L2589523028836516608 y(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (L2589523028836516608) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
        }
        if (A == 3) {
            return new L2589523028836516608();
        }
        if (A == 4) {
            return new B10970150362682864906(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (L2589523028836516608.class) {
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
        return this.version_;
    }
}
