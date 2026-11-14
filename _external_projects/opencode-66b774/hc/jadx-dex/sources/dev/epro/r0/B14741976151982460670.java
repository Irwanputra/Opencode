package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B14741976151982460670 extends dev.epro.r0.R15896830329318850690 implements dev.epro.r0.V6844203142031704410 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public dev.epro.r0.I2828680009210448000 f169o;

    public final void E(dev.epro.r0.N17396598995248644478 n17396598995248644478) {
        dev.epro.r0.N16536369055082677148 n16536369055082677148 = n17396598995248644478.a;
        java.util.ArrayList arrayList = this.f169o.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dev.epro.r0.I13087925019311684776 i13087925019311684776 = (dev.epro.r0.I13087925019311684776) arrayList.get(i);
            dev.epro.r0.B9692660393722135472 b9692660393722135472 = i13087925019311684776.o;
            if (b9692660393722135472 != null) {
                long j = i13087925019311684776.m;
                long j2 = b9692660393722135472.t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                ((dev.epro.r0.H12843822278061842084) n16536369055082677148.b.b).I(f, f2);
                try {
                    dev.epro.r0.Z860808776098365610.A(n17396598995248644478, b9692660393722135472);
                } finally {
                    ((dev.epro.r0.H12843822278061842084) n16536369055082677148.b.b).I(-f, -f2);
                }
            }
        }
        n17396598995248644478.a();
    }

    public final void Z0() {
        this.f169o.j = this;
    }

    public final void a1() {
        dev.epro.r0.I2828680009210448000 i2828680009210448000 = this.f169o;
        i2828680009210448000.e();
        i2828680009210448000.b = null;
        i2828680009210448000.c = -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dev.epro.r0.B14741976151982460670) && dev.epro.r0.S10823041268949770285.t(this.f169o, ((dev.epro.r0.B14741976151982460670) obj).f169o);
    }

    public final int hashCode() {
        return this.f169o.hashCode();
    }

    public final java.lang.String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f169o + ")";
    }
}
