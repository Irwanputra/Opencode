package dev.epro.r0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class A6444062906512207770 extends Z14316276734425062790 {
    public static Font w(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iZ = z(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iZ2 = z(fontStyle, font2.getStyle());
            if (iZ2 < iZ) {
                font = font2;
                iZ = iZ2;
            }
        }
        return font;
    }

    public static int z(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // dev.epro.r0.Z14316276734425062790
    public final Typeface h(Context context, L933758655888641216 l933758655888641216, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (T13158771825442419349 t13158771825442419349 : l933758655888641216.a) {
                try {
                    Font fontBuild = new Font.Builder(resources, t13158771825442419349.f).setWeight(t13158771825442419349.b).setSlant(t13158771825442419349.c ? 1 : 0).setTtcIndex(t13158771825442419349.e).setFontVariationSettings(t13158771825442419349.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(w(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // dev.epro.r0.Z14316276734425062790
    public final Typeface i(Context context, J18236984568855953541[] j18236984568855953541Arr, int i) {
        try {
            FontFamily fontFamilyX = x(j18236984568855953541Arr, context.getContentResolver());
            if (fontFamilyX == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyX).setStyle(w(fontFamilyX, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // dev.epro.r0.Z14316276734425062790
    public final Typeface j(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyX = x((J18236984568855953541[]) list.get(0), contentResolver);
            if (fontFamilyX == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyX);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyX2 = x((J18236984568855953541[]) list.get(i2), contentResolver);
                if (fontFamilyX2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyX2);
                }
            }
            return customFallbackBuilder.setStyle(w(fontFamilyX, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // dev.epro.r0.Z14316276734425062790
    public final Typeface k(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final FontFamily x(J18236984568855953541[] j18236984568855953541Arr, ContentResolver contentResolver) {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (J18236984568855953541 j18236984568855953541 : j18236984568855953541Arr) {
            if (Objects.equals(j18236984568855953541.a.getScheme(), "systemfont")) {
                fontBuild = y(j18236984568855953541);
            } else {
                try {
                    Uri uri = j18236984568855953541.a;
                    str = j18236984568855953541.e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(j18236984568855953541.c).setSlant(j18236984568855953541.d ? 1 : 0).setTtcIndex(j18236984568855953541.b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
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

    public Font y(J18236984568855953541 j18236984568855953541) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
