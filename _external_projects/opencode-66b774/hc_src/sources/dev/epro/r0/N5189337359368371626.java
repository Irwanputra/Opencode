package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N5189337359368371626 implements F106848419962225656 {
    public static final N5189337359368371626 b = new N5189337359368371626(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ N5189337359368371626(byte b2) {
        this.a = b2;
    }

    @Override // dev.epro.r0.F106848419962225656
    public final T14602662695158654172 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!K17275736824900228431.class.isAssignableFrom(cls)) {
                    S10973172697741180971.j("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (T14602662695158654172) K17275736824900228431.b(cls.asSubclass(K17275736824900228431.class)).a(3);
                } catch (Exception e) {
                    Z3383101362411723454.m("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // dev.epro.r0.F106848419962225656
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return K17275736824900228431.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
