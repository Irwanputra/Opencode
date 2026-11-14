package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I12220150998180337643 {
    public final long a;
    public final long b;
    public final boolean c;

    public I12220150998180337643(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final I12220150998180337643 a(I12220150998180337643 i12220150998180337643) {
        return new I12220150998180337643(L2216691091636065972.f(this.a, i12220150998180337643.a), Math.max(this.b, i12220150998180337643.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I12220150998180337643)) {
            return false;
        }
        I12220150998180337643 i12220150998180337643 = (I12220150998180337643) obj;
        return L2216691091636065972.b(this.a, i12220150998180337643.a) && this.b == i12220150998180337643.b && this.c == i12220150998180337643.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + G6547577305291411977.j(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sbH = X2485016533998461232.h("MouseWheelScrollDelta(value=", L2216691091636065972.h(this.a), ", timeMillis=", this.b);
        sbH.append(", shouldApplyImmediately=");
        sbH.append(this.c);
        sbH.append(")");
        return sbH.toString();
    }
}
