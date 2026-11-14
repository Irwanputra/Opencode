package dev.epro.r0;

import android.text.style.ClickableSpan;
import android.view.View;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class F11972271003077969633 extends ClickableSpan {
    public final /* synthetic */ F4096073349764486348 a;
    public final /* synthetic */ String b;

    static {
        izmyclvb.dpqpjfpoanwt1(944);
    }

    private native void rxyzsixqznxq(F4096073349764486348 f4096073349764486348, String str);

    @Override // android.text.style.ClickableSpan
    public final native void onClick(View view);

    public F11972271003077969633(F4096073349764486348 f4096073349764486348, String str) {
        this.a = f4096073349764486348;
        this.b = str;
        rxyzsixqznxq(f4096073349764486348, str);
    }
}
