package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I15409426604577049247 extends K10678596132709730734 {
    public volatile K10678596132709730734 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ F14240031463097426304 d;
    public final /* synthetic */ K11898134656129953686 e;
    public final /* synthetic */ X16868335726098211378 f;

    public I15409426604577049247(X16868335726098211378 x16868335726098211378, boolean z, boolean z2, F14240031463097426304 f14240031463097426304, K11898134656129953686 k11898134656129953686) {
        this.f = x16868335726098211378;
        this.b = z;
        this.c = z2;
        this.d = f14240031463097426304;
        this.e = k11898134656129953686;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        if (this.b) {
            d13396727227989475489.O();
            return null;
        }
        K10678596132709730734 k10678596132709730734 = this.a;
        if (k10678596132709730734 == null) {
            k10678596132709730734 = this.d.d(this.f, this.e);
            this.a = k10678596132709730734;
        }
        return k10678596132709730734.b(d13396727227989475489);
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        if (this.c) {
            y14132333989764804283.p();
            return;
        }
        K10678596132709730734 k10678596132709730734 = this.a;
        if (k10678596132709730734 == null) {
            k10678596132709730734 = this.d.d(this.f, this.e);
            this.a = k10678596132709730734;
        }
        k10678596132709730734.c(y14132333989764804283, obj);
    }
}
