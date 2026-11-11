package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Parcelable f1099;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final AbsSavedState f1098 = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C0158();

    /* renamed from: androidx.customview.view.AbsSavedState$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0158 implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbsSavedState.f1098;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new AbsSavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f1098;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1099 = readParcelable == null ? f1098 : readParcelable;
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f1099 = parcelable == f1098 ? null : parcelable;
    }

    public AbsSavedState(AnonymousClass1 anonymousClass1) {
        this.f1099 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1099, i);
    }
}
