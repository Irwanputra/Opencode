package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E1092155023341394263 implements dev.epro.r0.M7586588299491030525, java.lang.Iterable, dev.epro.r0.D14639766352081121636 {
    public int b;
    public int d;
    public int e;
    public boolean g;
    public int h;
    public java.util.HashMap j;
    public dev.epro.r0.Q9908018528090167751 k;
    public int[] a = new int[0];
    public java.lang.Object[] c = new java.lang.Object[0];
    public final java.lang.Object f = new java.lang.Object();
    public java.util.ArrayList i = new java.util.ArrayList();

    public static final void i(dev.epro.r0.K15438463641018513946 k15438463641018513946, int i) {
        while (k15438463641018513946.v >= 0 && k15438463641018513946.u <= i) {
            k15438463641018513946.N();
            k15438463641018513946.i();
        }
    }

    public final int a(dev.epro.r0.M7798980774515057476 m7798980774515057476) {
        if (this.g) {
            dev.epro.r0.N2332913310205178802.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!m7798980774515057476.a()) {
            dev.epro.r0.L4738636499147270068.a("Anchor refers to a group that was removed");
        }
        return m7798980774515057476.a;
    }

    public final void b() {
        this.j = new java.util.HashMap();
    }

    public final dev.epro.r0.A4559761392562572984 c(dev.epro.r0.E9133045636215945243 e9133045636215945243, dev.epro.r0.U9803441765912152712 u9803441765912152712) {
        int i;
        java.lang.Object[] objArr = u9803441765912152712.a;
        int i2 = u9803441765912152712.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (l(dev.epro.r0.G16660188620551127941.t(((dev.epro.r0.Y6676784304453696344) objArr[i3]).e))) {
                i3++;
            } else {
                dev.epro.r0.U9803441765912152712 u98034417659121527122 = new dev.epro.r0.U9803441765912152712();
                java.lang.Object[] objArr2 = u9803441765912152712.a;
                int i4 = u9803441765912152712.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    java.lang.Object obj = objArr2[i5];
                    if (l(dev.epro.r0.G16660188620551127941.t(((dev.epro.r0.Y6676784304453696344) obj).e))) {
                        u98034417659121527122.a(obj);
                    }
                }
                u9803441765912152712 = u98034417659121527122;
            }
        }
        dev.epro.r0.K13841493441907392258 k13841493441907392258 = new dev.epro.r0.K13841493441907392258(this, (byte) 5);
        if (u9803441765912152712.b > 1) {
            java.lang.Comparable comparable = (java.lang.Comparable) k13841493441907392258.invoke(u9803441765912152712.f(0));
            int i6 = u9803441765912152712.b;
            int i7 = 1;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                java.lang.Comparable comparable2 = (java.lang.Comparable) k13841493441907392258.invoke(u9803441765912152712.f(i7));
                if (comparable.compareTo(comparable2) > 0) {
                    dev.epro.r0.U9803441765912152712 u98034417659121527123 = new dev.epro.r0.U9803441765912152712(u9803441765912152712.b);
                    java.lang.Object[] objArr3 = u9803441765912152712.a;
                    int i8 = u9803441765912152712.b;
                    for (int i9 = 0; i9 < i8; i9++) {
                        u98034417659121527123.a(objArr3[i9]);
                    }
                    dev.epro.r0.K7217096618580727896 k7217096618580727896 = u98034417659121527123.c;
                    if (k7217096618580727896 == null) {
                        k7217096618580727896 = new dev.epro.r0.K7217096618580727896(u98034417659121527123, (byte) 0);
                        u98034417659121527123.c = k7217096618580727896;
                    }
                    if (((dev.epro.r0.U9803441765912152712) k7217096618580727896.b).b > 1) {
                        dev.epro.r0.R4678422174699242737.m0(k7217096618580727896, new dev.epro.r0.X16708831732427990575(k13841493441907392258, (byte) 0));
                    }
                    u9803441765912152712 = u98034417659121527123;
                } else {
                    i7++;
                    comparable = comparable2;
                }
            }
        }
        if (u9803441765912152712.h()) {
            dev.epro.r0.A4559761392562572984 a4559761392562572984 = dev.epro.r0.X4026756943680612204.b;
            a4559761392562572984.getClass();
            return a4559761392562572984;
        }
        long[] jArr = dev.epro.r0.X4026756943680612204.a;
        dev.epro.r0.A4559761392562572984 a45597613925625729842 = new dev.epro.r0.A4559761392562572984();
        dev.epro.r0.K15438463641018513946 k15438463641018513946K = k();
        try {
            java.lang.Object[] objArr4 = u9803441765912152712.a;
            int i10 = u9803441765912152712.b;
            for (int i11 = 0; i11 < i10; i11++) {
                dev.epro.r0.Y6676784304453696344 y6676784304453696344 = (dev.epro.r0.Y6676784304453696344) objArr4[i11];
                int iC = k15438463641018513946K.c(dev.epro.r0.G16660188620551127941.t(y6676784304453696344.e));
                int iF = k15438463641018513946K.F(k15438463641018513946K.b, iC);
                i(k15438463641018513946K, iF);
                i(k15438463641018513946K, iF);
                while (true) {
                    i = k15438463641018513946K.t;
                    if (i == iF || i == k15438463641018513946K.u) {
                        break;
                    }
                    if (iF < k15438463641018513946K.t(i) + i) {
                        k15438463641018513946K.Q();
                    } else {
                        k15438463641018513946K.M();
                    }
                }
                if (i != iF) {
                    dev.epro.r0.N2332913310205178802.a("Unexpected slot table structure");
                }
                k15438463641018513946K.Q();
                k15438463641018513946K.a(iC - k15438463641018513946K.t);
                a45597613925625729842.n(y6676784304453696344, dev.epro.r0.N2332913310205178802.c(y6676784304453696344.c, y6676784304453696344, k15438463641018513946K, e9133045636215945243));
            }
            i(k15438463641018513946K, Integer.MAX_VALUE);
            k15438463641018513946K.e(true);
            return a45597613925625729842;
        } catch (java.lang.Throwable th) {
            k15438463641018513946K.e(false);
            throw th;
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new dev.epro.r0.I16462844543477289135(this, 0, this.b);
    }

    public final dev.epro.r0.S2509933476155449112 j() {
        if (this.g) {
            dev.epro.r0.S10973172697741180971.m("Cannot read while a writer is pending");
            return null;
        }
        this.e++;
        return new dev.epro.r0.S2509933476155449112(this);
    }

    public final dev.epro.r0.K15438463641018513946 k() {
        if (this.g) {
            dev.epro.r0.N2332913310205178802.a("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            dev.epro.r0.N2332913310205178802.a("Cannot start a writer when a reader is pending");
        }
        this.g = true;
        this.h++;
        return new dev.epro.r0.K15438463641018513946(this);
    }

    public final boolean l(dev.epro.r0.M7798980774515057476 m7798980774515057476) {
        int iC;
        return m7798980774515057476.a() && (iC = dev.epro.r0.S13318420980680640021.c(this.i, m7798980774515057476.a, this.b)) >= 0 && dev.epro.r0.S10823041268949770285.t(this.i.get(iC), m7798980774515057476);
    }

    public final dev.epro.r0.D9991952169288007667 m(int i) {
        int i2;
        java.util.ArrayList arrayList;
        int iC;
        java.util.HashMap map = this.j;
        if (map != null) {
            if (this.g) {
                dev.epro.r0.N2332913310205178802.a("use active SlotWriter to crate an anchor for location instead");
            }
            dev.epro.r0.M7798980774515057476 m7798980774515057476 = (i < 0 || i >= (i2 = this.b) || (iC = dev.epro.r0.S13318420980680640021.c((arrayList = this.i), i, i2)) < 0) ? null : (dev.epro.r0.M7798980774515057476) arrayList.get(iC);
            if (m7798980774515057476 != null) {
                return (dev.epro.r0.D9991952169288007667) map.get(m7798980774515057476);
            }
        }
        return null;
    }
}
