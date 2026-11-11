package p034.p061.p062;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* renamed from: づざかべべ.ぁごぐすすぃ.びぐびあび.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1349 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final ThreadLocal<Matrix> f6456 = new ThreadLocal<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final ThreadLocal<RectF> f6455 = new ThreadLocal<>();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m3034(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m3034(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
