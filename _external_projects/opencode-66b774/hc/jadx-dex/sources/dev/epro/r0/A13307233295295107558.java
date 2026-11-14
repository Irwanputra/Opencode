package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A13307233295295107558 extends dev.epro.r0.C10288805116980491173 {
    public static final java.time.ZoneId e = java.time.ZoneId.of("UTC");
    public final int c;
    public final java.util.ArrayList d;

    public A13307233295295107558(java.util.Locale locale) {
        super(locale);
        this.c = java.time.temporal.WeekFields.of(locale).getFirstDayOfWeek().getValue();
        dev.epro.r0.M665231115116566295 m665231115116566295 = dev.epro.r0.M1942251782546639499.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(m665231115116566295.a());
        int iA = m665231115116566295.a();
        for (int i = 0; i < iA; i++) {
            java.time.DayOfWeek dayOfWeekF = dev.epro.r0.D1067171241640027219.f(m665231115116566295.get(i));
            java.time.format.TextStyle unused = java.time.format.TextStyle.FULL_STANDALONE;
            java.lang.String displayName = dayOfWeekF.getDisplayName(java.time.format.TextStyle.FULL_STANDALONE, locale);
            java.time.format.TextStyle unused2 = java.time.format.TextStyle.NARROW_STANDALONE;
            arrayList.add(new dev.epro.r0.H9390398899829886498(displayName, dayOfWeekF.getDisplayName(java.time.format.TextStyle.NARROW_STANDALONE, locale)));
        }
        this.d = arrayList;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final int d() {
        return this.c;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final dev.epro.r0.G12426915514109744413 e(int i, int i2) {
        return l(java.time.LocalDate.of(i, i2, 1));
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final dev.epro.r0.G12426915514109744413 f(long j) {
        return l(java.time.Instant.ofEpochMilli(j).atZone(e).withDayOfMonth(1).toLocalDate());
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final dev.epro.r0.G12426915514109744413 g(dev.epro.r0.L15314296645528043221 l15314296645528043221) {
        return l(java.time.LocalDate.of(l15314296645528043221.a, l15314296645528043221.b, 1));
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final java.util.List i() {
        return this.d;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final dev.epro.r0.G12426915514109744413 k(dev.epro.r0.G12426915514109744413 g12426915514109744413, int i) {
        return i <= 0 ? g12426915514109744413 : l(java.time.Instant.ofEpochMilli(g12426915514109744413.e).atZone(e).toLocalDate().plusMonths(i));
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.time.ZonedDateTime] */
    public final dev.epro.r0.G12426915514109744413 l(java.time.LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.c;
        if (value < 0) {
            value += 7;
        }
        return new dev.epro.r0.G12426915514109744413(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(java.time.LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
    }

    public final java.lang.String toString() {
        return "CalendarModel";
    }
}
