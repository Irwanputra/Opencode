package p034.p035.p038;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p034.p035.p040.C1027;
import p034.p035.p043.p044.C1062;
import p034.p035.p043.p044.C1066;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1020 extends C1007 {
    @Override // p034.p035.p038.C1007
    /* renamed from: 〺つふすそ */
    public Typeface mo2333(Context context, CancellationSignal cancellationSignal, C1027.C1029[] c1029Arr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        int length = c1029Arr.length;
        FontFamily.Builder builder = null;
        while (true) {
            int i3 = 1;
            if (i2 >= length) {
                if (builder == null) {
                    return null;
                }
                return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
            }
            C1027.C1029 c1029 = c1029Arr[i2];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(c1029.f5435, "r", cancellationSignal);
            } catch (IOException unused) {
                continue;
            }
            if (openFileDescriptor == null) {
                i2 = openFileDescriptor == null ? i2 + 1 : 0;
            } else {
                try {
                    Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(c1029.f5434);
                    if (!c1029.f5437) {
                        i3 = 0;
                    }
                    Font build = weight.setSlant(i3).setTtcIndex(c1029.f5433).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable unused2) {
                    }
                    throw th;
                }
            }
            openFileDescriptor.close();
        }
    }

    @Override // p034.p035.p038.C1007
    /* renamed from: くし〴〺ぅ */
    public Typeface mo2344(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p034.p035.p038.C1007
    /* renamed from: げつ〴ぬぐ */
    public Typeface mo2336(Context context, C1062 c1062, Resources resources, int i) {
        C1066[] c1066Arr = c1062.f5512;
        int length = c1066Arr.length;
        FontFamily.Builder builder = null;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= length) {
                break;
            }
            C1066 c1066 = c1066Arr[i2];
            try {
                Font.Builder weight = new Font.Builder(resources, c1066.f5525).setWeight(c1066.f5521);
                if (!c1066.f5522) {
                    i3 = 0;
                }
                Font build = weight.setSlant(i3).setTtcIndex(c1066.f5524).setFontVariationSettings(c1066.f5526).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i2++;
        }
        if (builder == null) {
            return null;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
    }

    @Override // p034.p035.p038.C1007
    /* renamed from: なぎぱいぢぎ */
    public C1027.C1029 mo2345(C1027.C1029[] c1029Arr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p034.p035.p038.C1007
    /* renamed from: びぐびあび */
    public Typeface mo2339(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }
}
