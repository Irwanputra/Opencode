package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p034.p105.p106.AbstractC1788;
import p034.p105.p106.C1794;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /tmp/opencode/hc_real.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0166();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final String f1156;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int[] f1157;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int f1158;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int f1159;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final boolean f1160;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final ArrayList<String> f1161;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final ArrayList<String> f1162;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int[] f1163;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final int f1164;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int f1165;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final CharSequence f1166;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int[] f1167;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final ArrayList<String> f1168;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final int f1169;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final CharSequence f1170;

    /* renamed from: androidx.fragment.app.BackStackState$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0166 implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(Parcel parcel) {
        this.f1157 = parcel.createIntArray();
        this.f1162 = parcel.createStringArrayList();
        this.f1167 = parcel.createIntArray();
        this.f1163 = parcel.createIntArray();
        this.f1165 = parcel.readInt();
        this.f1158 = parcel.readInt();
        this.f1156 = parcel.readString();
        this.f1169 = parcel.readInt();
        this.f1159 = parcel.readInt();
        this.f1170 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1164 = parcel.readInt();
        this.f1166 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1168 = parcel.createStringArrayList();
        this.f1161 = parcel.createStringArrayList();
        this.f1160 = parcel.readInt() != 0;
    }

    public BackStackState(C1794 c1794) {
        int size = c1794.f8040.size();
        this.f1157 = new int[size * 5];
        if (!c1794.f8033) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1162 = new ArrayList<>(size);
        this.f1167 = new int[size];
        this.f1163 = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            AbstractC1788.C1789 c1789 = c1794.f8040.get(i);
            int i3 = i2 + 1;
            this.f1157[i2] = c1789.f8053;
            ArrayList<String> arrayList = this.f1162;
            Fragment fragment = c1789.f8050;
            arrayList.add(fragment != null ? fragment.f1205 : null);
            int[] iArr = this.f1157;
            int i4 = i3 + 1;
            iArr[i3] = c1789.f8052;
            int i5 = i4 + 1;
            iArr[i4] = c1789.f8056;
            int i6 = i5 + 1;
            iArr[i5] = c1789.f8054;
            iArr[i6] = c1789.f8055;
            this.f1167[i] = c1789.f8051.ordinal();
            this.f1163[i] = c1789.f8049.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f1165 = c1794.f8043;
        this.f1158 = c1794.f8035;
        this.f1156 = c1794.f8047;
        this.f1169 = c1794.f8069;
        this.f1159 = c1794.f8036;
        this.f1170 = c1794.f8048;
        this.f1164 = c1794.f8042;
        this.f1166 = c1794.f8044;
        this.f1168 = c1794.f8046;
        this.f1161 = c1794.f8038;
        this.f1160 = c1794.f8037;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1157);
        parcel.writeStringList(this.f1162);
        parcel.writeIntArray(this.f1167);
        parcel.writeIntArray(this.f1163);
        parcel.writeInt(this.f1165);
        parcel.writeInt(this.f1158);
        parcel.writeString(this.f1156);
        parcel.writeInt(this.f1169);
        parcel.writeInt(this.f1159);
        TextUtils.writeToParcel(this.f1170, parcel, 0);
        parcel.writeInt(this.f1164);
        TextUtils.writeToParcel(this.f1166, parcel, 0);
        parcel.writeStringList(this.f1168);
        parcel.writeStringList(this.f1161);
        parcel.writeInt(this.f1160 ? 1 : 0);
    }
}
