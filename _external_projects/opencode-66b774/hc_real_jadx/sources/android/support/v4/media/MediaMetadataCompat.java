package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p034.p080.C1502;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final C1502<String, Integer> f53;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Bundle f54;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0022 implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C1502<String, Integer> c1502 = new C1502<>();
        f53 = c1502;
        c1502.put("android.media.metadata.TITLE", 1);
        c1502.put("android.media.metadata.ARTIST", 1);
        c1502.put("android.media.metadata.DURATION", 0);
        c1502.put("android.media.metadata.ALBUM", 1);
        c1502.put("android.media.metadata.AUTHOR", 1);
        c1502.put("android.media.metadata.WRITER", 1);
        c1502.put("android.media.metadata.COMPOSER", 1);
        c1502.put("android.media.metadata.COMPILATION", 1);
        c1502.put("android.media.metadata.DATE", 1);
        c1502.put("android.media.metadata.YEAR", 0);
        c1502.put("android.media.metadata.GENRE", 1);
        c1502.put("android.media.metadata.TRACK_NUMBER", 0);
        c1502.put("android.media.metadata.NUM_TRACKS", 0);
        c1502.put("android.media.metadata.DISC_NUMBER", 0);
        c1502.put("android.media.metadata.ALBUM_ARTIST", 1);
        c1502.put("android.media.metadata.ART", 2);
        c1502.put("android.media.metadata.ART_URI", 1);
        c1502.put("android.media.metadata.ALBUM_ART", 2);
        c1502.put("android.media.metadata.ALBUM_ART_URI", 1);
        c1502.put("android.media.metadata.USER_RATING", 3);
        c1502.put("android.media.metadata.RATING", 3);
        c1502.put("android.media.metadata.DISPLAY_TITLE", 1);
        c1502.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c1502.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c1502.put("android.media.metadata.DISPLAY_ICON", 2);
        c1502.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c1502.put("android.media.metadata.MEDIA_ID", 1);
        c1502.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c1502.put("android.media.metadata.MEDIA_URI", 1);
        c1502.put("android.media.metadata.ADVERTISEMENT", 0);
        c1502.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0022();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f54 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f54);
    }
}
