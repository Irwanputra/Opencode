package dev.epro.r0;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class V7801742040189616406 {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final G6575252167976303972 b;
    public Q4132023691817090890 c;
    public final E8321115364184429049 d;

    static {
        new LinkedHashMap();
    }

    public V7801742040189616406(E4135271276212975889 e4135271276212975889) {
        LinkedHashMap linkedHashMap = G1840519957725232630.b;
        this.a = B11964701839924937722.y(e4135271276212975889.getClass());
        G6575252167976303972 g6575252167976303972 = new G6575252167976303972();
        g6575252167976303972.b = this;
        g6575252167976303972.c = new ArrayList();
        g6575252167976303972.d = new LinkedHashMap();
        this.b = g6575252167976303972;
        this.d = new E8321115364184429049(0);
    }

    public final Bundle a(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b.d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleZ = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getValue().getClass();
            Z3383101362411723454.s();
            return null;
        }
        if (bundle != null) {
            bundleZ.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                entry2.getValue().getClass();
                Z3383101362411723454.s();
                return null;
            }
        }
        return bundleZ;
    }

    public final String b() {
        return (String) this.b.e;
    }

    public final boolean c(String str, Bundle bundle) {
        str.getClass();
        G6575252167976303972 g6575252167976303972 = this.b;
        g6575252167976303972.getClass();
        if (S10823041268949770285.t((String) g6575252167976303972.e, str)) {
            return true;
        }
        W6610499404761400913 w6610499404761400913G = g6575252167976303972.g(str);
        if (((V7801742040189616406) g6575252167976303972.b).equals(w6610499404761400913G != null ? w6610499404761400913G.a : null)) {
            if (bundle == null) {
                w6610499404761400913G.getClass();
                return false;
            }
            Bundle bundle2 = w6610499404761400913G.b;
            if (bundle2 != null) {
                Set<String> setKeySet = bundle2.keySet();
                setKeySet.getClass();
                for (String str2 : setKeySet) {
                    str2.getClass();
                    if (bundle.containsKey(str2)) {
                        if (E4951175994894594588.z0((LinkedHashMap) w6610499404761400913G.a.b.d).get(str2) != null) {
                            Z3383101362411723454.s();
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V7801742040189616406.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        G6575252167976303972 g6575252167976303972 = this.b;
        int i = g6575252167976303972.a * 31;
        String str = (String) g6575252167976303972.e;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) g6575252167976303972.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iHashCode = (((F17673720950005104351) obj).a.hashCode() + (iHashCode * 31)) * 961;
        }
        E8321115364184429049 e8321115364184429049 = this.d;
        e8321115364184429049.getClass();
        if (e8321115364184429049.d() > 0) {
            e8321115364184429049.e(0).getClass();
            Z3383101362411723454.s();
            return 0;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) g6575252167976303972.d;
        for (String str2 : linkedHashMap.keySet()) {
            int iH = E12098517352909843120.h(iHashCode * 31, 31, str2);
            Object obj2 = linkedHashMap.get(str2);
            iHashCode = iH + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public W6610499404761400913 i(I1632105416032993715 i1632105416032993715) {
        boolean zF;
        H5336160545165318150 h5336160545165318150;
        U12307647644992999381 u12307647644992999381E;
        G6575252167976303972 g6575252167976303972 = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) g6575252167976303972.d;
        Uri uri = (Uri) i1632105416032993715.b;
        ArrayList arrayList = (ArrayList) g6575252167976303972.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        W6610499404761400913 w6610499404761400913 = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            F17673720950005104351 f17673720950005104351 = (F17673720950005104351) obj;
            f17673720950005104351.getClass();
            O12494175665883759871 o12494175665883759871 = f17673720950005104351.d;
            if (((H5336160545165318150) o12494175665883759871.getValue()) == null) {
                zF = true;
            } else if (uri == null) {
                zF = false;
            } else {
                H5336160545165318150 h53361605451653181502 = (H5336160545165318150) o12494175665883759871.getValue();
                h53361605451653181502.getClass();
                zF = h53361605451653181502.f(uri.toString());
            }
            if (zF) {
                Bundle bundleD = uri != null ? f17673720950005104351.d(uri, linkedHashMap) : null;
                int iB = f17673720950005104351.b(uri);
                String str = (String) i1632105416032993715.c;
                boolean z = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z) {
                        Bundle bundleZ = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
                        if (uri != null && (h5336160545165318150 = (H5336160545165318150) o12494175665883759871.getValue()) != null && (u12307647644992999381E = h5336160545165318150.e(uri.toString())) != null) {
                            f17673720950005104351.e(u12307647644992999381E, bundleZ, linkedHashMap);
                            if (((Boolean) f17673720950005104351.e.getValue()).booleanValue()) {
                                f17673720950005104351.f(uri, bundleZ, linkedHashMap);
                            }
                        }
                        if (Q3181834110876746778.J(linkedHashMap, new R5711761951756790003(bundleZ, (byte) 1)).isEmpty()) {
                        }
                    }
                }
                W6610499404761400913 w66104994047614009132 = new W6610499404761400913((V7801742040189616406) g6575252167976303972.b, bundleD, f17673720950005104351.l, iB, z);
                if (w6610499404761400913 == null || w66104994047614009132.compareTo(w6610499404761400913) > 0) {
                    w6610499404761400913 = w66104994047614009132;
                }
            }
        }
        return w6610499404761400913;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("(0x");
        G6575252167976303972 g6575252167976303972 = this.b;
        g6575252167976303972.getClass();
        sb.append(Integer.toHexString(g6575252167976303972.a));
        sb.append(")");
        String str = (String) g6575252167976303972.e;
        if (str != null && !M8927913404651150384.Y(str)) {
            sb.append(" route=");
            sb.append((String) g6575252167976303972.e);
        }
        return sb.toString();
    }
}
