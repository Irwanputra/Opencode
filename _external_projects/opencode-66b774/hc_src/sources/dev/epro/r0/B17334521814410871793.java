package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B17334521814410871793 extends S13562717617822485216 {
    public boolean e = false;
    public final /* synthetic */ byte f;
    public final /* synthetic */ X97881583022885904 g;

    /* JADX WARN: Multi-variable type inference failed */
    public B17334521814410871793(X97881583022885904 x97881583022885904, int i) {
        this.g = x97881583022885904;
        this.f = i;
    }

    @Override // dev.epro.r0.P5210161598916505319
    public final void a() {
        if (this.e) {
            return;
        }
        this.g.a.setVisibility(this.f);
    }

    @Override // dev.epro.r0.S13562717617822485216, dev.epro.r0.P5210161598916505319
    public final void d() {
        this.e = true;
    }

    @Override // dev.epro.r0.S13562717617822485216, dev.epro.r0.P5210161598916505319
    public final void f() {
        this.g.a.setVisibility(0);
    }
}
