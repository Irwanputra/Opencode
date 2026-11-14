package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Z15472362586437216226 {
    public static final M11181104712105445833 a = new M11181104712105445833("");

    public static final List a(M11181104712105445833 m11181104712105445833, int i, int i2, M14716691558468128220 m14716691558468128220) {
        List list;
        if (i == i2 || (list = m11181104712105445833.a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= m11181104712105445833.b.length()) {
            if (m14716691558468128220 == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) m14716691558468128220.invoke(((F14378331124810887321) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            F14378331124810887321 f14378331124810887321 = (F14378331124810887321) list.get(i3);
            if (m14716691558468128220 != null ? ((Boolean) m14716691558468128220.invoke(f14378331124810887321.a)).booleanValue() : true) {
                int i4 = f14378331124810887321.b;
                int i5 = f14378331124810887321.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new F14378331124810887321((H1203938712873468075) f14378331124810887321.a, W7808703833045379622.q(f14378331124810887321.b, i, i2) - i, W7808703833045379622.q(i5, i, i2) - i, f14378331124810887321.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
