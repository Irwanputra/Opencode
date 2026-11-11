package p034.p105.p106;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p034.p084.p085.AbstractC1512;
import p034.p094.AbstractC1680;
import p034.p105.p106.AbstractC1788;
import p131.p150.p151.p152.C2083;
import p131.p150.p151.p153.C2091;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1814 extends AbstractC1512 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final AbstractC1780 f8134;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public AbstractC1788 f8135 = null;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Fragment f8136 = null;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f8137 = 0;

    @Deprecated
    public AbstractC1814(AbstractC1780 abstractC1780) {
        this.f8134 = abstractC1780;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static String m3872(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // p034.p084.p085.AbstractC1512
    /* renamed from: 〺つふすそ */
    public void mo3304(ViewGroup viewGroup) {
        AbstractC1788 abstractC1788 = this.f8135;
        if (abstractC1788 != null) {
            abstractC1788.mo3840();
            this.f8135 = null;
        }
    }

    @Override // p034.p084.p085.AbstractC1512
    /* renamed from: ぁごぐすすぃ */
    public boolean mo1134(View view, Object obj) {
        return ((Fragment) obj).f1186 == view;
    }

    @Override // p034.p084.p085.AbstractC1512
    /* renamed from: いいにぽつ */
    public Parcelable mo3305() {
        return null;
    }

    @Override // p034.p084.p085.AbstractC1512
    /* renamed from: げつ〴ぬぐ */
    public void mo1136(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f8135 == null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = (LayoutInflaterFactory2C1815) this.f8134;
            layoutInflaterFactory2C1815.getClass();
            this.f8135 = new C1794(layoutInflaterFactory2C1815);
        }
        this.f8135.mo3838(fragment);
        if (fragment == this.f8136) {
            this.f8136 = null;
        }
    }

    @Override // p034.p084.p085.AbstractC1512
    /* renamed from: てぜきぽく */
    public void mo3306(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // p034.p084.p085.AbstractC1512
    /* renamed from: なぎぱいぢぎ */
    public Object mo1137(ViewGroup viewGroup, int i) {
        if (this.f8135 == null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = (LayoutInflaterFactory2C1815) this.f8134;
            layoutInflaterFactory2C1815.getClass();
            this.f8135 = new C1794(layoutInflaterFactory2C1815);
        }
        long j = i;
        Fragment mo3822 = this.f8134.mo3822(m3872(viewGroup.getId(), j));
        if (mo3822 != null) {
            this.f8135.m3835(new AbstractC1788.C1789(7, mo3822));
        } else {
            C2083 c2083 = new C2083();
            ((C2091) this).f8893 = c2083;
            this.f8135.mo3839(viewGroup.getId(), c2083, m3872(viewGroup.getId(), j), 1);
            mo3822 = c2083;
        }
        if (mo3822 != this.f8136) {
            mo3822.m497(false);
            if (this.f8137 == 1) {
                this.f8135.mo3834(mo3822, AbstractC1680.EnumC1681.STARTED);
            } else {
                mo3822.m526(false);
            }
        }
        return mo3822;
    }

    @Override // p034.p084.p085.AbstractC1512
    /* renamed from: ぺぁあねじ */
    public void mo3307(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // p034.p084.p085.AbstractC1512
    /* renamed from: ぺふねづ〺 */
    public void mo3308(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f8136;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.m497(false);
                if (this.f8137 == 1) {
                    if (this.f8135 == null) {
                        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = (LayoutInflaterFactory2C1815) this.f8134;
                        layoutInflaterFactory2C1815.getClass();
                        this.f8135 = new C1794(layoutInflaterFactory2C1815);
                    }
                    this.f8135.mo3834(this.f8136, AbstractC1680.EnumC1681.STARTED);
                } else {
                    this.f8136.m526(false);
                }
            }
            fragment.m497(true);
            if (this.f8137 == 1) {
                if (this.f8135 == null) {
                    LayoutInflaterFactory2C1815 layoutInflaterFactory2C18152 = (LayoutInflaterFactory2C1815) this.f8134;
                    layoutInflaterFactory2C18152.getClass();
                    this.f8135 = new C1794(layoutInflaterFactory2C18152);
                }
                this.f8135.mo3834(fragment, AbstractC1680.EnumC1681.RESUMED);
            } else {
                fragment.m526(true);
            }
            this.f8136 = fragment;
        }
    }
}
