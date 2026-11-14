package dev.epro.r0;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A8269726748470298907 implements View.OnClickListener {
    public final Y18292971687006054026 a;
    public final /* synthetic */ X97881583022885904 b;

    public A8269726748470298907(X97881583022885904 x97881583022885904) {
        this.b = x97881583022885904;
        Context context = x97881583022885904.a.getContext();
        CharSequence charSequence = x97881583022885904.h;
        Y18292971687006054026 y18292971687006054026 = new Y18292971687006054026();
        y18292971687006054026.e = 4096;
        y18292971687006054026.g = 4096;
        y18292971687006054026.l = null;
        y18292971687006054026.m = null;
        y18292971687006054026.n = false;
        y18292971687006054026.f587o = false;
        y18292971687006054026.p = 16;
        y18292971687006054026.i = context;
        y18292971687006054026.a = charSequence;
        this.a = y18292971687006054026;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        X97881583022885904 x97881583022885904 = this.b;
        Window.Callback callback = x97881583022885904.k;
        if (callback == null || !x97881583022885904.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
