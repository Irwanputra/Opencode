package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B12414884914999257225 extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<dev.epro.r0.B12414884914999257225> CREATOR = new dev.epro.r0.A16739659649845694970((byte) 10);
    public int a;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return dev.epro.r0.E12098517352909843120.n(sb, this.a, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
