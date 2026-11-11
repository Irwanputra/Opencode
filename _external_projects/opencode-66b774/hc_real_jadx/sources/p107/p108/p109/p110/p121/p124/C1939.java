package p107.p108.p109.p110.p121.p124;

import java.lang.reflect.Type;
import p131.p161.p211.AbstractC2532;
import p131.p161.p211.C2655;
import p131.p161.p211.InterfaceC2522;
import p131.p161.p211.InterfaceC2669;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.いいにぽつ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1939 implements InterfaceC2522<Double> {
    public C1939(V2RayVpnService v2RayVpnService) {
    }

    @Override // p131.p161.p211.InterfaceC2522
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public AbstractC2532 mo4031(Double d, Type type, InterfaceC2669 interfaceC2669) {
        Double d2 = d;
        double doubleValue = d2.doubleValue();
        double longValue = d2.longValue();
        Number number = d2;
        if (doubleValue == longValue) {
            number = Long.valueOf(d2.longValue());
        }
        return new C2655(number);
    }
}
