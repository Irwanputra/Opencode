.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

.field public げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v0, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぉざぅち〻:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_18

    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->なぎぱいぢぎ:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ざとぅぼこ〺:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_18
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v0, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_3b

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おかぷせ〱()V

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v0, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->げつ〴ぬぐ(F)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iput-object v0, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->は〲ぱなで:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->は〲ぱなで:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    new-instance v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;)V

    invoke-virtual {p1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->びぐびあび(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    :cond_3b
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v0, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぺふねづ〺/いいにぽつ;

    if-eqz v0, :cond_46

    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/いいにぽつ;->ぇぬぎばつ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V

    :cond_46
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    const/4 v0, 0x0

    iput-object v0, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->でどあくず:Landroid/view/ViewGroup;

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぷぞてのほき(Landroid/view/View;)V

    return-void
.end method

.method public くし〴〺ぅ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;Landroid/view/MenuItem;)Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-interface {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;Landroid/view/Menu;)Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->でどあくず:Landroid/view/ViewGroup;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぷぞてのほき(Landroid/view/View;)V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-interface {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;Landroid/view/Menu;)Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-interface {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
