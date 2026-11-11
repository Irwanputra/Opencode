package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import java.util.UUID;
import p034.p067.C1415;
import p034.p067.C1417;
import p034.p067.InterfaceC1416;
import p034.p094.AbstractC1680;
import p034.p094.C1661;
import p034.p094.C1676;
import p034.p094.C1679;
import p034.p094.InterfaceC1664;
import p034.p094.InterfaceC1673;
import p034.p094.InterfaceC1675;
import p034.p105.p106.AbstractC1780;
import p034.p105.p106.AbstractC1784;
import p034.p105.p106.C1808;
import p034.p105.p106.C1811;
import p034.p105.p106.LayoutInflaterFactory2C1815;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1664, InterfaceC1673, InterfaceC1416 {

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public static final Object f1171 = new Object();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Fragment f1172;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public boolean f1174;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f1175;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Bundle f1176;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public boolean f1177;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f1178;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean f1180;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public boolean f1181;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f1182;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public C1811 f1183;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public String f1184;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f1185;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public View f1186;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public C0170 f1187;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean f1188;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Bundle f1189;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public float f1191;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public AbstractC1784 f1192;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public C1415 f1193;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f1195;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public boolean f1196;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public View f1197;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public C1661 f1198;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Boolean f1199;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f1201;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public Fragment f1202;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean f1203;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public LayoutInflater f1204;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public boolean f1206;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f1207;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public LayoutInflaterFactory2C1815 f1208;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f1210;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public SparseArray<Parcelable> f1211;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f1212;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public boolean f1213;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f1214;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public ViewGroup f1216;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f1173 = 0;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String f1205 = UUID.randomUUID().toString();

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String f1215 = null;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public Boolean f1217 = null;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public LayoutInflaterFactory2C1815 f1194 = new LayoutInflaterFactory2C1815();

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public boolean f1179 = true;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public boolean f1190 = true;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public AbstractC1680.EnumC1681 f1200 = AbstractC1680.EnumC1681.RESUMED;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public C1676<InterfaceC1664> f1209 = new C1676<>();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0167();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Bundle f1219;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0167 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Bundle bundle) {
            this.f1219 = bundle;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f1219 = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f1219);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$〺つふすそ, reason: contains not printable characters */
    public static class C0168 extends RuntimeException {
        public C0168(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC0169 {
    }

    /* renamed from: androidx.fragment.app.Fragment$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0170 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public Object f1220;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Animator f1221;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public Object f1222;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public InterfaceC0169 f1223;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1224;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public View f1225;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f1226;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f1227;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1228;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public Object f1229;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean f1230;

        public C0170() {
            Object obj = Fragment.f1171;
            this.f1222 = obj;
            this.f1220 = obj;
            this.f1229 = obj;
        }
    }

    public Fragment() {
        m524();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f1196 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m500().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f1196 = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        C2786.m4817(this, sb);
        sb.append(" (");
        sb.append(this.f1205);
        sb.append(")");
        if (this.f1212 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1212));
        }
        if (this.f1184 != null) {
            sb.append(" ");
            sb.append(this.f1184);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public void m475(Bundle bundle) {
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f1208;
        if (layoutInflaterFactory2C1815 != null) {
            if (layoutInflaterFactory2C1815 == null ? false : layoutInflaterFactory2C1815.mo3821()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1176 = bundle;
    }

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public final Context m476() {
        Context m484 = m484();
        if (m484 != null) {
            return m484;
        }
        throw new IllegalStateException(C2098.m4193("Fragment ", this, " not attached to a context."));
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Animator m477() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return null;
        }
        return c0170.f1221;
    }

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public void m478(View view) {
        m479().f1225 = view;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0170 m479() {
        if (this.f1187 == null) {
            this.f1187 = new C0170();
        }
        return this.f1187;
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public void mo480() {
        this.f1196 = true;
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int m481() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return 0;
        }
        return c0170.f1224;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public View m482() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return null;
        }
        return c0170.f1225;
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public boolean mo483(MenuItem menuItem) {
        return false;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public Context m484() {
        AbstractC1784 abstractC1784 = this.f1192;
        if (abstractC1784 == null) {
            return null;
        }
        return abstractC1784.f8025;
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final boolean m485() {
        return this.f1195 > 0;
    }

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public void m486(InterfaceC0169 interfaceC0169) {
        m479();
        InterfaceC0169 interfaceC01692 = this.f1187.f1223;
        if (interfaceC0169 == interfaceC01692) {
            return;
        }
        if (interfaceC0169 != null && interfaceC01692 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (interfaceC0169 != null) {
            ((LayoutInflaterFactory2C1815.C1819) interfaceC0169).f8173++;
        }
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public void mo487() {
        this.f1196 = true;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int m488() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return 0;
        }
        return c0170.f1226;
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public void mo489(Bundle bundle) {
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final String m490(int i) {
        return m504().getString(i);
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int m491() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return 0;
        }
        return c0170.f1227;
    }

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public void m492(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        AbstractC1784 abstractC1784 = this.f1192;
        if (abstractC1784 == null) {
            throw new IllegalStateException(C2098.m4193("Fragment ", this, " not attached to Activity"));
        }
        abstractC1784.mo544(this, intent, i, null);
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public void mo493(Context context) {
        this.f1196 = true;
        AbstractC1784 abstractC1784 = this.f1192;
        if ((abstractC1784 == null ? null : abstractC1784.f8024) != null) {
            this.f1196 = false;
            this.f1196 = true;
        }
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public void mo494() {
        this.f1196 = true;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int m495() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return 0;
        }
        return c0170.f1228;
    }

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public void m496(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f1194.m3926(parcelable);
        this.f1194.m3893();
    }

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public void m497(boolean z) {
        if (this.f1179 != z) {
            this.f1179 = z;
            if (this.f1203 && m518() && !this.f1180) {
                this.f1192.mo543();
            }
        }
    }

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public void m498(boolean z) {
        if (this.f1203 != z) {
            this.f1203 = z;
            if (!m518() || this.f1180) {
                return;
            }
            this.f1192.mo543();
        }
    }

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public final AbstractC1780 m499() {
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f1208;
        if (layoutInflaterFactory2C1815 != null) {
            return layoutInflaterFactory2C1815;
        }
        throw new IllegalStateException(C2098.m4193("Fragment ", this, " not associated with a fragment manager."));
    }

    @Override // p034.p094.InterfaceC1664
    /* renamed from: くし〴〺ぅ */
    public AbstractC1680 mo36() {
        return this.f1198;
    }

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public final FragmentActivity m500() {
        FragmentActivity m525 = m525();
        if (m525 != null) {
            return m525;
        }
        throw new IllegalStateException(C2098.m4193("Fragment ", this, " not attached to an activity."));
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public View mo501(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public LayoutInflater mo502(Bundle bundle) {
        AbstractC1784 abstractC1784 = this.f1192;
        if (abstractC1784 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater mo550 = abstractC1784.mo550();
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f1194;
        layoutInflaterFactory2C1815.getClass();
        C2786.m4815(mo550, layoutInflaterFactory2C1815);
        return mo550;
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public void m503(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1194.m3900();
        this.f1185 = true;
        this.f1183 = new C1811();
        View mo501 = mo501(layoutInflater, viewGroup, bundle);
        this.f1186 = mo501;
        if (mo501 == null) {
            if (this.f1183.f8128 != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1183 = null;
        } else {
            C1811 c1811 = this.f1183;
            if (c1811.f8128 == null) {
                c1811.f8128 = new C1661(c1811);
            }
            this.f1209.mo3647(this.f1183);
        }
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final Resources m504() {
        return m476().getResources();
    }

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public void mo505() {
        this.f1196 = true;
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public Object m506() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return null;
        }
        Object obj = c0170.f1222;
        if (obj != f1171) {
            return obj;
        }
        m513();
        return null;
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Object m507() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return null;
        }
        Object obj = c0170.f1220;
        if (obj != f1171) {
            return obj;
        }
        m529();
        return null;
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public void mo508(Bundle bundle) {
        this.f1196 = true;
    }

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public final View m509() {
        View view = this.f1186;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C2098.m4193("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public void mo510(Bundle bundle) {
        Parcelable parcelable;
        this.f1196 = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1194.m3926(parcelable);
            this.f1194.m3893();
        }
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f1194;
        if (layoutInflaterFactory2C1815.f8146 >= 1) {
            return;
        }
        layoutInflaterFactory2C1815.m3893();
    }

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public void mo511() {
        this.f1196 = true;
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public void mo512() {
        this.f1196 = true;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Object m513() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return null;
        }
        c0170.getClass();
        return null;
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public Object m514() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return null;
        }
        c0170.getClass();
        return null;
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean m515() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return false;
        }
        return c0170.f1230;
    }

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public void m516(boolean z) {
        m479().f1230 = z;
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public void m517(AttributeSet attributeSet, Bundle bundle) {
        this.f1196 = true;
        AbstractC1784 abstractC1784 = this.f1192;
        if ((abstractC1784 == null ? null : abstractC1784.f8024) != null) {
            this.f1196 = false;
            this.f1196 = true;
        }
    }

    @Override // p034.p067.InterfaceC1416
    /* renamed from: なぎぱいぢぎ */
    public final C1417 mo38() {
        return this.f1193.f6671;
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final boolean m518() {
        return this.f1192 != null && this.f1201;
    }

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public boolean m519(Menu menu) {
        boolean z = false;
        if (this.f1180) {
            return false;
        }
        if (this.f1203 && this.f1179) {
            z = true;
        }
        return z | this.f1194.m3905(menu);
    }

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public void m520(int i) {
        if (this.f1187 == null && i == 0) {
            return;
        }
        m479().f1228 = i;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void m521() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return;
        }
        c0170.getClass();
    }

    @Override // p034.p094.InterfaceC1673
    /* renamed from: は〲ぱなで */
    public C1679 mo39() {
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f1208;
        if (layoutInflaterFactory2C1815 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        C1808 c1808 = layoutInflaterFactory2C1815.f8168;
        C1679 c1679 = c1808.f8120.get(this.f1205);
        if (c1679 != null) {
            return c1679;
        }
        C1679 c16792 = new C1679();
        c1808.f8120.put(this.f1205, c16792);
        return c16792;
    }

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public void m522(Animator animator) {
        m479().f1221 = animator;
    }

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public void mo523() {
        this.f1196 = true;
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final void m524() {
        this.f1198 = new C1661(this);
        this.f1193 = new C1415(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1198.mo3625(new InterfaceC1675() { // from class: androidx.fragment.app.Fragment.2
                @Override // p034.p094.InterfaceC1675
                /* renamed from: びぐびあび */
                public void mo40(InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682) {
                    View view;
                    if (enumC1682 != AbstractC1680.EnumC1682.ON_STOP || (view = Fragment.this.f1186) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final FragmentActivity m525() {
        AbstractC1784 abstractC1784 = this.f1192;
        if (abstractC1784 == null) {
            return null;
        }
        return (FragmentActivity) abstractC1784.f8024;
    }

    @Deprecated
    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public void m526(boolean z) {
        if (!this.f1190 && z && this.f1173 < 3 && this.f1208 != null && m518() && this.f1177) {
            this.f1208.m3928(this);
        }
        this.f1190 = z;
        this.f1213 = this.f1173 < 3 && !z;
        if (this.f1189 != null) {
            this.f1199 = Boolean.valueOf(z);
        }
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public Object m527() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return null;
        }
        Object obj = c0170.f1229;
        if (obj != f1171) {
            return obj;
        }
        m514();
        return null;
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public void mo528(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Object m529() {
        C0170 c0170 = this.f1187;
        if (c0170 == null) {
            return null;
        }
        c0170.getClass();
        return null;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final AbstractC1780 m530() {
        if (this.f1192 != null) {
            return this.f1194;
        }
        throw new IllegalStateException(C2098.m4193("Fragment ", this, " has not been attached yet."));
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public void m531() {
        this.f1196 = true;
        this.f1194.m3907();
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public void mo532(int i, int i2, Intent intent) {
    }
}
