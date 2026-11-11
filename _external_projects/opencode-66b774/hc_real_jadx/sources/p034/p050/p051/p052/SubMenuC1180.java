package p034.p050.p051.p052;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p034.p050.p051.p052.C1164;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class SubMenuC1180 extends C1164 implements SubMenu {

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public C1164 f5842;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public C1197 f5843;

    public SubMenuC1180(Context context, C1164 c1164, C1197 c1197) {
        super(context);
        this.f5842 = c1164;
        this.f5843 = c1197;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f5843;
    }

    @Override // p034.p050.p051.p052.C1164, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f5842.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        m2632(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        m2632(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m2632(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f5843.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f5843.setIcon(drawable);
        return this;
    }

    @Override // p034.p050.p051.p052.C1164, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f5842.setQwertyMode(z);
    }

    @Override // p034.p050.p051.p052.C1164
    /* renamed from: いいにぽつ */
    public String mo2613() {
        C1197 c1197 = this.f5843;
        int i = c1197 != null ? c1197.f5922 : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // p034.p050.p051.p052.C1164
    /* renamed from: ぇ〳〲〺すっ */
    public void mo2614(C1164.InterfaceC1166 interfaceC1166) {
        this.f5842.mo2614(interfaceC1166);
    }

    @Override // p034.p050.p051.p052.C1164
    /* renamed from: おぐぴう〸ず */
    public boolean mo2618() {
        return this.f5842.mo2618();
    }

    @Override // p034.p050.p051.p052.C1164
    /* renamed from: づざかべべ */
    public boolean mo2624(C1164 c1164, MenuItem menuItem) {
        return super.mo2624(c1164, menuItem) || this.f5842.mo2624(c1164, menuItem);
    }

    @Override // p034.p050.p051.p052.C1164
    /* renamed from: なぎぱいぢぎ */
    public boolean mo2628(C1197 c1197) {
        return this.f5842.mo2628(c1197);
    }

    @Override // p034.p050.p051.p052.C1164
    /* renamed from: のぷのちつ */
    public boolean mo2630() {
        return this.f5842.mo2630();
    }

    @Override // p034.p050.p051.p052.C1164
    /* renamed from: びぐびあび */
    public boolean mo2633(C1197 c1197) {
        return this.f5842.mo2633(c1197);
    }

    @Override // p034.p050.p051.p052.C1164
    /* renamed from: へぬ〴づぞ */
    public boolean mo2635() {
        return this.f5842.mo2635();
    }

    @Override // p034.p050.p051.p052.C1164
    /* renamed from: ぺふねづ〺 */
    public C1164 mo2637() {
        return this.f5842.mo2637();
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m2632(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m2632(0, charSequence, 0, null, null);
        return this;
    }
}
