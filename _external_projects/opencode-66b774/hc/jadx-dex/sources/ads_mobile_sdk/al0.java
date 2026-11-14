package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class al0 extends dev.epro.r0.X9848659370812859730 {
    public static final android.os.Parcelable.Creator<ads_mobile_sdk.al0> CREATOR = new dev.epro.r0.A16739659649845694970((byte) 15);
    public final java.lang.String a;
    public final int b;

    public al0(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.al0)) {
            return false;
        }
        ads_mobile_sdk.al0 al0Var = (ads_mobile_sdk.al0) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, al0Var.a) && this.b == al0Var.b;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return java.lang.Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G6547577305291411977.p(this.b, "ExceptionParcel(message=", this.a, ", errorCode=", ")");
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.getClass();
        int iA = dev.epro.r0.C468629748621011703.A(parcel, 20293);
        dev.epro.r0.C468629748621011703.v(parcel, this.a, 1);
        dev.epro.r0.C468629748621011703.z(parcel, 2, 4);
        parcel.writeInt(this.b);
        dev.epro.r0.C468629748621011703.D(parcel, iA);
    }
}
