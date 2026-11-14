package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U11129743795775183256 {
    public final Object a;
    public final Y18072866666914382106 b;
    public int d;
    public U11129743795775183256 e;
    public boolean f;
    public int c = -1;
    public final V697849047308847220 g = V4416135141588678913.t(null);

    public U11129743795775183256(Object obj, Y18072866666914382106 y18072866666914382106) {
        this.a = obj;
        this.b = y18072866666914382106;
    }

    public final U11129743795775183256 a() {
        if (this.f) {
            Y16081827717826519461.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.a.add(this);
            U11129743795775183256 u11129743795775183256 = (U11129743795775183256) this.g.getValue();
            if (u11129743795775183256 != null) {
                u11129743795775183256.a();
            } else {
                u11129743795775183256 = null;
            }
            this.e = u11129743795775183256;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            Y16081827717826519461.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.a.remove(this);
            U11129743795775183256 u11129743795775183256 = this.e;
            if (u11129743795775183256 != null) {
                u11129743795775183256.b();
            }
            this.e = null;
        }
    }
}
