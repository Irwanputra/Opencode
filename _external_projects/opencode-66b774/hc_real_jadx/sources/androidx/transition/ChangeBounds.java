package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p034.p035.p043.p044.C1056;
import p034.p035.p045.C1096;
import p034.p095.C1687;
import p034.p095.C1689;
import p034.p095.C1700;
import p034.p095.C1705;
import p034.p095.C1711;
import p034.p095.C1712;
import p034.p095.C1713;
import p034.p095.C1714;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ChangeBounds extends Transition {

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int[] f1716;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f1717;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static final String[] f1713 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static final Property<Drawable, PointF> f1712 = new C0259(PointF.class, "boundsOrigin");

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public static final Property<C0257, PointF> f1708 = new C0255(PointF.class, "topLeft");

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public static final Property<C0257, PointF> f1710 = new C0258(PointF.class, "bottomRight");

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static final Property<View, PointF> f1715 = new C0262(PointF.class, "bottomRight");

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public static final Property<View, PointF> f1709 = new C0260(PointF.class, "topLeft");

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public static final Property<View, PointF> f1711 = new C0261(PointF.class, "position");

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static C1705 f1714 = new C1705();

    /* renamed from: androidx.transition.ChangeBounds$〳ぜぞぜべっ, reason: contains not printable characters */
    public class C0254 extends AnimatorListenerAdapter {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ View f1718;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public final /* synthetic */ int f1719;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ Rect f1720;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f1721;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final /* synthetic */ int f1722;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final /* synthetic */ int f1723;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ int f1724;

        public C0254(ChangeBounds changeBounds, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f1718 = view;
            this.f1720 = rect;
            this.f1724 = i;
            this.f1722 = i2;
            this.f1723 = i3;
            this.f1719 = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1721 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1721) {
                return;
            }
            C1096.m2494(this.f1718, this.f1720);
            C1714.m3761(this.f1718, this.f1724, this.f1722, this.f1723, this.f1719);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$〺つふすそ, reason: contains not printable characters */
    public static class C0255 extends Property<C0257, PointF> {
        public C0255(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(C0257 c0257) {
            return null;
        }

        @Override // android.util.Property
        public void set(C0257 c0257, PointF pointF) {
            C0257 c02572 = c0257;
            PointF pointF2 = pointF;
            c02572.getClass();
            c02572.f1729 = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            c02572.f1726 = round;
            int i = c02572.f1731 + 1;
            c02572.f1731 = i;
            if (i == c02572.f1727) {
                C1714.m3761(c02572.f1730, c02572.f1729, round, c02572.f1728, c02572.f1732);
                c02572.f1731 = 0;
                c02572.f1727 = 0;
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$ぁごぐすすぃ, reason: contains not printable characters */
    public class C0256 extends AnimatorListenerAdapter {
        private C0257 mViewBounds;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ C0257 f1725;

        public C0256(ChangeBounds changeBounds, C0257 c0257) {
            this.f1725 = c0257;
            this.mViewBounds = c0257;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$いいにぽつ, reason: contains not printable characters */
    public static class C0257 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1726;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f1727;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1728;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f1729;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public View f1730;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f1731;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1732;

        public C0257(View view) {
            this.f1730 = view;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0258 extends Property<C0257, PointF> {
        public C0258(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(C0257 c0257) {
            return null;
        }

        @Override // android.util.Property
        public void set(C0257 c0257, PointF pointF) {
            C0257 c02572 = c0257;
            PointF pointF2 = pointF;
            c02572.getClass();
            c02572.f1728 = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            c02572.f1732 = round;
            int i = c02572.f1727 + 1;
            c02572.f1727 = i;
            if (c02572.f1731 == i) {
                C1714.m3761(c02572.f1730, c02572.f1729, c02572.f1726, c02572.f1728, round);
                c02572.f1731 = 0;
                c02572.f1727 = 0;
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0259 extends Property<Drawable, PointF> {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Rect f1733;

        public C0259(Class cls, String str) {
            super(cls, str);
            this.f1733 = new Rect();
        }

        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f1733);
            Rect rect = this.f1733;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f1733);
            this.f1733.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f1733);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$づざかべべ, reason: contains not printable characters */
    public static class C0260 extends Property<View, PointF> {
        public C0260(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C1714.m3761(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C0261 extends Property<View, PointF> {
        public C0261(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            C1714.m3761(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$びぐびあび, reason: contains not printable characters */
    public static class C0262 extends Property<View, PointF> {
        public C0262(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C1714.m3761(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$ぺぁあねじ, reason: contains not printable characters */
    public class C0263 extends C1711 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ ViewGroup f1734;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f1735 = false;

        public C0263(ChangeBounds changeBounds, ViewGroup viewGroup) {
            this.f1734 = viewGroup;
        }

        @Override // p034.p095.C1711, androidx.transition.Transition.InterfaceC0287
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo991(Transition transition) {
            C1713.m3758(this.f1734, false);
            this.f1735 = true;
        }

        @Override // p034.p095.C1711, androidx.transition.Transition.InterfaceC0287
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void mo992(Transition transition) {
            C1713.m3758(this.f1734, false);
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: づざかべべ, reason: contains not printable characters */
        public void mo993(Transition transition) {
            if (!this.f1735) {
                C1713.m3758(this.f1734, false);
            }
            transition.mo1038(this);
        }

        @Override // p034.p095.C1711, androidx.transition.Transition.InterfaceC0287
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void mo994(Transition transition) {
            C1713.m3758(this.f1734, true);
        }
    }

    public ChangeBounds() {
        this.f1716 = new int[2];
        this.f1717 = false;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1716 = new int[2];
        this.f1717 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1712.f7868);
        boolean m2392 = C1056.m2392(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.f1717 = m2392;
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void mo986(C1700 c1700) {
        m989(c1700);
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public String[] mo987() {
        return f1713;
    }

    @Override // androidx.transition.Transition
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void mo988(C1700 c1700) {
        m989(c1700);
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final void m989(C1700 c1700) {
        View view = c1700.f7838;
        if (!C1096.m2517(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c1700.f7840.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c1700.f7840.put("android:changeBounds:parent", c1700.f7838.getParent());
        if (this.f1717) {
            c1700.f7840.put("android:changeBounds:clip", C1096.m2481(view));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public Animator mo990(ViewGroup viewGroup, C1700 c1700, C1700 c17002) {
        int i;
        View view;
        int i2;
        Rect rect;
        boolean z;
        ObjectAnimator objectAnimator;
        Animator animator;
        Path mo984;
        Property<View, PointF> property;
        ObjectAnimator objectAnimator2;
        if (c1700 == null || c17002 == null) {
            return null;
        }
        Map<String, Object> map = c1700.f7840;
        Map<String, Object> map2 = c17002.f7840;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c17002.f7838;
        Rect rect2 = (Rect) c1700.f7840.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) c17002.f7840.get("android:changeBounds:bounds");
        int i3 = rect2.left;
        int i4 = rect3.left;
        int i5 = rect2.top;
        int i6 = rect3.top;
        int i7 = rect2.right;
        int i8 = rect3.right;
        int i9 = rect2.bottom;
        int i10 = rect3.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect4 = (Rect) c1700.f7840.get("android:changeBounds:clip");
        Rect rect5 = (Rect) c17002.f7840.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i = 0;
        } else {
            i = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i++;
        }
        int i15 = i;
        if (i15 <= 0) {
            return null;
        }
        if (this.f1717) {
            view = view2;
            C1714.m3761(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
            ObjectAnimator m3683 = (i3 == i4 && i5 == i6) ? null : C1687.m3683(view, f1711, this.f1798.mo984(i3, i5, i4, i6));
            if (rect4 == null) {
                i2 = 0;
                rect = new Rect(0, 0, i11, i12);
            } else {
                i2 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i2, i2, i13, i14) : rect5;
            if (rect.equals(rect6)) {
                z = true;
                objectAnimator = null;
            } else {
                C1096.m2494(view, rect);
                C1705 c1705 = f1714;
                Object[] objArr = new Object[2];
                objArr[i2] = rect;
                objArr[1] = rect6;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c1705, objArr);
                z = true;
                ofObject.addListener(new C0254(this, view, rect5, i4, i6, i8, i10));
                objectAnimator = ofObject;
            }
            animator = C1689.m3739(m3683, objectAnimator);
        } else {
            view = view2;
            C1714.m3761(view, i3, i5, i7, i9);
            if (i15 == 2) {
                if (i11 == i13 && i12 == i14) {
                    mo984 = this.f1798.mo984(i3, i5, i4, i6);
                    property = f1711;
                } else {
                    C0257 c0257 = new C0257(view);
                    ObjectAnimator m36832 = C1687.m3683(c0257, f1708, this.f1798.mo984(i3, i5, i4, i6));
                    ObjectAnimator m36833 = C1687.m3683(c0257, f1710, this.f1798.mo984(i7, i9, i8, i10));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(m36832, m36833);
                    animatorSet.addListener(new C0256(this, c0257));
                    objectAnimator2 = animatorSet;
                    z = true;
                    animator = objectAnimator2;
                }
            } else if (i3 == i4 && i5 == i6) {
                mo984 = this.f1798.mo984(i7, i9, i8, i10);
                property = f1715;
            } else {
                mo984 = this.f1798.mo984(i3, i5, i4, i6);
                property = f1709;
            }
            objectAnimator2 = C1687.m3683(view, property, mo984);
            z = true;
            animator = objectAnimator2;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C1713.m3758(viewGroup4, z);
            mo1024(new C0263(this, viewGroup4));
        }
        return animator;
    }
}
