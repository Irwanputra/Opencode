package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G7787024643449318697 extends Y975470382943463598 {
    public final N3708695931114372880 d;

    public G7787024643449318697(N3708695931114372880 n3708695931114372880) {
        this.d = n3708695931114372880;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new A9002731401285716262(this.d, objArr[i], objArr[i + 1]);
    }
}
