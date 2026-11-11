package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import p034.p067.C1415;
import p034.p067.C1417;
import p034.p067.InterfaceC1416;
import p034.p073.InterfaceC1460;
import p034.p094.AbstractC1680;
import p034.p094.C1661;
import p034.p094.C1679;
import p034.p094.FragmentC1668;
import p034.p094.InterfaceC1664;
import p034.p094.InterfaceC1673;
import p034.p094.InterfaceC1675;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements InterfaceC1664, InterfaceC1673, InterfaceC1416, InterfaceC1460 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1661 f92;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C1679 f93;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final OnBackPressedDispatcher f94;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C1415 f95;

    /* renamed from: androidx.activity.ComponentActivity$〺つふすそ, reason: contains not printable characters */
    public static final class C0033 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C1679 f98;
    }

    /* renamed from: androidx.activity.ComponentActivity$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0034 implements Runnable {
        public RunnableC0034() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    public ComponentActivity() {
        C1661 c1661 = new C1661(this);
        this.f92 = c1661;
        this.f95 = new C1415(this);
        this.f94 = new OnBackPressedDispatcher(new RunnableC0034());
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            c1661.mo3625(new InterfaceC1675() { // from class: androidx.activity.ComponentActivity.2
                @Override // p034.p094.InterfaceC1675
                /* renamed from: びぐびあび, reason: contains not printable characters */
                public void mo40(InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682) {
                    if (enumC1682 == AbstractC1680.EnumC1682.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        c1661.mo3625(new InterfaceC1675() { // from class: androidx.activity.ComponentActivity.3
            @Override // p034.p094.InterfaceC1675
            /* renamed from: びぐびあび */
            public void mo40(InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682) {
                if (enumC1682 != AbstractC1680.EnumC1682.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.mo39().m3649();
            }
        });
        if (19 > i || i > 23) {
            return;
        }
        c1661.mo3625(new ImmLeaksCleaner(this));
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f94.m41();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f95.m3184(bundle);
        FragmentC1668.m3639(this);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0033 c0033;
        C1679 c1679 = this.f93;
        if (c1679 == null && (c0033 = (C0033) getLastNonConfigurationInstance()) != null) {
            c1679 = c0033.f98;
        }
        if (c1679 == null) {
            return null;
        }
        C0033 c00332 = new C0033();
        c00332.f98 = c1679;
        return c00332;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C1661 c1661 = this.f92;
        if (c1661 instanceof C1661) {
            c1661.m3626(AbstractC1680.EnumC1681.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f95.m3183(bundle);
    }

    @Override // androidx.core.app.ComponentActivity, p034.p094.InterfaceC1664
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public AbstractC1680 mo36() {
        return this.f92;
    }

    @Override // p034.p073.InterfaceC1460
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final OnBackPressedDispatcher mo37() {
        return this.f94;
    }

    @Override // p034.p067.InterfaceC1416
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final C1417 mo38() {
        return this.f95.f6671;
    }

    @Override // p034.p094.InterfaceC1673
    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public C1679 mo39() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f93 == null) {
            C0033 c0033 = (C0033) getLastNonConfigurationInstance();
            if (c0033 != null) {
                this.f93 = c0033.f98;
            }
            if (this.f93 == null) {
                this.f93 = new C1679();
            }
        }
        return this.f93;
    }
}
