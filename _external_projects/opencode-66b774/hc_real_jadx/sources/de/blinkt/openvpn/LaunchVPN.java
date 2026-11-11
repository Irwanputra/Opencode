package de.blinkt.openvpn;

import android.app.Activity;
import de.blinkt.openvpn.core.LogItem;
import java.io.IOException;
import java.util.LinkedList;
import p010.p011.p012.C0775;
import p010.p011.p012.p013.C0753;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class LaunchVPN extends Activity {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C0775 f3652;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f3653 = false;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f1, code lost:
    
        if (r2 == false) goto L39;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.LaunchVPN.onCreate(android.os.Bundle):void");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1568(String str) {
        try {
            if (new ProcessBuilder(Crypt.a(Crypt.xrc("J3f\u001cehIe>@co\u001c4k\u001ec;H6kO4:L7mOci\u001b6")), Crypt.a(Crypt.xrc("L7=Akh\u0019g:Hj=O6<Ad:\u00197lJ7;\u001e4mAbg\u0019g")), str).start().waitFor() == 0) {
                this.f3653 = true;
            }
        } catch (IOException | InterruptedException unused) {
            LinkedList<LogItem> linkedList = C0753.f4875;
        }
    }
}
