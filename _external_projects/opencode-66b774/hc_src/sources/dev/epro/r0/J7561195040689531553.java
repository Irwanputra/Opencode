package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J7561195040689531553 extends L6855102173777462404 {
    public final D1544798744073789156 b;
    public final L10759904335384498764 c;
    public final long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ L10759904335384498764 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ K1823399244298350623 i;
    public final /* synthetic */ O15869581661108952313 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ E17523205116624666034 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7561195040689531553(long j, boolean z, D1544798744073789156 d1544798744073789156, L10759904335384498764 l10759904335384498764, int i, int i2, K1823399244298350623 k1823399244298350623, O15869581661108952313 o15869581661108952313, int i3, int i4, long j2, E17523205116624666034 e17523205116624666034) {
        super((byte) 1);
        this.e = z;
        this.f = l10759904335384498764;
        this.g = i;
        this.h = i2;
        this.i = k1823399244298350623;
        this.j = o15869581661108952313;
        this.k = i3;
        this.l = i4;
        this.m = j2;
        this.n = e17523205116624666034;
        this.b = d1544798744073789156;
        this.c = l10759904335384498764;
        this.d = O15160157444238005800.b(0, z ? I16980768508151520658.i(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : I16980768508151520658.h(j), 5);
    }

    @Override // dev.epro.r0.L6855102173777462404
    public final I6148490667470006645 f(int i, int i2, int i3, long j) {
        return p(i, j);
    }

    public final H3043063065558747866 p(int i, long j) {
        D1544798744073789156 d1544798744073789156 = this.b;
        Object b = d1544798744073789156.b(i);
        Object v = d1544798744073789156.b.v(i);
        return new H3043063065558747866(i, h(this.c, i, j), this.e, this.i, this.j, this.f.b.getLayoutDirection(), this.k, this.l, i == this.g + (-1) ? 0 : this.h, this.m, b, v, this.n.f218o, j);
    }
}
