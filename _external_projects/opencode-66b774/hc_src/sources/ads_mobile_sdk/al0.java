package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import dev.epro.r0.A16739659649845694970;
import dev.epro.r0.C468629748621011703;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.X9848659370812859730;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class al0 extends X9848659370812859730 {
    public static final Parcelable.Creator<al0> CREATOR = new A16739659649845694970((byte) 15);
    public final String a;
    public final int b;

    public al0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al0)) {
            return false;
        }
        al0 al0Var = (al0) obj;
        return S10823041268949770285.t(this.a, al0Var.a) && this.b == al0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return G6547577305291411977.p(this.b, "ExceptionParcel(message=", this.a, ", errorCode=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int A = C468629748621011703.A(parcel, 20293);
        C468629748621011703.v(parcel, this.a, 1);
        C468629748621011703.z(parcel, 2, 4);
        parcel.writeInt(this.b);
        C468629748621011703.D(parcel, A);
    }
}
