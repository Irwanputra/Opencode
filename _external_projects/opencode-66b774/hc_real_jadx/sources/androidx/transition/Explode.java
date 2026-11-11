package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import p034.p095.C1700;
import p034.p095.C1735;
import p034.p095.C1737;
import p034.p095.C1740;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Explode extends Visibility {

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int[] f1767;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static final TimeInterpolator f1766 = new DecelerateInterpolator();

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public static final TimeInterpolator f1765 = new AccelerateInterpolator();

    public Explode() {
        this.f1767 = new int[2];
        this.f1793 = new C1737();
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    private void m1003(C1700 c1700) {
        View view = c1700.f7838;
        view.getLocationOnScreen(this.f1767);
        int[] iArr = this.f1767;
        int i = iArr[0];
        int i2 = iArr[1];
        c1700.f7840.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: ぁごぐすすぃ */
    public void mo986(C1700 c1700) {
        m1053(c1700);
        m1003(c1700);
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public final void m1004(View view, Rect rect, int[] iArr) {
        int centerX;
        int centerY;
        view.getLocationOnScreen(this.f1767);
        int[] iArr2 = this.f1767;
        int i = iArr2[0];
        int i2 = iArr2[1];
        Rect m1039 = m1039();
        if (m1039 == null) {
            centerX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i;
            centerY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i2;
        } else {
            centerX = m1039.centerX();
            centerY = m1039.centerY();
        }
        float centerX2 = rect.centerX() - centerX;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float sqrt = (float) Math.sqrt((centerY2 * centerY2) + (centerX2 * centerX2));
        int i3 = centerX - i;
        int i4 = centerY - i2;
        float max = Math.max(i3, view.getWidth() - i3);
        float max2 = Math.max(i4, view.getHeight() - i4);
        float sqrt2 = (float) Math.sqrt((max2 * max2) + (max * max));
        iArr[0] = Math.round((centerX2 / sqrt) * sqrt2);
        iArr[1] = Math.round(sqrt2 * (centerY2 / sqrt));
    }

    @Override // androidx.transition.Visibility
    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public Animator mo1005(ViewGroup viewGroup, View view, C1700 c1700, C1700 c17002) {
        float f;
        float f2;
        Rect rect = (Rect) c1700.f7840.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) c1700.f7838.getTag(C1740.transition_position);
        if (iArr != null) {
            f = (iArr[0] - rect.left) + translationX;
            f2 = (iArr[1] - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        m1004(viewGroup, rect, this.f1767);
        int[] iArr2 = this.f1767;
        return C1735.m3782(view, c1700, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], f1765, this);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public Animator mo1006(ViewGroup viewGroup, View view, C1700 c1700, C1700 c17002) {
        Rect rect = (Rect) c17002.f7840.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m1004(viewGroup, rect, this.f1767);
        int[] iArr = this.f1767;
        return C1735.m3782(view, c17002, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f1766, this);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: びぐびあび */
    public void mo988(C1700 c1700) {
        m1053(c1700);
        m1003(c1700);
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1767 = new int[2];
        this.f1793 = new C1737();
    }
}
