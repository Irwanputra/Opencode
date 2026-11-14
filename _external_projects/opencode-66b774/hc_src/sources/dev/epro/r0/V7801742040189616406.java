package dev.epro.r0;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
        Bundle z = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getValue().getClass();
            Z3383101362411723454.s();
            return null;
        }
        if (bundle != null) {
            z.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                entry2.getValue().getClass();
                Z3383101362411723454.s();
                return null;
            }
        }
        return z;
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
        W6610499404761400913 g = g6575252167976303972.g(str);
        if (((V7801742040189616406) g6575252167976303972.b).equals(g != null ? g.a : null)) {
            if (bundle == null) {
                g.getClass();
                return false;
            }
            Bundle bundle2 = g.b;
            if (bundle2 != null) {
                Set<String> keySet = bundle2.keySet();
                keySet.getClass();
                for (String str2 : keySet) {
                    str2.getClass();
                    if (bundle.containsKey(str2)) {
                        if (E4951175994894594588.z0((LinkedHashMap) g.a.b.d).get(str2) != null) {
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L5
            goto Lc9
        L5:
            r1 = 0
            if (r9 == 0) goto Lca
            boolean r2 = r9 instanceof dev.epro.r0.V7801742040189616406
            if (r2 != 0) goto Le
            goto Lca
        Le:
            dev.epro.r0.G6575252167976303972 r2 = r8.b
            java.lang.Object r3 = r2.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            dev.epro.r0.V7801742040189616406 r9 = (dev.epro.r0.V7801742040189616406) r9
            dev.epro.r0.E8321115364184429049 r4 = r9.d
            dev.epro.r0.G6575252167976303972 r9 = r9.b
            java.lang.Object r5 = r9.c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r3 = r3.equals(r5)
            dev.epro.r0.E8321115364184429049 r8 = r8.d
            int r5 = r8.d()
            int r6 = r4.d()
            if (r5 != r6) goto L5e
            dev.epro.r0.B7183363852394630333 r5 = new dev.epro.r0.B7183363852394630333
            r5.<init>(r8)
            dev.epro.r0.U16443665883761795894 r5 = dev.epro.r0.T2881242016550624223.y(r5)
            dev.epro.r0.P5486592749040390593 r5 = (dev.epro.r0.P5486592749040390593) r5
            java.util.Iterator r5 = r5.iterator()
        L3d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5c
            java.lang.Object r6 = r5.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = dev.epro.r0.V1475975160983963926.p(r8, r6)
            java.lang.Object r6 = dev.epro.r0.V1475975160983963926.p(r4, r6)
            boolean r6 = dev.epro.r0.S10823041268949770285.t(r7, r6)
            if (r6 != 0) goto L3d
            goto L5e
        L5c:
            r8 = r0
            goto L5f
        L5e:
            r8 = r1
        L5f:
            java.lang.Object r4 = r2.d
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r5 = r9.d
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            int r6 = r4.size()
            int r7 = r5.size()
            if (r6 != r7) goto Lae
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            dev.epro.r0.V11146580314972738611 r4 = dev.epro.r0.R9411874267597469228.t0(r4)
            java.lang.Object r4 = r4.b
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L83:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lac
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            boolean r7 = r5.containsKey(r7)
            if (r7 == 0) goto Lae
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r7 = r5.get(r7)
            java.lang.Object r6 = r6.getValue()
            boolean r6 = dev.epro.r0.S10823041268949770285.t(r7, r6)
            if (r6 == 0) goto Lae
            goto L83
        Lac:
            r4 = r0
            goto Laf
        Lae:
            r4 = r1
        Laf:
            int r5 = r2.a
            int r6 = r9.a
            if (r5 != r6) goto Lca
            java.lang.Object r2 = r2.e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r9 = r9.e
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = dev.epro.r0.S10823041268949770285.t(r2, r9)
            if (r9 == 0) goto Lca
            if (r3 == 0) goto Lca
            if (r8 == 0) goto Lca
            if (r4 == 0) goto Lca
        Lc9:
            return r0
        Lca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V7801742040189616406.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        G6575252167976303972 g6575252167976303972 = this.b;
        int i = g6575252167976303972.a * 31;
        String str = (String) g6575252167976303972.e;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) g6575252167976303972.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            hashCode = (((F17673720950005104351) obj).a.hashCode() + (hashCode * 31)) * 961;
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
            int h = E12098517352909843120.h(hashCode * 31, 31, str2);
            Object obj2 = linkedHashMap.get(str2);
            hashCode = h + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public W6610499404761400913 i(I1632105416032993715 i1632105416032993715) {
        boolean f;
        H5336160545165318150 h5336160545165318150;
        U12307647644992999381 e2;
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
                f = true;
            } else if (uri == null) {
                f = false;
            } else {
                H5336160545165318150 h53361605451653181502 = (H5336160545165318150) o12494175665883759871.getValue();
                h53361605451653181502.getClass();
                f = h53361605451653181502.f(uri.toString());
            }
            if (f) {
                Bundle d = uri != null ? f17673720950005104351.d(uri, linkedHashMap) : null;
                int b = f17673720950005104351.b(uri);
                String str = (String) i1632105416032993715.c;
                boolean z = str != null && str.equals(null);
                if (d == null) {
                    if (z) {
                        Bundle z2 = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
                        if (uri != null && (h5336160545165318150 = (H5336160545165318150) o12494175665883759871.getValue()) != null && (e2 = h5336160545165318150.e(uri.toString())) != null) {
                            f17673720950005104351.e(e2, z2, linkedHashMap);
                            if (((Boolean) f17673720950005104351.e.getValue()).booleanValue()) {
                                f17673720950005104351.f(uri, z2, linkedHashMap);
                            }
                        }
                        if (Q3181834110876746778.J(linkedHashMap, new R5711761951756790003(z2, (byte) 1)).isEmpty()) {
                        }
                    }
                }
                W6610499404761400913 w66104994047614009132 = new W6610499404761400913((V7801742040189616406) g6575252167976303972.b, d, f17673720950005104351.l, b, z);
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
