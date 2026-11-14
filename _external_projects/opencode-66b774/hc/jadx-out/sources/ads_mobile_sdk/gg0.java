package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import dev.epro.r0.A16739659649845694970;
import dev.epro.r0.C468629748621011703;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.X9848659370812859730;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 extends X9848659370812859730 {
    public static final Parcelable.Creator<gg0> CREATOR = new A16739659649845694970((byte) 16);
    public final String a;

    public gg0(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gg0) && S10823041268949770285.t(this.a, ((gg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return G6547577305291411977.s("DecagonRequestParcel(packageName=", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iA = C468629748621011703.A(parcel, 20293);
        C468629748621011703.v(parcel, this.a, 1);
        C468629748621011703.D(parcel, iA);
    }
}
