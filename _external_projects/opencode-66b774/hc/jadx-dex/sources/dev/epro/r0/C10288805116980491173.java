package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C10288805116980491173 {
    public final java.util.Locale a;
    public final java.util.LinkedHashMap b = new java.util.LinkedHashMap();

    public C10288805116980491173(java.util.Locale locale) {
        this.a = locale;
    }

    public java.lang.String a(long j, java.lang.String str, java.util.Locale locale) {
        return java.time.Instant.ofEpochMilli(j).atZone(dev.epro.r0.A13307233295295107558.e).toLocalDate().format(dev.epro.r0.S2941385686793915703.E(str, locale, this.b));
    }

    public dev.epro.r0.L15314296645528043221 b(long j) {
        java.time.LocalDate localDate = java.time.Instant.ofEpochMilli(j).atZone(dev.epro.r0.A13307233295295107558.e).toLocalDate();
        return new dev.epro.r0.L15314296645528043221(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(java.time.ZoneOffset.UTC));
    }

    public dev.epro.r0.P9699383776227634085 c(java.util.Locale locale) {
        java.time.format.FormatStyle unused = java.time.format.FormatStyle.SHORT;
        return dev.epro.r0.Q13169198992966610970.T(java.time.format.DateTimeFormatterBuilder.getLocalizedDateTimePattern(java.time.format.FormatStyle.SHORT, null, java.time.chrono.Chronology.ofLocale(locale), locale));
    }

    public abstract int d();

    public abstract dev.epro.r0.G12426915514109744413 e(int i, int i2);

    public abstract dev.epro.r0.G12426915514109744413 f(long j);

    public abstract dev.epro.r0.G12426915514109744413 g(dev.epro.r0.L15314296645528043221 l15314296645528043221);

    /* JADX WARN: Type inference failed for: r6v3, types: [java.time.ZonedDateTime] */
    public dev.epro.r0.L15314296645528043221 h() {
        java.time.LocalDate localDateNow = java.time.LocalDate.now();
        return new dev.epro.r0.L15314296645528043221(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(java.time.LocalTime.MIDNIGHT).atZone(dev.epro.r0.A13307233295295107558.e).toInstant().toEpochMilli());
    }

    public abstract java.util.List i();

    /* JADX WARN: Type inference failed for: r6v6, types: [java.time.ZonedDateTime] */
    public dev.epro.r0.L15314296645528043221 j(java.lang.String str, java.lang.String str2, java.util.Locale locale) {
        try {
            java.time.LocalDate localDate = java.time.LocalDate.parse(str, dev.epro.r0.S2941385686793915703.E(str2, locale, this.b));
            return new dev.epro.r0.L15314296645528043221(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(java.time.LocalTime.MIDNIGHT).atZone(dev.epro.r0.A13307233295295107558.e).toInstant().toEpochMilli());
        } catch (java.time.format.DateTimeParseException unused) {
            return null;
        }
    }

    public abstract dev.epro.r0.G12426915514109744413 k(dev.epro.r0.G12426915514109744413 g12426915514109744413, int i);
}
