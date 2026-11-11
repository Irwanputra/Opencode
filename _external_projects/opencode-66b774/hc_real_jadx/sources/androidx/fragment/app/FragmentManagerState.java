package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /tmp/opencode/hc_real.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0172();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ArrayList<FragmentState> f1241;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ArrayList<String> f1242;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String f1243;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f1244;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public BackStackState[] f1245;

    /* renamed from: androidx.fragment.app.FragmentManagerState$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0172 implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
        this.f1243 = null;
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1243 = null;
        this.f1241 = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f1242 = parcel.createStringArrayList();
        this.f1245 = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1243 = parcel.readString();
        this.f1244 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1241);
        parcel.writeStringList(this.f1242);
        parcel.writeTypedArray(this.f1245, i);
        parcel.writeString(this.f1243);
        parcel.writeInt(this.f1244);
    }
}
