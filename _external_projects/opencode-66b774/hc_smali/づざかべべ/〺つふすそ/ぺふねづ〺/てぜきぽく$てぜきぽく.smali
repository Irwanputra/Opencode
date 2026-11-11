.class public final Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$てぜきぽく;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u3066\u305c\u304d\u307d\u304f"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)Z
    .registers 4

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぺふねづ〺()Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    move-result-object v0

    if-ne p1, v0, :cond_1d

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->びえぁぜい:Z

    if-eqz v1, :cond_1d

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ち〴みぎ〻び()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-boolean v1, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇとしたべど:Z

    if-nez v1, :cond_1d

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1d
    const/4 p1, 0x1

    return p1
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Z)V
    .registers 7

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぺふねづ〺()Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    move-result-object v0

    const/4 v1, 0x1

    if-eq v0, p1, :cond_9

    const/4 v2, 0x1

    goto :goto_a

    :cond_9
    const/4 v2, 0x0

    :goto_a
    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    if-eqz v2, :cond_f

    move-object p1, v0

    :cond_f
    invoke-virtual {v3, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->げがぴうあだ(Landroid/view/Menu;)Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;

    move-result-object p1

    if-eqz p1, :cond_29

    if-eqz v2, :cond_24

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;->げつ〴ぬぐ:I

    invoke-virtual {p2, v2, p1, v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->じぜこほぱ(ILづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;Landroid/view/Menu;)V

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-virtual {p2, p1, v1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぉひのべい(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;Z)V

    goto :goto_29

    :cond_24
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぉひのべい(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;Z)V

    :cond_29
    :goto_29
    return-void
.end method
