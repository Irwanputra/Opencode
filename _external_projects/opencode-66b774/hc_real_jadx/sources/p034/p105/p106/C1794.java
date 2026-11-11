package p034.p105.p106;

import android.view.animation.Interpolator;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p034.p094.AbstractC1680;
import p034.p105.p106.AbstractC1788;
import p034.p105.p106.LayoutInflaterFactory2C1815;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1794 extends AbstractC1788 implements LayoutInflaterFactory2C1815.InterfaceC1816 {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final LayoutInflaterFactory2C1815 f8067;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f8068;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f8069 = -1;

    public C1794(LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815) {
        this.f8067 = layoutInflaterFactory2C1815;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static boolean m3841(AbstractC1788.C1789 c1789) {
        Fragment fragment = c1789.f8050;
        if (fragment == null || !fragment.f1201 || fragment.f1186 == null || fragment.f1210 || fragment.f1180) {
            return false;
        }
        Fragment.C0170 c0170 = fragment.f1187;
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f8069 >= 0) {
            sb.append(" #");
            sb.append(this.f8069);
        }
        if (this.f8047 != null) {
            sb.append(" ");
            sb.append(this.f8047);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // p034.p105.p106.AbstractC1788
    /* renamed from: 〳ぜぞぜべっ */
    public AbstractC1788 mo3834(Fragment fragment, AbstractC1680.EnumC1681 enumC1681) {
        if (fragment.f1208 != this.f8067) {
            StringBuilder m4207 = C2098.m4207("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            m4207.append(this.f8067);
            throw new IllegalArgumentException(m4207.toString());
        }
        AbstractC1680.EnumC1681 enumC16812 = AbstractC1680.EnumC1681.CREATED;
        if (enumC1681.compareTo(enumC16812) >= 0) {
            m3835(new AbstractC1788.C1789(10, fragment, enumC1681));
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + enumC16812);
    }

    @Override // p034.p105.p106.AbstractC1788
    /* renamed from: ぁごぐすすぃ */
    public AbstractC1788 mo3836(Fragment fragment) {
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment.f1208;
        if (layoutInflaterFactory2C1815 == null || layoutInflaterFactory2C1815 == this.f8067) {
            m3835(new AbstractC1788.C1789(3, fragment));
            return this;
        }
        StringBuilder m4207 = C2098.m4207("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        m4207.append(fragment.toString());
        m4207.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(m4207.toString());
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int m3842(boolean z) {
        if (this.f8068) {
            throw new IllegalStateException("commit already called");
        }
        Interpolator interpolator = LayoutInflaterFactory2C1815.f8138;
        this.f8068 = true;
        int i = -1;
        if (this.f8033) {
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f8067;
            synchronized (layoutInflaterFactory2C1815) {
                ArrayList<Integer> arrayList = layoutInflaterFactory2C1815.f8166;
                if (arrayList != null && arrayList.size() > 0) {
                    i = layoutInflaterFactory2C1815.f8166.remove(r2.size() - 1).intValue();
                    layoutInflaterFactory2C1815.f8161.set(i, this);
                }
                if (layoutInflaterFactory2C1815.f8161 == null) {
                    layoutInflaterFactory2C1815.f8161 = new ArrayList<>();
                }
                i = layoutInflaterFactory2C1815.f8161.size();
                layoutInflaterFactory2C1815.f8161.add(this);
            }
        }
        this.f8069 = i;
        this.f8067.m3917(this, z);
        return this.f8069;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean m3843(ArrayList<C1794> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f8040.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f8040.get(i4).f8050;
            int i5 = fragment != null ? fragment.f1175 : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C1794 c1794 = arrayList.get(i6);
                    int size2 = c1794.f8040.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = c1794.f8040.get(i7).f8050;
                        if ((fragment2 != null ? fragment2.f1175 : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // p034.p105.p106.AbstractC1788
    /* renamed from: くし〴〺ぅ */
    public int mo3837() {
        return m3842(false);
    }

    @Override // p034.p105.p106.LayoutInflaterFactory2C1815.InterfaceC1816
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean mo3844(ArrayList<C1794> arrayList, ArrayList<Boolean> arrayList2) {
        Interpolator interpolator = LayoutInflaterFactory2C1815.f8138;
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f8033) {
            return true;
        }
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f8067;
        if (layoutInflaterFactory2C1815.f8167 == null) {
            layoutInflaterFactory2C1815.f8167 = new ArrayList<>();
        }
        layoutInflaterFactory2C1815.f8167.add(this);
        return true;
    }

    @Override // p034.p105.p106.AbstractC1788
    /* renamed from: づざかべべ */
    public AbstractC1788 mo3838(Fragment fragment) {
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = fragment.f1208;
        if (layoutInflaterFactory2C1815 == null || layoutInflaterFactory2C1815 == this.f8067) {
            m3835(new AbstractC1788.C1789(6, fragment));
            return this;
        }
        StringBuilder m4207 = C2098.m4207("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        m4207.append(fragment.toString());
        m4207.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(m4207.toString());
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void m3845() {
        int size = this.f8040.size();
        for (int i = 0; i < size; i++) {
            AbstractC1788.C1789 c1789 = this.f8040.get(i);
            Fragment fragment = c1789.f8050;
            if (fragment != null) {
                int i2 = this.f8043;
                int i3 = this.f8035;
                if (fragment.f1187 != null || i2 != 0 || i3 != 0) {
                    fragment.m479();
                    Fragment.C0170 c0170 = fragment.f1187;
                    c0170.f1226 = i2;
                    c0170.f1227 = i3;
                }
            }
            switch (c1789.f8053) {
                case 1:
                    fragment.m520(c1789.f8052);
                    this.f8067.m3881(fragment, false);
                    break;
                case 2:
                default:
                    StringBuilder m4207 = C2098.m4207("Unknown cmd: ");
                    m4207.append(c1789.f8053);
                    throw new IllegalArgumentException(m4207.toString());
                case 3:
                    fragment.m520(c1789.f8056);
                    this.f8067.m3933(fragment);
                    break;
                case 4:
                    fragment.m520(c1789.f8056);
                    this.f8067.getClass();
                    if (!fragment.f1180) {
                        fragment.f1180 = true;
                        fragment.f1181 = !fragment.f1181;
                        break;
                    }
                    break;
                case 5:
                    fragment.m520(c1789.f8052);
                    this.f8067.getClass();
                    if (fragment.f1180) {
                        fragment.f1180 = false;
                        fragment.f1181 = !fragment.f1181;
                        break;
                    }
                    break;
                case 6:
                    fragment.m520(c1789.f8056);
                    this.f8067.m3937(fragment);
                    break;
                case 7:
                    fragment.m520(c1789.f8052);
                    this.f8067.m3939(fragment);
                    break;
                case 8:
                    this.f8067.m3915(fragment);
                    break;
                case 9:
                    this.f8067.m3915(null);
                    break;
                case 10:
                    this.f8067.m3885(fragment, c1789.f8049);
                    break;
            }
            if (!this.f8037 && c1789.f8053 != 1 && fragment != null) {
                this.f8067.m3874(fragment);
            }
        }
        if (this.f8037) {
            return;
        }
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f8067;
        layoutInflaterFactory2C1815.m3901(layoutInflaterFactory2C1815.f8146, true);
    }

    @Override // p034.p105.p106.AbstractC1788
    /* renamed from: なぎぱいぢぎ */
    public void mo3839(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder m4207 = C2098.m4207("Fragment ");
            m4207.append(cls.getCanonicalName());
            m4207.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(m4207.toString());
        }
        if (str != null) {
            String str2 = fragment.f1184;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f1184 + " now " + str);
            }
            fragment.f1184 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.f1212;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f1212 + " now " + i);
            }
            fragment.f1212 = i;
            fragment.f1175 = i;
        }
        m3835(new AbstractC1788.C1789(i2, fragment));
        fragment.f1208 = this.f8067;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void m3846(boolean z) {
        for (int size = this.f8040.size() - 1; size >= 0; size--) {
            AbstractC1788.C1789 c1789 = this.f8040.get(size);
            Fragment fragment = c1789.f8050;
            if (fragment != null) {
                int i = this.f8043;
                Interpolator interpolator = LayoutInflaterFactory2C1815.f8138;
                int i2 = i != 4097 ? i != 4099 ? i != 8194 ? 0 : 4097 : 4099 : 8194;
                int i3 = this.f8035;
                if (fragment.f1187 != null || i2 != 0 || i3 != 0) {
                    fragment.m479();
                    Fragment.C0170 c0170 = fragment.f1187;
                    c0170.f1226 = i2;
                    c0170.f1227 = i3;
                }
            }
            switch (c1789.f8053) {
                case 1:
                    fragment.m520(c1789.f8055);
                    this.f8067.m3933(fragment);
                    break;
                case 2:
                default:
                    StringBuilder m4207 = C2098.m4207("Unknown cmd: ");
                    m4207.append(c1789.f8053);
                    throw new IllegalArgumentException(m4207.toString());
                case 3:
                    fragment.m520(c1789.f8054);
                    this.f8067.m3881(fragment, false);
                    break;
                case 4:
                    fragment.m520(c1789.f8054);
                    this.f8067.getClass();
                    if (fragment.f1180) {
                        fragment.f1180 = false;
                        fragment.f1181 = !fragment.f1181;
                        break;
                    }
                    break;
                case 5:
                    fragment.m520(c1789.f8055);
                    this.f8067.getClass();
                    if (!fragment.f1180) {
                        fragment.f1180 = true;
                        fragment.f1181 = !fragment.f1181;
                        break;
                    }
                    break;
                case 6:
                    fragment.m520(c1789.f8054);
                    this.f8067.m3939(fragment);
                    break;
                case 7:
                    fragment.m520(c1789.f8055);
                    this.f8067.m3937(fragment);
                    break;
                case 8:
                    this.f8067.m3915(null);
                    break;
                case 9:
                    this.f8067.m3915(fragment);
                    break;
                case 10:
                    this.f8067.m3885(fragment, c1789.f8051);
                    break;
            }
            if (!this.f8037 && c1789.f8053 != 3 && fragment != null) {
                this.f8067.m3874(fragment);
            }
        }
        if (this.f8037 || !z) {
            return;
        }
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f8067;
        layoutInflaterFactory2C1815.m3901(layoutInflaterFactory2C1815.f8146, true);
    }

    @Override // p034.p105.p106.AbstractC1788
    /* renamed from: びぐびあび */
    public void mo3840() {
        if (this.f8033) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f8067;
        if (layoutInflaterFactory2C1815.f8148 == null || layoutInflaterFactory2C1815.f8141) {
            return;
        }
        layoutInflaterFactory2C1815.m3891(true);
        mo3844(layoutInflaterFactory2C1815.f8145, layoutInflaterFactory2C1815.f8163);
        layoutInflaterFactory2C1815.f8155 = true;
        try {
            layoutInflaterFactory2C1815.m3894(layoutInflaterFactory2C1815.f8145, layoutInflaterFactory2C1815.f8163);
            layoutInflaterFactory2C1815.m3919();
            layoutInflaterFactory2C1815.m3878();
            layoutInflaterFactory2C1815.m3883();
            layoutInflaterFactory2C1815.m3884();
        } catch (Throwable th) {
            layoutInflaterFactory2C1815.m3919();
            throw th;
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean m3847(int i) {
        int size = this.f8040.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f8040.get(i2).f8050;
            int i3 = fragment != null ? fragment.f1175 : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m3848(int i) {
        if (this.f8033) {
            Interpolator interpolator = LayoutInflaterFactory2C1815.f8138;
            int size = this.f8040.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f8040.get(i2).f8050;
                if (fragment != null) {
                    fragment.f1195 += i;
                    Interpolator interpolator2 = LayoutInflaterFactory2C1815.f8138;
                }
            }
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m3849(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f8047);
            printWriter.print(" mIndex=");
            printWriter.print(this.f8069);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f8068);
            if (this.f8043 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f8043));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f8035));
            }
            if (this.f8034 != 0 || this.f8039 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8034));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8039));
            }
            if (this.f8045 != 0 || this.f8041 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8045));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8041));
            }
            if (this.f8036 != 0 || this.f8048 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8036));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f8048);
            }
            if (this.f8042 != 0 || this.f8044 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8042));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f8044);
            }
        }
        if (this.f8040.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f8040.size();
        for (int i = 0; i < size; i++) {
            AbstractC1788.C1789 c1789 = this.f8040.get(i);
            switch (c1789.f8053) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder m4207 = C2098.m4207("cmd=");
                    m4207.append(c1789.f8053);
                    str2 = m4207.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c1789.f8050);
            if (z) {
                if (c1789.f8052 != 0 || c1789.f8056 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c1789.f8052));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c1789.f8056));
                }
                if (c1789.f8054 != 0 || c1789.f8055 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c1789.f8054));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c1789.f8055));
                }
            }
        }
    }
}
