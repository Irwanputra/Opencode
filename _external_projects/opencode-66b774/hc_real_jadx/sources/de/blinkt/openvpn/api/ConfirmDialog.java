package de.blinkt.openvpn.api;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import de.blinkt.openvpn.core.OpenVPNService;
import p010.p011.p012.p013.InterfaceC0761;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ConfirmDialog extends Activity implements CompoundButton.OnCheckedChangeListener, DialogInterface.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f3654;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Button f3655;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public InterfaceC0761 f3656;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ServiceConnection f3657 = new ServiceConnectionC0489();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public AlertDialog f3658;

    /* renamed from: de.blinkt.openvpn.api.ConfirmDialog$〺つふすそ, reason: contains not printable characters */
    public class DialogInterfaceOnShowListenerC0488 implements DialogInterface.OnShowListener {
        public DialogInterfaceOnShowListenerC0488() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            ConfirmDialog confirmDialog = ConfirmDialog.this;
            confirmDialog.f3655 = confirmDialog.f3658.getButton(-1);
            ConfirmDialog.this.f3655.setEnabled(false);
        }
    }

    /* renamed from: de.blinkt.openvpn.api.ConfirmDialog$げつ〴ぬぐ, reason: contains not printable characters */
    public class ServiceConnectionC0489 implements ServiceConnection {
        public ServiceConnectionC0489() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ConfirmDialog.this.f3656 = InterfaceC0761.AbstractBinderC0762.m2056(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ConfirmDialog.this.f3656 = null;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        setResult(0);
        finish();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f3655.setEnabled(z);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            try {
                this.f3656.mo1585(this.f3654);
                setResult(-1);
                finish();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
        if (i == -2) {
            setResult(0);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        unbindService(this.f3657);
    }

    @Override // android.app.Activity
    public void onResume() {
        String str;
        super.onResume();
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bi@1g\u001bb9O6gL0f\u001d0g\u001b6gIj:M4f\u0019cm\u001d09Aah@`i\u001b4oMcnAkn\u001bcl\u001ekoH0<M`nK3;Iao")));
        bindService(intent, this.f3657, 1);
        Intent intent2 = getIntent();
        String a = Crypt.a(Crypt.xrc("\u001ac<\u001cdmKbk\u0019kmAg=\u001cjg\u001b1mOd>O0lI`mL3=A4m\u001b7m\u001ckkOf:\u001e6h\u001ak<Kcl@km\u001ejg\u00196kNk>Kbi\u00191hOghJ7hH`=K4i\u001cfo\u001a4j\u001c`9M1l"));
        if (intent2.getStringExtra(a) != null) {
            this.f3654 = intent2.getStringExtra(a);
        } else {
            String callingPackage = getCallingPackage();
            this.f3654 = callingPackage;
            if (callingPackage == null) {
                finish();
                return;
            }
        }
        try {
            View inflate = View.inflate(this, 2131492905, null);
            if (this.f3654.equals(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bg\u001d4mI6nNd:O1hO0gOel\u001dk:OfmNj>LcgLdl\u0019ah\u001eci\u0019ek\u001b`9O7k\u001ab>\u001e4f\u001d7=\u001e49\u001c6n")))) {
                str = getString(2131820620, new Object[]{getString(2131820625)});
            } else {
                PackageManager packageManager = getPackageManager();
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f3654, 0);
                String string = getString(2131821124, new Object[]{applicationInfo.loadLabel(packageManager), getString(2131820625)});
                ((ImageView) inflate.findViewById(2131296584)).setImageDrawable(applicationInfo.loadIcon(packageManager));
                str = string;
            }
            ((TextView) inflate.findViewById(2131296743)).setText(str);
            ((CompoundButton) inflate.findViewById(2131296405)).setOnCheckedChangeListener(this);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(inflate);
            builder.setIconAttribute(R.attr.alertDialogIcon);
            builder.setTitle(R.string.dialog_alert_title);
            builder.setPositiveButton(R.string.ok, this);
            builder.setNegativeButton(R.string.cancel, this);
            AlertDialog create = builder.create();
            this.f3658 = create;
            create.setCanceledOnTouchOutside(false);
            this.f3658.setOnShowListener(new DialogInterfaceOnShowListenerC0488());
            this.f3658.show();
        } catch (Exception unused) {
            finish();
        }
    }
}
