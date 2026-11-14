package dev.epro.r0;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class R9411874267597469228 extends P17571903987102865660 {
    public static Object A0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return B0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        K2042933864045806308.n("Collection is empty.");
        return null;
    }

    public static Object B0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        K2042933864045806308.n("List is empty.");
        return null;
    }

    public static Object C0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object D0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object E0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int F0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                K5751602218013079365.f0();
                throw null;
            }
            if (S10823041268949770285.t(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static LinkedHashSet G0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection d1 = iterable2 instanceof Collection ? (Collection) iterable2 : d1(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (d1.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static final void H0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, F4096073349764486348 f4096073349764486348) {
        iterable.getClass();
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                B6030175592171028728.i(sb, obj, f4096073349764486348);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void I0(List list, StringBuilder sb, A6662317080022852970 a6662317080022852970, int i) {
        if ((i & 64) != 0) {
            a6662317080022852970 = null;
        }
        H0(list, sb, "\n", "", "", -1, "...", a6662317080022852970);
    }

    public static String J0(Iterable iterable, String str, String str2, String str3, int i, F4096073349764486348 f4096073349764486348, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i2 & 2) != 0 ? "" : str2;
        String str6 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        String str7 = (i2 & 16) != 0 ? "..." : "";
        if ((i2 & 32) != 0) {
            f4096073349764486348 = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        H0(iterable, sb, str4, str5, str6, i3, str7, f4096073349764486348);
        return sb.toString();
    }

    public static Object K0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        K2042933864045806308.n("List is empty.");
        return null;
    }

    public static Object L0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable M0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float N0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static ArrayList O0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            P17571903987102865660.n0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList P0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object Q0(Collection collection) {
        J7406921379779620091 j7406921379779620091 = C1290752467339106930.a;
        collection.getClass();
        if (collection.isEmpty()) {
            K2042933864045806308.n("Collection is empty.");
            return null;
        }
        return z0(C1290752467339106930.b.k(collection.size()), collection);
    }

    public static List R0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return d1(iterable);
        }
        List f1 = f1(iterable);
        Collections.reverse(f1);
        return f1;
    }

    public static Object S0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            K2042933864045806308.n("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        S10973172697741180971.j("List has more than one element.");
        return null;
    }

    public static Object T0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object U0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List V0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List f1 = f1(iterable);
            R4678422174699242737.l0(f1);
            return f1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return d1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        O5378677881740157249.O0((Comparable[]) array);
        array.getClass();
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static List W0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List f1 = f1(iterable);
            R4678422174699242737.m0(f1, comparator);
            return f1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return d1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static List X0(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            S10973172697741180971.i(G6547577305291411977.o(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return O2161699089510411363.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return d1(iterable);
            }
            if (i == 1) {
                return K5751602218013079365.U(A0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return K5751602218013079365.Y(arrayList);
    }

    public static List Y0(int i, List list) {
        list.getClass();
        if (i < 0) {
            S10973172697741180971.i(G6547577305291411977.o(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return O2161699089510411363.a;
        }
        int size = list.size();
        if (i >= size) {
            return d1(list);
        }
        if (i == 1) {
            return K5751602218013079365.U(K0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] Z0(Collection collection) {
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void a1(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] b1(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] c1(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List d1(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return K5751602218013079365.Y(f1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return O2161699089510411363.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return K5751602218013079365.U(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList e1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List f1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        a1(iterable, arrayList);
        return arrayList;
    }

    public static Set g1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set h1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return T8598786036980488824.z(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(E4951175994894594588.u0(collection.size()));
                a1(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            a1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : T8598786036980488824.z(linkedHashSet2.iterator().next());
            }
        }
        return H15747516787109764287.a;
    }

    public static ArrayList i1(ArrayList arrayList, List list) {
        Iterator it = arrayList.iterator();
        Iterator it2 = list.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(Z115818233709597990.k0(arrayList, 10), Z115818233709597990.k0(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new H9390398899829886498(it.next(), it2.next()));
        }
        return arrayList2;
    }

    public static V11146580314972738611 t0(Iterable iterable) {
        iterable.getClass();
        return new V11146580314972738611(iterable, (byte) 1);
    }

    public static ArrayList u0(ArrayList arrayList, int i) {
        P13747563277035175218.d(i, i);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(arrayList.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static boolean v0(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : F0(iterable, obj) >= 0;
    }

    public static List w0(Iterable iterable) {
        iterable.getClass();
        return d1(g1(iterable));
    }

    public static List x0(Iterable iterable, int i) {
        ArrayList arrayList;
        Object obj;
        iterable.getClass();
        if (i < 0) {
            S10973172697741180971.i(G6547577305291411977.o(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return d1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return O2161699089510411363.a;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    obj = K0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        K2042933864045806308.n("Collection is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    obj = next;
                }
                return K5751602218013079365.U(obj);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 >= i) {
                arrayList.add(obj2);
            } else {
                i2++;
            }
        }
        return K5751602218013079365.Y(arrayList);
    }

    public static List y0(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return X0(list, size);
    }

    public static final Object z0(int i, Collection collection) {
        boolean z = collection instanceof List;
        if (z) {
            return ((List) collection).get(i);
        }
        O16774394856129852758 o16774394856129852758 = new O16774394856129852758(i, (byte) 2);
        if (z) {
            List list = (List) collection;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            o16774394856129852758.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            o16774394856129852758.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        o16774394856129852758.invoke(Integer.valueOf(i));
        throw null;
    }
}
