package ads_mobile_sdk;

import dev.epro.r0.E17564419012940707302;
import dev.epro.r0.Z3383101362411723454;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class tu {
    public int a;
    public int b;
    public E17564419012940707302 d;

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a();

    public abstract void a(int i);

    public abstract int b();

    public abstract void c(int i);

    public abstract boolean c();

    public abstract int d(int i);

    public abstract boolean d();

    public abstract qq e();

    public abstract boolean e(int i);

    public abstract double f();

    public abstract int g();

    public abstract int h();

    public abstract long i();

    public abstract float j();

    public abstract int k();

    public abstract long l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract int p();

    public abstract long q();

    public abstract String r();

    public abstract String s();

    public abstract int t();

    public abstract int u();

    public abstract long v();

    public final void w() {
        int iT;
        do {
            iT = t();
            if (iT == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                Z3383101362411723454.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.b = i2 + 1;
                this.b--;
            }
        } while (e(iT));
    }
}
