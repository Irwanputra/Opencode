package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C0432();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Month f3242;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int f3243;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Month f3244;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final DateValidator f3245;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int f3246;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Month f3247;

    public interface DateValidator extends Parcelable {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        boolean m1400(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0432 implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator, C0432 c0432) {
        this.f3242 = month;
        this.f3244 = month2;
        this.f3247 = month3;
        this.f3245 = dateValidator;
        if (month.f3249.compareTo(month3.f3249) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3.f3249.compareTo(month2.f3249) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f3243 = month.m1409(month2) + 1;
        this.f3246 = (month2.f3252 - month.f3252) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f3242.equals(calendarConstraints.f3242) && this.f3244.equals(calendarConstraints.f3244) && this.f3247.equals(calendarConstraints.f3247) && this.f3245.equals(calendarConstraints.f3245);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3242, this.f3244, this.f3247, this.f3245});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3242, 0);
        parcel.writeParcelable(this.f3244, 0);
        parcel.writeParcelable(this.f3247, 0);
        parcel.writeParcelable(this.f3245, 0);
    }
}
