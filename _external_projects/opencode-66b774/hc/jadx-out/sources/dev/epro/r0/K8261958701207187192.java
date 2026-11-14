package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K8261958701207187192 extends X9848659370812859730 {
    public static final Parcelable.Creator<K8261958701207187192> CREATOR = new A16739659649845694970((byte) 24);
    public final int d;
    public final int e;
    public final int f;
    public final long g;
    public final long h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;

    public K8261958701207187192(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = j;
        this.h = j2;
        this.i = str;
        this.j = str2;
        this.k = i4;
        this.l = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = C468629748621011703.A(parcel, 20293);
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        C468629748621011703.z(parcel, 2, 4);
        parcel.writeInt(this.e);
        C468629748621011703.z(parcel, 3, 4);
        parcel.writeInt(this.f);
        C468629748621011703.z(parcel, 4, 8);
        parcel.writeLong(this.g);
        C468629748621011703.z(parcel, 5, 8);
        parcel.writeLong(this.h);
        C468629748621011703.v(parcel, this.i, 6);
        C468629748621011703.v(parcel, this.j, 7);
        C468629748621011703.z(parcel, 8, 4);
        parcel.writeInt(this.k);
        C468629748621011703.z(parcel, 9, 4);
        parcel.writeInt(this.l);
        C468629748621011703.D(parcel, iA);
    }
}
