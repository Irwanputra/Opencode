package p034.p050.p060;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnClickListenerC1308 implements View.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C1290 f6315;

    public ViewOnClickListenerC1308(C1290 c1290) {
        this.f6315 = c1290;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C1290 c1290 = this.f6315;
        if (!c1290.f6261) {
            c1290.getClass();
            return;
        }
        int m434 = c1290.f6257.m434(8388611);
        DrawerLayout drawerLayout = c1290.f6257;
        View m447 = drawerLayout.m447(8388611);
        if ((m447 != null ? drawerLayout.m440(m447) : false) && m434 != 2) {
            c1290.f6257.m435(8388611);
            return;
        }
        if (m434 != 1) {
            DrawerLayout drawerLayout2 = c1290.f6257;
            View m4472 = drawerLayout2.m447(8388611);
            if (m4472 != null) {
                drawerLayout2.m444(m4472, true);
            } else {
                StringBuilder m4207 = C2098.m4207("No drawer view found with gravity ");
                m4207.append(DrawerLayout.m433(8388611));
                throw new IllegalArgumentException(m4207.toString());
            }
        }
    }
}
