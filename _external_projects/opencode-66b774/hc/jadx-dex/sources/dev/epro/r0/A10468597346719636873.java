package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A10468597346719636873 extends dev.epro.r0.L17338558938414325155 {
    public final /* synthetic */ byte a = 0;
    public final java.lang.Object b;

    public A10468597346719636873(java.util.List list) {
        list.getClass();
        this.b = list;
    }

    public final int a() {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                return ((dev.epro.r0.U12307647644992999381) obj).a.groupCount() + 1;
            default:
                return ((java.util.List) obj).size();
        }
    }

    public /* bridge */ boolean contains(java.lang.Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof java.lang.String) {
                    return super/*dev.epro.r0.U2917286957277769200*/.contains((java.lang.String) obj);
                }
                return false;
            default:
                return super/*dev.epro.r0.U2917286957277769200*/.contains(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object get(int i) {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                java.lang.String strGroup = ((dev.epro.r0.U12307647644992999381) obj).a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                java.util.List list = (java.util.List) obj;
                if (i >= 0 && i <= dev.epro.r0.K5751602218013079365.N(this)) {
                    return list.get(dev.epro.r0.K5751602218013079365.N(this) - i);
                }
                java.lang.StringBuilder sbQ = dev.epro.r0.E12098517352909843120.q(i, "Element index ", " must be in range [");
                sbQ.append(new dev.epro.r0.P8646985343900033725(0, dev.epro.r0.K5751602218013079365.N(this), 1));
                sbQ.append("].");
                throw new java.lang.IndexOutOfBoundsException(sbQ.toString());
        }
    }

    public /* bridge */ int indexOf(java.lang.Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof java.lang.String) {
                    return super.indexOf((java.lang.String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    public java.util.Iterator iterator() {
        switch (this.a) {
            case 1:
                return new dev.epro.r0.I13152702509604143947(this, 0);
            default:
                return super.iterator();
        }
    }

    public /* bridge */ int lastIndexOf(java.lang.Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof java.lang.String) {
                    return super.lastIndexOf((java.lang.String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    public java.util.ListIterator listIterator() {
        switch (this.a) {
            case 1:
                return new dev.epro.r0.I13152702509604143947(this, 0);
            default:
                return super.listIterator();
        }
    }

    public A10468597346719636873(dev.epro.r0.U12307647644992999381 u12307647644992999381) {
        this.b = u12307647644992999381;
    }

    public java.util.ListIterator listIterator(int i) {
        switch (this.a) {
            case 1:
                return new dev.epro.r0.I13152702509604143947(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
