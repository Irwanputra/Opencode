package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G12426915514109744413 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public G12426915514109744413(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G12426915514109744413)) {
            return false;
        }
        G12426915514109744413 g12426915514109744413 = (G12426915514109744413) obj;
        return this.a == g12426915514109744413.a && this.b == g12426915514109744413.b && this.c == g12426915514109744413.c && this.d == g12426915514109744413.d && this.e == g12426915514109744413.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + X2485016533998461232.f(this.d, X2485016533998461232.f(this.c, X2485016533998461232.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CalendarMonth(year=" + this.a + ", month=" + this.b + ", numberOfDays=" + this.c + ", daysFromStartOfWeekToFirstOfMonth=" + this.d + ", startUtcTimeMillis=" + this.e + ')';
    }
}
