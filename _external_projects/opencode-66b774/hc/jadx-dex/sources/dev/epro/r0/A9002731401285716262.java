package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A9002731401285716262 extends dev.epro.r0.I16681891933948192056 implements dev.epro.r0.F10586287370236042155 {
    public final dev.epro.r0.N3708695931114372880 d;
    public java.lang.Object e;

    public A9002731401285716262(dev.epro.r0.N3708695931114372880 n3708695931114372880, java.lang.Object obj, java.lang.Object obj2) {
        super(obj, obj2, (byte) 0);
        this.d = n3708695931114372880;
        this.e = obj2;
    }

    public final java.lang.Object getValue() {
        return this.e;
    }

    public final java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object obj2 = this.e;
        this.e = obj;
        dev.epro.r0.Z11187821387800077217 z11187821387800077217 = this.d.b;
        dev.epro.r0.D13190160240050003111 d13190160240050003111 = z11187821387800077217.d;
        java.lang.Object obj3 = ((dev.epro.r0.I16681891933948192056) this).b;
        if (!d13190160240050003111.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ((dev.epro.r0.L8858318240788919753) z11187821387800077217).c;
        if (!z) {
            d13190160240050003111.put(obj3, obj);
        } else {
            if (!z) {
                dev.epro.r0.Z3383101362411723454.u();
                return null;
            }
            dev.epro.r0.Y975470382943463598 y975470382943463598 = ((dev.epro.r0.L8858318240788919753) z11187821387800077217).a[((dev.epro.r0.L8858318240788919753) z11187821387800077217).b];
            java.lang.Object obj4 = y975470382943463598.a[y975470382943463598.c];
            d13190160240050003111.put(obj3, obj);
            z11187821387800077217.c(obj4 != null ? obj4.hashCode() : 0, d13190160240050003111.b, obj4, 0);
        }
        z11187821387800077217.g = d13190160240050003111.d;
        return obj2;
    }
}
