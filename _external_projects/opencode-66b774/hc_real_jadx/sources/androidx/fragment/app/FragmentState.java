package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /tmp/opencode/hc_real.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0173();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final boolean f1246;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f1247;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final String f1248;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final boolean f1249;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Fragment f1250;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final String f1251;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int f1252;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final boolean f1253;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int f1254;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final int f1255;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final boolean f1256;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Bundle f1257;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final boolean f1258;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final Bundle f1259;

    /* renamed from: androidx.fragment.app.FragmentState$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0173 implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Parcel parcel) {
        this.f1247 = parcel.readString();
        this.f1251 = parcel.readString();
        this.f1256 = parcel.readInt() != 0;
        this.f1252 = parcel.readInt();
        this.f1254 = parcel.readInt();
        this.f1248 = parcel.readString();
        this.f1246 = parcel.readInt() != 0;
        this.f1258 = parcel.readInt() != 0;
        this.f1249 = parcel.readInt() != 0;
        this.f1259 = parcel.readBundle();
        this.f1253 = parcel.readInt() != 0;
        this.f1257 = parcel.readBundle();
        this.f1255 = parcel.readInt();
    }

    public FragmentState(Fragment fragment) {
        this.f1247 = fragment.getClass().getName();
        this.f1251 = fragment.f1205;
        this.f1256 = fragment.f1214;
        this.f1252 = fragment.f1212;
        this.f1254 = fragment.f1175;
        this.f1248 = fragment.f1184;
        this.f1246 = fragment.f1206;
        this.f1258 = fragment.f1207;
        this.f1249 = fragment.f1210;
        this.f1259 = fragment.f1176;
        this.f1253 = fragment.f1180;
        this.f1255 = fragment.f1200.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append("FragmentState{");
        sb.append(this.f1247);
        sb.append(" (");
        sb.append(this.f1251);
        sb.append(")}:");
        if (this.f1256) {
            sb.append(" fromLayout");
        }
        if (this.f1254 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1254));
        }
        String str = this.f1248;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1248);
        }
        if (this.f1246) {
            sb.append(" retainInstance");
        }
        if (this.f1258) {
            sb.append(" removing");
        }
        if (this.f1249) {
            sb.append(" detached");
        }
        if (this.f1253) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1247);
        parcel.writeString(this.f1251);
        parcel.writeInt(this.f1256 ? 1 : 0);
        parcel.writeInt(this.f1252);
        parcel.writeInt(this.f1254);
        parcel.writeString(this.f1248);
        parcel.writeInt(this.f1246 ? 1 : 0);
        parcel.writeInt(this.f1258 ? 1 : 0);
        parcel.writeInt(this.f1249 ? 1 : 0);
        parcel.writeBundle(this.f1259);
        parcel.writeInt(this.f1253 ? 1 : 0);
        parcel.writeBundle(this.f1257);
        parcel.writeInt(this.f1255);
    }
}
