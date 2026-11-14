package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M3288231786426044629 extends X9848659370812859730 {
    public static final Parcelable.Creator<M3288231786426044629> CREATOR = new B10553407071691721287((byte) 4);
    public final F5577235160184315757 d;
    public final boolean e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int[] i;

    public M3288231786426044629(F5577235160184315757 f5577235160184315757, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.d = f5577235160184315757;
        this.e = z;
        this.f = z2;
        this.g = iArr;
        this.h = i;
        this.i = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A = C468629748621011703.A(parcel, 20293);
        C468629748621011703.u(parcel, 1, this.d, i);
        C468629748621011703.z(parcel, 2, 4);
        parcel.writeInt(this.e ? 1 : 0);
        C468629748621011703.z(parcel, 3, 4);
        parcel.writeInt(this.f ? 1 : 0);
        int[] iArr = this.g;
        if (iArr != null) {
            int A2 = C468629748621011703.A(parcel, 4);
            parcel.writeIntArray(iArr);
            C468629748621011703.D(parcel, A2);
        }
        C468629748621011703.z(parcel, 5, 4);
        parcel.writeInt(this.h);
        int[] iArr2 = this.i;
        if (iArr2 != null) {
            int A3 = C468629748621011703.A(parcel, 6);
            parcel.writeIntArray(iArr2);
            C468629748621011703.D(parcel, A3);
        }
        C468629748621011703.D(parcel, A);
    }
}
