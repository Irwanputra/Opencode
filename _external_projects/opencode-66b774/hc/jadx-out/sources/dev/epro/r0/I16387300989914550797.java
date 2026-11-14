package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I16387300989914550797 extends Y975470382943463598 {
    public final /* synthetic */ byte d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                int i = this.c;
                this.c = i + 2;
                Object[] objArr = this.a;
                return new I16681891933948192056(objArr[i], objArr[i + 1], (byte) 0);
            case 1:
                int i2 = this.c;
                this.c = i2 + 2;
                return this.a[i2];
            default:
                int i3 = this.c;
                this.c = i3 + 2;
                return this.a[i3 + 1];
        }
    }
}
