package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import dev.epro.r0.H12008688365557887712;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.X8326129805829997012;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(X8326129805829997012 x8326129805829997012) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = !x8326129805829997012.e(1) ? -1 : ((H12008688365557887712) x8326129805829997012).e.readInt();
        byte[] bArr = iconCompat.c;
        if (x8326129805829997012.e(2)) {
            Parcel parcel = ((H12008688365557887712) x8326129805829997012).e;
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
            i2 = ((H12008688365557887712) x8326129805829997012).e.readInt();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (x8326129805829997012.e(5)) {
            i3 = ((H12008688365557887712) x8326129805829997012).e.readInt();
        }
        iconCompat.f = i3;
        iconCompat.g = (ColorStateList) x8326129805829997012.f(iconCompat.g, 6);
        String string = iconCompat.i;
        if (x8326129805829997012.e(7)) {
            string = ((H12008688365557887712) x8326129805829997012).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (x8326129805829997012.e(8)) {
            string2 = ((H12008688365557887712) x8326129805829997012).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                S10973172697741180971.j("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
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
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
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

    public static void write(IconCompat iconCompat, X8326129805829997012 x8326129805829997012) {
        x8326129805829997012.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            x8326129805829997012.h(1);
            ((H12008688365557887712) x8326129805829997012).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            x8326129805829997012.h(2);
            Parcel parcel = ((H12008688365557887712) x8326129805829997012).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            x8326129805829997012.h(3);
            ((H12008688365557887712) x8326129805829997012).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            x8326129805829997012.h(4);
            ((H12008688365557887712) x8326129805829997012).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            x8326129805829997012.h(5);
            ((H12008688365557887712) x8326129805829997012).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            x8326129805829997012.h(6);
            ((H12008688365557887712) x8326129805829997012).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            x8326129805829997012.h(7);
            ((H12008688365557887712) x8326129805829997012).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            x8326129805829997012.h(8);
            ((H12008688365557887712) x8326129805829997012).e.writeString(str2);
        }
    }
}
