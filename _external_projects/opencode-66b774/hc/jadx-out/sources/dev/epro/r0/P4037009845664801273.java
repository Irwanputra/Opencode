package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P4037009845664801273 implements A16777725183770839672 {
    public static final P4037009845664801273 b = new P4037009845664801273(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ P4037009845664801273(byte b2) {
        this.a = b2;
    }

    @Override // dev.epro.r0.A16777725183770839672
    public final J14415172299974100388 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!Z14368087615735085238.class.isAssignableFrom(cls)) {
                    S10973172697741180971.j("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (J14415172299974100388) Z14368087615735085238.j(cls.asSubclass(Z14368087615735085238.class)).i(3);
                } catch (Exception e) {
                    Z3383101362411723454.m("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // dev.epro.r0.A16777725183770839672
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return Z14368087615735085238.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
