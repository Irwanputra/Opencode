package p131.p161.p211.p214.p215;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p034.p095.C1687;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p214.C2619;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2595 extends AbstractC2658<Date> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final InterfaceC2656 f10001 = new C2596();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final List<DateFormat> f10002;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2596 implements InterfaceC2656 {
        @Override // p131.p161.p211.InterfaceC2656
        /* renamed from: げつ〴ぬぐ */
        public <T> AbstractC2658<T> mo4592(C2673 c2673, C2672<T> c2672) {
            if (c2672.f10130 == Date.class) {
                return new C2595();
            }
            return null;
        }
    }

    public C2595() {
        ArrayList arrayList = new ArrayList();
        this.f10002 = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C2619.f10053 >= 9) {
            arrayList.add(C1687.m3673(2, 2));
        }
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: 〺つふすそ */
    public void mo4533(C2534 c2534, Date date) {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                c2534.mo4541();
            } else {
                c2534.mo4548(this.f10002.get(0).format(date2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
    
        r3 = p131.p161.p211.p214.p215.p216.C2601.m4599(r3, new java.text.ParsePosition(0));
     */
    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: げつ〴ぬぐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Date mo4534(p131.p161.p211.p213.C2535 r3) {
        /*
            r2 = this;
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉひのべい.〺つふすそ r0 = r3.mo4559()
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉひのべい.〺つふすそ r1 = p131.p161.p211.p213.EnumC2533.NULL
            if (r0 != r1) goto Ld
            r3.mo4572()
            r3 = 0
            goto L34
        Ld:
            java.lang.String r3 = r3.mo4580()
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r2.f10002     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3c
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L3c
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L18 java.lang.Throwable -> L3c
            goto L33
        L29:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
            r1 = 0
            r0.<init>(r1)     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
            java.util.Date r3 = p131.p161.p211.p214.p215.p216.C2601.m4599(r3, r0)     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
        L33:
            monitor-exit(r2)
        L34:
            return r3
        L35:
            r0 = move-exception
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉ〲なぱぽた r1 = new なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉ〲なぱぽた     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L3c
            throw r1     // Catch: java.lang.Throwable -> L3c
        L3c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p211.p214.p215.C2595.mo4534(なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉひのべい.げつ〴ぬぐ):java.lang.Object");
    }
}
