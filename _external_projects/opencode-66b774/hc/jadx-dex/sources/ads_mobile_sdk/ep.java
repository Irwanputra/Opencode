package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ep {
    public final dev.epro.r0.O12043144740933444288 a;
    public final ads_mobile_sdk.jr0 b;
    public final ads_mobile_sdk.ci3 c;

    public ep(dev.epro.r0.O12043144740933444288 o12043144740933444288, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.ci3 ci3Var) {
        o12043144740933444288.getClass();
        jr0Var.getClass();
        ci3Var.getClass();
        this.a = o12043144740933444288;
        this.b = jr0Var;
        this.c = ci3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ep r7, java.lang.String r8, double r9, boolean r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ep.a(ads_mobile_sdk.ep, java.lang.String, double, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final dev.epro.r0.M16184408391440927034 a(byte[] bArr, double d, boolean z) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inDensity = (int) (160.0d * d);
        if (!z) {
            options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        }
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        options.inJustDecodeBounds = false;
        int i = options.outWidth * options.outHeight;
        if (i > 0) {
            ads_mobile_sdk.jr0 jr0Var = this.b;
            options.inSampleSize = 1 << ((33 - java.lang.Integer.numberOfLeadingZeros((i - 1) / ((java.lang.Number) jr0Var.a("gads:nativeads:image:sample:pixels", dev.epro.r0.O17574792317020433029.c(jr0Var, "gads:nativeads:image:sample:pixels", 1048576), ads_mobile_sdk.ao.a$18)).intValue())) / 2);
        }
        android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (bitmapDecodeByteArray == null) {
            return new ads_mobile_sdk.tu0("Cannot decode image", 1);
        }
        return new ads_mobile_sdk.xu0(bitmapDecodeByteArray);
    }
}
