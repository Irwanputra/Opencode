.class public abstract Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/くし〴〺ぅ;
.super Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "L\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3033\u305c\u305e\u305c\u3079\u3063/\u3065\u3056\u304b\u3079\u3079<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public varargs づざかべべ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II[Ljava/lang/String;)V
    .registers 12

    invoke-virtual {p0}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/くし〴〺ぅ;->なぎぱいぢぎ()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    move-result-object v0

    const-string v1, "RationaleDialogFragmentCompat"

    invoke-virtual {v0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v2

    instance-of v2, v2, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    if-eqz v2, :cond_f

    return-void

    .line 1
    :cond_f
    new-instance v2, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-direct {v2}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;-><init>()V

    .line 2
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

    .line 3
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->〱かけばぜぐ(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ()Z

    move-result p1

    if-eqz p1, :cond_41

    goto :goto_44

    :cond_41
    invoke-virtual {v2, v0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ぁないぼぎへ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;Ljava/lang/String;)V

    :goto_44
    return-void
.end method

.method public abstract なぎぱいぢぎ()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;
.end method
