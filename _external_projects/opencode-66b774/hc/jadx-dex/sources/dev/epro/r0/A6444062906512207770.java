package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class A6444062906512207770 extends dev.epro.r0.Z14316276734425062790 {
    public static android.graphics.fonts.Font w(android.graphics.fonts.FontFamily fontFamily, int i) {
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        android.graphics.fonts.Font font = fontFamily.getFont(0);
        int iZ = z(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            android.graphics.fonts.Font font2 = fontFamily.getFont(i2);
            int iZ2 = z(fontStyle, font2.getStyle());
            if (iZ2 < iZ) {
                font = font2;
                iZ = iZ2;
            }
        }
        return font;
    }

    public static int z(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final android.graphics.Typeface h(android.content.Context context, dev.epro.r0.L933758655888641216 l933758655888641216, android.content.res.Resources resources, int i) {
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (dev.epro.r0.T13158771825442419349 t13158771825442419349 : l933758655888641216.a) {
                try {
                    android.graphics.fonts.Font fontBuild = new android.graphics.fonts.Font.Builder(resources, t13158771825442419349.f).setWeight(t13158771825442419349.b).setSlant(t13158771825442419349.c ? 1 : 0).setTtcIndex(t13158771825442419349.e).setFontVariationSettings(t13158771825442419349.d).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily fontFamilyBuild = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(w(fontFamilyBuild, i).getStyle()).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    public final android.graphics.Typeface i(android.content.Context context, dev.epro.r0.J18236984568855953541[] j18236984568855953541Arr, int i) {
        try {
            android.graphics.fonts.FontFamily fontFamilyX = x(j18236984568855953541Arr, context.getContentResolver());
            if (fontFamilyX == null) {
                return null;
            }
            return new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyX).setStyle(w(fontFamilyX, i).getStyle()).build();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final android.graphics.Typeface j(android.content.Context context, java.util.List list, int i) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            android.graphics.fonts.FontFamily fontFamilyX = x((dev.epro.r0.J18236984568855953541[]) list.get(0), contentResolver);
            if (fontFamilyX == null) {
                return null;
            }
            android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyX);
            for (int i2 = 1; i2 < list.size(); i2++) {
                android.graphics.fonts.FontFamily fontFamilyX2 = x((dev.epro.r0.J18236984568855953541[]) list.get(i2), contentResolver);
                if (fontFamilyX2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyX2);
                }
            }
            return customFallbackBuilder.setStyle(w(fontFamilyX, i).getStyle()).build();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final android.graphics.Typeface k(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        try {
            android.graphics.fonts.Font fontBuild = new android.graphics.fonts.Font.Builder(resources, i).build();
            return new android.graphics.Typeface.CustomFallbackBuilder(new android.graphics.fonts.FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final android.graphics.fonts.FontFamily x(dev.epro.r0.J18236984568855953541[] j18236984568855953541Arr, android.content.ContentResolver contentResolver) {
        android.graphics.fonts.Font fontBuild;
        java.lang.String str;
        android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        android.graphics.fonts.FontFamily.Builder builder = null;
        for (dev.epro.r0.J18236984568855953541 j18236984568855953541 : j18236984568855953541Arr) {
            if (java.util.Objects.equals(j18236984568855953541.a.getScheme(), "systemfont")) {
                fontBuild = y(j18236984568855953541);
            } else {
                try {
                    android.net.Uri uri = j18236984568855953541.a;
                    str = j18236984568855953541.e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (java.io.IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        android.graphics.fonts.Font.Builder ttcIndex = new android.graphics.fonts.Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(j18236984568855953541.c).setSlant(j18236984568855953541.d ? 1 : 0).setTtcIndex(j18236984568855953541.b);
                        if (!android.text.TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new android.graphics.fonts.FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public android.graphics.fonts.Font y(dev.epro.r0.J18236984568855953541 j18236984568855953541) {
        throw new java.lang.UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
