package p034.p050.p051.p052;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p034.p050.p051.p052.C1181;
import p034.p050.p051.p052.InterfaceC1186;
import p034.p050.p060.DialogInterfaceC1343;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogInterfaceOnKeyListenerC1162 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1186.InterfaceC1187 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1164 f5752;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public DialogInterfaceC1343 f5753;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1181 f5754;

    public DialogInterfaceOnKeyListenerC1162(C1164 c1164) {
        this.f5752 = c1164;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5752.m2623(((C1181.C1182) this.f5754.m2649()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        C1181 c1181 = this.f5754;
        C1164 c1164 = this.f5752;
        InterfaceC1186.InterfaceC1187 interfaceC1187 = c1181.f5846;
        if (interfaceC1187 != null) {
            interfaceC1187.mo132(c1164, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f5753.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f5753.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f5752.m2619(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f5752.performShortcut(i, keyEvent, 0);
    }

    @Override // p034.p050.p051.p052.InterfaceC1186.InterfaceC1187
    /* renamed from: 〺つふすそ */
    public boolean mo131(C1164 c1164) {
        return false;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186.InterfaceC1187
    /* renamed from: げつ〴ぬぐ */
    public void mo132(C1164 c1164, boolean z) {
        DialogInterfaceC1343 dialogInterfaceC1343;
        if ((z || c1164 == this.f5752) && (dialogInterfaceC1343 = this.f5753) != null) {
            dialogInterfaceC1343.dismiss();
        }
    }
}
