package p107.p108.p109.p110;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.EditText;
import p034.p050.p053.C1216;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogInterfaceOnDismissListenerC1866 implements DialogInterface.OnDismissListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ EditText f8268;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f8269;

    public DialogInterfaceOnDismissListenerC1866(MainActivity mainActivity, EditText editText) {
        this.f8269 = mainActivity;
        this.f8268 = editText;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        String obj = this.f8268.getText().toString();
        SharedPreferences sharedPreferences = App.f3762;
        String a = Crypt.a(Crypt.xrc("J`hJ6m\u001b`>\u001e6gJdj\u001e6;\u0019foKci\u001edi\u001bbg\u001d`"));
        C2098.m4206(sharedPreferences, a, obj);
        MainActivity mainActivity = this.f8269;
        String m2739 = ((C1216) App.f3760).m2739();
        String str = MainActivity.f3765;
        if (!obj.equals(mainActivity.m1619(m2739)[22])) {
            ((C1216) App.f3760).m2794();
            ((C1216) App.f3760).m2790(Crypt.a(Crypt.xrc("N3i\u001bdnNc:NdkJg:Ac>\u001dj>\u0019jhO`k\u001a0m\u001eb=@79\u001ek=Kfg\u001c3lK7mIk;Lf:\u001eb:\u001ed>M4oL")), -65536);
            this.f8269.m1617(true);
            C2098.m4206(App.f3762, a, "");
        }
        this.f8269.f3783 = false;
    }
}
