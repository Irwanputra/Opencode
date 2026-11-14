package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I4895091436342539248 extends V2692587811920101313 {
    public static final Parcelable.Creator<I4895091436342539248> CREATOR = new H8663435198548398754((byte) 1);
    public boolean c;

    public I4895091436342539248(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            I4895091436342539248.class.getClassLoader();
        }
        this.c = parcel.readInt() == 1;
    }

    @Override // dev.epro.r0.V2692587811920101313, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
