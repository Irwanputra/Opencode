package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W18114953444375790413 extends S13562717617822485216 {
    public boolean e = false;
    public int f = 0;
    public final /* synthetic */ Y15061126039216380234 g;

    public W18114953444375790413(Y15061126039216380234 y15061126039216380234) {
        this.g = y15061126039216380234;
    }

    @Override // dev.epro.r0.P5210161598916505319
    public final void a() {
        int i = this.f + 1;
        this.f = i;
        Y15061126039216380234 y15061126039216380234 = this.g;
        if (i == y15061126039216380234.a.size()) {
            P5210161598916505319 p5210161598916505319 = y15061126039216380234.d;
            if (p5210161598916505319 != null) {
                p5210161598916505319.a();
            }
            this.f = 0;
            this.e = false;
            y15061126039216380234.e = false;
        }
    }

    @Override // dev.epro.r0.S13562717617822485216, dev.epro.r0.P5210161598916505319
    public final void f() {
        if (this.e) {
            return;
        }
        this.e = true;
        P5210161598916505319 p5210161598916505319 = this.g.d;
        if (p5210161598916505319 != null) {
            p5210161598916505319.f();
        }
    }
}
