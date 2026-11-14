package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L14430836125261710634 extends A1073272897716769208 {
    public final G15471856606567993098 d;
    public final Object[] e;

    public L14430836125261710634(G15471856606567993098 g15471856606567993098, Object[] objArr) {
        super(g15471856606567993098.a, objArr);
        this.d = g15471856606567993098;
        this.e = objArr;
    }

    @Override // dev.epro.r0.A1073272897716769208
    public final Object[] a() {
        return (Object[]) this.e.clone();
    }

    @Override // dev.epro.r0.A1073272897716769208
    public final String toString() {
        return String.format(this.d.a, this.e);
    }
}
