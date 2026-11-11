package p131.p161.p162.p163.p185;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2253 {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static boolean f9374;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static Object f9375;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static Constructor<StaticLayout> f9376;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f9377;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final TextPaint f9378;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f9380;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public CharSequence f9381;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f9384;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Layout.Alignment f9382 = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f9383 = Integer.MAX_VALUE;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f9379 = true;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public TextUtils.TruncateAt f9385 = null;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2254 extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C2254(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = p131.p155.p156.p157.C2098.m4207(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p131.p161.p162.p163.p185.C2253.C2254.<init>(java.lang.Throwable):void");
        }
    }

    public C2253(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f9381 = charSequence;
        this.f9378 = textPaint;
        this.f9380 = i;
        this.f9384 = charSequence.length();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public StaticLayout m4403() {
        Class<?> cls;
        if (this.f9381 == null) {
            this.f9381 = "";
        }
        int max = Math.max(0, this.f9380);
        CharSequence charSequence = this.f9381;
        if (this.f9383 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f9378, max, this.f9385);
        }
        int min = Math.min(charSequence.length(), this.f9384);
        this.f9384 = min;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (this.f9377) {
                this.f9382 = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f9378, max);
            obtain.setAlignment(this.f9382);
            obtain.setIncludePad(this.f9379);
            obtain.setTextDirection(this.f9377 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f9385;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f9383);
            return obtain.build();
        }
        if (!f9374) {
            try {
                boolean z = this.f9377 && i >= 23;
                if (i >= 18) {
                    cls = TextDirectionHeuristic.class;
                    f9375 = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = C2253.class.getClassLoader();
                    String str = this.f9377 ? "RTL" : "LTR";
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    f9375 = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
                f9376 = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f9374 = true;
            } catch (Exception e) {
                throw new C2254(e);
            }
        }
        try {
            Constructor<StaticLayout> constructor = f9376;
            constructor.getClass();
            Object obj = f9375;
            obj.getClass();
            return constructor.newInstance(charSequence, 0, Integer.valueOf(this.f9384), this.f9378, Integer.valueOf(max), this.f9382, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f9379), null, Integer.valueOf(max), Integer.valueOf(this.f9383));
        } catch (Exception e2) {
            throw new C2254(e2);
        }
    }
}
