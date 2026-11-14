package dev.epro.r0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q5456326841214199073 {
    public long[] a;
    public int b;

    public Q5456326841214199073(int i) {
        this.a = i == 0 ? F12915125522169806569.a : new long[i];
    }

    public final void a(long j) {
        b(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        jArr[i] = j;
        this.b = i + 1;
    }

    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
    }

    public final long c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        W4415201450379021245.a("Index must be between 0 and size");
        return 0L;
    }

    public final void d(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            W4415201450379021245.a("Index must be between 0 and size");
            return;
        }
        if (i2 < i) {
            S10973172697741180971.j("The end index must be < start index");
        } else if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = this.a;
                O5378677881740157249.q0(jArr, jArr, i, i2, i3);
            }
            this.b -= i2 - i;
        }
    }

    public final void e(int i, long j) {
        if (i < 0 || i >= this.b) {
            W4415201450379021245.a("Index must be between 0 and size");
            return;
        }
        long[] jArr = this.a;
        long j2 = jArr[i];
        jArr[i] = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Q5456326841214199073) {
            Q5456326841214199073 q5456326841214199073 = (Q5456326841214199073) obj;
            int i = q5456326841214199073.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = q5456326841214199073.a;
                P8646985343900033725 p8646985343900033725N = W7808703833045379622.N(0, i2);
                int i3 = p8646985343900033725N.a;
                int i4 = p8646985343900033725N.b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ Q5456326841214199073() {
        this(16);
    }
}
