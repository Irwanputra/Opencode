package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class A4783298371339261043 extends L17338558938414325155 {
    public abstract A4783298371339261043 b(int i, Object obj);

    public abstract A4783298371339261043 c(Object obj);

    @Override // dev.epro.r0.U2917286957277769200, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // dev.epro.r0.U2917286957277769200, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public A4783298371339261043 i(Collection collection) {
        J15049672055732829618 j = j();
        j.addAll(collection);
        return j.c();
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract J15049672055732829618 j();

    public abstract A4783298371339261043 k(X4434822404034665133 x4434822404034665133);

    public abstract A4783298371339261043 l(int i);

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract A4783298371339261043 m(int i, Object obj);

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public final List subList(int i, int i2) {
        return new O1447893190183080380(this, i, i2);
    }
}
