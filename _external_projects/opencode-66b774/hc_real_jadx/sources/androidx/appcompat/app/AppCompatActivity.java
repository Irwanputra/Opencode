package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import p034.p050.p051.AbstractC1154;
import p034.p050.p053.C1202;
import p034.p050.p060.AbstractC1345;
import p034.p050.p060.C1290;
import p034.p050.p060.InterfaceC1301;
import p034.p050.p060.LayoutInflaterFactory2C1320;
import p034.p080.C1501;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC1301, C1290.InterfaceC1291 {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public AbstractC1345 f180;

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m79().mo2986(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m79().mo3010(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar m72 = m72();
        if (getWindow().hasFeature(0)) {
            if (m72 == null || !m72.mo50()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar m72 = m72();
        if (keyCode == 82 && m72 != null && m72.mo45(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m79().mo2997(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m79().mo2969();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i = C1202.f5946;
        return super.getResources();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m79().mo3017();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m79().mo2999(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC1345 m79 = m79();
        m79.mo2974();
        m79.mo3006(bundle);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m79().mo3013();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:47:0x00c3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r6, android.view.MenuItem r7) {
        /*
            r5 = this;
            boolean r6 = super.onMenuItemSelected(r6, r7)
            r0 = 1
            if (r6 == 0) goto L8
            return r0
        L8:
            androidx.appcompat.app.ActionBar r6 = r5.m72()
            int r7 = r7.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            r2 = 0
            if (r7 != r1) goto Le3
            if (r6 == 0) goto Le3
            int r6 = r6.mo57()
            r6 = r6 & 4
            if (r6 == 0) goto Le3
            android.content.Intent r6 = p237.p238.p239.p241.p242.C2786.m4816(r5)
            if (r6 == 0) goto Le1
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r7 < r1) goto L31
            boolean r3 = r5.shouldUpRecreateTask(r6)
            goto L46
        L31:
            android.content.Intent r3 = r5.getIntent()
            java.lang.String r3 = r3.getAction()
            if (r3 == 0) goto L45
            java.lang.String r4 = "android.intent.action.MAIN"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L45
            r3 = 1
            goto L46
        L45:
            r3 = 0
        L46:
            if (r3 == 0) goto Lcf
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.content.Intent r7 = r5.m76()
            if (r7 != 0) goto L57
            android.content.Intent r7 = p237.p238.p239.p241.p242.C2786.m4816(r5)
        L57:
            if (r7 == 0) goto L84
            android.content.ComponentName r3 = r7.getComponent()
            if (r3 != 0) goto L67
            android.content.pm.PackageManager r3 = r5.getPackageManager()
            android.content.ComponentName r3 = r7.resolveActivity(r3)
        L67:
            int r4 = r6.size()
        L6b:
            android.content.Intent r3 = p237.p238.p239.p241.p242.C2786.m4771(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            if (r3 == 0) goto L79
            r6.add(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            android.content.ComponentName r3 = r3.getComponent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            goto L6b
        L79:
            r6.add(r7)
            goto L84
        L7d:
            r6 = move-exception
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r6)
            throw r7
        L84:
            r5.m74()
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto Lc7
            int r7 = r6.size()
            android.content.Intent[] r7 = new android.content.Intent[r7]
            java.lang.Object[] r6 = r6.toArray(r7)
            android.content.Intent[] r6 = (android.content.Intent[]) r6
            android.content.Intent r7 = new android.content.Intent
            r3 = r6[r2]
            r7.<init>(r3)
            r3 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r7 = r7.addFlags(r3)
            r6[r2] = r7
            java.lang.Object r7 = p034.p035.p043.C1067.f5528
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r1) goto Lb4
            r2 = 0
            r5.startActivities(r6, r2)
            goto Lb7
        Lb4:
            r5.startActivities(r6)
        Lb7:
            int r6 = p034.p035.p041.C1043.f5473     // Catch: java.lang.IllegalStateException -> Lc3
            if (r7 < r1) goto Lbf
            r5.finishAffinity()     // Catch: java.lang.IllegalStateException -> Lc3
            goto Le2
        Lbf:
            r5.finish()     // Catch: java.lang.IllegalStateException -> Lc3
            goto Le2
        Lc3:
            r5.finish()
            goto Le2
        Lc7:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "No intents added to TaskStackBuilder; cannot startActivities"
            r6.<init>(r7)
            throw r6
        Lcf:
            if (r7 < r1) goto Ld5
            r5.navigateUpTo(r6)
            goto Le2
        Ld5:
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            r6.addFlags(r7)
            r5.startActivity(r6)
            r5.finish()
            goto Le2
        Le1:
            r0 = 0
        Le2:
            return r0
        Le3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.onMenuItemSelected(int, android.view.MenuItem):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m79().mo2984(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m79().mo2978();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m79().mo2981(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        m79().mo2993();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        m79().mo3007();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m79().mo3009(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar m72 = m72();
        if (getWindow().hasFeature(0)) {
            if (m72 == null || !m72.mo60()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m79().mo3000(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m79().mo3011(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m79().mo2971(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        m79().mo2976(i);
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public ActionBar m72() {
        return m79().mo3014();
    }

    @Override // p034.p050.p060.InterfaceC1301
    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public void mo73(AbstractC1154 abstractC1154) {
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public void m74() {
    }

    @Override // p034.p050.p060.InterfaceC1301
    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public AbstractC1154 mo75(AbstractC1154.InterfaceC1155 interfaceC1155) {
        return null;
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public Intent m76() {
        return C2786.m4816(this);
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public void m77(Toolbar toolbar) {
        m79().mo2980(toolbar);
    }

    @Override // p034.p050.p060.C1290.InterfaceC1291
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C1290.InterfaceC1293 mo78() {
        return m79().mo3003();
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public AbstractC1345 m79() {
        if (this.f180 == null) {
            C1501<WeakReference<AbstractC1345>> c1501 = AbstractC1345.f6453;
            this.f180 = new LayoutInflaterFactory2C1320(this, null, this, this);
        }
        return this.f180;
    }

    @Override // androidx.fragment.app.FragmentActivity
    /* renamed from: なぶひせが, reason: contains not printable characters */
    public void mo80() {
        m79().mo3017();
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public void m81() {
    }

    @Override // p034.p050.p060.InterfaceC1301
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void mo82(AbstractC1154 abstractC1154) {
    }
}
