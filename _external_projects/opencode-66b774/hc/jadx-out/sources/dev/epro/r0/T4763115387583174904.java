package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T4763115387583174904 implements U16443665883761795894, G2906799666642890256 {
    public final U16443665883761795894 a;
    public final int b;
    public final int c;

    public T4763115387583174904(U16443665883761795894 u16443665883761795894, int i, int i2) {
        u16443665883761795894.getClass();
        this.a = u16443665883761795894;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            S10973172697741180971.i(G6547577305291411977.n(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            S10973172697741180971.i(G6547577305291411977.n(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        S10973172697741180971.i(E12098517352909843120.l("endIndex should be not less than startIndex, but was ", i2, i, " < "));
        throw null;
    }

    @Override // dev.epro.r0.G2906799666642890256
    public final U16443665883761795894 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new T4763115387583174904(this.a, i3, i + i3);
    }

    @Override // dev.epro.r0.G2906799666642890256
    public final U16443665883761795894 b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? W10854829702748386039.a : new T4763115387583174904(this.a, i3 + i, i2);
    }

    @Override // dev.epro.r0.U16443665883761795894
    public final Iterator iterator() {
        return new C13932356399610645840(this);
    }
}
