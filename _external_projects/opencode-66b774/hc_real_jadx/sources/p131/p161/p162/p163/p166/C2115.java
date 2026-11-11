package p131.p161.p162.p163.p166;

import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2115 extends RecyclerView.AbstractC0206 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MaterialButton f8924;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C2132 f8925;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C2139 f8926;

    public C2115(C2132 c2132, C2139 c2139, MaterialButton materialButton) {
        this.f8925 = c2132;
        this.f8926 = c2139;
        this.f8924 = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0206
    /* renamed from: 〺つふすそ */
    public void mo760(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager m4225 = this.f8925.m4225();
        int m639 = i < 0 ? m4225.m639() : m4225.m669();
        this.f8925.f8965 = this.f8926.m4228(m639);
        this.f8924.setText(this.f8926.f8978.f3242.m1406(m639).f3251);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0206
    /* renamed from: げつ〴ぬぐ */
    public void mo761(RecyclerView recyclerView, int i) {
        if (i == 0) {
            CharSequence text = this.f8924.getText();
            if (Build.VERSION.SDK_INT >= 16) {
                recyclerView.announceForAccessibility(text);
            } else {
                recyclerView.sendAccessibilityEvent(2048);
            }
        }
    }
}
