package p244.p245.p246;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import p034.p050.p060.C1338;
import p034.p050.p060.DialogInterfaceC1343;
import p034.p067.InterfaceC1416;

/* renamed from: ぺふねづ〺.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2838 extends C1338 {

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public InterfaceC2839 f10525;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public InterfaceC2837 f10526;

    @Override // p034.p105.p106.DialogInterfaceOnCancelListenerC1781, androidx.fragment.app.Fragment
    /* renamed from: ぇとしたべど */
    public void mo487() {
        this.f1196 = true;
        if (!this.f8014 && !this.f8010) {
            this.f8010 = true;
        }
        this.f10526 = null;
        this.f10525 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p034.p105.p106.DialogInterfaceOnCancelListenerC1781, androidx.fragment.app.Fragment
    /* renamed from: ぉひのべい */
    public void mo493(Context context) {
        super.mo493(context);
        InterfaceC1416 interfaceC1416 = this.f1202;
        if (interfaceC1416 != null) {
            if (interfaceC1416 instanceof InterfaceC2837) {
                this.f10526 = (InterfaceC2837) interfaceC1416;
            }
            if (interfaceC1416 instanceof InterfaceC2839) {
                this.f10525 = (InterfaceC2839) interfaceC1416;
            }
        }
        if (context instanceof InterfaceC2837) {
            this.f10526 = (InterfaceC2837) context;
        }
        if (context instanceof InterfaceC2839) {
            this.f10525 = (InterfaceC2839) context;
        }
    }

    @Override // p034.p105.p106.DialogInterfaceOnCancelListenerC1781
    /* renamed from: しぷげへが */
    public Dialog mo3826(Bundle bundle) {
        this.f8015 = false;
        Dialog dialog = this.f8012;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        C2841 c2841 = new C2841(this.f1176);
        DialogInterfaceOnClickListenerC2843 dialogInterfaceOnClickListenerC2843 = new DialogInterfaceOnClickListenerC2843(this, c2841, this.f10526, this.f10525);
        Context m484 = m484();
        int i = c2841.f10528;
        DialogInterfaceC1343.C1344 c1344 = i > 0 ? new DialogInterfaceC1343.C1344(m484, i) : new DialogInterfaceC1343.C1344(m484);
        c1344.f6452.f177 = false;
        c1344.m3030(c2841.f10529, dialogInterfaceOnClickListenerC2843);
        c1344.m3029(c2841.f10527, dialogInterfaceOnClickListenerC2843);
        c1344.f6452.f172 = c2841.f10530;
        return c1344.m3031();
    }
}
