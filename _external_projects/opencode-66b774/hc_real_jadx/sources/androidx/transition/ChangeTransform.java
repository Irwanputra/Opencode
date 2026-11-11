package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import org.xmlpull.v1.XmlPullParser;
import p034.p035.p043.p044.C1056;
import p034.p035.p045.C1096;
import p034.p095.C1686;
import p034.p095.C1693;
import p034.p095.C1700;
import p034.p095.C1711;
import p034.p095.C1712;
import p034.p095.C1714;
import p034.p095.C1740;
import p034.p095.C1741;
import p034.p095.InterfaceC1691;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ChangeTransform extends Transition {

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static final boolean f1746;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean f1747;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public Matrix f1748;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f1749;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static final String[] f1745 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public static final Property<C0272, float[]> f1743 = new C0270(float[].class, "nonTranslations");

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public static final Property<C0272, PointF> f1744 = new C0268(PointF.class, "translations");

    /* renamed from: androidx.transition.ChangeTransform$〺つふすそ, reason: contains not printable characters */
    public static class C0268 extends Property<C0272, PointF> {
        public C0268(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(C0272 c0272) {
            return null;
        }

        @Override // android.util.Property
        public void set(C0272 c0272, PointF pointF) {
            C0272 c02722 = c0272;
            PointF pointF2 = pointF;
            c02722.getClass();
            c02722.f1764 = pointF2.x;
            c02722.f1763 = pointF2.y;
            c02722.m1002();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0269 extends C1711 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public InterfaceC1691 f1750;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public View f1751;

        public C0269(View view, InterfaceC1691 interfaceC1691) {
            this.f1751 = view;
            this.f1750 = interfaceC1691;
        }

        @Override // p034.p095.C1711, androidx.transition.Transition.InterfaceC0287
        /* renamed from: くし〴〺ぅ */
        public void mo992(Transition transition) {
            this.f1750.setVisibility(4);
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: づざかべべ */
        public void mo993(Transition transition) {
            transition.mo1038(this);
            View view = this.f1751;
            if (Build.VERSION.SDK_INT == 28) {
                if (!C1741.f7927) {
                    try {
                        if (!C1741.f7932) {
                            try {
                                C1741.f7929 = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused) {
                            }
                            C1741.f7932 = true;
                        }
                        Method declaredMethod = C1741.f7929.getDeclaredMethod("removeGhost", View.class);
                        C1741.f7928 = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused2) {
                    }
                    C1741.f7927 = true;
                }
                Method method = C1741.f7928;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused3) {
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e.getCause());
                    }
                }
            } else {
                int i = C1693.f7826;
                C1693 c1693 = (C1693) view.getTag(C1740.ghost_view);
                if (c1693 != null) {
                    int i2 = c1693.f7830 - 1;
                    c1693.f7830 = i2;
                    if (i2 <= 0) {
                        ((C1686) c1693.getParent()).removeView(c1693);
                    }
                }
            }
            this.f1751.setTag(C1740.transition_transform, null);
            this.f1751.setTag(C1740.parent_matrix, null);
        }

        @Override // p034.p095.C1711, androidx.transition.Transition.InterfaceC0287
        /* renamed from: びぐびあび */
        public void mo994(Transition transition) {
            this.f1750.setVisibility(0);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0270 extends Property<C0272, float[]> {
        public C0270(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ float[] get(C0272 c0272) {
            return null;
        }

        @Override // android.util.Property
        public void set(C0272 c0272, float[] fArr) {
            C0272 c02722 = c0272;
            float[] fArr2 = fArr;
            System.arraycopy(fArr2, 0, c02722.f1761, 0, fArr2.length);
            c02722.m1002();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$づざかべべ, reason: contains not printable characters */
    public static class C0271 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public final float f1752;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final float f1753;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public final float f1754;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final float f1755;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final float f1756;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final float f1757;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final float f1758;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final float f1759;

        public C0271(View view) {
            this.f1756 = view.getTranslationX();
            this.f1753 = view.getTranslationY();
            AtomicInteger atomicInteger = C1096.f5578;
            this.f1755 = Build.VERSION.SDK_INT >= 21 ? view.getTranslationZ() : 0.0f;
            this.f1759 = view.getScaleX();
            this.f1757 = view.getScaleY();
            this.f1758 = view.getRotationX();
            this.f1754 = view.getRotationY();
            this.f1752 = view.getRotation();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0271)) {
                return false;
            }
            C0271 c0271 = (C0271) obj;
            return c0271.f1756 == this.f1756 && c0271.f1753 == this.f1753 && c0271.f1755 == this.f1755 && c0271.f1759 == this.f1759 && c0271.f1757 == this.f1757 && c0271.f1758 == this.f1758 && c0271.f1754 == this.f1754 && c0271.f1752 == this.f1752;
        }

        public int hashCode() {
            float f = this.f1756;
            int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f1753;
            int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f1755;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f1759;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f1757;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f1758;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f1754;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f1752;
            return floatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m1001(View view) {
            ChangeTransform.m998(view, this.f1756, this.f1753, this.f1755, this.f1759, this.f1757, this.f1758, this.f1754, this.f1752);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$びぐびあび, reason: contains not printable characters */
    public static class C0272 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final View f1760;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final float[] f1761;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Matrix f1762 = new Matrix();

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public float f1763;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public float f1764;

        public C0272(View view, float[] fArr) {
            this.f1760 = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f1761 = fArr2;
            this.f1764 = fArr2[2];
            this.f1763 = fArr2[5];
            m1002();
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final void m1002() {
            float[] fArr = this.f1761;
            fArr[2] = this.f1764;
            fArr[5] = this.f1763;
            this.f1762.setValues(fArr);
            C1714.f7881.mo3751(this.f1760, this.f1762);
        }
    }

    static {
        f1746 = Build.VERSION.SDK_INT >= 21;
    }

    public ChangeTransform() {
        this.f1747 = true;
        this.f1749 = true;
        this.f1748 = new Matrix();
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1747 = true;
        this.f1749 = true;
        this.f1748 = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1712.f7872);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f1747 = C1056.m2392(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f1749 = C1056.m2392(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public static void m998(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f3);
        }
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static void m999(View view) {
        m998(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぁごぐすすぃ */
    public void mo986(C1700 c1700) {
        m1000(c1700);
        if (f1746) {
            return;
        }
        ((ViewGroup) c1700.f7838.getParent()).startViewTransition(c1700.f7838);
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぉざぅち〻 */
    public String[] mo987() {
        return f1745;
    }

    @Override // androidx.transition.Transition
    /* renamed from: びぐびあび */
    public void mo988(C1700 c1700) {
        m1000(c1700);
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final void m1000(C1700 c1700) {
        View view = c1700.f7838;
        if (view.getVisibility() == 8) {
            return;
        }
        c1700.f7840.put("android:changeTransform:parent", view.getParent());
        c1700.f7840.put("android:changeTransform:transforms", new C0271(view));
        Matrix matrix = view.getMatrix();
        c1700.f7840.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f1749) {
            Matrix matrix2 = new Matrix();
            C1714.f7881.mo3747((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            c1700.f7840.put("android:changeTransform:parentMatrix", matrix2);
            c1700.f7840.put("android:changeTransform:intermediateMatrix", view.getTag(C1740.transition_transform));
            c1700.f7840.put("android:changeTransform:intermediateParentMatrix", view.getTag(C1740.parent_matrix));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0382, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x037f, code lost:
    
        if (r3.size() == r12) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r6v6, types: [づざかべべ.は〲ぱなで.ぺぁあねじ] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // androidx.transition.Transition
    /* renamed from: ぺふねづ〺 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator mo990(android.view.ViewGroup r25, p034.p095.C1700 r26, p034.p095.C1700 r27) {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.mo990(android.view.ViewGroup, づざかべべ.は〲ぱなで.ぉ〲なぱぽた, づざかべべ.は〲ぱなで.ぉ〲なぱぽた):android.animation.Animator");
    }
}
