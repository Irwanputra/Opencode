package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L15314296645528043221 implements Comparable {
    public final int a;
    public final int b;
    public final int c;
    public final long d;

    public L15314296645528043221(int i, int i2, int i3, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return S10823041268949770285.A(this.d, ((L15314296645528043221) obj).d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L15314296645528043221)) {
            return false;
        }
        L15314296645528043221 l15314296645528043221 = (L15314296645528043221) obj;
        return this.a == l15314296645528043221.a && this.b == l15314296645528043221.b && this.c == l15314296645528043221.c && this.d == l15314296645528043221.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + X2485016533998461232.f(this.c, X2485016533998461232.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "CalendarDate(year=" + this.a + ", month=" + this.b + ", dayOfMonth=" + this.c + ", utcTimeMillis=" + this.d + ')';
    }
}
