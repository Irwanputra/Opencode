package p131.p161.p162.p163.p167;

import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぅみぱぎぎ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2147 extends AbstractC2150 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2150 f9000;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C2145 f9001;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ TextPaint f9002;

    public C2147(C2145 c2145, TextPaint textPaint, AbstractC2150 abstractC2150) {
        this.f9001 = c2145;
        this.f9002 = textPaint;
        this.f9000 = abstractC2150;
    }

    @Override // p131.p161.p162.p163.p167.AbstractC2150
    /* renamed from: 〺つふすそ */
    public void mo1390(Typeface typeface, boolean z) {
        this.f9001.m4233(this.f9002, typeface);
        this.f9000.mo1390(typeface, z);
    }

    @Override // p131.p161.p162.p163.p167.AbstractC2150
    /* renamed from: げつ〴ぬぐ */
    public void mo1391(int i) {
        this.f9000.mo1391(i);
    }
}
