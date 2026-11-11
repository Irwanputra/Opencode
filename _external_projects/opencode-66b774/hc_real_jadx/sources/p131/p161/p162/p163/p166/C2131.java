package p131.p161.p162.p163.p166;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2131 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static AtomicReference<C2126> f8958 = new AtomicReference<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static TimeZone m4218() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static Calendar m4219() {
        C2126 c2126 = f8958.get();
        if (c2126 == null) {
            c2126 = C2126.f8944;
        }
        TimeZone timeZone = c2126.f8945;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = c2126.f8946;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(m4218());
        return calendar;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Calendar m4220(Calendar calendar) {
        Calendar m4221 = m4221(calendar);
        Calendar m4222 = m4222();
        m4222.set(m4221.get(1), m4221.get(2), m4221.get(5));
        return m4222;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static Calendar m4221(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m4218());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static Calendar m4222() {
        return m4221(null);
    }
}
