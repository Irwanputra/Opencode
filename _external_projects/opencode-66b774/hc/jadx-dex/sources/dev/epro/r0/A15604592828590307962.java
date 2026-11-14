package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A15604592828590307962 extends dev.epro.r0.S3338576511881427402 {
    public final dev.epro.r0.V17190203728625001156 a;
    public final dev.epro.r0.F14240031463097426304 b;
    public final dev.epro.r0.K11898134656129953686 c;
    public final dev.epro.r0.V4446577237959483780 d;
    public final boolean e;
    public volatile dev.epro.r0.K10678596132709730734 f;

    public A15604592828590307962(dev.epro.r0.V17190203728625001156 v17190203728625001156, dev.epro.r0.F14240031463097426304 f14240031463097426304, dev.epro.r0.K11898134656129953686 k11898134656129953686, dev.epro.r0.V4446577237959483780 v4446577237959483780, boolean z) {
        this.a = v17190203728625001156;
        this.b = f14240031463097426304;
        this.c = k11898134656129953686;
        this.d = v4446577237959483780;
        this.e = z;
    }

    public final java.lang.Object b(dev.epro.r0.D13396727227989475489 d13396727227989475489) {
        dev.epro.r0.K10678596132709730734 k10678596132709730734D = this.f;
        if (k10678596132709730734D == null) {
            k10678596132709730734D = this.b.d(this.d, this.c);
            this.f = k10678596132709730734D;
        }
        return k10678596132709730734D.b(d13396727227989475489);
    }

    public final void c(dev.epro.r0.Y14132333989764804283 y14132333989764804283, java.lang.Object obj) {
        if (this.a == null) {
            dev.epro.r0.K10678596132709730734 k10678596132709730734D = this.f;
            if (k10678596132709730734D == null) {
                k10678596132709730734D = this.b.d(this.d, this.c);
                this.f = k10678596132709730734D;
            }
            k10678596132709730734D.c(y14132333989764804283, obj);
            return;
        }
        if (this.e && obj == null) {
            y14132333989764804283.p();
            return;
        }
        java.lang.reflect.Type type = this.c.b;
        dev.epro.r0.E3361600325772812308 e3361600325772812308 = (dev.epro.r0.E3361600325772812308) obj;
        dev.epro.r0.D16457379462628768197 d16457379462628768197 = new dev.epro.r0.D16457379462628768197(e3361600325772812308.name() + " (" + ((int) e3361600325772812308.a) + ")");
        dev.epro.r0.B14764642315028140130 b14764642315028140130 = dev.epro.r0.Q2123592735363394013.z;
        b14764642315028140130.getClass();
        b14764642315028140130.c(d16457379462628768197, y14132333989764804283);
    }

    public final dev.epro.r0.K10678596132709730734 d() {
        if (this.a != null) {
            return this;
        }
        dev.epro.r0.K10678596132709730734 k10678596132709730734 = this.f;
        if (k10678596132709730734 != null) {
            return k10678596132709730734;
        }
        dev.epro.r0.K10678596132709730734 k10678596132709730734D = this.b.d(this.d, this.c);
        this.f = k10678596132709730734D;
        return k10678596132709730734D;
    }
}
