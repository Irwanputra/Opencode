.class public Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;
.super Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3033\u305c\u305e\u305c\u3079\u3063/\u3065\u3056\u304b\u3079\u3079<",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .registers 2

    invoke-direct {p0, p1}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Landroid/content/Context;
    .registers 2

    .line 1
    iget-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 2
    check-cast v0, Landroid/content/Context;

    return-object v0
.end method

.method public varargs げつ〴ぬぐ(I[Ljava/lang/String;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 2
    check-cast v0, Landroid/app/Activity;

    invoke-static {v0, p2, p1}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ;->びぐびあび(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void
.end method

.method public varargs づざかべべ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II[Ljava/lang/String;)V
    .registers 12

    .line 1
    iget-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 2
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "RationaleDialogFragment"

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v2

    instance-of v2, v2, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;

    if-eqz v2, :cond_13

    return-void

    .line 3
    :cond_13
    new-instance v2, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;

    invoke-direct {v2}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;-><init>()V

    .line 4
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "positiveButton"

    invoke-virtual {v3, v4, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "negativeButton"

    invoke-virtual {v3, p2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "rationaleMsg"

    invoke-virtual {v3, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "theme"

    invoke-virtual {v3, p1, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "requestCode"

    invoke-virtual {v3, p1, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "permissions"

    invoke-virtual {v3, p1, p6}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 5
    invoke-virtual {v2, v3}, Landroid/app/DialogFragment;->setArguments(Landroid/os/Bundle;)V

    .line 6
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1a

    if-lt p1, p2, :cond_4b

    invoke-virtual {v0}, Landroid/app/FragmentManager;->isStateSaved()Z

    move-result p1

    if-eqz p1, :cond_4b

    goto :goto_53

    :cond_4b
    iget-boolean p1, v2, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->びぐびあび:Z

    if-eqz p1, :cond_50

    goto :goto_53

    :cond_50
    invoke-virtual {v2, v0, v1}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    :goto_53
    return-void
.end method

.method public びぐびあび(Ljava/lang/String;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 2
    check-cast v0, Landroid/app/Activity;

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ;->づざかべべ(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
