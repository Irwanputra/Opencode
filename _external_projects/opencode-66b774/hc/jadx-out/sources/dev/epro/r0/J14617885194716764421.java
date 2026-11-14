package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J14617885194716764421 implements C2322693828285680440 {
    public final M11181104712105445833 a;
    public final int b;

    public J14617885194716764421(String str, int i) {
        this(new M11181104712105445833(str), i);
    }

    @Override // dev.epro.r0.C2322693828285680440
    public final void a(K15317901533566777301 k15317901533566777301) {
        int i = k15317901533566777301.d;
        M11181104712105445833 m11181104712105445833 = this.a;
        if (i != -1) {
            k15317901533566777301.d(i, k15317901533566777301.e, m11181104712105445833.b);
        } else {
            k15317901533566777301.d(k15317901533566777301.b, k15317901533566777301.c, m11181104712105445833.b);
        }
        int i2 = k15317901533566777301.b;
        int i3 = k15317901533566777301.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iQ = W7808703833045379622.q(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - m11181104712105445833.b.length(), 0, k15317901533566777301.a.c());
        k15317901533566777301.f(iQ, iQ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J14617885194716764421)) {
            return false;
        }
        J14617885194716764421 j14617885194716764421 = (J14617885194716764421) obj;
        return S10823041268949770285.t(this.a.b, j14617885194716764421.a.b) && this.b == j14617885194716764421.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return G6547577305291411977.p(this.b, "CommitTextCommand(text='", this.a.b, "', newCursorPosition=", ")");
    }

    public J14617885194716764421(M11181104712105445833 m11181104712105445833, int i) {
        this.a = m11181104712105445833;
        this.b = i;
    }
}
