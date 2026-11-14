package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J8290223557870360453 extends View.BaseSavedState {
    public static final Parcelable.Creator<J8290223557870360453> CREATOR = new A16739659649845694970((byte) 1);
    public boolean a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }
}
