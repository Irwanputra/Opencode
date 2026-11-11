package team.dev.epro.apkcustom.activities;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import p034.p050.p053.C1216;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SmartGuide extends AppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492901);
        try {
            ((WebView) findViewById(2131296566)).loadUrl(Crypt.a(Crypt.xrc("M6>\u00196oMkl@dn\u0019enM4=H`o\u001b`<Ik=Nf<\u0019bkIbhHa9\u001aan\u001edhJbjJc<@4h\u0019k9\u001d1g\u001cb=KbhN6oAkg@4fIbkH`f\u001efo\u001bdf\u001eemMd<Akn")));
        } catch (Exception unused) {
            ((C1216) App.f3760).m2790(Crypt.a(Crypt.xrc("Kbf\u001bj=Kej\u0019ek\u001bck\u001cb;@4nO6>Lj;\u001bj=\u001ccn\u0019kgK4o\u00196kMj=\u001d4jJkk\u00194h\u00196m@19\u00194>\u001c")), -65536);
        }
    }
}
