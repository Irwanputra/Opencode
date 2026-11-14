package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X12923627983819883516 extends X9848659370812859730 {
    public static final Parcelable.Creator<X12923627983819883516> CREATOR = new A16739659649845694970((byte) 19);
    public final int d;
    public List e;

    public X12923627983819883516(int i, List list) {
        this.d = i;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A = C468629748621011703.A(parcel, 20293);
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        C468629748621011703.x(parcel, 2, this.e);
        C468629748621011703.D(parcel, A);
    }
}
