package de.blinkt.openvpn.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedList;
import p010.p011.p012.C0775;
import p010.p011.p012.p013.C0753;
import p010.p011.p012.p013.C0765;
import p010.p011.p012.p013.InterfaceC0737;
import p034.p095.C1687;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class DeviceStateReceiver extends BroadcastReceiver implements C0753.InterfaceC0756, InterfaceC0737.InterfaceC0739 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Runnable f3672;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Handler f3673;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String f3674;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public LinkedList<C0491> f3675;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public InterfaceC0737 f3676;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public EnumC0492 f3677;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public EnumC0492 f3678;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public EnumC0492 f3679 = EnumC0492.f3686;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public NetworkInfo f3680;

    /* renamed from: de.blinkt.openvpn.core.DeviceStateReceiver$〺つふすそ, reason: contains not printable characters */
    public static class C0491 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public long f3681;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public long f3682;

        public C0491(long j, long j2, RunnableC0493 runnableC0493) {
            this.f3682 = j;
            this.f3681 = j2;
        }
    }

    /* renamed from: de.blinkt.openvpn.core.DeviceStateReceiver$くし〴〺ぅ, reason: contains not printable characters */
    public enum EnumC0492 {
        f3683,
        f3684,
        f3686
    }

    /* renamed from: de.blinkt.openvpn.core.DeviceStateReceiver$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0493 implements Runnable {
        public RunnableC0493() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceStateReceiver deviceStateReceiver = DeviceStateReceiver.this;
            EnumC0492 enumC0492 = deviceStateReceiver.f3679;
            EnumC0492 enumC04922 = EnumC0492.f3684;
            if (enumC0492 != enumC04922) {
                return;
            }
            EnumC0492 enumC04923 = EnumC0492.f3686;
            deviceStateReceiver.f3679 = enumC04923;
            if (deviceStateReceiver.f3677 == enumC04922) {
                deviceStateReceiver.f3677 = enumC04923;
            }
            deviceStateReceiver.f3676.mo2005(deviceStateReceiver.m1571());
        }
    }

    public DeviceStateReceiver(InterfaceC0737 interfaceC0737) {
        EnumC0492 enumC0492 = EnumC0492.f3683;
        this.f3677 = enumC0492;
        this.f3678 = enumC0492;
        this.f3674 = null;
        this.f3672 = new RunnableC0493();
        this.f3675 = new LinkedList<>();
        this.f3676 = interfaceC0737;
        interfaceC0737.mo2009(this);
        this.f3673 = new Handler();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        SharedPreferences m3670 = C1687.m3670(context);
        if (Crypt.a(Crypt.xrc("Ad9A3>\u001deh\u0019emMbgHkjK19Ac=K`gM6l\u001bf=M6=NjnL4hKg=Mfl\u001e`iI0<Hfl\u001cahO`i\u0019`=Lam\u001eb=Iem@k9\u001b`>K1mNgj\u001969\u001e0hNgh")).equals(intent.getAction())) {
            m1570(context);
            return;
        }
        if (!Crypt.a(Crypt.xrc("L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4<\u001akmMf<L7fHg=\u001cbh\u001dj<Kfk\u001b`i\u001db<Ljo\u001cfm\u001dd:Ajf\u001ddh\u001d39K6fK1fHdiJe9A`nLg:")).equals(intent.getAction())) {
            if (Crypt.a(Crypt.xrc("L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4k\u001b`:J4=\u001cj:\u0019`:\u001ddgM0oIcoK1oK4l\u001dbiI")).equals(intent.getAction())) {
                boolean m1573 = m1573();
                this.f3677 = EnumC0492.f3683;
                this.f3673.removeCallbacks(this.f3672);
                if (m1573() != m1573) {
                    this.f3676.resume();
                    return;
                } else {
                    if (m1573()) {
                        return;
                    }
                    this.f3676.mo2005(m1571());
                    return;
                }
            }
            return;
        }
        if (m3670.getBoolean(Crypt.a(Crypt.xrc("@f>\u001e6jJg>Nfi\u001d4:M7f\u001echOdgK6kN`fKa")), false)) {
            C0775 c0775 = C0765.f4909;
            if (c0775 != null && !c0775.f4997) {
                C0753.m2027(2131821231);
            }
            this.f3677 = EnumC0492.f3684;
            this.f3675.add(new C0491(System.currentTimeMillis(), 65536L, null));
            EnumC0492 enumC0492 = this.f3679;
            EnumC0492 enumC04922 = EnumC0492.f3686;
            if (enumC0492 == enumC04922 || this.f3678 == enumC04922) {
                this.f3677 = enumC04922;
            }
        }
    }

    @Override // p010.p011.p012.p013.C0753.InterfaceC0756
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo1569(long j, long j2, long j3, long j4) {
        if (this.f3677 != EnumC0492.f3684) {
            return;
        }
        this.f3675.add(new C0491(System.currentTimeMillis(), j3 + j4, null));
        while (this.f3675.getFirst().f3682 <= System.currentTimeMillis() - 60000) {
            this.f3675.removeFirst();
        }
        long j5 = 0;
        Iterator<C0491> it = this.f3675.iterator();
        while (it.hasNext()) {
            j5 += it.next().f3681;
        }
        if (j5 < 65536) {
            this.f3677 = EnumC0492.f3686;
            C0753.m2043(2131821232, Crypt.a(Crypt.xrc("\u0019`i@4f\u001e6h@4gMg<N1:Ig;\u0019f;LckNkjHf")), 60);
            this.f3676.mo2005(m1571());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1570(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.DeviceStateReceiver.m1570(android.content.Context):void");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC0737.EnumC0738 m1571() {
        InterfaceC0737.EnumC0738 enumC0738 = InterfaceC0737.EnumC0738.f4829;
        EnumC0492 enumC0492 = this.f3678;
        EnumC0492 enumC04922 = EnumC0492.f3686;
        return enumC0492 == enumC04922 ? enumC0738 : this.f3677 == enumC04922 ? InterfaceC0737.EnumC0738.f4831 : this.f3679 == enumC04922 ? InterfaceC0737.EnumC0738.f4828 : enumC0738;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m1572(boolean z) {
        if (z) {
            this.f3678 = EnumC0492.f3686;
        } else {
            boolean m1573 = m1573();
            this.f3678 = EnumC0492.f3683;
            if (m1573() && !m1573) {
                this.f3676.resume();
                return;
            }
        }
        this.f3676.mo2005(m1571());
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final boolean m1573() {
        EnumC0492 enumC0492 = this.f3677;
        EnumC0492 enumC04922 = EnumC0492.f3683;
        return enumC0492 == enumC04922 && this.f3678 == enumC04922 && this.f3679 == enumC04922;
    }
}
