package p034.p050.p060;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1289 implements AdapterView.OnItemClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ AlertController f6254;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ AlertController.C0038 f6255;

    public C1289(AlertController.C0038 c0038, AlertController alertController) {
        this.f6255 = c0038;
        this.f6254 = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f6255.f166.onClick(this.f6254.f115, i);
        if (this.f6255.f165) {
            return;
        }
        this.f6254.f115.dismiss();
    }
}
