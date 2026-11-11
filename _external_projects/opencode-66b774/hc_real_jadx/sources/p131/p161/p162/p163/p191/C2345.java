package p131.p161.p162.p163.p191;

import android.view.View;
import p034.p035.p045.C1096;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.へぬ〴づぞ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2345 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f9636;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f9637;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final View f9638;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f9639;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f9640;

    public C2345(View view) {
        this.f9638 = view;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m4499(int i) {
        if (this.f9640 == i) {
            return false;
        }
        this.f9640 = i;
        m4500();
        return true;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4500() {
        View view = this.f9638;
        C1096.m2515(view, this.f9640 - (view.getTop() - this.f9636));
        View view2 = this.f9638;
        C1096.m2483(view2, this.f9639 - (view2.getLeft() - this.f9637));
    }
}
