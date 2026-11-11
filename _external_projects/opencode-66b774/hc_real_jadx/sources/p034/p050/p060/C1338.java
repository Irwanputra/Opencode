package p034.p050.p060;

import android.app.Dialog;
import p034.p105.p106.DialogInterfaceOnCancelListenerC1781;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1338 extends DialogInterfaceOnCancelListenerC1781 {
    @Override // p034.p105.p106.DialogInterfaceOnCancelListenerC1781
    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public void mo3026(Dialog dialog, int i) {
        if (!(dialog instanceof DialogC1317)) {
            super.mo3026(dialog, i);
            return;
        }
        DialogC1317 dialogC1317 = (DialogC1317) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC1317.m2967().mo2992(1);
    }
}
