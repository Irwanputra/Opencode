package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import p034.p035.p041.C1043;
import p034.p073.InterfaceC1460;
import p034.p080.C1506;
import p034.p080.C1507;
import p034.p094.AbstractC1680;
import p034.p094.C1661;
import p034.p094.C1679;
import p034.p094.InterfaceC1673;
import p034.p101.p102.AbstractC1773;
import p034.p105.p106.AbstractC1780;
import p034.p105.p106.AbstractC1784;
import p034.p105.p106.C1799;
import p034.p105.p106.LayoutInflaterFactory2C1815;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class FragmentActivity extends ComponentActivity implements C1043.InterfaceC1044, C1043.InterfaceC1045 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final C1661 f1231;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final C1799 f1232;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f1233;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public C1507<String> f1234;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f1235;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f1236;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f1237;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f1238;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f1239;

    /* renamed from: androidx.fragment.app.FragmentActivity$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0171 extends AbstractC1784<FragmentActivity> implements InterfaceC1673, InterfaceC1460 {
        public C0171() {
            super(FragmentActivity.this);
        }

        @Override // p034.p105.p106.AbstractC1784
        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public FragmentActivity mo539() {
            return FragmentActivity.this;
        }

        @Override // p034.p105.p106.AbstractC1812
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean mo540() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p034.p105.p106.AbstractC1784
        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public void mo541(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, null, printWriter, strArr);
        }

        @Override // p034.p105.p106.AbstractC1784
        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public int mo542() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // p034.p105.p106.AbstractC1784
        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public void mo543() {
            FragmentActivity.this.mo80();
        }

        @Override // p034.p105.p106.AbstractC1784
        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public void mo544(Fragment fragment, Intent intent, int i, Bundle bundle) {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            fragmentActivity.f1236 = true;
            try {
                if (i == -1) {
                    int i2 = C1043.f5473;
                    if (Build.VERSION.SDK_INT >= 16) {
                        fragmentActivity.startActivityForResult(intent, -1, bundle);
                    } else {
                        fragmentActivity.startActivityForResult(intent, -1);
                    }
                } else {
                    FragmentActivity.m533(i);
                    int m538 = ((fragmentActivity.m538(fragment) + 1) << 16) + (i & 65535);
                    int i3 = C1043.f5473;
                    if (Build.VERSION.SDK_INT >= 16) {
                        fragmentActivity.startActivityForResult(intent, m538, bundle);
                    } else {
                        fragmentActivity.startActivityForResult(intent, m538);
                    }
                }
            } finally {
                fragmentActivity.f1236 = false;
            }
        }

        @Override // p034.p094.InterfaceC1664
        /* renamed from: くし〴〺ぅ */
        public AbstractC1680 mo36() {
            return FragmentActivity.this.f1231;
        }

        @Override // p034.p105.p106.AbstractC1812
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public View mo545(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // p034.p073.InterfaceC1460
        /* renamed from: づざかべべ */
        public OnBackPressedDispatcher mo37() {
            return FragmentActivity.this.f94;
        }

        @Override // p034.p105.p106.AbstractC1784
        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public void mo546(Fragment fragment, String[] strArr, int i) {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            fragmentActivity.getClass();
            if (i == -1) {
                C1043.m2381(fragmentActivity, strArr, i);
                return;
            }
            FragmentActivity.m533(i);
            try {
                fragmentActivity.f1235 = true;
                C1043.m2381(fragmentActivity, strArr, ((fragmentActivity.m538(fragment) + 1) << 16) + (i & 65535));
            } finally {
                fragmentActivity.f1235 = false;
            }
        }

        @Override // p034.p105.p106.AbstractC1784
        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public boolean mo547(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // p034.p094.InterfaceC1673
        /* renamed from: は〲ぱなで */
        public C1679 mo39() {
            return FragmentActivity.this.mo39();
        }

        @Override // p034.p105.p106.AbstractC1784
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void mo548(Fragment fragment) {
            FragmentActivity.this.m536();
        }

        @Override // p034.p105.p106.AbstractC1784
        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public boolean mo549(String str) {
            return C1043.m2380(FragmentActivity.this, str);
        }

        @Override // p034.p105.p106.AbstractC1784
        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public LayoutInflater mo550() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // p034.p105.p106.AbstractC1784
        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean mo551() {
            return FragmentActivity.this.getWindow() != null;
        }
    }

    public FragmentActivity() {
        C0171 c0171 = new C0171();
        C2786.m4836(c0171, "callbacks == null");
        this.f1232 = new C1799(c0171);
        this.f1231 = new C1661(this);
        this.f1239 = true;
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static void m533(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static boolean m534(AbstractC1780 abstractC1780, AbstractC1680.EnumC1681 enumC1681) {
        List<Fragment> list;
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = (LayoutInflaterFactory2C1815) abstractC1780;
        if (layoutInflaterFactory2C1815.f8142.isEmpty()) {
            list = Collections.emptyList();
        } else {
            synchronized (layoutInflaterFactory2C1815.f8142) {
                list = (List) layoutInflaterFactory2C1815.f8142.clone();
            }
        }
        boolean z = false;
        for (Fragment fragment : list) {
            if (fragment != null) {
                if (fragment.f1198.f7776.compareTo(AbstractC1680.EnumC1681.STARTED) >= 0) {
                    fragment.f1198.m3626(enumC1681);
                    z = true;
                }
                AbstractC1784 abstractC1784 = fragment.f1192;
                if ((abstractC1784 == null ? null : abstractC1784.mo539()) != null) {
                    z |= m534(fragment.m530(), enumC1681);
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1238);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1233);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1239);
        if (getApplication() != null) {
            AbstractC1773.m3819(this).mo3817(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1232.f8099.f8027.m3918(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment m3927;
        this.f1232.m3865();
        int i3 = i >> 16;
        if (i3 == 0) {
            int i4 = C1043.f5473;
            super.onActivityResult(i, i2, intent);
            return;
        }
        int i5 = i3 - 1;
        String m3301 = this.f1234.m3301(i5);
        this.f1234.m3293(i5);
        if (m3301 == null || (m3927 = this.f1232.f8099.f8027.m3927(m3301)) == null) {
            return;
        }
        m3927.mo532(i & 65535, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1232.m3865();
        this.f1232.f8099.f8027.m3897(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC1784<?> abstractC1784 = this.f1232.f8099;
        abstractC1784.f8027.m3876(abstractC1784, abstractC1784, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            AbstractC1784<?> abstractC17842 = this.f1232.f8099;
            if (!(abstractC17842 instanceof InterfaceC1673)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            abstractC17842.f8027.m3926(parcelable);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f1237 = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray != null && stringArray != null && intArray.length == stringArray.length) {
                    this.f1234 = new C1507<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f1234.m3295(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f1234 == null) {
            this.f1234 = new C1507<>(10);
            this.f1237 = 0;
        }
        super.onCreate(bundle);
        this.f1231.m3627(AbstractC1680.EnumC1682.ON_CREATE);
        this.f1232.f8099.f8027.m3893();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C1799 c1799 = this.f1232;
        return onCreatePanelMenu | c1799.f8099.f8027.m3910(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1232.f8099.f8027.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f1232.f8099.f8027.m3930();
        this.f1231.m3627(AbstractC1680.EnumC1682.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f1232.f8099.f8027.m3907();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f1232.f8099.f8027.m3904(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f1232.f8099.f8027.m3890(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f1232.f8099.f8027.m3909(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f1232.m3865();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f1232.f8099.f8027.m3896(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f1233 = false;
        this.f1232.f8099.f8027.m3923(3);
        this.f1231.m3627(AbstractC1680.EnumC1682.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f1232.f8099.f8027.m3889(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f1231.m3627(AbstractC1680.EnumC1682.ON_RESUME);
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f1232.f8099.f8027;
        layoutInflaterFactory2C1815.f8157 = false;
        layoutInflaterFactory2C1815.f8165 = false;
        layoutInflaterFactory2C1815.m3923(4);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? super.onPreparePanel(0, view, menu) | this.f1232.f8099.f8027.m3905(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity, p034.p035.p041.C1043.InterfaceC1044
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1232.m3865();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String m3301 = this.f1234.m3301(i3);
            this.f1234.m3293(i3);
            if (m3301 == null) {
                return;
            }
            this.f1232.f8099.f8027.m3927(m3301);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f1233 = true;
        this.f1232.m3865();
        this.f1232.f8099.f8027.m3931();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        while (m534(m535(), AbstractC1680.EnumC1681.CREATED)) {
        }
        this.f1231.m3627(AbstractC1680.EnumC1682.ON_STOP);
        Parcelable m3912 = this.f1232.f8099.f8027.m3912();
        if (m3912 != null) {
            bundle.putParcelable("android:support:fragments", m3912);
        }
        if (this.f1234.m3302() > 0) {
            bundle.putInt("android:support:next_request_index", this.f1237);
            int[] iArr = new int[this.f1234.m3302()];
            String[] strArr = new String[this.f1234.m3302()];
            for (int i = 0; i < this.f1234.m3302(); i++) {
                iArr[i] = this.f1234.m3300(i);
                strArr[i] = this.f1234.m3296(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f1239 = false;
        if (!this.f1238) {
            this.f1238 = true;
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f1232.f8099.f8027;
            layoutInflaterFactory2C1815.f8157 = false;
            layoutInflaterFactory2C1815.f8165 = false;
            layoutInflaterFactory2C1815.m3923(2);
        }
        this.f1232.m3865();
        this.f1232.f8099.f8027.m3931();
        this.f1231.m3627(AbstractC1680.EnumC1682.ON_START);
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C18152 = this.f1232.f8099.f8027;
        layoutInflaterFactory2C18152.f8157 = false;
        layoutInflaterFactory2C18152.f8165 = false;
        layoutInflaterFactory2C18152.m3923(3);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f1232.m3865();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f1239 = true;
        while (m534(m535(), AbstractC1680.EnumC1681.CREATED)) {
        }
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f1232.f8099.f8027;
        layoutInflaterFactory2C1815.f8165 = true;
        layoutInflaterFactory2C1815.m3923(2);
        this.f1231.m3627(AbstractC1680.EnumC1682.ON_STOP);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.f1236 && i != -1) {
            m533(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.f1236 && i != -1) {
            m533(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            m533(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            m533(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public AbstractC1780 m535() {
        return this.f1232.f8099.f8027;
    }

    @Deprecated
    /* renamed from: なぶひせが */
    public void mo80() {
        invalidateOptionsMenu();
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public void m536() {
    }

    @Override // p034.p035.p041.C1043.InterfaceC1045
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void mo537(int i) {
        if (this.f1235 || i == -1) {
            return;
        }
        m533(i);
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public final int m538(Fragment fragment) {
        if (this.f1234.m3302() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (true) {
            C1507<String> c1507 = this.f1234;
            int i = this.f1237;
            if (c1507.f6955) {
                c1507.m3297();
            }
            if (C1506.m3289(c1507.f6956, c1507.f6957, i) < 0) {
                int i2 = this.f1237;
                this.f1234.m3295(i2, fragment.f1205);
                this.f1237 = (this.f1237 + 1) % 65534;
                return i2;
            }
            this.f1237 = (this.f1237 + 1) % 65534;
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1232.f8099.f8027.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
