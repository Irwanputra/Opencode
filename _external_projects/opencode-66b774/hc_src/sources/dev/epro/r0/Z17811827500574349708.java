package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z17811827500574349708 implements A16777725183770839672 {
    public A16777725183770839672[] a;

    @Override // dev.epro.r0.A16777725183770839672
    public final J14415172299974100388 a(Class cls) {
        for (A16777725183770839672 a16777725183770839672 : this.a) {
            if (a16777725183770839672.b(cls)) {
                return a16777725183770839672.a(cls);
            }
        }
        D11988991656201568495.j("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // dev.epro.r0.A16777725183770839672
    public final boolean b(Class cls) {
        for (A16777725183770839672 a16777725183770839672 : this.a) {
            if (a16777725183770839672.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
