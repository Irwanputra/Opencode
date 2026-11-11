package p131.p145.p147.p148;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.くし〴〺ぅ.〺つふすそ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2031 extends Animation {

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final boolean f8757;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static final WeakHashMap<View, C2031> f8758;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f8759;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final WeakReference<View> f8760;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f8761;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f8762;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f8769;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public float f8770;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f8771;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float f8772;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f8773;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Camera f8766 = new Camera();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f8767 = 1.0f;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public float f8774 = 1.0f;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f8768 = 1.0f;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final RectF f8765 = new RectF();

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final RectF f8763 = new RectF();

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final Matrix f8764 = new Matrix();

    static {
        f8757 = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        f8758 = new WeakHashMap<>();
    }

    public C2031(View view) {
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        this.f8760 = new WeakReference<>(view);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static C2031 m4122(View view) {
        WeakHashMap<View, C2031> weakHashMap = f8758;
        C2031 c2031 = weakHashMap.get(view);
        if (c2031 != null && c2031 == view.getAnimation()) {
            return c2031;
        }
        C2031 c20312 = new C2031(view);
        weakHashMap.put(view, c20312);
        return c20312;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        View view = this.f8760.get();
        if (view != null) {
            transformation.setAlpha(this.f8767);
            m4126(transformation.getMatrix(), view);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m4123() {
        View view = this.f8760.get();
        if (view == null || view.getParent() == null) {
            return;
        }
        RectF rectF = this.f8763;
        m4125(rectF, view);
        rectF.union(this.f8765);
        ((View) view.getParent()).invalidate((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m4124() {
        View view = this.f8760.get();
        if (view != null) {
            m4125(this.f8765, view);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m4125(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Matrix matrix = this.f8764;
        matrix.reset();
        m4126(matrix, view);
        this.f8764.mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        float f = rectF.right;
        float f2 = rectF.left;
        if (f < f2) {
            rectF.right = f2;
            rectF.left = f;
        }
        float f3 = rectF.bottom;
        float f4 = rectF.top;
        if (f3 < f4) {
            rectF.top = f3;
            rectF.bottom = f4;
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m4126(Matrix matrix, View view) {
        float width = view.getWidth();
        float height = view.getHeight();
        boolean z = this.f8771;
        float f = z ? this.f8769 : width / 2.0f;
        float f2 = z ? this.f8761 : height / 2.0f;
        float f3 = this.f8759;
        float f4 = this.f8773;
        float f5 = this.f8762;
        if (f3 != 0.0f || f4 != 0.0f || f5 != 0.0f) {
            Camera camera = this.f8766;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        float f6 = this.f8774;
        float f7 = this.f8768;
        if (f6 != 1.0f || f7 != 1.0f) {
            matrix.postScale(f6, f7);
            matrix.postTranslate(((f6 * width) - width) * (-(f / width)), ((f7 * height) - height) * (-(f2 / height)));
        }
        matrix.postTranslate(this.f8770, this.f8772);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m4127(float f) {
        if (this.f8767 != f) {
            this.f8767 = f;
            View view = this.f8760.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }
}
