package dev.epro.r0;

import android.content.Context;
import android.view.View;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H10500197361170225543 extends V2419641781538918069 {
    public final /* synthetic */ byte l = 0;
    public final /* synthetic */ T1878852318042345820 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H10500197361170225543(T1878852318042345820 t1878852318042345820, Context context, Q7493219842314740732 q7493219842314740732, View view) {
        super(context, q7493219842314740732, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = t1878852318042345820;
        if ((q7493219842314740732.A.x & 32) != 32) {
            View view2 = t1878852318042345820.i;
            this.e = view2 == null ? (View) t1878852318042345820.h : view2;
        }
        H12843822278061842084 h12843822278061842084 = t1878852318042345820.w;
        this.h = h12843822278061842084;
        C14538084604686194039 c14538084604686194039 = this.i;
        if (c14538084604686194039 != null) {
            c14538084604686194039.f(h12843822278061842084);
        }
    }

    @Override // dev.epro.r0.V2419641781538918069
    public final void c() {
        byte b = this.l;
        T1878852318042345820 t1878852318042345820 = this.m;
        switch (b) {
            case 0:
                t1878852318042345820.t = null;
                super.c();
                break;
            default:
                T8605657386197958581 t8605657386197958581 = t1878852318042345820.c;
                if (t8605657386197958581 != null) {
                    t8605657386197958581.c(true);
                }
                t1878852318042345820.s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H10500197361170225543(T1878852318042345820 t1878852318042345820, Context context, T8605657386197958581 t8605657386197958581, View view) {
        super(context, t8605657386197958581, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = t1878852318042345820;
        this.f = 8388613;
        H12843822278061842084 h12843822278061842084 = t1878852318042345820.w;
        this.h = h12843822278061842084;
        C14538084604686194039 c14538084604686194039 = this.i;
        if (c14538084604686194039 != null) {
            c14538084604686194039.f(h12843822278061842084);
        }
    }
}
