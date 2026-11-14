package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B17334521814410871793 extends dev.epro.r0.S13562717617822485216 {
    public boolean e = false;
    public final /* synthetic */ byte f;
    public final /* synthetic */ dev.epro.r0.X97881583022885904 g;

    /* JADX WARN: Multi-variable type inference failed */
    public B17334521814410871793(dev.epro.r0.X97881583022885904 x97881583022885904, int i) {
        this.g = x97881583022885904;
        this.f = i;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.g.a.setVisibility(this.f);
    }

    public final void d() {
        this.e = true;
    }

    public final void f() {
        this.g.a.setVisibility(0);
    }
}
