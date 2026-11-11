package p131.p161.p162.p163.p166;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import p034.p035.p042.C1052;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2127 extends RecyclerView.AbstractC0235 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C2132 f8948;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Calendar f8949 = C2131.m4222();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Calendar f8947 = C2131.m4222();

    public C2127(C2132 c2132) {
        this.f8948 = c2132;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0235
    /* renamed from: づざかべべ */
    public void mo901(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0224 c0224) {
        if ((recyclerView.getAdapter() instanceof C2124) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C2124 c2124 = (C2124) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (C1052<Long, Long> c1052 : this.f8948.f8966.m1402()) {
                Long l = c1052.f5499;
                if (l != null && c1052.f5498 != null) {
                    this.f8949.setTimeInMillis(l.longValue());
                    this.f8947.setTimeInMillis(c1052.f5498.longValue());
                    int m4214 = c2124.m4214(this.f8949.get(1));
                    int m42142 = c2124.m4214(this.f8947.get(1));
                    View mo649 = gridLayoutManager.mo649(m4214);
                    View mo6492 = gridLayoutManager.mo649(m42142);
                    int i = gridLayoutManager.f1330;
                    int i2 = m4214 / i;
                    int i3 = m42142 / i;
                    for (int i4 = i2; i4 <= i3; i4++) {
                        View mo6493 = gridLayoutManager.mo649(gridLayoutManager.f1330 * i4);
                        if (mo6493 != null) {
                            int top = mo6493.getTop() + this.f8948.f8963.f8923.f8936.top;
                            int bottom = mo6493.getBottom() - this.f8948.f8963.f8923.f8936.bottom;
                            canvas.drawRect(i4 == i2 ? (mo649.getWidth() / 2) + mo649.getLeft() : 0, top, i4 == i3 ? (mo6492.getWidth() / 2) + mo6492.getLeft() : recyclerView.getWidth(), bottom, this.f8948.f8963.f8916);
                        }
                    }
                }
            }
        }
    }
}
