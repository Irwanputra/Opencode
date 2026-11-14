package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M11181104712105445833 implements CharSequence {
    public static final V10300877997588547986 e = E4238800991532993157.a;
    public final List a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    public M11181104712105445833(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                F14378331124810887321 f14378331124810887321 = (F14378331124810887321) list.get(i);
                Object obj = f14378331124810887321.a;
                if (obj instanceof W1742516786250891319) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(f14378331124810887321);
                } else if (obj instanceof G9912494130141020078) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(f14378331124810887321);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List listW0 = arrayList2 != null ? R9411874267597469228.W0(arrayList2, new J10770752472956524045((byte) 6)) : null;
        if (listW0 == null || listW0.isEmpty()) {
            return;
        }
        int i2 = ((F14378331124810887321) R9411874267597469228.B0(listW0)).c;
        G1892398518770611911 g1892398518770611911 = R1911624190916196378.a;
        G1892398518770611911 g18923985187706119112 = new G1892398518770611911(1);
        g18923985187706119112.a(i2);
        int size2 = listW0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            F14378331124810887321 f143783311248108873212 = (F14378331124810887321) listW0.get(i3);
            while (true) {
                if (g18923985187706119112.b == 0) {
                    break;
                }
                int iD = g18923985187706119112.d();
                if (f143783311248108873212.b >= iD) {
                    g18923985187706119112.e(g18923985187706119112.b - 1);
                } else {
                    int i4 = f143783311248108873212.c;
                    if (i4 > iD) {
                        T12055643479535528558.a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iD);
                    }
                }
            }
            g18923985187706119112.a(f143783311248108873212.c);
        }
    }

    public final List a(int i) {
        List list = this.a;
        if (list == null) {
            return O2161699089510411363.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            F14378331124810887321 f14378331124810887321 = (F14378331124810887321) obj;
            if ((f14378331124810887321.a instanceof J11984637636147625377) && Z15472362586437216226.b(0, i, f14378331124810887321.b, f14378331124810887321.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final M11181104712105445833 b(F4096073349764486348 f4096073349764486348) {
        R2889690641793769398 r2889690641793769398 = new R2889690641793769398(this);
        ArrayList arrayList = r2889690641793769398.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            F14378331124810887321 f14378331124810887321 = (F14378331124810887321) f4096073349764486348.invoke(((P2629705021614852310) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new P2629705021614852310(f14378331124810887321.a, f14378331124810887321.b, f14378331124810887321.c, f14378331124810887321.d));
        }
        return r2889690641793769398.i();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final M11181104712105445833 subSequence(int i, int i2) {
        if (i > i2) {
            T12055643479535528558.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        M11181104712105445833 m11181104712105445833 = Z15472362586437216226.a;
        if (i > i2) {
            T12055643479535528558.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.a;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                F14378331124810887321 f14378331124810887321 = (F14378331124810887321) list.get(i3);
                int i4 = f14378331124810887321.b;
                int i5 = f14378331124810887321.c;
                if (Z15472362586437216226.b(i, i2, i4, i5)) {
                    arrayList2.add(new F14378331124810887321(f14378331124810887321.a, Math.max(i, f14378331124810887321.b) - i, Math.min(i2, i5) - i, f14378331124810887321.d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new M11181104712105445833(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M11181104712105445833)) {
            return false;
        }
        M11181104712105445833 m11181104712105445833 = (M11181104712105445833) obj;
        return S10823041268949770285.t(this.b, m11181104712105445833.b) && S10823041268949770285.t(this.a, m11181104712105445833.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public /* synthetic */ M11181104712105445833(String str) {
        this(str, O2161699089510411363.a);
    }

    public M11181104712105445833(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
