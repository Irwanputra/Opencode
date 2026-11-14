package dev.epro.r0;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L841391951668269384 {
    public final S2557420383749238385 a;
    public final L11725228430494186389 b;
    public Q4132023691817090890 c;
    public Bundle d;
    public Bundle[] e;
    public final N11678082982039175888 f = new N11678082982039175888();
    public final S17255966974483065294 g;
    public final S17255966974483065294 h;
    public final S14249227312368728278 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public I4293432593871965076 n;

    /* renamed from: o, reason: collision with root package name */
    public F6942723054099263096 f353o;
    public final ArrayList p;
    public Q14196755420833223976 q;
    public final F10239625753091103224 r;
    public final G1840519957725232630 s;
    public final LinkedHashMap t;
    public F4096073349764486348 u;
    public C8860366629087389742 v;
    public final LinkedHashMap w;
    public int x;
    public final ArrayList y;
    public final B18437066071346442440 z;

    public L841391951668269384(S2557420383749238385 s2557420383749238385, L11725228430494186389 l11725228430494186389) {
        this.a = s2557420383749238385;
        this.b = l11725228430494186389;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        this.g = D15913187640519482289.r(o2161699089510411363);
        S17255966974483065294 r = D15913187640519482289.r(o2161699089510411363);
        this.h = r;
        this.i = new S14249227312368728278(r);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new ArrayList();
        this.q = Q14196755420833223976.b;
        this.r = new F10239625753091103224(this, (byte) 3);
        this.s = new G1840519957725232630();
        this.t = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = C9869900372345142877.j(1, 0, T1542296375665870064.b, 2);
    }

    public static V7801742040189616406 e(int i, V7801742040189616406 v7801742040189616406, V7801742040189616406 v78017420401896164062, boolean z) {
        if (v7801742040189616406.b.a == i && (v78017420401896164062 == null || (v7801742040189616406.equals(v78017420401896164062) && S10823041268949770285.t(v7801742040189616406.c, v78017420401896164062.c)))) {
            return v7801742040189616406;
        }
        Q4132023691817090890 q4132023691817090890 = v7801742040189616406 instanceof Q4132023691817090890 ? (Q4132023691817090890) v7801742040189616406 : null;
        if (q4132023691817090890 == null) {
            q4132023691817090890 = v7801742040189616406.c;
            q4132023691817090890.getClass();
        }
        return q4132023691817090890.f.c(i, q4132023691817090890, v78017420401896164062, z);
    }

    public static /* synthetic */ void o(L841391951668269384 l841391951668269384, R14289894334981469490 r14289894334981469490) {
        l841391951668269384.n(r14289894334981469490, false, new N11678082982039175888());
    }

    public final void a(V7801742040189616406 v7801742040189616406, Bundle bundle, R14289894334981469490 r14289894334981469490, List list) {
        Object obj;
        Object obj2;
        U9296548531947164180 u9296548531947164180 = this.a.c;
        V7801742040189616406 v78017420401896164062 = r14289894334981469490.b;
        boolean z = v78017420401896164062 instanceof W2571868844412990642;
        N11678082982039175888 n11678082982039175888 = this.f;
        if (!z) {
            while (!n11678082982039175888.isEmpty() && (((R14289894334981469490) n11678082982039175888.last()).b instanceof W2571868844412990642) && l(((R14289894334981469490) n11678082982039175888.last()).b.b.a, true, false)) {
            }
        }
        N11678082982039175888 n116780829820391758882 = new N11678082982039175888();
        Object obj3 = null;
        if (v7801742040189616406 instanceof Q4132023691817090890) {
            V7801742040189616406 v78017420401896164063 = v78017420401896164062;
            do {
                v78017420401896164063.getClass();
                v78017420401896164063 = v78017420401896164063.c;
                if (v78017420401896164063 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (S10823041268949770285.t(((R14289894334981469490) obj2).b, v78017420401896164063)) {
                                break;
                            }
                        }
                    }
                    R14289894334981469490 r142898943349814694902 = (R14289894334981469490) obj2;
                    if (r142898943349814694902 == null) {
                        r142898943349814694902 = T15504973625601650233.a(u9296548531947164180, v78017420401896164063, bundle, h(), this.f353o);
                    }
                    n116780829820391758882.addFirst(r142898943349814694902);
                    if (!n11678082982039175888.isEmpty() && ((R14289894334981469490) n11678082982039175888.last()).b == v78017420401896164063) {
                        o(this, (R14289894334981469490) n11678082982039175888.last());
                    }
                }
                if (v78017420401896164063 == null) {
                    break;
                }
            } while (v78017420401896164063 != v7801742040189616406);
        }
        V7801742040189616406 v78017420401896164064 = n116780829820391758882.isEmpty() ? v78017420401896164062 : ((R14289894334981469490) n116780829820391758882.first()).b;
        while (v78017420401896164064 != null && d(v78017420401896164064.b.a, v78017420401896164064) != v78017420401896164064) {
            v78017420401896164064 = v78017420401896164064.c;
            if (v78017420401896164064 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (S10823041268949770285.t(((R14289894334981469490) obj).b, v78017420401896164064)) {
                            break;
                        }
                    }
                }
                R14289894334981469490 r142898943349814694903 = (R14289894334981469490) obj;
                if (r142898943349814694903 == null) {
                    r142898943349814694903 = T15504973625601650233.a(u9296548531947164180, v78017420401896164064, v78017420401896164064.a(bundle2), h(), this.f353o);
                }
                n116780829820391758882.addFirst(r142898943349814694903);
            }
        }
        if (!n116780829820391758882.isEmpty()) {
            v78017420401896164062 = ((R14289894334981469490) n116780829820391758882.first()).b;
        }
        while (!n11678082982039175888.isEmpty() && (((R14289894334981469490) n11678082982039175888.last()).b instanceof Q4132023691817090890)) {
            V7801742040189616406 v78017420401896164065 = ((R14289894334981469490) n11678082982039175888.last()).b;
            v78017420401896164065.getClass();
            if (V1475975160983963926.p((E8321115364184429049) ((Q4132023691817090890) v78017420401896164065).f.e, v78017420401896164062.b.a) != null) {
                break;
            } else {
                o(this, (R14289894334981469490) n11678082982039175888.last());
            }
        }
        R14289894334981469490 r142898943349814694904 = (R14289894334981469490) n11678082982039175888.j();
        if (r142898943349814694904 == null) {
            r142898943349814694904 = (R14289894334981469490) n116780829820391758882.j();
        }
        if (!S10823041268949770285.t(r142898943349814694904 != null ? r142898943349814694904.b : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                V7801742040189616406 v78017420401896164066 = ((R14289894334981469490) previous).b;
                Q4132023691817090890 q4132023691817090890 = this.c;
                q4132023691817090890.getClass();
                if (S10823041268949770285.t(v78017420401896164066, q4132023691817090890)) {
                    obj3 = previous;
                    break;
                }
            }
            R14289894334981469490 r142898943349814694905 = (R14289894334981469490) obj3;
            if (r142898943349814694905 == null) {
                Q4132023691817090890 q41320236918170908902 = this.c;
                q41320236918170908902.getClass();
                Q4132023691817090890 q41320236918170908903 = this.c;
                q41320236918170908903.getClass();
                r142898943349814694905 = T15504973625601650233.a(u9296548531947164180, q41320236918170908902, q41320236918170908903.a(bundle), h(), this.f353o);
            }
            n116780829820391758882.addFirst(r142898943349814694905);
        }
        Iterator it = n116780829820391758882.iterator();
        while (it.hasNext()) {
            R14289894334981469490 r142898943349814694906 = (R14289894334981469490) it.next();
            Object obj4 = this.t.get(this.s.b(r142898943349814694906.b.a));
            if (obj4 == null) {
                Z3383101362411723454.j(G6547577305291411977.s("NavigatorBackStack for ", v7801742040189616406.a, " should already be created"));
                return;
            }
            ((F3726638300337006374) obj4).a(r142898943349814694906);
        }
        n11678082982039175888.addAll(n116780829820391758882);
        n11678082982039175888.addLast(r14289894334981469490);
        ArrayList P0 = R9411874267597469228.P0(n116780829820391758882, r14289894334981469490);
        int size = P0.size();
        int i = 0;
        while (i < size) {
            Object obj5 = P0.get(i);
            i++;
            R14289894334981469490 r142898943349814694907 = (R14289894334981469490) obj5;
            Q4132023691817090890 q41320236918170908904 = r142898943349814694907.b.c;
            if (q41320236918170908904 != null) {
                j(r142898943349814694907, f(q41320236918170908904.b.a));
            }
        }
    }

    public final boolean b() {
        N11678082982039175888 n11678082982039175888;
        while (true) {
            n11678082982039175888 = this.f;
            if (n11678082982039175888.isEmpty() || !(((R14289894334981469490) n11678082982039175888.last()).b instanceof Q4132023691817090890)) {
                break;
            }
            o(this, (R14289894334981469490) n11678082982039175888.last());
        }
        R14289894334981469490 r14289894334981469490 = (R14289894334981469490) n11678082982039175888.l();
        ArrayList arrayList = this.y;
        if (r14289894334981469490 != null) {
            arrayList.add(r14289894334981469490);
        }
        this.x++;
        s();
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList e1 = R9411874267597469228.e1(arrayList);
            arrayList.clear();
            int size = e1.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = e1.get(i2);
                i2++;
                R14289894334981469490 r142898943349814694902 = (R14289894334981469490) obj;
                Iterator it = R9411874267597469228.d1(this.p).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        Z3383101362411723454.s();
                        return false;
                    }
                    V7801742040189616406 v7801742040189616406 = r142898943349814694902.b;
                    r142898943349814694902.c();
                    throw null;
                }
                this.z.h(r142898943349814694902);
            }
            ArrayList arrayList2 = new ArrayList(n11678082982039175888);
            S17255966974483065294 s17255966974483065294 = this.g;
            s17255966974483065294.getClass();
            s17255966974483065294.k(null, arrayList2);
            ArrayList p = p();
            S17255966974483065294 s172559669744830652942 = this.h;
            s172559669744830652942.getClass();
            s172559669744830652942.k(null, p);
        }
        return r14289894334981469490 != null;
    }

    public final boolean c(ArrayList arrayList, V7801742040189616406 v7801742040189616406, boolean z, boolean z2) {
        boolean z3;
        M4043793213707479819 m4043793213707479819 = new M4043793213707479819();
        N11678082982039175888 n11678082982039175888 = new N11678082982039175888();
        int size = arrayList.size();
        final byte b = 0;
        int i = 0;
        while (true) {
            if (i >= size) {
                z3 = z2;
                break;
            }
            int i2 = i + 1;
            E4135271276212975889 e4135271276212975889 = (E4135271276212975889) arrayList.get(i);
            M4043793213707479819 m40437932137074798192 = new M4043793213707479819();
            R14289894334981469490 r14289894334981469490 = (R14289894334981469490) this.f.last();
            z3 = z2;
            C8860366629087389742 c8860366629087389742 = new C8860366629087389742(m40437932137074798192, m4043793213707479819, this, z3, n11678082982039175888);
            e4135271276212975889.getClass();
            r14289894334981469490.getClass();
            this.v = c8860366629087389742;
            e4135271276212975889.e(r14289894334981469490, z3);
            this.v = null;
            if (!m40437932137074798192.a) {
                break;
            }
            i = i2;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.l;
            if (!z) {
                M7968841747429118896 m7968841747429118896 = new M7968841747429118896(new B2664082256516729321((Object) T2881242016550624223.D(v7801742040189616406, new P16607035664026122700((byte) 22)), new F4096073349764486348(this) { // from class: dev.epro.r0.Z17593369026147393192
                    public final /* synthetic */ L841391951668269384 b;

                    {
                        this.b = this;
                    }

                    @Override // dev.epro.r0.F4096073349764486348
                    public final Object invoke(Object obj) {
                        boolean containsKey;
                        byte b2 = b;
                        L841391951668269384 l841391951668269384 = this.b;
                        V7801742040189616406 v78017420401896164062 = (V7801742040189616406) obj;
                        switch (b2) {
                            case 0:
                                v78017420401896164062.getClass();
                                containsKey = l841391951668269384.l.containsKey(Integer.valueOf(v78017420401896164062.b.a));
                                break;
                            default:
                                v78017420401896164062.getClass();
                                containsKey = l841391951668269384.l.containsKey(Integer.valueOf(v78017420401896164062.b.a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, (byte) 2));
                while (m7968841747429118896.hasNext()) {
                    Integer valueOf = Integer.valueOf(((V7801742040189616406) m7968841747429118896.next()).b.a);
                    V3031544225702822361 v3031544225702822361 = (V3031544225702822361) n11678082982039175888.j();
                    linkedHashMap.put(valueOf, v3031544225702822361 != null ? (String) v3031544225702822361.a.b : null);
                }
            }
            if (!n11678082982039175888.isEmpty()) {
                O3228356295430981133 o3228356295430981133 = ((V3031544225702822361) n11678082982039175888.first()).a;
                String str = (String) o3228356295430981133.b;
                final byte b2 = 1;
                M7968841747429118896 m79688417474291188962 = new M7968841747429118896(new B2664082256516729321((Object) T2881242016550624223.D(d(o3228356295430981133.a, null), new P16607035664026122700((byte) 23)), new F4096073349764486348(this) { // from class: dev.epro.r0.Z17593369026147393192
                    public final /* synthetic */ L841391951668269384 b;

                    {
                        this.b = this;
                    }

                    @Override // dev.epro.r0.F4096073349764486348
                    public final Object invoke(Object obj) {
                        boolean containsKey;
                        byte b22 = b2;
                        L841391951668269384 l841391951668269384 = this.b;
                        V7801742040189616406 v78017420401896164062 = (V7801742040189616406) obj;
                        switch (b22) {
                            case 0:
                                v78017420401896164062.getClass();
                                containsKey = l841391951668269384.l.containsKey(Integer.valueOf(v78017420401896164062.b.a));
                                break;
                            default:
                                v78017420401896164062.getClass();
                                containsKey = l841391951668269384.l.containsKey(Integer.valueOf(v78017420401896164062.b.a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, (byte) 2));
                while (m79688417474291188962.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((V7801742040189616406) m79688417474291188962.next()).b.a), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.m.put(str, n11678082982039175888);
                }
            }
        }
        this.b.invoke();
        return m4043793213707479819.a;
    }

    public final V7801742040189616406 d(int i, V7801742040189616406 v7801742040189616406) {
        V7801742040189616406 v78017420401896164062;
        Q4132023691817090890 q4132023691817090890 = this.c;
        if (q4132023691817090890 == null) {
            return null;
        }
        if (q4132023691817090890.b.a == i) {
            if (v7801742040189616406 == null) {
                return q4132023691817090890;
            }
            if (S10823041268949770285.t(q4132023691817090890, v7801742040189616406) && v7801742040189616406.c == null) {
                return this.c;
            }
        }
        R14289894334981469490 r14289894334981469490 = (R14289894334981469490) this.f.l();
        if (r14289894334981469490 == null || (v78017420401896164062 = r14289894334981469490.b) == null) {
            v78017420401896164062 = this.c;
            v78017420401896164062.getClass();
        }
        return e(i, v78017420401896164062, v7801742040189616406, false);
    }

    public final R14289894334981469490 f(int i) {
        Object obj;
        N11678082982039175888 n11678082982039175888 = this.f;
        ListIterator<E> listIterator = n11678082982039175888.listIterator(n11678082982039175888.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((R14289894334981469490) obj).b.b.a == i) {
                break;
            }
        }
        R14289894334981469490 r14289894334981469490 = (R14289894334981469490) obj;
        if (r14289894334981469490 != null) {
            return r14289894334981469490;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + g()).toString());
    }

    public final V7801742040189616406 g() {
        R14289894334981469490 r14289894334981469490 = (R14289894334981469490) this.f.l();
        if (r14289894334981469490 != null) {
            return r14289894334981469490.b;
        }
        return null;
    }

    public final Q14196755420833223976 h() {
        return this.n == null ? Q14196755420833223976.c : this.q;
    }

    public final Q4132023691817090890 i() {
        V7801742040189616406 v7801742040189616406;
        R14289894334981469490 r14289894334981469490 = (R14289894334981469490) this.f.l();
        if (r14289894334981469490 == null || (v7801742040189616406 = r14289894334981469490.b) == null) {
            v7801742040189616406 = this.c;
            v7801742040189616406.getClass();
        }
        Q4132023691817090890 q4132023691817090890 = v7801742040189616406 instanceof Q4132023691817090890 ? (Q4132023691817090890) v7801742040189616406 : null;
        if (q4132023691817090890 != null) {
            return q4132023691817090890;
        }
        Q4132023691817090890 q41320236918170908902 = v7801742040189616406.c;
        q41320236918170908902.getClass();
        return q41320236918170908902;
    }

    public final void j(R14289894334981469490 r14289894334981469490, R14289894334981469490 r142898943349814694902) {
        this.j.put(r14289894334981469490, r142898943349814694902);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(r142898943349814694902) == null) {
            linkedHashMap.put(r142898943349814694902, new Z2984444388611422454());
        }
        Object obj = linkedHashMap.get(r142898943349814694902);
        obj.getClass();
        ((Z2984444388611422454) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0203, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0118, code lost:
    
        if (r24.b.a == r10.b.a) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
    
        if (r13.equals(r10) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        r10 = new dev.epro.r0.N11678082982039175888();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0125, code lost:
    
        if (dev.epro.r0.K5751602218013079365.N(r23.f) < r11) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        r12 = (dev.epro.r0.R14289894334981469490) dev.epro.r0.P17571903987102865660.r0(r23.f);
        r(r12);
        r15 = new dev.epro.r0.R14289894334981469490(r12.a, r12.b, r12.b.a(r25), r12.d, r12.e, r12.f, r12.g);
        r4 = r12.d;
        r4.getClass();
        r15.d = r4;
        r4 = r12.m;
        r4.getClass();
        r15.m = r4;
        r15.d();
        r10.addFirst(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016e, code lost:
    
        r4 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0176, code lost:
    
        if (r4.hasNext() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0178, code lost:
    
        r5 = (dev.epro.r0.R14289894334981469490) r4.next();
        r6 = r5.b.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0182, code lost:
    
        if (r6 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0184, code lost:
    
        j(r5, f(r6.b.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018f, code lost:
    
        r23.f.addLast(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0195, code lost:
    
        r4 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019d, code lost:
    
        if (r4.hasNext() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        r5 = (dev.epro.r0.R14289894334981469490) r4.next();
        r6 = r23.s.b(r5.b.a);
        r9 = r5.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b1, code lost:
    
        if (r9 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b4, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b5, code lost:
    
        if (r9 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b8, code lost:
    
        r6.c(r9);
        r6 = r6.b();
        r9 = r6.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c1, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c2, code lost:
    
        r10 = dev.epro.r0.R9411874267597469228.e1((java.util.Collection) r6.e.a.getValue());
        r11 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01dc, code lost:
    
        if (r11.hasPrevious() == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (((dev.epro.r0.R14289894334981469490) r11.previous()).f.equals(r5.f) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ee, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f6, code lost:
    
        r10.set(r11, r5);
        r6.b.k(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ff, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f5, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0202, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0246 A[LOOP:1: B:19:0x0240->B:21:0x0246, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(dev.epro.r0.V7801742040189616406 r24, android.os.Bundle r25, dev.epro.r0.X4698849316906551159 r26) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L841391951668269384.k(dev.epro.r0.V7801742040189616406, android.os.Bundle, dev.epro.r0.X4698849316906551159):void");
    }

    public final boolean l(int i, boolean z, boolean z2) {
        V7801742040189616406 v7801742040189616406;
        N11678082982039175888 n11678082982039175888 = this.f;
        if (n11678082982039175888.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = R9411874267597469228.R0(n11678082982039175888).iterator();
        while (true) {
            if (!it.hasNext()) {
                v7801742040189616406 = null;
                break;
            }
            v7801742040189616406 = ((R14289894334981469490) it.next()).b;
            String str = v7801742040189616406.a;
            G6575252167976303972 g6575252167976303972 = v7801742040189616406.b;
            E4135271276212975889 b = this.s.b(str);
            if (z || g6575252167976303972.a != i) {
                arrayList.add(b);
            }
            if (g6575252167976303972.a == i) {
                break;
            }
        }
        if (v7801742040189616406 != null) {
            return c(arrayList, v7801742040189616406, z, z2);
        }
        int i2 = V7801742040189616406.e;
        Y582199805280922215.y(this.a.c, i);
        return false;
    }

    public final boolean m(String str, boolean z, boolean z2) {
        Object obj;
        str.getClass();
        N11678082982039175888 n11678082982039175888 = this.f;
        if (n11678082982039175888.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = n11678082982039175888.listIterator(n11678082982039175888.a());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            R14289894334981469490 r14289894334981469490 = (R14289894334981469490) obj;
            boolean c = r14289894334981469490.b.c(str, r14289894334981469490.c());
            if (z || !c) {
                arrayList.add(this.s.b(r14289894334981469490.b.a));
            }
            if (c) {
                break;
            }
        }
        R14289894334981469490 r142898943349814694902 = (R14289894334981469490) obj;
        V7801742040189616406 v7801742040189616406 = r142898943349814694902 != null ? r142898943349814694902.b : null;
        if (v7801742040189616406 == null) {
            return false;
        }
        return c(arrayList, v7801742040189616406, z, z2);
    }

    public final void n(R14289894334981469490 r14289894334981469490, boolean z, N11678082982039175888 n11678082982039175888) {
        F6942723054099263096 f6942723054099263096;
        Set set;
        r14289894334981469490.getClass();
        N11678082982039175888 n116780829820391758882 = this.f;
        R14289894334981469490 r142898943349814694902 = (R14289894334981469490) n116780829820391758882.last();
        if (!S10823041268949770285.t(r142898943349814694902, r14289894334981469490)) {
            D11988991656201568495.o("Attempted to pop ", r14289894334981469490.b, ", which is not the top of the back stack (", r142898943349814694902.b, ")");
            return;
        }
        P17571903987102865660.r0(n116780829820391758882);
        F3726638300337006374 f3726638300337006374 = (F3726638300337006374) this.t.get(this.s.b(r142898943349814694902.b.a));
        boolean z2 = true;
        if ((f3726638300337006374 == null || (set = (Set) f3726638300337006374.f.a.getValue()) == null || !set.contains(r142898943349814694902)) && !this.k.containsKey(r142898943349814694902)) {
            z2 = false;
        }
        Q14196755420833223976 q14196755420833223976 = r142898943349814694902.k.h;
        Q14196755420833223976 q141967554208332239762 = Q14196755420833223976.c;
        if (q14196755420833223976.compareTo(q141967554208332239762) >= 0) {
            if (z) {
                r142898943349814694902.m = q141967554208332239762;
                r142898943349814694902.d();
                n11678082982039175888.addFirst(new V3031544225702822361(r142898943349814694902));
            }
            if (z2) {
                r142898943349814694902.m = q141967554208332239762;
                r142898943349814694902.d();
            } else {
                r142898943349814694902.m = Q14196755420833223976.a;
                r142898943349814694902.d();
                r(r142898943349814694902);
            }
        }
        if (z || z2 || (f6942723054099263096 = this.f353o) == null) {
            return;
        }
        f6942723054099263096.d(r142898943349814694902.f);
    }

    public final ArrayList p() {
        Q14196755420833223976 q14196755420833223976;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.t.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            q14196755420833223976 = Q14196755420833223976.d;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((F3726638300337006374) it.next()).f.a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                R14289894334981469490 r14289894334981469490 = (R14289894334981469490) obj;
                if (!arrayList.contains(r14289894334981469490) && r14289894334981469490.m.compareTo(q14196755420833223976) < 0) {
                    arrayList2.add(obj);
                }
            }
            P17571903987102865660.n0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            R14289894334981469490 r142898943349814694902 = (R14289894334981469490) next;
            if (!arrayList.contains(r142898943349814694902) && r142898943349814694902.m.compareTo(q14196755420833223976) >= 0) {
                arrayList3.add(next);
            }
        }
        P17571903987102865660.n0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((R14289894334981469490) obj2).b instanceof Q4132023691817090890)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i, Bundle bundle, X4698849316906551159 x4698849316906551159) {
        V7801742040189616406 v7801742040189616406;
        R14289894334981469490 r14289894334981469490;
        V7801742040189616406 v78017420401896164062;
        Bundle bundle2;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.l;
        int i2 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (S10823041268949770285.t((String) it.next(), str)) {
                it.remove();
            }
        }
        N11678082982039175888 n11678082982039175888 = (N11678082982039175888) V12319504402545346730.r(this.m).remove(str);
        U9296548531947164180 u9296548531947164180 = this.a.c;
        ArrayList arrayList = new ArrayList();
        R14289894334981469490 r142898943349814694902 = (R14289894334981469490) this.f.l();
        if ((r142898943349814694902 == null || (v7801742040189616406 = r142898943349814694902.b) == null) && (v7801742040189616406 = this.c) == null) {
            S10973172697741180971.m("You must call setGraph() before calling getGraph()");
            return false;
        }
        if (n11678082982039175888 != null) {
            Iterator it2 = n11678082982039175888.iterator();
            while (it2.hasNext()) {
                V3031544225702822361 v3031544225702822361 = (V3031544225702822361) it2.next();
                O3228356295430981133 o3228356295430981133 = v3031544225702822361.a;
                O3228356295430981133 o32283562954309811332 = v3031544225702822361.a;
                V7801742040189616406 e = e(o3228356295430981133.a, v7801742040189616406, null, true);
                if (e == null) {
                    int i3 = V7801742040189616406.e;
                    D11988991656201568495.s("Restore State failed: destination ", Y582199805280922215.y(u9296548531947164180, o32283562954309811332.a), " cannot be found from the current destination ", v7801742040189616406);
                    return false;
                }
                Q14196755420833223976 h = h();
                F6942723054099263096 f6942723054099263096 = this.f353o;
                u9296548531947164180.getClass();
                h.getClass();
                Bundle bundle3 = (Bundle) o32283562954309811332.c;
                if (bundle3 != null) {
                    Context context = u9296548531947164180.a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(new R14289894334981469490(u9296548531947164180, e, bundle2, h, f6942723054099263096, (String) o32283562954309811332.b, (Bundle) o32283562954309811332.d));
                v7801742040189616406 = e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((R14289894334981469490) obj).b instanceof Q4132023691817090890)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            R14289894334981469490 r142898943349814694903 = (R14289894334981469490) obj2;
            List list = (List) R9411874267597469228.L0(arrayList2);
            if (S10823041268949770285.t((list == null || (r14289894334981469490 = (R14289894334981469490) R9411874267597469228.K0(list)) == null || (v78017420401896164062 = r14289894334981469490.b) == null) ? null : v78017420401896164062.a, r142898943349814694903.b.a)) {
                list.add(r142898943349814694903);
            } else {
                arrayList2.add(K5751602218013079365.X(r142898943349814694903));
            }
        }
        M4043793213707479819 m4043793213707479819 = new M4043793213707479819();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            E4135271276212975889 b = this.s.b(((R14289894334981469490) R9411874267597469228.B0(list2)).b.a);
            ArrayList arrayList4 = arrayList;
            this.u = new O15179950344889198026((Object) m4043793213707479819, (Object) arrayList4, (Object) new A8284336046188466534(), (Object) this, (Object) bundle, (byte) 7);
            b.d(list2, x4698849316906551159);
            this.u = null;
            arrayList = arrayList4;
        }
        return m4043793213707479819.a;
    }

    public final void r(R14289894334981469490 r14289894334981469490) {
        r14289894334981469490.getClass();
        R14289894334981469490 r142898943349814694902 = (R14289894334981469490) this.j.remove(r14289894334981469490);
        if (r142898943349814694902 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.k;
        Z2984444388611422454 z2984444388611422454 = (Z2984444388611422454) linkedHashMap.get(r142898943349814694902);
        Integer valueOf = z2984444388611422454 != null ? Integer.valueOf(z2984444388611422454.a.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            F3726638300337006374 f3726638300337006374 = (F3726638300337006374) this.t.get(this.s.b(r142898943349814694902.b.a));
            if (f3726638300337006374 != null) {
                f3726638300337006374.c(r142898943349814694902);
            }
            linkedHashMap.remove(r142898943349814694902);
        }
    }

    public final void s() {
        Z2984444388611422454 z2984444388611422454;
        Set set;
        ArrayList e1 = R9411874267597469228.e1(this.f);
        if (e1.isEmpty()) {
            return;
        }
        ArrayList X = K5751602218013079365.X(((R14289894334981469490) R9411874267597469228.K0(e1)).b);
        ArrayList arrayList = new ArrayList();
        if (R9411874267597469228.K0(X) instanceof W2571868844412990642) {
            Iterator it = R9411874267597469228.R0(e1).iterator();
            while (it.hasNext()) {
                V7801742040189616406 v7801742040189616406 = ((R14289894334981469490) it.next()).b;
                arrayList.add(v7801742040189616406);
                if (!(v7801742040189616406 instanceof W2571868844412990642) && !(v7801742040189616406 instanceof Q4132023691817090890)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (R14289894334981469490 r14289894334981469490 : R9411874267597469228.R0(e1)) {
            Q14196755420833223976 q14196755420833223976 = r14289894334981469490.m;
            V7801742040189616406 v78017420401896164062 = r14289894334981469490.b;
            V7801742040189616406 v78017420401896164063 = (V7801742040189616406) R9411874267597469228.D0(X);
            Q14196755420833223976 q141967554208332239762 = Q14196755420833223976.e;
            Q14196755420833223976 q141967554208332239763 = Q14196755420833223976.d;
            if (v78017420401896164063 != null && v78017420401896164063.b.a == v78017420401896164062.b.a) {
                if (q14196755420833223976 != q141967554208332239762) {
                    F3726638300337006374 f3726638300337006374 = (F3726638300337006374) this.t.get(this.s.b(r14289894334981469490.b.a));
                    if (S10823041268949770285.t((f3726638300337006374 == null || (set = (Set) f3726638300337006374.f.a.getValue()) == null) ? null : Boolean.valueOf(set.contains(r14289894334981469490)), Boolean.TRUE) || ((z2984444388611422454 = (Z2984444388611422454) this.k.get(r14289894334981469490)) != null && z2984444388611422454.a.get() == 0)) {
                        hashMap.put(r14289894334981469490, q141967554208332239763);
                    } else {
                        hashMap.put(r14289894334981469490, q141967554208332239762);
                    }
                }
                V7801742040189616406 v78017420401896164064 = (V7801742040189616406) R9411874267597469228.D0(arrayList);
                if (v78017420401896164064 != null && v78017420401896164064.b.a == v78017420401896164062.b.a) {
                    P17571903987102865660.q0(arrayList);
                }
                P17571903987102865660.q0(X);
                Q4132023691817090890 q4132023691817090890 = v78017420401896164062.c;
                if (q4132023691817090890 != null) {
                    X.add(q4132023691817090890);
                }
            } else if (arrayList.isEmpty() || v78017420401896164062.b.a != ((V7801742040189616406) R9411874267597469228.B0(arrayList)).b.a) {
                r14289894334981469490.m = Q14196755420833223976.c;
                r14289894334981469490.d();
            } else {
                V7801742040189616406 v78017420401896164065 = (V7801742040189616406) P17571903987102865660.q0(arrayList);
                if (q14196755420833223976 == q141967554208332239762) {
                    r14289894334981469490.m = q141967554208332239763;
                    r14289894334981469490.d();
                } else if (q14196755420833223976 != q141967554208332239763) {
                    hashMap.put(r14289894334981469490, q141967554208332239763);
                }
                Q4132023691817090890 q41320236918170908902 = v78017420401896164065.c;
                if (q41320236918170908902 != null && !arrayList.contains(q41320236918170908902)) {
                    arrayList.add(q41320236918170908902);
                }
            }
        }
        int size = e1.size();
        int i = 0;
        while (i < size) {
            Object obj = e1.get(i);
            i++;
            R14289894334981469490 r142898943349814694902 = (R14289894334981469490) obj;
            Q14196755420833223976 q141967554208332239764 = (Q14196755420833223976) hashMap.get(r142898943349814694902);
            if (q141967554208332239764 != null) {
                r142898943349814694902.getClass();
                r142898943349814694902.m = q141967554208332239764;
                r142898943349814694902.d();
            } else {
                r142898943349814694902.d();
            }
        }
    }
}
