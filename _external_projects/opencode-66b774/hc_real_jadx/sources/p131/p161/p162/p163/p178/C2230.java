package p131.p161.p162.p163.p178;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.InterfaceC2169;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ごづごきえ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2230 {

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static final boolean f9245;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f9246;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2180 f9247;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f9248;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public ColorStateList f9249;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f9251;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f9253;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final MaterialButton f9254;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public LayerDrawable f9255;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f9256;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public ColorStateList f9257;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f9258;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public Drawable f9259;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f9260;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public PorterDuff.Mode f9262;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public ColorStateList f9263;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f9261 = false;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean f9252 = false;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f9250 = false;

    static {
        f9245 = Build.VERSION.SDK_INT >= 21;
    }

    public C2230(MaterialButton materialButton, C2180 c2180) {
        this.f9254 = materialButton;
        this.f9247 = c2180;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2163 m4323() {
        return m4324(false);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C2163 m4324(boolean z) {
        LayerDrawable layerDrawable = this.f9255;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C2163) (f9245 ? (LayerDrawable) ((InsetDrawable) this.f9255.getDrawable(0)).getDrawable() : this.f9255).getDrawable(!z ? 1 : 0);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public InterfaceC2169 m4325() {
        LayerDrawable layerDrawable = this.f9255;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (InterfaceC2169) (this.f9255.getNumberOfLayers() > 2 ? this.f9255.getDrawable(2) : this.f9255.getDrawable(1));
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m4326(C2180 c2180) {
        this.f9247 = c2180;
        if (m4323() != null) {
            C2163 m4323 = m4323();
            m4323.f9045.f9074 = c2180;
            m4323.invalidateSelf();
        }
        if (m4328() != null) {
            C2163 m4328 = m4328();
            m4328.f9045.f9074 = c2180;
            m4328.invalidateSelf();
        }
        if (m4325() != null) {
            m4325().setShapeAppearanceModel(c2180);
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m4327() {
        C2163 m4323 = m4323();
        C2163 m4328 = m4328();
        if (m4323 != null) {
            m4323.m4264(this.f9246, this.f9263);
            if (m4328 != null) {
                m4328.m4246(this.f9246, this.f9261 ? C1687.m3728(this.f9254, C2111.colorSurface) : 0);
            }
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2163 m4328() {
        return m4324(true);
    }
}
