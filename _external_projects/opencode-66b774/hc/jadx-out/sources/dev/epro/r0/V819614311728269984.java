package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
final class V819614311728269984 extends A8269341136279542501 {
    public final W3656598099029166611 a;
    public final O11687042873311337343 b;
    public final Z5580852631924387145 c;
    public final J2232875916072654838 d;
    public final V15405126878164315789 e;

    public V819614311728269984(W3656598099029166611 w3656598099029166611, O11687042873311337343 o11687042873311337343, Z5580852631924387145 z5580852631924387145, J2232875916072654838 j2232875916072654838, V15405126878164315789 v15405126878164315789) {
        this.a = w3656598099029166611;
        this.b = o11687042873311337343;
        this.c = z5580852631924387145;
        this.d = j2232875916072654838;
        this.e = v15405126878164315789;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        W18121798207320779714 w18121798207320779714 = new W18121798207320779714();
        w18121798207320779714.f559o = this.b;
        w18121798207320779714.p = this.c;
        w18121798207320779714.q = this.d;
        w18121798207320779714.r = this.e;
        return w18121798207320779714;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        W18121798207320779714 w18121798207320779714 = (W18121798207320779714) r15896830329318850690;
        w18121798207320779714.getClass();
        w18121798207320779714.f559o = this.b;
        w18121798207320779714.p = this.c;
        w18121798207320779714.q = this.d;
        w18121798207320779714.r = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V819614311728269984) {
            V819614311728269984 v819614311728269984 = (V819614311728269984) obj;
            return this.a == v819614311728269984.a && S10823041268949770285.t(this.b, v819614311728269984.b) && this.c.equals(v819614311728269984.c) && S10823041268949770285.t(this.d, v819614311728269984.d) && this.e == v819614311728269984.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.a.hashCode() + ((this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.a + ", veilAnimation=" + this.b + ", enter=" + this.c + ", exit=" + this.d + ", mutableTransformState=" + this.e + ")";
    }
}
