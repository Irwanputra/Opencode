package p107.p108.p109.p110.p113.p117;

import android.content.DialogInterface;
import java.util.ArrayList;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.へぬ〴づぞ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogInterfaceOnClickListenerC1857 implements DialogInterface.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8243;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C1858 f8244;

    public DialogInterfaceOnClickListenerC1857(C1858 c1858, ArrayList arrayList) {
        this.f8244 = c1858;
        this.f8243 = arrayList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i != -2) {
            if (i != -1) {
                return;
            }
            C1858 c1858 = this.f8244;
            c1858.m3977(c1858.f8251, c1858.f8250, c1858.f8246);
            return;
        }
        if (this.f8244.f8251.size() == this.f8243.size()) {
            C1858 c18582 = this.f8244;
            c18582.f8247.mo1621(c18582.f8246);
        } else {
            C1858 c18583 = this.f8244;
            c18583.f8247.mo1616(c18583.f8246, this.f8243);
        }
    }
}
