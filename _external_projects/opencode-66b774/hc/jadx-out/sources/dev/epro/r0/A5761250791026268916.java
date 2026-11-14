package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A5761250791026268916 implements E6003104237735953596 {
    public static final A5761250791026268916 b = new A5761250791026268916(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ A5761250791026268916(byte b2) {
        this.a = b2;
    }

    @Override // dev.epro.r0.E6003104237735953596
    public final J12688447796732847593 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!T3817383632789307090.class.isAssignableFrom(cls)) {
                    S10973172697741180971.j("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (J12688447796732847593) T3817383632789307090.d(cls.asSubclass(T3817383632789307090.class)).c(3);
                } catch (Exception e) {
                    Z3383101362411723454.m("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // dev.epro.r0.E6003104237735953596
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return T3817383632789307090.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
