package dev.epro.r0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I18150855591218230259 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public I15162792415829416729 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final O9358055284024288946[] n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f289o = new Rect();
    public I1581330382723795749 p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x031d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public I18150855591218230259(java.lang.CharSequence r23, float r24, android.text.TextPaint r25, int r26, android.text.TextUtils.TruncateAt r27, int r28, boolean r29, int r30, int r31, int r32, int r33, int r34, int r35, dev.epro.r0.M3219114150495442389 r36) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I18150855591218230259.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, dev.epro.r0.M3219114150495442389):void");
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.m;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final I1581330382723795749 c() {
        I1581330382723795749 i1581330382723795749 = this.p;
        if (i1581330382723795749 != null) {
            return i1581330382723795749;
        }
        I1581330382723795749 i15813303827237957492 = new I1581330382723795749();
        i15813303827237957492.a = this.f;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int V = M8927913404651150384.V(((Layout) i15813303827237957492.a).getText(), '\n', i, 4);
            i = V < 0 ? ((Layout) i15813303827237957492.a).getText().length() : V + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) i15813303827237957492.a).getText().length());
        i15813303827237957492.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        i15813303827237957492.c = arrayList2;
        i15813303827237957492.d = new boolean[((ArrayList) i15813303827237957492.b).size()];
        ((ArrayList) i15813303827237957492.b).size();
        this.p = i15813303827237957492;
        return i15813303827237957492;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i) {
        ThreadLocal threadLocal = Y3398285834625198673.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int f(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float g(int i) {
        return d(i) - h(i);
    }

    public final float h(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float i(int i, boolean z) {
        return b(f(i)) + c().i(i, true, z);
    }

    public final float j(int i, boolean z) {
        return b(f(i)) + c().i(i, false, z);
    }

    public final I15162792415829416729 k() {
        I15162792415829416729 i15162792415829416729 = this.e;
        if (i15162792415829416729 != null) {
            return i15162792415829416729;
        }
        Layout layout = this.f;
        I15162792415829416729 i151627924158294167292 = new I15162792415829416729(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = i151627924158294167292;
        return i151627924158294167292;
    }
}
