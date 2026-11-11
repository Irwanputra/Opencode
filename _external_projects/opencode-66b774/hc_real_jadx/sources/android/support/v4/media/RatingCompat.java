package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0023();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f55;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final float f56;

    /* renamed from: android.support.v4.media.RatingCompat$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0023 implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f55 = i;
        this.f56 = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f55;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("Rating:style=");
        m4207.append(this.f55);
        m4207.append(" rating=");
        float f = this.f56;
        m4207.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return m4207.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f55);
        parcel.writeFloat(this.f56);
    }
}
