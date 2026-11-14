package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y11282557324216517430 implements U16443665883761795894, G2906799666642890256 {
    public final U16443665883761795894 a;
    public final int b;

    public Y11282557324216517430(U16443665883761795894 u16443665883761795894, int i) {
        u16443665883761795894.getClass();
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
        int i2 = this.b;
        int i3 = i2 + i;
        return i3 < 0 ? new M1986501868727531892(this, i) : new T4763115387583174904(this.a, i2, i3);
    }

    @Override // dev.epro.r0.G2906799666642890256
    public final U16443665883761795894 b(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new Y11282557324216517430(this, i) : new Y11282557324216517430(this.a, i2);
    }

    @Override // dev.epro.r0.U16443665883761795894
    public final Iterator iterator() {
        return new G2215898220892222614(this);
    }
}
