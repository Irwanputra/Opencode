package p107.p108.p109.p110.p119;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.github.clans.fab.FloatingActionButton;
import de.blinkt.openvpn.core.LogItem;
import java.util.LinkedList;
import p010.p011.p012.p013.C0753;
import p034.p050.p053.C1216;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.widgets.logger.LogView;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1921 extends Fragment implements C0753.InterfaceC0755, Handler.Callback {

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public static final String f8396 = C1921.class.getSimpleName();

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public Handler f8397;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public FloatingActionButton f8398;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public LogView f8399;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public InterfaceC1923 f8400;

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.びぐびあび$〺つふすそ, reason: contains not printable characters */
    public class ViewOnClickListenerC1922 implements View.OnClickListener {
        public ViewOnClickListenerC1922() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1921.this.f8399.m1716();
            C1921 c1921 = C1921.this;
            InterfaceC1923 interfaceC1923 = c1921.f8400;
            if (interfaceC1923 != null) {
                interfaceC1923.mo1614(c1921.f8399);
            }
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.びぐびあび$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC1923 {
        /* renamed from: 〺つふすそ */
        void mo1612();

        /* renamed from: いいにぽつ */
        void mo1614(LogView logView);

        /* renamed from: げつ〴ぬぐ */
        void mo1618();
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1924 implements AdapterView.OnItemLongClickListener {
        public C1924() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            ((ClipboardManager) C1921.this.m500().getSystemService(Crypt.a(Crypt.xrc("K1lNg:\u001d3i\u00193<J4iN4>\u001c6j\u001a6<Abo\u0019bgIj")))).setPrimaryClip(ClipData.newPlainText(Crypt.a(Crypt.xrc("Odf\u001e0>\u001c1m@jfLdhMji\u001cjjJbjMgi\u001eagJ6")), ((TextView) view).getText()));
            ((C1216) App.f3760).m2790(C1921.this.m490(2131820724), -1);
            return true;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1 && C0753.m2042()) {
            ((C1216) App.f3760).m2790(m490(2131820632), -256);
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぃぜぶの〸ぃ */
    public boolean mo483(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131296318 || this.f8400 == null) {
            return false;
        }
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("MamA7kOcgJ1<AfkA1=A6:\u001ca9\u001a0mIem\u001db")), "");
        this.f8400.mo1618();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぇとしたべど */
    public void mo487() {
        this.f1196 = true;
        this.f8400 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぉひのべい */
    public void mo493(Context context) {
        super.mo493(context);
        if (context instanceof InterfaceC1923) {
            this.f8400 = (InterfaceC1923) context;
            return;
        }
        throw new RuntimeException(context.toString() + Crypt.a(Crypt.xrc("N4<\u001ab=\u001b4hJjoA3lI7i\u001ef;\u0019cfNe<M4lJ6oL7m\u001ebk\u001e0nIdgMagLafJcj\u001d3k\u0019j9\u001b0jI3mI`>Iff\u0019kkN1;Lfn\u001c0nJ4f@j;LejA6h")));
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: おかぷせ〱 */
    public void mo494() {
        C0753.m2039(this);
        this.f1196 = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: けときぜと */
    public View mo501(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131492940, viewGroup, false);
        LogView logView = (LogView) inflate.findViewById(2131296637);
        this.f8399 = logView;
        logView.setTranscriptMode(2);
        this.f8399.setOnItemLongClickListener(new C1924());
        this.f8398 = (FloatingActionButton) inflate.findViewById(2131296540);
        InterfaceC1923 interfaceC1923 = this.f8400;
        if (interfaceC1923 != null) {
            interfaceC1923.mo1614(this.f8399);
        }
        LinkedList<LogItem> linkedList = C0753.f4875;
        synchronized (C0753.class) {
            C0753.f4869.add(this);
        }
        this.f8398.setOnClickListener(new ViewOnClickListenerC1922());
        return inflate;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(3:163|164|165)|(6:167|168|169|170|171|(1:173)(6:174|175|176|177|50|(2:52|53)(2:55|56)))|188|189|190|191|192|193|194|177|50|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:163|164|165|(6:167|168|169|170|171|(1:173)(6:174|175|176|177|50|(2:52|53)(2:55|56)))|188|189|190|191|192|193|194|177|50|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:15|(2:16|17)|18|(1:20)(1:160)|(3:22|(1:24)(1:26)|25)|27|(1:29)(1:159)|30|31|(1:32)|(6:34|35|36|37|38|(1:40)(10:41|42|43|44|45|46|(1:48)(1:57)|49|50|(0)(0)))|94|95|(6:97|98|99|100|101|(16:103|104|105|106|107|108|109|110|111|112|113|114|115|116|50|(0)(0)))|131|132|133|134|135|(3:137|138|139)(7:143|144|145|146|147|148|149)|140|116|50|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:15|16|17|18|(1:20)(1:160)|(3:22|(1:24)(1:26)|25)|27|(1:29)(1:159)|30|31|(1:32)|(6:34|35|36|37|38|(1:40)(10:41|42|43|44|45|46|(1:48)(1:57)|49|50|(0)(0)))|94|95|(6:97|98|99|100|101|(16:103|104|105|106|107|108|109|110|111|112|113|114|115|116|50|(0)(0)))|131|132|133|134|135|(3:137|138|139)(7:143|144|145|146|147|148|149)|140|116|50|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x059e, code lost:
    
        r11 = r16 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01f9, code lost:
    
        r0 = p107.p108.p109.p110.p119.C1921.f8396;
        r2 = new java.lang.StringBuilder();
        r2.append(r4);
        r2.append(new java.text.SimpleDateFormat(r3, java.util.Locale.getDefault()).format(new java.util.Date()));
        r2.append(r14);
        r2.append(r24.m1574(m525()).replaceAll("(((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}|localhost|(([0-9]{1,3}\\.){3})[0-9]{1,3}):[0-9]+", r15).replaceAll(r10, r15).replace(r12, r15).replace(r11, r15).replace(r13, r15).replace(r9, r15).replace(java.lang.String.valueOf(r5), r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x024c, code lost:
    
        r0 = p107.p108.p109.p110.p119.C1921.f8396;
        r2 = new java.lang.StringBuilder();
        r2.append(r4);
        r2.append(new java.text.SimpleDateFormat(r3, java.util.Locale.getDefault()).format(new java.util.Date()));
        r2.append(r14);
        r2.append(r24.m1574(m525()).replace(r12, r9 + r16 + r5).replace(r11, r9).replace(r13, java.lang.String.valueOf(r5)));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01f9 A[Catch: Exception -> 0x0782, TryCatch #23 {Exception -> 0x0782, blocks: (B:12:0x0097, B:184:0x01d8, B:186:0x01f9, B:75:0x0246, B:76:0x0727, B:187:0x024c, B:17:0x02a0, B:18:0x02c2, B:20:0x02e1, B:22:0x0305, B:24:0x0315, B:26:0x032d, B:27:0x0338, B:29:0x034c, B:63:0x05ae, B:65:0x05cf, B:67:0x05f4, B:74:0x0623, B:82:0x067d, B:84:0x068b, B:85:0x06e4, B:86:0x072b, B:88:0x076c, B:89:0x0776, B:160:0x02ec), top: B:11:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x024c A[Catch: Exception -> 0x0782, TRY_LEAVE, TryCatch #23 {Exception -> 0x0782, blocks: (B:12:0x0097, B:184:0x01d8, B:186:0x01f9, B:75:0x0246, B:76:0x0727, B:187:0x024c, B:17:0x02a0, B:18:0x02c2, B:20:0x02e1, B:22:0x0305, B:24:0x0315, B:26:0x032d, B:27:0x0338, B:29:0x034c, B:63:0x05ae, B:65:0x05cf, B:67:0x05f4, B:74:0x0623, B:82:0x067d, B:84:0x068b, B:85:0x06e4, B:86:0x072b, B:88:0x076c, B:89:0x0776, B:160:0x02ec), top: B:11:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05cf A[Catch: Exception -> 0x0782, TryCatch #23 {Exception -> 0x0782, blocks: (B:12:0x0097, B:184:0x01d8, B:186:0x01f9, B:75:0x0246, B:76:0x0727, B:187:0x024c, B:17:0x02a0, B:18:0x02c2, B:20:0x02e1, B:22:0x0305, B:24:0x0315, B:26:0x032d, B:27:0x0338, B:29:0x034c, B:63:0x05ae, B:65:0x05cf, B:67:0x05f4, B:74:0x0623, B:82:0x067d, B:84:0x068b, B:85:0x06e4, B:86:0x072b, B:88:0x076c, B:89:0x0776, B:160:0x02ec), top: B:11:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x072b A[Catch: Exception -> 0x0782, TryCatch #23 {Exception -> 0x0782, blocks: (B:12:0x0097, B:184:0x01d8, B:186:0x01f9, B:75:0x0246, B:76:0x0727, B:187:0x024c, B:17:0x02a0, B:18:0x02c2, B:20:0x02e1, B:22:0x0305, B:24:0x0315, B:26:0x032d, B:27:0x0338, B:29:0x034c, B:63:0x05ae, B:65:0x05cf, B:67:0x05f4, B:74:0x0623, B:82:0x067d, B:84:0x068b, B:85:0x06e4, B:86:0x072b, B:88:0x076c, B:89:0x0776, B:160:0x02ec), top: B:11:0x0097 }] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r5v77, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.String] */
    @Override // p010.p011.p012.p013.C0753.InterfaceC0755
    /* renamed from: げつ〴ぬぐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1596(de.blinkt.openvpn.core.LogItem r24) {
        /*
            Method dump skipped, instructions count: 2018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p119.C1921.mo1596(de.blinkt.openvpn.core.LogItem):void");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: せづっ〸ちね */
    public void mo510(Bundle bundle) {
        super.mo510(bundle);
        m498(true);
        Bundle bundle2 = this.f1176;
        if (bundle2 != null) {
            bundle2.getString(Crypt.a(Crypt.xrc("Nbn\u0019dl\u001e3f\u001cgjJgfHciAchKg=J49K`:@3")));
            this.f1176.getString(Crypt.a(Crypt.xrc("N3<O3>Ng;J09M7mOjiN4jObnNdfA0fMf")));
        }
        this.f8397 = new Handler(this);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ち〴みぎ〻び */
    public void mo511() {
        this.f1196 = true;
        InterfaceC1923 interfaceC1923 = this.f8400;
        if (interfaceC1923 != null) {
            interfaceC1923.mo1612();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぷぞてのほき */
    public void mo528(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(2131558403, menu);
    }
}
