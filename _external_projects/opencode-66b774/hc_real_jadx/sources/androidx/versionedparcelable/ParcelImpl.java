package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p034.p077.C1482;
import p034.p077.InterfaceC1483;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /tmp/opencode/hc_real.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0292();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final InterfaceC1483 f1832;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0292 implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f1832 = new C1482(parcel).m3231();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new C1482(parcel).m3236(this.f1832);
    }
}
