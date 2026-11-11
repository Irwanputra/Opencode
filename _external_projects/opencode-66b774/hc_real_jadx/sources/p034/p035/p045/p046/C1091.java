package p034.p035.p045.p046;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ぉ〲なぱぽた.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1091 extends ClickableSpan {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f5570;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1084 f5571;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f5572;

    public C1091(int i, C1084 c1084, int i2) {
        this.f5570 = i;
        this.f5571 = c1084;
        this.f5572 = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5570);
        C1084 c1084 = this.f5571;
        int i = this.f5572;
        c1084.getClass();
        if (Build.VERSION.SDK_INT >= 16) {
            c1084.f5550.performAction(i, bundle);
        }
    }
}
