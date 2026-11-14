package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N4917429841024089144 extends X9848659370812859730 {
    public static final Parcelable.Creator<N4917429841024089144> CREATOR = new A16739659649845694970((byte) 22);
    public final List d;
    public final String e;

    public N4917429841024089144(String str, ArrayList arrayList) {
        this.d = arrayList;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A = C468629748621011703.A(parcel, 20293);
        List<String> list = this.d;
        if (list != null) {
            int A2 = C468629748621011703.A(parcel, 1);
            parcel.writeStringList(list);
            C468629748621011703.D(parcel, A2);
        }
        C468629748621011703.v(parcel, this.e, 2);
        C468629748621011703.D(parcel, A);
    }
}
