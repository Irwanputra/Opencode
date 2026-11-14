package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class P17571903987102865660 extends R4678422174699242737 {
    public static void n0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final boolean o0(Iterable iterable, F4096073349764486348 f4096073349764486348) {
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((Boolean) f4096073349764486348.invoke(it.next())).booleanValue()) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static void p0(F4096073349764486348 f4096073349764486348, List list) {
        int size;
        list.getClass();
        f4096073349764486348.getClass();
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof D14639766352081121636) || (list instanceof S3000285732458222736)) {
                o0(list, f4096073349764486348);
                return;
            } else {
                V12319504402545346730.X("kotlin.collections.MutableIterable", list);
                throw null;
            }
        }
        int size2 = list.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) f4096073349764486348.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size == i) {
                return;
            } else {
                size--;
            }
        }
    }

    public static Object q0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        K2042933864045806308.n("List is empty.");
        return null;
    }

    public static Object r0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        K2042933864045806308.n("List is empty.");
        return null;
    }

    public static Object s0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }
}
