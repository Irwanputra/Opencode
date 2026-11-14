package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class A13924955594853091425 extends android.app.Activity implements dev.epro.r0.I4293432593871965076, dev.epro.r0.A9749874239022662777 {
    public final dev.epro.r0.I1283052979100930176 a = new dev.epro.r0.I1283052979100930176(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (dev.epro.r0.W10240872260424387225.d(decorView, keyEvent)) {
            return true;
        }
        return dev.epro.r0.Q3181834110876746778.A(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (dev.epro.r0.W10240872260424387225.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // dev.epro.r0.A9749874239022662777
    public final boolean e(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i = dev.epro.r0.R11891371385360051901.b;
        dev.epro.r0.T4867633725758960939.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.getClass();
        this.a.g(dev.epro.r0.Q14196755420833223976.c);
        super.onSaveInstanceState(bundle);
    }
}
