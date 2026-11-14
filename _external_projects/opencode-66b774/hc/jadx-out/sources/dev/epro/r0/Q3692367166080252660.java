package dev.epro.r0;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q3692367166080252660 {
    public final TextView a;
    public final R9757436368382764378 b;
    public Typeface c;
    public Typeface d;
    public String e;

    public Q3692367166080252660(TextView textView, R9757436368382764378 r9757436368382764378) {
        this.a = textView;
        this.b = r9757436368382764378;
    }

    public final boolean a(String str) {
        int i;
        Typeface typeface = this.c;
        TextView textView = this.a;
        TextPaint paint = textView.getPaint();
        if (this.d != paint.getTypeface()) {
            typeface = paint.getTypeface();
        }
        if (Build.VERSION.SDK_INT < 31 || (i = textView.getContext().getResources().getConfiguration().fontWeightAdjustment) == Integer.MAX_VALUE) {
            i = 0;
        }
        if (i == Integer.MAX_VALUE) {
            i = 0;
        }
        Typeface typefaceA = L996168756143250597.a(typeface, str, i);
        if (typefaceA == null) {
            return false;
        }
        this.d = typefaceA;
        this.b.accept(typefaceA);
        this.e = str;
        return true;
    }
}
