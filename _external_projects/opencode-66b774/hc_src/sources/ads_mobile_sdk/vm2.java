package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import dev.epro.r0.A16739659649845694970;
import dev.epro.r0.C468629748621011703;
import dev.epro.r0.X9848659370812859730;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class vm2 extends X9848659370812859730 {
    public static final Parcelable.Creator<vm2> CREATOR = new A16739659649845694970((byte) 17);
    public final int a;
    public final byte[] b;
    public final int c;

    public vm2(byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A = C468629748621011703.A(parcel, 20293);
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        byte[] bArr = this.b;
        if (bArr != null) {
            int A2 = C468629748621011703.A(parcel, 2);
            parcel.writeByteArray(bArr);
            C468629748621011703.D(parcel, A2);
        }
        C468629748621011703.z(parcel, 3, 4);
        parcel.writeInt(this.c);
        C468629748621011703.D(parcel, A);
    }
}
