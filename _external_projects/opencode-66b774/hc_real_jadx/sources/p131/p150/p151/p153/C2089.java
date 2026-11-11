package p131.p150.p151.p153;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import p131.p150.p151.C2086;
import p131.p150.p151.C2088;

/* renamed from: なぎぱいぢぎ.くし〴〺ぅ.げつ〴ぬぐ.ぺぁあねじ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2089 extends RecyclerView.AbstractC0228<RecyclerView.AbstractC0207> {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Context f8888;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ArrayList<File> f8889;

    /* renamed from: なぎぱいぢぎ.くし〴〺ぅ.げつ〴ぬぐ.ぺぁあねじ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2090 extends RecyclerView.AbstractC0207 {

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public TextView f8890;

        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public TextView f8891;

        public C2090(C2089 c2089, View view) {
            super(view);
            this.f8891 = (TextView) view.findViewById(C2088.messageLogTime);
            this.f8890 = (TextView) view.findViewById(C2088.textViewMsg);
        }
    }

    public C2089(Context context, ArrayList<File> arrayList) {
        this.f8888 = context;
        this.f8889 = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: げつ〴ぬぐ */
    public int mo888() {
        return this.f8889.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: づざかべべ */
    public RecyclerView.AbstractC0207 mo889(ViewGroup viewGroup, int i) {
        return new C2090(this, LayoutInflater.from(this.f8888).inflate(C2086.custom_item, (ViewGroup) null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: びぐびあび */
    public void mo891(RecyclerView.AbstractC0207 abstractC0207, int i) {
        C2090 c2090 = (C2090) abstractC0207;
        Context context = this.f8888;
        File file = this.f8889.get(i);
        c2090.getClass();
        String absolutePath = file.getAbsolutePath();
        String str = "";
        c2090.f8891.setText(file.getName().replaceAll("[a-zA-Z_.]", ""));
        TextView textView = c2090.f8890;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(absolutePath)));
            str = bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException unused) {
        }
        textView.setText(str);
        c2090.f8890.setOnClickListener(new ViewOnClickListenerC2092(c2090, context, absolutePath));
    }
}
