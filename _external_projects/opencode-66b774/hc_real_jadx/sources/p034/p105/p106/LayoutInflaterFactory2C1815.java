package p034.p105.p106;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p034.p035.p042.C1054;
import p034.p035.p045.ViewTreeObserverOnPreDrawListenerC1111;
import p034.p073.AbstractC1459;
import p034.p073.InterfaceC1460;
import p034.p073.InterfaceC1461;
import p034.p080.C1493;
import p034.p080.C1501;
import p034.p094.AbstractC1666;
import p034.p094.AbstractC1674;
import p034.p094.AbstractC1680;
import p034.p094.C1661;
import p034.p094.C1679;
import p034.p094.InterfaceC1667;
import p034.p094.InterfaceC1673;
import p034.p101.p102.AbstractC1773;
import p034.p105.p106.AbstractC1788;
import p034.p105.p106.C1808;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class LayoutInflaterFactory2C1815 extends AbstractC1780 implements LayoutInflater.Factory2 {

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public static final Interpolator f8138 = new DecelerateInterpolator(2.5f);

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static final Interpolator f8139 = new DecelerateInterpolator(1.5f);

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public boolean f8141;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public ArrayList<Fragment> f8143;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public ArrayList<C1794> f8145;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public boolean f8147;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public AbstractC1784 f8148;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public Fragment f8151;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f8152;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public AbstractC1812 f8153;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public ArrayList<C1819> f8154;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f8155;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public boolean f8157;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public ArrayList<Fragment> f8160;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public ArrayList<C1794> f8161;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public Fragment f8162;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public ArrayList<Boolean> f8163;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ArrayList<InterfaceC1816> f8164;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public boolean f8165;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public ArrayList<Integer> f8166;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public ArrayList<C1794> f8167;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public C1808 f8168;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public OnBackPressedDispatcher f8169;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f8159 = 0;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final ArrayList<Fragment> f8142 = new ArrayList<>();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final HashMap<String, Fragment> f8140 = new HashMap<>();

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final AbstractC1459 f8156 = new C1821(false);

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final CopyOnWriteArrayList<C1823> f8150 = new CopyOnWriteArrayList<>();

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f8146 = 0;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public Bundle f8158 = null;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public SparseArray<Parcelable> f8144 = null;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public Runnable f8149 = new RunnableC1817();

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$〳ぜぞぜべっ, reason: contains not printable characters */
    public interface InterfaceC1816 {
        /* renamed from: げつ〴ぬぐ */
        boolean mo3844(ArrayList<C1794> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$〺つふすそ, reason: contains not printable characters */
    public class RunnableC1817 implements Runnable {
        public RunnableC1817() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C1815.this.m3931();
        }
    }

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$ぁごぐすすぃ, reason: contains not printable characters */
    public static class C1818 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static final int[] f8171 = {R.attr.name, R.attr.id, R.attr.tag};
    }

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$いいにぽつ, reason: contains not printable characters */
    public static class C1819 implements Fragment.InterfaceC0169 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final C1794 f8172;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f8173;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final boolean f8174;

        public C1819(C1794 c1794, boolean z) {
            this.f8174 = z;
            this.f8172 = c1794;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m3943() {
            boolean z = this.f8173 > 0;
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f8172.f8067;
            int size = layoutInflaterFactory2C1815.f8142.size();
            for (int i = 0; i < size; i++) {
                layoutInflaterFactory2C1815.f8142.get(i).m486(null);
            }
            C1794 c1794 = this.f8172;
            c1794.f8067.m3929(c1794, this.f8174, !z, true);
        }
    }

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$くし〴〺ぅ, reason: contains not printable characters */
    public class C1820 extends C1806 {
        public C1820() {
        }

        @Override // p034.p105.p106.C1806
        /* renamed from: げつ〴ぬぐ */
        public Fragment mo3869(ClassLoader classLoader, String str) {
            AbstractC1784 abstractC1784 = LayoutInflaterFactory2C1815.this.f8148;
            Context context = abstractC1784.f8025;
            abstractC1784.getClass();
            Object obj = Fragment.f1171;
            try {
                return C1806.m3868(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throw new Fragment.C0168(C2098.m4187("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (InstantiationException e2) {
                throw new Fragment.C0168(C2098.m4187("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new Fragment.C0168(C2098.m4187("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new Fragment.C0168(C2098.m4187("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1821 extends AbstractC1459 {
        public C1821(boolean z) {
            super(z);
        }

        @Override // p034.p073.AbstractC1459
        /* renamed from: げつ〴ぬぐ */
        public void mo3198() {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = LayoutInflaterFactory2C1815.this;
            layoutInflaterFactory2C1815.m3931();
            if (layoutInflaterFactory2C1815.f8156.f6755) {
                layoutInflaterFactory2C1815.mo3824();
            } else {
                layoutInflaterFactory2C1815.f8169.m41();
            }
        }
    }

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$づざかべべ, reason: contains not printable characters */
    public static class RunnableC1822 extends AnimationSet implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final ViewGroup f8177;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final View f8178;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f8179;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f8180;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f8181;

        public RunnableC1822(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f8180 = true;
            this.f8177 = viewGroup;
            this.f8178 = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f8180 = true;
            if (this.f8181) {
                return !this.f8179;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f8181 = true;
                ViewTreeObserverOnPreDrawListenerC1111.m2544(this.f8177, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f8180 = true;
            if (this.f8181) {
                return !this.f8179;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f8181 = true;
                ViewTreeObserverOnPreDrawListenerC1111.m2544(this.f8177, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8181 || !this.f8180) {
                this.f8177.endViewTransition(this.f8178);
                this.f8179 = true;
            } else {
                this.f8180 = false;
                this.f8177.post(this);
            }
        }
    }

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$なぎぱいぢぎ, reason: contains not printable characters */
    public static final class C1823 {
    }

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$びぐびあび, reason: contains not printable characters */
    public static class C1824 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Animator f8182;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Animation f8183;

        public C1824(Animator animator) {
            this.f8183 = null;
            this.f8182 = animator;
        }

        public C1824(Animation animation) {
            this.f8183 = animation;
            this.f8182 = null;
        }
    }

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$ぺぁあねじ, reason: contains not printable characters */
    public class C1825 implements InterfaceC1816 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f8184;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int f8186;

        public C1825(String str, int i, int i2) {
            this.f8186 = i;
            this.f8184 = i2;
        }

        @Override // p034.p105.p106.LayoutInflaterFactory2C1815.InterfaceC1816
        /* renamed from: げつ〴ぬぐ */
        public boolean mo3844(ArrayList<C1794> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = LayoutInflaterFactory2C1815.this.f8151;
            if (fragment == null || this.f8186 >= 0 || !fragment.m530().mo3824()) {
                return LayoutInflaterFactory2C1815.this.m3888(arrayList, arrayList2, null, this.f8186, this.f8184);
            }
            return false;
        }
    }

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public static C1824 m3873(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f8138);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f8139);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new C1824(animationSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1818.f8171);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 != null) {
            ClassLoader classLoader = context.getClassLoader();
            C1493<String, Class<?>> c1493 = C1806.f8114;
            try {
                z = Fragment.class.isAssignableFrom(C1806.m3867(classLoader, str2));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
                }
                Fragment m3940 = resourceId != -1 ? m3940(resourceId) : null;
                if (m3940 == null && string != null) {
                    m3940 = mo3822(string);
                }
                if (m3940 == null && id != -1) {
                    m3940 = m3940(id);
                }
                if (m3940 == null) {
                    m3940 = m3875().mo3869(context.getClassLoader(), str2);
                    m3940.f1214 = true;
                    m3940.f1212 = resourceId != 0 ? resourceId : id;
                    m3940.f1175 = id;
                    m3940.f1184 = string;
                    m3940.f1188 = true;
                    m3940.f1208 = this;
                    AbstractC1784 abstractC1784 = this.f8148;
                    m3940.f1192 = abstractC1784;
                    Context context2 = abstractC1784.f8025;
                    m3940.m517(attributeSet, m3940.f1189);
                    m3881(m3940, true);
                } else {
                    if (m3940.f1188) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
                    }
                    m3940.f1188 = true;
                    AbstractC1784 abstractC17842 = this.f8148;
                    m3940.f1192 = abstractC17842;
                    Context context3 = abstractC17842.f8025;
                    m3940.m517(attributeSet, m3940.f1189);
                }
                Fragment fragment = m3940;
                int i = this.f8146;
                if (i >= 1 || !fragment.f1214) {
                    m3922(fragment, i, 0, 0, false);
                } else {
                    m3922(fragment, 1, 0, 0, false);
                }
                View view2 = fragment.f1186;
                if (view2 == null) {
                    throw new IllegalStateException(C2098.m4187("Fragment ", str2, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragment.f1186.getTag() == null) {
                    fragment.f1186.setTag(string);
                }
                return fragment.f1186;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f8162;
        if (obj == null) {
            obj = this.f8148;
        }
        C2786.m4817(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public void m3874(Fragment fragment) {
        Animator animator;
        if (fragment != null && this.f8140.containsKey(fragment.f1205)) {
            int i = this.f8146;
            if (fragment.f1207) {
                i = fragment.m485() ? Math.min(i, 1) : Math.min(i, 0);
            }
            m3922(fragment, i, fragment.m488(), fragment.m491(), false);
            View view = fragment.f1186;
            if (view != null) {
                ViewGroup viewGroup = fragment.f1216;
                Fragment fragment2 = null;
                if (viewGroup != null && view != null) {
                    int indexOf = this.f8142.indexOf(fragment);
                    while (true) {
                        indexOf--;
                        if (indexOf < 0) {
                            break;
                        }
                        Fragment fragment3 = this.f8142.get(indexOf);
                        if (fragment3.f1216 == viewGroup && fragment3.f1186 != null) {
                            fragment2 = fragment3;
                            break;
                        }
                    }
                }
                if (fragment2 != null) {
                    View view2 = fragment2.f1186;
                    ViewGroup viewGroup2 = fragment.f1216;
                    int indexOfChild = viewGroup2.indexOfChild(view2);
                    int indexOfChild2 = viewGroup2.indexOfChild(fragment.f1186);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup2.removeViewAt(indexOfChild2);
                        viewGroup2.addView(fragment.f1186, indexOfChild);
                    }
                }
                if (fragment.f1174 && fragment.f1216 != null) {
                    float f = fragment.f1191;
                    if (f > 0.0f) {
                        fragment.f1186.setAlpha(f);
                    }
                    fragment.f1191 = 0.0f;
                    fragment.f1174 = false;
                    C1824 m3898 = m3898(fragment, fragment.m488(), true, fragment.m491());
                    if (m3898 != null) {
                        Animation animation = m3898.f8183;
                        if (animation != null) {
                            fragment.f1186.startAnimation(animation);
                        } else {
                            m3898.f8182.setTarget(fragment.f1186);
                            m3898.f8182.start();
                        }
                    }
                }
            }
            if (fragment.f1181) {
                if (fragment.f1186 != null) {
                    C1824 m38982 = m3898(fragment, fragment.m488(), !fragment.f1180, fragment.m491());
                    if (m38982 == null || (animator = m38982.f8182) == null) {
                        if (m38982 != null) {
                            fragment.f1186.startAnimation(m38982.f8183);
                            m38982.f8183.start();
                        }
                        fragment.f1186.setVisibility((!fragment.f1180 || fragment.m515()) ? 0 : 8);
                        if (fragment.m515()) {
                            fragment.m516(false);
                        }
                    } else {
                        animator.setTarget(fragment.f1186);
                        if (!fragment.f1180) {
                            fragment.f1186.setVisibility(0);
                        } else if (fragment.m515()) {
                            fragment.m516(false);
                        } else {
                            ViewGroup viewGroup3 = fragment.f1216;
                            View view3 = fragment.f1186;
                            viewGroup3.startViewTransition(view3);
                            m38982.f8182.addListener(new C1800(this, viewGroup3, view3, fragment));
                        }
                        m38982.f8182.start();
                    }
                }
                if (fragment.f1201 && m3902(fragment)) {
                    this.f8152 = true;
                }
                fragment.f1181 = false;
            }
        }
    }

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public C1806 m3875() {
        if (this.f8009 == null) {
            this.f8009 = AbstractC1780.f8008;
        }
        C1806 c1806 = this.f8009;
        C1806 c18062 = AbstractC1780.f8008;
        if (c1806 == c18062) {
            Fragment fragment = this.f8162;
            if (fragment != null) {
                return fragment.f1208.m3875();
            }
            this.f8009 = new C1820();
        }
        if (this.f8009 == null) {
            this.f8009 = c18062;
        }
        return this.f8009;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m3876(AbstractC1784 abstractC1784, AbstractC1812 abstractC1812, Fragment fragment) {
        if (this.f8148 != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f8148 = abstractC1784;
        this.f8153 = abstractC1812;
        this.f8162 = fragment;
        if (fragment != null) {
            m3878();
        }
        if (abstractC1784 instanceof InterfaceC1460) {
            InterfaceC1460 interfaceC1460 = (InterfaceC1460) abstractC1784;
            OnBackPressedDispatcher mo37 = interfaceC1460.mo37();
            this.f8169 = mo37;
            Fragment fragment2 = interfaceC1460;
            if (fragment != null) {
                fragment2 = fragment;
            }
            AbstractC1459 abstractC1459 = this.f8156;
            mo37.getClass();
            AbstractC1680 mo36 = fragment2.mo36();
            if (((C1661) mo36).f7776 != AbstractC1680.EnumC1681.DESTROYED) {
                abstractC1459.f6754.add(mo37.new LifecycleOnBackPressedCancellable(mo36, abstractC1459));
            }
        }
        if (fragment != null) {
            C1808 c1808 = fragment.f1208.f8168;
            C1808 c18082 = c1808.f8117.get(fragment.f1205);
            if (c18082 == null) {
                c18082 = new C1808(c1808.f8118);
                c1808.f8117.put(fragment.f1205, c18082);
            }
            this.f8168 = c18082;
            return;
        }
        if (!(abstractC1784 instanceof InterfaceC1673)) {
            this.f8168 = new C1808(false);
            return;
        }
        C1679 mo39 = ((InterfaceC1673) abstractC1784).mo39();
        InterfaceC1667 interfaceC1667 = C1808.f8115;
        String canonicalName = C1808.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String m4205 = C2098.m4205("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
        AbstractC1666 abstractC1666 = mo39.f7795.get(m4205);
        if (!C1808.class.isInstance(abstractC1666)) {
            abstractC1666 = interfaceC1667 instanceof AbstractC1674 ? ((AbstractC1674) interfaceC1667).m3646(m4205, C1808.class) : ((C1808.C1809) interfaceC1667).m3871(C1808.class);
            AbstractC1666 put = mo39.f7795.put(m4205, abstractC1666);
            if (put != null) {
                put.mo3638();
            }
        }
        this.f8168 = (C1808) abstractC1666;
    }

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public void m3877(Fragment fragment) {
        if (this.f8140.get(fragment.f1205) != null) {
            return;
        }
        this.f8140.put(fragment.f1205, fragment);
    }

    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public final void m3878() {
        ArrayList<InterfaceC1816> arrayList = this.f8164;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f8156.f6755 = true;
            return;
        }
        AbstractC1459 abstractC1459 = this.f8156;
        ArrayList<C1794> arrayList2 = this.f8167;
        abstractC1459.f6755 = (arrayList2 != null ? arrayList2.size() : 0) > 0 && m3914(this.f8162);
    }

    @Override // p034.p105.p106.AbstractC1780
    /* renamed from: 〺つふすそ */
    public Fragment mo3820(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.f8140.get(string);
        if (fragment != null) {
            return fragment;
        }
        m3911(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public final void m3879(Fragment fragment) {
        if (fragment == null || this.f8140.get(fragment.f1205) != fragment) {
            return;
        }
        boolean m3914 = fragment.f1208.m3914(fragment);
        Boolean bool = fragment.f1217;
        if (bool == null || bool.booleanValue() != m3914) {
            fragment.f1217 = Boolean.valueOf(m3914);
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment.f1194;
            layoutInflaterFactory2C1815.m3878();
            layoutInflaterFactory2C1815.m3879(layoutInflaterFactory2C1815.f8151);
        }
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public void m3880(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3880(fragment, bundle, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m3881(Fragment fragment, boolean z) {
        m3877(fragment);
        if (fragment.f1210) {
            return;
        }
        if (this.f8142.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f8142) {
            this.f8142.add(fragment);
        }
        fragment.f1201 = true;
        fragment.f1207 = false;
        if (fragment.f1186 == null) {
            fragment.f1181 = false;
        }
        if (m3902(fragment)) {
            this.f8152 = true;
        }
        if (z) {
            m3922(fragment, this.f8146, 0, 0, false);
        }
    }

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public void m3882(Fragment fragment) {
        if (fragment.f1197 == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.f8144;
        if (sparseArray == null) {
            this.f8144 = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.f1197.saveHierarchyState(this.f8144);
        if (this.f8144.size() > 0) {
            fragment.f1211 = this.f8144;
            this.f8144 = null;
        }
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public void m3883() {
        if (this.f8147) {
            this.f8147 = false;
            m3899();
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final void m3884() {
        this.f8140.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public void m3885(Fragment fragment, AbstractC1680.EnumC1681 enumC1681) {
        if (this.f8140.get(fragment.f1205) == fragment && (fragment.f1192 == null || fragment.f1208 == this)) {
            fragment.f1200 = enumC1681;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public void m3886(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3886(fragment, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public void m3887(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3887(fragment, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public boolean m3888(ArrayList<C1794> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        ArrayList<C1794> arrayList3 = this.f8167;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f8167.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C1794 c1794 = this.f8167.get(size2);
                    if ((str != null && str.equals(c1794.f8047)) || (i >= 0 && i == c1794.f8069)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C1794 c17942 = this.f8167.get(size2);
                        if (str == null || !str.equals(c17942.f8047)) {
                            if (i < 0 || i != c17942.f8069) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            }
            if (i3 == this.f8167.size() - 1) {
                return false;
            }
            for (int size3 = this.f8167.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f8167.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public void m3889(boolean z) {
        int size = this.f8142.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.f8142.get(size);
            if (fragment != null) {
                fragment.f1194.m3889(z);
            }
        }
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean m3890(MenuItem menuItem) {
        if (this.f8146 < 1) {
            return false;
        }
        for (int i = 0; i < this.f8142.size(); i++) {
            Fragment fragment = this.f8142.get(i);
            if (fragment != null) {
                if (!fragment.f1180 && fragment.f1194.m3890(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public final void m3891(boolean z) {
        if (this.f8155) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f8148 == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f8148.f8028.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            m3942();
        }
        if (this.f8145 == null) {
            this.f8145 = new ArrayList<>();
            this.f8163 = new ArrayList<>();
        }
        this.f8155 = true;
        try {
            m3906(null, null);
        } finally {
            this.f8155 = false;
        }
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public void m3892(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3892(fragment, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void m3893() {
        this.f8157 = false;
        this.f8165 = false;
        m3923(1);
    }

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public final void m3894(ArrayList<C1794> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m3906(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f8037) {
                if (i2 != i) {
                    m3908(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f8037) {
                        i2++;
                    }
                }
                m3908(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m3908(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public void m3895(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3895(fragment, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public void m3896(Menu menu) {
        if (this.f8146 < 1) {
            return;
        }
        for (int i = 0; i < this.f8142.size(); i++) {
            Fragment fragment = this.f8142.get(i);
            if (fragment != null && !fragment.f1180) {
                fragment.f1194.m3896(menu);
            }
        }
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void m3897(Configuration configuration) {
        for (int i = 0; i < this.f8142.size(); i++) {
            Fragment fragment = this.f8142.get(i);
            if (fragment != null) {
                fragment.f1196 = true;
                fragment.f1194.m3897(configuration);
            }
        }
    }

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public C1824 m3898(Fragment fragment, int i, boolean z, int i2) {
        int m495 = fragment.m495();
        boolean z2 = false;
        fragment.m520(0);
        ViewGroup viewGroup = fragment.f1216;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        char c = 1;
        if (m495 != 0) {
            boolean equals = "anim".equals(this.f8148.f8025.getResources().getResourceTypeName(m495));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f8148.f8025, m495);
                    if (loadAnimation != null) {
                        return new C1824(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f8148.f8025, m495);
                    if (loadAnimator != null) {
                        return new C1824(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (equals) {
                        throw e2;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f8148.f8025, m495);
                    if (loadAnimation2 != null) {
                        return new C1824(loadAnimation2);
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        if (i != 4097) {
            c = i != 4099 ? i != 8194 ? (char) 65535 : z ? (char) 3 : (char) 4 : z ? (char) 5 : (char) 6;
        } else if (!z) {
            c = 2;
        }
        if (c < 0) {
            return null;
        }
        switch (c) {
            case 1:
                return m3873(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m3873(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m3873(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m3873(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setInterpolator(f8139);
                alphaAnimation.setDuration(220L);
                return new C1824(alphaAnimation);
            case 6:
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setInterpolator(f8139);
                alphaAnimation2.setDuration(220L);
                return new C1824(alphaAnimation2);
            default:
                if (i2 == 0 && this.f8148.mo551()) {
                    this.f8148.mo542();
                }
                return null;
        }
    }

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public void m3899() {
        for (Fragment fragment : this.f8140.values()) {
            if (fragment != null) {
                m3928(fragment);
            }
        }
    }

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public void m3900() {
        this.f8157 = false;
        this.f8165 = false;
        int size = this.f8142.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f8142.get(i);
            if (fragment != null) {
                fragment.f1194.m3900();
            }
        }
    }

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public void m3901(int i, boolean z) {
        AbstractC1784 abstractC1784;
        if (this.f8148 == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f8146) {
            this.f8146 = i;
            int size = this.f8142.size();
            for (int i2 = 0; i2 < size; i2++) {
                m3874(this.f8142.get(i2));
            }
            for (Fragment fragment : this.f8140.values()) {
                if (fragment != null && (fragment.f1207 || fragment.f1210)) {
                    if (!fragment.f1174) {
                        m3874(fragment);
                    }
                }
            }
            m3899();
            if (this.f8152 && (abstractC1784 = this.f8148) != null && this.f8146 == 4) {
                abstractC1784.mo543();
                this.f8152 = false;
            }
        }
    }

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public final boolean m3902(Fragment fragment) {
        boolean z;
        if (fragment.f1203 && fragment.f1179) {
            return true;
        }
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment.f1194;
        Iterator<Fragment> it = layoutInflaterFactory2C1815.f8140.values().iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Fragment next = it.next();
            if (next != null) {
                z2 = layoutInflaterFactory2C1815.m3902(next);
            }
            if (z2) {
                z = true;
                break;
            }
        }
        return z;
    }

    @Override // p034.p105.p106.AbstractC1780
    /* renamed from: くし〴〺ぅ */
    public boolean mo3821() {
        return this.f8157 || this.f8165;
    }

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public final void m3903() {
        if (this.f8154 != null) {
            while (!this.f8154.isEmpty()) {
                this.f8154.remove(0).m3943();
            }
        }
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public boolean m3904(MenuItem menuItem) {
        if (this.f8146 < 1) {
            return false;
        }
        for (int i = 0; i < this.f8142.size(); i++) {
            Fragment fragment = this.f8142.get(i);
            if (fragment != null) {
                if (!fragment.f1180 && ((fragment.f1203 && fragment.f1179 && fragment.mo483(menuItem)) || fragment.f1194.m3904(menuItem))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public boolean m3905(Menu menu) {
        if (this.f8146 < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f8142.size(); i++) {
            Fragment fragment = this.f8142.get(i);
            if (fragment != null && fragment.m519(menu)) {
                z = true;
            }
        }
        return z;
    }

    @Override // p034.p105.p106.AbstractC1780
    /* renamed from: げつ〴ぬぐ */
    public Fragment mo3822(String str) {
        if (str != null) {
            for (int size = this.f8142.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f8142.get(size);
                if (fragment != null && str.equals(fragment.f1184)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.f8140.values()) {
            if (fragment2 != null && str.equals(fragment2.f1184)) {
                return fragment2;
            }
        }
        return null;
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public final void m3906(ArrayList<C1794> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C1819> arrayList3 = this.f8154;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C1819 c1819 = this.f8154.get(i);
            if (arrayList == null || c1819.f8174 || (indexOf2 = arrayList.indexOf(c1819.f8172)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if ((c1819.f8173 == 0) || (arrayList != null && c1819.f8172.m3843(arrayList, 0, arrayList.size()))) {
                    this.f8154.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || c1819.f8174 || (indexOf = arrayList.indexOf(c1819.f8172)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        c1819.m3943();
                    }
                }
                i++;
            } else {
                this.f8154.remove(i);
                i--;
                size--;
            }
            C1794 c1794 = c1819.f8172;
            c1794.f8067.m3929(c1794, c1819.f8174, false, false);
            i++;
        }
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void m3907() {
        for (int i = 0; i < this.f8142.size(); i++) {
            Fragment fragment = this.f8142.get(i);
            if (fragment != null) {
                fragment.m531();
            }
        }
    }

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public final void m3908(ArrayList<C1794> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z2 = arrayList.get(i).f8037;
        ArrayList<Fragment> arrayList4 = this.f8160;
        if (arrayList4 == null) {
            this.f8160 = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.f8160.addAll(this.f8142);
        Fragment fragment = this.f8151;
        int i8 = i;
        boolean z3 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i2) {
                this.f8160.clear();
                if (!z2) {
                    C1796.m3854(this, arrayList, arrayList2, i, i2, false);
                }
                int i10 = i;
                while (i10 < i2) {
                    C1794 c1794 = arrayList.get(i10);
                    if (arrayList2.get(i10).booleanValue()) {
                        c1794.m3848(-1);
                        c1794.m3846(i10 == i2 + (-1));
                    } else {
                        c1794.m3848(1);
                        c1794.m3845();
                    }
                    i10++;
                }
                if (z2) {
                    C1501<Fragment> c1501 = new C1501<>(0);
                    m3924(c1501);
                    i3 = i;
                    int i11 = i2;
                    for (int i12 = i2 - 1; i12 >= i3; i12--) {
                        C1794 c17942 = arrayList.get(i12);
                        boolean booleanValue = arrayList2.get(i12).booleanValue();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= c17942.f8040.size()) {
                                z = false;
                            } else if (C1794.m3841(c17942.f8040.get(i13))) {
                                z = true;
                            } else {
                                i13++;
                            }
                        }
                        if (z && !c17942.m3843(arrayList, i12 + 1, i2)) {
                            if (this.f8154 == null) {
                                this.f8154 = new ArrayList<>();
                            }
                            C1819 c1819 = new C1819(c17942, booleanValue);
                            this.f8154.add(c1819);
                            for (int i14 = 0; i14 < c17942.f8040.size(); i14++) {
                                AbstractC1788.C1789 c1789 = c17942.f8040.get(i14);
                                if (C1794.m3841(c1789)) {
                                    c1789.f8050.m486(c1819);
                                }
                            }
                            if (booleanValue) {
                                c17942.m3845();
                            } else {
                                c17942.m3846(false);
                            }
                            i11--;
                            if (i12 != i11) {
                                arrayList.remove(i12);
                                arrayList.add(i11, c17942);
                            }
                            m3924(c1501);
                        }
                    }
                    int i15 = c1501.f6936;
                    for (int i16 = 0; i16 < i15; i16++) {
                        Fragment fragment2 = (Fragment) c1501.f6934[i16];
                        if (!fragment2.f1201) {
                            View m509 = fragment2.m509();
                            fragment2.f1191 = m509.getAlpha();
                            m509.setAlpha(0.0f);
                        }
                    }
                    i4 = i11;
                } else {
                    i3 = i;
                    i4 = i2;
                }
                if (i4 != i3 && z2) {
                    C1796.m3854(this, arrayList, arrayList2, i, i4, true);
                    m3901(this.f8146, true);
                }
                while (i3 < i2) {
                    C1794 c17943 = arrayList.get(i3);
                    if (arrayList2.get(i3).booleanValue() && (i5 = c17943.f8069) >= 0) {
                        synchronized (this) {
                            this.f8161.set(i5, null);
                            if (this.f8166 == null) {
                                this.f8166 = new ArrayList<>();
                            }
                            this.f8166.add(Integer.valueOf(i5));
                        }
                        c17943.f8069 = -1;
                    }
                    c17943.getClass();
                    i3++;
                }
                return;
            }
            C1794 c17944 = arrayList.get(i8);
            int i17 = 3;
            if (arrayList3.get(i8).booleanValue()) {
                int i18 = 1;
                ArrayList<Fragment> arrayList5 = this.f8160;
                int size = c17944.f8040.size() - 1;
                while (size >= 0) {
                    AbstractC1788.C1789 c17892 = c17944.f8040.get(size);
                    int i19 = c17892.f8053;
                    if (i19 != i18) {
                        if (i19 != 3) {
                            switch (i19) {
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = c17892.f8050;
                                    break;
                                case 10:
                                    c17892.f8049 = c17892.f8051;
                                    break;
                            }
                            size--;
                            i18 = 1;
                        }
                        arrayList5.add(c17892.f8050);
                        size--;
                        i18 = 1;
                    }
                    arrayList5.remove(c17892.f8050);
                    size--;
                    i18 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList6 = this.f8160;
                int i20 = 0;
                while (i20 < c17944.f8040.size()) {
                    AbstractC1788.C1789 c17893 = c17944.f8040.get(i20);
                    int i21 = c17893.f8053;
                    if (i21 != i9) {
                        if (i21 == 2) {
                            Fragment fragment3 = c17893.f8050;
                            int i22 = fragment3.f1175;
                            int size2 = arrayList6.size() - 1;
                            boolean z4 = false;
                            while (size2 >= 0) {
                                Fragment fragment4 = arrayList6.get(size2);
                                if (fragment4.f1175 != i22) {
                                    i7 = i22;
                                } else if (fragment4 == fragment3) {
                                    i7 = i22;
                                    z4 = true;
                                } else {
                                    if (fragment4 == fragment) {
                                        i7 = i22;
                                        c17944.f8040.add(i20, new AbstractC1788.C1789(9, fragment4));
                                        i20++;
                                        fragment = null;
                                    } else {
                                        i7 = i22;
                                    }
                                    AbstractC1788.C1789 c17894 = new AbstractC1788.C1789(3, fragment4);
                                    c17894.f8052 = c17893.f8052;
                                    c17894.f8054 = c17893.f8054;
                                    c17894.f8056 = c17893.f8056;
                                    c17894.f8055 = c17893.f8055;
                                    c17944.f8040.add(i20, c17894);
                                    arrayList6.remove(fragment4);
                                    i20++;
                                }
                                size2--;
                                i22 = i7;
                            }
                            if (z4) {
                                c17944.f8040.remove(i20);
                                i20--;
                            } else {
                                i6 = 1;
                                c17893.f8053 = 1;
                                arrayList6.add(fragment3);
                                i20 += i6;
                                i17 = 3;
                                i9 = 1;
                            }
                        } else if (i21 == i17 || i21 == 6) {
                            arrayList6.remove(c17893.f8050);
                            Fragment fragment5 = c17893.f8050;
                            if (fragment5 == fragment) {
                                c17944.f8040.add(i20, new AbstractC1788.C1789(9, fragment5));
                                i20++;
                                fragment = null;
                            }
                        } else if (i21 != 7) {
                            if (i21 == 8) {
                                c17944.f8040.add(i20, new AbstractC1788.C1789(9, fragment));
                                i20++;
                                fragment = c17893.f8050;
                            }
                        }
                        i6 = 1;
                        i20 += i6;
                        i17 = 3;
                        i9 = 1;
                    }
                    i6 = 1;
                    arrayList6.add(c17893.f8050);
                    i20 += i6;
                    i17 = 3;
                    i9 = 1;
                }
            }
            z3 = z3 || c17944.f8033;
            i8++;
            arrayList3 = arrayList2;
        }
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public void m3909(boolean z) {
        int size = this.f8142.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.f8142.get(size);
            if (fragment != null) {
                fragment.f1194.m3909(z);
            }
        }
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean m3910(Menu menu, MenuInflater menuInflater) {
        boolean z;
        boolean z2;
        if (this.f8146 < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z3 = false;
        for (int i = 0; i < this.f8142.size(); i++) {
            Fragment fragment = this.f8142.get(i);
            if (fragment != null) {
                if (fragment.f1180) {
                    z = false;
                } else {
                    if (fragment.f1203 && fragment.f1179) {
                        fragment.mo528(menu, menuInflater);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = z2 | fragment.f1194.m3910(menu, menuInflater);
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z3 = true;
                }
            }
        }
        if (this.f8143 != null) {
            for (int i2 = 0; i2 < this.f8143.size(); i2++) {
                Fragment fragment2 = this.f8143.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.getClass();
                }
            }
        }
        this.f8143 = arrayList;
        return z3;
    }

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public final void m3911(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C1054("FragmentManager"));
        AbstractC1784 abstractC1784 = this.f8148;
        try {
            if (abstractC1784 != null) {
                abstractC1784.mo541("  ", null, printWriter, new String[0]);
            } else {
                m3918("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public Parcelable m3912() {
        BackStackState[] backStackStateArr;
        ArrayList<String> arrayList;
        int size;
        m3903();
        Iterator<Fragment> it = this.f8140.values().iterator();
        while (true) {
            backStackStateArr = null;
            if (!it.hasNext()) {
                break;
            }
            Fragment next = it.next();
            if (next != null) {
                if (next.m482() != null) {
                    int m481 = next.m481();
                    View m482 = next.m482();
                    Animation animation = m482.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        m482.clearAnimation();
                    }
                    next.m478(null);
                    m3922(next, m481, 0, 0, false);
                } else if (next.m477() != null) {
                    next.m477().end();
                }
            }
        }
        m3931();
        this.f8157 = true;
        if (this.f8140.isEmpty()) {
            return null;
        }
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(this.f8140.size());
        boolean z = false;
        for (Fragment fragment : this.f8140.values()) {
            if (fragment != null) {
                if (fragment.f1208 != this) {
                    m3911(new IllegalStateException(C2098.m4193("Failure saving state: active ", fragment, " was removed from the FragmentManager")));
                    throw null;
                }
                FragmentState fragmentState = new FragmentState(fragment);
                arrayList2.add(fragmentState);
                if (fragment.f1173 <= 0 || fragmentState.f1257 != null) {
                    fragmentState.f1257 = fragment.f1189;
                } else {
                    fragmentState.f1257 = m3938(fragment);
                    String str = fragment.f1215;
                    if (str != null) {
                        Fragment fragment2 = this.f8140.get(str);
                        if (fragment2 == null) {
                            m3911(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f1215));
                            throw null;
                        }
                        if (fragmentState.f1257 == null) {
                            fragmentState.f1257 = new Bundle();
                        }
                        mo3823(fragmentState.f1257, "android:target_state", fragment2);
                        int i = fragment.f1178;
                        if (i != 0) {
                            fragmentState.f1257.putInt("android:target_req_state", i);
                        }
                    }
                }
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        int size2 = this.f8142.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it2 = this.f8142.iterator();
            while (it2.hasNext()) {
                Fragment next2 = it2.next();
                arrayList.add(next2.f1205);
                if (next2.f1208 != this) {
                    m3911(new IllegalStateException(C2098.m4193("Failure saving state: active ", next2, " was removed from the FragmentManager")));
                    throw null;
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<C1794> arrayList3 = this.f8167;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackStateArr[i2] = new BackStackState(this.f8167.get(i2));
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f1241 = arrayList2;
        fragmentManagerState.f1242 = arrayList;
        fragmentManagerState.f1245 = backStackStateArr;
        Fragment fragment3 = this.f8151;
        if (fragment3 != null) {
            fragmentManagerState.f1243 = fragment3.f1205;
        }
        fragmentManagerState.f1244 = this.f8159;
        return fragmentManagerState;
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public void m3913(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3913(fragment, bundle, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public boolean m3914(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment.f1208;
        return fragment == layoutInflaterFactory2C1815.f8151 && m3914(layoutInflaterFactory2C1815.f8162);
    }

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public void m3915(Fragment fragment) {
        if (fragment == null || (this.f8140.get(fragment.f1205) == fragment && (fragment.f1192 == null || fragment.f1208 == this))) {
            Fragment fragment2 = this.f8151;
            this.f8151 = fragment;
            m3879(fragment2);
            m3879(this.f8151);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public void m3916(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3916(fragment, view, bundle, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        return;
     */
    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3917(p034.p105.p106.LayoutInflaterFactory2C1815.InterfaceC1816 r2, boolean r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            r1.m3942()
        L5:
            monitor-enter(r1)
            boolean r0 = r1.f8141     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L24
            づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぁごぐすすぃ r0 = r1.f8148     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lf
            goto L24
        Lf:
            java.util.ArrayList<づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$〳ぜぞぜべっ> r3 = r1.f8164     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L1a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            r1.f8164 = r3     // Catch: java.lang.Throwable -> L30
        L1a:
            java.util.ArrayList<づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$〳ぜぞぜべっ> r3 = r1.f8164     // Catch: java.lang.Throwable -> L30
            r3.add(r2)     // Catch: java.lang.Throwable -> L30
            r1.m3936()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L24:
            if (r3 == 0) goto L28
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L28:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "Activity has been destroyed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            throw r2     // Catch: java.lang.Throwable -> L30
        L30:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p105.p106.LayoutInflaterFactory2C1815.m3917(づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ$〳ぜぞぜべっ, boolean):void");
    }

    @Override // p034.p105.p106.AbstractC1780
    /* renamed from: づざかべべ */
    public void mo3823(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f1208 == this) {
            bundle.putString(str, fragment.f1205);
        } else {
            m3911(new IllegalStateException(C2098.m4193("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public void m3918(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2;
        String m4205 = C2098.m4205(str, "    ");
        if (!this.f8140.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f8140.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    printWriter.print(m4205);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(fragment.f1212));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(fragment.f1175));
                    printWriter.print(" mTag=");
                    printWriter.println(fragment.f1184);
                    printWriter.print(m4205);
                    printWriter.print("mState=");
                    printWriter.print(fragment.f1173);
                    printWriter.print(" mWho=");
                    printWriter.print(fragment.f1205);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(fragment.f1195);
                    printWriter.print(m4205);
                    printWriter.print("mAdded=");
                    printWriter.print(fragment.f1201);
                    printWriter.print(" mRemoving=");
                    printWriter.print(fragment.f1207);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(fragment.f1214);
                    printWriter.print(" mInLayout=");
                    printWriter.println(fragment.f1188);
                    printWriter.print(m4205);
                    printWriter.print("mHidden=");
                    printWriter.print(fragment.f1180);
                    printWriter.print(" mDetached=");
                    printWriter.print(fragment.f1210);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(fragment.f1179);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(fragment.f1203);
                    printWriter.print(m4205);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(fragment.f1206);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(fragment.f1190);
                    if (fragment.f1208 != null) {
                        printWriter.print(m4205);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(fragment.f1208);
                    }
                    if (fragment.f1192 != null) {
                        printWriter.print(m4205);
                        printWriter.print("mHost=");
                        printWriter.println(fragment.f1192);
                    }
                    if (fragment.f1202 != null) {
                        printWriter.print(m4205);
                        printWriter.print("mParentFragment=");
                        printWriter.println(fragment.f1202);
                    }
                    if (fragment.f1176 != null) {
                        printWriter.print(m4205);
                        printWriter.print("mArguments=");
                        printWriter.println(fragment.f1176);
                    }
                    if (fragment.f1189 != null) {
                        printWriter.print(m4205);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(fragment.f1189);
                    }
                    if (fragment.f1211 != null) {
                        printWriter.print(m4205);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(fragment.f1211);
                    }
                    Object obj = fragment.f1172;
                    if (obj == null) {
                        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment.f1208;
                        obj = (layoutInflaterFactory2C1815 == null || (str2 = fragment.f1215) == null) ? null : (Fragment) layoutInflaterFactory2C1815.f8140.get(str2);
                    }
                    if (obj != null) {
                        printWriter.print(m4205);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(fragment.f1178);
                    }
                    if (fragment.m495() != 0) {
                        printWriter.print(m4205);
                        printWriter.print("mNextAnim=");
                        printWriter.println(fragment.m495());
                    }
                    if (fragment.f1216 != null) {
                        printWriter.print(m4205);
                        printWriter.print("mContainer=");
                        printWriter.println(fragment.f1216);
                    }
                    if (fragment.f1186 != null) {
                        printWriter.print(m4205);
                        printWriter.print("mView=");
                        printWriter.println(fragment.f1186);
                    }
                    if (fragment.f1197 != null) {
                        printWriter.print(m4205);
                        printWriter.print("mInnerView=");
                        printWriter.println(fragment.f1186);
                    }
                    if (fragment.m482() != null) {
                        printWriter.print(m4205);
                        printWriter.print("mAnimatingAway=");
                        printWriter.println(fragment.m482());
                        printWriter.print(m4205);
                        printWriter.print("mStateAfterAnimating=");
                        printWriter.println(fragment.m481());
                    }
                    if (fragment.m484() != null) {
                        AbstractC1773.m3819(fragment).mo3817(m4205, fileDescriptor, printWriter, strArr);
                    }
                    printWriter.print(m4205);
                    printWriter.println("Child " + fragment.f1194 + ":");
                    fragment.f1194.m3918(C2098.m4205(m4205, "  "), fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f8142.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size5; i++) {
                Fragment fragment2 = this.f8142.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f8143;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size4; i2++) {
                Fragment fragment3 = this.f8143.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<C1794> arrayList2 = this.f8167;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                C1794 c1794 = this.f8167.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c1794.toString());
                c1794.m3849(m4205, printWriter, true);
            }
        }
        synchronized (this) {
            ArrayList<C1794> arrayList3 = this.f8161;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj2 = (C1794) this.f8161.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj2);
                }
            }
            ArrayList<Integer> arrayList4 = this.f8166;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f8166.toArray()));
            }
        }
        ArrayList<InterfaceC1816> arrayList5 = this.f8164;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i5 = 0; i5 < size; i5++) {
                Object obj3 = (InterfaceC1816) this.f8164.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(obj3);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f8148);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f8153);
        if (this.f8162 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f8162);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f8146);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f8157);
        printWriter.print(" mStopped=");
        printWriter.print(this.f8165);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f8141);
        if (this.f8152) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f8152);
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final void m3919() {
        this.f8155 = false;
        this.f8163.clear();
        this.f8145.clear();
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public void m3920(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3920(fragment, bundle, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public void m3921(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3921(fragment, bundle, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r0 != 3) goto L341;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0320  */
    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3922(androidx.fragment.app.Fragment r17, int r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p105.p106.LayoutInflaterFactory2C1815.m3922(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public final void m3923(int i) {
        try {
            this.f8155 = true;
            m3901(i, false);
            this.f8155 = false;
            m3931();
        } catch (Throwable th) {
            this.f8155 = false;
            throw th;
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m3924(C1501<Fragment> c1501) {
        int i = this.f8146;
        if (i < 1) {
            return;
        }
        int min = Math.min(i, 3);
        int size = this.f8142.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f8142.get(i2);
            if (fragment.f1173 < min) {
                m3922(fragment, min, fragment.m495(), fragment.m488(), false);
                if (fragment.f1186 != null && !fragment.f1180 && fragment.f1174) {
                    c1501.add(fragment);
                }
            }
        }
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public void m3925(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3925(fragment, context, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public void m3926(Parcelable parcelable) {
        Fragment fragment;
        Bundle bundle;
        FragmentState fragmentState;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f1241 == null) {
            return;
        }
        for (Fragment fragment2 : this.f8168.f8116) {
            Iterator<FragmentState> it = fragmentManagerState.f1241.iterator();
            while (true) {
                if (it.hasNext()) {
                    fragmentState = it.next();
                    if (fragmentState.f1251.equals(fragment2.f1205)) {
                        break;
                    }
                } else {
                    fragmentState = null;
                    break;
                }
            }
            if (fragmentState == null) {
                m3922(fragment2, 1, 0, 0, false);
                fragment2.f1207 = true;
                m3922(fragment2, 0, 0, 0, false);
            } else {
                fragmentState.f1250 = fragment2;
                fragment2.f1211 = null;
                fragment2.f1195 = 0;
                fragment2.f1188 = false;
                fragment2.f1201 = false;
                Fragment fragment3 = fragment2.f1172;
                fragment2.f1215 = fragment3 != null ? fragment3.f1205 : null;
                fragment2.f1172 = null;
                Bundle bundle2 = fragmentState.f1257;
                if (bundle2 != null) {
                    bundle2.setClassLoader(this.f8148.f8025.getClassLoader());
                    fragment2.f1211 = fragmentState.f1257.getSparseParcelableArray("android:view_state");
                    fragment2.f1189 = fragmentState.f1257;
                }
            }
        }
        this.f8140.clear();
        Iterator<FragmentState> it2 = fragmentManagerState.f1241.iterator();
        while (it2.hasNext()) {
            FragmentState next = it2.next();
            if (next != null) {
                ClassLoader classLoader = this.f8148.f8025.getClassLoader();
                C1806 m3875 = m3875();
                if (next.f1250 == null) {
                    Bundle bundle3 = next.f1259;
                    if (bundle3 != null) {
                        bundle3.setClassLoader(classLoader);
                    }
                    Fragment mo3869 = m3875.mo3869(classLoader, next.f1247);
                    next.f1250 = mo3869;
                    mo3869.m475(next.f1259);
                    Bundle bundle4 = next.f1257;
                    if (bundle4 != null) {
                        bundle4.setClassLoader(classLoader);
                        fragment = next.f1250;
                        bundle = next.f1257;
                    } else {
                        fragment = next.f1250;
                        bundle = new Bundle();
                    }
                    fragment.f1189 = bundle;
                    Fragment fragment4 = next.f1250;
                    fragment4.f1205 = next.f1251;
                    fragment4.f1214 = next.f1256;
                    fragment4.f1182 = true;
                    fragment4.f1212 = next.f1252;
                    fragment4.f1175 = next.f1254;
                    fragment4.f1184 = next.f1248;
                    fragment4.f1206 = next.f1246;
                    fragment4.f1207 = next.f1258;
                    fragment4.f1210 = next.f1249;
                    fragment4.f1180 = next.f1253;
                    fragment4.f1200 = AbstractC1680.EnumC1681.values()[next.f1255];
                }
                Fragment fragment5 = next.f1250;
                fragment5.f1208 = this;
                this.f8140.put(fragment5.f1205, fragment5);
                next.f1250 = null;
            }
        }
        this.f8142.clear();
        ArrayList<String> arrayList = fragmentManagerState.f1242;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                Fragment fragment6 = this.f8140.get(next2);
                if (fragment6 == null) {
                    m3911(new IllegalStateException(C2098.m4187("No instantiated fragment for (", next2, ")")));
                    throw null;
                }
                fragment6.f1201 = true;
                if (this.f8142.contains(fragment6)) {
                    throw new IllegalStateException("Already added " + fragment6);
                }
                synchronized (this.f8142) {
                    this.f8142.add(fragment6);
                }
            }
        }
        if (fragmentManagerState.f1245 != null) {
            this.f8167 = new ArrayList<>(fragmentManagerState.f1245.length);
            int i = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f1245;
                if (i >= backStackStateArr.length) {
                    break;
                }
                BackStackState backStackState = backStackStateArr[i];
                backStackState.getClass();
                C1794 c1794 = new C1794(this);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int[] iArr = backStackState.f1157;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    AbstractC1788.C1789 c1789 = new AbstractC1788.C1789();
                    int i4 = i2 + 1;
                    c1789.f8053 = iArr[i2];
                    String str = backStackState.f1162.get(i3);
                    c1789.f8050 = str != null ? this.f8140.get(str) : null;
                    c1789.f8051 = AbstractC1680.EnumC1681.values()[backStackState.f1167[i3]];
                    c1789.f8049 = AbstractC1680.EnumC1681.values()[backStackState.f1163[i3]];
                    int[] iArr2 = backStackState.f1157;
                    int i5 = i4 + 1;
                    int i6 = iArr2[i4];
                    c1789.f8052 = i6;
                    int i7 = i5 + 1;
                    int i8 = iArr2[i5];
                    c1789.f8056 = i8;
                    int i9 = i7 + 1;
                    int i10 = iArr2[i7];
                    c1789.f8054 = i10;
                    int i11 = iArr2[i9];
                    c1789.f8055 = i11;
                    c1794.f8034 = i6;
                    c1794.f8039 = i8;
                    c1794.f8045 = i10;
                    c1794.f8041 = i11;
                    c1794.m3835(c1789);
                    i3++;
                    i2 = i9 + 1;
                }
                c1794.f8043 = backStackState.f1165;
                c1794.f8035 = backStackState.f1158;
                c1794.f8047 = backStackState.f1156;
                c1794.f8069 = backStackState.f1169;
                c1794.f8033 = true;
                c1794.f8036 = backStackState.f1159;
                c1794.f8048 = backStackState.f1170;
                c1794.f8042 = backStackState.f1164;
                c1794.f8044 = backStackState.f1166;
                c1794.f8046 = backStackState.f1168;
                c1794.f8038 = backStackState.f1161;
                c1794.f8037 = backStackState.f1160;
                c1794.m3848(1);
                this.f8167.add(c1794);
                int i12 = c1794.f8069;
                if (i12 >= 0) {
                    synchronized (this) {
                        if (this.f8161 == null) {
                            this.f8161 = new ArrayList<>();
                        }
                        int size = this.f8161.size();
                        if (i12 < size) {
                            this.f8161.set(i12, c1794);
                        } else {
                            while (size < i12) {
                                this.f8161.add(null);
                                if (this.f8166 == null) {
                                    this.f8166 = new ArrayList<>();
                                }
                                this.f8166.add(Integer.valueOf(size));
                                size++;
                            }
                            this.f8161.add(c1794);
                        }
                    }
                }
                i++;
            }
        } else {
            this.f8167 = null;
        }
        String str2 = fragmentManagerState.f1243;
        if (str2 != null) {
            Fragment fragment7 = this.f8140.get(str2);
            this.f8151 = fragment7;
            m3879(fragment7);
        }
        this.f8159 = fragmentManagerState.f1244;
    }

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public Fragment m3927(String str) {
        for (Fragment fragment : this.f8140.values()) {
            if (fragment != null) {
                if (!str.equals(fragment.f1205)) {
                    fragment = fragment.f1194.m3927(str);
                }
                if (fragment != null) {
                    return fragment;
                }
            }
        }
        return null;
    }

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public void m3928(Fragment fragment) {
        if (fragment.f1213) {
            if (this.f8155) {
                this.f8147 = true;
            } else {
                fragment.f1213 = false;
                m3922(fragment, this.f8146, 0, 0, false);
            }
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void m3929(C1794 c1794, boolean z, boolean z2, boolean z3) {
        if (z) {
            c1794.m3846(z3);
        } else {
            c1794.m3845();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c1794);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C1796.m3854(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            m3901(this.f8146, true);
        }
        for (Fragment fragment : this.f8140.values()) {
            if (fragment != null && fragment.f1186 != null && fragment.f1174 && c1794.m3847(fragment.f1175)) {
                float f = fragment.f1191;
                if (f > 0.0f) {
                    fragment.f1186.setAlpha(f);
                }
                if (z3) {
                    fragment.f1191 = 0.0f;
                } else {
                    fragment.f1191 = -1.0f;
                    fragment.f1174 = false;
                }
            }
        }
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public void m3930() {
        this.f8141 = true;
        m3931();
        m3923(0);
        this.f8148 = null;
        this.f8153 = null;
        this.f8162 = null;
        if (this.f8169 != null) {
            Iterator<InterfaceC1461> it = this.f8156.f6754.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f8169 = null;
        }
    }

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public boolean m3931() {
        boolean z;
        m3891(true);
        boolean z2 = false;
        while (true) {
            ArrayList<C1794> arrayList = this.f8145;
            ArrayList<Boolean> arrayList2 = this.f8163;
            synchronized (this) {
                ArrayList<InterfaceC1816> arrayList3 = this.f8164;
                if (arrayList3 != null && arrayList3.size() != 0) {
                    int size = this.f8164.size();
                    z = false;
                    for (int i = 0; i < size; i++) {
                        z |= this.f8164.get(i).mo3844(arrayList, arrayList2);
                    }
                    this.f8164.clear();
                    this.f8148.f8028.removeCallbacks(this.f8149);
                }
                z = false;
            }
            if (!z) {
                m3878();
                m3883();
                m3884();
                return z2;
            }
            this.f8155 = true;
            try {
                m3894(this.f8145, this.f8163);
                m3919();
                z2 = true;
            } catch (Throwable th) {
                m3919();
                throw th;
            }
        }
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public void m3932(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3932(fragment, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    @Override // p034.p105.p106.AbstractC1780
    /* renamed from: びぐびあび */
    public boolean mo3824() {
        m3942();
        m3931();
        m3891(true);
        Fragment fragment = this.f8151;
        if (fragment != null && fragment.m530().mo3824()) {
            return true;
        }
        boolean m3888 = m3888(this.f8145, this.f8163, null, -1, 0);
        if (m3888) {
            this.f8155 = true;
            try {
                m3894(this.f8145, this.f8163);
            } finally {
                m3919();
            }
        }
        m3878();
        m3883();
        m3884();
        return m3888;
    }

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public void m3933(Fragment fragment) {
        boolean z = !fragment.m485();
        if (!fragment.f1210 || z) {
            synchronized (this.f8142) {
                this.f8142.remove(fragment);
            }
            if (m3902(fragment)) {
                this.f8152 = true;
            }
            fragment.f1201 = false;
            fragment.f1207 = true;
        }
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public void m3934(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3934(fragment, context, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public void m3935(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3935(fragment, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public void m3936() {
        synchronized (this) {
            ArrayList<C1819> arrayList = this.f8154;
            boolean z = false;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList<InterfaceC1816> arrayList2 = this.f8164;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f8148.f8028.removeCallbacks(this.f8149);
                this.f8148.f8028.post(this.f8149);
                m3878();
            }
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void m3937(Fragment fragment) {
        if (fragment.f1210) {
            return;
        }
        fragment.f1210 = true;
        if (fragment.f1201) {
            synchronized (this.f8142) {
                this.f8142.remove(fragment);
            }
            if (m3902(fragment)) {
                this.f8152 = true;
            }
            fragment.f1201 = false;
        }
    }

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public Bundle m3938(Fragment fragment) {
        if (this.f8158 == null) {
            this.f8158 = new Bundle();
        }
        Bundle bundle = this.f8158;
        fragment.mo489(bundle);
        fragment.f1193.m3183(bundle);
        Parcelable m3912 = fragment.f1194.m3912();
        if (m3912 != null) {
            bundle.putParcelable("android:support:fragments", m3912);
        }
        m3913(fragment, this.f8158, false);
        Bundle bundle2 = null;
        if (!this.f8158.isEmpty()) {
            Bundle bundle3 = this.f8158;
            this.f8158 = null;
            bundle2 = bundle3;
        }
        if (fragment.f1186 != null) {
            m3882(fragment);
        }
        if (fragment.f1211 != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putSparseParcelableArray("android:view_state", fragment.f1211);
        }
        if (!fragment.f1190) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android:user_visible_hint", fragment.f1190);
        }
        return bundle2;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m3939(Fragment fragment) {
        if (fragment.f1210) {
            fragment.f1210 = false;
            if (fragment.f1201) {
                return;
            }
            if (this.f8142.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            synchronized (this.f8142) {
                this.f8142.add(fragment);
            }
            fragment.f1201 = true;
            if (m3902(fragment)) {
                this.f8152 = true;
            }
        }
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public Fragment m3940(int i) {
        for (int size = this.f8142.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f8142.get(size);
            if (fragment != null && fragment.f1212 == i) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f8140.values()) {
            if (fragment2 != null && fragment2.f1212 == i) {
                return fragment2;
            }
        }
        return null;
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public void m3941(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8162;
        if (fragment2 != null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment2.f1208;
            if (layoutInflaterFactory2C1815 instanceof LayoutInflaterFactory2C1815) {
                layoutInflaterFactory2C1815.m3941(fragment, true);
            }
        }
        Iterator<C1823> it = this.f8150.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            if (!z) {
                throw null;
            }
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final void m3942() {
        if (mo3821()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
