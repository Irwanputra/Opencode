package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z4545102543618975825 extends Z14368087615735085238 {
    private static final Z4545102543618975825 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private N17666688112968464504 keyValue_ = N17666688112968464504.b;
    private int version_;

    static {
        Z4545102543618975825 z4545102543618975825 = new Z4545102543618975825();
        DEFAULT_INSTANCE = z4545102543618975825;
        Z14368087615735085238.u(Z4545102543618975825.class, z4545102543618975825);
    }

    public static T3521423756786688980 A() {
        return DEFAULT_INSTANCE.l();
    }

    public static B2705151270877023791 y() {
        return (B2705151270877023791) DEFAULT_INSTANCE.h();
    }

    public static Z4545102543618975825 z(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (Z4545102543618975825) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public final void B(M18082356575916498704 m18082356575916498704) {
        this.keyValue_ = m18082356575916498704;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
        }
        if (A == 3) {
            return new Z4545102543618975825();
        }
        if (A == 4) {
            return new B2705151270877023791(DEFAULT_INSTANCE);
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
        synchronized (Z4545102543618975825.class) {
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

    public final N17666688112968464504 w() {
        return this.keyValue_;
    }

    public final int x() {
        return this.version_;
    }
}
