package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import p131.p161.p162.p163.p166.C2131;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C0434();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Calendar f3249;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int f3250;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final String f3251;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int f3252;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int f3253;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f3254;

    /* renamed from: com.google.android.material.datepicker.Month$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0434 implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        public Month createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Calendar m4222 = C2131.m4222();
            m4222.set(1, readInt);
            m4222.set(2, readInt2);
            return new Month(m4222);
        }

        @Override // android.os.Parcelable.Creator
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m4220 = C2131.m4220(calendar);
        this.f3249 = m4220;
        this.f3254 = m4220.get(2);
        this.f3252 = m4220.get(1);
        this.f3253 = m4220.getMaximum(7);
        this.f3250 = m4220.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(C2131.m4218());
        this.f3251 = simpleDateFormat.format(m4220.getTime());
        m4220.getTimeInMillis();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f3254 == month.f3254 && this.f3252 == month.f3252;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3254), Integer.valueOf(this.f3252)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3252);
        parcel.writeInt(this.f3254);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Month m1406(int i) {
        Calendar m4220 = C2131.m4220(this.f3249);
        m4220.add(2, i);
        return new Month(m4220);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int m1407() {
        int firstDayOfWeek = this.f3249.get(7) - this.f3249.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f3253 : firstDayOfWeek;
    }

    @Override // java.lang.Comparable
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f3249.compareTo(month.f3249);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int m1409(Month month) {
        if (!(this.f3249 instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f3254 - this.f3254) + ((month.f3252 - this.f3252) * 12);
    }
}
