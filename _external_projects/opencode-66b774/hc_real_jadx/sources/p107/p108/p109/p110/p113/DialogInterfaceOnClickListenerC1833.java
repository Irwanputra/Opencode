package p107.p108.p109.p110.p113;

import android.content.DialogInterface;
import java.io.File;
import team.dev.epro.apkcustom.widgets.FileChooser;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogInterfaceOnClickListenerC1833 implements DialogInterface.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ File[] f8200;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ File f8201;

    public DialogInterfaceOnClickListenerC1833(FileChooser fileChooser, File[] fileArr, File file) {
        this.f8200 = fileArr;
        this.f8201 = file;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f8200[0] = this.f8201;
        dialogInterface.dismiss();
    }
}
