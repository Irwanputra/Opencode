package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y17131958419000606632 {
    public final int a;
    public long b;
    public long c;

    public Y17131958419000606632(int i) {
        this.a = i;
    }

    public static void b(Y17131958419000606632 y17131958419000606632, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (y17131958419000606632) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = y17131958419000606632.b + j;
                y17131958419000606632.b = j3;
                long j4 = y17131958419000606632.c + j2;
                y17131958419000606632.c = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized long a() {
        return this.b - this.c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.a + ", total=" + this.b + ", acknowledged=" + this.c + ", unacknowledged=" + a() + ')';
    }
}
