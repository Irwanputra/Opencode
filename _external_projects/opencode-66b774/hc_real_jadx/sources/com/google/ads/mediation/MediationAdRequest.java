package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
/* loaded from: /tmp/opencode/hc_real.dex */
public class MediationAdRequest {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final AdRequest.Gender f2509;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Set<String> f2510;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Date f2511;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Location f2512;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final boolean f2513;

    public MediationAdRequest(Date date, AdRequest.Gender gender, Set<String> set, boolean z, Location location) {
        this.f2511 = date;
        this.f2509 = gender;
        this.f2510 = set;
        this.f2513 = z;
        this.f2512 = location;
    }

    public Integer getAgeInYears() {
        if (this.f2511 == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(this.f2511);
        Integer valueOf = Integer.valueOf(calendar2.get(1) - calendar.get(1));
        return (calendar2.get(2) < calendar.get(2) || (calendar2.get(2) == calendar.get(2) && calendar2.get(5) < calendar.get(5))) ? Integer.valueOf(valueOf.intValue() - 1) : valueOf;
    }

    public Date getBirthday() {
        return this.f2511;
    }

    public AdRequest.Gender getGender() {
        return this.f2509;
    }

    public Set<String> getKeywords() {
        return this.f2510;
    }

    public Location getLocation() {
        return this.f2512;
    }

    public boolean isTesting() {
        return this.f2513;
    }
}
