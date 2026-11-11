package p015.p016.p018;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;
import org.jasypt.intf.cli.ArgumentNaming;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.づざかべべ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0800 {

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static final String[] f5063;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public String f5068;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final Map<String, C0800> f5056 = new HashMap();

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final String[] f5060 = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", ArgumentNaming.ARG_INPUT, "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", NotificationCompat.CATEGORY_PROGRESS, "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s"};

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static final String[] f5061 = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", ArgumentNaming.ARG_INPUT, "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static final String[] f5062 = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static final String[] f5059 = {"pre", "plaintext", "title", "textarea"};

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static final String[] f5057 = {"button", "fieldset", ArgumentNaming.ARG_INPUT, "keygen", "object", "output", "select", "textarea"};

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final String[] f5058 = {ArgumentNaming.ARG_INPUT, "keygen", "object", "select", "textarea"};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f5065 = true;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f5067 = true;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f5071 = true;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f5069 = false;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f5070 = false;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f5066 = false;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f5064 = false;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f5072 = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math"};
        f5063 = strArr;
        for (int i = 0; i < 63; i++) {
            String str = strArr[i];
            f5056.put(str, new C0800(str));
        }
        for (String str2 : f5060) {
            C0800 c0800 = new C0800(str2);
            c0800.f5065 = false;
            c0800.f5067 = false;
            f5056.put(str2, c0800);
        }
        for (String str3 : f5061) {
            C0800 c08002 = f5056.get(str3);
            C1687.m3701(c08002);
            c08002.f5071 = false;
            c08002.f5069 = true;
        }
        for (String str4 : f5062) {
            C0800 c08003 = f5056.get(str4);
            C1687.m3701(c08003);
            c08003.f5067 = false;
        }
        for (String str5 : f5059) {
            C0800 c08004 = f5056.get(str5);
            C1687.m3701(c08004);
            c08004.f5066 = true;
        }
        for (String str6 : f5057) {
            C0800 c08005 = f5056.get(str6);
            C1687.m3701(c08005);
            c08005.f5064 = true;
        }
        for (String str7 : f5058) {
            C0800 c08006 = f5056.get(str7);
            C1687.m3701(c08006);
            c08006.f5072 = true;
        }
    }

    public C0800(String str) {
        this.f5068 = str;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C0800 m2169(String str, C0830 c0830) {
        C1687.m3701(str);
        Map<String, C0800> map = f5056;
        C0800 c0800 = map.get(str);
        if (c0800 != null) {
            return c0800;
        }
        String m2216 = c0830.m2216(str);
        C1687.m3654(m2216);
        C0800 c08002 = map.get(m2216);
        if (c08002 != null) {
            return c08002;
        }
        C0800 c08003 = new C0800(m2216);
        c08003.f5065 = false;
        return c08003;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0800)) {
            return false;
        }
        C0800 c0800 = (C0800) obj;
        return this.f5068.equals(c0800.f5068) && this.f5071 == c0800.f5071 && this.f5069 == c0800.f5069 && this.f5067 == c0800.f5067 && this.f5065 == c0800.f5065 && this.f5066 == c0800.f5066 && this.f5070 == c0800.f5070 && this.f5064 == c0800.f5064 && this.f5072 == c0800.f5072;
    }

    public int hashCode() {
        return (((((((((((((((this.f5068.hashCode() * 31) + (this.f5065 ? 1 : 0)) * 31) + (this.f5067 ? 1 : 0)) * 31) + (this.f5071 ? 1 : 0)) * 31) + (this.f5069 ? 1 : 0)) * 31) + (this.f5070 ? 1 : 0)) * 31) + (this.f5066 ? 1 : 0)) * 31) + (this.f5064 ? 1 : 0)) * 31) + (this.f5072 ? 1 : 0);
    }

    public String toString() {
        return this.f5068;
    }
}
