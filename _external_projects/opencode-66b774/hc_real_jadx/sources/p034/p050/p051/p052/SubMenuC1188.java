package p034.p050.p051.p052;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p034.p035.p036.p037.InterfaceSubMenuC1001;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class SubMenuC1188 extends MenuC1177 implements SubMenu {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final InterfaceSubMenuC1001 f5872;

    public SubMenuC1188(Context context, InterfaceSubMenuC1001 interfaceSubMenuC1001) {
        super(context, interfaceSubMenuC1001);
        this.f5872 = interfaceSubMenuC1001;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f5872.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m2646(this.f5872.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f5872.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f5872.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f5872.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f5872.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f5872.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f5872.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f5872.setIcon(drawable);
        return this;
    }
}
