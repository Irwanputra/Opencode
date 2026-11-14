package dev.epro.r0;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P14575954172000745949 {
    public G10327508498288787502 A;
    public G10327508498288787502 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public J12447903228903363333 L;
    public final U3594978070141619353 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public U6333859635337865127 g;
    public final W8455343525638953052 l;
    public final CopyOnWriteArrayList m;
    public final H14412762845723932898 n;

    /* renamed from: o, reason: collision with root package name */
    public final H14412762845723932898 f420o;
    public final H14412762845723932898 p;
    public final H14412762845723932898 q;
    public final F5958934288633973125 r;
    public int s;
    public C10994625127000459680 t;
    public C775827382551829194 u;
    public C13374971588771233833 v;
    public C13374971588771233833 w;
    public final U1393585516073146670 x;
    public final E17149812035295265804 y;
    public G10327508498288787502 z;
    public final ArrayList a = new ArrayList();
    public final J15730374346044043770 c = new J15730374346044043770((byte) 9);
    public final H2282843232792910150 f = new H2282843232792910150(this);
    public final U14177313425639231181 h = new U14177313425639231181(this, 1);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [dev.epro.r0.H14412762845723932898] */
    /* JADX WARN: Type inference failed for: r0v13, types: [dev.epro.r0.H14412762845723932898] */
    /* JADX WARN: Type inference failed for: r0v14, types: [dev.epro.r0.H14412762845723932898] */
    /* JADX WARN: Type inference failed for: r0v15, types: [dev.epro.r0.H14412762845723932898] */
    public P14575954172000745949() {
        Collections.synchronizedMap(new HashMap());
        this.l = new W8455343525638953052(this);
        this.m = new CopyOnWriteArrayList();
        final byte b = 0;
        this.n = new R9757436368382764378(this) { // from class: dev.epro.r0.H14412762845723932898
            public final /* synthetic */ P14575954172000745949 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.R9757436368382764378
            public final void accept(Object obj) {
                byte b2 = b;
                P14575954172000745949 p14575954172000745949 = this.b;
                switch (b2) {
                    case 0:
                        if (p14575954172000745949.E()) {
                            p14575954172000745949.g(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (p14575954172000745949.E() && num.intValue() == 80) {
                            p14575954172000745949.k(false);
                            break;
                        }
                        break;
                    case 2:
                        H9171223753206057471 h9171223753206057471 = (H9171223753206057471) obj;
                        if (p14575954172000745949.E()) {
                            boolean z = h9171223753206057471.a;
                            p14575954172000745949.l(false);
                            break;
                        }
                        break;
                    default:
                        T1971145964501728936 t1971145964501728936 = (T1971145964501728936) obj;
                        if (p14575954172000745949.E()) {
                            boolean z2 = t1971145964501728936.a;
                            p14575954172000745949.q(false);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.f420o = new R9757436368382764378(this) { // from class: dev.epro.r0.H14412762845723932898
            public final /* synthetic */ P14575954172000745949 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.R9757436368382764378
            public final void accept(Object obj) {
                byte b22 = b2;
                P14575954172000745949 p14575954172000745949 = this.b;
                switch (b22) {
                    case 0:
                        if (p14575954172000745949.E()) {
                            p14575954172000745949.g(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (p14575954172000745949.E() && num.intValue() == 80) {
                            p14575954172000745949.k(false);
                            break;
                        }
                        break;
                    case 2:
                        H9171223753206057471 h9171223753206057471 = (H9171223753206057471) obj;
                        if (p14575954172000745949.E()) {
                            boolean z = h9171223753206057471.a;
                            p14575954172000745949.l(false);
                            break;
                        }
                        break;
                    default:
                        T1971145964501728936 t1971145964501728936 = (T1971145964501728936) obj;
                        if (p14575954172000745949.E()) {
                            boolean z2 = t1971145964501728936.a;
                            p14575954172000745949.q(false);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.p = new R9757436368382764378(this) { // from class: dev.epro.r0.H14412762845723932898
            public final /* synthetic */ P14575954172000745949 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.R9757436368382764378
            public final void accept(Object obj) {
                byte b22 = b3;
                P14575954172000745949 p14575954172000745949 = this.b;
                switch (b22) {
                    case 0:
                        if (p14575954172000745949.E()) {
                            p14575954172000745949.g(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (p14575954172000745949.E() && num.intValue() == 80) {
                            p14575954172000745949.k(false);
                            break;
                        }
                        break;
                    case 2:
                        H9171223753206057471 h9171223753206057471 = (H9171223753206057471) obj;
                        if (p14575954172000745949.E()) {
                            boolean z = h9171223753206057471.a;
                            p14575954172000745949.l(false);
                            break;
                        }
                        break;
                    default:
                        T1971145964501728936 t1971145964501728936 = (T1971145964501728936) obj;
                        if (p14575954172000745949.E()) {
                            boolean z2 = t1971145964501728936.a;
                            p14575954172000745949.q(false);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.q = new R9757436368382764378(this) { // from class: dev.epro.r0.H14412762845723932898
            public final /* synthetic */ P14575954172000745949 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.R9757436368382764378
            public final void accept(Object obj) {
                byte b22 = b4;
                P14575954172000745949 p14575954172000745949 = this.b;
                switch (b22) {
                    case 0:
                        if (p14575954172000745949.E()) {
                            p14575954172000745949.g(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (p14575954172000745949.E() && num.intValue() == 80) {
                            p14575954172000745949.k(false);
                            break;
                        }
                        break;
                    case 2:
                        H9171223753206057471 h9171223753206057471 = (H9171223753206057471) obj;
                        if (p14575954172000745949.E()) {
                            boolean z = h9171223753206057471.a;
                            p14575954172000745949.l(false);
                            break;
                        }
                        break;
                    default:
                        T1971145964501728936 t1971145964501728936 = (T1971145964501728936) obj;
                        if (p14575954172000745949.E()) {
                            boolean z2 = t1971145964501728936.a;
                            p14575954172000745949.q(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.r = new F5958934288633973125(this);
        this.s = -1;
        this.x = new U1393585516073146670(this);
        this.y = new E17149812035295265804((byte) 13);
        this.C = new ArrayDeque();
        this.M = new U3594978070141619353((Object) this, (byte) 5);
    }

    public static boolean D(C13374971588771233833 c13374971588771233833) {
        ArrayList F = c13374971588771233833.t.c.F();
        int size = F.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = F.get(i);
            i++;
            C13374971588771233833 c133749715887712338332 = (C13374971588771233833) obj;
            if (c133749715887712338332 != null) {
                z = D(c133749715887712338332);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(C13374971588771233833 c13374971588771233833) {
        if (c13374971588771233833 == null) {
            return true;
        }
        if (c13374971588771233833.B) {
            return c13374971588771233833.r == null || F(c13374971588771233833.u);
        }
        return false;
    }

    public static boolean G(C13374971588771233833 c13374971588771233833) {
        if (c13374971588771233833 == null) {
            return true;
        }
        P14575954172000745949 p14575954172000745949 = c13374971588771233833.r;
        return c13374971588771233833 == p14575954172000745949.w && G(p14575954172000745949.v);
    }

    public final ViewGroup A(C13374971588771233833 c13374971588771233833) {
        ViewGroup viewGroup = c13374971588771233833.D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (c13374971588771233833.w <= 0 || !this.u.T()) {
            return null;
        }
        View S = this.u.S(c13374971588771233833.w);
        if (S instanceof ViewGroup) {
            return (ViewGroup) S;
        }
        return null;
    }

    public final U1393585516073146670 B() {
        C13374971588771233833 c13374971588771233833 = this.v;
        return c13374971588771233833 != null ? c13374971588771233833.r.B() : this.x;
    }

    public final E17149812035295265804 C() {
        C13374971588771233833 c13374971588771233833 = this.v;
        return c13374971588771233833 != null ? c13374971588771233833.r.C() : this.y;
    }

    public final boolean E() {
        C13374971588771233833 c13374971588771233833 = this.v;
        if (c13374971588771233833 == null) {
            return true;
        }
        return c13374971588771233833.s != null && c13374971588771233833.k && c13374971588771233833.k().E();
    }

    public final void H(int i, boolean z) {
        C10994625127000459680 c10994625127000459680;
        if (this.t == null && i != -1) {
            S10973172697741180971.m("No activity");
            return;
        }
        if (z || i != this.s) {
            this.s = i;
            J15730374346044043770 j15730374346044043770 = this.c;
            HashMap hashMap = (HashMap) j15730374346044043770.d;
            ArrayList arrayList = (ArrayList) j15730374346044043770.c;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                B11652692535345282996 b11652692535345282996 = (B11652692535345282996) hashMap.get(((C13374971588771233833) obj).e);
                if (b11652692535345282996 != null) {
                    b11652692535345282996.j();
                }
            }
            for (B11652692535345282996 b116526925353452829962 : hashMap.values()) {
                if (b116526925353452829962 != null) {
                    b116526925353452829962.j();
                    C13374971588771233833 c13374971588771233833 = b116526925353452829962.c;
                    if (c13374971588771233833.l && !c13374971588771233833.o()) {
                        j15730374346044043770.O(b116526925353452829962);
                    }
                }
            }
            U();
            if (this.D && (c10994625127000459680 = this.t) != null && this.s == 7) {
                c10994625127000459680.u.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void I() {
        if (this.t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.g = false;
        for (C13374971588771233833 c13374971588771233833 : this.c.G()) {
            if (c13374971588771233833 != null) {
                c13374971588771233833.t.I();
            }
        }
    }

    public final boolean J() {
        x(false);
        w(true);
        C13374971588771233833 c13374971588771233833 = this.w;
        if (c13374971588771233833 != null && c13374971588771233833.e().J()) {
            return true;
        }
        boolean K = K(this.I, this.J, -1, 0);
        if (K) {
            this.b = true;
            try {
                M(this.I, this.J);
            } finally {
                c();
            }
        }
        W();
        t();
        ((HashMap) this.c.d).values().removeAll(Collections.singleton(null));
        return K;
    }

    public final boolean K(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    W10130330342449691688 w10130330342449691688 = (W10130330342449691688) this.d.get(size);
                    if (i >= 0 && i == w10130330342449691688.r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        W10130330342449691688 w101303303424496916882 = (W10130330342449691688) this.d.get(i3 - 1);
                        if (i < 0 || i != w101303303424496916882.r) {
                            break;
                        }
                        i3--;
                    }
                } else if (size != this.d.size() - 1) {
                    i3 = size + 1;
                }
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((W10130330342449691688) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void L(C13374971588771233833 c13374971588771233833) {
        boolean o2 = c13374971588771233833.o();
        if (c13374971588771233833.z && o2) {
            return;
        }
        J15730374346044043770 j15730374346044043770 = this.c;
        synchronized (((ArrayList) j15730374346044043770.c)) {
            ((ArrayList) j15730374346044043770.c).remove(c13374971588771233833);
        }
        c13374971588771233833.k = false;
        if (D(c13374971588771233833)) {
            this.D = true;
        }
        c13374971588771233833.l = true;
        T(c13374971588771233833);
    }

    public final void M(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            S10973172697741180971.m("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((W10130330342449691688) arrayList.get(i)).f550o) {
                if (i2 != i) {
                    y(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((W10130330342449691688) arrayList.get(i2)).f550o) {
                        i2++;
                    }
                }
                y(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            y(arrayList, arrayList2, i2, size);
        }
    }

    public final void N(Parcelable parcelable) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.t.r.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.t.r.getClassLoader());
                arrayList.add((J13380993798601407787) bundle.getParcelable("state"));
            }
        }
        J15730374346044043770 j15730374346044043770 = this.c;
        HashMap hashMap = (HashMap) j15730374346044043770.e;
        HashMap hashMap2 = (HashMap) j15730374346044043770.d;
        hashMap.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            J13380993798601407787 j13380993798601407787 = (J13380993798601407787) obj;
            hashMap.put(j13380993798601407787.b, j13380993798601407787);
        }
        Y4202658600493238058 y4202658600493238058 = (Y4202658600493238058) bundle3.getParcelable("state");
        if (y4202658600493238058 == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = y4202658600493238058.a;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            J13380993798601407787 j133809937986014077872 = (J13380993798601407787) ((HashMap) j15730374346044043770.e).remove((String) obj2);
            if (j133809937986014077872 != null) {
                C13374971588771233833 c13374971588771233833 = (C13374971588771233833) this.L.b.get(j133809937986014077872.b);
                W8455343525638953052 w8455343525638953052 = this.l;
                B11652692535345282996 b11652692535345282996 = c13374971588771233833 != null ? new B11652692535345282996(w8455343525638953052, j15730374346044043770, c13374971588771233833, j133809937986014077872) : new B11652692535345282996(w8455343525638953052, this.c, this.t.r.getClassLoader(), B(), j133809937986014077872);
                b11652692535345282996.c.r = this;
                b11652692535345282996.k(this.t.r.getClassLoader());
                j15730374346044043770.N(b11652692535345282996);
                b11652692535345282996.e = this.s;
            }
        }
        J12447903228903363333 j12447903228903363333 = this.L;
        j12447903228903363333.getClass();
        ArrayList arrayList3 = new ArrayList(j12447903228903363333.b.values());
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            C13374971588771233833 c133749715887712338332 = (C13374971588771233833) obj3;
            if (hashMap2.get(c133749715887712338332.e) == null) {
                J12447903228903363333 j124479032289033633332 = this.L;
                if (!j124479032289033633332.g) {
                    j124479032289033633332.b.remove(c133749715887712338332.e);
                }
                c133749715887712338332.r = this;
                B11652692535345282996 b116526925353452829962 = new B11652692535345282996(this.l, j15730374346044043770, c133749715887712338332);
                b116526925353452829962.e = 1;
                b116526925353452829962.j();
                c133749715887712338332.l = true;
                b116526925353452829962.j();
            }
        }
        ArrayList arrayList4 = y4202658600493238058.b;
        ((ArrayList) j15730374346044043770.c).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i4 = 0;
            while (i4 < size4) {
                Object obj4 = arrayList4.get(i4);
                i4++;
                String str3 = (String) obj4;
                C13374971588771233833 A = j15730374346044043770.A(str3);
                if (A == null) {
                    S10973172697741180971.m(G6547577305291411977.s("No instantiated fragment for (", str3, ")"));
                    return;
                }
                j15730374346044043770.j(A);
            }
        }
        if (y4202658600493238058.c != null) {
            this.d = new ArrayList(y4202658600493238058.c.length);
            int i5 = 0;
            while (true) {
                B6836344041339734677[] b6836344041339734677Arr = y4202658600493238058.c;
                if (i5 >= b6836344041339734677Arr.length) {
                    break;
                }
                B6836344041339734677 b6836344041339734677 = b6836344041339734677Arr[i5];
                ArrayList arrayList5 = b6836344041339734677.b;
                W10130330342449691688 w10130330342449691688 = new W10130330342449691688(this);
                int[] iArr = b6836344041339734677.a;
                int i6 = 0;
                int i7 = 0;
                while (i6 < iArr.length) {
                    M12888013728560752810 m12888013728560752810 = new M12888013728560752810();
                    m12888013728560752810.a = iArr[i6];
                    m12888013728560752810.h = Q14196755420833223976.values()[b6836344041339734677.c[i7]];
                    m12888013728560752810.i = Q14196755420833223976.values()[b6836344041339734677.d[i7]];
                    int i8 = i6 + 2;
                    m12888013728560752810.c = iArr[i6 + 1] != 0;
                    int i9 = iArr[i8];
                    m12888013728560752810.d = i9;
                    int i10 = iArr[i6 + 3];
                    m12888013728560752810.e = i10;
                    int i11 = i6 + 5;
                    int i12 = iArr[i6 + 4];
                    m12888013728560752810.f = i12;
                    i6 += 6;
                    int i13 = iArr[i11];
                    m12888013728560752810.g = i13;
                    w10130330342449691688.b = i9;
                    w10130330342449691688.c = i10;
                    w10130330342449691688.d = i12;
                    w10130330342449691688.e = i13;
                    w10130330342449691688.b(m12888013728560752810);
                    i7++;
                }
                w10130330342449691688.f = b6836344041339734677.e;
                w10130330342449691688.h = b6836344041339734677.f;
                w10130330342449691688.g = true;
                w10130330342449691688.i = b6836344041339734677.h;
                w10130330342449691688.j = b6836344041339734677.i;
                w10130330342449691688.k = b6836344041339734677.j;
                w10130330342449691688.l = b6836344041339734677.k;
                w10130330342449691688.m = b6836344041339734677.l;
                w10130330342449691688.n = b6836344041339734677.m;
                w10130330342449691688.f550o = b6836344041339734677.n;
                w10130330342449691688.r = b6836344041339734677.g;
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    String str4 = (String) arrayList5.get(i14);
                    if (str4 != null) {
                        ((M12888013728560752810) w10130330342449691688.a.get(i14)).b = j15730374346044043770.A(str4);
                    }
                }
                w10130330342449691688.c(1);
                this.d.add(w10130330342449691688);
                i5++;
            }
        } else {
            this.d = null;
        }
        this.i.set(y4202658600493238058.d);
        String str5 = y4202658600493238058.e;
        if (str5 != null) {
            C13374971588771233833 A2 = j15730374346044043770.A(str5);
            this.w = A2;
            p(A2);
        }
        ArrayList arrayList6 = y4202658600493238058.f;
        if (arrayList6 != null) {
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                this.j.put((String) arrayList6.get(i15), (I5194986633932264076) y4202658600493238058.g.get(i15));
            }
        }
        this.C = new ArrayDeque(y4202658600493238058.h);
    }

    public final Bundle O() {
        int i;
        ArrayList arrayList;
        B6836344041339734677[] b6836344041339734677Arr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = d().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            K16824163401944882247 k16824163401944882247 = (K16824163401944882247) it.next();
            if (k16824163401944882247.e) {
                k16824163401944882247.e = false;
                k16824163401944882247.b();
            }
        }
        Iterator it2 = d().iterator();
        while (it2.hasNext()) {
            ((K16824163401944882247) it2.next()).c();
        }
        x(true);
        this.E = true;
        this.L.g = true;
        J15730374346044043770 j15730374346044043770 = this.c;
        j15730374346044043770.getClass();
        HashMap hashMap = (HashMap) j15730374346044043770.d;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            B11652692535345282996 b11652692535345282996 = (B11652692535345282996) it3.next();
            if (b11652692535345282996 != null) {
                C13374971588771233833 c13374971588771233833 = b11652692535345282996.c;
                J13380993798601407787 j13380993798601407787 = new J13380993798601407787(c13374971588771233833);
                if (c13374971588771233833.a <= -1 || j13380993798601407787.m != null) {
                    j13380993798601407787.m = c13374971588771233833.b;
                } else {
                    Bundle bundle2 = new Bundle();
                    c13374971588771233833.v(bundle2);
                    c13374971588771233833.O.w(bundle2);
                    bundle2.putParcelable("android:support:fragments", c13374971588771233833.t.O());
                    b11652692535345282996.a.w(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (c13374971588771233833.c != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", c13374971588771233833.c);
                    }
                    if (c13374971588771233833.d != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", c13374971588771233833.d);
                    }
                    if (!c13374971588771233833.F) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", c13374971588771233833.F);
                    }
                    j13380993798601407787.m = bundle3;
                    if (c13374971588771233833.h != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                            j13380993798601407787.m = bundle3;
                        }
                        bundle3.putString("android:target_state", c13374971588771233833.h);
                        int i2 = c13374971588771233833.i;
                        if (i2 != 0) {
                            j13380993798601407787.m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(c13374971588771233833.e);
            }
        }
        J15730374346044043770 j157303743460440437702 = this.c;
        j157303743460440437702.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) j157303743460440437702.e).values());
        if (!arrayList3.isEmpty()) {
            J15730374346044043770 j157303743460440437703 = this.c;
            synchronized (((ArrayList) j157303743460440437703.c)) {
                try {
                    if (((ArrayList) j157303743460440437703.c).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) j157303743460440437703.c).size());
                        ArrayList arrayList4 = (ArrayList) j157303743460440437703.c;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj = arrayList4.get(i3);
                            i3++;
                            arrayList.add(((C13374971588771233833) obj).e);
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                b6836344041339734677Arr = null;
            } else {
                b6836344041339734677Arr = new B6836344041339734677[size];
                for (int i4 = 0; i4 < size; i4++) {
                    b6836344041339734677Arr[i4] = new B6836344041339734677((W10130330342449691688) this.d.get(i4));
                }
            }
            Y4202658600493238058 y4202658600493238058 = new Y4202658600493238058();
            y4202658600493238058.e = null;
            ArrayList arrayList6 = new ArrayList();
            y4202658600493238058.f = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            y4202658600493238058.g = arrayList7;
            y4202658600493238058.a = arrayList2;
            y4202658600493238058.b = arrayList;
            y4202658600493238058.c = b6836344041339734677Arr;
            y4202658600493238058.d = this.i.get();
            C13374971588771233833 c133749715887712338332 = this.w;
            if (c133749715887712338332 != null) {
                y4202658600493238058.e = c133749715887712338332.e;
            }
            arrayList6.addAll(this.j.keySet());
            arrayList7.addAll(this.j.values());
            y4202658600493238058.h = new ArrayList(this.C);
            bundle.putParcelable("state", y4202658600493238058);
            for (String str : this.k.keySet()) {
                bundle.putBundle(G6547577305291411977.C("result_", str), (Bundle) this.k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                J13380993798601407787 j133809937986014077872 = (J13380993798601407787) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", j133809937986014077872);
                bundle.putBundle("fragment_" + j133809937986014077872.b, bundle4);
            }
        }
        return bundle;
    }

    public final void P() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.t.s.removeCallbacks(this.M);
                    this.t.s.post(this.M);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Q(C13374971588771233833 c13374971588771233833, boolean z) {
        ViewGroup A = A(c13374971588771233833);
        if (A == null || !(A instanceof B8973123839147806920)) {
            return;
        }
        ((B8973123839147806920) A).setDrawDisappearingViewsLast(!z);
    }

    public final void R(C13374971588771233833 c13374971588771233833, Q14196755420833223976 q14196755420833223976) {
        if (c13374971588771233833 == this.c.A(c13374971588771233833.e) && (c13374971588771233833.s == null || c13374971588771233833.r == this)) {
            c13374971588771233833.K = q14196755420833223976;
        } else {
            S10973172697741180971.l("Fragment ", c13374971588771233833, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void S(C13374971588771233833 c13374971588771233833) {
        if (c13374971588771233833 != null) {
            if (c13374971588771233833 != this.c.A(c13374971588771233833.e) || (c13374971588771233833.s != null && c13374971588771233833.r != this)) {
                S10973172697741180971.l("Fragment ", c13374971588771233833, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        C13374971588771233833 c133749715887712338332 = this.w;
        this.w = c13374971588771233833;
        p(c133749715887712338332);
        p(this.w);
    }

    public final void T(C13374971588771233833 c13374971588771233833) {
        ViewGroup A = A(c13374971588771233833);
        if (A != null) {
            J6694999111306656479 j6694999111306656479 = c13374971588771233833.G;
            if ((j6694999111306656479 == null ? 0 : j6694999111306656479.e) + (j6694999111306656479 == null ? 0 : j6694999111306656479.d) + (j6694999111306656479 == null ? 0 : j6694999111306656479.c) + (j6694999111306656479 == null ? 0 : j6694999111306656479.b) > 0) {
                if (A.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    A.setTag(R.id.visible_removing_fragment_view_tag, c13374971588771233833);
                }
                C13374971588771233833 c133749715887712338332 = (C13374971588771233833) A.getTag(R.id.visible_removing_fragment_view_tag);
                J6694999111306656479 j66949991113066564792 = c13374971588771233833.G;
                boolean z = j66949991113066564792 != null ? j66949991113066564792.a : false;
                if (c133749715887712338332.G == null) {
                    return;
                }
                c133749715887712338332.d().a = z;
            }
        }
    }

    public final void U() {
        ArrayList E = this.c.E();
        int size = E.size();
        int i = 0;
        while (i < size) {
            Object obj = E.get(i);
            i++;
            B11652692535345282996 b11652692535345282996 = (B11652692535345282996) obj;
            C13374971588771233833 c13374971588771233833 = b11652692535345282996.c;
            if (c13374971588771233833.E) {
                if (this.b) {
                    this.H = true;
                } else {
                    c13374971588771233833.E = false;
                    b11652692535345282996.j();
                }
            }
        }
    }

    public final void V(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new F7208415302942170525());
        C10994625127000459680 c10994625127000459680 = this.t;
        try {
            if (c10994625127000459680 != null) {
                c10994625127000459680.u.dump("  ", null, printWriter, new String[0]);
            } else {
                u("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    public final void W() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.h.setEnabled(true);
                    return;
                }
                U14177313425639231181 u14177313425639231181 = this.h;
                ArrayList arrayList = this.d;
                u14177313425639231181.setEnabled((arrayList != null ? arrayList.size() : 0) > 0 && G(this.v));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final B11652692535345282996 a(C13374971588771233833 c13374971588771233833) {
        String str = c13374971588771233833.J;
        if (str != null) {
            X3799397131215715439.b(c13374971588771233833, str);
        }
        B11652692535345282996 e = e(c13374971588771233833);
        c13374971588771233833.r = this;
        J15730374346044043770 j15730374346044043770 = this.c;
        j15730374346044043770.N(e);
        if (!c13374971588771233833.z) {
            j15730374346044043770.j(c13374971588771233833);
            c13374971588771233833.l = false;
            c13374971588771233833.H = false;
            if (D(c13374971588771233833)) {
                this.D = true;
            }
        }
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C10994625127000459680 c10994625127000459680, C775827382551829194 c775827382551829194, C13374971588771233833 c13374971588771233833) {
        J12447903228903363333 j12447903228903363333;
        if (this.t != null) {
            S10973172697741180971.m("Already attached");
            return;
        }
        this.t = c10994625127000459680;
        this.u = c775827382551829194;
        this.v = c13374971588771233833;
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        if (c13374971588771233833 != 0) {
            copyOnWriteArrayList.add(new U8202102115736257089(c13374971588771233833));
        } else if (c10994625127000459680 != null) {
            copyOnWriteArrayList.add(c10994625127000459680);
        }
        if (this.v != null) {
            W();
        }
        if (c10994625127000459680 != null) {
            U6333859635337865127 a = c10994625127000459680.u.a();
            this.g = a;
            a.a(c13374971588771233833 != 0 ? c13374971588771233833 : c10994625127000459680, this.h);
        }
        byte b = 0;
        if (c13374971588771233833 != 0) {
            J12447903228903363333 j124479032289033633332 = c13374971588771233833.r.L;
            HashMap hashMap = j124479032289033633332.c;
            j12447903228903363333 = (J12447903228903363333) hashMap.get(c13374971588771233833.e);
            if (j12447903228903363333 == null) {
                j12447903228903363333 = new J12447903228903363333(j124479032289033633332.e);
                hashMap.put(c13374971588771233833.e, j12447903228903363333);
            }
            this.L = j12447903228903363333;
        } else if (c10994625127000459680 != null) {
            L3530692241870850490 i = c10994625127000459680.u.i();
            H6810052497267380403 h6810052497267380403 = H6810052497267380403.b;
            h6810052497267380403.getClass();
            J15730374346044043770 j15730374346044043770 = new J15730374346044043770(i, J12447903228903363333.h, h6810052497267380403);
            V6281043481934004271 a2 = J17975719213314763068.a(J12447903228903363333.class);
            String b2 = a2.b();
            if (b2 == null) {
                S10973172697741180971.j("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                j12447903228903363333 = (J12447903228903363333) j15730374346044043770.L(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
                this.L = j12447903228903363333;
            }
        } else {
            j12447903228903363333 = new J12447903228903363333(false);
            this.L = j12447903228903363333;
        }
        J12447903228903363333 j124479032289033633333 = j12447903228903363333;
        byte b3 = 1;
        j12447903228903363333.g = this.E || this.F;
        this.c.b = j124479032289033633333;
        C10994625127000459680 c109946251270004596802 = this.t;
        byte b4 = 3;
        if (c109946251270004596802 != null && c13374971588771233833 == 0) {
            V10300877997588547986 b5 = c109946251270004596802.b();
            b5.y("android:support:fragments", new N8459270538234465343(this, b4));
            Bundle g = b5.g("android:support:fragments");
            if (g != null) {
                N(g);
            }
        }
        C10994625127000459680 c109946251270004596803 = this.t;
        if (c109946251270004596803 != null) {
            J6160233934771378283 j6160233934771378283 = c109946251270004596803.u.h;
            String concat = "FragmentManager:".concat(c13374971588771233833 != 0 ? G6547577305291411977.u(new StringBuilder(), c13374971588771233833.e, ":") : "");
            this.z = j6160233934771378283.c(concat.concat("StartActivityForResult"), new N3276714816608185757((byte) 5), new H12000817172614548207(this, b3));
            this.A = j6160233934771378283.c(concat.concat("StartIntentSenderForResult"), new N3276714816608185757((byte) 6), new H12000817172614548207(this, (byte) 2));
            this.B = j6160233934771378283.c(concat.concat("RequestPermissions"), new N3276714816608185757(b4), new H12000817172614548207(this, b));
        }
        C10994625127000459680 c109946251270004596804 = this.t;
        if (c109946251270004596804 != null) {
            R13227154569034155950 r13227154569034155950 = c109946251270004596804.u;
            H14412762845723932898 h14412762845723932898 = this.n;
            h14412762845723932898.getClass();
            r13227154569034155950.i.add(h14412762845723932898);
        }
        C10994625127000459680 c109946251270004596805 = this.t;
        if (c109946251270004596805 != null) {
            R13227154569034155950 r132271545690341559502 = c109946251270004596805.u;
            H14412762845723932898 h144127628457239328982 = this.f420o;
            h144127628457239328982.getClass();
            r132271545690341559502.j.add(h144127628457239328982);
        }
        C10994625127000459680 c109946251270004596806 = this.t;
        if (c109946251270004596806 != null) {
            R13227154569034155950 r132271545690341559503 = c109946251270004596806.u;
            H14412762845723932898 h144127628457239328983 = this.p;
            h144127628457239328983.getClass();
            r132271545690341559503.l.add(h144127628457239328983);
        }
        C10994625127000459680 c109946251270004596807 = this.t;
        if (c109946251270004596807 != null) {
            R13227154569034155950 r132271545690341559504 = c109946251270004596807.u;
            H14412762845723932898 h144127628457239328984 = this.q;
            h144127628457239328984.getClass();
            r132271545690341559504.m.add(h144127628457239328984);
        }
        C10994625127000459680 c109946251270004596808 = this.t;
        if (c109946251270004596808 == null || c13374971588771233833 != 0) {
            return;
        }
        R13227154569034155950 r132271545690341559505 = c109946251270004596808.u;
        F5958934288633973125 f5958934288633973125 = this.r;
        f5958934288633973125.getClass();
        Q7316561721656982910 q7316561721656982910 = r132271545690341559505.c;
        ((CopyOnWriteArrayList) q7316561721656982910.d).add(f5958934288633973125);
        ((Runnable) q7316561721656982910.c).run();
    }

    public final void c() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet d() {
        HashSet hashSet = new HashSet();
        ArrayList E = this.c.E();
        int size = E.size();
        int i = 0;
        while (i < size) {
            Object obj = E.get(i);
            i++;
            ViewGroup viewGroup = ((B11652692535345282996) obj).c.D;
            if (viewGroup != null) {
                hashSet.add(K16824163401944882247.d(viewGroup, C()));
            }
        }
        return hashSet;
    }

    public final B11652692535345282996 e(C13374971588771233833 c13374971588771233833) {
        String str = c13374971588771233833.e;
        J15730374346044043770 j15730374346044043770 = this.c;
        B11652692535345282996 b11652692535345282996 = (B11652692535345282996) ((HashMap) j15730374346044043770.d).get(str);
        if (b11652692535345282996 != null) {
            return b11652692535345282996;
        }
        B11652692535345282996 b116526925353452829962 = new B11652692535345282996(this.l, j15730374346044043770, c13374971588771233833);
        b116526925353452829962.k(this.t.r.getClassLoader());
        b116526925353452829962.e = this.s;
        return b116526925353452829962;
    }

    public final void f(C13374971588771233833 c13374971588771233833) {
        if (c13374971588771233833.z) {
            return;
        }
        c13374971588771233833.z = true;
        if (c13374971588771233833.k) {
            J15730374346044043770 j15730374346044043770 = this.c;
            synchronized (((ArrayList) j15730374346044043770.c)) {
                ((ArrayList) j15730374346044043770.c).remove(c13374971588771233833);
            }
            c13374971588771233833.k = false;
            if (D(c13374971588771233833)) {
                this.D = true;
            }
            T(c13374971588771233833);
        }
    }

    public final void g(boolean z) {
        if (z && this.t != null) {
            V(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (C13374971588771233833 c13374971588771233833 : this.c.G()) {
            if (c13374971588771233833 != null) {
                c13374971588771233833.C = true;
                if (z) {
                    c13374971588771233833.t.g(true);
                }
            }
        }
    }

    public final boolean h() {
        if (this.s >= 1) {
            for (C13374971588771233833 c13374971588771233833 : this.c.G()) {
                if (c13374971588771233833 != null) {
                    if (!c13374971588771233833.y ? c13374971588771233833.t.h() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean i() {
        if (this.s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (C13374971588771233833 c13374971588771233833 : this.c.G()) {
            if (c13374971588771233833 != null && F(c13374971588771233833)) {
                if (!c13374971588771233833.y ? c13374971588771233833.t.i() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c13374971588771233833);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                C13374971588771233833 c133749715887712338332 = (C13374971588771233833) this.e.get(i);
                if (arrayList == null || !arrayList.contains(c133749715887712338332)) {
                    c133749715887712338332.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void j() {
        this.G = true;
        x(true);
        Iterator it = d().iterator();
        while (it.hasNext()) {
            ((K16824163401944882247) it.next()).c();
        }
        C10994625127000459680 c10994625127000459680 = this.t;
        J15730374346044043770 j15730374346044043770 = this.c;
        if (c10994625127000459680 != null ? ((J12447903228903363333) j15730374346044043770.b).f : true ^ c10994625127000459680.r.isChangingConfigurations()) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((I5194986633932264076) it2.next()).a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((J12447903228903363333) j15730374346044043770.b).e((String) obj);
                }
            }
        }
        s(-1);
        C10994625127000459680 c109946251270004596802 = this.t;
        if (c109946251270004596802 != null) {
            R13227154569034155950 r13227154569034155950 = c109946251270004596802.u;
            H14412762845723932898 h14412762845723932898 = this.f420o;
            h14412762845723932898.getClass();
            r13227154569034155950.j.remove(h14412762845723932898);
        }
        C10994625127000459680 c109946251270004596803 = this.t;
        if (c109946251270004596803 != null) {
            R13227154569034155950 r132271545690341559502 = c109946251270004596803.u;
            H14412762845723932898 h144127628457239328982 = this.n;
            h144127628457239328982.getClass();
            r132271545690341559502.i.remove(h144127628457239328982);
        }
        C10994625127000459680 c109946251270004596804 = this.t;
        if (c109946251270004596804 != null) {
            R13227154569034155950 r132271545690341559503 = c109946251270004596804.u;
            H14412762845723932898 h144127628457239328983 = this.p;
            h144127628457239328983.getClass();
            r132271545690341559503.l.remove(h144127628457239328983);
        }
        C10994625127000459680 c109946251270004596805 = this.t;
        if (c109946251270004596805 != null) {
            R13227154569034155950 r132271545690341559504 = c109946251270004596805.u;
            H14412762845723932898 h144127628457239328984 = this.q;
            h144127628457239328984.getClass();
            r132271545690341559504.m.remove(h144127628457239328984);
        }
        C10994625127000459680 c109946251270004596806 = this.t;
        if (c109946251270004596806 != null) {
            R13227154569034155950 r132271545690341559505 = c109946251270004596806.u;
            F5958934288633973125 f5958934288633973125 = this.r;
            f5958934288633973125.getClass();
            Q7316561721656982910 q7316561721656982910 = r132271545690341559505.c;
            ((CopyOnWriteArrayList) q7316561721656982910.d).remove(f5958934288633973125);
            if (((HashMap) q7316561721656982910.b).remove(f5958934288633973125) == null) {
                ((Runnable) q7316561721656982910.c).run();
            } else {
                Z3383101362411723454.s();
            }
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            this.h.remove();
            this.g = null;
        }
        G10327508498288787502 g10327508498288787502 = this.z;
        if (g10327508498288787502 != null) {
            g10327508498288787502.U();
            this.A.U();
            this.B.U();
        }
    }

    public final void k(boolean z) {
        if (z && this.t != null) {
            V(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (C13374971588771233833 c13374971588771233833 : this.c.G()) {
            if (c13374971588771233833 != null) {
                c13374971588771233833.C = true;
                if (z) {
                    c13374971588771233833.t.k(true);
                }
            }
        }
    }

    public final void l(boolean z) {
        if (z && this.t != null) {
            V(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (C13374971588771233833 c13374971588771233833 : this.c.G()) {
            if (c13374971588771233833 != null && z) {
                c13374971588771233833.t.l(true);
            }
        }
    }

    public final void m() {
        ArrayList F = this.c.F();
        int size = F.size();
        int i = 0;
        while (i < size) {
            Object obj = F.get(i);
            i++;
            C13374971588771233833 c13374971588771233833 = (C13374971588771233833) obj;
            if (c13374971588771233833 != null) {
                c13374971588771233833.n();
                c13374971588771233833.t.m();
            }
        }
    }

    public final boolean n() {
        if (this.s >= 1) {
            for (C13374971588771233833 c13374971588771233833 : this.c.G()) {
                if (c13374971588771233833 != null) {
                    if (!c13374971588771233833.y ? c13374971588771233833.t.n() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void o() {
        if (this.s < 1) {
            return;
        }
        for (C13374971588771233833 c13374971588771233833 : this.c.G()) {
            if (c13374971588771233833 != null && !c13374971588771233833.y) {
                c13374971588771233833.t.o();
            }
        }
    }

    public final void p(C13374971588771233833 c13374971588771233833) {
        if (c13374971588771233833 != null) {
            if (c13374971588771233833 != this.c.A(c13374971588771233833.e)) {
                return;
            }
            c13374971588771233833.r.getClass();
            boolean G = G(c13374971588771233833);
            Boolean bool = c13374971588771233833.j;
            if (bool == null || bool.booleanValue() != G) {
                c13374971588771233833.j = Boolean.valueOf(G);
                P14575954172000745949 p14575954172000745949 = c13374971588771233833.t;
                p14575954172000745949.W();
                p14575954172000745949.p(p14575954172000745949.w);
            }
        }
    }

    public final void q(boolean z) {
        if (z && this.t != null) {
            V(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (C13374971588771233833 c13374971588771233833 : this.c.G()) {
            if (c13374971588771233833 != null && z) {
                c13374971588771233833.t.q(true);
            }
        }
    }

    public final boolean r() {
        if (this.s < 1) {
            return false;
        }
        boolean z = false;
        for (C13374971588771233833 c13374971588771233833 : this.c.G()) {
            if (c13374971588771233833 != null && F(c13374971588771233833)) {
                if (!c13374971588771233833.y ? c13374971588771233833.t.r() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void s(int i) {
        try {
            this.b = true;
            for (B11652692535345282996 b11652692535345282996 : ((HashMap) this.c.d).values()) {
                if (b11652692535345282996 != null) {
                    b11652692535345282996.e = i;
                }
            }
            H(i, false);
            Iterator it = d().iterator();
            while (it.hasNext()) {
                ((K16824163401944882247) it.next()).c();
            }
            this.b = false;
            x(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void t() {
        if (this.H) {
            this.H = false;
            U();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C13374971588771233833 c13374971588771233833 = this.v;
        if (c13374971588771233833 != null) {
            sb.append(c13374971588771233833.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            C10994625127000459680 c10994625127000459680 = this.t;
            if (c10994625127000459680 != null) {
                sb.append(c10994625127000459680.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        int size2;
        String str3;
        String r = G6547577305291411977.r(str, "    ");
        J15730374346044043770 j15730374346044043770 = this.c;
        ArrayList arrayList = (ArrayList) j15730374346044043770.c;
        String r2 = G6547577305291411977.r(str, "    ");
        HashMap hashMap = (HashMap) j15730374346044043770.d;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (B11652692535345282996 b11652692535345282996 : hashMap.values()) {
                printWriter.print(str);
                if (b11652692535345282996 != null) {
                    C13374971588771233833 c13374971588771233833 = b11652692535345282996.c;
                    printWriter.println(c13374971588771233833);
                    printWriter.print(r2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(c13374971588771233833.v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(c13374971588771233833.w));
                    printWriter.print(" mTag=");
                    printWriter.println(c13374971588771233833.x);
                    printWriter.print(r2);
                    printWriter.print("mState=");
                    printWriter.print(c13374971588771233833.a);
                    printWriter.print(" mWho=");
                    printWriter.print(c13374971588771233833.e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(c13374971588771233833.q);
                    printWriter.print(r2);
                    printWriter.print("mAdded=");
                    printWriter.print(c13374971588771233833.k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(c13374971588771233833.l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(c13374971588771233833.m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(c13374971588771233833.n);
                    printWriter.print(r2);
                    printWriter.print("mHidden=");
                    printWriter.print(c13374971588771233833.y);
                    printWriter.print(" mDetached=");
                    printWriter.print(c13374971588771233833.z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(c13374971588771233833.B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(r2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(c13374971588771233833.A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(c13374971588771233833.F);
                    if (c13374971588771233833.r != null) {
                        printWriter.print(r2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(c13374971588771233833.r);
                    }
                    if (c13374971588771233833.s != null) {
                        printWriter.print(r2);
                        printWriter.print("mHost=");
                        printWriter.println(c13374971588771233833.s);
                    }
                    if (c13374971588771233833.u != null) {
                        printWriter.print(r2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(c13374971588771233833.u);
                    }
                    if (c13374971588771233833.f != null) {
                        printWriter.print(r2);
                        printWriter.print("mArguments=");
                        printWriter.println(c13374971588771233833.f);
                    }
                    if (c13374971588771233833.b != null) {
                        printWriter.print(r2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(c13374971588771233833.b);
                    }
                    if (c13374971588771233833.c != null) {
                        printWriter.print(r2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(c13374971588771233833.c);
                    }
                    if (c13374971588771233833.d != null) {
                        printWriter.print(r2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(c13374971588771233833.d);
                    }
                    Object obj = c13374971588771233833.g;
                    if (obj == null) {
                        P14575954172000745949 p14575954172000745949 = c13374971588771233833.r;
                        obj = (p14575954172000745949 == null || (str3 = c13374971588771233833.h) == null) ? null : p14575954172000745949.c.A(str3);
                    }
                    if (obj != null) {
                        printWriter.print(r2);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(c13374971588771233833.i);
                    }
                    printWriter.print(r2);
                    printWriter.print("mPopDirection=");
                    J6694999111306656479 j6694999111306656479 = c13374971588771233833.G;
                    printWriter.println(j6694999111306656479 == null ? false : j6694999111306656479.a);
                    J6694999111306656479 j66949991113066564792 = c13374971588771233833.G;
                    if ((j66949991113066564792 == null ? 0 : j66949991113066564792.b) != 0) {
                        printWriter.print(r2);
                        printWriter.print("getEnterAnim=");
                        J6694999111306656479 j66949991113066564793 = c13374971588771233833.G;
                        printWriter.println(j66949991113066564793 == null ? 0 : j66949991113066564793.b);
                    }
                    J6694999111306656479 j66949991113066564794 = c13374971588771233833.G;
                    if ((j66949991113066564794 == null ? 0 : j66949991113066564794.c) != 0) {
                        printWriter.print(r2);
                        printWriter.print("getExitAnim=");
                        J6694999111306656479 j66949991113066564795 = c13374971588771233833.G;
                        printWriter.println(j66949991113066564795 == null ? 0 : j66949991113066564795.c);
                    }
                    J6694999111306656479 j66949991113066564796 = c13374971588771233833.G;
                    if ((j66949991113066564796 == null ? 0 : j66949991113066564796.d) != 0) {
                        printWriter.print(r2);
                        printWriter.print("getPopEnterAnim=");
                        J6694999111306656479 j66949991113066564797 = c13374971588771233833.G;
                        printWriter.println(j66949991113066564797 == null ? 0 : j66949991113066564797.d);
                    }
                    J6694999111306656479 j66949991113066564798 = c13374971588771233833.G;
                    if ((j66949991113066564798 == null ? 0 : j66949991113066564798.e) != 0) {
                        printWriter.print(r2);
                        printWriter.print("getPopExitAnim=");
                        J6694999111306656479 j66949991113066564799 = c13374971588771233833.G;
                        printWriter.println(j66949991113066564799 == null ? 0 : j66949991113066564799.e);
                    }
                    if (c13374971588771233833.D != null) {
                        printWriter.print(r2);
                        printWriter.print("mContainer=");
                        printWriter.println(c13374971588771233833.D);
                    }
                    C10994625127000459680 c10994625127000459680 = c13374971588771233833.s;
                    if ((c10994625127000459680 == null ? null : c10994625127000459680.r) != null) {
                        L3530692241870850490 i = c13374971588771233833.i();
                        W16166718746717276323 w16166718746717276323 = R7426518007885973761.c;
                        i.getClass();
                        H6810052497267380403 h6810052497267380403 = H6810052497267380403.b;
                        h6810052497267380403.getClass();
                        J15730374346044043770 j157303743460440437702 = new J15730374346044043770(i, w16166718746717276323, h6810052497267380403);
                        V6281043481934004271 a = J17975719213314763068.a(R7426518007885973761.class);
                        String b = a.b();
                        if (b != null) {
                            E8321115364184429049 e8321115364184429049 = ((R7426518007885973761) j157303743460440437702.L(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).b;
                            if (e8321115364184429049.d() > 0) {
                                printWriter.print(r2);
                                printWriter.println("Loaders:");
                                if (e8321115364184429049.d() > 0) {
                                    if (e8321115364184429049.e(0) == null) {
                                        printWriter.print(r2);
                                        printWriter.print("  #");
                                        printWriter.print(e8321115364184429049.b(0));
                                        printWriter.print(": ");
                                        throw null;
                                    }
                                    Z3383101362411723454.s();
                                }
                            }
                        } else {
                            S10973172697741180971.j("Local and anonymous classes can not be ViewModels");
                        }
                    }
                    printWriter.print(r2);
                    printWriter.println("Child " + c13374971588771233833.t + ":");
                    c13374971588771233833.t.u(r2.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                C13374971588771233833 c133749715887712338332 = (C13374971588771233833) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c133749715887712338332.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                C13374971588771233833 c133749715887712338333 = (C13374971588771233833) this.e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c133749715887712338333.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                W10130330342449691688 w10130330342449691688 = (W10130330342449691688) this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(w10130330342449691688.toString());
                ArrayList arrayList4 = w10130330342449691688.a;
                printWriter.print(r);
                printWriter.print("mName=");
                printWriter.print(w10130330342449691688.h);
                printWriter.print(" mIndex=");
                printWriter.print(w10130330342449691688.r);
                printWriter.print(" mCommitted=");
                printWriter.println(w10130330342449691688.q);
                if (w10130330342449691688.f != 0) {
                    printWriter.print(r);
                    printWriter.print("mTransition=#");
                    printWriter.print(Integer.toHexString(w10130330342449691688.f));
                }
                if (w10130330342449691688.b != 0 || w10130330342449691688.c != 0) {
                    printWriter.print(r);
                    printWriter.print("mEnterAnim=#");
                    printWriter.print(Integer.toHexString(w10130330342449691688.b));
                    printWriter.print(" mExitAnim=#");
                    printWriter.println(Integer.toHexString(w10130330342449691688.c));
                }
                if (w10130330342449691688.d != 0 || w10130330342449691688.e != 0) {
                    printWriter.print(r);
                    printWriter.print("mPopEnterAnim=#");
                    printWriter.print(Integer.toHexString(w10130330342449691688.d));
                    printWriter.print(" mPopExitAnim=#");
                    printWriter.println(Integer.toHexString(w10130330342449691688.e));
                }
                if (w10130330342449691688.i != 0 || w10130330342449691688.j != null) {
                    printWriter.print(r);
                    printWriter.print("mBreadCrumbTitleRes=#");
                    printWriter.print(Integer.toHexString(w10130330342449691688.i));
                    printWriter.print(" mBreadCrumbTitleText=");
                    printWriter.println(w10130330342449691688.j);
                }
                if (w10130330342449691688.k != 0 || w10130330342449691688.l != null) {
                    printWriter.print(r);
                    printWriter.print("mBreadCrumbShortTitleRes=#");
                    printWriter.print(Integer.toHexString(w10130330342449691688.k));
                    printWriter.print(" mBreadCrumbShortTitleText=");
                    printWriter.println(w10130330342449691688.l);
                }
                if (!arrayList4.isEmpty()) {
                    printWriter.print(r);
                    printWriter.println("Operations:");
                    int size4 = arrayList4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        M12888013728560752810 m12888013728560752810 = (M12888013728560752810) arrayList4.get(i5);
                        switch (m12888013728560752810.a) {
                            case 0:
                                str2 = "NULL";
                                break;
                            case 1:
                                str2 = "ADD";
                                break;
                            case 2:
                                str2 = "REPLACE";
                                break;
                            case 3:
                                str2 = "REMOVE";
                                break;
                            case 4:
                                str2 = "HIDE";
                                break;
                            case 5:
                                str2 = "SHOW";
                                break;
                            case 6:
                                str2 = "DETACH";
                                break;
                            case 7:
                                str2 = "ATTACH";
                                break;
                            case 8:
                                str2 = "SET_PRIMARY_NAV";
                                break;
                            case 9:
                                str2 = "UNSET_PRIMARY_NAV";
                                break;
                            case 10:
                                str2 = "OP_SET_MAX_LIFECYCLE";
                                break;
                            default:
                                str2 = "cmd=" + m12888013728560752810.a;
                                break;
                        }
                        printWriter.print(r);
                        printWriter.print("  Op #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.print(str2);
                        printWriter.print(" ");
                        printWriter.println(m12888013728560752810.b);
                        if (m12888013728560752810.d != 0 || m12888013728560752810.e != 0) {
                            printWriter.print(r);
                            printWriter.print("enterAnim=#");
                            printWriter.print(Integer.toHexString(m12888013728560752810.d));
                            printWriter.print(" exitAnim=#");
                            printWriter.println(Integer.toHexString(m12888013728560752810.e));
                        }
                        if (m12888013728560752810.f != 0 || m12888013728560752810.g != 0) {
                            printWriter.print(r);
                            printWriter.print("popEnterAnim=#");
                            printWriter.print(Integer.toHexString(m12888013728560752810.f));
                            printWriter.print(" popExitAnim=#");
                            printWriter.println(Integer.toHexString(m12888013728560752810.g));
                        }
                    }
                }
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size5 = this.a.size();
                if (size5 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size5; i6++) {
                        Object obj2 = (P14548408347618629366) this.a.get(i6);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void v(P14548408347618629366 p14548408347618629366, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (this.G) {
                    S10973172697741180971.m("FragmentManager has been destroyed");
                    return;
                } else {
                    S10973172697741180971.m("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.E || this.F) {
                S10973172697741180971.m("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.t == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(p14548408347618629366);
                    P();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z) {
        if (this.b) {
            S10973172697741180971.m("FragmentManager is already executing transactions");
            return;
        }
        if (this.t == null) {
            if (this.G) {
                S10973172697741180971.m("FragmentManager has been destroyed");
                return;
            } else {
                S10973172697741180971.m("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.t.s.getLooper()) {
            S10973172697741180971.m("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.E || this.F)) {
            S10973172697741180971.m("Can not perform this action after onSaveInstanceState");
        } else if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean x(boolean z) {
        boolean z2;
        ArrayList arrayList;
        w(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList2 = this.I;
            ArrayList arrayList3 = this.J;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        z2 = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            z2 |= ((P14548408347618629366) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.t.s.removeCallbacks(this.M);
                    } finally {
                    }
                }
            }
            if (!z2) {
                W();
                t();
                ((HashMap) this.c.d).values().removeAll(Collections.singleton(null));
                return z3;
            }
            z3 = true;
            this.b = true;
            try {
                M(this.I, this.J);
            } finally {
                c();
            }
        }
    }

    public final void y(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        J15730374346044043770 j15730374346044043770 = this.c;
        boolean z6 = ((W10130330342449691688) arrayList.get(i)).f550o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(j15730374346044043770.G());
        C13374971588771233833 c13374971588771233833 = this.w;
        int i7 = i;
        boolean z7 = false;
        while (true) {
            int i8 = 1;
            if (i7 >= i2) {
                boolean z8 = z6;
                this.K.clear();
                if (!z8 && this.s >= 1) {
                    for (int i9 = i; i9 < i2; i9++) {
                        ArrayList arrayList4 = ((W10130330342449691688) arrayList.get(i9)).a;
                        int size = arrayList4.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList4.get(i10);
                            i10++;
                            C13374971588771233833 c133749715887712338332 = ((M12888013728560752810) obj).b;
                            if (c133749715887712338332 != null && c133749715887712338332.r != null) {
                                j15730374346044043770.N(e(c133749715887712338332));
                            }
                        }
                    }
                }
                for (int i11 = i; i11 < i2; i11++) {
                    W10130330342449691688 w10130330342449691688 = (W10130330342449691688) arrayList.get(i11);
                    if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                        w10130330342449691688.c(-1);
                        P14575954172000745949 p14575954172000745949 = w10130330342449691688.p;
                        ArrayList arrayList5 = w10130330342449691688.a;
                        boolean z9 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            M12888013728560752810 m12888013728560752810 = (M12888013728560752810) arrayList5.get(size2);
                            C13374971588771233833 c133749715887712338333 = m12888013728560752810.b;
                            if (c133749715887712338333 != null) {
                                if (c133749715887712338333.G != null) {
                                    c133749715887712338333.d().a = z9;
                                }
                                int i12 = w10130330342449691688.f;
                                char c = 8194;
                                char c2 = 4097;
                                if (i12 != 4097) {
                                    if (i12 != 8194) {
                                        c = 4100;
                                        c2 = 8197;
                                        if (i12 != 8197) {
                                            if (i12 == 4099) {
                                                c = 4099;
                                            } else if (i12 != 4100) {
                                                c = 0;
                                            }
                                        }
                                    }
                                    c = c2;
                                }
                                if (c133749715887712338333.G != null || c != 0) {
                                    c133749715887712338333.d();
                                    c133749715887712338333.G.getClass();
                                }
                                c133749715887712338333.d();
                                c133749715887712338333.G.getClass();
                            }
                            switch (m12888013728560752810.a) {
                                case 1:
                                    c133749715887712338333.A(m12888013728560752810.d, m12888013728560752810.e, m12888013728560752810.f, m12888013728560752810.g);
                                    z9 = true;
                                    p14575954172000745949.Q(c133749715887712338333, true);
                                    p14575954172000745949.L(c133749715887712338333);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + m12888013728560752810.a);
                                case 3:
                                    c133749715887712338333.A(m12888013728560752810.d, m12888013728560752810.e, m12888013728560752810.f, m12888013728560752810.g);
                                    p14575954172000745949.a(c133749715887712338333);
                                    z9 = true;
                                case 4:
                                    c133749715887712338333.A(m12888013728560752810.d, m12888013728560752810.e, m12888013728560752810.f, m12888013728560752810.g);
                                    if (c133749715887712338333.y) {
                                        c133749715887712338333.y = false;
                                        c133749715887712338333.H = !c133749715887712338333.H;
                                    }
                                    z9 = true;
                                case 5:
                                    c133749715887712338333.A(m12888013728560752810.d, m12888013728560752810.e, m12888013728560752810.f, m12888013728560752810.g);
                                    p14575954172000745949.Q(c133749715887712338333, true);
                                    if (!c133749715887712338333.y) {
                                        c133749715887712338333.y = true;
                                        c133749715887712338333.H = !c133749715887712338333.H;
                                        p14575954172000745949.T(c133749715887712338333);
                                    }
                                    z9 = true;
                                case 6:
                                    c133749715887712338333.A(m12888013728560752810.d, m12888013728560752810.e, m12888013728560752810.f, m12888013728560752810.g);
                                    if (c133749715887712338333.z) {
                                        c133749715887712338333.z = false;
                                        if (!c133749715887712338333.k) {
                                            p14575954172000745949.c.j(c133749715887712338333);
                                            if (D(c133749715887712338333)) {
                                                p14575954172000745949.D = true;
                                            }
                                        }
                                    }
                                    z9 = true;
                                case 7:
                                    c133749715887712338333.A(m12888013728560752810.d, m12888013728560752810.e, m12888013728560752810.f, m12888013728560752810.g);
                                    p14575954172000745949.Q(c133749715887712338333, true);
                                    p14575954172000745949.f(c133749715887712338333);
                                    z9 = true;
                                case 8:
                                    p14575954172000745949.S(null);
                                    z9 = true;
                                case 9:
                                    p14575954172000745949.S(c133749715887712338333);
                                    z9 = true;
                                case 10:
                                    p14575954172000745949.R(c133749715887712338333, m12888013728560752810.h);
                                    z9 = true;
                            }
                        }
                    } else {
                        w10130330342449691688.c(1);
                        P14575954172000745949 p145759541720007459492 = w10130330342449691688.p;
                        ArrayList arrayList6 = w10130330342449691688.a;
                        int size3 = arrayList6.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            M12888013728560752810 m128880137285607528102 = (M12888013728560752810) arrayList6.get(i13);
                            C13374971588771233833 c133749715887712338334 = m128880137285607528102.b;
                            if (c133749715887712338334 != null) {
                                if (c133749715887712338334.G != null) {
                                    c133749715887712338334.d().a = false;
                                }
                                int i14 = w10130330342449691688.f;
                                if (c133749715887712338334.G != null || i14 != 0) {
                                    c133749715887712338334.d();
                                    c133749715887712338334.G.getClass();
                                }
                                c133749715887712338334.d();
                                c133749715887712338334.G.getClass();
                            }
                            switch (m128880137285607528102.a) {
                                case 1:
                                    c133749715887712338334.A(m128880137285607528102.d, m128880137285607528102.e, m128880137285607528102.f, m128880137285607528102.g);
                                    p145759541720007459492.Q(c133749715887712338334, false);
                                    p145759541720007459492.a(c133749715887712338334);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + m128880137285607528102.a);
                                case 3:
                                    c133749715887712338334.A(m128880137285607528102.d, m128880137285607528102.e, m128880137285607528102.f, m128880137285607528102.g);
                                    p145759541720007459492.L(c133749715887712338334);
                                    break;
                                case 4:
                                    c133749715887712338334.A(m128880137285607528102.d, m128880137285607528102.e, m128880137285607528102.f, m128880137285607528102.g);
                                    if (c133749715887712338334.y) {
                                        break;
                                    } else {
                                        c133749715887712338334.y = true;
                                        c133749715887712338334.H = !c133749715887712338334.H;
                                        p145759541720007459492.T(c133749715887712338334);
                                        break;
                                    }
                                case 5:
                                    c133749715887712338334.A(m128880137285607528102.d, m128880137285607528102.e, m128880137285607528102.f, m128880137285607528102.g);
                                    p145759541720007459492.Q(c133749715887712338334, false);
                                    if (c133749715887712338334.y) {
                                        c133749715887712338334.y = false;
                                        c133749715887712338334.H = !c133749715887712338334.H;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 6:
                                    c133749715887712338334.A(m128880137285607528102.d, m128880137285607528102.e, m128880137285607528102.f, m128880137285607528102.g);
                                    p145759541720007459492.f(c133749715887712338334);
                                    break;
                                case 7:
                                    c133749715887712338334.A(m128880137285607528102.d, m128880137285607528102.e, m128880137285607528102.f, m128880137285607528102.g);
                                    p145759541720007459492.Q(c133749715887712338334, false);
                                    if (c133749715887712338334.z) {
                                        c133749715887712338334.z = false;
                                        if (c133749715887712338334.k) {
                                            break;
                                        } else {
                                            p145759541720007459492.c.j(c133749715887712338334);
                                            if (D(c133749715887712338334)) {
                                                p145759541720007459492.D = true;
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                case 8:
                                    p145759541720007459492.S(c133749715887712338334);
                                    break;
                                case 9:
                                    p145759541720007459492.S(null);
                                    break;
                                case 10:
                                    p145759541720007459492.R(c133749715887712338334, m128880137285607528102.i);
                                    break;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i15 = i; i15 < i2; i15++) {
                    W10130330342449691688 w101303303424496916882 = (W10130330342449691688) arrayList.get(i15);
                    if (booleanValue) {
                        for (int size4 = w101303303424496916882.a.size() - 1; size4 >= 0; size4--) {
                            C13374971588771233833 c133749715887712338335 = ((M12888013728560752810) w101303303424496916882.a.get(size4)).b;
                            if (c133749715887712338335 != null) {
                                e(c133749715887712338335).j();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = w101303303424496916882.a;
                        int size5 = arrayList7.size();
                        int i16 = 0;
                        while (i16 < size5) {
                            Object obj2 = arrayList7.get(i16);
                            i16++;
                            C13374971588771233833 c133749715887712338336 = ((M12888013728560752810) obj2).b;
                            if (c133749715887712338336 != null) {
                                e(c133749715887712338336).j();
                            }
                        }
                    }
                }
                H(this.s, true);
                HashSet hashSet = new HashSet();
                for (int i17 = i; i17 < i2; i17++) {
                    ArrayList arrayList8 = ((W10130330342449691688) arrayList.get(i17)).a;
                    int size6 = arrayList8.size();
                    int i18 = 0;
                    while (i18 < size6) {
                        Object obj3 = arrayList8.get(i18);
                        i18++;
                        C13374971588771233833 c133749715887712338337 = ((M12888013728560752810) obj3).b;
                        if (c133749715887712338337 != null && (viewGroup = c133749715887712338337.D) != null) {
                            hashSet.add(K16824163401944882247.d(viewGroup, C()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    K16824163401944882247 k16824163401944882247 = (K16824163401944882247) it.next();
                    k16824163401944882247.d = booleanValue;
                    synchronized (k16824163401944882247.b) {
                        k16824163401944882247.e();
                        k16824163401944882247.e = false;
                        int size7 = k16824163401944882247.b.size() - 1;
                        if (size7 >= 0) {
                            ((G10824784060060027788) k16824163401944882247.b.get(size7)).getClass();
                            throw null;
                        }
                    }
                    k16824163401944882247.b();
                }
                for (int i19 = i; i19 < i2; i19++) {
                    W10130330342449691688 w101303303424496916883 = (W10130330342449691688) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && w101303303424496916883.r >= 0) {
                        w101303303424496916883.r = -1;
                    }
                    w101303303424496916883.getClass();
                }
                return;
            }
            W10130330342449691688 w101303303424496916884 = (W10130330342449691688) arrayList.get(i7);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i7)).booleanValue();
            ArrayList arrayList9 = this.K;
            if (booleanValue2) {
                z = z6;
                i3 = i7;
                z2 = z7;
                int i20 = 1;
                ArrayList arrayList10 = w101303303424496916884.a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    M12888013728560752810 m128880137285607528103 = (M12888013728560752810) arrayList10.get(size8);
                    int i21 = m128880137285607528103.a;
                    if (i21 != i20) {
                        if (i21 != 3) {
                            switch (i21) {
                                case 8:
                                    c13374971588771233833 = null;
                                    break;
                                case 9:
                                    c13374971588771233833 = m128880137285607528103.b;
                                    break;
                                case 10:
                                    m128880137285607528103.i = m128880137285607528103.h;
                                    break;
                            }
                            size8--;
                            i20 = 1;
                        }
                        arrayList9.add(m128880137285607528103.b);
                        size8--;
                        i20 = 1;
                    }
                    arrayList9.remove(m128880137285607528103.b);
                    size8--;
                    i20 = 1;
                }
            } else {
                ArrayList arrayList11 = w101303303424496916884.a;
                int i22 = 0;
                while (i22 < arrayList11.size()) {
                    M12888013728560752810 m128880137285607528104 = (M12888013728560752810) arrayList11.get(i22);
                    int i23 = m128880137285607528104.a;
                    if (i23 != i8) {
                        z3 = z6;
                        if (i23 != 2) {
                            if (i23 == 3 || i23 == 6) {
                                arrayList9.remove(m128880137285607528104.b);
                                C13374971588771233833 c133749715887712338338 = m128880137285607528104.b;
                                if (c133749715887712338338 == c13374971588771233833) {
                                    arrayList11.add(i22, new M12888013728560752810(9, c133749715887712338338));
                                    i22++;
                                    i5 = i7;
                                    z4 = z7;
                                    i4 = 1;
                                    c13374971588771233833 = null;
                                }
                            } else if (i23 == 7) {
                                i4 = 1;
                            } else if (i23 == 8) {
                                arrayList11.add(i22, new M12888013728560752810(9, c13374971588771233833, 0));
                                m128880137285607528104.c = true;
                                i22++;
                                c13374971588771233833 = m128880137285607528104.b;
                            }
                            i5 = i7;
                            z4 = z7;
                            i4 = 1;
                        } else {
                            C13374971588771233833 c133749715887712338339 = m128880137285607528104.b;
                            int i24 = c133749715887712338339.w;
                            int size9 = arrayList9.size() - 1;
                            boolean z10 = false;
                            while (size9 >= 0) {
                                int i25 = size9;
                                C13374971588771233833 c1337497158877123383310 = (C13374971588771233833) arrayList9.get(size9);
                                int i26 = i7;
                                if (c1337497158877123383310.w != i24) {
                                    z5 = z7;
                                } else if (c1337497158877123383310 == c133749715887712338339) {
                                    z5 = z7;
                                    z10 = true;
                                } else {
                                    if (c1337497158877123383310 == c13374971588771233833) {
                                        z5 = z7;
                                        i6 = 0;
                                        arrayList11.add(i22, new M12888013728560752810(9, c1337497158877123383310, 0));
                                        i22++;
                                        c13374971588771233833 = null;
                                    } else {
                                        z5 = z7;
                                        i6 = 0;
                                    }
                                    M12888013728560752810 m128880137285607528105 = new M12888013728560752810(3, c1337497158877123383310, i6);
                                    m128880137285607528105.d = m128880137285607528104.d;
                                    m128880137285607528105.f = m128880137285607528104.f;
                                    m128880137285607528105.e = m128880137285607528104.e;
                                    m128880137285607528105.g = m128880137285607528104.g;
                                    arrayList11.add(i22, m128880137285607528105);
                                    arrayList9.remove(c1337497158877123383310);
                                    i22++;
                                    c13374971588771233833 = c13374971588771233833;
                                }
                                size9 = i25 - 1;
                                z7 = z5;
                                i7 = i26;
                            }
                            i5 = i7;
                            z4 = z7;
                            i4 = 1;
                            if (z10) {
                                arrayList11.remove(i22);
                                i22--;
                            } else {
                                m128880137285607528104.a = 1;
                                m128880137285607528104.c = true;
                                arrayList9.add(c133749715887712338339);
                            }
                        }
                        i22 += i4;
                        i8 = i4;
                        z6 = z3;
                        z7 = z4;
                        i7 = i5;
                    } else {
                        z3 = z6;
                        i4 = i8;
                    }
                    i5 = i7;
                    z4 = z7;
                    arrayList9.add(m128880137285607528104.b);
                    i22 += i4;
                    i8 = i4;
                    z6 = z3;
                    z7 = z4;
                    i7 = i5;
                }
                z = z6;
                i3 = i7;
                z2 = z7;
            }
            z7 = z2 || w101303303424496916884.g;
            i7 = i3 + 1;
            z6 = z;
        }
    }

    public final C13374971588771233833 z(int i) {
        J15730374346044043770 j15730374346044043770 = this.c;
        ArrayList arrayList = (ArrayList) j15730374346044043770.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C13374971588771233833 c13374971588771233833 = (C13374971588771233833) arrayList.get(size);
            if (c13374971588771233833 != null && c13374971588771233833.v == i) {
                return c13374971588771233833;
            }
        }
        for (B11652692535345282996 b11652692535345282996 : ((HashMap) j15730374346044043770.d).values()) {
            if (b11652692535345282996 != null) {
                C13374971588771233833 c133749715887712338332 = b11652692535345282996.c;
                if (c133749715887712338332.v == i) {
                    return c133749715887712338332;
                }
            }
        }
        return null;
    }
}
