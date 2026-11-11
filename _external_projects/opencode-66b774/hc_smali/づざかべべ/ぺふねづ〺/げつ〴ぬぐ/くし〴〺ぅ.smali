.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/くし〴〺ぅ;
.super Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びぐびあび;
.source ""


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びぐびあび;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->ぉひのべい:Landroid/view/View;

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    return v0
.end method

.method public げつ〴ぬぐ(I)Landroid/view/View;
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->ぉひのべい:Landroid/view/View;

    if-eqz v0, :cond_b

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " does not have a view"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
