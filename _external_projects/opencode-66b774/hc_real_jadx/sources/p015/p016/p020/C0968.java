package p015.p016.p020;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import p015.p016.C0787;
import p015.p016.p020.C0958;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.びぐびあび.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0968 implements Map.Entry<String, String>, Cloneable {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final String[] f5301 = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f5302;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f5303;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C0956 f5304;

    public C0968(String str, String str2, C0956 c0956) {
        C1687.m3701(str);
        this.f5302 = str.trim();
        C1687.m3654(str);
        this.f5303 = str2;
        this.f5304 = c0956;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m2277(String str, String str2, C0958.C0960 c0960) {
        if (c0960.f5277 == C0958.C0960.EnumC0961.html) {
            if (str2 == null) {
                return true;
            }
            if ("".equals(str2) || str2.equalsIgnoreCase(str)) {
                if (Arrays.binarySearch(f5301, str) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public Object clone() {
        try {
            return (C0968) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0968 c0968 = (C0968) obj;
        String str = this.f5302;
        if (str == null ? c0968.f5302 != null : !str.equals(c0968.f5302)) {
            return false;
        }
        String str2 = this.f5303;
        String str3 = c0968.f5303;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return this.f5302;
    }

    @Override // java.util.Map.Entry
    public String getValue() {
        return this.f5303;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.f5302;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f5303;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public String setValue(String str) {
        int m2265;
        String str2 = str;
        String m2263 = this.f5304.m2263(this.f5302);
        C0956 c0956 = this.f5304;
        if (c0956 != null && (m2265 = c0956.m2265(this.f5302)) != -1) {
            this.f5304.f5268[m2265] = str2;
        }
        this.f5303 = str2;
        return m2263;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            C0958.C0960 c0960 = new C0958("").f5271;
            String str = this.f5302;
            String str2 = this.f5303;
            sb.append((CharSequence) str);
            if (!m2277(str, str2, c0960)) {
                sb.append((CharSequence) "=\"");
                if (str2 == null) {
                    str2 = "";
                }
                C0962.m2273(sb, str2, c0960, true, false, false);
                sb.append('\"');
            }
            return sb.toString();
        } catch (IOException e) {
            throw new C0787(e);
        }
    }
}
