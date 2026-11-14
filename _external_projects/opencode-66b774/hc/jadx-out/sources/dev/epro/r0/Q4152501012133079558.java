package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q4152501012133079558 extends Z14368087615735085238 {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final Q4152501012133079558 DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    static {
        Q4152501012133079558 q4152501012133079558 = new Q4152501012133079558();
        DEFAULT_INSTANCE = q4152501012133079558;
        Z14368087615735085238.u(Q4152501012133079558.class, q4152501012133079558);
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
        }
        if (iA == 3) {
            return new Q4152501012133079558();
        }
        if (iA == 4) {
            return new B10970150362682864906(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (Q4152501012133079558.class) {
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
}
