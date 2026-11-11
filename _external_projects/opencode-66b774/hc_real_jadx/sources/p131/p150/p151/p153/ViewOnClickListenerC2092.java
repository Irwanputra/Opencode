package p131.p150.p151.p153;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.balsikandar.crashreporter.ui.LogMessageActivity;
import p131.p150.p151.p153.C2089;

/* renamed from: なぎぱいぢぎ.くし〴〺ぅ.げつ〴ぬぐ.ぺぁあねじ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnClickListenerC2092 implements View.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Context f8894;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ String f8895;

    public ViewOnClickListenerC2092(C2089.C2090 c2090, Context context, String str) {
        this.f8894 = context;
        this.f8895 = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent = new Intent(this.f8894, (Class<?>) LogMessageActivity.class);
        intent.putExtra("LogMessage", this.f8895);
        this.f8894.startActivity(intent);
    }
}
