package dev.epro.r0;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A13307233295295107558 extends C10288805116980491173 {
    public static final ZoneId e = ZoneId.of("UTC");
    public final int c;
    public final ArrayList d;

    public A13307233295295107558(Locale locale) {
        super(locale);
        this.c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        M665231115116566295 m665231115116566295 = M1942251782546639499.a;
        ArrayList arrayList = new ArrayList(m665231115116566295.a());
        int iA = m665231115116566295.a();
        for (int i = 0; i < iA; i++) {
            DayOfWeek dayOfWeekF = D1067171241640027219.f(m665231115116566295.get(i));
            TextStyle unused = TextStyle.FULL_STANDALONE;
            String displayName = dayOfWeekF.getDisplayName(TextStyle.FULL_STANDALONE, locale);
            TextStyle unused2 = TextStyle.NARROW_STANDALONE;
            arrayList.add(new H9390398899829886498(displayName, dayOfWeekF.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.d = arrayList;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final int d() {
        return this.c;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final G12426915514109744413 e(int i, int i2) {
        return l(LocalDate.of(i, i2, 1));
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final G12426915514109744413 f(long j) {
        return l(Instant.ofEpochMilli(j).atZone(e).withDayOfMonth(1).toLocalDate());
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final G12426915514109744413 g(L15314296645528043221 l15314296645528043221) {
        return l(LocalDate.of(l15314296645528043221.a, l15314296645528043221.b, 1));
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final List i() {
        return this.d;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final G12426915514109744413 k(G12426915514109744413 g12426915514109744413, int i) {
        return i <= 0 ? g12426915514109744413 : l(Instant.ofEpochMilli(g12426915514109744413.e).atZone(e).toLocalDate().plusMonths(i));
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
