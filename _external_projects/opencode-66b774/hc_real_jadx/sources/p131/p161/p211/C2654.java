package p131.p161.p211;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p034.p095.C1687;
import p131.p161.p211.p214.C2622;
import p131.p161.p211.p214.p215.C2560;
import p131.p161.p211.p214.p215.C2561;
import p131.p161.p211.p214.p215.C2562;
import p131.p161.p211.p214.p215.C2609;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2654 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2622 f10111 = C2622.f10055;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public EnumC2527 f10107 = EnumC2527.f9869;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public InterfaceC2653 f10110 = EnumC2662.f10120;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Map<Type, InterfaceC2659<?>> f10114 = new HashMap();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final List<InterfaceC2656> f10112 = new ArrayList();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final List<InterfaceC2656> f10113 = new ArrayList();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f10108 = 2;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f10106 = 2;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f10115 = true;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f10109 = false;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2654 m4633(Type type, Object obj) {
        C1687.m3659(true);
        if (obj instanceof InterfaceC2659) {
            this.f10114.put(type, (InterfaceC2659) obj);
        }
        C2672 c2672 = new C2672(type);
        this.f10112.add(new C2609.C2611(obj, c2672, c2672.f10128 == c2672.f10130, null));
        if (obj instanceof AbstractC2658) {
            List<InterfaceC2656> list = this.f10112;
            AbstractC2658<Class> abstractC2658 = C2562.f9968;
            list.add(new C2560(new C2672(type), (AbstractC2658) obj));
        }
        return this;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2673 m4634() {
        ArrayList arrayList = new ArrayList(this.f10113.size() + this.f10112.size() + 3);
        arrayList.addAll(this.f10112);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f10113);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i = this.f10108;
        int i2 = this.f10106;
        if (i != 2 && i2 != 2) {
            C2540 c2540 = new C2540(Date.class, i, i2);
            C2540 c25402 = new C2540(Timestamp.class, i, i2);
            C2540 c25403 = new C2540(java.sql.Date.class, i, i2);
            AbstractC2658<Class> abstractC2658 = C2562.f9968;
            arrayList.add(new C2561(Date.class, c2540));
            arrayList.add(new C2561(Timestamp.class, c25402));
            arrayList.add(new C2561(java.sql.Date.class, c25403));
        }
        return new C2673(this.f10111, this.f10110, this.f10114, false, false, false, this.f10115, this.f10109, false, false, this.f10107, null, this.f10108, this.f10106, this.f10112, this.f10113, arrayList);
    }
}
