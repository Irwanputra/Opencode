package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class gg0 extends dev.epro.r0.X9848659370812859730 {
    public static final android.os.Parcelable.Creator<ads_mobile_sdk.gg0> CREATOR = new dev.epro.r0.A16739659649845694970((byte) 16);
    public final java.lang.String a;

    public gg0(java.lang.String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.gg0) && dev.epro.r0.S10823041268949770285.t(this.a, ((ads_mobile_sdk.gg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G6547577305291411977.s("DecagonRequestParcel(packageName=", this.a, ")");
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.getClass();
        int iA = dev.epro.r0.C468629748621011703.A(parcel, 20293);
        dev.epro.r0.C468629748621011703.v(parcel, this.a, 1);
        dev.epro.r0.C468629748621011703.D(parcel, iA);
    }
}
