package dev.epro.r0;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X1392955191090590452 extends K10678596132709730734 {
    public static final Q12579737410315239755 c = new Q12579737410315239755();
    public final R5812832838199629250 a;
    public final ArrayList b;

    public X1392955191090590452(R5812832838199629250 r5812832838199629250) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(r5812832838199629250);
        this.a = r5812832838199629250;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (Q16994777955487680450.a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        Date dateB;
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        String strF = d13396727227989475489.F();
        synchronized (this.b) {
            try {
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        try {
                            dateB = Q4972645145609192794.b(strF, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder sbG = X2485016533998461232.g("Failed parsing '", strF, "' as Date; at path ");
                            sbG.append(d13396727227989475489.o(true));
                            throw new X13554947934760653097(sbG.toString(), e);
                        }
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strF);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.a.a(dateB);
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            y14132333989764804283.p();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            str = dateFormat.format(date);
        }
        y14132333989764804283.D(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
