package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J9227924881636374484 implements F106848419962225656 {
    public F106848419962225656[] a;

    @Override // dev.epro.r0.F106848419962225656
    public final T14602662695158654172 a(Class cls) {
        for (F106848419962225656 f106848419962225656 : this.a) {
            if (f106848419962225656.b(cls)) {
                return f106848419962225656.a(cls);
            }
        }
        D11988991656201568495.j("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // dev.epro.r0.F106848419962225656
    public final boolean b(Class cls) {
        for (F106848419962225656 f106848419962225656 : this.a) {
            if (f106848419962225656.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
