package dev.epro.r0;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class C10288805116980491173 {
    public final Locale a;
    public final LinkedHashMap b = new LinkedHashMap();

    public C10288805116980491173(Locale locale) {
        this.a = locale;
    }

    public String a(long j, String str, Locale locale) {
        return Instant.ofEpochMilli(j).atZone(A13307233295295107558.e).toLocalDate().format(S2941385686793915703.E(str, locale, this.b));
    }

    public L15314296645528043221 b(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(A13307233295295107558.e).toLocalDate();
        return new L15314296645528043221(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    public P9699383776227634085 c(Locale locale) {
        FormatStyle unused = FormatStyle.SHORT;
        return Q13169198992966610970.T(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    public abstract int d();

    public abstract G12426915514109744413 e(int i, int i2);

    public abstract G12426915514109744413 f(long j);

    public abstract G12426915514109744413 g(L15314296645528043221 l15314296645528043221);

    /* JADX WARN: Type inference failed for: r6v3, types: [java.time.ZonedDateTime] */
    public L15314296645528043221 h() {
        LocalDate localDateNow = LocalDate.now();
        return new L15314296645528043221(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(A13307233295295107558.e).toInstant().toEpochMilli());
    }

    public abstract List i();

    /* JADX WARN: Type inference failed for: r6v6, types: [java.time.ZonedDateTime] */
    public L15314296645528043221 j(String str, String str2, Locale locale) {
        try {
            LocalDate localDate = LocalDate.parse(str, S2941385686793915703.E(str2, locale, this.b));
            return new L15314296645528043221(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(A13307233295295107558.e).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public abstract G12426915514109744413 k(G12426915514109744413 g12426915514109744413, int i);
}
