package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.R5692663580087387669;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S4967920478913205567;
import dev.epro.r0.U1554499319261669842;
import dev.epro.r0.U4020053660465689583;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class sk {
    public final String a;
    public final S4967920478913205567 b;
    public final qw2 c;
    public final int d;
    public final ue2 e;
    public final long f;
    public final long g;
    public U4020053660465689583 h;

    public sk(String str, S4967920478913205567 s4967920478913205567, qw2 qw2Var, int i, ue2 ue2Var, long j, long j2, R5692663580087387669 r5692663580087387669) {
        str.getClass();
        this.a = str;
        this.b = s4967920478913205567;
        this.c = qw2Var;
        this.d = i;
        this.e = ue2Var;
        this.f = j;
        this.g = j2;
        this.h = r5692663580087387669;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk)) {
            return false;
        }
        sk skVar = (sk) obj;
        return S10823041268949770285.t(this.a, skVar.a) && this.b.equals(skVar.b) && this.c == skVar.c && this.d == skVar.d && this.e.equals(skVar.e) && this.f == skVar.f && this.g == skVar.g && this.h.equals(skVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + G6547577305291411977.j(G6547577305291411977.j((this.e.hashCode() + U1554499319261669842.h(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, this.f, 31), this.g, 31);
    }

    public final String toString() {
        return "AutoRefreshEntry(webProperty=" + this.a + ", adRequest=" + this.b + ", requestType=" + this.c + ", numberOfAdsRequested=" + this.d + ", token=" + this.e + ", scheduleTimeMs=" + this.f + ", targetExecutionTimeMs=" + this.g + ", job=" + this.h + ")";
    }
}
