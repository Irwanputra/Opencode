package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Z17877815202129479382 {
    public String a;
    public String d;
    public ArrayList g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;
    public final ArrayList f = K5751602218013079365.X("");

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iV = M8927913404651150384.V(str, '&', i, 4);
            if (iV == -1) {
                iV = str.length();
            }
            int iV2 = M8927913404651150384.V(str, '=', i, 4);
            if (iV2 == -1 || iV2 > iV) {
                arrayList.add(str.substring(i, iV));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iV2));
                arrayList.add(str.substring(iV2 + 1, iV));
            }
            i = iV + 1;
        }
        return arrayList;
    }

    public final P10208541982779414550 a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            S10973172697741180971.m("scheme == null");
            return null;
        }
        String strL = R7033599853981556291.L(this.b, 0, 0, 7);
        String strL2 = R7033599853981556291.L(this.c, 0, 0, 7);
        String str2 = this.d;
        if (str2 == null) {
            S10973172697741180971.m("host == null");
            return null;
        }
        int iB = b();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(Z115818233709597990.k0(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(R7033599853981556291.L((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(Z115818233709597990.k0(arrayList4, 10));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? R7033599853981556291.L(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new P10208541982779414550(str, strL, strL2, str2, iB, arrayList, str4 != null ? R7033599853981556291.L(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(dev.epro.r0.P10208541982779414550 r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z17877815202129479382.c(dev.epro.r0.P10208541982779414550, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z17877815202129479382.toString():java.lang.String");
    }
}
