package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X4910690020927282554 extends Z14368087615735085238 {
    private static final X4910690020927282554 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private V14519458016070766624 params_;
    private int version_;

    static {
        X4910690020927282554 x4910690020927282554 = new X4910690020927282554();
        DEFAULT_INSTANCE = x4910690020927282554;
        Z14368087615735085238.u(X4910690020927282554.class, x4910690020927282554);
    }

    public static T3521423756786688980 A() {
        return DEFAULT_INSTANCE.l();
    }

    public static S374265373476613408 y() {
        return (S374265373476613408) DEFAULT_INSTANCE.h();
    }

    public static X4910690020927282554 z(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (X4910690020927282554) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public final void B(V14519458016070766624 v14519458016070766624) {
        this.params_ = v14519458016070766624;
        this.bitField0_ |= 1;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (iA == 3) {
            return new X4910690020927282554();
        }
        if (iA == 4) {
            return new S374265373476613408(DEFAULT_INSTANCE);
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
        synchronized (X4910690020927282554.class) {
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

    public final V14519458016070766624 w() {
        V14519458016070766624 v14519458016070766624 = this.params_;
        return v14519458016070766624 == null ? V14519458016070766624.w() : v14519458016070766624;
    }

    public final int x() {
        return this.version_;
    }
}
