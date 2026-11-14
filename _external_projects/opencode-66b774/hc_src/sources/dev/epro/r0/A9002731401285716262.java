package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A9002731401285716262 extends I16681891933948192056 implements F10586287370236042155 {
    public final N3708695931114372880 d;
    public Object e;

    public A9002731401285716262(N3708695931114372880 n3708695931114372880, Object obj, Object obj2) {
        super(obj, obj2, (byte) 0);
        this.d = n3708695931114372880;
        this.e = obj2;
    }

    @Override // dev.epro.r0.I16681891933948192056, java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // dev.epro.r0.I16681891933948192056, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        Z11187821387800077217 z11187821387800077217 = (Z11187821387800077217) this.d.b;
        D13190160240050003111 d13190160240050003111 = z11187821387800077217.d;
        Object obj3 = this.b;
        if (!d13190160240050003111.containsKey(obj3)) {
            return obj2;
        }
        boolean z = z11187821387800077217.c;
        if (!z) {
            d13190160240050003111.put(obj3, obj);
        } else {
            if (!z) {
                Z3383101362411723454.u();
                return null;
            }
            Y975470382943463598 y975470382943463598 = z11187821387800077217.a[z11187821387800077217.b];
            Object obj4 = y975470382943463598.a[y975470382943463598.c];
            d13190160240050003111.put(obj3, obj);
            z11187821387800077217.c(obj4 != null ? obj4.hashCode() : 0, d13190160240050003111.b, obj4, 0);
        }
        z11187821387800077217.g = d13190160240050003111.d;
        return obj2;
    }
}
