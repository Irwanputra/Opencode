package pub.devrel.easypermissions;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppSettingsDialog implements Parcelable {
    public static final Parcelable.Creator<AppSettingsDialog> CREATOR = new C0505();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final int f3748;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f3749;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int f3750;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final String f3751;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final String f3752;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final String f3753;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final String f3754;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Context f3755;

    /* renamed from: pub.devrel.easypermissions.AppSettingsDialog$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0505 implements Parcelable.Creator<AppSettingsDialog> {
        @Override // android.os.Parcelable.Creator
        public AppSettingsDialog createFromParcel(Parcel parcel) {
            return new AppSettingsDialog(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public AppSettingsDialog[] newArray(int i) {
            return new AppSettingsDialog[i];
        }
    }

    public AppSettingsDialog(Parcel parcel, C0505 c0505) {
        this.f3749 = parcel.readInt();
        this.f3751 = parcel.readString();
        this.f3754 = parcel.readString();
        this.f3752 = parcel.readString();
        this.f3753 = parcel.readString();
        this.f3750 = parcel.readInt();
        this.f3748 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3749);
        parcel.writeString(this.f3751);
        parcel.writeString(this.f3754);
        parcel.writeString(this.f3752);
        parcel.writeString(this.f3753);
        parcel.writeInt(this.f3750);
        parcel.writeInt(this.f3748);
    }
}
