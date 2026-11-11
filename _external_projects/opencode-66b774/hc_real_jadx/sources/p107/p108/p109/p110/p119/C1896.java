package p107.p108.p109.p110.p119;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1896 extends Fragment {

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public TextView f8344;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public InterfaceC1897 f8345;

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC1897 {
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぇとしたべど */
    public void mo487() {
        this.f1196 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぉひのべい */
    public void mo493(Context context) {
        super.mo493(context);
        if (context instanceof InterfaceC1897) {
            this.f8345 = (InterfaceC1897) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: けときぜと */
    public View mo501(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131492939, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(2131296934);
        this.f8344 = textView;
        textView.setVisibility(8);
        Animation loadAnimation = AnimationUtils.loadAnimation(m525(), 2130771980);
        loadAnimation.reset();
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131296624);
        linearLayout.clearAnimation();
        linearLayout.startAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(m525(), 2130772007);
        loadAnimation2.reset();
        ImageView imageView = (ImageView) inflate.findViewById(2131296636);
        imageView.clearAnimation();
        imageView.startAnimation(loadAnimation2);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(m525(), 2130772003);
        this.f8344.setVisibility(0);
        this.f8344.startAnimation(loadAnimation3);
        this.f8344.setText(Html.fromHtml(String.format(m490(2131820594), Crypt.a(Crypt.xrc("\u0019`=A4j\u00190jJ0hO7jA19@`f\u001eb<\u001ef>Ka<KjfKf:\u001d`hJ0g\u001b4jKboKa<Lk;Mki\u001ckkLagL")))));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: せづっ〸ちね */
    public void mo510(Bundle bundle) {
        super.mo510(bundle);
        Bundle bundle2 = this.f1176;
        if (bundle2 != null) {
            bundle2.getString(Crypt.a(Crypt.xrc("Nbn\u0019dl\u001e3f\u001cgjJgfHciAchKg=J49K`:@3")));
            this.f1176.getString(Crypt.a(Crypt.xrc("N3<O3>Ng;J09M7mOjiN4jObnNdfA0fMf")));
        }
    }
}
