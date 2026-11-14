package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M12396306005833971742 extends Z14368087615735085238 {
    private static final M12396306005833971742 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile T3521423756786688980 PARSER;
    private int bitField0_;
    private I13467738468329653747 dekTemplate_;
    private String kekUri_ = "";

    static {
        M12396306005833971742 m12396306005833971742 = new M12396306005833971742();
        DEFAULT_INSTANCE = m12396306005833971742;
        Z14368087615735085238.u(M12396306005833971742.class, m12396306005833971742);
    }

    public static M12396306005833971742 A(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (M12396306005833971742) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static M12396306005833971742 w() {
        return DEFAULT_INSTANCE;
    }

    public static P12600058785035584028 z() {
        return (P12600058785035584028) DEFAULT_INSTANCE.h();
    }

    public final void B(I13467738468329653747 i13467738468329653747) {
        i13467738468329653747.getClass();
        this.dekTemplate_ = i13467738468329653747;
        this.bitField0_ |= 1;
    }

    public final void C(String str) {
        str.getClass();
        this.kekUri_ = str;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "kekUri_", "dekTemplate_"});
        }
        if (A == 3) {
            return new M12396306005833971742();
        }
        if (A == 4) {
            return new P12600058785035584028(DEFAULT_INSTANCE);
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
        synchronized (M12396306005833971742.class) {
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

    public final I13467738468329653747 x() {
        I13467738468329653747 i13467738468329653747 = this.dekTemplate_;
        return i13467738468329653747 == null ? I13467738468329653747.w() : i13467738468329653747;
    }

    public final String y() {
        return this.kekUri_;
    }
}
