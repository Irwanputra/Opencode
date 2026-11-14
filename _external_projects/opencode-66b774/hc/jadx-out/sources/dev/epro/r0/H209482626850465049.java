package dev.epro.r0;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H209482626850465049 implements Q17790836556653998983, Z3199509763485999673, T16632042582001818609 {
    public final Context a;
    public final F4784789088091152965 c;
    public boolean d;
    public final N12253737202470468561 g;
    public final F6353700998356592239 h;
    public final W1977247516027959386 i;
    public Boolean k;
    public final V14323974914327418545 l;
    public final Q13914734507241918864 m;
    public final J15730374346044043770 n;
    public final HashMap b = new HashMap();
    public final Object e = new Object();
    public final V10300877997588547986 f = new V10300877997588547986(new S11323950170556863336((byte) 4));
    public final HashMap j = new HashMap();

    static {
        B14824868959299866349.o("GreedyScheduler");
    }

    public H209482626850465049(Context context, W1977247516027959386 w1977247516027959386, I6674524549538428163 i6674524549538428163, N12253737202470468561 n12253737202470468561, F6353700998356592239 f6353700998356592239, Q13914734507241918864 q13914734507241918864) {
        this.a = context;
        F6942723054099263096 f6942723054099263096 = w1977247516027959386.e;
        this.c = new F4784789088091152965(this, f6942723054099263096, w1977247516027959386.d);
        this.n = new J15730374346044043770(f6942723054099263096, f6353700998356592239);
        this.m = q13914734507241918864;
        this.l = new V14323974914327418545(i6674524549538428163);
        this.i = w1977247516027959386;
        this.g = n12253737202470468561;
        this.h = f6353700998356592239;
    }

    @Override // dev.epro.r0.Q17790836556653998983
    public final void a(String str) {
        List<X5127101262035123109> listG;
        Runnable runnable;
        Boolean boolValueOf = this.k;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(Q15434108051134495466.a(this.a, this.i));
            this.k = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            B14824868959299866349.n().getClass();
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        B14824868959299866349.n().getClass();
        F4784789088091152965 f4784789088091152965 = this.c;
        if (f4784789088091152965 != null && (runnable = (Runnable) f4784789088091152965.c.remove(str)) != null) {
            ((Handler) f4784789088091152965.b.b).removeCallbacks(runnable);
        }
        V10300877997588547986 v10300877997588547986 = this.f;
        v10300877997588547986.getClass();
        str.getClass();
        synchronized (v10300877997588547986.c) {
            listG = ((S11323950170556863336) v10300877997588547986.b).g(str);
        }
        for (X5127101262035123109 x5127101262035123109 : listG) {
            this.n.v(x5127101262035123109);
            F6353700998356592239 f6353700998356592239 = this.h;
            f6353700998356592239.getClass();
            f6353700998356592239.g(x5127101262035123109, -512);
        }
    }

    @Override // dev.epro.r0.Q17790836556653998983
    public final void b(L16425900549479658727... l16425900549479658727Arr) {
        long jMax;
        Boolean boolValueOf = this.k;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(Q15434108051134495466.a(this.a, this.i));
            this.k = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            B14824868959299866349.n().getClass();
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        HashSet<L16425900549479658727> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (L16425900549479658727 l16425900549479658727 : l16425900549479658727Arr) {
            if (!this.f.h(Q9282725956684299602.k(l16425900549479658727))) {
                synchronized (this.e) {
                    try {
                        T4643696886244492064 t4643696886244492064K = Q9282725956684299602.k(l16425900549479658727);
                        X2921636472928927984 x2921636472928927984 = (X2921636472928927984) this.j.get(t4643696886244492064K);
                        if (x2921636472928927984 == null) {
                            int i = l16425900549479658727.k;
                            O12545633033254628644 o12545633033254628644 = this.i.d;
                            x2921636472928927984 = new X2921636472928927984(i, System.currentTimeMillis());
                            this.j.put(t4643696886244492064K, x2921636472928927984);
                        }
                        jMax = (((long) Math.max((l16425900549479658727.k - x2921636472928927984.a) - 5, 0)) * 30000) + x2921636472928927984.b;
                    } finally {
                    }
                }
                long jMax2 = Math.max(l16425900549479658727.a(), jMax);
                O12545633033254628644 o125456330332546286442 = this.i.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (l16425900549479658727.b == Y8203071358079267502.a) {
                    if (jCurrentTimeMillis < jMax2) {
                        F4784789088091152965 f4784789088091152965 = this.c;
                        if (f4784789088091152965 != null) {
                            F6942723054099263096 f6942723054099263096 = f4784789088091152965.b;
                            HashMap map = f4784789088091152965.c;
                            Runnable runnable = (Runnable) map.remove(l16425900549479658727.a);
                            if (runnable != null) {
                                ((Handler) f6942723054099263096.b).removeCallbacks(runnable);
                            }
                            I3863025946240164840 i3863025946240164840 = new I3863025946240164840((Object) f4784789088091152965, (Object) l16425900549479658727, false, (byte) 9);
                            map.put(l16425900549479658727.a, i3863025946240164840);
                            ((Handler) f6942723054099263096.b).postDelayed(i3863025946240164840, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!S10823041268949770285.t(K13184022901285147448.j, l16425900549479658727.j)) {
                        K13184022901285147448 k13184022901285147448 = l16425900549479658727.j;
                        if (k13184022901285147448.d) {
                            B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
                            l16425900549479658727.toString();
                            b14824868959299866349N.getClass();
                        } else if (k13184022901285147448.i.isEmpty()) {
                            hashSet.add(l16425900549479658727);
                            hashSet2.add(l16425900549479658727.a);
                        } else {
                            B14824868959299866349 b14824868959299866349N2 = B14824868959299866349.n();
                            l16425900549479658727.toString();
                            b14824868959299866349N2.getClass();
                        }
                    } else if (!this.f.h(Q9282725956684299602.k(l16425900549479658727))) {
                        B14824868959299866349.n().getClass();
                        V10300877997588547986 v10300877997588547986 = this.f;
                        v10300877997588547986.getClass();
                        X5127101262035123109 x5127101262035123109E = v10300877997588547986.E(Q9282725956684299602.k(l16425900549479658727));
                        this.n.Z(x5127101262035123109E);
                        F6353700998356592239 f6353700998356592239 = this.h;
                        f6353700998356592239.getClass();
                        f6353700998356592239.e(x5127101262035123109E, null);
                    }
                }
            }
        }
        synchronized (this.e) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    B14824868959299866349.n().getClass();
                    for (L16425900549479658727 l164259005494796587272 : hashSet) {
                        T4643696886244492064 t4643696886244492064K2 = Q9282725956684299602.k(l164259005494796587272);
                        if (!this.b.containsKey(t4643696886244492064K2)) {
                            this.b.put(t4643696886244492064K2, T975435490942095199.a(this.l, l164259005494796587272, this.m.b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // dev.epro.r0.Z3199509763485999673
    public final void c(L16425900549479658727 l16425900549479658727, G11493083415162978130 g11493083415162978130) {
        T4643696886244492064 t4643696886244492064K = Q9282725956684299602.k(l16425900549479658727);
        boolean z = g11493083415162978130 instanceof P3556858185158226376;
        F6353700998356592239 f6353700998356592239 = this.h;
        J15730374346044043770 j15730374346044043770 = this.n;
        V10300877997588547986 v10300877997588547986 = this.f;
        if (z) {
            if (v10300877997588547986.h(t4643696886244492064K)) {
                return;
            }
            B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
            t4643696886244492064K.toString();
            b14824868959299866349N.getClass();
            X5127101262035123109 x5127101262035123109E = v10300877997588547986.E(t4643696886244492064K);
            j15730374346044043770.Z(x5127101262035123109E);
            f6353700998356592239.getClass();
            f6353700998356592239.e(x5127101262035123109E, null);
            return;
        }
        B14824868959299866349 b14824868959299866349N2 = B14824868959299866349.n();
        t4643696886244492064K.toString();
        b14824868959299866349N2.getClass();
        X5127101262035123109 x5127101262035123109Z = v10300877997588547986.z(t4643696886244492064K);
        if (x5127101262035123109Z != null) {
            j15730374346044043770.v(x5127101262035123109Z);
            int i = ((A6522995672858297071) g11493083415162978130).a;
            f6353700998356592239.getClass();
            f6353700998356592239.g(x5127101262035123109Z, i);
        }
    }

    @Override // dev.epro.r0.T16632042582001818609
    public final void d(T4643696886244492064 t4643696886244492064, boolean z) {
        Q15035754882231748864 q15035754882231748864;
        X5127101262035123109 x5127101262035123109Z = this.f.z(t4643696886244492064);
        if (x5127101262035123109Z != null) {
            this.n.v(x5127101262035123109Z);
        }
        synchronized (this.e) {
            q15035754882231748864 = (Q15035754882231748864) this.b.remove(t4643696886244492064);
        }
        if (q15035754882231748864 != null) {
            B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
            Objects.toString(t4643696886244492064);
            b14824868959299866349N.getClass();
            q15035754882231748864.c(null);
        }
        if (z) {
            return;
        }
        synchronized (this.e) {
            this.j.remove(t4643696886244492064);
        }
    }

    @Override // dev.epro.r0.Q17790836556653998983
    public final boolean e() {
        return false;
    }
}
