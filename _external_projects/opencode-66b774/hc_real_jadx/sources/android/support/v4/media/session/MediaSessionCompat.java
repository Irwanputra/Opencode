package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.InterfaceC2782;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0025();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final MediaDescriptionCompat f63;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final long f64;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public Object f65;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0025 implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f63 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f64 = parcel.readLong();
        }

        public QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f63 = mediaDescriptionCompat;
            this.f64 = j;
            this.f65 = obj;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder m4207 = C2098.m4207("MediaSession.QueueItem {Description=");
            m4207.append(this.f63);
            m4207.append(", Id=");
            m4207.append(this.f64);
            m4207.append(" }");
            return m4207.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f63.writeToParcel(parcel, i);
            parcel.writeLong(this.f64);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0026();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public ResultReceiver f66;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0026 implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f66 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f66.writeToParcel(parcel, i);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0027();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Object f67;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public InterfaceC2782 f68;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0027 implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
            }

            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this.f67 = obj;
            this.f68 = null;
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public static Token m32(Object obj, InterfaceC2782 interfaceC2782) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, interfaceC2782);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f67;
            Object obj3 = ((Token) obj).f67;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f67;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f67, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f67);
            }
        }

        public Token(Object obj, InterfaceC2782 interfaceC2782) {
            this.f67 = obj;
            this.f68 = interfaceC2782;
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m31(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
