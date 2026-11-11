package dev.epro.v2ray.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import dev.epro.v2ray.bean.dns.DnsBean;
import dev.epro.v2ray.bean.dns.ServersBean;
import dev.epro.v2ray.bean.inbounds.InSettingsBean;
import dev.epro.v2ray.bean.inbounds.InboundBean;
import dev.epro.v2ray.bean.outbounds.OutboundBean;
import dev.epro.v2ray.bean.outbounds.settings.vnext.UsersBean;
import dev.epro.v2ray.bean.outbounds.settings.vnext.VnextBean;
import dev.epro.v2ray.bean.routing.RulesBean;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p131.p161.p211.C2541;
import p131.p161.p211.C2654;
import p131.p161.p211.C2673;

/* loaded from: /tmp/opencode/hc_real.dex */
public class V2rayConfigUtil {
    public static volatile String DNS_AGENT = "1.1.1.1";
    public static final String DNS_DIRECT = "223.5.5.5";
    public static volatile String PREF_CURR_CONFIG_DOMAIN = "";
    public static volatile boolean PREF_LOCAL_DNS_ENABLED = false;
    public static final String SOCKS_PROTOCOL = "socks://";
    public static final String SS_PROTOCOL = "ss://";
    public static final String TAG_AGENT = "proxy";
    public static final String TAG_BLOCKED = "block";
    public static final String TAG_DIRECT = "direct";
    public static volatile String TYPE_PROTOCOL = null;
    public static final String VMESS_PROTOCOL = "vmess://";
    public static volatile LinkedHashSet<String> PREF_CURR_CONFIG_OUTBOUND_TAGS = new LinkedHashSet<>();
    public static boolean isProxySharing = false;
    public static boolean isSniffingEnable = true;
    private static String jsonStr = "{\"version\":\"1.1\",\"method\":\"GET\",\"path\":[\"/\"],\"headers\":{\"User-Agent\":[\"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.75 Safari/537.36\",\"Mozilla/5.0 (iPhone; CPU iPhone OS 10_0_2 like Mac OS X) AppleWebKit/601.1 (KHTML, like Gecko) CriOS/53.0.2785.109 Mobile/14A456 Safari/601.1.46\"],\"Accept-Encoding\":[\"gzip, deflate\"],\"Connection\":[\"keep-alive\"],\"Pragma\":\"no-cache\"}}";
    private static C2541 requestObj = (C2541) new C2673().m4644(jsonStr, C2541.class);

