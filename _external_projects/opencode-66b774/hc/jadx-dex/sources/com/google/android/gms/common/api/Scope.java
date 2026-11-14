package com.google.android.gms.common.api;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class Scope extends dev.epro.r0.X9848659370812859730 implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> CREATOR = new dev.epro.r0.B10553407071691721287(0);
    public final int d;
    public final java.lang.String e;

    public Scope(int i, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            dev.epro.r0.S10973172697741180971.j("scopeUri must not be null or empty");
            throw null;
        }
        this.d = i;
        this.e = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.api.Scope)) {
            return false;
        }
        return this.e.equals(((com.google.android.gms.common.api.Scope) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final java.lang.String toString() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iA = dev.epro.r0.C468629748621011703.A(parcel, 20293);
        dev.epro.r0.C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        dev.epro.r0.C468629748621011703.v(parcel, this.e, 2);
        dev.epro.r0.C468629748621011703.D(parcel, iA);
    }
}
