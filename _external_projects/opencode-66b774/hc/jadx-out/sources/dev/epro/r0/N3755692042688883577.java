package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N3755692042688883577 extends X9848659370812859730 {
    public static final Parcelable.Creator<N3755692042688883577> CREATOR = new B10553407071691721287((byte) 1);
    public final String d;
    public final int e;

    public N3755692042688883577(String str, int i) {
        this.d = str;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = C468629748621011703.A(parcel, 20293);
        C468629748621011703.v(parcel, this.d, 1);
        C468629748621011703.z(parcel, 2, 4);
        parcel.writeInt(this.e);
        C468629748621011703.D(parcel, iA);
    }
}