    /* renamed from: dev.epro.v2ray.util.V2rayConfigUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$dev$epro$v2ray$util$EConfigType;

        static {
            EConfigType.values();
            int[] iArr = new int[4];
            $SwitchMap$dev$epro$v2ray$util$EConfigType = iArr;
            try {
                EConfigType eConfigType = EConfigType.VMESS;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$dev$epro$v2ray$util$EConfigType;
                EConfigType eConfigType2 = EConfigType.SHADOWSOCKS;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$dev$epro$v2ray$util$EConfigType;
                EConfigType eConfigType3 = EConfigType.SOCKS;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static VmessBean ResolveVmess4Kitsunebi(String str) {
        VmessBean vmessBean = new VmessBean();
        String replace = str.replace(VMESS_PROTOCOL, "");
        int indexOf = replace.indexOf("?");
        if (indexOf > 0) {
            replace = replace.substring(0, indexOf);
        }
        String[] split = Utils.decode(replace).split("@");
        if (split.length != 2) {
            return vmessBean;
        }
        String[] split2 = split[0].split(":");
        String[] split3 = split[1].split(":");
        if (split2.length == 2 && split3.length == 2) {
            vmessBean.address = split3[0];
            vmessBean.port = Utils.parseInt(split3[1]);
            vmessBean.security = split2[0];
            vmessBean.id = split2[1];
            vmessBean.security = "chacha20-poly1305";
            vmessBean.network = "tcp";
            vmessBean.headerType = "none";
            vmessBean.remarks = "Alien";
            vmessBean.alterId = 0;
        }
        return vmessBean;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (r1 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (r1 == 2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 == 3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (r10.getHeaderType().equals("http") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        r1 = new dev.epro.v2ray.bean.outbounds.stream.tcp.TcpSettingsBean();
        r1.setHeader(new dev.epro.v2ray.bean.outbounds.stream.tcp.HeaderBean());
        r1.getHeader().setType(r10.getHeaderType());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (android.text.TextUtils.isEmpty(r10.getRequestHost()) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        r2 = new java.util.ArrayList();
        r2.addAll(java.util.Arrays.asList(r10.getRequestHost().split(",")));
        dev.epro.v2ray.util.V2rayConfigUtil.requestObj.m4588("headers").m4587("Host", (p131.p161.p211.AbstractC2532) new p131.p161.p211.C2673().m4644(r2.toString(), p131.p161.p211.C2670.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d7, code lost:
    
        if (android.text.TextUtils.isEmpty(r10.getPath()) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d9, code lost:
    
        r2 = new java.util.ArrayList();
        r2.addAll(java.util.Arrays.asList(r10.getRequestHost().split(",")));
        dev.epro.v2ray.util.V2rayConfigUtil.requestObj.m4587("path", (p131.p161.p211.AbstractC2532) new p131.p161.p211.C2673().m4644(r2.toString(), p131.p161.p211.C2670.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0105, code lost:
    
        r1.getHeader().setRequest(dev.epro.v2ray.util.V2rayConfigUtil.requestObj);
        r9.setTcpSettings(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0113, code lost:
    
        r0 = new dev.epro.v2ray.bean.outbounds.stream.quic.QuicSettingBean();
        r1 = r10.getRequestHost().trim();
        r2 = r10.getPath().trim();
        r0.setSecurity(r1);
        r0.setKey(r2);
        r0.setHeader(new dev.epro.v2ray.bean.outbounds.stream.quic.HeaderBean());
        r0.getHeader().setType(r10.getHeaderType());
        r9.setQuicSettings(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0146, code lost:
    
        r1 = new dev.epro.v2ray.bean.outbounds.stream.HttpSettingsBean();
        r2 = r10.getRequestHost().trim();
        r10 = r10.getPath().trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x015f, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0161, code lost:
    
        r1.setHost(java.util.Arrays.asList(r2.split(",")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x016c, code lost:
    
        r1.setPath(r10);
        r9.setHttpSettings(r1);
        r10 = new dev.epro.v2ray.bean.outbounds.stream.TlsSettingsBean();
        r10.setAllowInsecure(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x017a, code lost:
    
        r9.setTlsSettings(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x017f, code lost:
    
        r0 = new dev.epro.v2ray.bean.outbounds.stream.ws.WsSettingsBean();
        r1 = r10.getRequestHost().trim();
        r10 = r10.getPath().trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0198, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x019a, code lost:
    
        r0.setHeaders(new dev.epro.v2ray.bean.outbounds.stream.ws.HeadersBean());
        r0.getHeaders().setHost(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ad, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01af, code lost:
    
        r0.setPath(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b2, code lost:
    
        r9.setWsSettings(r0);
        r10 = new dev.epro.v2ray.bean.outbounds.stream.TlsSettingsBean();
        r10.setAllowInsecure(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c1, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c3, code lost:
    
        r10.setServerName(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static dev.epro.v2ray.bean.outbounds.stream.StreamSettingsBean boundStreamSettings(dev.epro.v2ray.util.VmessBean r10) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.v2ray.util.V2rayConfigUtil.boundStreamSettings(dev.epro.v2ray.util.VmessBean):dev.epro.v2ray.bean.outbounds.stream.StreamSettingsBean");
    }

    private static boolean customLocalDns(V2rayConfig v2rayConfig) {
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList<String> remoteDnsServers = Utils.getRemoteDnsServers(DNS_AGENT);
            Iterator<String> it = remoteDnsServers.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            ArrayList<String> domesticDnsServers = Utils.getDomesticDnsServers(DNS_DIRECT);
            ArrayList<String> userRule2Domian = userRule2Domian("");
            if (userRule2Domian.size() > 0) {
                arrayList.add(new ServersBean(remoteDnsServers.get(0), 53, userRule2Domian));
            }
            ArrayList<String> userRule2Domian2 = userRule2Domian("");
            if (userRule2Domian2.size() > 0) {
                arrayList.add(new ServersBean(domesticDnsServers.get(0), 53, userRule2Domian2));
            }
            ArrayList<String> userRule2Domian3 = userRule2Domian("");
            if (userRule2Domian3.size() > 0) {
                Iterator<String> it2 = userRule2Domian3.iterator();
                while (it2.hasNext()) {
                    hashMap.put(it2.next(), "127.0.0.1");
                }
            }
            hashMap.put("domain:googleapis.cn", "googleapis.com");
            v2rayConfig.setDns(new DnsBean(arrayList, hashMap));
            Iterator<InboundBean> it3 = v2rayConfig.getInbounds().iterator();
            boolean z = false;
            while (it3.hasNext()) {
                InboundBean next = it3.next();
                if (next.getProtocol().equals("dokodemo-door") && next.getTag().equals("dns-in")) {
                    z = true;
                }
            }
            if (!z) {
                InSettingsBean inSettingsBean = new InSettingsBean();
                inSettingsBean.setAddress(remoteDnsServers.get(0));
                inSettingsBean.setPort(53);
                inSettingsBean.setNetwork("tcp,udp");
                InboundBean inboundBean = new InboundBean();
                inboundBean.setTag("dns-in");
                inboundBean.setPort(10807);
                inboundBean.setListen("127.0.0.1");
                inboundBean.setProtocol("dokodemo-door");
                inboundBean.setSettings(inSettingsBean);
                inboundBean.setSniffing(null);
                v2rayConfig.getInbounds().add(inboundBean);
            }
            Iterator<OutboundBean> it4 = v2rayConfig.getOutbounds().iterator();
            boolean z2 = false;
            while (it4.hasNext()) {
                OutboundBean next2 = it4.next();
                if (next2.getProtocol().equals("dns") && next2.getTag().equals("dns-out")) {
                    z2 = true;
                }
            }
            if (!z2) {
                OutboundBean outboundBean = new OutboundBean();
                outboundBean.setProtocol("dns");
                outboundBean.setTag("dns-out");
                outboundBean.setSettings(null);
                outboundBean.setStreamSettings(null);
                outboundBean.setMux(null);
                v2rayConfig.getOutbounds().add(outboundBean);
            }
            RulesBean rulesBean = new RulesBean();
            rulesBean.setType("field");
            rulesBean.setOutboundTag(TAG_DIRECT);
            rulesBean.setPort("53");
            rulesBean.setIp(domesticDnsServers);
            rulesBean.setDomain(null);
            v2rayConfig.getRouting().getRules().add(rulesBean);
            RulesBean rulesBean2 = new RulesBean();
            rulesBean2.setType("field");
            rulesBean2.setOutboundTag(TAG_AGENT);
            rulesBean2.setPort("53");
            rulesBean2.setIp(remoteDnsServers);
            rulesBean2.setDomain(null);
            v2rayConfig.getRouting().getRules().add(rulesBean2);
            RulesBean rulesBean3 = new RulesBean();
            rulesBean3.setType("field");
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add("dns-in");
            rulesBean3.setInboundTag(arrayList2);
            rulesBean3.setOutboundTag("dns-out");
            rulesBean3.setDomain(null);
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean customRemoteDns(V2rayConfig v2rayConfig) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = Utils.getRemoteDnsServers(DNS_AGENT).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            DnsBean dnsBean = new DnsBean();
            dnsBean.setServers(arrayList);
            v2rayConfig.setDns(dnsBean);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Result getV2rayConfig(Context context, VmessBean vmessBean, String str) {
        new Result(Boolean.FALSE, "");
        return vmessBean.getConfigType() == EConfigType.CUSTOM.value ? getV2rayConfigType2(str) : getV2rayConfigType1(context, vmessBean);
    }

    private static Result getV2rayConfigType1(Context context, VmessBean vmessBean) {
        String readTextFromAssets;
        V2rayConfig v2rayConfig;
        Result result = new Result(Boolean.FALSE, "");
        try {
            readTextFromAssets = readTextFromAssets(context, "v2ray_config.json");
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(readTextFromAssets) || (v2rayConfig = (V2rayConfig) new C2673().m4644(readTextFromAssets, V2rayConfig.class)) == null) {
            return result;
        }
        inbounds(v2rayConfig);
        outbounds(vmessBean, v2rayConfig);
        routing(v2rayConfig);
        if (PREF_LOCAL_DNS_ENABLED) {
            customLocalDns(v2rayConfig);
        } else {
            customRemoteDns(v2rayConfig);
        }
        C2654 c2654 = new C2654();
        c2654.f10109 = true;
        String m4645 = c2654.m4634().m4645(v2rayConfig);
        result.setStatus(Boolean.TRUE);
        result.setContent(m4645);
        return result;
    }

    private static Result getV2rayConfigType2(String str) {
        Result result = new Result(Boolean.FALSE, "");
        try {
            result.setStatus(Boolean.TRUE);
            result.setContent(str);
            parseDomainNameAndTag(str);
        } catch (Exception unused) {
        }
        return result;
    }

    public static VmessBean importConfig(String str, String str2) {
        int parseInt;
        String decode;
        VmessBean vmessBean = new VmessBean();
        if (str == null) {
            return vmessBean;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return vmessBean;
            }
            if (str.startsWith(VMESS_PROTOCOL)) {
                TYPE_PROTOCOL = VMESS_PROTOCOL;
                int indexOf = str.indexOf("?");
                VmessBean tryParseNewVmess = tryParseNewVmess(str);
                if (tryParseNewVmess != null) {
                    try {
                        tryParseNewVmess.setSubid(str2);
                        vmessBean = tryParseNewVmess;
                    } catch (Exception unused) {
                        return tryParseNewVmess;
                    }
                } else {
                    if (indexOf <= 0) {
                        String decode2 = Utils.decode(str.replace(VMESS_PROTOCOL, ""));
                        if (TextUtils.isEmpty(decode2)) {
                            return vmessBean;
                        }
                        VmessQRCode vmessQRCode = (VmessQRCode) new C2673().m4644(decode2, VmessQRCode.class);
                        if (!TextUtils.isEmpty(vmessQRCode.getAdd()) && !TextUtils.isEmpty(vmessQRCode.getPort()) && !TextUtils.isEmpty(vmessQRCode.getId()) && !TextUtils.isEmpty(vmessQRCode.getAid()) && !TextUtils.isEmpty(vmessQRCode.getNet())) {
                            vmessBean.setConfigType(EConfigType.VMESS.value);
                            vmessBean.setSecurity("auto");
                            vmessBean.setNetwork("tcp");
                            vmessBean.setHeaderType("none");
                            vmessBean.setConfigVersion(Utils.parseInt(vmessQRCode.getV()));
                            vmessBean.setRemarks(vmessQRCode.getPs());
                            vmessBean.setAddress(vmessQRCode.getAdd());
                            vmessBean.setPort(Integer.parseInt(vmessQRCode.getPort()));
                            vmessBean.setId(vmessQRCode.getId());
                            vmessBean.setAlterId(Integer.parseInt(vmessQRCode.getAid()));
                            vmessBean.setNetwork(vmessQRCode.getNet());
                            vmessBean.setHeaderType(vmessQRCode.getType());
                            vmessBean.setRequestHost(vmessQRCode.getHost());
                            vmessBean.setPath(vmessQRCode.getPath());
                            vmessBean.setStreamSecurity(vmessQRCode.getTls());
                            vmessBean.setSubid(str2);
                        }
                        return vmessBean;
                    }
                    vmessBean = ResolveVmess4Kitsunebi(str);
                }
                upgradeConfigVersion(vmessBean);
                return vmessBean;
            }
            if (str.startsWith(SS_PROTOCOL)) {
                TYPE_PROTOCOL = SS_PROTOCOL;
                String replace = str.replace(SS_PROTOCOL, "");
                int indexOf2 = replace.indexOf("#");
                if (indexOf2 > 0) {
                    try {
                        vmessBean.remarks = Utils.urlDecode(replace.substring(indexOf2 + 1, replace.length()));
                    } catch (Exception unused2) {
                    }
                    replace = replace.substring(0, indexOf2);
                }
                int indexOf3 = replace.indexOf("@");
                if (indexOf3 > 0) {
                    decode = Utils.decode(replace.substring(0, indexOf3)) + replace.substring(indexOf3, replace.length());
                } else {
                    decode = Utils.decode(replace);
                }
                Matcher matcher = Pattern.compile("^(.+?):(.*)@(.+?):(\\d+?)/?$").matcher(decode);
                if (matcher == null) {
                    return vmessBean;
                }
                vmessBean.security = matcher.group(1).toLowerCase();
                vmessBean.id = matcher.group(2);
                String group = matcher.group(3);
                vmessBean.address = group;
                if (group != null && group.startsWith("[") && vmessBean.address.endsWith("]")) {
                    String str3 = vmessBean.address;
                    vmessBean.address = str3.substring(1, str3.length() - 1);
                }
                parseInt = Integer.parseInt(matcher.group(4));
            } else {
                if (!str.startsWith(SOCKS_PROTOCOL)) {
                    return null;
                }
                TYPE_PROTOCOL = SOCKS_PROTOCOL;
                String replace2 = str.replace(SOCKS_PROTOCOL, "");
                int indexOf4 = replace2.indexOf("#");
                if (indexOf4 > 0) {
                    try {
                        vmessBean.remarks = Utils.urlDecode(replace2.substring(indexOf4 + 1, replace2.length()));
                    } catch (Exception unused3) {
                    }
                    replace2 = replace2.substring(0, indexOf4);
                }
                if (replace2.indexOf(":") < 0) {
                    replace2 = Utils.decode(replace2);
                }
                Matcher matcher2 = Pattern.compile("^(.+?):(\\d+?)$").matcher(replace2);
                if (matcher2 == null) {
                    return vmessBean;
                }
                String group2 = matcher2.group(1);
                vmessBean.address = group2;
                if (group2 != null && group2.startsWith("[") && vmessBean.address.endsWith("]")) {
                    String str4 = vmessBean.address;
                    vmessBean.address = str4.substring(1, str4.length() - 1);
                }
                parseInt = Integer.parseInt(matcher2.group(2));
            }
            vmessBean.port = parseInt;
            vmessBean.subid = str2;
            return vmessBean;
        } catch (Exception unused4) {
            return vmessBean;
        }
    }

    private static boolean inbounds(V2rayConfig v2rayConfig) {
        try {
            for (InboundBean inboundBean : v2rayConfig.getInbounds()) {
                if (!isProxySharing) {
                    inboundBean.setListen("127.0.0.1");
                }
            }
            v2rayConfig.getInbounds().get(0).setPort(1080);
            if (v2rayConfig.getInbounds().get(0).getSniffing() == null) {
                return true;
            }
            v2rayConfig.getInbounds().get(0).getSniffing().setEnabled(isSniffingEnable);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isValidConfig(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("outbounds")) {
                if (!jSONObject.has("outbound")) {
                    return false;
                }
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    private static boolean outbounds(VmessBean vmessBean, V2rayConfig v2rayConfig) {
        VnextBean vnextBean;
        UsersBean usersBean;
        try {
            OutboundBean outboundBean = v2rayConfig.getOutbounds().get(0);
            EConfigType fromInt = EConfigType.fromInt(vmessBean.getConfigType());
            if (fromInt != null) {
                outboundBean.setProtocol(fromInt.name().toLowerCase());
            }
            if (fromInt.ordinal() == 0) {
                if (outboundBean.getSettings() != null) {
                    outboundBean.getSettings().setServers(null);
                }
                if (v2rayConfig.getOutbounds().get(0).getSettings() != null && v2rayConfig.getOutbounds().get(0).getSettings().getVnext() != null && (vnextBean = v2rayConfig.getOutbounds().get(0).getSettings().getVnext().get(0)) != null) {
                    vnextBean.setAddress(vmessBean.getAddress());
                    vnextBean.setPort(vmessBean.getPort());
                    if (vnextBean.getUsers() != null && (usersBean = vnextBean.getUsers().get(0)) != null) {
                        usersBean.setId(vmessBean.getId());
                        usersBean.setAlterId(vmessBean.getAlterId());
                        usersBean.setSecurity(vmessBean.getSecurity());
                        usersBean.setLevel(8);
                    }
                }
                if (outboundBean.getMux() != null) {
                    outboundBean.getMux().setEnabled(false);
                }
                outboundBean.setStreamSettings(boundStreamSettings(vmessBean));
            }
            PREF_CURR_CONFIG_DOMAIN = Utils.isIpv6Address(vmessBean.getAddress()) ? String.format("[%s]:%s", vmessBean.getAddress(), Integer.valueOf(vmessBean.getPort())) : String.format("%s:%s", vmessBean.getAddress(), Integer.valueOf(vmessBean.getPort()));
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
            Iterator<OutboundBean> it = v2rayConfig.getOutbounds().iterator();
            while (it.hasNext()) {
                OutboundBean next = it.next();
                if (!TextUtils.isEmpty(next.getTag())) {
                    linkedHashSet.add(next.getTag());
                }
            }
            PREF_CURR_CONFIG_OUTBOUND_TAGS = linkedHashSet;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static Pair<String, String> parseDomainNameAndTag(JSONObject jSONObject) {
        String str;
        JSONArray optJSONArray;
        try {
            str = jSONObject.has("tag") ? jSONObject.getString("tag") : "";
            try {
                if (jSONObject.has("settings")) {
                    if (jSONObject.optJSONObject("settings").has("vnext")) {
                        optJSONArray = jSONObject.optJSONObject("settings").optJSONArray("vnext");
                    } else {
                        if (!jSONObject.optJSONObject("settings").has("servers")) {
                            return new Pair<>("", str);
                        }
                        optJSONArray = jSONObject.optJSONObject("settings").optJSONArray("servers");
                    }
                    if (optJSONArray.length() > 0) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(0);
                        String string = jSONObject2.getString("address");
                        String string2 = jSONObject2.getString("port");
                        return Utils.isIpv6Address(string) ? new Pair<>(String.format("[%s]:%s", string, string2), str) : new Pair<>(String.format("%s:%s", string, string2), str);
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        return new Pair<>("", str);
    }

    private static void parseDomainNameAndTag(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String str2 = "";
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
            if (jSONObject.has("outbound")) {
                str2 = (String) parseDomainNameAndTag(jSONObject.optJSONObject("outbound")).first;
                String str3 = (String) parseDomainNameAndTag(jSONObject.optJSONObject("outbound")).second;
                if (!TextUtils.isEmpty(str3)) {
                    linkedHashSet.add(str3);
                }
            }
            if (jSONObject.has("outbounds")) {
                for (int i = 0; i < jSONObject.optJSONArray("outbounds").length(); i++) {
                    String str4 = (String) parseDomainNameAndTag(jSONObject.optJSONArray("outbounds").getJSONObject(i)).first;
                    String str5 = (String) parseDomainNameAndTag(jSONObject.optJSONArray("outbounds").getJSONObject(i)).second;
                    if (!TextUtils.isEmpty(str4) && TextUtils.isEmpty(str2)) {
                        str2 = str4;
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        linkedHashSet.add(str5);
                    }
                }
            }
            if (jSONObject.has("outboundDetour")) {
                for (int i2 = 0; i2 < jSONObject.optJSONArray("outboundDetour").length(); i2++) {
                    String str6 = (String) parseDomainNameAndTag(jSONObject.optJSONArray("outboundDetour").getJSONObject(i2)).first;
                    String str7 = (String) parseDomainNameAndTag(jSONObject.optJSONArray("outboundDetour").getJSONObject(i2)).second;
                    if (!TextUtils.isEmpty(str6) && TextUtils.isEmpty(str2)) {
                        str2 = str6;
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        linkedHashSet.add(str7);
                    }
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                PREF_CURR_CONFIG_DOMAIN = str2;
            }
            PREF_CURR_CONFIG_OUTBOUND_TAGS = linkedHashSet;
        } catch (Exception unused) {
        }
    }

    public static void parseTypeProtocol(String str) {
        TYPE_PROTOCOL = ((V2rayConfig) new C2673().m4644(str, V2rayConfig.class)).getOutbounds().get(0).getProtocol() + "://";
    }

    private static String readTextFromAssets(Context context, String str) {
        try {
            InputStream open = context.getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return new String(bArr);
        } catch (IOException unused) {
            return "";
        }
    }

    private static boolean routing(V2rayConfig v2rayConfig) {
        try {
            routingUserRule("", TAG_AGENT, v2rayConfig);
            routingUserRule("", TAG_DIRECT, v2rayConfig);
            routingUserRule("", TAG_BLOCKED, v2rayConfig);
            v2rayConfig.getRouting().setDomainStrategy("IPIfNonMatch");
            ArrayList arrayList = new ArrayList();
            arrayList.add("domain:googleapis.cn");
            new RulesBean("field", arrayList, TAG_AGENT);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void routingGeo(String str, String str2, String str3, V2rayConfig v2rayConfig) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (str.equals("ip") || str.equals("")) {
                RulesBean rulesBean = new RulesBean();
                rulesBean.setType("field");
                rulesBean.setOutboundTag(str3);
                rulesBean.setIp(new ArrayList<>());
                if (rulesBean.getIp() != null) {
                    rulesBean.getIp().add("geoip:" + str2);
                }
                v2rayConfig.getRouting().getRules().add(rulesBean);
            }
            if (str.equals("domain") || str.equals("")) {
                RulesBean rulesBean2 = new RulesBean();
                rulesBean2.setType("field");
                rulesBean2.setOutboundTag(str3);
                rulesBean2.setDomain(new ArrayList<>());
                if (rulesBean2.getDomain() != null) {
                    rulesBean2.getDomain().add("geosite:" + str2);
                }
                v2rayConfig.getRouting().getRules().add(rulesBean2);
            }
        } catch (Exception unused) {
        }
    }

    private static void routingUserRule(String str, String str2, V2rayConfig v2rayConfig) {
        ArrayList<String> ip;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            RulesBean rulesBean = new RulesBean();
            rulesBean.setType("field");
            rulesBean.setOutboundTag(str2);
            rulesBean.setDomain(new ArrayList<>());
            RulesBean rulesBean2 = new RulesBean();
            rulesBean2.setType("field");
            rulesBean2.setOutboundTag(str2);
            rulesBean2.setIp(new ArrayList<>());
            for (String str3 : str.trim().replace("\n", "").split(",")) {
                if (!Utils.isIpAddress(str3) && !str3.startsWith("geoip:")) {
                    if (str3.trim().isEmpty() && rulesBean.getDomain() != null) {
                        ip = rulesBean.getDomain();
                        ip.add(str3);
                    }
                }
                if (rulesBean2.getIp() != null) {
                    ip = rulesBean2.getIp();
                    ip.add(str3);
                }
            }
            if (rulesBean.getDomain() != null && rulesBean.getDomain().size() > 0) {
                v2rayConfig.getRouting().getRules().add(rulesBean);
            }
            if (rulesBean2.getIp() == null || rulesBean2.getIp().size() <= 0) {
                return;
            }
            v2rayConfig.getRouting().getRules().add(rulesBean2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static VmessBean tryParseNewVmess(String str) {
        String str2;
        String str3;
        Object obj;
        String str4;
        try {
            URI uri = new URI(str);
            if (uri.getScheme().equals("vmess")) {
                Matcher matcher = Pattern.compile("(tcp|http|ws|kcp|quic)(\\+tls)?:([0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12})-([0-9]+)").matcher(uri.getUserInfo());
                if (matcher.find()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    String group3 = matcher.group(3);
                    String group4 = matcher.group(4);
                    char c = 0;
                    boolean z = (group2 == null || group2.isEmpty()) ? false : true;
                    HashMap hashMap = new HashMap();
                    String[] split = uri.getRawQuery().split("&");
                    int length = split.length;
                    int i = 0;
                    while (i < length) {
                        String[] split2 = split[i].split("=");
                        hashMap.put(split2[c], URLDecoder.decode(split2[1], "utf-8"));
                        i++;
                        c = 0;
                    }
                    VmessBean vmessBean = new VmessBean();
                    try {
                        vmessBean.setAddress(uri.getHost());
                        vmessBean.setPort(uri.getPort());
                        vmessBean.setId(group3);
                        if (group4 != null) {
                            vmessBean.setAlterId(Integer.parseInt(group4));
                        }
                        vmessBean.setStreamSecurity(z ? "tls" : "");
                        vmessBean.setRemarks(uri.getFragment());
                        vmessBean.setSecurity("auto");
                        if (group == null) {
                            return vmessBean;
                        }
                        char c2 = 65535;
                        switch (group.hashCode()) {
                            case 3804:
                                if (group.equals("ws")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 106008:
                                if (group.equals("kcp")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 114657:
                                if (group.equals("tcp")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 3213448:
                                if (group.equals("http")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 3482174:
                                if (group.equals("quic")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                        }
                        String str5 = "none";
                        if (c2 == 0) {
                            str2 = "";
                            vmessBean.setNetwork("tcp");
                            if (hashMap.get("type") != null) {
                                str5 = (String) hashMap.get("type");
                            }
                            vmessBean.setHeaderType(str5);
                            if (hashMap.get("host") == null) {
                                str3 = str2;
                                vmessBean.setRequestHost(str3);
                                return vmessBean;
                            }
                            str3 = (String) hashMap.get("host");
                            vmessBean.setRequestHost(str3);
                            return vmessBean;
                        }
                        str2 = "";
                        if (c2 == 1) {
                            vmessBean.setNetwork("h2");
                            vmessBean.setHeaderType((hashMap.get("path") == null || ((String) hashMap.get("path")).trim().equals("/")) ? str2 : (String) hashMap.get("path"));
                            if (hashMap.get("host") == null) {
                                str3 = str2;
                                vmessBean.setRequestHost(str3);
                                return vmessBean;
                            }
                            str3 = ((String) hashMap.get("host")).split("\\|")[0];
                            vmessBean.setRequestHost(str3);
                            return vmessBean;
                        }
                        if (c2 == 2) {
                            vmessBean.setNetwork("ws");
                            vmessBean.setHeaderType((hashMap.get("path") == null || ((String) hashMap.get("path")).trim().equals("/")) ? str2 : (String) hashMap.get("path"));
                            if (hashMap.get("host") != null) {
                                str3 = ((String) hashMap.get("host")).split("\\|")[0];
                                vmessBean.setRequestHost(str3);
                                return vmessBean;
                            }
                            str3 = str2;
                            vmessBean.setRequestHost(str3);
                            return vmessBean;
                        }
                        if (c2 == 3) {
                            vmessBean.setNetwork("kcp");
                            if (hashMap.get("type") != null) {
                                str5 = (String) hashMap.get("type");
                            }
                            vmessBean.setHeaderType(str5);
                            if (hashMap.get("seed") == null) {
                                str4 = str2;
                            } else {
                                obj = hashMap.get("seed");
                                str4 = (String) obj;
                            }
                        } else {
                            if (c2 != 4) {
                                return vmessBean;
                            }
                            vmessBean.setNetwork("quic");
                            vmessBean.setRequestHost(hashMap.get("security") == null ? "none" : (String) hashMap.get("security"));
                            if (hashMap.get("type") != null) {
                                str5 = (String) hashMap.get("type");
                            }
                            vmessBean.setHeaderType(str5);
                            if (hashMap.get("key") != null) {
                                obj = hashMap.get("key");
                                str4 = (String) obj;
                            }
                            str4 = str2;
                        }
                        vmessBean.setPath(str4);
                        return vmessBean;
                    } catch (Exception unused) {
                        return vmessBean;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[Catch: Exception -> 0x0074, TRY_ENTER, TryCatch #0 {Exception -> 0x0074, blocks: (B:3:0x0001, B:7:0x000a, B:18:0x0071, B:21:0x0045, B:24:0x0054, B:25:0x005c, B:27:0x005f, B:28:0x006b, B:30:0x0021, B:33:0x002b, B:36:0x0035), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:3:0x0001, B:7:0x000a, B:18:0x0071, B:21:0x0045, B:24:0x0054, B:25:0x005c, B:27:0x005f, B:28:0x006b, B:30:0x0021, B:33:0x002b, B:36:0x0035), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int upgradeConfigVersion(dev.epro.v2ray.util.VmessBean r8) {
        /*
            r0 = -1
            int r1 = r8.getConfigVersion()     // Catch: java.lang.Exception -> L74
            r2 = 0
            r3 = 2
            if (r1 != r3) goto La
            return r2
        La:
            java.lang.String r1 = r8.getNetwork()     // Catch: java.lang.Exception -> L74
            int r4 = r1.hashCode()     // Catch: java.lang.Exception -> L74
            r5 = 3274(0xcca, float:4.588E-42)
            r6 = 1
            if (r4 == r5) goto L35
            r5 = 3804(0xedc, float:5.33E-42)
            if (r4 == r5) goto L2b
            r5 = 106008(0x19e18, float:1.48549E-40)
            if (r4 == r5) goto L21
            goto L3f
        L21:
            java.lang.String r4 = "kcp"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> L74
            if (r1 == 0) goto L3f
            r1 = 0
            goto L40
        L2b:
            java.lang.String r4 = "ws"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> L74
            if (r1 == 0) goto L3f
            r1 = 1
            goto L40
        L35:
            java.lang.String r4 = "h2"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> L74
            if (r1 == 0) goto L3f
            r1 = 2
            goto L40
        L3f:
            r1 = -1
        L40:
            if (r1 == r6) goto L45
            if (r1 == r3) goto L45
            goto L71
        L45:
            java.lang.String r1 = r8.getRequestHost()     // Catch: java.lang.Exception -> L74
            java.lang.String r4 = ";"
            java.lang.String[] r1 = r1.split(r4)     // Catch: java.lang.Exception -> L74
            int r4 = r1.length     // Catch: java.lang.Exception -> L74
            java.lang.String r5 = ""
            if (r4 <= 0) goto L5b
            r4 = r1[r2]     // Catch: java.lang.Exception -> L74
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Exception -> L74
            goto L5c
        L5b:
            r4 = r5
        L5c:
            int r7 = r1.length     // Catch: java.lang.Exception -> L74
            if (r7 <= r6) goto L6b
            r2 = r1[r2]     // Catch: java.lang.Exception -> L74
            java.lang.String r4 = r2.trim()     // Catch: java.lang.Exception -> L74
            r1 = r1[r6]     // Catch: java.lang.Exception -> L74
            java.lang.String r5 = r1.trim()     // Catch: java.lang.Exception -> L74
        L6b:
            r8.setPath(r4)     // Catch: java.lang.Exception -> L74
            r8.setRequestHost(r5)     // Catch: java.lang.Exception -> L74
        L71:
            r8.setConfigVersion(r3)     // Catch: java.lang.Exception -> L74
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.v2ray.util.V2rayConfigUtil.upgradeConfigVersion(dev.epro.v2ray.util.VmessBean):int");
    }

    private static ArrayList<String> userRule2Domian(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : str.trim().replace("\n", "").split(",")) {
            if ((str2.startsWith("geosite:") || str2.startsWith("domain:")) && !str2.trim().isEmpty()) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
