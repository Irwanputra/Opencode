package dev.epro.r0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H18172316468146598624 {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;

    public H18172316468146598624(E4135271276212975889 e4135271276212975889, String str) {
        this.a = e4135271276212975889;
        this.b = str;
        this.c = new LinkedHashMap();
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
    }

    public V7801742040189616406 a() {
        V7801742040189616406 v7801742040189616406B = b();
        v7801742040189616406B.getClass();
        G6575252167976303972 g6575252167976303972 = v7801742040189616406B.b;
        Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                Z3383101362411723454.s();
                return null;
            }
            str.getClass();
            throw null;
        }
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        final byte b = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            final F17673720950005104351 f17673720950005104351 = (F17673720950005104351) obj;
            f17673720950005104351.getClass();
            g6575252167976303972.getClass();
            final byte b2 = 1;
            ArrayList arrayListJ = Q3181834110876746778.J((LinkedHashMap) g6575252167976303972.d, new F4096073349764486348() { // from class: dev.epro.r0.D10574964373507209006
                @Override // dev.epro.r0.F4096073349764486348
                public final Object invoke(Object obj2) {
                    boolean zContains;
                    byte b3 = b2;
                    F17673720950005104351 f176737209500051043512 = f17673720950005104351;
                    String str2 = (String) obj2;
                    switch (b3) {
                        case 0:
                            str2.getClass();
                            zContains = f176737209500051043512.c().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            zContains = f176737209500051043512.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListJ.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + f17673720950005104351.a + " can't be used to open destination " + ((V7801742040189616406) g6575252167976303972.b) + ".\nFollowing required arguments are missing: " + arrayListJ).toString());
            }
            ((ArrayList) g6575252167976303972.c).add(f17673720950005104351);
        }
        Iterator it2 = ((LinkedHashMap) this.e).entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            Z3383101362411723454.s();
            return null;
        }
        String str2 = (String) this.b;
        if (str2 != null) {
            g6575252167976303972.getClass();
            if (M8927913404651150384.Y(str2)) {
                S10973172697741180971.j("Cannot have an empty route");
                return null;
            }
            String strConcat = "android-app://androidx.navigation/".concat(str2);
            final F17673720950005104351 f176737209500051043512 = new F17673720950005104351(strConcat);
            ArrayList arrayListJ2 = Q3181834110876746778.J((LinkedHashMap) g6575252167976303972.d, new F4096073349764486348() { // from class: dev.epro.r0.D10574964373507209006
                @Override // dev.epro.r0.F4096073349764486348
                public final Object invoke(Object obj2) {
                    boolean zContains;
                    byte b3 = b;
                    F17673720950005104351 f1767372095000510435122 = f176737209500051043512;
                    String str22 = (String) obj2;
                    switch (b3) {
                        case 0:
                            str22.getClass();
                            zContains = f1767372095000510435122.c().contains(str22);
                            break;
                        default:
                            str22.getClass();
                            zContains = f1767372095000510435122.c().contains(str22);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListJ2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + ((V7801742040189616406) g6575252167976303972.b) + ". Following required arguments are missing: " + arrayListJ2).toString());
            }
            g6575252167976303972.f = new O12494175665883759871(new I15867157411331960782(strConcat, (byte) 2));
            g6575252167976303972.a = strConcat.hashCode();
            g6575252167976303972.e = str2;
        }
        return v7801742040189616406B;
    }

    public V7801742040189616406 b() {
        return ((E4135271276212975889) this.a).a();
    }

    public abstract Object c();

    public void d(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.d;
            if (obj2 == null || !obj2.equals(obj)) {
                this.d = obj;
                ((Q13914734507241918864) this.a).d.execute(new Q9622116641457785369(R9411874267597469228.d1((LinkedHashSet) this.e), this, (byte) 7));
            }
        }
    }

    public abstract void e();

    public abstract void f();

    public H18172316468146598624(Context context, Q13914734507241918864 q13914734507241918864) {
        this.a = q13914734507241918864;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.e = new LinkedHashSet();
    }
}
