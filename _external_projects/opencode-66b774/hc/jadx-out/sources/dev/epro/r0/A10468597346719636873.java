package dev.epro.r0;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A10468597346719636873 extends L17338558938414325155 {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public A10468597346719636873(List list) {
        list.getClass();
        this.b = list;
    }

    @Override // dev.epro.r0.U2917286957277769200
    public final int a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((U12307647644992999381) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // dev.epro.r0.U2917286957277769200, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                String strGroup = ((U12307647644992999381) obj).a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= K5751602218013079365.N(this)) {
                    return list.get(K5751602218013079365.N(this) - i);
                }
                StringBuilder sbQ = E12098517352909843120.q(i, "Element index ", " must be in range [");
                sbQ.append(new P8646985343900033725(0, K5751602218013079365.N(this), 1));
                sbQ.append("].");
                throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.a) {
            case 1:
                return new I13152702509604143947(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public ListIterator listIterator() {
        switch (this.a) {
            case 1:
                return new I13152702509604143947(this, 0);
            default:
                return super.listIterator();
        }
    }

    public A10468597346719636873(U12307647644992999381 u12307647644992999381) {
        this.b = u12307647644992999381;
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.a) {
            case 1:
                return new I13152702509604143947(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
