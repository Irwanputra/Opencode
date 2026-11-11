package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import p034.p035.p045.C1116;
import p034.p094.AbstractC1680;
import p034.p094.C1661;
import p034.p094.FragmentC1668;
import p034.p094.InterfaceC1664;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ComponentActivity extends Activity implements InterfaceC1664, C1116.InterfaceC1117 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1661 f1005 = new C1661(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1116.m2560(decorView, keyEvent)) {
            return C1116.m2559(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1116.m2560(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC1668.m3639(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f1005.m3626(AbstractC1680.EnumC1681.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // p034.p035.p045.C1116.InterfaceC1117
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean mo373(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: くし〴〺ぅ */
    public AbstractC1680 mo36() {
        return this.f1005;
    }
}
