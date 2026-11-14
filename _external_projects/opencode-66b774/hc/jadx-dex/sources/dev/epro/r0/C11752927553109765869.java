package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C11752927553109765869 {

    @dev.epro.r0.O7462376509978667369("seq_num")
    public final java.lang.String a;

    @dev.epro.r0.O7462376509978667369("preqs")
    public final int b;

    @dev.epro.r0.O7462376509978667369("preqs_in_session")
    public final int c;

    @dev.epro.r0.O7462376509978667369("time_in_session")
    public final long d;

    @dev.epro.r0.O7462376509978667369("preqs_by_format")
    public final java.util.Map<java.lang.String, java.lang.Integer> e;

    public C11752927553109765869(java.lang.String str, int i, int i2, long j, java.util.Map map) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.C11752927553109765869)) {
            return false;
        }
        dev.epro.r0.C11752927553109765869 c11752927553109765869 = (dev.epro.r0.C11752927553109765869) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, c11752927553109765869.a) && this.b == c11752927553109765869.b && this.c == c11752927553109765869.c && this.d == c11752927553109765869.d && dev.epro.r0.S10823041268949770285.t(this.e, c11752927553109765869.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dev.epro.r0.G6547577305291411977.j(dev.epro.r0.U1554499319261669842.h(this.c, dev.epro.r0.U1554499319261669842.h(this.b, this.a.hashCode() * 31)), this.d, 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        int i = this.b;
        int i2 = this.c;
        long j = this.d;
        java.util.Map<java.lang.String, java.lang.Integer> map = this.e;
        java.lang.StringBuilder sbX = dev.epro.r0.G6547577305291411977.x(i, "AppStats(sequenceNumber=", str, ", priorRequestCount=", ", priorRequestInSessionCount=");
        sbX.append(i2);
        sbX.append(", timeInSessionMilliseconds=");
        sbX.append(j);
        sbX.append(", priorRequestCountByFormat=");
        sbX.append(map);
        sbX.append(")");
        return sbX.toString();
    }
}
