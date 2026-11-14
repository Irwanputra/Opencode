package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V2461605201390006818 extends Z14368087615735085238 {
    private static final V2461605201390006818 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        V2461605201390006818 v2461605201390006818 = new V2461605201390006818();
        DEFAULT_INSTANCE = v2461605201390006818;
        Z14368087615735085238.u(V2461605201390006818.class, v2461605201390006818);
    }

    public static T3006616024322943342 w() {
        return (T3006616024322943342) DEFAULT_INSTANCE.h();
    }

    public final void A(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
        }
        if (iA == 3) {
            return new V2461605201390006818();
        }
        if (iA == 4) {
            return new T3006616024322943342(DEFAULT_INSTANCE);
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
        synchronized (V2461605201390006818.class) {
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

    public final void x(int i) {
        this.keyId_ = i;
    }

    public final void y(D16925706105132416423 d16925706105132416423) {
        this.outputPrefixType_ = d16925706105132416423.b();
    }

    public final void z(D12150776842870782007 d12150776842870782007) {
        this.status_ = d12150776842870782007.a();
    }
}
