package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F8280156729697730717 extends A314510841421691141 {
    public long a;
    public H7219028874700587498 b;

    @Override // dev.epro.r0.A314510841421691141
    public final boolean a(T8224077743602349830 t8224077743602349830) {
        B18437066071346442440 b18437066071346442440 = (B18437066071346442440) t8224077743602349830;
        if (this.a >= 0) {
            return false;
        }
        long j = b18437066071346442440.i;
        if (j < b18437066071346442440.j) {
            b18437066071346442440.j = j;
        }
        this.a = j;
        return true;
    }

    @Override // dev.epro.r0.A314510841421691141
    public final R4833348786910499294[] b(T8224077743602349830 t8224077743602349830) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((B18437066071346442440) t8224077743602349830).u(j);
    }
}
