package p034.p035.p045;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.InterfaceC1186;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1069 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InterfaceC1070 f5529;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public InterfaceC1071 f5530;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC1070 {
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC1071 {
    }

    public AbstractC1069(Context context) {
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void mo2408(InterfaceC1070 interfaceC1070) {
        if (this.f5529 != null) {
            getClass().getSimpleName();
        }
        this.f5529 = interfaceC1070;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean mo2409() {
        return true;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean mo2410() {
        return false;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public abstract View mo2411();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean mo2412() {
        return false;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean mo2413() {
        return false;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void mo2414(SubMenu subMenu) {
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public View mo2415(MenuItem menuItem) {
        return mo2411();
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m2416(boolean z) {
        InterfaceC1071 interfaceC1071 = this.f5530;
        if (interfaceC1071 != null) {
            ActionMenuPresenter actionMenuPresenter = (ActionMenuPresenter) interfaceC1071;
            if (z) {
                InterfaceC1186.InterfaceC1187 interfaceC1187 = actionMenuPresenter.f5761;
                if (interfaceC1187 != null) {
                    interfaceC1187.mo131(actionMenuPresenter.f5762);
                    return;
                }
                return;
            }
            C1164 c1164 = actionMenuPresenter.f5762;
            if (c1164 != null) {
                c1164.m2619(false);
            }
        }
    }
}
