package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C9446289436392976707 extends dev.epro.r0.C10288805116980491173 {
    public static final java.util.TimeZone e = java.util.TimeZone.getTimeZone("UTC");
    public final int c;
    public final dev.epro.r0.G9506192477171422664 d;

    public C9446289436392976707(java.util.Locale locale) {
        super(locale);
        int firstDayOfWeek = (java.util.Calendar.getInstance(locale).getFirstDayOfWeek() + 6) % 7;
        this.c = firstDayOfWeek != 0 ? firstDayOfWeek : 7;
        dev.epro.r0.G9506192477171422664 g9506192477171422664F = dev.epro.r0.K5751602218013079365.F();
        java.lang.String[] weekdays = new java.text.DateFormatSymbols(locale).getWeekdays();
        java.lang.String[] shortWeekdays = new java.text.DateFormatSymbols(locale).getShortWeekdays();
        java.util.List listW0 = dev.epro.r0.O5378677881740157249.w0(weekdays);
        int size = listW0.size();
        for (int i = 0; i < size; i++) {
            g9506192477171422664F.add(new dev.epro.r0.H9390398899829886498((java.lang.String) listW0.get(i), shortWeekdays[i + 2]));
        }
        g9506192477171422664F.add(new dev.epro.r0.H9390398899829886498(weekdays[1], shortWeekdays[1]));
        this.d = dev.epro.r0.K5751602218013079365.v(g9506192477171422664F);
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final java.lang.String a(long j, java.lang.String str, java.util.Locale locale) {
        java.lang.String str2 = str + locale.toLanguageTag();
        java.util.LinkedHashMap linkedHashMap = this.b;
        java.lang.Object obj = linkedHashMap.get(str2);
        java.util.TimeZone timeZone = e;
        java.lang.Object obj2 = obj;
        if (obj == null) {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(timeZone);
            linkedHashMap.put(str2, simpleDateFormat);
            obj2 = simpleDateFormat;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        return ((java.text.SimpleDateFormat) obj2).format(java.lang.Long.valueOf(calendar.getTimeInMillis()));
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final dev.epro.r0.L15314296645528043221 b(long j) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(e);
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new dev.epro.r0.L15314296645528043221(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final dev.epro.r0.P9699383776227634085 c(java.util.Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(3, locale);
        dateInstance.getClass();
        return dev.epro.r0.Q13169198992966610970.T(((java.text.SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final int d() {
        return this.c;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final dev.epro.r0.G12426915514109744413 e(int i, int i2) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(e);
        calendar.clear();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, 1);
        return l(calendar);
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final dev.epro.r0.G12426915514109744413 f(long j) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(e);
        calendar.setTimeInMillis(j);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return l(calendar);
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final dev.epro.r0.G12426915514109744413 g(dev.epro.r0.L15314296645528043221 l15314296645528043221) {
        return e(l15314296645528043221.a, l15314296645528043221.b);
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final dev.epro.r0.L15314296645528043221 h() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new dev.epro.r0.L15314296645528043221(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + ((long) (calendar.get(16) + calendar.get(15))));
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final java.util.List i() {
        return this.d;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final dev.epro.r0.L15314296645528043221 j(java.lang.String str, java.lang.String str2, java.util.Locale locale) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str2);
        java.util.TimeZone timeZone = e;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            java.util.Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            java.util.Calendar calendar = java.util.Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new dev.epro.r0.L15314296645528043221(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final dev.epro.r0.G12426915514109744413 k(dev.epro.r0.G12426915514109744413 g12426915514109744413, int i) {
        if (i <= 0) {
            return g12426915514109744413;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance(e);
        calendar.setTimeInMillis(g12426915514109744413.e);
        calendar.add(2, i);
        return l(calendar);
    }

    public final dev.epro.r0.G12426915514109744413 l(java.util.Calendar calendar) {
        int i = (calendar.get(7) + 6) % 7;
        int i2 = (i != 0 ? i : 7) - this.c;
        if (i2 < 0) {
            i2 += 7;
        }
        return new dev.epro.r0.G12426915514109744413(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), i2, calendar.getTimeInMillis());
    }

    public final java.lang.String toString() {
        return "LegacyCalendarModel";
    }
}
