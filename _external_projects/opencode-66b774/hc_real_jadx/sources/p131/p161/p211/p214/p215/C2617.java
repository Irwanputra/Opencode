package p131.p161.p211.p214.p215;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2531;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p213.EnumC2533;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2617 extends AbstractC2658<Date> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final InterfaceC2656 f10051 = new C2618();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final DateFormat f10052 = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.ぺふねづ〺$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2618 implements InterfaceC2656 {
        @Override // p131.p161.p211.InterfaceC2656
        /* renamed from: げつ〴ぬぐ */
        public <T> AbstractC2658<T> mo4592(C2673 c2673, C2672<T> c2672) {
            if (c2672.f10130 == Date.class) {
                return new C2617();
            }
            return null;
        }
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: 〺つふすそ */
    public void mo4533(C2534 c2534, Date date) {
        Date date2 = date;
        synchronized (this) {
            c2534.mo4548(date2 == null ? null : this.f10052.format((java.util.Date) date2));
        }
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: げつ〴ぬぐ */
    public Date mo4534(C2535 c2535) {
        Date date;
        synchronized (this) {
            if (c2535.mo4559() == EnumC2533.NULL) {
                c2535.mo4572();
                date = null;
            } else {
                try {
                    date = new Date(this.f10052.parse(c2535.mo4580()).getTime());
                } catch (ParseException e) {
                    throw new C2531(e);
                }
            }
        }
        return date;
    }
}
