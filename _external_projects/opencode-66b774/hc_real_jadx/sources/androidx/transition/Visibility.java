package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import p034.p035.p043.p044.C1056;
import p034.p095.C1700;
import p034.p095.C1712;
import p034.p095.C1713;
import p034.p095.C1714;
import p034.p095.InterfaceC1709;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class Visibility extends Transition {

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static final String[] f1818 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int f1819;

    /* renamed from: androidx.transition.Visibility$〺つふすそ, reason: contains not printable characters */
    public static class C0290 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f1820;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1821;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f1822;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public ViewGroup f1823;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public ViewGroup f1824;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1825;
    }

    /* renamed from: androidx.transition.Visibility$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0291 extends AnimatorListenerAdapter implements Transition.InterfaceC0287, InterfaceC1709 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f1826;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final ViewGroup f1827;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final View f1828;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f1829;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f1830 = false;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final boolean f1831;

        public C0291(View view, int i, boolean z) {
            this.f1828 = view;
            this.f1826 = i;
            this.f1827 = (ViewGroup) view.getParent();
            this.f1831 = z;
            m1054(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1830 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m1055();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p034.p095.InterfaceC1709
        public void onAnimationPause(Animator animator) {
            if (this.f1830) {
                return;
            }
            C1714.f7881.mo3738(this.f1828, this.f1826);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p034.p095.InterfaceC1709
        public void onAnimationResume(Animator animator) {
            if (this.f1830) {
                return;
            }
            C1714.f7881.mo3738(this.f1828, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: 〺つふすそ */
        public void mo991(Transition transition) {
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public final void m1054(boolean z) {
            ViewGroup viewGroup;
            if (!this.f1831 || this.f1829 == z || (viewGroup = this.f1827) == null) {
                return;
            }
            this.f1829 = z;
            C1713.m3758(viewGroup, z);
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: くし〴〺ぅ */
        public void mo992(Transition transition) {
            m1054(false);
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: げつ〴ぬぐ */
        public void mo1043(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: づざかべべ */
        public void mo993(Transition transition) {
            m1055();
            transition.mo1038(this);
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final void m1055() {
            if (!this.f1830) {
                C1714.f7881.mo3738(this.f1828, this.f1826);
                ViewGroup viewGroup = this.f1827;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m1054(false);
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: びぐびあび */
        public void mo994(Transition transition) {
            m1054(true);
        }
    }

    public Visibility() {
        this.f1819 = 3;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1819 = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1712.f7870);
        int m2395 = C1056.m2395(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (m2395 != 0) {
            m1052(m2395);
        }
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public Animator m1049(ViewGroup viewGroup, C1700 c1700, C1700 c17002) {
        if ((this.f1819 & 1) != 1 || c17002 == null) {
            return null;
        }
        if (c1700 == null) {
            View view = (View) c17002.f7838.getParent();
            if (m1050(m1023(view, false), m1026(view, false)).f1822) {
                return null;
            }
        }
        return mo1006(viewGroup, c17002.f7838, c1700, c17002);
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぁごぐすすぃ */
    public void mo986(C1700 c1700) {
        m1053(c1700);
    }

    /* renamed from: ぇとしたべど */
    public Animator mo1005(ViewGroup viewGroup, View view, C1700 c1700, C1700 c17002) {
        return null;
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぉざぅち〻 */
    public String[] mo987() {
        return f1818;
    }

    /* renamed from: おかぷせ〱 */
    public Animator mo1006(ViewGroup viewGroup, View view, C1700 c1700, C1700 c17002) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r0.f1823 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (r0.f1821 == 0) goto L40;
     */
    /* renamed from: けときぜと, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.transition.Visibility.C0290 m1050(p034.p095.C1700 r8, p034.p095.C1700 r9) {
        /*
            r7 = this;
            androidx.transition.Visibility$〺つふすそ r0 = new androidx.transition.Visibility$〺つふすそ
            r0.<init>()
            r1 = 0
            r0.f1822 = r1
            r0.f1820 = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f7840
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f7840
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f1821 = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f7840
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f1823 = r6
            goto L37
        L33:
            r0.f1821 = r4
            r0.f1823 = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f7840
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f7840
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f1825 = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f7840
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f1824 = r2
            goto L5e
        L5a:
            r0.f1825 = r4
            r0.f1824 = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f1821
            int r9 = r0.f1825
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f1823
            android.view.ViewGroup r4 = r0.f1824
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f1824
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f1823
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f1825
            if (r8 != 0) goto L8d
        L88:
            r0.f1820 = r2
        L8a:
            r0.f1822 = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f1821
            if (r8 != 0) goto L96
        L93:
            r0.f1820 = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.m1050(づざかべべ.は〲ぱなで.ぉ〲なぱぽた, づざかべべ.は〲ぱなで.ぉ〲なぱぽた):androidx.transition.Visibility$〺つふすそ");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018d  */
    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator m1051(android.view.ViewGroup r22, p034.p095.C1700 r23, p034.p095.C1700 r24, int r25) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.m1051(android.view.ViewGroup, づざかべべ.は〲ぱなで.ぉ〲なぱぽた, づざかべべ.は〲ぱなで.ぉ〲なぱぽた, int):android.animation.Animator");
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public void m1052(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f1819 = i;
    }

    @Override // androidx.transition.Transition
    /* renamed from: は〲ぱなで */
    public boolean mo1036(C1700 c1700, C1700 c17002) {
        if (c1700 == null && c17002 == null) {
            return false;
        }
        if (c1700 != null && c17002 != null && c17002.f7840.containsKey("android:visibility:visibility") != c1700.f7840.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0290 m1050 = m1050(c1700, c17002);
        if (m1050.f1822) {
            return m1050.f1821 == 0 || m1050.f1825 == 0;
        }
        return false;
    }

    @Override // androidx.transition.Transition
    /* renamed from: びぐびあび */
    public void mo988(C1700 c1700) {
        m1053(c1700);
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final void m1053(C1700 c1700) {
        c1700.f7840.put("android:visibility:visibility", Integer.valueOf(c1700.f7838.getVisibility()));
        c1700.f7840.put("android:visibility:parent", c1700.f7838.getParent());
        int[] iArr = new int[2];
        c1700.f7838.getLocationOnScreen(iArr);
        c1700.f7840.put("android:visibility:screenLocation", iArr);
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぺふねづ〺 */
    public Animator mo990(ViewGroup viewGroup, C1700 c1700, C1700 c17002) {
        C0290 m1050 = m1050(c1700, c17002);
        if (!m1050.f1822) {
            return null;
        }
        if (m1050.f1823 == null && m1050.f1824 == null) {
            return null;
        }
        return m1050.f1820 ? m1049(viewGroup, c1700, c17002) : m1051(viewGroup, c1700, c17002, m1050.f1825);
    }
}
