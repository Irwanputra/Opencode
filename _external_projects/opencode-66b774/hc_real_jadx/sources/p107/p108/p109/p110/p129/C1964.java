package p107.p108.p109.p110.p129;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import p107.p108.p109.p110.p120.C1929;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぺぁあねじ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1964 extends ArrayAdapter<C1929> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Context f8570;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f8571;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public List<C1929> f8572;

    public C1964(Context context, int i, List<C1929> list) {
        super(context, i, list);
        this.f8570 = context;
        this.f8571 = i;
        this.f8572 = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Object getItem(int i) {
        return this.f8572.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f8570.getSystemService(Crypt.a(Crypt.xrc("\u001cfoM4o\u001b`kJb=NjfN6mNk;MffM3fIjf\u001d1")))).inflate(this.f8571, (ViewGroup) null);
        }
        C1929 c1929 = this.f8572.get(i);
        if (c1929 != null) {
            TextView textView = (TextView) view.findViewById(2131296271);
            TextView textView2 = (TextView) view.findViewById(2131296273);
            TextView textView3 = (TextView) view.findViewById(2131296274);
            ImageView imageView = (ImageView) view.findViewById(2131296543);
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("\u001egm\u001d4;OegJf:O4g\u001caiIao\u001bfo\u001db:Kj>\u001ak")));
            m4207.append(c1929.f8411);
            imageView.setImageDrawable(this.f8570.getResources().getDrawable(this.f8570.getResources().getIdentifier(m4207.toString(), null, this.f8570.getPackageName())));
            if (textView != null) {
                textView.setText(c1929.f8407);
            }
            if (textView2 != null) {
                textView2.setText(c1929.f8409);
            }
            if (textView3 != null) {
                textView3.setText(c1929.f8412);
            }
        }
        return view;
    }
}
