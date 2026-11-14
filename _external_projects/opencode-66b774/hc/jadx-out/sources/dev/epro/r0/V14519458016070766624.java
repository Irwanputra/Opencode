package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V14519458016070766624 extends Z14368087615735085238 {
    private static final V14519458016070766624 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile T3521423756786688980 PARSER;
    private String keyUri_ = "";

    static {
        V14519458016070766624 v14519458016070766624 = new V14519458016070766624();
        DEFAULT_INSTANCE = v14519458016070766624;
        Z14368087615735085238.u(V14519458016070766624.class, v14519458016070766624);
    }

    public static V14519458016070766624 w() {
        return DEFAULT_INSTANCE;
    }

    public static Q4760503431172271891 y() {
        return (Q4760503431172271891) DEFAULT_INSTANCE.h();
    }

    public static V14519458016070766624 z(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (V14519458016070766624) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public final void A(String str) {
        str.getClass();
        this.keyUri_ = str;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
        }
        if (iA == 3) {
            return new V14519458016070766624();
        }
        if (iA == 4) {
            return new Q4760503431172271891(DEFAULT_INSTANCE);
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
        synchronized (V14519458016070766624.class) {
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

    public final String x() {
        return this.keyUri_;
    }
}
