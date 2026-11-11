package p034.p096.p097;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.CardView;

/* renamed from: づざかべべ.びぐびあび.なぎぱいぢぎ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1748 implements InterfaceC1755 {
    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float mo3783(InterfaceC1757 interfaceC1757) {
        return m3787(interfaceC1757).f7962;
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ColorStateList mo3784(InterfaceC1757 interfaceC1757) {
        return m3787(interfaceC1757).f7957;
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void mo3785() {
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float mo3786(InterfaceC1757 interfaceC1757) {
        return m3787(interfaceC1757).f7962 * 2.0f;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final C1756 m3787(InterfaceC1757 interfaceC1757) {
        return (C1756) ((CardView.C0111) interfaceC1757).f664;
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void mo3788(InterfaceC1757 interfaceC1757, float f) {
        C1756 m3787 = m3787(interfaceC1757);
        CardView.C0111 c0111 = (CardView.C0111) interfaceC1757;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean m250 = c0111.m250();
        if (f != m3787.f7963 || m3787.f7964 != useCompatPadding || m3787.f7959 != m250) {
            m3787.f7963 = f;
            m3787.f7964 = useCompatPadding;
            m3787.f7959 = m250;
            m3787.m3806(null);
            m3787.invalidateSelf();
        }
        mo3793(interfaceC1757);
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo3789(InterfaceC1757 interfaceC1757, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1756 c1756 = new C1756(colorStateList, f);
        CardView.C0111 c0111 = (CardView.C0111) interfaceC1757;
        c0111.f664 = c1756;
        CardView.this.setBackgroundDrawable(c1756);
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        mo3788(interfaceC1757, f3);
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float mo3790(InterfaceC1757 interfaceC1757) {
        return m3787(interfaceC1757).f7963;
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float mo3791(InterfaceC1757 interfaceC1757) {
        return CardView.this.getElevation();
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void mo3792(InterfaceC1757 interfaceC1757, float f) {
        CardView.this.setElevation(f);
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void mo3793(InterfaceC1757 interfaceC1757) {
        CardView.C0111 c0111 = (CardView.C0111) interfaceC1757;
        if (!CardView.this.getUseCompatPadding()) {
            c0111.m249(0, 0, 0, 0);
            return;
        }
        float f = m3787(interfaceC1757).f7963;
        float f2 = m3787(interfaceC1757).f7962;
        int ceil = (int) Math.ceil(C1749.m3800(f, f2, c0111.m250()));
        int ceil2 = (int) Math.ceil(C1749.m3799(f, f2, c0111.m250()));
        c0111.m249(ceil, ceil2, ceil, ceil2);
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void mo3794(InterfaceC1757 interfaceC1757) {
        mo3788(interfaceC1757, m3787(interfaceC1757).f7963);
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void mo3795(InterfaceC1757 interfaceC1757, float f) {
        C1756 m3787 = m3787(interfaceC1757);
        if (f == m3787.f7962) {
            return;
        }
        m3787.f7962 = f;
        m3787.m3806(null);
        m3787.invalidateSelf();
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void mo3796(InterfaceC1757 interfaceC1757, ColorStateList colorStateList) {
        C1756 m3787 = m3787(interfaceC1757);
        m3787.m3805(colorStateList);
        m3787.invalidateSelf();
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float mo3797(InterfaceC1757 interfaceC1757) {
        return m3787(interfaceC1757).f7962 * 2.0f;
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void mo3798(InterfaceC1757 interfaceC1757) {
        mo3788(interfaceC1757, m3787(interfaceC1757).f7963);
    }
}
