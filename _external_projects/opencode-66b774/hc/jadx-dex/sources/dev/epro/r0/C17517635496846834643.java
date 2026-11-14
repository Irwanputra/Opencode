package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C17517635496846834643 {
    public static final dev.epro.r0.O12229768880637238015[] a;
    public static final java.util.Map b;

    static {
        dev.epro.r0.O12229768880637238015 o12229768880637238015 = new dev.epro.r0.O12229768880637238015(dev.epro.r0.O12229768880637238015.i, "");
        dev.epro.r0.P5124777957357031757 p5124777957357031757 = dev.epro.r0.O12229768880637238015.f;
        dev.epro.r0.O12229768880637238015 o122297688806372380152 = new dev.epro.r0.O12229768880637238015(p5124777957357031757, "GET");
        dev.epro.r0.O12229768880637238015 o122297688806372380153 = new dev.epro.r0.O12229768880637238015(p5124777957357031757, "POST");
        dev.epro.r0.P5124777957357031757 p51247779573570317572 = dev.epro.r0.O12229768880637238015.g;
        dev.epro.r0.O12229768880637238015 o122297688806372380154 = new dev.epro.r0.O12229768880637238015(p51247779573570317572, "/");
        dev.epro.r0.O12229768880637238015 o122297688806372380155 = new dev.epro.r0.O12229768880637238015(p51247779573570317572, "/index.html");
        dev.epro.r0.P5124777957357031757 p51247779573570317573 = dev.epro.r0.O12229768880637238015.h;
        dev.epro.r0.O12229768880637238015 o122297688806372380156 = new dev.epro.r0.O12229768880637238015(p51247779573570317573, "http");
        dev.epro.r0.O12229768880637238015 o122297688806372380157 = new dev.epro.r0.O12229768880637238015(p51247779573570317573, "https");
        dev.epro.r0.P5124777957357031757 p51247779573570317574 = dev.epro.r0.O12229768880637238015.e;
        dev.epro.r0.O12229768880637238015[] o12229768880637238015Arr = {o12229768880637238015, o122297688806372380152, o122297688806372380153, o122297688806372380154, o122297688806372380155, o122297688806372380156, o122297688806372380157, new dev.epro.r0.O12229768880637238015(p51247779573570317574, "200"), new dev.epro.r0.O12229768880637238015(p51247779573570317574, "204"), new dev.epro.r0.O12229768880637238015(p51247779573570317574, "206"), new dev.epro.r0.O12229768880637238015(p51247779573570317574, "304"), new dev.epro.r0.O12229768880637238015(p51247779573570317574, "400"), new dev.epro.r0.O12229768880637238015(p51247779573570317574, "404"), new dev.epro.r0.O12229768880637238015(p51247779573570317574, "500"), new dev.epro.r0.O12229768880637238015("accept-charset", ""), new dev.epro.r0.O12229768880637238015("accept-encoding", "gzip, deflate"), new dev.epro.r0.O12229768880637238015("accept-language", ""), new dev.epro.r0.O12229768880637238015("accept-ranges", ""), new dev.epro.r0.O12229768880637238015("accept", ""), new dev.epro.r0.O12229768880637238015("access-control-allow-origin", ""), new dev.epro.r0.O12229768880637238015("age", ""), new dev.epro.r0.O12229768880637238015("allow", ""), new dev.epro.r0.O12229768880637238015("authorization", ""), new dev.epro.r0.O12229768880637238015("cache-control", ""), new dev.epro.r0.O12229768880637238015("content-disposition", ""), new dev.epro.r0.O12229768880637238015("content-encoding", ""), new dev.epro.r0.O12229768880637238015("content-language", ""), new dev.epro.r0.O12229768880637238015("content-length", ""), new dev.epro.r0.O12229768880637238015("content-location", ""), new dev.epro.r0.O12229768880637238015("content-range", ""), new dev.epro.r0.O12229768880637238015("content-type", ""), new dev.epro.r0.O12229768880637238015("cookie", ""), new dev.epro.r0.O12229768880637238015("date", ""), new dev.epro.r0.O12229768880637238015("etag", ""), new dev.epro.r0.O12229768880637238015("expect", ""), new dev.epro.r0.O12229768880637238015("expires", ""), new dev.epro.r0.O12229768880637238015("from", ""), new dev.epro.r0.O12229768880637238015("host", ""), new dev.epro.r0.O12229768880637238015("if-match", ""), new dev.epro.r0.O12229768880637238015("if-modified-since", ""), new dev.epro.r0.O12229768880637238015("if-none-match", ""), new dev.epro.r0.O12229768880637238015("if-range", ""), new dev.epro.r0.O12229768880637238015("if-unmodified-since", ""), new dev.epro.r0.O12229768880637238015("last-modified", ""), new dev.epro.r0.O12229768880637238015("link", ""), new dev.epro.r0.O12229768880637238015("location", ""), new dev.epro.r0.O12229768880637238015("max-forwards", ""), new dev.epro.r0.O12229768880637238015("proxy-authenticate", ""), new dev.epro.r0.O12229768880637238015("proxy-authorization", ""), new dev.epro.r0.O12229768880637238015("range", ""), new dev.epro.r0.O12229768880637238015("referer", ""), new dev.epro.r0.O12229768880637238015("refresh", ""), new dev.epro.r0.O12229768880637238015("retry-after", ""), new dev.epro.r0.O12229768880637238015("server", ""), new dev.epro.r0.O12229768880637238015("set-cookie", ""), new dev.epro.r0.O12229768880637238015("strict-transport-security", ""), new dev.epro.r0.O12229768880637238015("transfer-encoding", ""), new dev.epro.r0.O12229768880637238015("user-agent", ""), new dev.epro.r0.O12229768880637238015("vary", ""), new dev.epro.r0.O12229768880637238015("via", ""), new dev.epro.r0.O12229768880637238015("www-authenticate", "")};
        a = o12229768880637238015Arr;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(o12229768880637238015Arr[i].a)) {
                linkedHashMap.put(o12229768880637238015Arr[i].a, java.lang.Integer.valueOf(i));
            }
        }
        java.util.Map mapUnmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(dev.epro.r0.P5124777957357031757 p5124777957357031757) {
        p5124777957357031757.getClass();
        int iB = p5124777957357031757.b();
        for (int i = 0; i < iB; i++) {
            byte bE = p5124777957357031757.e(i);
            if (65 <= bE && bE < 91) {
                dev.epro.r0.Q11088980322693754445.h("PROTOCOL_ERROR response malformed: mixed case name: ".concat(p5124777957357031757.l()));
                return;
            }
        }
    }
}
