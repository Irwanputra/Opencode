package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import p034.p080.C1493;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new C0462();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C1493<String, Bundle> f3435;

    /* renamed from: com.google.android.material.stateful.ExtendableSavedState$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0462 implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader, C0462 c0462) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f3435 = new C1493<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f3435.put(strArr[i], bundleArr[i]);
        }
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f3435 = new C1493<>();
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ExtendableSavedState{");
        m4207.append(Integer.toHexString(System.identityHashCode(this)));
        m4207.append(" states=");
        m4207.append(this.f3435);
        m4207.append("}");
        return m4207.toString();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1099, i);
        int i2 = this.f3435.f6910;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.f3435.m3246(i3);
            bundleArr[i3] = this.f3435.m3255(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
