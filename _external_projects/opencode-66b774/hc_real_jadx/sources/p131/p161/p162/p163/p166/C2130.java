package p131.p161.p162.p163.p166;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;
import p131.p161.p162.p163.p166.C2132;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2130 implements AdapterView.OnItemClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendarGridView f8956;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C2139 f8957;

    public C2130(C2139 c2139, MaterialCalendarGridView materialCalendarGridView) {
        this.f8957 = c2139;
        this.f8956 = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C2128 adapter = this.f8956.getAdapter();
        if (i >= adapter.m4217() && i <= adapter.m4216()) {
            C2132.InterfaceC2137 interfaceC2137 = this.f8957.f8979;
            long longValue = this.f8956.getAdapter().getItem(i).longValue();
            C2132.C2138 c2138 = (C2132.C2138) interfaceC2137;
            if (C2132.this.f8961.f3245.m1400(longValue)) {
                C2132.this.f8966.m1403(longValue);
                Iterator it = C2132.this.f8929.iterator();
                while (it.hasNext()) {
                    ((AbstractC2120) it.next()).m4211(C2132.this.f8966.m1404());
                }
                C2132.this.f8969.getAdapter().f1556.m810();
                RecyclerView recyclerView = C2132.this.f8962;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f1556.m810();
                }
            }
        }
    }
}
