package dev.epro.r0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X3172131531941125810 {
    public final S17255966974483065294 a = D15913187640519482289.r(J5893921378734434004.q);
    public final S17255966974483065294 b;
    public final S14249227312368728278 c;
    public final N11678082982039175888 d;
    public final N11678082982039175888 e;
    public Y10166432356890198008 f;
    public int g;
    public R967311890144455702 h;
    public final K18075763046227786881 i;
    public final K18075763046227786881 j;
    public final K18075763046227786881 k;
    public boolean l;
    public boolean m;
    public boolean n;

    public X3172131531941125810() {
        S17255966974483065294 r = D15913187640519482289.r(new K17144186020438744863());
        this.b = r;
        this.c = new S14249227312368728278(r);
        this.d = new N11678082982039175888();
        this.e = new N11678082982039175888();
        this.i = N18175069617523293125.a();
        this.j = N18175069617523293125.a();
        this.k = N18175069617523293125.a();
    }

    public final void a(J15730374346044043770 j15730374346044043770, R967311890144455702 r967311890144455702, int i) {
        j15730374346044043770.getClass();
        if (r967311890144455702.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).g(r967311890144455702);
            r967311890144455702.a = j15730374346044043770;
            ((K17144186020438744863) this.c.a.getValue()).getClass();
            r967311890144455702.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(r967311890144455702);
        J15730374346044043770 j157303743460440437702 = r967311890144455702.a;
        sb.append("' is already added to dispatcher ");
        sb.append(j157303743460440437702);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        N11678082982039175888 n11678082982039175888 = this.d;
        if (!n11678082982039175888.isEmpty()) {
            Iterator it = n11678082982039175888.iterator();
            while (it.hasNext()) {
                if (((Y10166432356890198008) it.next()).d) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        N11678082982039175888 n116780829820391758882 = this.e;
        if (!n116780829820391758882.isEmpty()) {
            Iterator it2 = n116780829820391758882.iterator();
            while (it2.hasNext()) {
                if (((Y10166432356890198008) it2.next()).d) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        if (z4) {
            K18075763046227786881 k18075763046227786881 = this.k;
            Object[] objArr = k18075763046227786881.b;
            long[] jArr = k18075763046227786881.c;
            int i = k18075763046227786881.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                ((R967311890144455702) objArr[i]).b(z);
                i = i2;
            }
        }
        if (z5) {
            K18075763046227786881 k180757630462277868812 = this.j;
            Object[] objArr2 = k180757630462277868812.b;
            long[] jArr2 = k180757630462277868812.c;
            int i3 = k180757630462277868812.e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ((R967311890144455702) objArr2[i3]).b(z2);
                i3 = i4;
            }
        }
        if (z6) {
            K18075763046227786881 k180757630462277868813 = this.i;
            Object[] objArr3 = k180757630462277868813.b;
            long[] jArr3 = k180757630462277868813.c;
            int i5 = k180757630462277868813.e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ((R967311890144455702) objArr3[i5]).b(z3);
                i5 = i6;
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        Y10166432356890198008 y10166432356890198008 = this.f;
        if (y10166432356890198008 == null) {
            y10166432356890198008 = c(0);
        }
        d(y10166432356890198008);
    }

    public final Y10166432356890198008 c(int i) {
        Object obj;
        Object obj2;
        N11678082982039175888 n11678082982039175888 = this.e;
        N11678082982039175888 n116780829820391758882 = this.d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = n116780829820391758882.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Y10166432356890198008) obj).d) {
                    break;
                }
            }
            Y10166432356890198008 y10166432356890198008 = (Y10166432356890198008) obj;
            if (y10166432356890198008 != null) {
                return y10166432356890198008;
            }
            Iterator it2 = n11678082982039175888.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((Y10166432356890198008) next).d) {
                    obj3 = next;
                    break;
                }
            }
            return (Y10166432356890198008) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = n116780829820391758882.iterator();
            while (it3.hasNext()) {
                ((Y10166432356890198008) it3.next()).getClass();
            }
            Iterator it4 = n11678082982039175888.iterator();
            while (it4.hasNext()) {
                ((Y10166432356890198008) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = n116780829820391758882.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((Y10166432356890198008) obj2).d) {
                break;
            }
        }
        Y10166432356890198008 y101664323568901980082 = (Y10166432356890198008) obj2;
        if (y101664323568901980082 != null) {
            return y101664323568901980082;
        }
        Iterator it6 = n11678082982039175888.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((Y10166432356890198008) next2).d) {
                obj3 = next2;
                break;
            }
        }
        return (Y10166432356890198008) obj3;
    }

    public final void d(Y10166432356890198008 y10166432356890198008) {
        K17144186020438744863 k17144186020438744863;
        Y10166432356890198008 y101664323568901980082 = this.f;
        if (y101664323568901980082 == null) {
            y101664323568901980082 = c(0);
        }
        if (S10823041268949770285.t(y101664323568901980082, y10166432356890198008)) {
            if (y101664323568901980082 == null) {
                k17144186020438744863 = new K17144186020438744863();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = this.d.iterator();
                while (it.hasNext()) {
                    Y10166432356890198008 y101664323568901980083 = (Y10166432356890198008) it.next();
                    if (y101664323568901980083.d && !y101664323568901980083.b.isEmpty()) {
                        arrayList.addAll(y101664323568901980083.b);
                    }
                }
                Iterator<E> it2 = this.e.iterator();
                while (it2.hasNext()) {
                    Y10166432356890198008 y101664323568901980084 = (Y10166432356890198008) it2.next();
                    if (y101664323568901980084.d && !y101664323568901980084.b.isEmpty()) {
                        arrayList.addAll(y101664323568901980084.b);
                    }
                }
                O8620973563946607355 o8620973563946607355 = y101664323568901980082.a;
                List list = y101664323568901980082.c;
                o8620973563946607355.getClass();
                list.getClass();
                k17144186020438744863 = new K17144186020438744863(o8620973563946607355, arrayList, list, arrayList.size());
            }
            S17255966974483065294 s17255966974483065294 = this.b;
            if (S10823041268949770285.t((K17144186020438744863) s17255966974483065294.getValue(), k17144186020438744863)) {
                return;
            }
            s17255966974483065294.k(null, k17144186020438744863);
            K18075763046227786881 k18075763046227786881 = this.k;
            Object[] objArr = k18075763046227786881.b;
            long[] jArr = k18075763046227786881.c;
            int i = k18075763046227786881.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) (2147483647L & (jArr[i] >> 31));
                ((R967311890144455702) objArr[i]).getClass();
                i = i2;
            }
            K18075763046227786881 k180757630462277868812 = this.j;
            Object[] objArr2 = k180757630462277868812.b;
            long[] jArr2 = k180757630462277868812.c;
            int i3 = k180757630462277868812.e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ((R967311890144455702) objArr2[i3]).getClass();
                i3 = i4;
            }
            K18075763046227786881 k180757630462277868813 = this.i;
            Object[] objArr3 = k180757630462277868813.b;
            long[] jArr3 = k180757630462277868813.c;
            int i5 = k180757630462277868813.e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ((R967311890144455702) objArr3[i5]).getClass();
                i5 = i6;
            }
        }
    }
}
