package team.dev.epro.apkcustom.widgets;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import p034.p050.p053.C1216;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ConnectivityBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Crypt.a(Crypt.xrc("Ad9A3>\u001deh\u0019emMbgHkjK19Ac=K`gM6l\u001bf=M6=NjnL4hKg=Mfl\u001e`iI0<Hfl\u001cahO`i\u0019`=Lam\u001eb=Iem@k9\u001b`>K1mNgj\u001969\u001e0hNgh")))) {
            ((C1216) App.f3760).m2701(App.f3759, SSHTunnelService.class);
            if (((C1216) App.f3760).m2701(App.f3759, SSHTunnelService.class)) {
                if (SSHTunnelService.f4034 || SSHTunnelService.f4038) {
                    boolean z = SSHTunnelService.f4034;
                    boolean z2 = SSHTunnelService.f4038;
                    return;
                }
                SharedPreferences sharedPreferences = App.f3762;
                String a = Crypt.a(Crypt.xrc("H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk"));
                if (sharedPreferences.getBoolean(a, false)) {
                    SharedPreferences sharedPreferences2 = App.f3762;
                    String a2 = Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k"));
                    if (sharedPreferences2.getBoolean(a2, false) && App.f3762.getBoolean(a2, false) && !App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001de:Idk\u001c6=H3:O4mLe:\u001eelJ79\u001d6<\u001bcn\u001b7")), false)) {
                        context.stopService(new Intent(context, (Class<?>) SSHTunnelService.class));
                        App.f3762.edit().putBoolean(a, false).apply();
                        context.startService(new Intent(context, (Class<?>) SSHTunnelService.class));
                        C2098.m4182(App.f3762, a, true);
                    }
                }
            }
        }
    }
}
