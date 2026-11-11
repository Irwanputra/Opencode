package p034.p035.p040;

import java.util.ArrayList;
import p034.p035.p040.C1027;
import p034.p035.p040.C1032;
import p034.p080.C1493;

/* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1036 implements C1032.InterfaceC1034<C1027.C1031> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ String f5451;

    public C1036(String str) {
        this.f5451 = str;
    }

    @Override // p034.p035.p040.C1032.InterfaceC1034
    /* renamed from: 〺つふすそ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo2365(C1027.C1031 c1031) {
        synchronized (C1027.f5427) {
            C1493<String, ArrayList<C1032.InterfaceC1034<C1027.C1031>>> c1493 = C1027.f5430;
            ArrayList<C1032.InterfaceC1034<C1027.C1031>> arrayList = c1493.get(this.f5451);
            if (arrayList == null) {
                return;
            }
            c1493.remove(this.f5451);
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).mo2365(c1031);
            }
        }
    }
}
