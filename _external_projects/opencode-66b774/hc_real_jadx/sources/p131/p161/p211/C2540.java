package p131.p161.p211;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p214.C2619;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2540 extends AbstractC2658<Date> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final List<DateFormat> f9910;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Class<? extends Date> f9911;

    public C2540(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f9910 = arrayList;
        m4586(cls);
        this.f9911 = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C2619.f10053 >= 9) {
            arrayList.add(C1687.m3673(i, i2));
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static Class<? extends Date> m4586(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    public String toString() {
        StringBuilder m4207;
        String simpleName;
        DateFormat dateFormat = this.f9910.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            m4207 = C2098.m4207("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            m4207 = C2098.m4207("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        m4207.append(simpleName);
        m4207.append(')');
        return m4207.toString();
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: 〺つふすそ */
    public void mo4533(C2534 c2534, Date date) {
        Date date2 = date;
        if (date2 == null) {
            c2534.mo4541();
            return;
        }
        synchronized (this.f9910) {
            c2534.mo4548(this.f9910.get(0).format(date2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x002b, code lost:
    
        r4 = p131.p161.p211.p214.p215.p216.C2601.m4599(r4, new java.text.ParsePosition(0));
     */
    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: げつ〴ぬぐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Date mo4534(p131.p161.p211.p213.C2535 r4) {
        /*
            r3 = this;
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉひのべい.〺つふすそ r0 = r4.mo4559()
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉひのべい.〺つふすそ r1 = p131.p161.p211.p213.EnumC2533.NULL
            if (r0 != r1) goto Ld
            r4.mo4572()
            r4 = 0
            goto L5a
        Ld:
            java.lang.String r4 = r4.mo4580()
            java.util.List<java.text.DateFormat> r0 = r3.f9910
            monitor-enter(r0)
            java.util.List<java.text.DateFormat> r1 = r3.f9910     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L68
        L1a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L68
            java.text.DateFormat r2 = (java.text.DateFormat) r2     // Catch: java.lang.Throwable -> L68
            java.util.Date r4 = r2.parse(r4)     // Catch: java.text.ParseException -> L1a java.lang.Throwable -> L68
            goto L35
        L2b:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L61 java.lang.Throwable -> L68
            r2 = 0
            r1.<init>(r2)     // Catch: java.text.ParseException -> L61 java.lang.Throwable -> L68
            java.util.Date r4 = p131.p161.p211.p214.p215.p216.C2601.m4599(r4, r1)     // Catch: java.text.ParseException -> L61 java.lang.Throwable -> L68
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Class<? extends java.util.Date> r0 = r3.f9911
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L3d
            goto L5a
        L3d:
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            if (r0 != r1) goto L4c
            java.sql.Timestamp r0 = new java.sql.Timestamp
            long r1 = r4.getTime()
            r0.<init>(r1)
        L4a:
            r4 = r0
            goto L5a
        L4c:
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r0 != r1) goto L5b
            java.sql.Date r0 = new java.sql.Date
            long r1 = r4.getTime()
            r0.<init>(r1)
            goto L4a
        L5a:
            return r4
        L5b:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L61:
            r1 = move-exception
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉ〲なぱぽた r2 = new なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉ〲なぱぽた     // Catch: java.lang.Throwable -> L68
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L68
            throw r2     // Catch: java.lang.Throwable -> L68
        L68:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            goto L6c
        L6b:
            throw r4
        L6c:
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p211.C2540.mo4534(なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉひのべい.げつ〴ぬぐ):java.lang.Object");
    }
}
