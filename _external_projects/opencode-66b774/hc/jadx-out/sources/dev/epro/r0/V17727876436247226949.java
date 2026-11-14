package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V17727876436247226949 extends L6855102173777462404 {
    public final D6474964434458555331 b;
    public final L10759904335384498764 c;
    public final int d;
    public final /* synthetic */ L10759904335384498764 e;
    public final /* synthetic */ W5896017744614017491 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V17727876436247226949(D6474964434458555331 d6474964434458555331, L10759904335384498764 l10759904335384498764, int i, W5896017744614017491 w5896017744614017491, int i2, int i3, long j) {
        super((byte) 1);
        this.e = l10759904335384498764;
        this.f = w5896017744614017491;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.b = d6474964434458555331;
        this.c = l10759904335384498764;
        this.d = i;
    }

    @Override // dev.epro.r0.L6855102173777462404
    public final I6148490667470006645 f(int i, int i2, int i3, long j) {
        return p(i, i2, i3, this.d, j);
    }

    public final V2435767323669307206 p(int i, int i2, int i3, int i4, long j) {
        int iJ;
        D6474964434458555331 d6474964434458555331 = this.b;
        Object objB = d6474964434458555331.b(i);
        Object objV = d6474964434458555331.b.v(i);
        List listH = h(this.c, i, j);
        if (I16980768508151520658.g(j)) {
            iJ = I16980768508151520658.k(j);
        } else {
            if (!I16980768508151520658.f(j)) {
                Y16081827717826519461.a("does not have fixed height");
            }
            iJ = I16980768508151520658.j(j);
        }
        F10342546226345611902 layoutDirection = this.e.b.getLayoutDirection();
        I2828680009210448000 i2828680009210448000 = this.f.m;
        return new V2435767323669307206(i, objB, iJ, i4, layoutDirection, this.g, this.h, listH, this.i, objV, i2828680009210448000, j, i2, i3);
    }
}
