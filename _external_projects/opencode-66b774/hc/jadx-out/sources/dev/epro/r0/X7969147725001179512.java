package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X7969147725001179512 extends Z14368087615735085238 {
    private static final X7969147725001179512 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private V817572303467081827 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        X7969147725001179512 x7969147725001179512 = new X7969147725001179512();
        DEFAULT_INSTANCE = x7969147725001179512;
        Z14368087615735085238.u(X7969147725001179512.class, x7969147725001179512);
    }

    public static X5323160068642314661 A() {
        return (X5323160068642314661) DEFAULT_INSTANCE.h();
    }

    public final void B(V817572303467081827 v817572303467081827) {
        this.keyData_ = v817572303467081827;
        this.bitField0_ |= 1;
    }

    public final void C(int i) {
        this.keyId_ = i;
    }

    public final void D(D16925706105132416423 d16925706105132416423) {
        this.outputPrefixType_ = d16925706105132416423.b();
    }

    public final void E(D12150776842870782007 d12150776842870782007) {
        this.status_ = d12150776842870782007.a();
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
        }
        if (iA == 3) {
            return new X7969147725001179512();
        }
        if (iA == 4) {
            return new X5323160068642314661(DEFAULT_INSTANCE);
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
        synchronized (X7969147725001179512.class) {
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

    public final V817572303467081827 w() {
        V817572303467081827 v817572303467081827 = this.keyData_;
        return v817572303467081827 == null ? V817572303467081827.w() : v817572303467081827;
    }

    public final int x() {
        return this.keyId_;
    }

    public final D16925706105132416423 y() {
        D16925706105132416423 d16925706105132416423A = D16925706105132416423.a(this.outputPrefixType_);
        return d16925706105132416423A == null ? D16925706105132416423.UNRECOGNIZED : d16925706105132416423A;
    }

    public final D12150776842870782007 z() {
        int i = this.status_;
        D12150776842870782007 d12150776842870782007 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : D12150776842870782007.DESTROYED : D12150776842870782007.DISABLED : D12150776842870782007.ENABLED : D12150776842870782007.UNKNOWN_STATUS;
        return d12150776842870782007 == null ? D12150776842870782007.UNRECOGNIZED : d12150776842870782007;
    }
}
