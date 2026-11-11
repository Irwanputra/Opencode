package p010.p011.p012.p013;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import de.blinkt.openvpn.core.ConnectionStatus;
import de.blinkt.openvpn.core.LogItem;
import de.blinkt.openvpn.core.NativeUtils;
import de.blinkt.openvpn.core.TrafficHistory;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;
import p010.p011.p012.p013.InterfaceC0737;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ざっざへづ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0753 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static Intent f4868 = null;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static int f4870 = 2131821313;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static String f4876 = "";

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static String f4878 = "NOPROCESS";

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static String f4882;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final Object f4871 = new Object();

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final byte[] f4877 = {-58, -42, -44, -106, 90, -88, -87, -88, -52, -124, 84, 117, 66, 79, -112, -111, -46, 86, -37, 109};

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static final byte[] f4879 = {-99, -69, 45, 71, 114, -116, 82, 66, -99, -122, 50, -70, -56, -111, 98, -35, -65, 105, 82, 43};

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static final byte[] f4881 = {-116, -115, -118, -89, -116, -112, 120, 55, 79, -8, -119, -23, 106, -114, -85, -56, -4, 105, 26, -57};

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static final byte[] f4873 = {-92, 111, -42, -46, 123, -96, -60, 79, -27, -31, 49, 103, 11, -54, -68, -27, 17, 2, 121, 104};

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static ConnectionStatus f4872 = ConnectionStatus.f3663;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final LinkedList<LogItem> f4875 = new LinkedList<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Vector<InterfaceC0755> f4869 = new Vector<>();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static Vector<InterfaceC0757> f4874 = new Vector<>();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static Vector<InterfaceC0756> f4880 = new Vector<>();

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static TrafficHistory f4883 = new TrafficHistory();

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ざっざへづ$〺つふすそ, reason: contains not printable characters */
    public enum EnumC0754 {
        f4886(2),
        f4889(-2),
        f4887(1),
        f4888(3),
        f4885(4);


        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f4890;

        EnumC0754(int i) {
            this.f4890 = i;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static EnumC0754 m2054(int i) {
            if (i == -2) {
                return f4889;
            }
            if (i == 1) {
                return f4887;
            }
            if (i == 2) {
                return f4886;
            }
            if (i == 3) {
                return f4888;
            }
            if (i != 4) {
                return null;
            }
            return f4885;
        }
    }

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ざっざへづ$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC0755 {
        /* renamed from: げつ〴ぬぐ */
        void mo1596(LogItem logItem);
    }

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ざっざへづ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC0756 {
        /* renamed from: 〺つふすそ */
        void mo1569(long j, long j2, long j3, long j4);
    }

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ざっざへづ$びぐびあび, reason: contains not printable characters */
    public interface InterfaceC0757 {
        /* renamed from: ぇ〳〲〺すっ */
        void mo1583(String str);

        /* renamed from: ぺふねづ〺 */
        void mo1595(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent);
    }

    static {
        m2051();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static void m2027(int i) {
        m2041(new LogItem(EnumC0754.f4889, i), false);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static synchronized void m2028(InterfaceC0757 interfaceC0757) {
        synchronized (C0753.class) {
            if (!f4874.contains(interfaceC0757)) {
                f4874.add(interfaceC0757);
                String str = f4878;
                if (str != null) {
                    interfaceC0757.mo1595(str, f4876, f4870, f4872, f4868);
                }
            }
        }
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static void m2029(InterfaceC0737.EnumC0738 enumC0738) {
        int i;
        String a;
        ConnectionStatus connectionStatus = ConnectionStatus.f3665;
        int ordinal = enumC0738.ordinal();
        if (ordinal == 0) {
            i = 2131821312;
            connectionStatus = ConnectionStatus.f3668;
            a = Crypt.a(Crypt.xrc("M1lKdhA6iKdjKfjN1i\u00193fMcjKjfIcgJe"));
        } else if (ordinal == 1) {
            i = 2131821322;
            a = Crypt.a(Crypt.xrc("@f:Lc>Nb>@b=Mc:Odl\u00190nNen@6mM`gO3"));
        } else {
            if (ordinal != 2) {
                return;
            }
            i = 2131821316;
            a = Crypt.a(Crypt.xrc("\u001b7=J1j\u001bgjAdiAco\u001c09\u00191k\u001e7mA4m\u001b4i\u0019c"));
        }
        m2032(a, "", i, connectionStatus);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static void m2030(String str) {
        m2041(new LogItem(EnumC0754.f4885, str), false);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static void m2031(String str) {
        m2041(new LogItem(EnumC0754.f4889, str), false);
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static synchronized void m2032(String str, String str2, int i, ConnectionStatus connectionStatus) {
        synchronized (C0753.class) {
            m2048(str, str2, i, connectionStatus, null);
        }
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static void m2033(int i, Object... objArr) {
        m2041(new LogItem(EnumC0754.f4887, i, objArr), false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static void m2034(String str, String str2) {
        char c;
        int i;
        ConnectionStatus connectionStatus;
        ConnectionStatus connectionStatus2 = f4872;
        ConnectionStatus connectionStatus3 = ConnectionStatus.f3664;
        String a = Crypt.a(Crypt.xrc("Hd9\u0019ef\u001c7oO4=He:I`9\u001ddnIei\u001d0iA3iIe"));
        if (connectionStatus2 == connectionStatus3 && str.equals(a)) {
            return;
        }
        str.hashCode();
        int hashCode = str.hashCode();
        String a2 = Crypt.a(Crypt.xrc("\u001ee;L7n\u001deg\u001a7mA`n\u001c6lOjo\u001cggIe;\u001a7j@c"));
        String a3 = Crypt.a(Crypt.xrc("A3o\u001bblO1;\u001c`=Ld:Lf:LcjJa=\u001cgn\u001affNk"));
        String a4 = Crypt.a(Crypt.xrc("Aj>K7g\u001d1;Aei\u001aehNci\u001d`g\u001efgKa:@gf\u001dd"));
        String a5 = Crypt.a(Crypt.xrc("N1<\u001e6j\u00194gKbfHk:@`:Nbl@b>\u001cb;\u001d6gId"));
        String a6 = Crypt.a(Crypt.xrc("\u001d`l\u001cb9\u001c`i\u001cj:LclHb:I7f\u001d3oL7>Me9Ig"));
        String a7 = Crypt.a(Crypt.xrc("N3lK0=LgiK1n\u001bggIak@3<L7j@`9AjiOk"));
        String a8 = Crypt.a(Crypt.xrc("\u001ajl@4mK1oL1:LchJfk\u001a1>\u00191;AciNkk\u001e7"));
        String a9 = Crypt.a(Crypt.xrc("Mcl\u001e6;M1l\u001c0h\u001dk:M6jLeiN0gKb:A7f\u001c0"));
        String a10 = Crypt.a(Crypt.xrc("\u001balLbhKj;LciMkl\u001ba:M0fA0o\u001a1k\u001c7gLb"));
        String a11 = Crypt.a(Crypt.xrc("\u001cekI6kKbmNdf\u00196:@19I6gJkm\u001aci\u001ebm@a"));
        String a12 = Crypt.a(Crypt.xrc("J0nLkoH7:\u001c7=@`oJdoA0fNa;L`=\u0019`:K0"));
        String a13 = Crypt.a(Crypt.xrc("K1;@c=@j:H79\u00190f\u001d6iN7<A3nNj>\u001ea:Hb"));
        switch (hashCode) {
            case -2087582999:
                if (str.equals(a13)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2026270421:
                if (str.equals(a12)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -837916192:
                if (str.equals(a11)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -597398044:
                if (str.equals(a10)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -453674901:
                if (str.equals(a)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -290559304:
                if (str.equals(a9)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -89776521:
                if (str.equals(a8)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2020776:
                if (str.equals(a7)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2656629:
                if (str.equals(a6)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 263560780:
                if (str.equals(a5)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 847358152:
                if (str.equals(a4)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 935892539:
                if (str.equals(a3)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1815350732:
                if (str.equals(a2)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                i = 2131821307;
                break;
            case 1:
                i = 2131821314;
                break;
            case 2:
                i = 2131821306;
                break;
            case 3:
                i = 2131821310;
                break;
            case 4:
                i = 2131821311;
                break;
            case 5:
                i = 2131821308;
                break;
            case 6:
                i = 2131821303;
                break;
            case 7:
                i = 2131821304;
                break;
            case '\b':
                i = 2131821323;
                break;
            case '\t':
                i = 2131821317;
                break;
            case '\n':
                i = 2131821302;
                break;
            case 11:
                i = 2131821309;
                break;
            case '\f':
                i = 2131821315;
                break;
            default:
                i = 2131821381;
                break;
        }
        int i2 = i;
        String[] strArr = {a9, a6, a12, a2, a5};
        String[] strArr2 = {a7, a, a8, a4, a11};
        String[] strArr3 = {a13};
        String[] strArr4 = {a3, a10};
        int i3 = 0;
        while (true) {
            if (i3 >= 5) {
                int i4 = 0;
                while (true) {
                    if (i4 >= 5) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= 1) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= 2) {
                                        connectionStatus = ConnectionStatus.f3671;
                                    } else if (str.equals(strArr4[i6])) {
                                        connectionStatus = ConnectionStatus.f3663;
                                    } else {
                                        i6++;
                                    }
                                }
                            } else if (str.equals(strArr3[i5])) {
                                connectionStatus = ConnectionStatus.f3662;
                            } else {
                                i5++;
                            }
                        }
                    } else if (str.equals(strArr2[i4])) {
                        connectionStatus = ConnectionStatus.f3669;
                    } else {
                        i4++;
                    }
                }
            } else if (str.equals(strArr[i3])) {
                connectionStatus = ConnectionStatus.f3666;
            } else {
                i3++;
            }
        }
        m2032(str, str2, i2, connectionStatus);
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static void m2035(String str) {
        m2041(new LogItem(EnumC0754.f4887, str), false);
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static synchronized void m2036(EnumC0754 enumC0754, String str, String str2) {
        synchronized (C0753.class) {
            m2041(new LogItem(enumC0754, str + str2), false);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static String m2037(Context context) {
        String str = f4876;
        int ordinal = f4872.ordinal();
        String a = Crypt.a(Crypt.xrc("\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3"));
        if (ordinal == 0) {
            String[] split = f4876.split(a);
            if (split.length >= 7) {
                str = String.format(Locale.US, Crypt.a(Crypt.xrc("\u001dk=J1l\u0019e<ManKfgH`i\u001ca;OelA`kHj=\u00191")), split[1], split[6]);
            }
        }
        while (str.endsWith(a)) {
            str = str.substring(0, str.length() - 1);
        }
        String str2 = f4878;
        if (str2.equals(Crypt.a(Crypt.xrc("\u001ejkAemKco\u001agl\u0019cjL7=Ja=\u001e0o\u001ba=\u001cc:\u001db")))) {
            return str;
        }
        int i = f4870;
        if (i == 2131821324) {
            return context.getString(2131821324, f4876);
        }
        String string = context.getString(i);
        if (f4870 == 2131821381) {
            str = C2098.m4205(str2, str);
        }
        if (str.length() > 0) {
            string = C2098.m4205(string, Crypt.a(Crypt.xrc("\u001dc<\u001e6:Nch\u001b4>Lf=Ae9Ab<AklOdm\u001d0mO3")));
        }
        return C2098.m4205(string, str);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static synchronized void m2038(InterfaceC0756 interfaceC0756) {
        synchronized (C0753.class) {
            TrafficHistory.C0503 m1601 = f4883.m1601(null);
            TrafficHistory.TrafficDatapoint trafficDatapoint = m1601.f3747;
            long j = trafficDatapoint.f3744;
            interfaceC0756.mo1569(j, trafficDatapoint.f3745, Math.max(0L, j - m1601.f3746.f3744), Math.max(0L, m1601.f3747.f3745 - m1601.f3746.f3745));
            f4880.add(interfaceC0756);
        }
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static synchronized void m2039(InterfaceC0755 interfaceC0755) {
        synchronized (C0753.class) {
            f4869.remove(interfaceC0755);
        }
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public static synchronized void m2040(InterfaceC0757 interfaceC0757) {
        synchronized (C0753.class) {
            f4874.remove(interfaceC0757);
        }
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static synchronized void m2041(LogItem logItem, boolean z) {
        synchronized (C0753.class) {
            if (z) {
                f4875.addFirst(logItem);
            } else {
                f4875.addLast(logItem);
            }
            if (f4875.size() > 1500) {
                while (true) {
                    LinkedList<LogItem> linkedList = f4875;
                    if (linkedList.size() <= 1000) {
                        break;
                    } else {
                        linkedList.removeFirst();
                    }
                }
            }
            Iterator<InterfaceC0755> it = f4869.iterator();
            while (it.hasNext()) {
                it.next().mo1596(logItem);
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static boolean m2042() {
        return (f4872 == ConnectionStatus.f3670 || f4872 == ConnectionStatus.f3663) ? false : true;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static void m2043(int i, Object... objArr) {
        m2041(new LogItem(EnumC0754.f4886, i, objArr), false);
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static void m2044(String str) {
        f4882 = str;
        Iterator<InterfaceC0757> it = f4874.iterator();
        while (it.hasNext()) {
            it.next().mo1583(str);
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static void m2045(int i, Object... objArr) {
        m2041(new LogItem(EnumC0754.f4885, i, objArr), false);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static void m2046(String str) {
        m2041(new LogItem(EnumC0754.f4886, str), false);
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static synchronized void m2047(InterfaceC0756 interfaceC0756) {
        synchronized (C0753.class) {
            f4880.remove(interfaceC0756);
        }
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static synchronized void m2048(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent) {
        synchronized (C0753.class) {
            if (f4872 == ConnectionStatus.f3662 && (str.equals(Crypt.a(Crypt.xrc("\u001d`l\u001cb9\u001c`i\u001cj:LclHb:I7f\u001d3oL7>Me9Ig"))) || str.equals(Crypt.a(Crypt.xrc("N3lK0=LgiK1n\u001bggIak@3<L7j@`9AjiOk"))))) {
                m2041(new LogItem(EnumC0754.f4885, String.format(Crypt.a(Crypt.xrc("\u00194:\u001e7;K4l\u001adkM6k\u001ej>Lk<NjkO3=K6k\u0019dkNam\u001cg9LaiJ`9OflO1=LgjL`=\u001b79\u001ca;IcjH1j\u001aa<Leg\u0019c=O0i\u001dg>L4;\u001eciK1kO3nK4=\u001ael\u001b7=Hc=Oj<\u0019dm@dhNkoMcl\u001cjf\u0019g")), str, connectionStatus.toString(), str2)), false);
                return;
            }
            f4878 = str;
            f4876 = str2;
            f4870 = i;
            f4872 = connectionStatus;
            f4868 = intent;
            Iterator<InterfaceC0757> it = f4874.iterator();
            while (it.hasNext()) {
                it.next().mo1595(str, str2, i, connectionStatus, intent);
            }
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static synchronized LogItem[] m2049() {
        LogItem[] logItemArr;
        synchronized (C0753.class) {
            LinkedList<LogItem> linkedList = f4875;
            logItemArr = (LogItem[]) linkedList.toArray(new LogItem[linkedList.size()]);
        }
        return logItemArr;
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static synchronized void m2050(long j, long j2) {
        synchronized (C0753.class) {
            TrafficHistory.C0503 m1602 = f4883.m1602(j, j2);
            Iterator<InterfaceC0756> it = f4880.iterator();
            while (it.hasNext()) {
                it.next().mo1569(j, j2, Math.max(0L, m1602.f3747.f3744 - m1602.f3746.f3744), Math.max(0L, m1602.f3747.f3745 - m1602.f3746.f3745));
            }
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static void m2051() {
        String a;
        try {
            a = NativeUtils.m1578();
        } catch (UnsatisfiedLinkError unused) {
            a = Crypt.a(Crypt.xrc("\u001dgn\u001bchKek\u001ej:\u001ddg@7lL0k\u001a1jL`:L3n\u001b7"));
        }
        m2043(2131820982, Build.MODEL, Build.BOARD, Build.BRAND, Integer.valueOf(Build.VERSION.SDK_INT), a, Build.VERSION.RELEASE, Build.ID, Build.FINGERPRINT, "", "");
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static void m2052(int i, Object... objArr) {
        m2041(new LogItem(EnumC0754.f4889, i, objArr), false);
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static void m2053() {
    }
}
