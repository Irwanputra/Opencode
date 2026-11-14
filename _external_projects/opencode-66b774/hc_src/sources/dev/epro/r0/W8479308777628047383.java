package dev.epro.r0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W8479308777628047383 extends S13562717617822485216 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    public /* synthetic */ W8479308777628047383(Object obj, byte b) {
        this.e = b;
        this.f = obj;
    }

    @Override // dev.epro.r0.P5210161598916505319
    public final void a() {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                L9687083612725928934 l9687083612725928934 = ((W15073550463345577671) obj).b;
                l9687083612725928934.u.setAlpha(1.0f);
                l9687083612725928934.x.d(null);
                l9687083612725928934.x = null;
                break;
            case 1:
                L9687083612725928934 l96870836127259289342 = (L9687083612725928934) obj;
                l96870836127259289342.u.setAlpha(1.0f);
                l96870836127259289342.x.d(null);
                l96870836127259289342.x = null;
                break;
            default:
                L9687083612725928934 l96870836127259289343 = (L9687083612725928934) ((W8455343525638953052) obj).c;
                l96870836127259289343.u.setVisibility(8);
                PopupWindow popupWindow = l96870836127259289343.v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (l96870836127259289343.u.getParent() instanceof View) {
                    View view = (View) l96870836127259289343.u.getParent();
                    WeakHashMap weakHashMap = W10240872260424387225.a;
                    view.requestApplyInsets();
                }
                l96870836127259289343.u.e();
                l96870836127259289343.x.d(null);
                l96870836127259289343.x = null;
                ViewGroup viewGroup = l96870836127259289343.z;
                WeakHashMap weakHashMap2 = W10240872260424387225.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // dev.epro.r0.S13562717617822485216, dev.epro.r0.P5210161598916505319
    public void f() {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                ((W15073550463345577671) obj).b.u.setVisibility(0);
                break;
            case 1:
                L9687083612725928934 l9687083612725928934 = (L9687083612725928934) obj;
                l9687083612725928934.u.setVisibility(0);
                if (l9687083612725928934.u.getParent() instanceof View) {
                    View view = (View) l9687083612725928934.u.getParent();
                    WeakHashMap weakHashMap = W10240872260424387225.a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }
}
