package p010.p011.p012.p013;

import android.content.IntentFilter;
import de.blinkt.openvpn.core.DeviceStateReceiver;
import de.blinkt.openvpn.core.OpenVPNService;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC0760 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ OpenVPNService f4898;

    public RunnableC0760(OpenVPNService openVPNService) {
        this.f4898 = openVPNService;
    }

    @Override // java.lang.Runnable
    public void run() {
        OpenVPNService openVPNService = this.f4898;
        if (openVPNService.f3715 != null) {
            openVPNService.m1581();
        }
        OpenVPNService openVPNService2 = this.f4898;
        InterfaceC0737 interfaceC0737 = openVPNService2.f3704;
        synchronized (openVPNService2) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(Crypt.a(Crypt.xrc("Ad9A3>\u001deh\u0019emMbgHkjK19Ac=K`gM6l\u001bf=M6=NjnL4hKg=Mfl\u001e`iI0<Hfl\u001cahO`i\u0019`=Lam\u001eb=Iem@k9\u001b`>K1mNgj\u001969\u001e0hNgh")));
            intentFilter.addAction(Crypt.a(Crypt.xrc("L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4<\u001akmMf<L7fHg=\u001cbh\u001dj<Kfk\u001b`i\u001db<Ljo\u001cfm\u001dd:Ajf\u001ddh\u001d39K6fK1fHdiJe9A`nLg:")));
            intentFilter.addAction(Crypt.a(Crypt.xrc("L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4k\u001b`:J4=\u001cj:\u0019`:\u001ddgM0oIcoK1oK4l\u001dbiI")));
            DeviceStateReceiver deviceStateReceiver = new DeviceStateReceiver(interfaceC0737);
            openVPNService2.f3715 = deviceStateReceiver;
            deviceStateReceiver.m1570(openVPNService2);
            openVPNService2.registerReceiver(openVPNService2.f3715, intentFilter);
            C0753.m2038(openVPNService2.f3715);
        }
    }
}
