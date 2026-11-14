package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X10863724561514067198 implements C2322693828285680440 {
    public final M11181104712105445833 a;
    public final int b;

    public X10863724561514067198(String str, int i) {
        this.a = new M11181104712105445833(str);
        this.b = i;
    }

    @Override // dev.epro.r0.C2322693828285680440
    public final void a(K15317901533566777301 k15317901533566777301) {
        String str = this.a.b;
        int i = k15317901533566777301.d;
        if (i != -1) {
            k15317901533566777301.d(i, k15317901533566777301.e, str);
            if (str.length() > 0) {
                k15317901533566777301.e(i, str.length() + i);
            }
        } else {
            int i2 = k15317901533566777301.b;
            k15317901533566777301.d(i2, k15317901533566777301.c, str);
            if (str.length() > 0) {
                k15317901533566777301.e(i2, str.length() + i2);
            }
        }
        int i3 = k15317901533566777301.b;
        int i4 = k15317901533566777301.c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.b;
        int iQ = W7808703833045379622.q(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - str.length(), 0, k15317901533566777301.a.c());
        k15317901533566777301.f(iQ, iQ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X10863724561514067198)) {
            return false;
        }
        X10863724561514067198 x10863724561514067198 = (X10863724561514067198) obj;
        return S10823041268949770285.t(this.a.b, x10863724561514067198.a.b) && this.b == x10863724561514067198.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return G6547577305291411977.p(this.b, "SetComposingTextCommand(text='", this.a.b, "', newCursorPosition=", ")");
    }
}
