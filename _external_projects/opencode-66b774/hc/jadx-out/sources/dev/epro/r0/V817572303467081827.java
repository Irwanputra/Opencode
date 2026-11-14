package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V817572303467081827 extends Z14368087615735085238 {
    private static final V817572303467081827 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private N17666688112968464504 value_ = N17666688112968464504.b;

    static {
        V817572303467081827 v817572303467081827 = new V817572303467081827();
        DEFAULT_INSTANCE = v817572303467081827;
        Z14368087615735085238.u(V817572303467081827.class, v817572303467081827);
    }

    public static T7743375851574038581 A() {
        return (T7743375851574038581) DEFAULT_INSTANCE.h();
    }

    public static V817572303467081827 w() {
        return DEFAULT_INSTANCE;
    }

    public final void B(Y7386946880990094255 y7386946880990094255) {
        if (y7386946880990094255 != Y7386946880990094255.UNRECOGNIZED) {
            this.keyMaterialType_ = y7386946880990094255.a;
        } else {
            S10973172697741180971.j("Can't get the number of an unknown enum value.");
        }
    }

    public final void C(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void D(N17666688112968464504 n17666688112968464504) {
        n17666688112968464504.getClass();
        this.value_ = n17666688112968464504;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
        }
        if (iA == 3) {
            return new V817572303467081827();
        }
        if (iA == 4) {
            return new T7743375851574038581(DEFAULT_INSTANCE);
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
        synchronized (V817572303467081827.class) {
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

    public final Y7386946880990094255 x() {
        int i = this.keyMaterialType_;
        Y7386946880990094255 y7386946880990094255 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : Y7386946880990094255.REMOTE : Y7386946880990094255.ASYMMETRIC_PUBLIC : Y7386946880990094255.ASYMMETRIC_PRIVATE : Y7386946880990094255.SYMMETRIC : Y7386946880990094255.UNKNOWN_KEYMATERIAL;
        return y7386946880990094255 == null ? Y7386946880990094255.UNRECOGNIZED : y7386946880990094255;
    }

    public final String y() {
        return this.typeUrl_;
    }

    public final N17666688112968464504 z() {
        return this.value_;
    }
}
