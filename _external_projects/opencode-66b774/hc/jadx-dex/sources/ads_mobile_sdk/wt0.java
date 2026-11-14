package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class wt0 extends dev.epro.r0.X9848659370812859730 {
    public static final android.os.Parcelable.Creator<ads_mobile_sdk.wt0> CREATOR = new dev.epro.r0.A16739659649845694970((byte) 18);
    public final int a;
    public ads_mobile_sdk.pd b = null;
    public byte[] c;

    public wt0(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        a();
    }

    public final void a() {
        ads_mobile_sdk.pd pdVar = this.b;
        if (pdVar != null || this.c == null) {
            if (pdVar == null || this.c != null) {
                if (pdVar != null && this.c != null) {
                    dev.epro.r0.S10973172697741180971.m("Invalid internal representation - full");
                } else if (pdVar == null && this.c == null) {
                    dev.epro.r0.S10973172697741180971.m("Invalid internal representation - empty");
                } else {
                    dev.epro.r0.S10973172697741180971.m("Impossible");
                }
            }
        }
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iA = dev.epro.r0.C468629748621011703.A(parcel, 20293);
        dev.epro.r0.C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        byte[] bArrA = this.c;
        if (bArrA == null) {
            bArrA = this.b.a();
        }
        int iA2 = dev.epro.r0.C468629748621011703.A(parcel, 2);
        parcel.writeByteArray(bArrA);
        dev.epro.r0.C468629748621011703.D(parcel, iA2);
        dev.epro.r0.C468629748621011703.D(parcel, iA);
    }
}
