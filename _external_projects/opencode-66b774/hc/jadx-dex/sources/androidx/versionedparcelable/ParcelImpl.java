package androidx.versionedparcelable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = new dev.epro.r0.A16739659649845694970((byte) 11);
    public final dev.epro.r0.Q4740749949665887008 a;

    public ParcelImpl(android.os.Parcel parcel) {
        this.a = new dev.epro.r0.H12008688365557887712(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        new dev.epro.r0.H12008688365557887712(parcel).i(this.a);
    }
}
