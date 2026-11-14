package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E4222303495286338467 extends dev.epro.r0.A6237865184482427403 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dev.epro.r0.A6237865184482427403 f221o;
    public boolean p;

    public E4222303495286338467(long j, dev.epro.r0.D7201182503133677242 d7201182503133677242, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.A6237865184482427403 a6237865184482427403) {
        super(j, d7201182503133677242, f4096073349764486348, f40960733497644863482);
        this.f221o = a6237865184482427403;
        a6237865184482427403.k();
    }

    @Override // dev.epro.r0.A6237865184482427403
    public final void c() {
        if (((dev.epro.r0.M4722199849958580248) this).c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.f221o.l();
    }

    @Override // dev.epro.r0.A6237865184482427403
    public final dev.epro.r0.E14308387479134424328 w() {
        dev.epro.r0.E4222303495286338467 e4222303495286338467;
        dev.epro.r0.A6237865184482427403 a6237865184482427403 = this.f221o;
        if (a6237865184482427403.m || ((dev.epro.r0.M4722199849958580248) a6237865184482427403).c) {
            return new dev.epro.r0.Y12702511936777569777(this);
        }
        dev.epro.r0.E13273723708836014930 e13273723708836014930 = this.h;
        long j = ((dev.epro.r0.M4722199849958580248) this).b;
        java.util.HashMap mapM = e13273723708836014930 != null ? dev.epro.r0.D459204867321966484.m(a6237865184482427403.g(), this, this.f221o.d()) : null;
        java.lang.Object obj = dev.epro.r0.D459204867321966484.c;
        synchronized (obj) {
            try {
                dev.epro.r0.D459204867321966484.v(this);
                if (e13273723708836014930 == null || e13273723708836014930.d == 0) {
                    e4222303495286338467 = this;
                    e4222303495286338467.a();
                } else {
                    e4222303495286338467 = this;
                    dev.epro.r0.E14308387479134424328 e14308387479134424328Z = e4222303495286338467.z(this.f221o.g(), e13273723708836014930, mapM, this.f221o.d());
                    if (!e14308387479134424328Z.equals(dev.epro.r0.V14274201939977296242.c)) {
                        return e14308387479134424328Z;
                    }
                    dev.epro.r0.E13273723708836014930 e13273723708836014930X = e4222303495286338467.f221o.x();
                    if (e13273723708836014930X != null) {
                        e13273723708836014930X.j(e13273723708836014930);
                    } else {
                        e4222303495286338467.f221o.B(e13273723708836014930);
                        e4222303495286338467.h = null;
                    }
                }
                if (dev.epro.r0.S10823041268949770285.A(e4222303495286338467.f221o.g(), j) < 0) {
                    e4222303495286338467.f221o.v();
                }
                dev.epro.r0.A6237865184482427403 a62378651844824274032 = e4222303495286338467.f221o;
                a62378651844824274032.r(a62378651844824274032.d().b(j).a(e4222303495286338467.j));
                e4222303495286338467.f221o.A(j);
                dev.epro.r0.A6237865184482427403 a62378651844824274033 = e4222303495286338467.f221o;
                int i = ((dev.epro.r0.M4722199849958580248) e4222303495286338467).d;
                ((dev.epro.r0.M4722199849958580248) e4222303495286338467).d = -1;
                if (i >= 0) {
                    int[] iArr = a62378651844824274033.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    a62378651844824274033.k = iArrCopyOf;
                } else {
                    a62378651844824274033.getClass();
                }
                dev.epro.r0.A6237865184482427403 a62378651844824274034 = e4222303495286338467.f221o;
                dev.epro.r0.D7201182503133677242 d7201182503133677242 = e4222303495286338467.j;
                a62378651844824274034.getClass();
                synchronized (obj) {
                    a62378651844824274034.j = a62378651844824274034.j.i(d7201182503133677242);
                    dev.epro.r0.A6237865184482427403 a62378651844824274035 = e4222303495286338467.f221o;
                    int[] iArr2 = e4222303495286338467.k;
                    a62378651844824274035.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = a62378651844824274035.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = java.util.Arrays.copyOf(iArr3, length2 + length3);
                            java.lang.System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        a62378651844824274035.k = iArr2;
                    }
                }
                e4222303495286338467.m = true;
                if (!e4222303495286338467.p) {
                    e4222303495286338467.p = true;
                    e4222303495286338467.f221o.l();
                }
                return dev.epro.r0.V14274201939977296242.c;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
