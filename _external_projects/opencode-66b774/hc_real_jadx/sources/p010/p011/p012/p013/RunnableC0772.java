package p010.p011.p012.p013;

import android.widget.Toast;
import de.blinkt.openvpn.core.OpenVPNService;
import java.util.Locale;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC0772 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ String f4938;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ OpenVPNService f4939;

    public RunnableC0772(OpenVPNService openVPNService, String str) {
        this.f4939 = openVPNService;
        this.f4938 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        Toast toast = this.f4939.f3712;
        if (toast != null) {
            toast.cancel();
        }
        String format = String.format(Locale.getDefault(), Crypt.a(Crypt.xrc("\u001aj<\u00193o\u001c`hK`gHd9\u001d7<\u001b4:Lc:\u001bd=N1i\u001df")), this.f4939.f3696.f4966, this.f4938);
        OpenVPNService openVPNService = this.f4939;
        openVPNService.f3712 = Toast.makeText(openVPNService.getBaseContext(), format, 0);
        this.f4939.f3712.show();
    }
}
