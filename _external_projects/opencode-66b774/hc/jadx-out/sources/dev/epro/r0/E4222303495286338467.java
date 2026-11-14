package dev.epro.r0;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E4222303495286338467 extends A6237865184482427403 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A6237865184482427403 f221o;
    public boolean p;

    public E4222303495286338467(long j, D7201182503133677242 d7201182503133677242, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, A6237865184482427403 a6237865184482427403) {
        super(j, d7201182503133677242, f4096073349764486348, f40960733497644863482);
        this.f221o = a6237865184482427403;
        a6237865184482427403.k();
    }

    @Override // dev.epro.r0.A6237865184482427403, dev.epro.r0.M4722199849958580248
    public final void c() {
        if (this.c) {
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
    public final E14308387479134424328 w() {
        E4222303495286338467 e4222303495286338467;
        A6237865184482427403 a6237865184482427403 = this.f221o;
        if (a6237865184482427403.m || a6237865184482427403.c) {
            return new Y12702511936777569777(this);
        }
        E13273723708836014930 e13273723708836014930 = this.h;
        long j = this.b;
        HashMap mapM = e13273723708836014930 != null ? D459204867321966484.m(a6237865184482427403.g(), this, this.f221o.d()) : null;
        Object obj = D459204867321966484.c;
        synchronized (obj) {
            try {
                D459204867321966484.v(this);
                if (e13273723708836014930 == null || e13273723708836014930.d == 0) {
                    e4222303495286338467 = this;
                    e4222303495286338467.a();
                } else {
                    e4222303495286338467 = this;
                    E14308387479134424328 e14308387479134424328Z = e4222303495286338467.z(this.f221o.g(), e13273723708836014930, mapM, this.f221o.d());
                    if (!e14308387479134424328Z.equals(V14274201939977296242.c)) {
                        return e14308387479134424328Z;
                    }
                    E13273723708836014930 e13273723708836014930X = e4222303495286338467.f221o.x();
                    if (e13273723708836014930X != null) {
                        e13273723708836014930X.j(e13273723708836014930);
                    } else {
                        e4222303495286338467.f221o.B(e13273723708836014930);
                        e4222303495286338467.h = null;
                    }
                }
                if (S10823041268949770285.A(e4222303495286338467.f221o.g(), j) < 0) {
                    e4222303495286338467.f221o.v();
                }
                A6237865184482427403 a62378651844824274032 = e4222303495286338467.f221o;
                a62378651844824274032.r(a62378651844824274032.d().b(j).a(e4222303495286338467.j));
                e4222303495286338467.f221o.A(j);
                A6237865184482427403 a62378651844824274033 = e4222303495286338467.f221o;
                int i = e4222303495286338467.d;
                e4222303495286338467.d = -1;
                if (i >= 0) {
                    int[] iArr = a62378651844824274033.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    a62378651844824274033.k = iArrCopyOf;
                } else {
                    a62378651844824274033.getClass();
                }
                A6237865184482427403 a62378651844824274034 = e4222303495286338467.f221o;
                D7201182503133677242 d7201182503133677242 = e4222303495286338467.j;
                a62378651844824274034.getClass();
                synchronized (obj) {
                    a62378651844824274034.j = a62378651844824274034.j.i(d7201182503133677242);
                    A6237865184482427403 a62378651844824274035 = e4222303495286338467.f221o;
                    int[] iArr2 = e4222303495286338467.k;
                    a62378651844824274035.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = a62378651844824274035.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
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
                return V14274201939977296242.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
