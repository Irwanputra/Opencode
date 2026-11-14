package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B14741976151982460670 extends R15896830329318850690 implements V6844203142031704410 {

    /* renamed from: o, reason: collision with root package name */
    public I2828680009210448000 f169o;

    @Override // dev.epro.r0.V6844203142031704410
    public final void E(N17396598995248644478 n17396598995248644478) {
        N16536369055082677148 n16536369055082677148 = n17396598995248644478.a;
        ArrayList arrayList = this.f169o.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            I13087925019311684776 i13087925019311684776 = (I13087925019311684776) arrayList.get(i);
            B9692660393722135472 b9692660393722135472 = i13087925019311684776.f285o;
            if (b9692660393722135472 != null) {
                long j = i13087925019311684776.m;
                long j2 = b9692660393722135472.t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                ((H12843822278061842084) n16536369055082677148.b.b).I(f, f2);
                try {
                    Z860808776098365610.A(n17396598995248644478, b9692660393722135472);
                } finally {
                    ((H12843822278061842084) n16536369055082677148.b.b).I(-f, -f2);
                }
            }
        }
        n17396598995248644478.a();
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
        this.f169o.j = this;
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void a1() {
        I2828680009210448000 i2828680009210448000 = this.f169o;
        i2828680009210448000.e();
        i2828680009210448000.b = null;
        i2828680009210448000.c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B14741976151982460670) && S10823041268949770285.t(this.f169o, ((B14741976151982460670) obj).f169o);
    }

    public final int hashCode() {
        return this.f169o.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f169o + ")";
    }
}
