package dev.epro.r0;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S18223337890679294771 extends K10678596132709730734 {
    public static final Z11244019023321623390 b = new Z11244019023321623390();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public class Z11244019023321623390 implements V4446577237959483780 {
        @Override // dev.epro.r0.V4446577237959483780
        public final K10678596132709730734 a(F14240031463097426304 f14240031463097426304, K11898134656129953686 k11898134656129953686) {
            if (k11898134656129953686.a == Date.class) {
                return new S18223337890679294771(0);
            }
            return null;
        }
    }

    private S18223337890679294771() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        Date date;
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        String F = d13396727227989475489.F();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    date = new Date(this.a.parse(F).getTime());
                } catch (ParseException e) {
                    throw new X13554947934760653097("Failed parsing '" + F + "' as SQL Date; at path " + d13396727227989475489.o(true), e);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            y14132333989764804283.p();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date);
        }
        y14132333989764804283.D(format);
    }

    public /* synthetic */ S18223337890679294771(int i) {
        this();
    }
}
