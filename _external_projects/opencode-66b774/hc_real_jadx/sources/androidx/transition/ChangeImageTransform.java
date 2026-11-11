package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Field;
import java.util.Map;
import p034.p095.C1689;
import p034.p095.C1700;
import p034.p095.C1720;
import p034.p095.C1743;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ChangeImageTransform extends Transition {

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static final String[] f1738 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static final TypeEvaluator<Matrix> f1740 = new C0267();

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static final Property<ImageView, Matrix> f1739 = new C0265(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$〺つふすそ, reason: contains not printable characters */
    public static class C0265 extends Property<ImageView, Matrix> {
        public C0265(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public void set(ImageView imageView, Matrix matrix) {
            ImageView imageView2 = imageView;
            Matrix matrix2 = matrix;
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                imageView2.animateTransform(matrix2);
                return;
            }
            if (matrix2 == null) {
                Drawable drawable = imageView2.getDrawable();
                if (drawable == null) {
                    return;
                } else {
                    drawable.setBounds(0, 0, (imageView2.getWidth() - imageView2.getPaddingLeft()) - imageView2.getPaddingRight(), (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom());
                }
            } else {
                if (i >= 21) {
                    if (C1743.f7936) {
                        try {
                            imageView2.animateTransform(matrix2);
                            return;
                        } catch (NoSuchMethodError unused) {
                            C1743.f7936 = false;
                            return;
                        }
                    }
                    return;
                }
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 == null) {
                    return;
                }
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                Matrix matrix3 = null;
                if (!C1743.f7935) {
                    try {
                        Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
                        C1743.f7934 = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused2) {
                    }
                    C1743.f7935 = true;
                }
                Field field = C1743.f7934;
                if (field != null) {
                    try {
                        Matrix matrix4 = (Matrix) field.get(imageView2);
                        if (matrix4 == null) {
                            try {
                                matrix3 = new Matrix();
                                C1743.f7934.set(imageView2, matrix3);
                            } catch (IllegalAccessException unused3) {
                            }
                        }
                        matrix3 = matrix4;
                    } catch (IllegalAccessException unused4) {
                    }
                }
                if (matrix3 != null) {
                    matrix3.set(matrix2);
                }
            }
            imageView2.invalidate();
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$くし〴〺ぅ, reason: contains not printable characters */
    public static /* synthetic */ class C0266 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f1741;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f1741 = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1741[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0267 implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぁごぐすすぃ */
    public void mo986(C1700 c1700) {
        m996(c1700);
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぉざぅち〻 */
    public String[] mo987() {
        return f1738;
    }

    @Override // androidx.transition.Transition
    /* renamed from: びぐびあび */
    public void mo988(C1700 c1700) {
        m996(c1700);
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final void m996(C1700 c1700) {
        Matrix matrix;
        View view = c1700.f7838;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = c1700.f7840;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Drawable drawable = imageView.getDrawable();
            if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                int i = C0266.f1741[imageView.getScaleType().ordinal()];
                if (i == 1) {
                    Drawable drawable2 = imageView.getDrawable();
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    matrix = matrix2;
                } else if (i == 2) {
                    Drawable drawable3 = imageView.getDrawable();
                    int intrinsicWidth = drawable3.getIntrinsicWidth();
                    float width = imageView.getWidth();
                    float f = intrinsicWidth;
                    int intrinsicHeight = drawable3.getIntrinsicHeight();
                    float height = imageView.getHeight();
                    float f2 = intrinsicHeight;
                    float max = Math.max(width / f, height / f2);
                    int round = Math.round((width - (f * max)) / 2.0f);
                    int round2 = Math.round((height - (f2 * max)) / 2.0f);
                    matrix = new Matrix();
                    matrix.postScale(max, max);
                    matrix.postTranslate(round, round2);
                }
                map.put("android:changeImageTransform:matrix", matrix);
            }
            matrix = new Matrix(imageView.getImageMatrix());
            map.put("android:changeImageTransform:matrix", matrix);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぺふねづ〺 */
    public Animator mo990(ViewGroup viewGroup, C1700 c1700, C1700 c17002) {
        if (c1700 == null || c17002 == null) {
            return null;
        }
        Rect rect = (Rect) c1700.f7840.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) c17002.f7840.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) c1700.f7840.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) c17002.f7840.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) c17002.f7838;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            Property<ImageView, Matrix> property = f1739;
            TypeEvaluator<Matrix> typeEvaluator = f1740;
            Matrix matrix3 = C1720.f7885;
            return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix3, matrix3});
        }
        if (matrix == null) {
            matrix = C1720.f7885;
        }
        if (matrix2 == null) {
            matrix2 = C1720.f7885;
        }
        Property<ImageView, Matrix> property2 = f1739;
        property2.set(imageView, matrix);
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property2, (TypeEvaluator) new C1689.C1690(), (Object[]) new Matrix[]{matrix, matrix2});
    }
}
