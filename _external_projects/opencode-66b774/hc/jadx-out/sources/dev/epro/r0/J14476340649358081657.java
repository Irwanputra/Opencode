package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J14476340649358081657 {
    public final P11191550465322624469 a;
    public final P11191550465322624469 b;
    public final Throwable c;

    public J14476340649358081657(P11191550465322624469 p11191550465322624469, A8512287753625267110 a8512287753625267110, Throwable th) {
        this.a = p11191550465322624469;
        this.b = a8512287753625267110;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J14476340649358081657)) {
            return false;
        }
        J14476340649358081657 j14476340649358081657 = (J14476340649358081657) obj;
        return S10823041268949770285.t(this.a, j14476340649358081657.a) && S10823041268949770285.t(this.b, j14476340649358081657.b) && S10823041268949770285.t(this.c, j14476340649358081657.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        P11191550465322624469 p11191550465322624469 = this.b;
        int iHashCode2 = (iHashCode + (p11191550465322624469 == null ? 0 : p11191550465322624469.hashCode())) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public /* synthetic */ J14476340649358081657(P11191550465322624469 p11191550465322624469, Throwable th, int i) {
        this(p11191550465322624469, (A8512287753625267110) null, (i & 4) != 0 ? null : th);
    }
}
