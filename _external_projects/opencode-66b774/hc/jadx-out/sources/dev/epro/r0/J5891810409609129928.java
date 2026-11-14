package dev.epro.r0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J5891810409609129928 {
    public static final String[] a;
    public static final HashMap b;
    public static final HashMap c;

    public static native ArrayList a(Q9839587184380308437 q9839587184380308437, String str, int i, int i2);

    public static List b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((B5838432218769904068) obj).a);
        }
        return arrayList2;
    }

    public static native A6478343232691943615 c(Y12887846282176508602 y12887846282176508602, J13328905385734298453 j13328905385734298453, Map map, HashSet hashSet, int i, int i2);

    static {
        izmyclvb.dpqpjfpoanwt1(1672);
        a = new String[]{"SHA-512", "SHA-384", "SHA-256", "SHA-1"};
        HashMap map = new HashMap(8);
        b = map;
        map.put("MD5", "MD5");
        map.put("SHA", "SHA-1");
        map.put("SHA1", "SHA-1");
        map.put("SHA-1", "SHA-1");
        map.put("SHA-256", "SHA-256");
        map.put("SHA-384", "SHA-384");
        map.put("SHA-512", "SHA-512");
        HashMap map2 = new HashMap(5);
        c = map2;
        map2.put("MD5", 0);
        map2.put("SHA-1", 0);
        map2.put("SHA-256", 0);
        map2.put("SHA-384", 9);
        map2.put("SHA-512", 9);
    }
}
