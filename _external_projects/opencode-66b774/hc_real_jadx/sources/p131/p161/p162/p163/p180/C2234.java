package p131.p161.p162.p163.p180;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1197;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ざとぅぼこ〺.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2234 extends C1164 {
    public C2234(Context context) {
        super(context);
    }

    @Override // p034.p050.p051.p052.C1164, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }

    @Override // p034.p050.p051.p052.C1164
    /* renamed from: げつ〴ぬぐ */
    public MenuItem mo2620(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 > 5) {
            throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
        }
        m2627();
        MenuItem mo2620 = super.mo2620(i, i2, i3, charSequence);
        ((C1197) mo2620).m2672(true);
        m2629();
        return mo2620;
    }
}
