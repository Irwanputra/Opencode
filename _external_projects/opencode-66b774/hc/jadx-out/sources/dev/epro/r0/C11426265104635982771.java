package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C11426265104635982771 extends Z14368087615735085238 {
    private static final C11426265104635982771 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private N17666688112968464504 keyValue_ = N17666688112968464504.b;
    private int version_;

    static {
        C11426265104635982771 c11426265104635982771 = new C11426265104635982771();
        DEFAULT_INSTANCE = c11426265104635982771;
        Z14368087615735085238.u(C11426265104635982771.class, c11426265104635982771);
    }

    public static C11426265104635982771 A(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (C11426265104635982771) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static T3521423756786688980 B() {
        return DEFAULT_INSTANCE.l();
    }

    public static C11426265104635982771 w() {
        return DEFAULT_INSTANCE;
    }

    public static P14178003382675667551 z() {
        return (P14178003382675667551) DEFAULT_INSTANCE.h();
    }

    public final void C(M18082356575916498704 m18082356575916498704) {
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
            return new C11426265104635982771();
        }
        if (iA == 4) {
            return new P14178003382675667551(DEFAULT_INSTANCE);
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
        synchronized (C11426265104635982771.class) {
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

    public final N17666688112968464504 x() {
        return this.keyValue_;
    }

    public final int y() {
        return this.version_;
    }
}
