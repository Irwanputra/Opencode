package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class pk implements dev.epro.r0.R16693852608535438299 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final dev.epro.r0.H9390398899829886498 e;
    public final int f;
    public final int g;
    public final float h;
    public final boolean i;
    public final java.lang.Double j;

    public pk(int i, boolean z, boolean z2, int i2, dev.epro.r0.H9390398899829886498 h9390398899829886498, int i3, int i4, float f, boolean z3, java.lang.Double d) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = h9390398899829886498;
        this.f = i3;
        this.g = i4;
        this.h = f;
        this.i = z3;
        this.j = d;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.V = this.a;
        p3477296814990354048.W = this.b;
        p3477296814990354048.X = this.c;
        p3477296814990354048.Y = this.d;
        dev.epro.r0.H9390398899829886498 h9390398899829886498 = this.e;
        if (h9390398899829886498 != null) {
            p3477296814990354048.Z = (java.lang.Integer) h9390398899829886498.a;
            p3477296814990354048.a0 = (java.lang.Integer) h9390398899829886498.b;
        }
        p3477296814990354048.c0 = this.f;
        p3477296814990354048.d0 = this.g;
        p3477296814990354048.e0 = this.h;
        p3477296814990354048.f0 = this.i;
        p3477296814990354048.b0 = this.j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.pk)) {
            return false;
        }
        ads_mobile_sdk.pk pkVar = (ads_mobile_sdk.pk) obj;
        return this.a == pkVar.a && this.b == pkVar.b && this.c == pkVar.c && this.d == pkVar.d && dev.epro.r0.S10823041268949770285.t(this.e, pkVar.e) && this.f == pkVar.f && this.g == pkVar.g && java.lang.Float.compare(this.h, pkVar.h) == 0 && this.i == pkVar.i && dev.epro.r0.S10823041268949770285.t(this.j, pkVar.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.a) * 31;
        boolean z = this.b;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        int i = (iHashCode + r3) * 31;
        boolean z2 = this.c;
        ?? r32 = z2;
        if (z2) {
            r32 = 1;
        }
        int iH = dev.epro.r0.U1554499319261669842.h(this.d, (i + r32) * 31);
        dev.epro.r0.H9390398899829886498 h9390398899829886498 = this.e;
        int iE = dev.epro.r0.E12098517352909843120.e(this.h, dev.epro.r0.U1554499319261669842.h(this.g, dev.epro.r0.U1554499319261669842.h(this.f, (iH + (h9390398899829886498 == null ? 0 : h9390398899829886498.hashCode())) * 31)), 31);
        boolean z3 = this.i;
        int i2 = (iE + (z3 ? 1 : z3)) * 31;
        java.lang.Double d = this.j;
        return i2 + (d != null ? d.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "AudioSignal(audioMode=" + this.a + ", isMusicActive=" + this.b + ", isSpeakerPhoneOn=" + this.c + ", musicVolume=" + this.d + ", minMaxMusicVolume=" + this.e + ", ringerMode=" + this.f + ", ringerVolume=" + this.g + ", appVolume=" + this.h + ", isAppMuted=" + this.i + ", musicVolumePercent=" + this.j + ")";
    }
}
