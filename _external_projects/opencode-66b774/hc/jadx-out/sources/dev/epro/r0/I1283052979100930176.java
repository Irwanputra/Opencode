package dev.epro.r0;

import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I1283052979100930176 extends R3192876217964974737 {
    public final boolean a;
    public Q7316561721656982910 b;
    public final J1604157424733740866 c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public Q14196755420833223976 h;
    public final S17255966974483065294 i;

    public I1283052979100930176(I4293432593871965076 i4293432593871965076, boolean z) {
        new AtomicReference(null);
        this.a = z;
        this.b = new Q7316561721656982910((byte) 21);
        this.c = new J1604157424733740866(i4293432593871965076);
        this.g = new ArrayList();
        Q14196755420833223976 q14196755420833223976 = Q14196755420833223976.b;
        this.h = q14196755420833223976;
        this.i = D15913187640519482289.r(q14196755420833223976);
    }

    @Override // dev.epro.r0.R3192876217964974737
    public final void a(N16594346128251165883 n16594346128251165883) {
        I2388620560486547149 f15441078260174406238;
        H9528616825559273309 h9528616825559273309;
        I4293432593871965076 i4293432593871965076;
        n16594346128251165883.getClass();
        d("addObserver");
        Q14196755420833223976 q14196755420833223976 = this.h;
        Q14196755420833223976 q141967554208332239762 = Q14196755420833223976.a;
        if (q14196755420833223976 != q141967554208332239762) {
            q141967554208332239762 = Q14196755420833223976.b;
        }
        H9528616825559273309 h95286168255592733092 = new H9528616825559273309();
        h95286168255592733092.a = q141967554208332239762;
        HashMap map = Y12253273927813044139.a;
        boolean z = n16594346128251165883 instanceof I2388620560486547149;
        boolean z2 = n16594346128251165883 instanceof A17704723979876201899;
        byte b = 2;
        Object obj = null;
        if (z && z2) {
            f15441078260174406238 = new F15441078260174406238((A17704723979876201899) n16594346128251165883, (I2388620560486547149) n16594346128251165883, b);
        } else if (z2) {
            f15441078260174406238 = new F15441078260174406238((A17704723979876201899) n16594346128251165883, obj, b);
        } else if (z) {
            f15441078260174406238 = (I2388620560486547149) n16594346128251165883;
        } else {
            Class<?> cls = n16594346128251165883.getClass();
            if (Y12253273927813044139.b(cls) == 2) {
                Object obj2 = Y12253273927813044139.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    Y12253273927813044139.a((Constructor) list.get(0), n16594346128251165883);
                    throw null;
                }
                int size = list.size();
                B4698305131960584516[] b4698305131960584516Arr = new B4698305131960584516[size];
                if (size > 0) {
                    Y12253273927813044139.a((Constructor) list.get(0), n16594346128251165883);
                    throw null;
                }
                f15441078260174406238 = new E13936048342664803406(b4698305131960584516Arr, b);
            } else {
                f15441078260174406238 = new F15441078260174406238(n16594346128251165883);
            }
        }
        h95286168255592733092.b = f15441078260174406238;
        Q7316561721656982910 q7316561721656982910 = this.b;
        q7316561721656982910.getClass();
        A4559761392562572984 a4559761392562572984 = (A4559761392562572984) q7316561721656982910.b;
        V1154380420567164397 v1154380420567164397 = (V1154380420567164397) a4559761392562572984.g(n16594346128251165883);
        if (v1154380420567164397 != null) {
            h9528616825559273309 = v1154380420567164397.b;
        } else {
            V1154380420567164397 v11543804205671643972 = new V1154380420567164397(n16594346128251165883, h95286168255592733092);
            a4559761392562572984.n(n16594346128251165883, v11543804205671643972);
            V1154380420567164397 v11543804205671643973 = (V1154380420567164397) q7316561721656982910.d;
            if (v11543804205671643973 == null) {
                q7316561721656982910.c = v11543804205671643972;
                q7316561721656982910.d = v11543804205671643972;
            } else {
                v11543804205671643973.c = v11543804205671643972;
                v11543804205671643972.d = v11543804205671643973;
                q7316561721656982910.d = v11543804205671643972;
            }
            h9528616825559273309 = null;
        }
        if (h9528616825559273309 == null && (i4293432593871965076 = (I4293432593871965076) this.c.a.get()) != null) {
            b = (this.d != 0 || this.e) ? (byte) 1 : (byte) 0;
            Q14196755420833223976 q14196755420833223976C = c(n16594346128251165883);
            this.d++;
            while (h95286168255592733092.a.compareTo(q14196755420833223976C) < 0) {
                Q7316561721656982910 q73165617216569829102 = this.b;
                q73165617216569829102.getClass();
                if (!((A4559761392562572984) q73165617216569829102.b).c(n16594346128251165883)) {
                    break;
                }
                Q14196755420833223976 q141967554208332239763 = h95286168255592733092.a;
                ArrayList arrayList = this.g;
                arrayList.add(q141967554208332239763);
                J11378867428257506542 j11378867428257506542 = P72364327365747079.Companion;
                Q14196755420833223976 q141967554208332239764 = h95286168255592733092.a;
                j11378867428257506542.getClass();
                q141967554208332239764.getClass();
                int iOrdinal = q141967554208332239764.ordinal();
                P72364327365747079 p72364327365747079 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : P72364327365747079.ON_RESUME : P72364327365747079.ON_START : P72364327365747079.ON_CREATE;
                if (p72364327365747079 == null) {
                    D11988991656201568495.k("no event up from ", h95286168255592733092.a);
                    return;
                } else {
                    h95286168255592733092.a(i4293432593871965076, p72364327365747079);
                    P17571903987102865660.s0(arrayList);
                    q14196755420833223976C = c(n16594346128251165883);
                }
            }
            if (b == 0) {
                h();
            }
            this.d--;
        }
    }

    @Override // dev.epro.r0.R3192876217964974737
    public final void b(N16594346128251165883 n16594346128251165883) {
        n16594346128251165883.getClass();
        d("removeObserver");
        Q7316561721656982910 q7316561721656982910 = this.b;
        q7316561721656982910.getClass();
        V1154380420567164397 v1154380420567164397 = (V1154380420567164397) ((A4559761392562572984) q7316561721656982910.b).l(n16594346128251165883);
        if (v1154380420567164397 == null) {
            return;
        }
        V1154380420567164397 v11543804205671643972 = v1154380420567164397.d;
        V1154380420567164397 v11543804205671643973 = v1154380420567164397.c;
        if (v11543804205671643972 == null) {
            q7316561721656982910.c = v11543804205671643973;
        } else {
            v11543804205671643972.c = v11543804205671643973;
        }
        V1154380420567164397 v11543804205671643974 = v1154380420567164397.c;
        if (v11543804205671643974 == null) {
            q7316561721656982910.d = v11543804205671643972;
        } else {
            v11543804205671643974.d = v11543804205671643972;
        }
        v1154380420567164397.e = true;
    }

    public final Q14196755420833223976 c(N16594346128251165883 n16594346128251165883) {
        Q7316561721656982910 q7316561721656982910 = this.b;
        q7316561721656982910.getClass();
        n16594346128251165883.getClass();
        V1154380420567164397 v1154380420567164397 = (V1154380420567164397) ((A4559761392562572984) q7316561721656982910.b).g(n16594346128251165883);
        V1154380420567164397 v11543804205671643972 = v1154380420567164397 != null ? v1154380420567164397.d : null;
        Q14196755420833223976 q14196755420833223976 = v11543804205671643972 != null ? v11543804205671643972.b.a : null;
        ArrayList arrayList = this.g;
        Q14196755420833223976 q141967554208332239762 = arrayList.isEmpty() ? null : (Q14196755420833223976) arrayList.get(arrayList.size() - 1);
        Q14196755420833223976 q141967554208332239763 = this.h;
        if (q14196755420833223976 == null || q14196755420833223976.compareTo(q141967554208332239763) >= 0) {
            q14196755420833223976 = q141967554208332239763;
        }
        return (q141967554208332239762 == null || q141967554208332239762.compareTo(q14196755420833223976) >= 0) ? q14196755420833223976 : q141967554208332239762;
    }

    public final void d(String str) {
        if (this.a) {
            I6631487105893062076.t().getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            Z3383101362411723454.j(G6547577305291411977.s("Method ", str, " must be called on the main thread"));
        }
    }

    public final void e(P72364327365747079 p72364327365747079) {
        p72364327365747079.getClass();
        d("handleLifecycleEvent");
        f(p72364327365747079.a());
    }

    public final void f(Q14196755420833223976 q14196755420833223976) {
        if (this.h == q14196755420833223976) {
            return;
        }
        I4293432593871965076 i4293432593871965076 = (I4293432593871965076) this.c.a.get();
        Q14196755420833223976 q141967554208332239762 = this.h;
        Q14196755420833223976 q141967554208332239763 = Q14196755420833223976.b;
        Q14196755420833223976 q141967554208332239764 = Q14196755420833223976.a;
        if (q141967554208332239762 == q141967554208332239763 && q14196755420833223976 == q141967554208332239764) {
            throw new IllegalStateException(("State must be at least '" + Q14196755420833223976.c + "' to be moved to '" + q14196755420833223976 + "' in component " + i4293432593871965076).toString());
        }
        if (q141967554208332239762 == q141967554208332239764 && q141967554208332239762 != q14196755420833223976) {
            throw new IllegalStateException(("State is '" + q141967554208332239764 + "' and cannot be moved to `" + q14196755420833223976 + "` in component " + i4293432593871965076).toString());
        }
        this.h = q14196755420833223976;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        h();
        this.e = false;
        if (this.h == q141967554208332239764) {
            this.b = new Q7316561721656982910((byte) 21);
        }
    }

    public final void g(Q14196755420833223976 q14196755420833223976) {
        q14196755420833223976.getClass();
        d("setCurrentState");
        f(q14196755420833223976);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r7.f = false;
        r7.i.j(r7.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r7 = this;
            dev.epro.r0.J1604157424733740866 r0 = r7.c
            java.lang.ref.WeakReference r0 = r0.a
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto La3
            dev.epro.r0.I4293432593871965076 r0 = (dev.epro.r0.I4293432593871965076) r0
        Lc:
            dev.epro.r0.Q7316561721656982910 r1 = r7.b
            java.lang.Object r2 = r1.b
            dev.epro.r0.A4559761392562572984 r2 = (dev.epro.r0.A4559761392562572984) r2
            int r2 = r2.e
            r3 = 0
            if (r2 != 0) goto L18
            goto L34
        L18:
            java.lang.Object r2 = r1.c
            dev.epro.r0.V1154380420567164397 r2 = (dev.epro.r0.V1154380420567164397) r2
            java.lang.String r4 = "Collection is empty."
            if (r2 == 0) goto L9f
            dev.epro.r0.H9528616825559273309 r5 = r2.b
            dev.epro.r0.Q14196755420833223976 r5 = r5.a
            java.lang.Object r1 = r1.d
            dev.epro.r0.V1154380420567164397 r1 = (dev.epro.r0.V1154380420567164397) r1
            if (r1 == 0) goto L9b
            dev.epro.r0.H9528616825559273309 r1 = r1.b
            dev.epro.r0.Q14196755420833223976 r1 = r1.a
            if (r5 != r1) goto L3e
            dev.epro.r0.Q14196755420833223976 r6 = r7.h
            if (r6 != r1) goto L3e
        L34:
            r7.f = r3
            dev.epro.r0.S17255966974483065294 r0 = r7.i
            dev.epro.r0.Q14196755420833223976 r7 = r7.h
            r0.j(r7)
            return
        L3e:
            r7.f = r3
            dev.epro.r0.Q14196755420833223976 r1 = r7.h
            if (r2 == 0) goto L97
            int r1 = r1.compareTo(r5)
            if (r1 >= 0) goto L64
            dev.epro.r0.Q7316561721656982910 r1 = r7.b
            dev.epro.r0.B15767271432352879270 r2 = new dev.epro.r0.B15767271432352879270
            r2.<init>(r7)
            r1.getClass()
            java.lang.Object r1 = r1.d
            dev.epro.r0.V1154380420567164397 r1 = (dev.epro.r0.V1154380420567164397) r1
        L58:
            if (r1 == 0) goto L64
            boolean r3 = r1.e
            if (r3 != 0) goto L61
            r2.invoke(r1)
        L61:
            dev.epro.r0.V1154380420567164397 r1 = r1.d
            goto L58
        L64:
            dev.epro.r0.Q7316561721656982910 r1 = r7.b
            java.lang.Object r1 = r1.d
            dev.epro.r0.V1154380420567164397 r1 = (dev.epro.r0.V1154380420567164397) r1
            boolean r2 = r7.f
            if (r2 != 0) goto Lc
            if (r1 == 0) goto Lc
            dev.epro.r0.Q14196755420833223976 r2 = r7.h
            dev.epro.r0.H9528616825559273309 r1 = r1.b
            dev.epro.r0.Q14196755420833223976 r1 = r1.a
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto Lc
            dev.epro.r0.Q7316561721656982910 r1 = r7.b
            dev.epro.r0.B15767271432352879270 r2 = new dev.epro.r0.B15767271432352879270
            r3 = 1
            r2.<init>(r7)
            r1.getClass()
            java.lang.Object r1 = r1.c
            dev.epro.r0.V1154380420567164397 r1 = (dev.epro.r0.V1154380420567164397) r1
        L8b:
            if (r1 == 0) goto Lc
            boolean r3 = r1.e
            if (r3 != 0) goto L94
            r2.invoke(r1)
        L94:
            dev.epro.r0.V1154380420567164397 r1 = r1.c
            goto L8b
        L97:
            dev.epro.r0.K2042933864045806308.n(r4)
            return
        L9b:
            dev.epro.r0.K2042933864045806308.n(r4)
            return
        L9f:
            dev.epro.r0.K2042933864045806308.n(r4)
            return
        La3:
            java.lang.String r7 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            dev.epro.r0.S10973172697741180971.m(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I1283052979100930176.h():void");
    }
}
