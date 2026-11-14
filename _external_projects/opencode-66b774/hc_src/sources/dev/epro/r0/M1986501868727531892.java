package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M1986501868727531892 implements U16443665883761795894, G2906799666642890256 {
    public final U16443665883761795894 a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public M1986501868727531892(U16443665883761795894 u16443665883761795894, int i) {
        this.a = u16443665883761795894;
        this.b = i;
        if (i >= 0) {
            return;
        }
        S10973172697741180971.h(i, 46, "count must be non-negative, but was ");
        throw null;
    }

    @Override // dev.epro.r0.G2906799666642890256
    public final U16443665883761795894 a(int i) {
        return i >= this.b ? this : new M1986501868727531892(this.a, i);
    }

    @Override // dev.epro.r0.G2906799666642890256
    public final U16443665883761795894 b(int i) {
        byte b = this.b;
        return i >= b ? W10854829702748386039.a : new T4763115387583174904(this.a, i, b);
    }

    @Override // dev.epro.r0.U16443665883761795894
    public final Iterator iterator() {
        return new G2215898220892222614(this);
    }
}
