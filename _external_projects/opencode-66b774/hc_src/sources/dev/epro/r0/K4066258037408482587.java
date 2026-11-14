package dev.epro.r0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, O2957401531134925886 o2957401531134925886, Resources resources, int i, String str, int i2, int i3, I15162792415829416729 i15162792415829416729, boolean z) {
        Typeface h;
        Typeface build;
        FontFamily build2;
        if (o2957401531134925886 instanceof Z16564692815490596738) {
            Z16564692815490596738 z16564692815490596738 = (Z16564692815490596738) o2957401531134925886;
            String str2 = z16564692815490596738.d;
            Typeface typeface = null;
            byte b2 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = z16564692815490596738.a;
                if (arrayList.size() == 1) {
                    build = c(((O5645052741531709506) arrayList.get(0)).e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= arrayList.size()) {
                                        break;
                                    }
                                    O5645052741531709506 o5645052741531709506 = (O5645052741531709506) arrayList.get(i5);
                                    if (i5 == arrayList.size() - 1 && TextUtils.isEmpty(o5645052741531709506.f)) {
                                        customFallbackBuilder.setSystemFallback(o5645052741531709506.e);
                                        break;
                                    }
                                    String str3 = o5645052741531709506.e;
                                    String str4 = o5645052741531709506.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build2 = new FontFamily.Builder(d).build();
                                    } else {
                                        try {
                                            build2 = new FontFamily.Builder(R10617406068291706632.h(d).setFontVariationSettings(str4).build()).build();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build2);
                                    }
                                    i5++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((O5645052741531709506) arrayList.get(i4)).e) == null) {
                                    break;
                                }
                                i4++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (i15162792415829416729 != null) {
                    new Handler(Looper.getMainLooper()).post(new Q9622116641457785369(i15162792415829416729, build, (byte) 13));
                }
                b.d(b(resources, i, str, i2, i3), build);
                return build;
            }
            Object[] objArr3 = !z ? i15162792415829416729 != null : z16564692815490596738.c != 0;
            int i6 = z ? z16564692815490596738.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            M9197813449740923653 m9197813449740923653 = new M9197813449740923653((byte) 24, z2);
            m9197813449740923653.b = i15162792415829416729;
            ArrayList arrayList2 = z16564692815490596738.a;
            Q9579657892041446906 q9579657892041446906 = new Q9579657892041446906(handler, (byte) 0);
            W8455343525638953052 w8455343525638953052 = new W8455343525638953052(m9197813449740923653, q9579657892041446906, objArr2 == true ? 1 : 0, (byte) 12);
            byte b3 = 5;
            if (objArr3 != true) {
                String a2 = T1225794268786662319.a(i3, arrayList2);
                Typeface typeface2 = (Typeface) T1225794268786662319.a.c(a2);
                if (typeface2 != null) {
                    q9579657892041446906.execute(new I3863025946240164840(m9197813449740923653, typeface2, b3));
                    typeface = typeface2;
                } else {
                    S9315175385921259790 s9315175385921259790 = new S9315175385921259790(w8455343525638953052, objArr == true ? 1 : 0);
                    synchronized (T1225794268786662319.c) {
                        try {
                            W929662112881511578 w929662112881511578 = T1225794268786662319.d;
                            ArrayList arrayList3 = (ArrayList) w929662112881511578.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(s9315175385921259790);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(s9315175385921259790);
                                w929662112881511578.put(a2, arrayList4);
                                Q17938270031678740860 q17938270031678740860 = new Q17938270031678740860(a2, context, arrayList2, i3, (byte) 1);
                                ThreadPoolExecutor threadPoolExecutor = T1225794268786662319.b;
                                S9315175385921259790 s93151753859212597902 = new S9315175385921259790(a2, b2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                F16393152783805540385 f16393152783805540385 = new F16393152783805540385();
                                f16393152783805540385.b = q17938270031678740860;
                                f16393152783805540385.c = s93151753859212597902;
                                f16393152783805540385.d = handler2;
                                threadPoolExecutor.execute(f16393152783805540385);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    S10973172697741180971.j("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                O5645052741531709506 o56450527415317095062 = (O5645052741531709506) arrayList2.get(0);
                B1412794554478658227 b1412794554478658227 = T1225794268786662319.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{o56450527415317095062}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a3 = T1225794268786662319.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) T1225794268786662319.a.c(a3);
                if (typeface3 != null) {
                    q9579657892041446906.execute(new I3863025946240164840(m9197813449740923653, typeface3, b3));
                    typeface = typeface3;
                } else if (i6 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{o56450527415317095062}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    T9198164096090695723 b4 = T1225794268786662319.b(a3, context, Collections.unmodifiableList(arrayList6), i3);
                    w8455343525638953052.K(b4);
                    typeface = b4.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    T9198164096090695723 t9198164096090695723 = (T9198164096090695723) T1225794268786662319.b.submit(new Q17938270031678740860(a3, context, o56450527415317095062, i3, (byte) 0)).get(i6, TimeUnit.MILLISECONDS);
                                    w8455343525638953052.K(t9198164096090695723);
                                    typeface = t9198164096090695723.a;
                                } catch (ExecutionException e) {
                                    throw new RuntimeException(e);
                                }
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e2) {
                            throw e2;
                        }
                    } catch (InterruptedException unused3) {
                        ((Q9579657892041446906) w8455343525638953052.c).execute(new A8962658062045365505((M9197813449740923653) w8455343525638953052.b, -3));
                    }
                }
            }
            h = typeface;
        } else {
            h = a.h(context, (L933758655888641216) o2957401531134925886, resources, i3);
            if (i15162792415829416729 != null) {
                if (h != null) {
                    new Handler(Looper.getMainLooper()).post(new Q9622116641457785369(i15162792415829416729, h, (byte) 13));
                } else {
                    i15162792415829416729.a(-3);
                }
            }
        }
        if (h != null) {
            b.d(b(resources, i, str, i2, i3), h);
        }
        return h;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
