package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V7199483406642556969 extends Z14368087615735085238 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final V7199483406642556969 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER;
    private String configName_ = "";
    private A10696933611341011168 entry_ = Y3479847386076544429.e;

    static {
        V7199483406642556969 v7199483406642556969 = new V7199483406642556969();
        DEFAULT_INSTANCE = v7199483406642556969;
        Z14368087615735085238.u(V7199483406642556969.class, v7199483406642556969);
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", Q4152501012133079558.class});
        }
        if (A == 3) {
            return new V7199483406642556969();
        }
        if (A == 4) {
            return new B10970150362682864906(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (V7199483406642556969.class) {
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
}
