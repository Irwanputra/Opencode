package dev.epro.r0;

import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V14323974914327418545 {
    public final ArrayList a;

    public V14323974914327418545(I6674524549538428163 i6674524549538428163) {
        i6674524549538428163.getClass();
        int i = T975435490942095199.a;
        H18172316468146598624 h18172316468146598624 = i6674524549538428163.b;
        H16804135748878711746 h16804135748878711746 = i6674524549538428163.d;
        byte b = 3;
        byte b2 = 2;
        ArrayList arrayListX = K5751602218013079365.X(new U16585827167541805744(h18172316468146598624, (byte) 0), new U16585827167541805744(i6674524549538428163.c, (byte) 1), new U16585827167541805744(i6674524549538428163.e, (byte) 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Object systemService = i6674524549538428163.a.getSystemService("connectivity");
            systemService.getClass();
            arrayListX.add(new V8566827842724050565((ConnectivityManager) systemService));
        } else {
            h16804135748878711746.getClass();
            arrayListX.addAll(K5751602218013079365.V(new U16585827167541805744(h16804135748878711746, b2), new U16585827167541805744(h16804135748878711746, b), new M16781489564598745325(h16804135748878711746), new X9748049804632610963(h16804135748878711746)));
        }
        this.a = arrayListX;
    }

    public void a(Object obj) {
        this.a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.a;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public void c() {
        this.a.add(G18244342923164738699.c);
    }

    public void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new Z17567843015568193876(f, f2, f3, f4, f5, f6));
    }

    public void e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new L4997663793588871338(f, f2, f3, f4, f5, f6));
    }

    public void f(float f) {
        this.a.add(new D17019851967677288206(f));
    }

    public void g(float f) {
        this.a.add(new B7853650354552420046(f));
    }

    public void h(float f, float f2) {
        this.a.add(new N18337357316239809325(f, f2));
    }

    public void i(float f, float f2) {
        this.a.add(new T8070361472955532362(f, f2));
    }

    public void j(float f, float f2) {
        this.a.add(new K11581048818582425500(f, f2));
    }

    public void k(float f, float f2) {
        this.a.add(new I11903408704749660994(f, f2));
    }

    public Object l() {
        return this.a.remove(r1.size() - 1);
    }

    public void m(Object obj) {
        this.a.add(obj);
    }

    public void n(float f, float f2, float f3, float f4) {
        this.a.add(new W10599348388964801452(f, f2, f3, f4));
    }

    public void o(float f, float f2, float f3, float f4) {
        this.a.add(new A18382775279431935848(f, f2, f3, f4));
    }

    public void p(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public J12043550928838212009 q(L16425900549479658727 l16425900549479658727) {
        l16425900549479658727.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (((Q14474720477641017052) obj).b(l16425900549479658727)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(Z115818233709597990.k0(arrayList, 10));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList3.add(((Q14474720477641017052) obj2).c(l16425900549479658727.j));
        }
        return M9216324016624295870.v(new G6219617120344415229((J12043550928838212009[]) R9411874267597469228.d1(arrayList3).toArray(new J12043550928838212009[0]), (byte) 6));
    }

    public void r(float f) {
        this.a.add(new Q5399713605274603679(f));
    }

    public void s(float f) {
        this.a.add(new I13705132866148191069(f));
    }

    public V14323974914327418545(int i, byte b) {
        switch (b) {
            case 4:
                this.a = new ArrayList(i);
                break;
            default:
                this.a = new ArrayList(i);
                break;
        }
    }

    public V14323974914327418545(byte b) {
        switch (b) {
            case 3:
                this.a = new ArrayList(32);
                break;
            default:
                this.a = new ArrayList(20);
                break;
        }
    }

    public V14323974914327418545(P15728539964912394135 p15728539964912394135) {
        ArrayList arrayList = p15728539964912394135.b;
        ArrayList arrayListA = E10094820292195644345.a(p15728539964912394135.d());
        this.a = arrayListA;
        ArrayList arrayListA2 = E10094820292195644345.a(p15728539964912394135.e());
        E10094820292195644345.a(p15728539964912394135.d);
        if (arrayListA.isEmpty()) {
            arrayListA2.isEmpty();
        }
    }
}
