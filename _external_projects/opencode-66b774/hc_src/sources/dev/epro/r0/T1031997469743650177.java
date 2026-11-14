package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T1031997469743650177 extends V6719956433280724295 {
    public final int a;
    public final int b;
    public final int c;
    public final D14731132657808549702 d;

    public T1031997469743650177(int i, int i2, int i3, D14731132657808549702 d14731132657808549702) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = d14731132657808549702;
    }

    public static J15730374346044043770 b() {
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770((byte) 2, false);
        j15730374346044043770.b = null;
        j15730374346044043770.c = null;
        j15730374346044043770.d = null;
        j15730374346044043770.e = D14731132657808549702.t;
        return j15730374346044043770;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.d != D14731132657808549702.t;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof T1031997469743650177)) {
            return false;
        }
        T1031997469743650177 t1031997469743650177 = (T1031997469743650177) obj;
        return t1031997469743650177.a == this.a && t1031997469743650177.b == this.b && t1031997469743650177.c == this.c && t1031997469743650177.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(T1031997469743650177.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        StringBuilder x = G6547577305291411977.x(this.b, "AesGcm Parameters (variant: ", String.valueOf(this.d), ", ", "-byte IV, ");
        x.append(this.c);
        x.append("-byte tag, and ");
        x.append(this.a);
        x.append("-byte key)");
        return x.toString();
    }
}
