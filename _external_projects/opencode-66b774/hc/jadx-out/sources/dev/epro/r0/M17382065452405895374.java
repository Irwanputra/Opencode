package dev.epro.r0;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M17382065452405895374 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;
    public final /* synthetic */ V10300877997588547986 c;

    public /* synthetic */ M17382065452405895374(V10300877997588547986 v10300877997588547986, View view, byte b) {
        this.a = b;
        this.c = v10300877997588547986;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        View view = this.b;
        V10300877997588547986 v10300877997588547986 = this.c;
        switch (b) {
            case 0:
                if (!((H16489389149714063960) v10300877997588547986.c).c()) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                break;
            default:
                if (!((H16489389149714063960) ((N17157817114855916481) v10300877997588547986).c).c()) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                break;
        }
        return true;
    }
}
