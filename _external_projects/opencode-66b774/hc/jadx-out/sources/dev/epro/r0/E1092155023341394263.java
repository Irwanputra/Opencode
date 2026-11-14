package dev.epro.r0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E1092155023341394263 implements M7586588299491030525, Iterable, D14639766352081121636 {
    public int b;
    public int d;
    public int e;
    public boolean g;
    public int h;
    public HashMap j;
    public Q9908018528090167751 k;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public final Object f = new Object();
    public ArrayList i = new ArrayList();

    public static final void i(K15438463641018513946 k15438463641018513946, int i) {
        while (k15438463641018513946.v >= 0 && k15438463641018513946.u <= i) {
            k15438463641018513946.N();
            k15438463641018513946.i();
        }
    }

    public final int a(M7798980774515057476 m7798980774515057476) {
        if (this.g) {
            N2332913310205178802.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!m7798980774515057476.a()) {
            L4738636499147270068.a("Anchor refers to a group that was removed");
        }
        return m7798980774515057476.a;
    }

    public final void b() {
        this.j = new HashMap();
    }

    public final A4559761392562572984 c(E9133045636215945243 e9133045636215945243, U9803441765912152712 u9803441765912152712) {
        int i;
        Object[] objArr = u9803441765912152712.a;
        int i2 = u9803441765912152712.b;
        byte b = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (l(G16660188620551127941.t(((Y6676784304453696344) objArr[i3]).e))) {
                i3++;
            } else {
                U9803441765912152712 u98034417659121527122 = new U9803441765912152712();
                Object[] objArr2 = u9803441765912152712.a;
                int i4 = u9803441765912152712.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj = objArr2[i5];
                    if (l(G16660188620551127941.t(((Y6676784304453696344) obj).e))) {
                        u98034417659121527122.a(obj);
                    }
                }
                u9803441765912152712 = u98034417659121527122;
            }
        }
        K13841493441907392258 k13841493441907392258 = new K13841493441907392258((Object) this, (byte) 5);
        if (u9803441765912152712.b > 1) {
            Comparable comparable = (Comparable) k13841493441907392258.invoke(u9803441765912152712.f(0));
            int i6 = u9803441765912152712.b;
            int i7 = 1;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                Comparable comparable2 = (Comparable) k13841493441907392258.invoke(u9803441765912152712.f(i7));
                if (comparable.compareTo(comparable2) > 0) {
                    U9803441765912152712 u98034417659121527123 = new U9803441765912152712(u9803441765912152712.b);
                    Object[] objArr3 = u9803441765912152712.a;
                    int i8 = u9803441765912152712.b;
                    for (int i9 = 0; i9 < i8; i9++) {
                        u98034417659121527123.a(objArr3[i9]);
                    }
                    K7217096618580727896 k7217096618580727896 = u98034417659121527123.c;
                    if (k7217096618580727896 == null) {
                        k7217096618580727896 = new K7217096618580727896(u98034417659121527123, b);
                        u98034417659121527123.c = k7217096618580727896;
                    }
                    if (((U9803441765912152712) k7217096618580727896.b).b > 1) {
                        R4678422174699242737.m0(k7217096618580727896, new X16708831732427990575(k13841493441907392258, b));
                    }
                    u9803441765912152712 = u98034417659121527123;
                } else {
                    i7++;
                    comparable = comparable2;
                }
            }
        }
        if (u9803441765912152712.h()) {
            A4559761392562572984 a4559761392562572984 = X4026756943680612204.b;
            a4559761392562572984.getClass();
            return a4559761392562572984;
        }
        long[] jArr = X4026756943680612204.a;
        A4559761392562572984 a45597613925625729842 = new A4559761392562572984();
        K15438463641018513946 k15438463641018513946K = k();
        try {
            Object[] objArr4 = u9803441765912152712.a;
            int i10 = u9803441765912152712.b;
            for (int i11 = 0; i11 < i10; i11++) {
                Y6676784304453696344 y6676784304453696344 = (Y6676784304453696344) objArr4[i11];
                int iC = k15438463641018513946K.c(G16660188620551127941.t(y6676784304453696344.e));
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
                    N2332913310205178802.a("Unexpected slot table structure");
                }
                k15438463641018513946K.Q();
                k15438463641018513946K.a(iC - k15438463641018513946K.t);
                a45597613925625729842.n(y6676784304453696344, N2332913310205178802.c(y6676784304453696344.c, y6676784304453696344, k15438463641018513946K, e9133045636215945243));
            }
            i(k15438463641018513946K, Integer.MAX_VALUE);
            k15438463641018513946K.e(true);
            return a45597613925625729842;
        } catch (Throwable th) {
            k15438463641018513946K.e(false);
            throw th;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new I16462844543477289135(this, 0, this.b);
    }

    public final S2509933476155449112 j() {
        if (this.g) {
            S10973172697741180971.m("Cannot read while a writer is pending");
            return null;
        }
        this.e++;
        return new S2509933476155449112(this);
    }

    public final K15438463641018513946 k() {
        if (this.g) {
            N2332913310205178802.a("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            N2332913310205178802.a("Cannot start a writer when a reader is pending");
        }
        this.g = true;
        this.h++;
        return new K15438463641018513946(this);
    }

    public final boolean l(M7798980774515057476 m7798980774515057476) {
        int iC;
        return m7798980774515057476.a() && (iC = S13318420980680640021.c(this.i, m7798980774515057476.a, this.b)) >= 0 && S10823041268949770285.t(this.i.get(iC), m7798980774515057476);
    }

    public final D9991952169288007667 m(int i) {
        int i2;
        ArrayList arrayList;
        int iC;
        HashMap map = this.j;
        if (map != null) {
            if (this.g) {
                N2332913310205178802.a("use active SlotWriter to crate an anchor for location instead");
            }
            M7798980774515057476 m7798980774515057476 = (i < 0 || i >= (i2 = this.b) || (iC = S13318420980680640021.c((arrayList = this.i), i, i2)) < 0) ? null : (M7798980774515057476) arrayList.get(iC);
            if (m7798980774515057476 != null) {
                return (D9991952169288007667) map.get(m7798980774515057476);
            }
        }
        return null;
    }
}
