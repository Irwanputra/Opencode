package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p034.p077.AbstractC1484;

/* loaded from: /tmp/opencode/hc_real.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1484 abstractC1484) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1060 = abstractC1484.m3237(iconCompat.f1060, 1);
        byte[] bArr = iconCompat.f1059;
        if (abstractC1484.mo3230(2)) {
            bArr = abstractC1484.mo3217();
        }
        iconCompat.f1059 = bArr;
        iconCompat.f1063 = abstractC1484.m3234(iconCompat.f1063, 3);
        iconCompat.f1061 = abstractC1484.m3237(iconCompat.f1061, 4);
        iconCompat.f1062 = abstractC1484.m3237(iconCompat.f1062, 5);
        iconCompat.f1058 = (ColorStateList) abstractC1484.m3234(iconCompat.f1058, 6);
        String str = iconCompat.f1064;
        if (abstractC1484.mo3230(7)) {
            str = abstractC1484.mo3229();
        }
        iconCompat.f1064 = str;
        iconCompat.f1056 = PorterDuff.Mode.valueOf(str);
        switch (iconCompat.f1060) {
            case -1:
                parcelable = iconCompat.f1063;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1057 = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                parcelable = iconCompat.f1063;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.f1059;
                    iconCompat.f1057 = bArr2;
                    iconCompat.f1060 = 3;
                    iconCompat.f1061 = 0;
                    iconCompat.f1062 = bArr2.length;
                    return iconCompat;
                }
                iconCompat.f1057 = parcelable;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                iconCompat.f1057 = new String(iconCompat.f1059, Charset.forName("UTF-16"));
                return iconCompat;
            case 3:
                iconCompat.f1057 = iconCompat.f1059;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1484 abstractC1484) {
        abstractC1484.getClass();
        iconCompat.f1064 = iconCompat.f1056.name();
        switch (iconCompat.f1060) {
            case -1:
            case 1:
            case 5:
                iconCompat.f1063 = (Parcelable) iconCompat.f1057;
                break;
            case 2:
                iconCompat.f1059 = ((String) iconCompat.f1057).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1059 = (byte[]) iconCompat.f1057;
                break;
            case 4:
            case 6:
                iconCompat.f1059 = iconCompat.f1057.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1060;
        if (-1 != i) {
            abstractC1484.mo3219(1);
            abstractC1484.mo3222(i);
        }
        byte[] bArr = iconCompat.f1059;
        if (bArr != null) {
            abstractC1484.mo3219(2);
            abstractC1484.mo3224(bArr);
        }
        Parcelable parcelable = iconCompat.f1063;
        if (parcelable != null) {
            abstractC1484.mo3219(3);
            abstractC1484.mo3223(parcelable);
        }
        int i2 = iconCompat.f1061;
        if (i2 != 0) {
            abstractC1484.mo3219(4);
            abstractC1484.mo3222(i2);
        }
        int i3 = iconCompat.f1062;
        if (i3 != 0) {
            abstractC1484.mo3219(5);
            abstractC1484.mo3222(i3);
        }
        ColorStateList colorStateList = iconCompat.f1058;
        if (colorStateList != null) {
            abstractC1484.mo3219(6);
            abstractC1484.mo3223(colorStateList);
        }
        String str = iconCompat.f1064;
        if (str != null) {
            abstractC1484.mo3219(7);
            abstractC1484.mo3226(str);
        }
    }
}
