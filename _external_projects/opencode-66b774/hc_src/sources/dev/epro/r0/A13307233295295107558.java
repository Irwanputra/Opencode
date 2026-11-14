package dev.epro.r0;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A13307233295295107558 extends C10288805116980491173 {
    public static final ZoneId e;
    public final int c;
    public final ArrayList d;

    static {
        ZoneId of;
        of = ZoneId.of("UTC");
        e = of;
    }

    public A13307233295295107558(Locale locale) {
        super(locale);
        WeekFields of;
        DayOfWeek firstDayOfWeek;
        int value;
        String displayName;
        String displayName2;
        TextStyle unused;
        TextStyle unused2;
        of = WeekFields.of(locale);
        firstDayOfWeek = of.getFirstDayOfWeek();
        value = firstDayOfWeek.getValue();
        this.c = value;
        M665231115116566295 m665231115116566295 = M1942251782546639499.a;
        ArrayList arrayList = new ArrayList(m665231115116566295.a());
        int a = m665231115116566295.a();
        for (int i = 0; i < a; i++) {
            DayOfWeek f = D1067171241640027219.f(m665231115116566295.get(i));
            unused = TextStyle.FULL_STANDALONE;
            displayName = f.getDisplayName(TextStyle.FULL_STANDALONE, locale);
            unused2 = TextStyle.NARROW_STANDALONE;
            displayName2 = f.getDisplayName(TextStyle.NARROW_STANDALONE, locale);
            arrayList.add(new H9390398899829886498(displayName, displayName2));
        }
        this.d = arrayList;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final int d() {
        return this.c;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final G12426915514109744413 e(int i, int i2) {
        LocalDate of;
        of = LocalDate.of(i, i2, 1);
        return l(of);
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final G12426915514109744413 f(long j) {
        Instant ofEpochMilli;
        ZonedDateTime atZone;
        ZonedDateTime withDayOfMonth;
        LocalDate localDate;
        ofEpochMilli = Instant.ofEpochMilli(j);
        atZone = ofEpochMilli.atZone(e);
        withDayOfMonth = atZone.withDayOfMonth(1);
        localDate = withDayOfMonth.toLocalDate();
        return l(localDate);
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final G12426915514109744413 g(L15314296645528043221 l15314296645528043221) {
        LocalDate of;
        of = LocalDate.of(l15314296645528043221.a, l15314296645528043221.b, 1);
        return l(of);
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final List i() {
        return this.d;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final G12426915514109744413 k(G12426915514109744413 g12426915514109744413, int i) {
        Instant ofEpochMilli;
        ZonedDateTime atZone;
        LocalDate localDate;
        LocalDate plusMonths;
        if (i <= 0) {
            return g12426915514109744413;
        }
        ofEpochMilli = Instant.ofEpochMilli(g12426915514109744413.e);
        atZone = ofEpochMilli.atZone(e);
        localDate = atZone.toLocalDate();
        plusMonths = localDate.plusMonths(i);
        return l(plusMonths);
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.time.ZonedDateTime] */
    public final G12426915514109744413 l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.c;
        if (value < 0) {
            value += 7;
        }
        return new G12426915514109744413(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }
}
