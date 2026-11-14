package dev.epro.r0;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class M8821877208104636290 extends RuntimeException {
    public M8821877208104636290(String str, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
        X2485016533998461232.k(sb, str, " Parcel: pos=", iDataPosition, " size=");
        sb.append(iDataSize);
        super(sb.toString());
    }

    public M8821877208104636290(int i) {
        super(C468629748621011703.e(i, "r: "));
    }
}
