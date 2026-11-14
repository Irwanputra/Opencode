package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K15438463641018513946 {
    public final E1092155023341394263 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public Q9908018528090167751 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f326o;
    public final B3798966058357121240 p;
    public final B3798966058357121240 q;
    public final B3798966058357121240 r;
    public Q9908018528090167751 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public G1892398518770611911 x;

    public K15438463641018513946(E1092155023341394263 e1092155023341394263) {
        this.a = e1092155023341394263;
        int[] iArr = e1092155023341394263.a;
        this.b = iArr;
        Object[] objArr = e1092155023341394263.c;
        this.c = objArr;
        this.d = e1092155023341394263.i;
        this.e = e1092155023341394263.j;
        this.f = e1092155023341394263.k;
        int i = e1092155023341394263.b;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = e1092155023341394263.d;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new B3798966058357121240((byte) 1);
        this.q = new B3798966058357121240((byte) 1);
        this.r = new B3798966058357121240((byte) 1);
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void y(K15438463641018513946 k15438463641018513946) {
        int i = k15438463641018513946.v;
        int iQ = k15438463641018513946.q(i);
        int[] iArr = k15438463641018513946.b;
        int i2 = (iQ * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        k15438463641018513946.V(k15438463641018513946.F(iArr, i));
    }

    public final void A(int i) {
        M7798980774515057476 m7798980774515057476;
        int i2;
        M7798980774515057476 m77989807745150574762;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iN = n() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int iB = S13318420980680640021.b(arrayList, i6, iN); iB < this.d.size() && (i3 = (m77989807745150574762 = (M7798980774515057476) this.d.get(iB)).a) < 0 && (i4 = i3 + iN) < i; iB++) {
                        m77989807745150574762.a = i4;
                    }
                } else {
                    for (int iB2 = S13318420980680640021.b(arrayList, i, iN); iB2 < this.d.size() && (i2 = (m7798980774515057476 = (M7798980774515057476) this.d.get(iB2)).a) >= 0; iB2++) {
                        m7798980774515057476.a = -(iN - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    O5378677881740157249.m0(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    O5378677881740157249.m0(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iN2 = n();
            if (i6 >= iN2) {
                N2332913310205178802.a("Check failed");
            }
            while (i6 < iN2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iO = i11 > -2 ? i11 : (o() + i11) - (-2);
                if (iO >= i) {
                    iO = -((o() - iO) - (-2));
                }
                if (iO != i11) {
                    this.b[i10] = iO;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void B(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, o());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iQ = q(iMin);
                int iQ2 = q(i5);
                int i7 = this.g;
                while (iQ < iQ2) {
                    int i8 = (iQ * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        N2332913310205178802.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iQ++;
                    if (iQ == i7) {
                        iQ += this.h;
                    }
                }
            } else {
                int iQ3 = q(i5);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i10 = (iQ3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        N2332913310205178802.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iQ3++;
                    if (iQ3 == this.g) {
                        iQ3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final List C(M7798980774515057476 m7798980774515057476, K15438463641018513946 k15438463641018513946) {
        if (k15438463641018513946.n <= 0) {
            N2332913310205178802.a("Check failed");
        }
        if (this.n != 0) {
            N2332913310205178802.a("Check failed");
        }
        if (!m7798980774515057476.a()) {
            N2332913310205178802.a("Check failed");
        }
        int iC = c(m7798980774515057476) + 1;
        int i = this.t;
        if (i > iC || iC >= this.u) {
            N2332913310205178802.a("Check failed");
        }
        int iF = F(this.b, iC);
        int iT = t(iC);
        int iE = x(iC) ? 1 : E(iC);
        List listT = U8836654130139556418.t(this, iC, k15438463641018513946, false, false, true);
        V(iF);
        boolean z = iE > 0;
        while (iF >= i) {
            int iQ = q(iF);
            int[] iArr = this.b;
            int i2 = iQ * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - iT;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    S13318420980680640021.f(iQ, (i4 & 67108863) - iE, iArr);
                }
            }
            iF = F(this.b, iF);
        }
        if (z) {
            if (this.f326o < iE) {
                N2332913310205178802.a("Check failed");
            }
            this.f326o -= iE;
        }
        return listT;
    }

    public final Object D(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(iArr, iQ))];
        }
        return null;
    }

    public final int E(int i) {
        return this.b[(q(i) * 5) + 1] & 67108863;
    }

    public final int F(int[] iArr, int i) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (o() + i2) - (-2);
    }

    public final Object G(Object obj) {
        if (this.n > 0) {
            w(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            N2332913310205178802.a("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void H() {
        int i;
        G1892398518770611911 g1892398518770611911 = this.x;
        if (g1892398518770611911 != null) {
            while (g1892398518770611911.b != 0) {
                int iB0 = O5354877807466160604.b0(g1892398518770611911);
                int iQ = q(iB0);
                int iT = iB0 + 1;
                int iT2 = t(iB0) + iB0;
                while (true) {
                    if (iT >= iT2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(iT) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iT += t(iT);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iQ * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iF = F(iArr, iB0);
                    if (iF >= 0) {
                        O5354877807466160604.y(g1892398518770611911, iF);
                    }
                }
            }
        }
    }

    public final boolean I() {
        if (this.n != 0) {
            N2332913310205178802.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iF = f(this.b, q(i));
        int iM = M();
        P(this.v);
        G1892398518770611911 g1892398518770611911 = this.x;
        if (g1892398518770611911 != null) {
            while (true) {
                int i3 = g1892398518770611911.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    K2042933864045806308.n("IntList is empty.");
                    return false;
                }
                if (g1892398518770611911.a[0] < i) {
                    break;
                }
                O5354877807466160604.b0(g1892398518770611911);
            }
        }
        boolean zJ = J(i, this.t - i);
        K(iF, this.i - iF, i - 1);
        this.t = i;
        this.i = i2;
        this.f326o -= iM;
        return zJ;
    }

    public final boolean J(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iB = S13318420980680640021.b(this.d, i3, n() - this.h);
                if (iB >= this.d.size()) {
                    iB--;
                }
                int i4 = iB + 1;
                int i5 = 0;
                while (iB >= 0) {
                    M7798980774515057476 m7798980774515057476 = (M7798980774515057476) this.d.get(iB);
                    int iC = c(m7798980774515057476);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        m7798980774515057476.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iB + 1;
                        }
                        i4 = iB;
                    }
                    iB--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                V(i8);
            }
        }
        return z;
    }

    public final void K(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            B(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object L(int i, int i2, Object obj) {
        int iO = O(this.b, q(i));
        int iF = f(this.b, q(i + 1));
        int i3 = iO + i2;
        if (i3 < iO || i3 >= iF) {
            N2332913310205178802.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iG = g(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iG];
        objArr[iG] = obj;
        return obj2;
    }

    public final int M() {
        int iQ = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(iArr, q(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void N() {
        int i = this.u;
        this.t = i;
        this.i = f(this.b, q(i));
    }

    public final int O(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int iD = S13318420980680640021.d(iArr, i);
        return iD < 0 ? (this.c.length - this.l) + iD + 1 : iD;
    }

    public final D9991952169288007667 P(int i) {
        M7798980774515057476 m7798980774515057476S;
        HashMap map = this.e;
        if (map == null || (m7798980774515057476S = S(i)) == null) {
            return null;
        }
        return (D9991952169288007667) map.get(m7798980774515057476S);
    }

    public final void Q() {
        if (this.n != 0) {
            N2332913310205178802.a("Key must be supplied when inserting");
        }
        E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
        R(0, e17149812035295265804, false, e17149812035295265804);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(int i, Object obj, boolean z, Object obj2) {
        int i2;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.e(this.f326o);
        E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
        if (objArr == true) {
            int i4 = this.t;
            int iF = f(this.b, q(i4));
            v(1);
            this.i = iF;
            this.j = iF;
            int iQ = q(i4);
            int i5 = obj != e17149812035295265804 ? 1 : 0;
            int i6 = (z || obj2 == e17149812035295265804) ? 0 : 1;
            int iH = h(iF, this.k, this.l, this.c.length);
            if (iH >= 0 && this.m < i4) {
                iH = -(((this.c.length - this.l) - iH) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = iQ * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iH;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                w(i9, i4);
                Object[] objArr2 = this.c;
                int i10 = this.i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.f326o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                P(i3);
            }
        } else {
            this.p.e(i3);
            this.q.e((n() - this.h) - this.u);
            int i11 = this.t;
            int iQ2 = q(i11);
            if (!S10823041268949770285.t(obj2, e17149812035295265804)) {
                if (z) {
                    W(this.t, obj2);
                } else {
                    U(obj2);
                }
            }
            this.i = O(this.b, iQ2);
            this.j = f(this.b, q(this.t + 1));
            int[] iArr2 = this.b;
            int i12 = iQ2 * 5;
            this.f326o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final M7798980774515057476 S(int i) {
        ArrayList arrayList;
        int iC;
        if (i < 0 || i >= o() || (iC = S13318420980680640021.c((arrayList = this.d), i, o())) < 0) {
            return null;
        }
        return (M7798980774515057476) arrayList.get(iC);
    }

    public final void T(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            G(obj);
            return;
        }
        Q9908018528090167751 q9908018528090167751 = this.s;
        if (q9908018528090167751 == null) {
            q9908018528090167751 = new Q9908018528090167751();
        }
        this.s = q9908018528090167751;
        int i = this.v;
        Object objB = q9908018528090167751.b(i);
        if (objB == null) {
            objB = new U9803441765912152712();
            q9908018528090167751.i(i, objB);
        }
        ((U9803441765912152712) objB).a(obj);
    }

    public final void U(Object obj) {
        int iQ = q(this.t);
        int i = (iQ * 5) + 1;
        if ((this.b[i] & SQLiteDatabase.CREATE_IF_NECESSARY) == 0) {
            N2332913310205178802.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(iArr, iQ))] = obj;
    }

    public final void V(int i) {
        if (i >= 0) {
            G1892398518770611911 g1892398518770611911 = this.x;
            if (g1892398518770611911 == null) {
                g1892398518770611911 = new G1892398518770611911();
                this.x = g1892398518770611911;
            }
            O5354877807466160604.y(g1892398518770611911, i);
        }
    }

    public final void W(int i, Object obj) {
        int iQ = q(i);
        int[] iArr = this.b;
        if (iQ >= iArr.length || (iArr[(iQ * 5) + 1] & 1073741824) == 0) {
            N2332913310205178802.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(this.b, iQ))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            N2332913310205178802.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            L4738636499147270068.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        int i3 = this.v;
        if (i2 < i3 || i2 > this.u) {
            N2332913310205178802.a("Cannot seek outside the current group (" + i3 + "-" + this.u + ")");
        }
        this.t = i2;
        int iF = f(this.b, q(i2));
        this.i = iF;
        this.j = iF;
    }

    public final M7798980774515057476 b(int i) {
        ArrayList arrayList = this.d;
        int iC = S13318420980680640021.c(arrayList, i, o());
        if (iC >= 0) {
            return (M7798980774515057476) arrayList.get(iC);
        }
        if (i > this.g) {
            i = -(o() - i);
        }
        M7798980774515057476 m7798980774515057476 = new M7798980774515057476(i);
        arrayList.add(-(iC + 1), m7798980774515057476);
        return m7798980774515057476;
    }

    public final int c(M7798980774515057476 m7798980774515057476) {
        int i = m7798980774515057476.a;
        return i < 0 ? o() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.e((n() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            A(o());
            B(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            H();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        Q9908018528090167751 q9908018528090167751 = this.f;
        E1092155023341394263 e1092155023341394263 = this.a;
        if (!e1092155023341394263.g) {
            L4738636499147270068.a("Unexpected writer close()");
        }
        e1092155023341394263.g = false;
        e1092155023341394263.a = iArr;
        e1092155023341394263.b = i2;
        e1092155023341394263.c = objArr;
        e1092155023341394263.d = i3;
        e1092155023341394263.i = arrayList;
        e1092155023341394263.j = map;
        e1092155023341394263.k = q9908018528090167751;
    }

    public final int f(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int g(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void i() {
        U9803441765912152712 u9803441765912152712;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iQ = q(i3);
        int i4 = this.f326o;
        int i5 = i - i3;
        int i6 = iQ * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        B3798966058357121240 b3798966058357121240 = this.r;
        if (z) {
            Q9908018528090167751 q9908018528090167751 = this.s;
            if (q9908018528090167751 != null && (u9803441765912152712 = (U9803441765912152712) q9908018528090167751.b(i3)) != null) {
                Object[] objArr = u9803441765912152712.a;
                int i8 = u9803441765912152712.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    G(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            S13318420980680640021.f(iQ, i4, iArr);
            int iD = b3798966058357121240.d();
            if (z2) {
                i4 = 1;
            }
            this.f326o = iD + i4;
            int iF = F(this.b, i3);
            this.v = iF;
            int iO = iF < 0 ? o() : q(iF + 1);
            int iF2 = iO >= 0 ? f(this.b, iO) : 0;
            this.i = iF2;
            this.j = iF2;
            return;
        }
        if (i != i2) {
            N2332913310205178802.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        S13318420980680640021.f(iQ, i4, iArr2);
        int iD2 = this.p.d();
        this.u = (n() - this.h) - this.q.d();
        this.v = iD2;
        int iF3 = F(this.b, i3);
        int iD3 = b3798966058357121240.d();
        this.f326o = iD3;
        if (iF3 == iD2) {
            this.f326o = iD3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iF3 != 0 && iF3 != iD2 && (i14 != 0 || i13 != 0)) {
                int iQ2 = q(iF3);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iQ2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    S13318420980680640021.f(iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iF3 = F(iArr5, iF3);
            }
        }
        this.f326o += i14;
    }

    public final void j() {
        if (this.n <= 0) {
            L4738636499147270068.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                N2332913310205178802.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (n() - this.h) - this.q.d();
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            N2332913310205178802.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                N2332913310205178802.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            Q();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((o() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0132, code lost:
    
        dev.epro.r0.W4415201450379021245.a("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0137, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r20, dev.epro.r0.L12639328004344855510 r21) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K15438463641018513946.m(int, dev.epro.r0.L12639328004344855510):void");
    }

    public final int n() {
        return this.b.length / 5;
    }

    public final int o() {
        return n() - this.h;
    }

    public final Object p(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = (iQ * 5) + 1;
        if ((iArr[i2] & SQLiteDatabase.CREATE_IF_NECESSARY) == 0) {
            return O9023047933786425027.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + f(iArr, iQ)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int r(int i) {
        return this.b[q(i) * 5];
    }

    public final Object s(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int t(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final String toString() {
        int i = this.t;
        int i2 = this.u;
        int iO = o();
        int i3 = this.g;
        int i4 = this.h + i3;
        StringBuilder sbP = E12098517352909843120.p(i, i2, "SlotWriter(current = ", " end=", " size = ");
        G6547577305291411977.A(sbP, iO, " gap=", i3, "-");
        return E12098517352909843120.n(sbP, i4, ")");
    }

    public final boolean u(int i, int i2) {
        int iN;
        int iT;
        if (i2 == this.v) {
            iN = this.u;
        } else {
            B3798966058357121240 b3798966058357121240 = this.p;
            if (i2 > b3798966058357121240.c(0)) {
                iT = t(i2);
            } else {
                int[] iArr = b3798966058357121240.a;
                int iMin = Math.min(iArr.length, b3798966058357121240.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iT = t(i2);
                } else {
                    iN = (n() - this.h) - this.q.a[i3];
                }
            }
            iN = iT + i2;
        }
        return i > i2 && i < iN;
    }

    public final void v(int i) {
        if (i > 0) {
            int i2 = this.t;
            A(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                O5378677881740157249.m0(0, 0, i3 * 5, iArr, iArr2);
                O5378677881740157249.m0((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int iH = h(i5 > 0 ? f(iArr, q(i2 + i)) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.b[(i9 * 5) + 4] = iH;
            }
            int i10 = this.m;
            if (i10 >= i3) {
                this.m = i10 + i;
            }
        }
    }

    public final void w(int i, int i2) {
        if (i > 0) {
            B(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean x(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void z(E1092155023341394263 e1092155023341394263, int i) {
        if (this.n <= 0) {
            N2332913310205178802.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.b == 0) {
            int[] iArr = e1092155023341394263.a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = e1092155023341394263.b;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap map = this.e;
                Q9908018528090167751 q9908018528090167751 = this.f;
                Object[] objArr2 = e1092155023341394263.c;
                int i4 = e1092155023341394263.d;
                HashMap map2 = e1092155023341394263.j;
                Q9908018528090167751 q99080185280901677512 = e1092155023341394263.k;
                this.b = iArr;
                this.c = objArr2;
                this.d = e1092155023341394263.i;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = q99080185280901677512;
                e1092155023341394263.a = iArr2;
                e1092155023341394263.b = 0;
                e1092155023341394263.c = objArr;
                e1092155023341394263.d = 0;
                e1092155023341394263.i = arrayList;
                e1092155023341394263.j = map;
                e1092155023341394263.k = q9908018528090167751;
                return;
            }
        }
        K15438463641018513946 k15438463641018513946K = e1092155023341394263.k();
        try {
            U8836654130139556418.t(k15438463641018513946K, i, this, true, true, false);
            k15438463641018513946K.e(true);
        } catch (Throwable th) {
            k15438463641018513946K.e(false);
            throw th;
        }
    }
}
