package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import dev.epro.r0.A16739659649845694970;
import dev.epro.r0.C468629748621011703;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.X9848659370812859730;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class wt0 extends X9848659370812859730 {
    public static final Parcelable.Creator<wt0> CREATOR = new A16739659649845694970((byte) 18);
    public final int a;
    public pd b = null;
    public byte[] c;

    public wt0(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        a();
    }

    public final void a() {
        pd pdVar = this.b;
        if (pdVar != null || this.c == null) {
            if (pdVar == null || this.c != null) {
                if (pdVar != null && this.c != null) {
                    S10973172697741180971.m("Invalid internal representation - full");
                } else if (pdVar == null && this.c == null) {
                    S10973172697741180971.m("Invalid internal representation - empty");
                } else {
                    S10973172697741180971.m("Impossible");
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = C468629748621011703.A(parcel, 20293);
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        byte[] bArrA = this.c;
        if (bArrA == null) {
            bArrA = this.b.a();
        }
        int iA2 = C468629748621011703.A(parcel, 2);
        parcel.writeByteArray(bArrA);
        C468629748621011703.D(parcel, iA2);
        C468629748621011703.D(parcel, iA);
    }
}
