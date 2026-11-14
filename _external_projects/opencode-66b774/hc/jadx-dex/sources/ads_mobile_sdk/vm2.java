package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vm2 extends dev.epro.r0.X9848659370812859730 {
    public static final android.os.Parcelable.Creator<ads_mobile_sdk.vm2> CREATOR = new dev.epro.r0.A16739659649845694970((byte) 17);
    public final int a;
    public final byte[] b;
    public final int c;

    public vm2(byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = bArr == null ? null : java.util.Arrays.copyOf(bArr, bArr.length);
        this.c = i2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iA = dev.epro.r0.C468629748621011703.A(parcel, 20293);
        dev.epro.r0.C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        byte[] bArr = this.b;
        if (bArr != null) {
            int iA2 = dev.epro.r0.C468629748621011703.A(parcel, 2);
            parcel.writeByteArray(bArr);
            dev.epro.r0.C468629748621011703.D(parcel, iA2);
        }
        dev.epro.r0.C468629748621011703.z(parcel, 3, 4);
        parcel.writeInt(this.c);
        dev.epro.r0.C468629748621011703.D(parcel, iA);
    }
}
