package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
            int V = M8927913404651150384.V(str, '&', i, 4);
            if (V == -1) {
                V = str.length();
            }
            int V2 = M8927913404651150384.V(str, '=', i, 4);
            if (V2 == -1 || V2 > V) {
                arrayList.add(str.substring(i, V));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, V2));
                arrayList.add(str.substring(V2 + 1, V));
            }
            i = V + 1;
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
        String L = R7033599853981556291.L(this.b, 0, 0, 7);
        String L2 = R7033599853981556291.L(this.c, 0, 0, 7);
        String str2 = this.d;
        if (str2 == null) {
            S10973172697741180971.m("host == null");
            return null;
        }
        int b = b();
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
        return new P10208541982779414550(str, L, L2, str2, b, arrayList, str4 != null ? R7033599853981556291.L(str4, 0, 0, 7) : null, toString());
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

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ea, code lost:
    
        if (r7 < 65536) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0072, code lost:
    
        if (r13 == ':') goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(dev.epro.r0.P10208541982779414550 r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z17877815202129479382.c(dev.epro.r0.P10208541982779414550, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z17877815202129479382.toString():java.lang.String");
    }
}
