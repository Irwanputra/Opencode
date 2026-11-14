package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class A4783298371339261043 extends dev.epro.r0.L17338558938414325155 {
    public abstract dev.epro.r0.A4783298371339261043 b(int i, java.lang.Object obj);

    public abstract dev.epro.r0.A4783298371339261043 c(java.lang.Object obj);

    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean containsAll(java.util.Collection collection) {
        java.util.Collection collection2 = collection;
        if ((collection2 instanceof java.util.Collection) && collection2.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public dev.epro.r0.A4783298371339261043 i(java.util.Collection collection) {
        dev.epro.r0.J15049672055732829618 j15049672055732829618J = j();
        j15049672055732829618J.addAll(collection);
        return j15049672055732829618J.c();
    }

    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    public abstract dev.epro.r0.J15049672055732829618 j();

    public abstract dev.epro.r0.A4783298371339261043 k(dev.epro.r0.X4434822404034665133 x4434822404034665133);

    public abstract dev.epro.r0.A4783298371339261043 l(int i);

    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract dev.epro.r0.A4783298371339261043 m(int i, java.lang.Object obj);

    public final java.util.List subList(int i, int i2) {
        return new dev.epro.r0.O1447893190183080380(this, i, i2);
    }
}
