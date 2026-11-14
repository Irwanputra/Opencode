package dev.epro.r0;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K4066258037408482587 {
    public static final Z14316276734425062790 a;
    public static final B1412794554478658227 b;
    public static Paint c;

    static {
        Trace.beginSection(U8836654130139556418.B("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new V4328009209000729594();
        } else if (i >= 29) {
            a = new A6444062906512207770();
        } else if (i >= 28) {
            a = new H17609567404463830776();
        } else if (i >= 26) {
            a = new R12595700116524328013();
        } else if (N6640186814174196799.e != null) {
            a = new N6640186814174196799();
        } else {
            a = new L10323767535443928457();
        }
        b = new B1412794554478658227(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        r2 = r10.build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r14, dev.epro.r0.O2957401531134925886 r15, android.content.res.Resources r16, int r17, java.lang.String r18, int r19, int r20, dev.epro.r0.I15162792415829416729 r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K4066258037408482587.a(android.content.Context, dev.epro.r0.O2957401531134925886, android.content.res.Resources, int, java.lang.String, int, int, dev.epro.r0.I15162792415829416729, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
