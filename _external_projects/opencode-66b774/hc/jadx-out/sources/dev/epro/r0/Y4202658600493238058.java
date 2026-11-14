package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y4202658600493238058 implements Parcelable {
    public static final Parcelable.Creator<Y4202658600493238058> CREATOR = new A16739659649845694970((byte) 6);
    public ArrayList a;
    public ArrayList b;
    public B6836344041339734677[] c;
    public int d;
    public String e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.g);
        parcel.writeTypedList(this.h);
    }
}
