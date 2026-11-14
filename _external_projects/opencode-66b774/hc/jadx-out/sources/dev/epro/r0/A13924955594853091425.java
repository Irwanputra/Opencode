package dev.epro.r0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class A13924955594853091425 extends Activity implements I4293432593871965076, A9749874239022662777 {
    public final I1283052979100930176 a = new I1283052979100930176(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (W10240872260424387225.d(decorView, keyEvent)) {
            return true;
        }
        return Q3181834110876746778.A(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (W10240872260424387225.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // dev.epro.r0.A9749874239022662777
    public final boolean e(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = R11891371385360051901.b;
        T4867633725758960939.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.a.g(Q14196755420833223976.c);
        super.onSaveInstanceState(bundle);
    }
}
