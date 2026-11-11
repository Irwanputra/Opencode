.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;
.super Landroidx/fragment/app/Fragment;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public 〱かけばぜぐ:Z

.field public 〱こか〺ぃせ:I

.field public 〴ねぷぐくぼ:Landroid/app/Dialog;

.field public かづげぃぁ〺:I

.field public ぎきぁ〱ぢ:Z

.field public くぎぶ〼のそ:Z

.field public くねねぱす〻:I

.field public ずまげせび〳:Z

.field public のね〱ばぁぢ:Ljava/lang/Runnable;

.field public はつきどっ:Z

.field public ぺがぅす〹ち:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;)V

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->のね〱ばぁぢ:Ljava/lang/Runnable;

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->くねねぱす〻:I

    iput v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〱こか〺ぃせ:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->くぎぶ〼のそ:Z

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ずまげせび〳:Z

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->かづげぃぁ〺:I

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .registers 2

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .registers 2

    iget-boolean p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->はつきどっ:Z

    if-nez p1, :cond_8

    const/4 p1, 0x1

    invoke-virtual {p0, p1, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->にぢ〱ぁな(ZZ)V

    :cond_8
    return-void
.end method

.method public 〺でおいここ()V
    .registers 3

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    .line 2
    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    if-eqz v1, :cond_1d

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->はつきどっ:Z

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    iget-boolean v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〱かけばぜぐ:Z

    if-nez v1, :cond_1b

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    invoke-virtual {p0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_1b
    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    :cond_1d
    return-void
.end method

.method public ぁないぼぎへ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;Ljava/lang/String;)V
    .registers 6

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〱かけばぜぐ:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ぎきぁ〱ぢ:Z

    check-cast p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {v2, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;)V

    .line 2
    invoke-virtual {v2, v0, p0, p2, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 3
    invoke-virtual {v2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ()I

    return-void
.end method

.method public ぇとしたべど()V
    .registers 3

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    .line 2
    iget-boolean v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ぎきぁ〱ぢ:Z

    if-nez v1, :cond_d

    iget-boolean v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〱かけばぜぐ:Z

    if-nez v1, :cond_d

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〱かけばぜぐ:Z

    :cond_d
    return-void
.end method

.method public えがぐせほち(Landroid/os/Bundle;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_f

    const-string v1, "android:savedDialogState"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_f
    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->くねねぱす〻:I

    if-eqz v0, :cond_18

    const-string v1, "android:style"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_18
    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〱こか〺ぃせ:I

    if-eqz v0, :cond_21

    const-string v1, "android:theme"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_21
    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->くぎぶ〼のそ:Z

    if-nez v0, :cond_2a

    const-string v1, "android:cancelable"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_2a
    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ずまげせび〳:Z

    if-nez v0, :cond_33

    const-string v1, "android:showsDialog"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_33
    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->かづげぃぁ〺:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3d

    const-string v1, "android:backStackId"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_3d
    return-void
.end method

.method public ぉひのべい(Landroid/content/Context;)V
    .registers 2

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->ぉひのべい(Landroid/content/Context;)V

    iget-boolean p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ぎきぁ〱ぢ:Z

    if-nez p1, :cond_a

    const/4 p1, 0x0

    iput-boolean p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〱かけばぜぐ:Z

    :cond_a
    return-void
.end method

.method public げがぴうあだ(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .registers 4

    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ずまげせび〳:Z

    if-nez v0, :cond_9

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->げがぴうあだ(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    return-object p1

    :cond_9
    invoke-virtual {p0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->しぷげへが(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    const-string v0, "layout_inflater"

    if-eqz p1, :cond_25

    iget v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->くねねぱす〻:I

    invoke-virtual {p0, p1, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->へぼ〳〻び(Landroid/app/Dialog;I)V

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    :goto_1e
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    return-object p1

    :cond_25
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 1
    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:Landroid/content/Context;

    goto :goto_1e
.end method

.method public ごまけがぢは()V
    .registers 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    .line 2
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    :cond_a
    return-void
.end method

.method public しぷげへが(Landroid/os/Bundle;)Landroid/app/Dialog;
    .registers 4

    new-instance p1, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->〱こか〺ぃせ()Landroid/content/Context;

    move-result-object v0

    .line 1
    iget v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〱こか〺ぃせ:I

    .line 2
    invoke-direct {p1, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-object p1
.end method

.method public じぜこほぱ(Landroid/os/Bundle;)V
    .registers 4

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    .line 2
    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ずまげせび〳:Z

    if-nez v0, :cond_8

    return-void

    .line 3
    :cond_8
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ぉひのべい:Landroid/view/View;

    if-eqz v0, :cond_20

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_18

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    goto :goto_20

    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "DialogFragment can not be attached to a container view"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_20
    :goto_20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->びぐびあび()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2b

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    :cond_2b
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    iget-boolean v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->くぎぶ〼のそ:Z

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    if-eqz p1, :cond_4b

    const-string v0, "android:savedDialogState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_4b

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_4b
    return-void
.end method

.method public せづっ〸ちね(Landroid/os/Bundle;)V
    .registers 5

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->せづっ〸ちね(Landroid/os/Bundle;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ぺがぅす〹ち:Landroid/os/Handler;

    iget v0, p0, Landroidx/fragment/app/Fragment;->〻ぞまぎな〻:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_12

    const/4 v0, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ずまげせび〳:Z

    if-eqz p1, :cond_42

    const-string v0, "android:style"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->くねねぱす〻:I

    const-string v0, "android:theme"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〱こか〺ぃせ:I

    const-string v0, "android:cancelable"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->くぎぶ〼のそ:Z

    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ずまげせび〳:Z

    const-string v1, "android:showsDialog"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ずまげせび〳:Z

    const/4 v0, -0x1

    const-string v1, "android:backStackId"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->かづげぃぁ〺:I

    :cond_42
    return-void
.end method

.method public にぢ〱ぁな(ZZ)V
    .registers 7

    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〱かけばぜぐ:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〱かけばぜぐ:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ぎきぁ〱ぢ:Z

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    const/4 v3, 0x0

    if-eqz v2, :cond_33

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    if-nez p2, :cond_33

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ぺがぅす〹ち:Landroid/os/Handler;

    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne p2, v2, :cond_2c

    iget-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    invoke-virtual {p0, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_33

    :cond_2c
    iget-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ぺがぅす〹ち:Landroid/os/Handler;

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->のね〱ばぁぢ:Ljava/lang/Runnable;

    invoke-virtual {p2, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_33
    :goto_33
    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->はつきどっ:Z

    iget p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->かづげぃぁ〺:I

    if-ltz p2, :cond_5b

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->くぎぶ〼のそ()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    move-result-object p1

    iget p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->かづげぃぁ〺:I

    check-cast p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    if-ltz p2, :cond_4f

    .line 1
    new-instance v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$ぺぁあねじ;

    invoke-direct {v2, p1, v3, p2, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$ぺぁあねじ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;Ljava/lang/String;II)V

    invoke-virtual {p1, v2, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ち〴みぎ〻び(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$〳ぜぞぜべっ;Z)V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->かづげぃぁ〺:I

    goto :goto_72

    .line 3
    :cond_4f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Bad id: "

    invoke-static {v0, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_5b
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->くぎぶ〼のそ()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    move-result-object p2

    check-cast p2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 5
    new-instance v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {v1, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;)V

    .line 6
    invoke-virtual {v1, p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぁごぐすすぃ(Landroidx/fragment/app/Fragment;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    if-eqz p1, :cond_6f

    .line 7
    invoke-virtual {v1, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Z)I

    goto :goto_72

    .line 8
    :cond_6f
    invoke-virtual {v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ()I

    :goto_72
    return-void
.end method

.method public ばおぢでぎか()V
    .registers 3

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    .line 2
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    if-eqz v0, :cond_d

    const/4 v1, 0x0

    iput-boolean v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->はつきどっ:Z

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_d
    return-void
.end method

.method public へぼ〳〻び(Landroid/app/Dialog;I)V
    .registers 5

    const/4 v0, 0x1

    if-eq p2, v0, :cond_13

    const/4 v1, 0x2

    if-eq p2, v1, :cond_13

    const/4 v1, 0x3

    if-eq p2, v1, :cond_a

    goto :goto_16

    :cond_a
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    const/16 v1, 0x18

    invoke-virtual {p2, v1}, Landroid/view/Window;->addFlags(I)V

    :cond_13
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    :goto_16
    return-void
.end method
