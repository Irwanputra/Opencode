package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static androidx.core.graphics.drawable.IconCompat read(dev.epro.r0.X8326129805829997012 x8326129805829997012) {
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = androidx.core.graphics.drawable.IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = !x8326129805829997012.e(1) ? -1 : ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.readInt();
        byte[] bArr = iconCompat.c;
        if (x8326129805829997012.e(2)) {
            android.os.Parcel parcel = ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = x8326129805829997012.f(iconCompat.d, 3);
        int i2 = iconCompat.e;
        if (x8326129805829997012.e(4)) {
            i2 = ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.readInt();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (x8326129805829997012.e(5)) {
            i3 = ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.readInt();
        }
        iconCompat.f = i3;
        iconCompat.g = (android.content.res.ColorStateList) x8326129805829997012.f(iconCompat.g, 6);
        java.lang.String string = iconCompat.i;
        if (x8326129805829997012.e(7)) {
            string = ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.readString();
        }
        iconCompat.i = string;
        java.lang.String string2 = iconCompat.j;
        if (x8326129805829997012.e(8)) {
            string2 = ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = android.graphics.PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                android.os.Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                dev.epro.r0.S10973172697741180971.j("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                android.os.Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                java.lang.String str = new java.lang.String(iconCompat.c, java.nio.charset.Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(androidx.core.graphics.drawable.IconCompat iconCompat, dev.epro.r0.X8326129805829997012 x8326129805829997012) {
        x8326129805829997012.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (android.os.Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (android.os.Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((java.lang.String) iconCompat.b).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            x8326129805829997012.h(1);
            ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            x8326129805829997012.h(2);
            android.os.Parcel parcel = ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        android.os.Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            x8326129805829997012.h(3);
            ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            x8326129805829997012.h(4);
            ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            x8326129805829997012.h(5);
            ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.writeInt(i3);
        }
        android.content.res.ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            x8326129805829997012.h(6);
            ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.writeParcelable(colorStateList, 0);
        }
        java.lang.String str = iconCompat.i;
        if (str != null) {
            x8326129805829997012.h(7);
            ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.writeString(str);
        }
        java.lang.String str2 = iconCompat.j;
        if (str2 != null) {
            x8326129805829997012.h(8);
            ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.writeString(str2);
        }
    }
}
