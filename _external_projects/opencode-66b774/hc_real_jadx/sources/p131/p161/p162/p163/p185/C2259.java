package p131.p161.p162.p163.p185;

import android.content.Context;
import android.view.SubMenu;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1197;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2259 extends C1164 {
    public C2259(Context context) {
        super(context);
    }

    @Override // p034.p050.p051.p052.C1164, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1197 c1197 = (C1197) mo2620(i, i2, i3, charSequence);
        C2264 c2264 = new C2264(this.f5774, this, c1197);
        c1197.f5920 = c2264;
        c2264.setHeaderTitle(c1197.f5926);
        return c2264;
    }
}
