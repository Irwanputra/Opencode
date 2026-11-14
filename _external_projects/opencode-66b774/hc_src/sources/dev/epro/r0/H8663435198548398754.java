package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H8663435198548398754 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public static R5670552972627103399 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = H8663435198548398754.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new R5670552972627103399();
        }
        J15049672055732829618 j = A13457896839052192887.b.j();
        for (int i = 0; i < readInt; i++) {
            j.add(parcel.readValue(classLoader));
        }
        return new R5670552972627103399(j.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            default:
                return new I4895091436342539248(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new R5670552972627103399[i];
            default:
                return new I4895091436342539248[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            default:
                return new I4895091436342539248(parcel, classLoader);
        }
    }
}
