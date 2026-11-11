.class public Landroidx/appcompat/widget/ActionMenuView$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionMenuView;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ぶでにく〼〳:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;

    if-eqz v0, :cond_9

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V

    :cond_9
    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/MenuItem;)Z
    .registers 4

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->なぶひせが:Landroidx/appcompat/widget/ActionMenuView$びぐびあび;

    const/4 v0, 0x0

    if-eqz p1, :cond_1e

    check-cast p1, Landroidx/appcompat/widget/Toolbar$げつ〴ぬぐ;

    .line 1
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->せづっ〸ちね:Landroidx/appcompat/widget/Toolbar$づざかべべ;

    if-eqz p1, :cond_1a

    check-cast p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$〺つふすそ;

    .line 2
    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->くし〴〺ぅ:Landroid/view/Window$Callback;

    invoke-interface {p1, v0, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    goto :goto_1b

    :cond_1a
    const/4 p1, 0x0

    :goto_1b
    if-eqz p1, :cond_1e

    const/4 v0, 0x1

    :cond_1e
    return v0
.end method
