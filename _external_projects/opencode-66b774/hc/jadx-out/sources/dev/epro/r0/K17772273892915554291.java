package dev.epro.r0;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class K17772273892915554291 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        int iZ;
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        d13396727227989475489.c();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (d13396727227989475489.H() == 4) {
                d13396727227989475489.h();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }
            String strB = d13396727227989475489.B();
            iZ = d13396727227989475489.z();
            switch (strB) {
                case "dayOfMonth":
                    i3 = iZ;
                    break;
                case "minute":
                    i5 = iZ;
                    break;
                case "second":
                    i6 = iZ;
                    break;
                case "year":
                    i = iZ;
                    break;
                case "month":
                    i2 = iZ;
                    break;
                case "hourOfDay":
                    i4 = iZ;
                    break;
            }
        }
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            y14132333989764804283.p();
            return;
        }
        y14132333989764804283.d();
        y14132333989764804283.j("year");
        y14132333989764804283.A(r4.get(1));
        y14132333989764804283.j("month");
        y14132333989764804283.A(r4.get(2));
        y14132333989764804283.j("dayOfMonth");
        y14132333989764804283.A(r4.get(5));
        y14132333989764804283.j("hourOfDay");
        y14132333989764804283.A(r4.get(11));
        y14132333989764804283.j("minute");
        y14132333989764804283.A(r4.get(12));
        y14132333989764804283.j("second");
        y14132333989764804283.A(r4.get(13));
        y14132333989764804283.h();
    }
}
