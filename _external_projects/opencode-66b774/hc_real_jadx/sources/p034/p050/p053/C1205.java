package p034.p050.p053;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import p034.p050.p051.p052.InterfaceC1173;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1205 extends AbstractViewOnTouchListenerC1249 {

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final /* synthetic */ AppCompatSpinner f5958;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final /* synthetic */ AppCompatSpinner.C0073 f5959;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1205(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.C0073 c0073) {
        super(view);
        this.f5958 = appCompatSpinner;
        this.f5959 = c0073;
    }

    @Override // p034.p050.p053.AbstractViewOnTouchListenerC1249
    /* renamed from: 〺つふすそ */
    public InterfaceC1173 mo89() {
        return this.f5959;
    }

    @Override // p034.p050.p053.AbstractViewOnTouchListenerC1249
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: くし〴〺ぅ */
    public boolean mo90() {
        if (this.f5958.getInternalPopup().mo152()) {
            return true;
        }
        this.f5958.m149();
        return true;
    }
}
