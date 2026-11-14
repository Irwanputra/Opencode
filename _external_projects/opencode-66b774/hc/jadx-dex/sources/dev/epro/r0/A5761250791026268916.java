package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A5761250791026268916 implements dev.epro.r0.E6003104237735953596 {
    public static final dev.epro.r0.A5761250791026268916 b = new dev.epro.r0.A5761250791026268916(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ A5761250791026268916(byte b2) {
        this.a = b2;
    }

    @Override // dev.epro.r0.E6003104237735953596
    public final dev.epro.r0.J12688447796732847593 a(java.lang.Class cls) {
        switch (this.a) {
            case 0:
                if (!dev.epro.r0.T3817383632789307090.class.isAssignableFrom(cls)) {
                    dev.epro.r0.S10973172697741180971.j("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (dev.epro.r0.J12688447796732847593) dev.epro.r0.T3817383632789307090.d(cls.asSubclass(dev.epro.r0.T3817383632789307090.class)).c(3);
                } catch (java.lang.Exception e) {
                    dev.epro.r0.Z3383101362411723454.m("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new java.lang.IllegalStateException("This should never be called.");
        }
    }

    @Override // dev.epro.r0.E6003104237735953596
    public final boolean b(java.lang.Class cls) {
        switch (this.a) {
            case 0:
                return dev.epro.r0.T3817383632789307090.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
