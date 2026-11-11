package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import p034.p035.p043.p044.C1056;
import p034.p035.p045.C1096;
import p034.p080.C1502;
import p034.p080.C1504;
import p034.p080.C1506;
import p034.p095.AbstractC1692;
import p034.p095.AbstractC1738;
import p034.p095.C1696;
import p034.p095.C1700;
import p034.p095.C1710;
import p034.p095.C1712;
import p034.p095.C1714;
import p034.p095.C1734;
import p034.p095.InterfaceC1699;
import p034.p095.InterfaceC1709;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class Transition implements Cloneable {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C1696 f1785;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f1786;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public ArrayList<View> f1787;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public TransitionSet f1788;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f1789;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f1790;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f1791;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public long f1792;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public AbstractC1738 f1793;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public AbstractC0285 f1794;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public ArrayList<InterfaceC0287> f1795;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public TimeInterpolator f1796;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public ArrayList<C1700> f1797;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public PathMotion f1798;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ArrayList<Integer> f1799;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public ArrayList<C1700> f1800;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public ArrayList<Animator> f1801;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public long f1802;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public ArrayList<Animator> f1803;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C1696 f1804;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int[] f1805;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static final int[] f1784 = {2, 1, 3, 4};

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static final PathMotion f1782 = new C0286();

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static ThreadLocal<C1502<Animator, C0284>> f1783 = new ThreadLocal<>();

    /* renamed from: androidx.transition.Transition$〺つふすそ, reason: contains not printable characters */
    public static class C0284 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public String f1806;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C1700 f1807;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public View f1808;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public Transition f1809;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public InterfaceC1699 f1810;

        public C0284(View view, String str, Transition transition, InterfaceC1699 interfaceC1699, C1700 c1700) {
            this.f1808 = view;
            this.f1806 = str;
            this.f1807 = c1700;
            this.f1810 = interfaceC1699;
            this.f1809 = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$くし〴〺ぅ, reason: contains not printable characters */
    public static abstract class AbstractC0285 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public abstract Rect mo1042(Transition transition);
    }

    /* renamed from: androidx.transition.Transition$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0286 extends PathMotion {
        @Override // androidx.transition.PathMotion
        /* renamed from: げつ〴ぬぐ */
        public Path mo984(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$びぐびあび, reason: contains not printable characters */
    public interface InterfaceC0287 {
        /* renamed from: 〺つふすそ */
        void mo991(Transition transition);

        /* renamed from: くし〴〺ぅ */
        void mo992(Transition transition);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo1043(Transition transition);

        /* renamed from: づざかべべ */
        void mo993(Transition transition);

        /* renamed from: びぐびあび */
        void mo994(Transition transition);
    }

    public Transition() {
        this.f1786 = getClass().getName();
        this.f1792 = -1L;
        this.f1802 = -1L;
        this.f1796 = null;
        this.f1799 = new ArrayList<>();
        this.f1787 = new ArrayList<>();
        this.f1785 = new C1696();
        this.f1804 = new C1696();
        this.f1788 = null;
        this.f1805 = f1784;
        this.f1803 = new ArrayList<>();
        this.f1791 = 0;
        this.f1789 = false;
        this.f1790 = false;
        this.f1795 = null;
        this.f1801 = new ArrayList<>();
        this.f1798 = f1782;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        boolean z;
        this.f1786 = getClass().getName();
        this.f1792 = -1L;
        this.f1802 = -1L;
        this.f1796 = null;
        this.f1799 = new ArrayList<>();
        this.f1787 = new ArrayList<>();
        this.f1785 = new C1696();
        this.f1804 = new C1696();
        this.f1788 = null;
        this.f1805 = f1784;
        this.f1803 = new ArrayList<>();
        this.f1791 = 0;
        this.f1789 = false;
        this.f1790 = false;
        this.f1795 = null;
        this.f1801 = new ArrayList<>();
        this.f1798 = f1782;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1712.f7871);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long m2395 = C1056.m2395(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (m2395 >= 0) {
            mo1037(m2395);
        }
        long m23952 = C1056.m2395(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (m23952 > 0) {
            mo1041(m23952);
        }
        int m2393 = C1056.m2393(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (m2393 > 0) {
            mo1032(AnimationUtils.loadInterpolator(context, m2393));
        }
        String m2394 = C1056.m2394(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m2394 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(m2394, ",");
            int[] iArr = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(trim)) {
                    iArr[i] = 3;
                } else if ("instance".equalsIgnoreCase(trim)) {
                    iArr[i] = 1;
                } else if ("name".equalsIgnoreCase(trim)) {
                    iArr[i] = 2;
                } else if ("itemId".equalsIgnoreCase(trim)) {
                    iArr[i] = 4;
                } else {
                    if (!trim.isEmpty()) {
                        throw new InflateException(C2098.m4187("Unknown match type in matchOrder: '", trim, "'"));
                    }
                    int[] iArr2 = new int[iArr.length - 1];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    i--;
                    iArr = iArr2;
                }
                i++;
            }
            if (iArr.length == 0) {
                this.f1805 = f1784;
            } else {
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    int i3 = iArr[i2];
                    if (!(i3 >= 1 && i3 <= 4)) {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                    int i4 = iArr[i2];
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i2) {
                            z = false;
                            break;
                        } else {
                            if (iArr[i5] == i4) {
                                z = true;
                                break;
                            }
                            i5++;
                        }
                    }
                    if (z) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                }
                this.f1805 = (int[]) iArr.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static C1502<Animator, C0284> m1012() {
        C1502<Animator, C0284> c1502 = f1783.get();
        if (c1502 != null) {
            return c1502;
        }
        C1502<Animator, C0284> c15022 = new C1502<>();
        f1783.set(c15022);
        return c15022;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m1013(C1696 c1696, View view, C1700 c1700) {
        c1696.f7836.put(view, c1700);
        int id = view.getId();
        if (id >= 0) {
            if (c1696.f7834.indexOfKey(id) >= 0) {
                c1696.f7834.put(id, null);
            } else {
                c1696.f7834.put(id, view);
            }
        }
        String m2497 = C1096.m2497(view);
        if (m2497 != null) {
            if (c1696.f7837.m3251(m2497) >= 0) {
                c1696.f7837.put(m2497, null);
            } else {
                c1696.f7837.put(m2497, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1504<View> c1504 = c1696.f7835;
                if (c1504.f6940) {
                    c1504.m3282();
                }
                if (C1506.m3287(c1504.f6941, c1504.f6942, itemIdAtPosition) < 0) {
                    C1096.m2480(view, true);
                    c1696.f7835.m3277(itemIdAtPosition, view);
                    return;
                }
                View m3280 = c1696.f7835.m3280(itemIdAtPosition);
                if (m3280 != null) {
                    C1096.m2480(m3280, false);
                    c1696.f7835.m3277(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public static boolean m1014(C1700 c1700, C1700 c17002, String str) {
        Object obj = c1700.f7840.get(str);
        Object obj2 = c17002.f7840.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public String toString() {
        return mo1028("");
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m1015(ViewGroup viewGroup, boolean z) {
        m1040(z);
        if (this.f1799.size() <= 0 && this.f1787.size() <= 0) {
            m1029(viewGroup, z);
            return;
        }
        for (int i = 0; i < this.f1799.size(); i++) {
            View findViewById = viewGroup.findViewById(this.f1799.get(i).intValue());
            if (findViewById != null) {
                C1700 c1700 = new C1700(findViewById);
                if (z) {
                    mo986(c1700);
                } else {
                    mo988(c1700);
                }
                c1700.f7839.add(this);
                mo1033(c1700);
                m1013(z ? this.f1785 : this.f1804, findViewById, c1700);
            }
        }
        for (int i2 = 0; i2 < this.f1787.size(); i2++) {
            View view = this.f1787.get(i2);
            C1700 c17002 = new C1700(view);
            if (z) {
                mo986(c17002);
            } else {
                mo988(c17002);
            }
            c17002.f7839.add(this);
            mo1033(c17002);
            m1013(z ? this.f1785 : this.f1804, view, c17002);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Transition mo1016(View view) {
        this.f1787.add(view);
        return this;
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public Transition mo1017(View view) {
        this.f1787.remove(view);
        return this;
    }

    /* renamed from: ぁごぐすすぃ */
    public abstract void mo986(C1700 c1700);

    @Override // 
    /* renamed from: いいにぽつ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f1801 = new ArrayList<>();
            transition.f1785 = new C1696();
            transition.f1804 = new C1696();
            transition.f1797 = null;
            transition.f1800 = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public void mo1019(PathMotion pathMotion) {
        if (pathMotion == null) {
            pathMotion = f1782;
        }
        this.f1798 = pathMotion;
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public void mo1020() {
        m1022();
        C1502<Animator, C0284> m1012 = m1012();
        Iterator<Animator> it = this.f1801.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m1012.containsKey(next)) {
                m1022();
                if (next != null) {
                    next.addListener(new C1734(this, m1012));
                    long j = this.f1802;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.f1792;
                    if (j2 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f1796;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new C1710(this));
                    next.start();
                }
            }
        }
        this.f1801.clear();
        m1035();
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public void mo1021(View view) {
        if (this.f1789) {
            if (!this.f1790) {
                C1502<Animator, C0284> m1012 = m1012();
                int i = m1012.f6910;
                InterfaceC1699 m3760 = C1714.m3760(view);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    C0284 m3255 = m1012.m3255(i2);
                    if (m3255.f1808 != null && m3760.equals(m3255.f1810)) {
                        Animator m3246 = m1012.m3246(i2);
                        if (Build.VERSION.SDK_INT >= 19) {
                            m3246.resume();
                        } else {
                            ArrayList<Animator.AnimatorListener> listeners = m3246.getListeners();
                            if (listeners != null) {
                                int size = listeners.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    Animator.AnimatorListener animatorListener = listeners.get(i3);
                                    if (animatorListener instanceof InterfaceC1709) {
                                        ((InterfaceC1709) animatorListener).onAnimationResume(m3246);
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList<InterfaceC0287> arrayList = this.f1795;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f1795.clone();
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((InterfaceC0287) arrayList2.get(i4)).mo994(this);
                    }
                }
            }
            this.f1789 = false;
        }
    }

    /* renamed from: ぉざぅち〻 */
    public String[] mo987() {
        return null;
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public void m1022() {
        if (this.f1791 == 0) {
            ArrayList<InterfaceC0287> arrayList = this.f1795;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1795.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC0287) arrayList2.get(i)).mo1043(this);
                }
            }
            this.f1790 = false;
        }
        this.f1791++;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public C1700 m1023(View view, boolean z) {
        TransitionSet transitionSet = this.f1788;
        if (transitionSet != null) {
            return transitionSet.m1023(view, z);
        }
        ArrayList<C1700> arrayList = z ? this.f1797 : this.f1800;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1700 c1700 = arrayList.get(i2);
            if (c1700 == null) {
                return null;
            }
            if (c1700.f7838 == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.f1800 : this.f1797).get(i);
        }
        return null;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Transition mo1024(InterfaceC0287 interfaceC0287) {
        if (this.f1795 == null) {
            this.f1795 = new ArrayList<>();
        }
        this.f1795.add(interfaceC0287);
        return this;
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean m1025(View view) {
        return (this.f1799.size() == 0 && this.f1787.size() == 0) || this.f1799.contains(Integer.valueOf(view.getId())) || this.f1787.contains(view);
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public C1700 m1026(View view, boolean z) {
        TransitionSet transitionSet = this.f1788;
        if (transitionSet != null) {
            return transitionSet.m1026(view, z);
        }
        return (z ? this.f1785 : this.f1804).f7836.getOrDefault(view, null);
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public void mo1027(AbstractC1738 abstractC1738) {
        this.f1793 = abstractC1738;
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public String mo1028(String str) {
        StringBuilder m4207 = C2098.m4207(str);
        m4207.append(getClass().getSimpleName());
        m4207.append("@");
        m4207.append(Integer.toHexString(hashCode()));
        m4207.append(": ");
        String sb = m4207.toString();
        if (this.f1802 != -1) {
            StringBuilder m4179 = C2098.m4179(sb, "dur(");
            m4179.append(this.f1802);
            m4179.append(") ");
            sb = m4179.toString();
        }
        if (this.f1792 != -1) {
            StringBuilder m41792 = C2098.m4179(sb, "dly(");
            m41792.append(this.f1792);
            m41792.append(") ");
            sb = m41792.toString();
        }
        if (this.f1796 != null) {
            StringBuilder m41793 = C2098.m4179(sb, "interp(");
            m41793.append(this.f1796);
            m41793.append(") ");
            sb = m41793.toString();
        }
        if (this.f1799.size() <= 0 && this.f1787.size() <= 0) {
            return sb;
        }
        String m4205 = C2098.m4205(sb, "tgts(");
        if (this.f1799.size() > 0) {
            for (int i = 0; i < this.f1799.size(); i++) {
                if (i > 0) {
                    m4205 = C2098.m4205(m4205, ", ");
                }
                StringBuilder m42072 = C2098.m4207(m4205);
                m42072.append(this.f1799.get(i));
                m4205 = m42072.toString();
            }
        }
        if (this.f1787.size() > 0) {
            for (int i2 = 0; i2 < this.f1787.size(); i2++) {
                if (i2 > 0) {
                    m4205 = C2098.m4205(m4205, ", ");
                }
                StringBuilder m42073 = C2098.m4207(m4205);
                m42073.append(this.f1787.get(i2));
                m4205 = m42073.toString();
            }
        }
        return C2098.m4205(m4205, ")");
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m1029(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C1700 c1700 = new C1700(view);
            if (z) {
                mo986(c1700);
            } else {
                mo988(c1700);
            }
            c1700.f7839.add(this);
            mo1033(c1700);
            m1013(z ? this.f1785 : this.f1804, view, c1700);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1029(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void mo1030(ViewGroup viewGroup, C1696 c1696, C1696 c16962, ArrayList<C1700> arrayList, ArrayList<C1700> arrayList2) {
        Animator mo990;
        int i;
        int i2;
        View view;
        Animator animator;
        C1700 c1700;
        Animator animator2;
        C1700 c17002;
        C1502<Animator, C0284> m1012 = m1012();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C1700 c17003 = arrayList.get(i3);
            C1700 c17004 = arrayList2.get(i3);
            if (c17003 != null && !c17003.f7839.contains(this)) {
                c17003 = null;
            }
            if (c17004 != null && !c17004.f7839.contains(this)) {
                c17004 = null;
            }
            if (c17003 != null || c17004 != null) {
                if ((c17003 == null || c17004 == null || mo1036(c17003, c17004)) && (mo990 = mo990(viewGroup, c17003, c17004)) != null) {
                    if (c17004 != null) {
                        view = c17004.f7838;
                        String[] mo987 = mo987();
                        if (mo987 != null && mo987.length > 0) {
                            c17002 = new C1700(view);
                            i = size;
                            C1700 c17005 = c16962.f7836.get(view);
                            if (c17005 != null) {
                                int i4 = 0;
                                while (i4 < mo987.length) {
                                    c17002.f7840.put(mo987[i4], c17005.f7840.get(mo987[i4]));
                                    i4++;
                                    i3 = i3;
                                    c17005 = c17005;
                                }
                            }
                            i2 = i3;
                            int i5 = m1012.f6910;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator2 = mo990;
                                    break;
                                }
                                C0284 c0284 = m1012.get(m1012.m3246(i6));
                                if (c0284.f1807 != null && c0284.f1808 == view && c0284.f1806.equals(this.f1786) && c0284.f1807.equals(c17002)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator2 = mo990;
                            c17002 = null;
                        }
                        animator = animator2;
                        c1700 = c17002;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c17003.f7838;
                        animator = mo990;
                        c1700 = null;
                    }
                    if (animator != null) {
                        AbstractC1738 abstractC1738 = this.f1793;
                        if (abstractC1738 != null) {
                            long mo3753 = abstractC1738.mo3753(viewGroup, this, c17003, c17004);
                            sparseIntArray.put(this.f1801.size(), (int) mo3753);
                            j = Math.min(mo3753, j);
                        }
                        m1012.put(animator, new C0284(view, this.f1786, this, C1714.m3760(viewGroup), c1700));
                        this.f1801.add(animator);
                        j = j;
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator3 = this.f1801.get(sparseIntArray.keyAt(i7));
                animator3.setStartDelay(animator3.getStartDelay() + (sparseIntArray.valueAt(i7) - j));
            }
        }
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public void mo1031(View view) {
        int i;
        if (this.f1790) {
            return;
        }
        C1502<Animator, C0284> m1012 = m1012();
        int i2 = m1012.f6910;
        InterfaceC1699 m3760 = C1714.m3760(view);
        int i3 = i2 - 1;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            C0284 m3255 = m1012.m3255(i3);
            if (m3255.f1808 != null && m3760.equals(m3255.f1810)) {
                Animator m3246 = m1012.m3246(i3);
                if (Build.VERSION.SDK_INT >= 19) {
                    m3246.pause();
                } else {
                    ArrayList<Animator.AnimatorListener> listeners = m3246.getListeners();
                    if (listeners != null) {
                        int size = listeners.size();
                        while (i < size) {
                            Animator.AnimatorListener animatorListener = listeners.get(i);
                            if (animatorListener instanceof InterfaceC1709) {
                                ((InterfaceC1709) animatorListener).onAnimationPause(m3246);
                            }
                            i++;
                        }
                    }
                }
            }
            i3--;
        }
        ArrayList<InterfaceC0287> arrayList = this.f1795;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f1795.clone();
            int size2 = arrayList2.size();
            while (i < size2) {
                ((InterfaceC0287) arrayList2.get(i)).mo992(this);
                i++;
            }
        }
        this.f1789 = true;
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public Transition mo1032(TimeInterpolator timeInterpolator) {
        this.f1796 = timeInterpolator;
        return this;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void mo1033(C1700 c1700) {
        boolean z;
        if (this.f1793 == null || c1700.f7840.isEmpty()) {
            return;
        }
        this.f1793.getClass();
        String[] strArr = AbstractC1692.f7825;
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                z = true;
                break;
            } else {
                if (!c1700.f7840.containsKey(strArr[i])) {
                    z = false;
                    break;
                }
                i++;
            }
        }
        if (z) {
            return;
        }
        ((AbstractC1692) this.f1793).getClass();
        View view = c1700.f7838;
        Integer num = (Integer) c1700.f7840.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        c1700.f7840.put("android:visibilityPropagation:visibility", num);
        int[] iArr = {Math.round(view.getTranslationX()) + r5, 0};
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        iArr[0] = (view.getWidth() / 2) + iArr[0];
        iArr[1] = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = (view.getHeight() / 2) + iArr[1];
        c1700.f7840.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public void mo1034(AbstractC0285 abstractC0285) {
        this.f1794 = abstractC0285;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void m1035() {
        int i = this.f1791 - 1;
        this.f1791 = i;
        if (i == 0) {
            ArrayList<InterfaceC0287> arrayList = this.f1795;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1795.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC0287) arrayList2.get(i2)).mo993(this);
                }
            }
            for (int i3 = 0; i3 < this.f1785.f7835.m3275(); i3++) {
                View m3283 = this.f1785.f7835.m3283(i3);
                if (m3283 != null) {
                    C1096.m2480(m3283, false);
                }
            }
            for (int i4 = 0; i4 < this.f1804.f7835.m3275(); i4++) {
                View m32832 = this.f1804.f7835.m3283(i4);
                if (m32832 != null) {
                    C1096.m2480(m32832, false);
                }
            }
            this.f1790 = true;
        }
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean mo1036(C1700 c1700, C1700 c17002) {
        if (c1700 == null || c17002 == null) {
            return false;
        }
        String[] mo987 = mo987();
        if (mo987 == null) {
            Iterator<String> it = c1700.f7840.keySet().iterator();
            while (it.hasNext()) {
                if (m1014(c1700, c17002, it.next())) {
                }
            }
            return false;
        }
        for (String str : mo987) {
            if (!m1014(c1700, c17002, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public Transition mo1037(long j) {
        this.f1802 = j;
        return this;
    }

    /* renamed from: びぐびあび */
    public abstract void mo988(C1700 c1700);

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public Transition mo1038(InterfaceC0287 interfaceC0287) {
        ArrayList<InterfaceC0287> arrayList = this.f1795;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(interfaceC0287);
        if (this.f1795.size() == 0) {
            this.f1795 = null;
        }
        return this;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Rect m1039() {
        AbstractC0285 abstractC0285 = this.f1794;
        if (abstractC0285 == null) {
            return null;
        }
        return abstractC0285.mo1042(this);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m1040(boolean z) {
        C1696 c1696;
        if (z) {
            this.f1785.f7836.clear();
            this.f1785.f7834.clear();
            c1696 = this.f1785;
        } else {
            this.f1804.f7836.clear();
            this.f1804.f7834.clear();
            c1696 = this.f1804;
        }
        c1696.f7835.m3276();
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public Transition mo1041(long j) {
        this.f1792 = j;
        return this;
    }

    /* renamed from: ぺふねづ〺 */
    public Animator mo990(ViewGroup viewGroup, C1700 c1700, C1700 c17002) {
        return null;
    }
}
