package ads_mobile_sdk;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import dev.epro.r0.C468629748621011703;
import dev.epro.r0.L14144435763408236280;
import dev.epro.r0.Z15241293964366332233;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class sl2 extends L14144435763408236280 {
    public final /* synthetic */ tl2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl2(tl2 tl2Var) {
        super("com.google.android.play.core.prewarm.protocol.IPrewarmServiceCallback", (byte) 1);
        this.a = tl2Var;
    }

    @Override // dev.epro.r0.L14144435763408236280
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i2 = Z15241293964366332233.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(C468629748621011703.e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        k33 k33Var = this.a.a;
        if (k33Var == null) {
            return true;
        }
        tl2.c.getClass();
        k33Var.getClass();
        k33Var.b(new f33(k33Var, (byte) 0));
        return true;
    }
}
