package dev.epro.r0;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V18155119740721705968 extends I11267981316413440737 implements T8664623300549140039 {
    public final void e(String str, String str2, String str3, Bundle bundle, H3351639798230113779 h3351639798230113779) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        int i = H15787954015490686430.a;
        parcelC.writeInt(1);
        bundle.writeToParcel(parcelC, 0);
        if (h3351639798230113779 == null) {
            parcelC.writeStrongBinder(null);
        } else {
            parcelC.writeStrongBinder(h3351639798230113779);
        }
        d(parcelC, 2);
    }
}
