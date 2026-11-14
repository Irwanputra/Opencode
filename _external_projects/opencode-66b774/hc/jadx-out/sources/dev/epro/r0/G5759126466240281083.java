package dev.epro.r0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G5759126466240281083 extends B6030175592171028728 {
    public static String s(String str) {
        return T2881242016550624223.E(T2881242016550624223.F(new V11146580314972738611(str, (byte) 4), new V11408211943757035929("    ", (byte) 29)), "\n", null, 62);
    }

    public static String t(String str) {
        Comparable comparable;
        List listD0 = M8927913404651150384.d0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD0) {
            if (!M8927913404651150384.Y((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(Z115818233709597990.k0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!M9216324016624295870.K(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listD0.size();
        int size2 = listD0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listD0) {
            int i3 = i + 1;
            if (i < 0) {
                K5751602218013079365.f0();
                throw null;
            }
            String str3 = (String) obj3;
            String strN = ((i == 0 || i == size2) && M8927913404651150384.Y(str3)) ? null : M8927913404651150384.N(iIntValue, str3);
            if (strN != null) {
                arrayList3.add(strN);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        R9411874267597469228.I0(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static String u(String str) {
        if (M8927913404651150384.Y("|")) {
            S10973172697741180971.j("marginPrefix must be non-blank string.");
            return null;
        }
        List listD0 = M8927913404651150384.d0(str);
        int length = str.length();
        listD0.size();
        int size = listD0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listD0) {
            int i2 = i + 1;
            if (i < 0) {
                K5751602218013079365.f0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && M8927913404651150384.Y(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!M9216324016624295870.K(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && Z13168519540281190457.E(i3, false, str2, "|")) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        R9411874267597469228.I0(arrayList, sb, null, 124);
        return sb.toString();
    }
}
