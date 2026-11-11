package p034.p050.p051;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;
import p034.p050.p051.AbstractC1154;
import p034.p050.p051.p052.C1164;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1161 extends AbstractC1154 implements C1164.InterfaceC1166 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f5746;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public WeakReference<View> f5747;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ActionBarContextView f5748;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public AbstractC1154.InterfaceC1155 f5749;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Context f5750;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C1164 f5751;

    public C1161(Context context, ActionBarContextView actionBarContextView, AbstractC1154.InterfaceC1155 interfaceC1155, boolean z) {
        this.f5750 = context;
        this.f5748 = actionBarContextView;
        this.f5749 = interfaceC1155;
        C1164 c1164 = new C1164(actionBarContextView.getContext());
        c1164.f5779 = 1;
        this.f5751 = c1164;
        c1164.f5778 = this;
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: 〳ぜぞぜべっ */
    public CharSequence mo2583() {
        return this.f5748.getTitle();
    }

    @Override // p034.p050.p051.p052.C1164.InterfaceC1166
    /* renamed from: 〺つふすそ */
    public void mo141(C1164 c1164) {
        mo2595();
        ActionMenuPresenter actionMenuPresenter = this.f5748.f6031;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m120();
        }
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: ぁごぐすすぃ */
    public CharSequence mo2584() {
        return this.f5748.getSubtitle();
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: いいにぽつ */
    public boolean mo2585() {
        return this.f5748.f230;
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: ぇぬぎばつ */
    public void mo2586(boolean z) {
        this.f5698 = z;
        this.f5748.setTitleOptional(z);
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: おぐぴう〸ず */
    public void mo2587(CharSequence charSequence) {
        this.f5748.setTitle(charSequence);
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: くし〴〺ぅ */
    public void mo2588() {
        if (this.f5746) {
            return;
        }
        this.f5746 = true;
        this.f5748.sendAccessibilityEvent(32);
        this.f5749.mo2597(this);
    }

    @Override // p034.p050.p051.p052.C1164.InterfaceC1166
    /* renamed from: げつ〴ぬぐ */
    public boolean mo142(C1164 c1164, MenuItem menuItem) {
        return this.f5749.mo2598(this, menuItem);
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: づざかべべ */
    public Menu mo2589() {
        return this.f5751;
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: てぜきぽく */
    public void mo2590(int i) {
        this.f5748.setSubtitle(this.f5750.getString(i));
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: なぎぱいぢぎ */
    public MenuInflater mo2591() {
        return new C1158(this.f5748.getContext());
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: のぷのちつ */
    public void mo2592(CharSequence charSequence) {
        this.f5748.setSubtitle(charSequence);
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: びぐびあび */
    public View mo2593() {
        WeakReference<View> weakReference = this.f5747;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: へぬ〴づぞ */
    public void mo2594(int i) {
        this.f5748.setTitle(this.f5750.getString(i));
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: ぺぁあねじ */
    public void mo2595() {
        this.f5749.mo2599(this, this.f5751);
    }

    @Override // p034.p050.p051.AbstractC1154
    /* renamed from: ぺふねづ〺 */
    public void mo2596(View view) {
        this.f5748.setCustomView(view);
        this.f5747 = view != null ? new WeakReference<>(view) : null;
    }
}
