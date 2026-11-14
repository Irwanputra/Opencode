package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J1170565920253950774 implements E6003104237735953596 {
    public E6003104237735953596[] a;

    @Override // dev.epro.r0.E6003104237735953596
    public final J12688447796732847593 a(Class cls) {
        for (E6003104237735953596 e6003104237735953596 : this.a) {
            if (e6003104237735953596.b(cls)) {
                return e6003104237735953596.a(cls);
            }
        }
        D11988991656201568495.j("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // dev.epro.r0.E6003104237735953596
    public final boolean b(Class cls) {
        for (E6003104237735953596 e6003104237735953596 : this.a) {
            if (e6003104237735953596.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
