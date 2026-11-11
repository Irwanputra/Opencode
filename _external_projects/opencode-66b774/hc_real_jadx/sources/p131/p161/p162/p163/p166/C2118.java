package p131.p161.p162.p163.p166;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p034.p065.p066.C1380;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2118 extends LinearLayoutManager {

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.ぉざぅち〻$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2119 extends C1380 {
        public C2119(C2118 c2118, Context context) {
            super(context);
        }

        @Override // p034.p065.p066.C1380
        /* renamed from: づざかべべ */
        public float mo3102(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public C2118(Context context, int i, boolean z) {
        super(i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: づおぴ〱いづ */
    public void mo656(RecyclerView recyclerView, RecyclerView.C0224 c0224, int i) {
        C2119 c2119 = new C2119(this, recyclerView.getContext());
        c2119.f1499 = i;
        m829(c2119);
    }
}
