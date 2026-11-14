package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P18169153813687183597 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public /* synthetic */ P18169153813687183597(byte b) {
        this.a = b;
    }

    public static V697849047308847220 a(Parcel parcel, ClassLoader classLoader) {
        B14824868959299866349 b14824868959299866349;
        if (classLoader == null) {
            classLoader = P18169153813687183597.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            b14824868959299866349 = B14824868959299866349.k;
        } else if (i == 1) {
            b14824868959299866349 = B14824868959299866349.s;
        } else {
            if (i != 2) {
                S10973172697741180971.m(G6547577305291411977.o(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            b14824868959299866349 = B14824868959299866349.m;
        }
        return new V697849047308847220(value, b14824868959299866349);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return V2692587811920101313.b;
                }
                S10973172697741180971.m("superState must be null");
                return null;
            default:
                return new B2057841682677142597(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new V697849047308847220[i];
            case 1:
                return new V2692587811920101313[i];
            default:
                return new B2057841682677142597[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return V2692587811920101313.b;
                }
                S10973172697741180971.m("superState must be null");
                return null;
            default:
                return new B2057841682677142597(parcel, null);
        }
    }
}
