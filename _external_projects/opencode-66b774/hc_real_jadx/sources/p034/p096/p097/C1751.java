package p034.p096.p097;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.CardView;
import p034.p096.p097.C1749;

/* renamed from: づざかべべ.びぐびあび.なぎぱいぢぎ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1751 implements InterfaceC1755 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final RectF f7955 = new RectF();

    /* renamed from: づざかべべ.びぐびあび.なぎぱいぢぎ.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1752 implements C1749.InterfaceC1750 {
        public C1752() {
        }

        @Override // p034.p096.p097.C1749.InterfaceC1750
        /* renamed from: げつ〴ぬぐ */
        public void mo3803(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C1751.this.f7955.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(C1751.this.f7955, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C1751.this.f7955, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C1751.this.f7955, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C1751.this.f7955, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = (rectF.left + f3) - 1.0f;
                float f6 = rectF.top;
                canvas.drawRect(f5, f6, (rectF.right - f3) + 1.0f, f6 + f3, paint);
                float f7 = (rectF.left + f3) - 1.0f;
                float f8 = rectF.bottom;
                canvas.drawRect(f7, f8 - f3, (rectF.right - f3) + 1.0f, f8, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: 〳ぜぞぜべっ */
    public float mo3783(InterfaceC1757 interfaceC1757) {
        return m3804(interfaceC1757).f7949;
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: 〺つふすそ */
    public ColorStateList mo3784(InterfaceC1757 interfaceC1757) {
        return m3804(interfaceC1757).f7954;
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: ぁごぐすすぃ */
    public void mo3785() {
        C1749.f7938 = new C1752();
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: いいにぽつ */
    public float mo3786(InterfaceC1757 interfaceC1757) {
        C1749 m3804 = m3804(interfaceC1757);
        float f = m3804.f7939;
        return ((m3804.f7939 + m3804.f7946) * 2.0f) + (Math.max(f, (f / 2.0f) + m3804.f7949 + m3804.f7946) * 2.0f);
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final C1749 m3804(InterfaceC1757 interfaceC1757) {
        return (C1749) ((CardView.C0111) interfaceC1757).f664;
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: おぐぴう〸ず */
    public void mo3788(InterfaceC1757 interfaceC1757, float f) {
        C1749 m3804 = m3804(interfaceC1757);
        m3804.m3802(m3804.f7942, f);
        mo3793(interfaceC1757);
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: くし〴〺ぅ */
    public void mo3789(InterfaceC1757 interfaceC1757, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1749 c1749 = new C1749(context.getResources(), colorStateList, f, f2, f3);
        CardView.C0111 c0111 = (CardView.C0111) interfaceC1757;
        c1749.f7944 = c0111.m250();
        c1749.invalidateSelf();
        c0111.f664 = c1749;
        CardView.this.setBackgroundDrawable(c1749);
        mo3793(c0111);
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: げつ〴ぬぐ */
    public float mo3790(InterfaceC1757 interfaceC1757) {
        return m3804(interfaceC1757).f7939;
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: づざかべべ */
    public float mo3791(InterfaceC1757 interfaceC1757) {
        return m3804(interfaceC1757).f7942;
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: てぜきぽく */
    public void mo3792(InterfaceC1757 interfaceC1757, float f) {
        C1749 m3804 = m3804(interfaceC1757);
        m3804.m3802(f, m3804.f7939);
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: なぎぱいぢぎ */
    public void mo3793(InterfaceC1757 interfaceC1757) {
        Rect rect = new Rect();
        m3804(interfaceC1757).getPadding(rect);
        int ceil = (int) Math.ceil(mo3786(interfaceC1757));
        int ceil2 = (int) Math.ceil(mo3797(interfaceC1757));
        CardView.C0111 c0111 = (CardView.C0111) interfaceC1757;
        CardView cardView = CardView.this;
        if (ceil > cardView.f662) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(ceil);
        }
        CardView cardView2 = CardView.this;
        if (ceil2 > cardView2.f660) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(ceil2);
        }
        ((CardView.C0111) interfaceC1757).m249(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: のぷのちつ */
    public void mo3794(InterfaceC1757 interfaceC1757) {
        C1749 m3804 = m3804(interfaceC1757);
        CardView.C0111 c0111 = (CardView.C0111) interfaceC1757;
        m3804.f7944 = c0111.m250();
        m3804.invalidateSelf();
        mo3793(c0111);
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: びぐびあび */
    public void mo3795(InterfaceC1757 interfaceC1757, float f) {
        C1749 m3804 = m3804(interfaceC1757);
        m3804.getClass();
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (m3804.f7949 != f2) {
            m3804.f7949 = f2;
            m3804.f7948 = true;
            m3804.invalidateSelf();
        }
        mo3793(interfaceC1757);
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: へぬ〴づぞ */
    public void mo3796(InterfaceC1757 interfaceC1757, ColorStateList colorStateList) {
        C1749 m3804 = m3804(interfaceC1757);
        m3804.m3801(colorStateList);
        m3804.invalidateSelf();
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: ぺぁあねじ */
    public float mo3797(InterfaceC1757 interfaceC1757) {
        C1749 m3804 = m3804(interfaceC1757);
        float f = m3804.f7939;
        return (((m3804.f7939 * 1.5f) + m3804.f7946) * 2.0f) + (Math.max(f, ((f * 1.5f) / 2.0f) + m3804.f7949 + m3804.f7946) * 2.0f);
    }

    @Override // p034.p096.p097.InterfaceC1755
    /* renamed from: ぺふねづ〺 */
    public void mo3798(InterfaceC1757 interfaceC1757) {
    }
}
