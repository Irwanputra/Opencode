package dev.epro.r0;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K16824163401944882247 {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public K16824163401944882247(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static K16824163401944882247 d(ViewGroup viewGroup, E17149812035295265804 e17149812035295265804) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof K16824163401944882247) {
            return (K16824163401944882247) tag;
        }
        e17149812035295265804.getClass();
        K16824163401944882247 k16824163401944882247 = new K16824163401944882247(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, k16824163401944882247);
        return k16824163401944882247;
    }

    public final void a(ArrayList arrayList, boolean z) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((G10824784060060027788) it.next()).getClass();
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        ((G10824784060060027788) arrayList.get(arrayList.size() - 1)).getClass();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ((G10824784060060027788) it2.next()).getClass();
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            ((G10824784060060027788) it3.next()).b();
            throw null;
        }
        HashMap hashMap = new HashMap();
        if (arrayList3.size() > 0) {
            ((I14163674726716005344) arrayList3.get(0)).getClass();
            throw null;
        }
        if (arrayList3.size() > 0) {
            ((I14163674726716005344) arrayList3.get(0)).getClass();
            hashMap.put(null, Boolean.FALSE);
            throw null;
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        this.a.getContext();
        ArrayList arrayList5 = new ArrayList();
        if (arrayList2.size() > 0) {
            ((G2501023836692815764) arrayList2.get(0)).getClass();
            throw null;
        }
        if (arrayList5.size() > 0) {
            ((G2501023836692815764) arrayList5.get(0)).getClass();
            if (!containsValue) {
                throw null;
            }
            throw null;
        }
        if (arrayList4.size() <= 0) {
            arrayList4.clear();
        } else {
            ((G10824784060060027788) arrayList4.get(0)).getClass();
            throw null;
        }
    }

    public final void b() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = W10240872260424387225.a;
        if (!viewGroup.isAttachedToWindow()) {
            c();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        G10824784060060027788 g10824784060060027788 = (G10824784060060027788) obj;
                        g10824784060060027788.a();
                        this.c.add(g10824784060060027788);
                    }
                    e();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((G10824784060060027788) obj2).b();
                    }
                    a(arrayList2, this.d);
                    this.d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = W10240872260424387225.a;
        viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                e();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((G10824784060060027788) obj).b();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    ((G10824784060060027788) obj2).a();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    ((G10824784060060027788) obj3).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((G10824784060060027788) obj).getClass();
        }
    }
}
