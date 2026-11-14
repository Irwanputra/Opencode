package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K14067081624082208325 extends Z14368087615735085238 {
    private static final K14067081624082208325 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        K14067081624082208325 k14067081624082208325 = new K14067081624082208325();
        DEFAULT_INSTANCE = k14067081624082208325;
        Z14368087615735085238.u(K14067081624082208325.class, k14067081624082208325);
    }

    public static K14067081624082208325 w() {
        return DEFAULT_INSTANCE;
    }

    public static A8052260396440080824 z() {
        return (A8052260396440080824) DEFAULT_INSTANCE.h();
    }

    public final void A(S11983430735376301043 s11983430735376301043) {
        this.hash_ = s11983430735376301043.b();
    }

    public final void B(int i) {
        this.tagSize_ = i;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
        }
        if (A == 3) {
            return new K14067081624082208325();
        }
        if (A == 4) {
            return new A8052260396440080824(DEFAULT_INSTANCE);
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
        synchronized (K14067081624082208325.class) {
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

    public final S11983430735376301043 x() {
        S11983430735376301043 a = S11983430735376301043.a(this.hash_);
        return a == null ? S11983430735376301043.UNRECOGNIZED : a;
    }

    public final int y() {
        return this.tagSize_;
    }
}
