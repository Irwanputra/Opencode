package p131.p161.p162.p163.p185;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2252 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final ThreadLocal<Matrix> f9373 = new ThreadLocal<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final ThreadLocal<RectF> f9372 = new ThreadLocal<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m4400(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m4400(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m4401(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = f9373;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m4400(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f9372;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m4402(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m4401(viewGroup, view, rect);
    }
}
