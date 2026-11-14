package dev.epro.r0;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C9446289436392976707 extends C10288805116980491173 {
    public static final TimeZone e = TimeZone.getTimeZone("UTC");
    public final int c;
    public final G9506192477171422664 d;

    public C9446289436392976707(Locale locale) {
        super(locale);
        int firstDayOfWeek = (Calendar.getInstance(locale).getFirstDayOfWeek() + 6) % 7;
        this.c = firstDayOfWeek != 0 ? firstDayOfWeek : 7;
        G9506192477171422664 g9506192477171422664F = K5751602218013079365.F();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List listW0 = O5378677881740157249.w0(weekdays);
        int size = listW0.size();
        for (int i = 0; i < size; i++) {
            g9506192477171422664F.add(new H9390398899829886498((String) listW0.get(i), shortWeekdays[i + 2]));
        }
        g9506192477171422664F.add(new H9390398899829886498(weekdays[1], shortWeekdays[1]));
        this.d = K5751602218013079365.v(g9506192477171422664F);
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final String a(long j, String str, Locale locale) {
        String str2 = str + locale.toLanguageTag();
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(str2);
        TimeZone timeZone = e;
        Object obj2 = obj;
        if (obj == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(timeZone);
            linkedHashMap.put(str2, simpleDateFormat);
            obj2 = simpleDateFormat;
        }
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        return ((SimpleDateFormat) obj2).format(Long.valueOf(calendar.getTimeInMillis()));
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final L15314296645528043221 b(long j) {
        Calendar calendar = Calendar.getInstance(e);
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new L15314296645528043221(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final P9699383776227634085 c(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        dateInstance.getClass();
        return Q13169198992966610970.T(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final int d() {
        return this.c;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final G12426915514109744413 e(int i, int i2) {
        Calendar calendar = Calendar.getInstance(e);
        calendar.clear();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, 1);
        return l(calendar);
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final G12426915514109744413 f(long j) {
        Calendar calendar = Calendar.getInstance(e);
        calendar.setTimeInMillis(j);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return l(calendar);
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final G12426915514109744413 g(L15314296645528043221 l15314296645528043221) {
        return e(l15314296645528043221.a, l15314296645528043221.b);
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final L15314296645528043221 h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new L15314296645528043221(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + ((long) (calendar.get(16) + calendar.get(15))));
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final List i() {
        return this.d;
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final L15314296645528043221 j(String str, String str2, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = e;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new L15314296645528043221(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // dev.epro.r0.C10288805116980491173
    public final G12426915514109744413 k(G12426915514109744413 g12426915514109744413, int i) {
        if (i <= 0) {
            return g12426915514109744413;
        }
        Calendar calendar = Calendar.getInstance(e);
        calendar.setTimeInMillis(g12426915514109744413.e);
        calendar.add(2, i);
        return l(calendar);
    }

    public final G12426915514109744413 l(Calendar calendar) {
        int i = (calendar.get(7) + 6) % 7;
        int i2 = (i != 0 ? i : 7) - this.c;
        if (i2 < 0) {
            i2 += 7;
        }
        return new G12426915514109744413(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), i2, calendar.getTimeInMillis());
    }

    public final String toString() {
        return "LegacyCalendarModel";
    }
}
