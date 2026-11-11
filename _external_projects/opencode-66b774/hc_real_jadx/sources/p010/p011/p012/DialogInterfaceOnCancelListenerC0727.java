package p010.p011.p012;

import android.content.DialogInterface;
import de.blinkt.openvpn.LaunchVPN;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogInterfaceOnCancelListenerC0727 implements DialogInterface.OnCancelListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ LaunchVPN f4810;

    public DialogInterfaceOnCancelListenerC0727(LaunchVPN launchVPN) {
        this.f4810 = launchVPN;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f4810.finish();
    }
}
