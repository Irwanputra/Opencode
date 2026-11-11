.class public Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;
.super Landroid/app/DialogFragment;
.source ""


# instance fields
.field public 〺つふすそ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

.field public くし〴〺ぅ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

.field public びぐびあび:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->びぐびあび:Z

    return-void
.end method


# virtual methods
.method public onAttach(Landroid/content/Context;)V
    .registers 4

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onAttach(Landroid/content/Context;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_2f

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_2f

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object v0

    instance-of v0, v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    if-eqz v0, :cond_1f

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    iput-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    :cond_1f
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object v0

    instance-of v0, v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    if-eqz v0, :cond_2f

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    iput-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    :cond_2f
    instance-of v0, p1, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    if-eqz v0, :cond_38

    move-object v0, p1

    check-cast v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    iput-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    :cond_38
    instance-of v0, p1, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    if-eqz v0, :cond_40

    check-cast p1, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    iput-object p1, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    :cond_40
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .registers 7

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/DialogFragment;->setCancelable(Z)V

    new-instance v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-direct {v0, v1}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;-><init>(Landroid/os/Bundle;)V

    new-instance v1, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;

    iget-object v2, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    iget-object v3, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    invoke-direct {v1, p0, v0, v2, v3}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;-><init>(Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;)V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    .line 1
    iget v3, v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    if-lez v3, :cond_26

    new-instance v3, Landroid/app/AlertDialog$Builder;

    iget v4, v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    invoke-direct {v3, v2, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    goto :goto_2b

    :cond_26
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    :goto_2b
    invoke-virtual {v3, p1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    iget-object v2, v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    iget-object v2, v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    iget-object v0, v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->づざかべべ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public onDetach()V
    .registers 2

    invoke-super {p0}, Landroid/app/DialogFragment;->onDetach()V

    const/4 v0, 0x0

    iput-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->びぐびあび:Z

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method
