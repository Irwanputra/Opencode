package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O4237683467374095939 extends Z14368087615735085238 {
    private static final O4237683467374095939 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private M12396306005833971742 params_;
    private int version_;

    static {
        O4237683467374095939 o4237683467374095939 = new O4237683467374095939();
        DEFAULT_INSTANCE = o4237683467374095939;
        Z14368087615735085238.u(O4237683467374095939.class, o4237683467374095939);
    }

    public static T3521423756786688980 A() {
        return DEFAULT_INSTANCE.l();
    }

    public static J9470203582267173614 y() {
        return (J9470203582267173614) DEFAULT_INSTANCE.h();
    }

    public static O4237683467374095939 z(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (O4237683467374095939) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public final void B(M12396306005833971742 m12396306005833971742) {
        this.params_ = m12396306005833971742;
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
            return new O4237683467374095939();
        }
        if (iA == 4) {
            return new J9470203582267173614(DEFAULT_INSTANCE);
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
        synchronized (O4237683467374095939.class) {
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

    public final M12396306005833971742 w() {
        M12396306005833971742 m12396306005833971742 = this.params_;
        return m12396306005833971742 == null ? M12396306005833971742.w() : m12396306005833971742;
    }

    public final int x() {
        return this.version_;
    }
}
