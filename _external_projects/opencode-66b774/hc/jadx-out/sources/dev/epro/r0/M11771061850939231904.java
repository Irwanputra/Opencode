package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M11771061850939231904 extends X9848659370812859730 {
    public static final Parcelable.Creator<M11771061850939231904> CREATOR = new A16739659649845694970((byte) 23);
    public final int d;
    public final B6867906687934285025 e;
    public final Q1083297855554014009 f;

    public M11771061850939231904(int i, B6867906687934285025 b6867906687934285025, Q1083297855554014009 q1083297855554014009) {
        this.d = i;
        this.e = b6867906687934285025;
        this.f = q1083297855554014009;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = C468629748621011703.A(parcel, 20293);
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        C468629748621011703.u(parcel, 2, this.e, i);
        C468629748621011703.u(parcel, 3, this.f, i);
        C468629748621011703.D(parcel, iA);
    }
}
