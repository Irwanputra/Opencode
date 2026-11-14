package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I5194986633932264076 implements Parcelable {
    public static final Parcelable.Creator<I5194986633932264076> CREATOR = new A16739659649845694970((byte) 3);
    public final ArrayList a;
    public final ArrayList b;

    public I5194986633932264076(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(B6836344041339734677.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }
}
