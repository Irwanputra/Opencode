package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U1554499319261669842;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class pk implements R16693852608535438299 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final H9390398899829886498 e;
    public final int f;
    public final int g;
    public final float h;
    public final boolean i;
    public final Double j;

    public pk(int i, boolean z, boolean z2, int i2, H9390398899829886498 h9390398899829886498, int i3, int i4, float f, boolean z3, Double d) {
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

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.V = this.a;
        p3477296814990354048.W = this.b;
        p3477296814990354048.X = this.c;
        p3477296814990354048.Y = this.d;
        H9390398899829886498 h9390398899829886498 = this.e;
        if (h9390398899829886498 != null) {
            p3477296814990354048.Z = (Integer) h9390398899829886498.a;
            p3477296814990354048.a0 = (Integer) h9390398899829886498.b;
        }
        p3477296814990354048.c0 = this.f;
        p3477296814990354048.d0 = this.g;
        p3477296814990354048.e0 = this.h;
        p3477296814990354048.f0 = this.i;
        p3477296814990354048.b0 = this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk)) {
            return false;
        }
        pk pkVar = (pk) obj;
        return this.a == pkVar.a && this.b == pkVar.b && this.c == pkVar.c && this.d == pkVar.d && S10823041268949770285.t(this.e, pkVar.e) && this.f == pkVar.f && this.g == pkVar.g && Float.compare(this.h, pkVar.h) == 0 && this.i == pkVar.i && S10823041268949770285.t(this.j, pkVar.j);
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
        int iHashCode = Integer.hashCode(this.a) * 31;
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
        int iH = U1554499319261669842.h(this.d, (i + r32) * 31);
        H9390398899829886498 h9390398899829886498 = this.e;
        int iE = E12098517352909843120.e(this.h, U1554499319261669842.h(this.g, U1554499319261669842.h(this.f, (iH + (h9390398899829886498 == null ? 0 : h9390398899829886498.hashCode())) * 31)), 31);
        boolean z3 = this.i;
        int i2 = (iE + (z3 ? 1 : z3)) * 31;
        Double d = this.j;
        return i2 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "AudioSignal(audioMode=" + this.a + ", isMusicActive=" + this.b + ", isSpeakerPhoneOn=" + this.c + ", musicVolume=" + this.d + ", minMaxMusicVolume=" + this.e + ", ringerMode=" + this.f + ", ringerVolume=" + this.g + ", appVolume=" + this.h + ", isAppMuted=" + this.i + ", musicVolumePercent=" + this.j + ")";
    }
}
