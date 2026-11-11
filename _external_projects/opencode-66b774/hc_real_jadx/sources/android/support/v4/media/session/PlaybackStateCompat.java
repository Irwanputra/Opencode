package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0030();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final CharSequence f74;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f75;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int f76;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public List<CustomAction> f77;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final long f78;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final float f79;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final Bundle f80;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final long f81;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final long f82;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final long f83;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final long f84;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0029();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final String f85;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final CharSequence f86;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final Bundle f87;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public Object f88;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final int f89;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0029 implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f85 = parcel.readString();
            this.f86 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f89 = parcel.readInt();
            this.f87 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f85 = str;
            this.f86 = charSequence;
            this.f89 = i;
            this.f87 = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder m4207 = C2098.m4207("Action:mName='");
            m4207.append((Object) this.f86);
            m4207.append(", mIcon=");
            m4207.append(this.f89);
            m4207.append(", mExtras=");
            m4207.append(this.f87);
            return m4207.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f85);
            TextUtils.writeToParcel(this.f86, parcel, i);
            parcel.writeInt(this.f89);
            parcel.writeBundle(this.f87);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0030 implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f75 = i;
        this.f78 = j;
        this.f82 = j2;
        this.f79 = f;
        this.f81 = j3;
        this.f76 = i2;
        this.f74 = charSequence;
        this.f83 = j4;
        this.f77 = new ArrayList(list);
        this.f84 = j5;
        this.f80 = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f75 = parcel.readInt();
        this.f78 = parcel.readLong();
        this.f79 = parcel.readFloat();
        this.f83 = parcel.readLong();
        this.f82 = parcel.readLong();
        this.f81 = parcel.readLong();
        this.f74 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f77 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f84 = parcel.readLong();
        this.f80 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f76 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f75 + ", position=" + this.f78 + ", buffered position=" + this.f82 + ", speed=" + this.f79 + ", updated=" + this.f83 + ", actions=" + this.f81 + ", error code=" + this.f76 + ", error message=" + this.f74 + ", custom actions=" + this.f77 + ", active item id=" + this.f84 + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f75);
        parcel.writeLong(this.f78);
        parcel.writeFloat(this.f79);
        parcel.writeLong(this.f83);
        parcel.writeLong(this.f82);
        parcel.writeLong(this.f81);
        TextUtils.writeToParcel(this.f74, parcel, i);
        parcel.writeTypedList(this.f77);
        parcel.writeLong(this.f84);
        parcel.writeBundle(this.f80);
        parcel.writeInt(this.f76);
    }
}
