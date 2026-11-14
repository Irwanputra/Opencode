package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class V2692587811920101313 implements Parcelable {
    public final Parcelable a;
    public static final D16334080913021686744 b = new D16334080913021686744();
    public static final Parcelable.Creator<V2692587811920101313> CREATOR = new P18169153813687183597(1);

    public V2692587811920101313(Parcelable parcelable) {
        if (parcelable != null) {
            this.a = parcelable == b ? null : parcelable;
        } else {
            S10973172697741180971.j("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public V2692587811920101313() {
        this.a = null;
    }

    public V2692587811920101313(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.a = parcelable == null ? b : parcelable;
    }
}
