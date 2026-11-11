package team.dev.epro.apkcustom.widgets.logger;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import p107.p108.p109.p110.p113.p116.InterfaceC1855;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class LogView extends ListView implements InterfaceC1855 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ArrayList<String> f4205;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ArrayAdapter<String> f4206;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public InterfaceC1855 f4207;

    /* renamed from: team.dev.epro.apkcustom.widgets.logger.LogView$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0581 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ StringBuilder f4208;

        public RunnableC0581(StringBuilder sb) {
            this.f4208 = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogView logView = LogView.this;
            String sb = this.f4208.toString();
            if (logView.f4205.size() > 500) {
                logView.m1716();
            }
            logView.f4205.add(sb);
            logView.f4206.notifyDataSetChanged();
        }
    }

    public LogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4205 = new ArrayList<>();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(), 2131492955, this.f4205);
        this.f4206 = arrayAdapter;
        setAdapter((ListAdapter) arrayAdapter);
    }

    public ArrayList<String> getArrayList() {
        return this.f4205;
    }

    public InterfaceC1855 getNext() {
        return this.f4207;
    }

    public void setNext(InterfaceC1855 interfaceC1855) {
        this.f4207 = interfaceC1855;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final StringBuilder m1715(StringBuilder sb, String str, String str2) {
        if (str != null) {
            if (str.length() == 0) {
                str2 = "";
            }
            sb.append(str);
            sb.append(str2);
        }
        return sb;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m1716() {
        this.f4206.clear();
        getAdapter();
        this.f4206.notifyDataSetChanged();
    }

    @Override // p107.p108.p109.p110.p113.p116.InterfaceC1855
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo1717(int i, String str, String str2, Throwable th) {
        String a;
        switch (i) {
            case 2:
                a = Crypt.a(Crypt.xrc("HfhH`k\u001egi@doKbhH1i@koM3fOjfNd:\u001bd"));
                break;
            case 3:
                a = Crypt.a(Crypt.xrc("\u001a4<\u0019j>\u001ccmOc<\u001b3kLgnNgg\u001d49@6j\u001a6l\u001aa"));
                break;
            case 4:
                a = Crypt.a(Crypt.xrc("Oe;\u001ca<\u00190i\u001d1f\u001ce<Kgn\u001a3<Ig>H7:Od>@j"));
                break;
            case 5:
                a = Crypt.a(Crypt.xrc("\u001cdiM`hAgkHd:\u001cc=J09I6hAggM6j@kjMc"));
                break;
            case 6:
                a = Crypt.a(Crypt.xrc("Og<\u001ddfLglAboHdnAejL1>Icg@0=N4lJa"));
                break;
            case 7:
                a = Crypt.a(Crypt.xrc("L1<\u001cc:Hj;@0=Me=KclMcfM6jN4jN7;\u001de"));
                break;
            default:
                a = null;
                break;
        }
        String stackTraceString = th != null ? Log.getStackTraceString(th) : null;
        StringBuilder sb = new StringBuilder();
        m1715(sb, a, "\t");
        m1715(sb, str, "\t");
        m1715(sb, str2, "\t");
        m1715(sb, stackTraceString, "\t");
        ((Activity) getContext()).runOnUiThread(new Thread(new RunnableC0581(sb)));
        InterfaceC1855 interfaceC1855 = this.f4207;
        if (interfaceC1855 != null) {
            interfaceC1855.mo1717(i, str, str2, th);
        }
    }
}
