package dev.epro.r0;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class L12136615074090416221 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ L10855672692117722047 b;

    public /* synthetic */ L12136615074090416221(L10855672692117722047 l10855672692117722047, byte b) {
        this.a = b;
        this.b = l10855672692117722047;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 3;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        L10855672692117722047 l10855672692117722047 = this.b;
        switch (b) {
            case 0:
                B13729205492206812220 b13729205492206812220 = (B13729205492206812220) obj;
                View view = l10855672692117722047.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    b13729205492206812220.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new S6873153560207725378(b13729205492206812220, (byte) 3));
                    }
                }
                return o9245300239821758723;
            case 1:
                ActionMode actionMode = l10855672692117722047.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return o9245300239821758723;
            case 2:
                ActionMode actionMode2 = l10855672692117722047.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return o9245300239821758723;
            default:
                l10855672692117722047.e.e();
                return new N15916864325219832146(l10855672692117722047, b2);
        }
    }
}
