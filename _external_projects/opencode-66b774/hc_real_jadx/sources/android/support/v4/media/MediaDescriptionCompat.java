package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0021();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final Bundle f44;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f45;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Uri f46;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public Object f47;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final CharSequence f48;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final CharSequence f49;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Bitmap f50;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final CharSequence f51;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final Uri f52;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0021 implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m22(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.f45 = parcel.readString();
        this.f48 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f51 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f49 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f50 = (Bitmap) parcel.readParcelable(classLoader);
        this.f46 = (Uri) parcel.readParcelable(classLoader);
        this.f44 = parcel.readBundle(classLoader);
        this.f52 = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f45 = str;
        this.f48 = charSequence;
        this.f51 = charSequence2;
        this.f49 = charSequence3;
        this.f50 = bitmap;
        this.f46 = uri;
        this.f44 = bundle;
        this.f52 = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat m22(java.lang.Object r15) {
        /*
            r0 = 0
            if (r15 == 0) goto L65
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L65
            r2 = r15
            android.media.MediaDescription r2 = (android.media.MediaDescription) r2
            java.lang.String r4 = r2.getMediaId()
            java.lang.CharSequence r5 = r2.getTitle()
            java.lang.CharSequence r6 = r2.getSubtitle()
            java.lang.CharSequence r7 = r2.getDescription()
            android.graphics.Bitmap r8 = r2.getIconBitmap()
            android.net.Uri r9 = r2.getIconUri()
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r10 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L36
            android.support.v4.media.session.MediaSessionCompat.m31(r3)
            android.os.Parcelable r11 = r3.getParcelable(r10)
            android.net.Uri r11 = (android.net.Uri) r11
            goto L37
        L36:
            r11 = r0
        L37:
            if (r11 == 0) goto L50
            java.lang.String r12 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r13 = r3.containsKey(r12)
            if (r13 == 0) goto L4a
            int r13 = r3.size()
            r14 = 2
            if (r13 != r14) goto L4a
            r10 = r0
            goto L51
        L4a:
            r3.remove(r10)
            r3.remove(r12)
        L50:
            r10 = r3
        L51:
            if (r11 == 0) goto L54
            goto L5d
        L54:
            r3 = 23
            if (r1 < r3) goto L5c
            android.net.Uri r0 = r2.getMediaUri()
        L5c:
            r11 = r0
        L5d:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f47 = r15
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.m22(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f48) + ", " + ((Object) this.f51) + ", " + ((Object) this.f49);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            parcel.writeString(this.f45);
            TextUtils.writeToParcel(this.f48, parcel, i);
            TextUtils.writeToParcel(this.f51, parcel, i);
            TextUtils.writeToParcel(this.f49, parcel, i);
            parcel.writeParcelable(this.f50, i);
            parcel.writeParcelable(this.f46, i);
            parcel.writeBundle(this.f44);
            parcel.writeParcelable(this.f52, i);
            return;
        }
        Object obj = this.f47;
        if (obj == null && i2 >= 21) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f45);
            builder.setTitle(this.f48);
            builder.setSubtitle(this.f51);
            builder.setDescription(this.f49);
            builder.setIconBitmap(this.f50);
            builder.setIconUri(this.f46);
            Bundle bundle = this.f44;
            if (i2 < 23 && this.f52 != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f52);
            }
            builder.setExtras(bundle);
            if (i2 >= 23) {
                builder.setMediaUri(this.f52);
            }
            obj = builder.build();
            this.f47 = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}
