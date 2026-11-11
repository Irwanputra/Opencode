package p010.p011.p012.p013;

import androidx.core.app.NotificationCompat;
import de.blinkt.openvpn.core.LogItem;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p010.p011.p012.p013.C0753;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC0764 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String[] f4902;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Process f4904;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public OpenVPNService f4905;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String f4906;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public String f4907;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f4903 = false;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f4901 = false;

    public RunnableC0764(OpenVPNService openVPNService, String[] strArr, String str) {
        this.f4902 = strArr;
        this.f4907 = str;
        this.f4905 = openVPNService;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025b A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x028a A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0307 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p010.p011.p012.p013.RunnableC0764.run():void");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m2057(String[] strArr) {
        C0753.EnumC0754 enumC0754 = C0753.EnumC0754.f4887;
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, strArr);
        ProcessBuilder processBuilder = new ProcessBuilder(linkedList);
        String replaceFirst = strArr[0].replaceFirst(Crypt.a(Crypt.xrc("I19H6g\u001cjlJ4>\u001e4:\u001b3hJ4o\u001a7>Og9@f9Na")), Crypt.a(Crypt.xrc("\u001cjmKk9Ok;M09\u001ee9A3fNbhIc;OagOekJk")));
        Map<String, String> environment = processBuilder.environment();
        String a = Crypt.a(Crypt.xrc("\u001dd>A0iN0hN0iJ09\u001d0k\u001df=K`nKglMam\u001c3"));
        String str = environment.get(a);
        String a2 = Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"));
        String m4187 = str == null ? replaceFirst : C2098.m4187(replaceFirst, a2, str);
        if (!replaceFirst.equals(this.f4907)) {
            m4187 = this.f4907 + a2 + m4187;
        }
        processBuilder.environment().put(a, m4187);
        processBuilder.redirectErrorStream(true);
        try {
            Process start = processBuilder.start();
            this.f4904 = start;
            start.getOutputStream().close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f4904.getInputStream()));
            do {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                if (readLine.startsWith(Crypt.a(Crypt.xrc("\u001e3lL3<HggN7=K3<Nc9\u001c0i\u001ddjOeiHg:@e")))) {
                    this.f4906 = readLine.substring(11);
                }
                if (readLine.startsWith(Crypt.a(Crypt.xrc("\u001d4nOj:\u001ea;@diIa:Kf>\u001d7nNbjO4>@b=JdjLei\u001ee>\u0019gmOdoLf9L0mHf:KfjNki\u001egoJ6=Ab;\u0019kh\u00190g\u001eeoK4:JgmN`>\u001ebmK3mHbl"))) || readLine.contains(Crypt.a(Crypt.xrc("M7lAk;\u0019a;Nj:Ijh\u001ejoN4kMk:Maf\u001b1oIe")))) {
                    this.f4903 = true;
                }
                Matcher matcher = Pattern.compile("(\\d+).(\\d+) ([0-9a-f])+ (.*)").matcher(readLine);
                if (matcher.matches()) {
                    int parseInt = Integer.parseInt(matcher.group(3), 16);
                    String group = matcher.group(4);
                    int i = parseInt & 15;
                    C0753.EnumC0754 enumC07542 = C0753.EnumC0754.f4886;
                    if ((parseInt & 16) != 0) {
                        enumC07542 = C0753.EnumC0754.f4889;
                    } else {
                        if ((parseInt & 32) == 0 && (parseInt & 64) == 0) {
                            if ((parseInt & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
                                enumC07542 = C0753.EnumC0754.f4888;
                            }
                        }
                        enumC07542 = enumC0754;
                    }
                    if (group.startsWith(Crypt.a(Crypt.xrc("Ha;M3<I0iHa;M6lLckMcoMcf\u001e7mJajHa")))) {
                        i = Math.max(4, i);
                    }
                    boolean z = (group.endsWith(Crypt.a(Crypt.xrc("LjmOd=\u001edjH0:\u001bd=\u001d`k@gnL3=\u001admMe9\u001c`"))) && group.startsWith(Crypt.a(Crypt.xrc("Kb9\u001a6o\u001d4:Od<\u001cahI0jKbj\u001afg\u001a0oL1l\u001ed")))) || group.contains(Crypt.a(Crypt.xrc("Akk\u001a49Lb<Ajl\u001d1g@19HjkMgjAjh\u001c`9\u001cd")));
                    LinkedList<LogItem> linkedList2 = C0753.f4875;
                    C0753.m2041(new LogItem(enumC07542, i, group), false);
                    if (z) {
                        C0753.m2031(Crypt.a(Crypt.xrc("Ofo\u001cc=\u001ca=I1n\u001ccoA0fL1:\u0019cf\u001b0m@jgJ3:McmH3>Jbo\u001e7jNg<Me;\u001akl\u001cahMgo\u001c6lIchHciL1<Lb9L7o\u001ea;J49Acl\u00196l@gn\u00190fOk=\u001bb<L`<M1i\u001e7<\u001ebl\u001b`k\u001b6>Jei\u001adf\u001ekf\u0019co\u001c6g\u00191;\u001dgkOc;@6k\u001e7<Ja:@b<\u001ag;\u001e6<Ogn\u001ckl\u001bkg\u001d0n\u0019ffOko\u00190iL1jHdj\u0019k=")));
                    }
                } else {
                    C0753.m2046(Crypt.a(Crypt.xrc("Nk=JffA69\u001e0hO1;Kf<HakHfnA1i\u001aa=A1")) + readLine);
                }
            } while (!Thread.interrupted());
            throw new InterruptedException(Crypt.a(Crypt.xrc("M1>A7g\u001d6m\u001dfjM1=O0oKe>O0i\u001dg=Lam\u001e7oOe9\u0019jn\u001ac<\u001d3hOkn\u001a1:\u00194=Ob9Je9Nc:A7=OghHef\u001e1>\u001cbkOc=\u001a7;H49@flOkfKgi")));
        } catch (IOException | InterruptedException unused) {
            LinkedList<LogItem> linkedList3 = C0753.f4875;
            this.f4904.destroy();
        }
    }
}
