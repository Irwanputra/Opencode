package p107.p108.p109.p110;

import android.view.View;
import android.widget.EditText;
import p034.p050.p053.C1216;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnClickListenerC1928 implements View.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ EditText f8405;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f8406;

    public ViewOnClickListenerC1928(MainActivity mainActivity, EditText editText) {
        this.f8406 = mainActivity;
        this.f8405 = editText;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f8405.getText().toString().trim().isEmpty()) {
            ((C1216) App.f3760).m2790(Crypt.a(Crypt.xrc("J3oOgmJ6>Oe9Adi@1j\u001cc;Kk<LfjNah\u001ed9M0fNk=Ncg\u001dj>OefM1fAjo\u0019klL6kM1j\u001d")), -65536);
        } else {
            this.f8406.f3768.dismiss();
        }
    }
}
