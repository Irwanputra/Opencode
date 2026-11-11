package p034.p050.p053;

import android.R;
import android.view.View;
import android.view.Window;
import p034.p050.p051.p052.C1179;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぉひのべい, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnClickListenerC1215 implements View.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1179 f6005;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C1229 f6006;

    public ViewOnClickListenerC1215(C1229 c1229) {
        this.f6006 = c1229;
        this.f6005 = new C1179(c1229.f6047.getContext(), 0, R.id.home, 0, c1229.f6054);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C1229 c1229 = this.f6006;
        Window.Callback callback = c1229.f6049;
        if (callback == null || !c1229.f6051) {
            return;
        }
        callback.onMenuItemSelected(0, this.f6005);
    }
}
