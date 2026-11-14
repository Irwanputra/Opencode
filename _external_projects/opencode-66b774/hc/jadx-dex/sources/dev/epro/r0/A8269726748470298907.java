package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A8269726748470298907 implements android.view.View.OnClickListener {
    public final dev.epro.r0.Y18292971687006054026 a;
    public final /* synthetic */ dev.epro.r0.X97881583022885904 b;

    public A8269726748470298907(dev.epro.r0.X97881583022885904 x97881583022885904) {
        this.b = x97881583022885904;
        android.content.Context context = x97881583022885904.a.getContext();
        java.lang.CharSequence charSequence = x97881583022885904.h;
        dev.epro.r0.Y18292971687006054026 y18292971687006054026 = new dev.epro.r0.Y18292971687006054026();
        y18292971687006054026.e = 4096;
        y18292971687006054026.g = 4096;
        y18292971687006054026.l = null;
        y18292971687006054026.m = null;
        y18292971687006054026.n = false;
        y18292971687006054026.o = false;
        y18292971687006054026.p = 16;
        y18292971687006054026.i = context;
        y18292971687006054026.a = charSequence;
        this.a = y18292971687006054026;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        dev.epro.r0.X97881583022885904 x97881583022885904 = this.b;
        android.view.Window.Callback callback = x97881583022885904.k;
        if (callback == null || !x97881583022885904.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
