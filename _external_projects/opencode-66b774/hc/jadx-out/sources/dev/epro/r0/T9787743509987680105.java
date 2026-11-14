package dev.epro.r0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T9787743509987680105 implements Parcelable {
    public static final Parcelable.Creator<T9787743509987680105> CREATOR = new B10553407071691721287(6);
    public final String a;
    public final String b;
    public final IBinder c;
    public final Bundle d;

    public /* synthetic */ T9787743509987680105(Parcel parcel) {
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.a = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.b = string2;
        if (parcel.readByte() != 0) {
            this.c = parcel.readStrongBinder();
        } else {
            this.c = null;
        }
        Bundle bundle = parcel.readBundle(T9787743509987680105.class.getClassLoader());
        this.d = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        IBinder iBinder = this.c;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.d);
    }

    public T9787743509987680105(String str, String str2, IBinder iBinder) {
        this.a = str;
        Objects.requireNonNull(str2, "url cannot be null");
        this.b = str2;
        this.c = iBinder;
        this.d = Bundle.EMPTY;
    }
}
