package dev.epro.r0;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D7469959880009041630 extends S3817735695007400440 {
    public F4096073349764486348 r;
    public L11283005264715124852 s;

    @Override // dev.epro.r0.Z4431149477876260063, dev.epro.r0.R15896830329318850690
    public final void Z0() {
        View Y = O5354877807466160604.Y(this);
        WeakHashMap weakHashMap = L11283005264715124852.w;
        L11283005264715124852 j = E7125458317232359087.j(Y);
        j.a(Y);
        B9345618057833789735 b9345618057833789735 = (B9345618057833789735) this.r.invoke(j);
        if (!S10823041268949770285.t(b9345618057833789735, this.q)) {
            this.q = b9345618057833789735;
            i1();
        }
        this.s = j;
        super.Z0();
    }

    @Override // dev.epro.r0.Z4431149477876260063, dev.epro.r0.R15896830329318850690
    public final void a1() {
        View Y = O5354877807466160604.Y(this);
        L11283005264715124852 l11283005264715124852 = this.s;
        if (l11283005264715124852 != null) {
            int i = l11283005264715124852.u - 1;
            l11283005264715124852.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = W10240872260424387225.a;
                Q5747078841744593420.c(Y, null);
                Q12598757537405990809.a(Y, null);
                Y.removeOnAttachStateChangeListener(l11283005264715124852.v);
            }
        }
        super.a1();
    }
}
