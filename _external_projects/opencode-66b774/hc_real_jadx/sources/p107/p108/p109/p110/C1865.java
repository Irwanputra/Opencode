package p107.p108.p109.p110;

import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1865 implements WifiP2pManager.GroupInfoListener {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f8267;

    public C1865(MainActivity mainActivity) {
        this.f8267 = mainActivity;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
    public void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        if (wifiP2pGroup == null) {
            MainActivity mainActivity = this.f8267;
            WifiP2pManager wifiP2pManager = mainActivity.f3766;
            if (wifiP2pManager == null) {
                return;
            }
            wifiP2pManager.requestGroupInfo(mainActivity.f3810, new C1865(mainActivity));
            return;
        }
        String networkName = wifiP2pGroup.getNetworkName();
        String passphrase = wifiP2pGroup.getPassphrase();
        String str = MainActivity.f3765;
        String str2 = MainActivity.f3765;
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        m4207.append(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()));
        m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g=J0gI4nIfiKe<\u00191mHe:N6>OclO4<@d<\u001c1fObkM7<\u001af:\u001cgkIk:\u001cjh\u001e0;L4mLc;\u0019dk")));
        m4207.append(networkName);
        m4207.append(Crypt.a(Crypt.xrc("\u001a3mIe9@0i@6:I`:NcmN`jLkfH`k\u001dbmO6<\u001abgOj=Af9Ldf\u001d3>A`fM0iOk<N4gJ`9\u001a4>H6>Ogf@g9@ahO`k@a<\u001a1m\u001a1lNa;I3j")));
        m4207.append(passphrase);
        C1687.m3666(str2, m4207.toString());
    }
}
