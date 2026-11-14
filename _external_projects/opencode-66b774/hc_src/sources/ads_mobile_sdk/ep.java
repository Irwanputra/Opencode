package ads_mobile_sdk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import dev.epro.r0.M16184408391440927034;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.O17574792317020433029;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ep {
    public final O12043144740933444288 a;
    public final jr0 b;
    public final ci3 c;

    public ep(O12043144740933444288 o12043144740933444288, jr0 jr0Var, ci3 ci3Var) {
        o12043144740933444288.getClass();
        jr0Var.getClass();
        ci3Var.getClass();
        this.a = o12043144740933444288;
        this.b = jr0Var;
        this.c = ci3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ep r7, java.lang.String r8, double r9, boolean r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ep.a(ads_mobile_sdk.ep, java.lang.String, double, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final M16184408391440927034 a(byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (160.0d * d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        options.inJustDecodeBounds = false;
        int i = options.outWidth * options.outHeight;
        if (i > 0) {
            jr0 jr0Var = this.b;
            options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Number) jr0Var.a("gads:nativeads:image:sample:pixels", O17574792317020433029.c(jr0Var, "gads:nativeads:image:sample:pixels", 1048576), ao.a$18)).intValue())) / 2);
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray == null) {
            return new tu0("Cannot decode image", 1);
        }
        return new xu0(decodeByteArray);
    }
}
