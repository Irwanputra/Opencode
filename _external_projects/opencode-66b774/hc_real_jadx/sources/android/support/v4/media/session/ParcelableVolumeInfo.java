package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0028();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f69;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f70;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f71;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f72;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f73;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0028 implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f69 = parcel.readInt();
        this.f73 = parcel.readInt();
        this.f71 = parcel.readInt();
        this.f72 = parcel.readInt();
        this.f70 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f69);
        parcel.writeInt(this.f73);
        parcel.writeInt(this.f71);
        parcel.writeInt(this.f72);
        parcel.writeInt(this.f70);
    }
}
