package p034.p095;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: づざかべべ.は〲ぱなで.げがぴうあだ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1708 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Method f7861;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static boolean f7862;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static boolean f7863;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static Field f7864;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float[] f7865;

    /* renamed from: 〳ぜぞぜべっ */
    public void mo3747(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo3747((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* renamed from: 〺つふすそ */
    public float mo3748(View view) {
        Float f = (Float) view.getTag(C1740.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f != null ? alpha / f.floatValue() : alpha;
    }

    /* renamed from: ぁごぐすすぃ */
    public void mo3738(View view, int i) {
        if (!f7863) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f7864 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f7863 = true;
        }
        Field field = f7864;
        if (field != null) {
            try {
                f7864.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo3756(View view) {
        int i = C1740.save_non_transition_alpha;
        if (view.getTag(i) == null) {
            view.setTag(i, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo3757(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C1740.save_non_transition_alpha, null);
        }
    }

    /* renamed from: づざかべべ */
    public void mo3749(View view, int i, int i2, int i3, int i4) {
        if (!f7862) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f7861 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f7862 = true;
        }
        Method method = f7861;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: なぎぱいぢぎ */
    public void mo3750(View view, float f) {
        Float f2 = (Float) view.getTag(C1740.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: びぐびあび */
    public void mo3751(View view, Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f7865;
        if (fArr == null) {
            fArr = new float[9];
            this.f7865 = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float sqrt = ((float) Math.sqrt(1.0f - (f * f))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f, sqrt));
        float f2 = fArr[0] / sqrt;
        float f3 = fArr[4] / sqrt;
        float f4 = fArr[2];
        float f5 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        view.setRotation(degrees);
        view.setScaleX(f2);
        view.setScaleY(f3);
    }

    /* renamed from: ぺぁあねじ */
    public void mo3752(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo3752((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
