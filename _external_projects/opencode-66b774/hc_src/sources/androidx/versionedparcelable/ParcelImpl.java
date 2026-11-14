package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import dev.epro.r0.A16739659649845694970;
import dev.epro.r0.H12008688365557887712;
import dev.epro.r0.Q4740749949665887008;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new A16739659649845694970((byte) 11);
    public final Q4740749949665887008 a;

    public ParcelImpl(Parcel parcel) {
        this.a = new H12008688365557887712(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new H12008688365557887712(parcel).i(this.a);
    }
}
