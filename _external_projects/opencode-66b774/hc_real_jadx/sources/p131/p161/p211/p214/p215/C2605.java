package p131.p161.p211.p214.p215;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2531;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p213.EnumC2533;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2605 extends AbstractC2658<Time> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final InterfaceC2656 f10019 = new C2606();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final DateFormat f10020 = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.てぜきぽく$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2606 implements InterfaceC2656 {
        @Override // p131.p161.p211.InterfaceC2656
        /* renamed from: げつ〴ぬぐ */
        public <T> AbstractC2658<T> mo4592(C2673 c2673, C2672<T> c2672) {
            if (c2672.f10130 == Time.class) {
                return new C2605();
            }
            return null;
        }
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: 〺つふすそ */
    public void mo4533(C2534 c2534, Time time) {
        Time time2 = time;
        synchronized (this) {
            c2534.mo4548(time2 == null ? null : this.f10020.format((Date) time2));
        }
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: げつ〴ぬぐ */
    public Time mo4534(C2535 c2535) {
        synchronized (this) {
            if (c2535.mo4559() == EnumC2533.NULL) {
                c2535.mo4572();
                return null;
            }
            try {
                return new Time(this.f10020.parse(c2535.mo4580()).getTime());
            } catch (ParseException e) {
                throw new C2531(e);
            }
        }
    }
}
