package team.dev.epro.apkcustom.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import dev.epro.v2ray.util.Utils;
import libv2ray.Libv2ray;
import p034.p050.p053.C1216;
import p107.p108.p109.p110.p113.InterfaceC1837;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView;
import team.dev.epro.apkcustom.widgets.jsonhighlight.JsonSyntaxManager;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class V2raySettings extends AppCompatActivity {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public String f3921;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public FloatingActionButton f3922;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public FloatingActionButton f3923;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public CodeView f3924;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public View.OnClickListener f3925 = new ViewOnClickListenerC0532();

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public FloatingActionMenu f3926;

    /* renamed from: team.dev.epro.apkcustom.activities.V2raySettings$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnClickListenerC0532 implements View.OnClickListener {
        public ViewOnClickListenerC0532() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            V2raySettings v2raySettings;
            String a;
            int id = view.getId();
            if (id == 2131296533) {
                V2raySettings.this.f3926.m1188(true);
                if (!V2raySettings.this.f3924.getText().toString().isEmpty()) {
                    V2raySettings v2raySettings2 = V2raySettings.this;
                    if (Utils.share2Clipboard(v2raySettings2, v2raySettings2.f3924.getText().toString()) == 0) {
                        V2raySettings.m1649(V2raySettings.this, Crypt.a(Crypt.xrc("\u0019a<\u001dgh\u0019e>\u00196<Heg@7=K6:@c=I0<LknOcfKgh\u001c7;Kd;J6;Hc:\u001d3mKb;H7h\u001ejlH4>H")), -256);
                        return;
                    }
                }
                v2raySettings = V2raySettings.this;
                a = Crypt.a(Crypt.xrc("\u0019a<\u001dgh\u0019e>\u00196<Heg@7=K6:@c=I0<LknOclK0kIf=M0k\u001c6n@kk\u001bbgIaiHdm\u001dj=\u001d49I"));
            } else {
                if (id != 2131296537) {
                    return;
                }
                V2raySettings.this.f3926.m1188(true);
                if (!V2raySettings.this.f3924.getText().toString().isEmpty()) {
                    V2raySettings v2raySettings3 = V2raySettings.this;
                    String shareConfig_ = Utils.shareConfig_(v2raySettings3.f3924.getText().toString());
                    Intent intent = new Intent(Crypt.a(Crypt.xrc("L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4f\u0019`jA0;O6f@e<L0>\u001cb=A7:HjmA0fHdgL")));
                    intent.putExtra(Crypt.a(Crypt.xrc("\u001ac<\u001cdmKbk\u0019kmAg=\u001cjg\u001b1mOd>O0lI`mL3:Ja=\u001d0kM1i\u001b4hLko\u0019j;\u0019cfHb=\u001a4=\u001bcnJ")), shareConfig_);
                    intent.putExtra(Crypt.a(Crypt.xrc("\u001ac<\u001cdmKbk\u0019kmAg=\u001cjg\u001b1mOd>O0lI`mL3;Hfo\u001ad<\u001bdj\u001e7k\u001ed<Kf=J4<\u001ebg\u001bcjHa=H")), Crypt.a(Crypt.xrc("J0o\u001ackJkj\u001ae:H0kM0f\u001bdf\u001b`i\u001dgi@0:\u001df")));
                    intent.setType(Crypt.a(Crypt.xrc("M0lIkkJ7k\u001c7lNjk\u001a0m\u0019df\u001d3m\u001eb;Mc=\u001eb")));
                    v2raySettings3.startActivity(Intent.createChooser(intent, Crypt.a(Crypt.xrc("Ndn\u001c7<KjjN4=N0l\u0019dfO3j\u001b6i\u001bd;MbnAd"))));
                    return;
                }
                v2raySettings = V2raySettings.this;
                a = v2raySettings.getString(2131820809);
            }
            V2raySettings.m1649(v2raySettings, a, -65536);
        }
    }

    static {
        System.loadLibrary(Crypt.a(Crypt.xrc("\u001ed<\u00197gI4kMkmA4lA`<\u001aao\u001de>Od;\u001e3i\u001aa")));
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static void m1649(V2raySettings v2raySettings, String str, int i) {
        v2raySettings.getClass();
        ((C1216) App.f3760).m2790(str, i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f3924.getText().toString().isEmpty()) {
            this.f94.m41();
            return;
        }
        try {
            Libv2ray.testConfig(this.f3924.getText().toString());
            this.f94.m41();
        } catch (Exception e) {
            if (e.getMessage().startsWith(Crypt.a(Crypt.xrc("\u0019k;\u0019al\u001e7;\u001a1h\u001a3kMcfK7m\u001aj;\u0019bnI`=\u001ak")))) {
                try {
                    ((C1216) App.f3760).m2790(e.getMessage().split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[1], -65536);
                } catch (IndexOutOfBoundsException unused) {
                    ((C1216) App.f3760).m2790(e.getMessage(), -65536);
                }
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492904);
        this.f3924 = (CodeView) findViewById(2131296444);
        this.f3926 = (FloatingActionMenu) findViewById(2131296534);
        this.f3922 = (FloatingActionButton) findViewById(2131296537);
        this.f3923 = (FloatingActionButton) findViewById(2131296533);
        this.f3926.setClosedOnTouchOutside(true);
        this.f3922.setOnClickListener(this.f3925);
        this.f3923.setOnClickListener(this.f3925);
        this.f3924.setLineNumberVisible(true);
        this.f3921 = App.f3762.getString(Crypt.a(Crypt.xrc("NgiJk;N7nJ1;Ldm\u001d4=\u001bjg\u001d7>\u001a0;\u001ccf\u001d6oLbg\u001afgO1;\u001e4j\u001a4jO`:@e=\u001e7;MdmMelI")), "");
        InterfaceC1837 interfaceC1837 = App.f3760;
        if (!Boolean.parseBoolean(((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739())[2]) && this.f3921.isEmpty()) {
            try {
                InterfaceC1837 interfaceC18372 = App.f3760;
                this.f3921 = ((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[26];
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        if (this.f3921.isEmpty()) {
            this.f3921 = App.f3762.getString(Crypt.a(Crypt.xrc("Oj=Okk\u001c0g\u001eg9\u001bjfN7>\u001bdj@e;Acf\u001dj>J7")), "");
        }
        this.f3924.setText(this.f3921);
        JsonSyntaxManager.applyTheme(this, this.f3924);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        InterfaceC1837 interfaceC1837 = App.f3760;
        if (Boolean.parseBoolean(((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739())[2]) || this.f3924.getText().toString().equals(App.f3762.getString(Crypt.a(Crypt.xrc("Oj=Okk\u001c0g\u001eg9\u001bjfN7>\u001bdj@e;Acf\u001dj>J7")), ""))) {
            return;
        }
        App.f3762.edit().putString(Crypt.a(Crypt.xrc("NgiJk;N7nJ1;Ldm\u001d4=\u001bjg\u001d7>\u001a0;\u001ccf\u001d6oLbg\u001afgO1;\u001e4j\u001a4jO`:@e=\u001e7;MdmMelI")), this.f3924.getText().toString()).apply();
    }
}
