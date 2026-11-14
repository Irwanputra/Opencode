package dev.epro.r0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y9189380382094246501 extends X9848659370812859730 {
    public static final Parcelable.Creator<Y9189380382094246501> CREATOR = new B10553407071691721287((byte) 3);
    public Bundle d;
    public J18325703078859211263[] e;
    public int f;
    public M3288231786426044629 g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = C468629748621011703.A(parcel, 20293);
        Bundle bundle = this.d;
        if (bundle != null) {
            int iA2 = C468629748621011703.A(parcel, 1);
            parcel.writeBundle(bundle);
            C468629748621011703.D(parcel, iA2);
        }
        C468629748621011703.w(parcel, 2, this.e, i);
        int i2 = this.f;
        C468629748621011703.z(parcel, 3, 4);
        parcel.writeInt(i2);
        C468629748621011703.u(parcel, 4, this.g, i);
        C468629748621011703.D(parcel, iA);
    }
}
