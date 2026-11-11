.class public Lpub/devrel/easypermissions/AppSettingsDialogHolderActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public ぉざぅち〻:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

.field public ざとぅぼこ〺:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .registers 4

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    invoke-virtual {p0, p2, p3}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .registers 5

    const/4 p1, -0x1

    if-ne p2, p1, :cond_24

    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    const-string v1, "package"

    invoke-static {v1, p2, v0}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p1

    iget p2, p0, Lpub/devrel/easypermissions/AppSettingsDialogHolderActivity;->ざとぅぼこ〺:I

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/16 p2, 0x1d6e

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_2e

    :cond_24
    const/4 p1, -0x2

    if-ne p2, p1, :cond_2f

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_2e
    return-void

    :cond_2f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown button type: "

    invoke-static {v0, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 5

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "extra_app_settings"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lpub/devrel/easypermissions/AppSettingsDialog;

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p0, p1, Lpub/devrel/easypermissions/AppSettingsDialog;->ぺぁあねじ:Landroid/content/Context;

    .line 3
    iget v0, p1, Lpub/devrel/easypermissions/AppSettingsDialog;->〳ぜぞぜべっ:I

    .line 4
    iput v0, p0, Lpub/devrel/easypermissions/AppSettingsDialogHolderActivity;->ざとぅぼこ〺:I

    .line 5
    iget v0, p1, Lpub/devrel/easypermissions/AppSettingsDialog;->〺つふすそ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_23

    new-instance v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;

    invoke-direct {v1, p0, v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;-><init>(Landroid/content/Context;I)V

    goto :goto_28

    :cond_23
    new-instance v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;-><init>(Landroid/content/Context;)V

    :goto_28
    const/4 v0, 0x0

    .line 6
    iget-object v2, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/appcompat/app/AlertController$〺つふすそ;

    iput-boolean v0, v2, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぺふねづ〺:Z

    .line 7
    iget-object v0, p1, Lpub/devrel/easypermissions/AppSettingsDialog;->びぐびあび:Ljava/lang/String;

    .line 8
    iput-object v0, v2, Landroidx/appcompat/app/AlertController$〺つふすそ;->びぐびあび:Ljava/lang/CharSequence;

    .line 9
    iget-object v0, p1, Lpub/devrel/easypermissions/AppSettingsDialog;->くし〴〺ぅ:Ljava/lang/String;

    .line 10
    iput-object v0, v2, Landroidx/appcompat/app/AlertController$〺つふすそ;->なぎぱいぢぎ:Ljava/lang/CharSequence;

    .line 11
    iget-object v0, p1, Lpub/devrel/easypermissions/AppSettingsDialog;->づざかべべ:Ljava/lang/String;

    invoke-virtual {v1, v0, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;

    iget-object p1, p1, Lpub/devrel/easypermissions/AppSettingsDialog;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {v1, p1, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->〺つふすそ(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    move-result-object p1

    .line 12
    iput-object p1, p0, Lpub/devrel/easypermissions/AppSettingsDialogHolderActivity;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    return-void
.end method

.method public onDestroy()V
    .registers 2

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    iget-object v0, p0, Lpub/devrel/easypermissions/AppSettingsDialogHolderActivity;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lpub/devrel/easypermissions/AppSettingsDialogHolderActivity;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;->dismiss()V

    :cond_12
    return-void
.end method
