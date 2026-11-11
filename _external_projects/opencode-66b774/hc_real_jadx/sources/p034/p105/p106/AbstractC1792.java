package p034.p105.p106;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p034.p084.p085.AbstractC1512;
import p034.p094.AbstractC1680;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1792 extends AbstractC1512 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final AbstractC1780 f8062;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public AbstractC1788 f8063 = null;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ArrayList<Fragment.SavedState> f8064 = new ArrayList<>();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public ArrayList<Fragment> f8061 = new ArrayList<>();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Fragment f8060 = null;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f8065 = 0;

    @Deprecated
    public AbstractC1792(AbstractC1780 abstractC1780) {
        this.f8062 = abstractC1780;
    }

    @Override // p034.p084.p085.AbstractC1512
    /* renamed from: 〺つふすそ */
    public void mo3304(ViewGroup viewGroup) {
        AbstractC1788 abstractC1788 = this.f8063;
        if (abstractC1788 != null) {
            abstractC1788.mo3840();
            this.f8063 = null;
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
        Bundle bundle;
        if (this.f8064.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f8064.size()];
            this.f8064.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f8061.size(); i++) {
            Fragment fragment = this.f8061.get(i);
            if (fragment != null && fragment.m518()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f8062.mo3823(bundle, C2098.m4208("f", i), fragment);
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // p034.p084.p085.AbstractC1512
    /* renamed from: げつ〴ぬぐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1136(android.view.ViewGroup r4, int r5, java.lang.Object r6) {
        /*
            r3 = this;
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぇぬぎばつ r4 = r3.f8063
            if (r4 != 0) goto L14
            づざかべべ.ぺふねづ〺.げつ〴ぬぐ.〳ぜぞぜべっ r4 = r3.f8062
            づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ r4 = (p034.p105.p106.LayoutInflaterFactory2C1815) r4
            r4.getClass()
            づざかべべ.ぺふねづ〺.げつ〴ぬぐ.げつ〴ぬぐ r0 = new づざかべべ.ぺふねづ〺.げつ〴ぬぐ.げつ〴ぬぐ
            r0.<init>(r4)
            r3.f8063 = r0
        L14:
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r4 = r3.f8064
            int r4 = r4.size()
            r0 = 0
            if (r4 > r5) goto L23
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r4 = r3.f8064
            r4.add(r0)
            goto L14
        L23:
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r4 = r3.f8064
            boolean r1 = r6.m518()
            if (r1 == 0) goto L57
            づざかべべ.ぺふねづ〺.げつ〴ぬぐ.〳ぜぞぜべっ r1 = r3.f8062
            づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ r1 = (p034.p105.p106.LayoutInflaterFactory2C1815) r1
            r1.getClass()
            づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ r2 = r6.f1208
            if (r2 != r1) goto L46
            int r2 = r6.f1173
            if (r2 <= 0) goto L57
            android.os.Bundle r1 = r1.m3938(r6)
            if (r1 == 0) goto L57
            androidx.fragment.app.Fragment$SavedState r2 = new androidx.fragment.app.Fragment$SavedState
            r2.<init>(r1)
            goto L58
        L46:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Fragment "
            java.lang.String r2 = " is not currently in the FragmentManager"
            java.lang.String r5 = p131.p155.p156.p157.C2098.m4193(r5, r6, r2)
            r4.<init>(r5)
            r1.m3911(r4)
            throw r0
        L57:
            r2 = r0
        L58:
            r4.set(r5, r2)
            java.util.ArrayList<androidx.fragment.app.Fragment> r4 = r3.f8061
            r4.set(r5, r0)
            づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぇぬぎばつ r4 = r3.f8063
            r4.mo3836(r6)
            androidx.fragment.app.Fragment r4 = r3.f8060
            if (r6 != r4) goto L6b
            r3.f8060 = r0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p105.p106.AbstractC1792.mo1136(android.view.ViewGroup, int, java.lang.Object):void");
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
        Fragment fragment;
        Fragment.SavedState savedState;
        Fragment fragment2;
        if (this.f8061.size() > i && (fragment2 = this.f8061.get(i)) != null) {
            return fragment2;
        }
        if (this.f8063 == null) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = (LayoutInflaterFactory2C1815) this.f8062;
            layoutInflaterFactory2C1815.getClass();
            this.f8063 = new C1794(layoutInflaterFactory2C1815);
        }
        MainActivity.C0515 c0515 = (MainActivity.C0515) this;
        if (i != 0) {
            if (i == 1) {
                fragment = MainActivity.this.f3802;
            } else if (i != 2) {
                fragment = new MainActivity.C0513();
                Bundle bundle = new Bundle();
                bundle.putInt("section_number", i + 1);
                fragment.m475(bundle);
            } else {
                fragment = MainActivity.this.f3773;
            }
        } else if (App.f3762.getBoolean("mainFragment", true)) {
            MainActivity.this.f3782.setVisibility(8);
            fragment = MainActivity.this.f3812;
        } else {
            fragment = MainActivity.this.f3805;
        }
        if (this.f8064.size() > i && (savedState = this.f8064.get(i)) != null) {
            if (fragment.f1208 != null) {
                throw new IllegalStateException("Fragment already added");
            }
            Bundle bundle2 = savedState.f1219;
            if (bundle2 == null) {
                bundle2 = null;
            }
            fragment.f1189 = bundle2;
        }
        while (this.f8061.size() <= i) {
            this.f8061.add(null);
        }
        fragment.m497(false);
        if (this.f8065 == 0) {
            fragment.m526(false);
        }
        this.f8061.set(i, fragment);
        this.f8063.mo3839(viewGroup.getId(), fragment, null, 1);
        if (this.f8065 == 1) {
            this.f8063.mo3834(fragment, AbstractC1680.EnumC1681.STARTED);
        }
        return fragment;
    }

    @Override // p034.p084.p085.AbstractC1512
    /* renamed from: ぺぁあねじ */
    public void mo3307(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f8064.clear();
            this.f8061.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f8064.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment mo3820 = this.f8062.mo3820(bundle, str);
                    if (mo3820 != null) {
                        while (this.f8061.size() <= parseInt) {
                            this.f8061.add(null);
                        }
                        mo3820.m497(false);
                        this.f8061.set(parseInt, mo3820);
                    }
                }
            }
        }
    }

    @Override // p034.p084.p085.AbstractC1512
    /* renamed from: ぺふねづ〺 */
    public void mo3308(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f8060;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.m497(false);
                if (this.f8065 == 1) {
                    if (this.f8063 == null) {
                        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = (LayoutInflaterFactory2C1815) this.f8062;
                        layoutInflaterFactory2C1815.getClass();
                        this.f8063 = new C1794(layoutInflaterFactory2C1815);
                    }
                    this.f8063.mo3834(this.f8060, AbstractC1680.EnumC1681.STARTED);
                } else {
                    this.f8060.m526(false);
                }
            }
            fragment.m497(true);
            if (this.f8065 == 1) {
                if (this.f8063 == null) {
                    LayoutInflaterFactory2C1815 layoutInflaterFactory2C18152 = (LayoutInflaterFactory2C1815) this.f8062;
                    layoutInflaterFactory2C18152.getClass();
                    this.f8063 = new C1794(layoutInflaterFactory2C18152);
                }
                this.f8063.mo3834(fragment, AbstractC1680.EnumC1681.RESUMED);
            } else {
                fragment.m526(true);
            }
            this.f8060 = fragment;
        }
    }
}
