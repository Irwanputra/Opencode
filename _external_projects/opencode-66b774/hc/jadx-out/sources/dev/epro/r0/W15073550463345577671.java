package dev.epro.r0;

import ads_mobile_sdk.pd;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W15073550463345577671 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ L9687083612725928934 b;

    public /* synthetic */ W15073550463345577671(L9687083612725928934 l9687083612725928934, byte b) {
        this.a = b;
        this.b = l9687083612725928934;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.a;
        L9687083612725928934 l9687083612725928934 = this.b;
        switch (b) {
            case 0:
                if ((l9687083612725928934.X & 1) != 0) {
                    l9687083612725928934.t(0);
                }
                if ((l9687083612725928934.X & 4096) != 0) {
                    l9687083612725928934.t(pd.i1);
                }
                l9687083612725928934.W = false;
                l9687083612725928934.X = 0;
                break;
            default:
                l9687083612725928934.v.showAtLocation(l9687083612725928934.u, 55, 0, 0);
                Q1445202285683234142 q1445202285683234142 = l9687083612725928934.x;
                if (q1445202285683234142 != null) {
                    q1445202285683234142.b();
                }
                if (l9687083612725928934.y && (viewGroup = l9687083612725928934.z) != null && viewGroup.isLaidOut()) {
                    l9687083612725928934.u.setAlpha(0.0f);
                    Q1445202285683234142 q1445202285683234142A = W10240872260424387225.a(l9687083612725928934.u);
                    q1445202285683234142A.a(1.0f);
                    l9687083612725928934.x = q1445202285683234142A;
                    q1445202285683234142A.d(new W8479308777628047383(this, (byte) 0));
                } else {
                    l9687083612725928934.u.setAlpha(1.0f);
                    l9687083612725928934.u.setVisibility(0);
                }
                break;
        }
    }
}
