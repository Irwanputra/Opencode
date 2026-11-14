package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F5577235160184315757 extends X9848659370812859730 {
    public static final Parcelable.Creator<F5577235160184315757> CREATOR = new A16739659649845694970((byte) 28);
    public final int d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;

    public F5577235160184315757(int i, boolean z, boolean z2, int i2, int i3) {
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = i2;
        this.h = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = C468629748621011703.A(parcel, 20293);
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        C468629748621011703.z(parcel, 2, 4);
        parcel.writeInt(this.e ? 1 : 0);
        C468629748621011703.z(parcel, 3, 4);
        parcel.writeInt(this.f ? 1 : 0);
        C468629748621011703.z(parcel, 4, 4);
        parcel.writeInt(this.g);
        C468629748621011703.z(parcel, 5, 4);
        parcel.writeInt(this.h);
        C468629748621011703.D(parcel, iA);
    }
}
