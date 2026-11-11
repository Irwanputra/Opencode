package p107.p108.p109.p110.p111;

import android.content.SharedPreferences;
import android.widget.EditText;
import p010.p011.p012.C0775;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.activities.GeneratedConfig;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.〳ぜぞぜべっ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1827 extends Thread {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C0775 f8191;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ EditText f8192;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ GeneratedConfig f8193;

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.〳ぜぞぜべっ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC1828 implements Runnable {
        public RunnableC1828() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SharedPreferences sharedPreferences = App.f3762;
            String a = Crypt.a(Crypt.xrc("H6mN69K0i\u001b`h\u001a7h@0jN6:\u001bfo\u001d`oJjkN6"));
            if (!sharedPreferences.getString(a, "").isEmpty() && App.f3762.getString(Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj")), "").equals(App.f3762.getString(a, ""))) {
                C1827.this.f8192.setText(App.f3762.getString(a, ""));
            } else {
                C1827 c1827 = C1827.this;
                c1827.f8192.setText(c1827.f8193.f3855);
            }
        }
    }

    public C1827(GeneratedConfig generatedConfig, C0775 c0775, EditText editText) {
        this.f8193 = generatedConfig;
        this.f8191 = c0775;
        this.f8192 = editText;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        GeneratedConfig generatedConfig = this.f8193;
        SharedPreferences sharedPreferences = App.f3762;
        String a = Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj"));
        generatedConfig.f3855 = sharedPreferences.getString(a, "").contains(Crypt.a(Crypt.xrc("\u0019eh\u001e`nJf<L`kO6>Ibl\u001bb>\u001eag\u001e6>\u001denM0;\u0019`o\u001b49\u001dd>Ab;HjnNg:\u001b7iAgo@`mKkmN"))) ? App.f3762.getString(a, "") : this.f8191.m2096(App.f3759, false);
        this.f8193.runOnUiThread(new RunnableC1828());
    }
}
