package p010.p011.p012;

import android.content.DialogInterface;
import de.blinkt.openvpn.LaunchVPN;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogInterfaceOnDismissListenerC0773 implements DialogInterface.OnDismissListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ LaunchVPN f4940;

    public DialogInterfaceOnDismissListenerC0773(LaunchVPN launchVPN) {
        this.f4940 = launchVPN;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f4940.finish();
    }
}
