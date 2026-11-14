package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class sl2 extends dev.epro.r0.L14144435763408236280 {
    public final /* synthetic */ ads_mobile_sdk.tl2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl2(ads_mobile_sdk.tl2 tl2Var) {
        super("com.google.android.play.core.prewarm.protocol.IPrewarmServiceCallback", (byte) 1);
        this.a = tl2Var;
    }

    public final boolean a(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
        int i2 = dev.epro.r0.Z15241293964366332233.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new android.os.BadParcelableException(dev.epro.r0.C468629748621011703.e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        ads_mobile_sdk.k33 k33Var = this.a.a;
        if (k33Var == null) {
            return true;
        }
        ads_mobile_sdk.tl2.c.getClass();
        k33Var.getClass();
        k33Var.b(new ads_mobile_sdk.f33(k33Var, (byte) 0));
        return true;
    }
}
