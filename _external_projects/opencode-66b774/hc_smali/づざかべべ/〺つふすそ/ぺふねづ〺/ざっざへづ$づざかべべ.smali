.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$づざかべべ;
.super Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public final synthetic くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;Landroid/view/Window$Callback;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$づざかべべ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    invoke-direct {p0, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;-><init>(Landroid/view/Window$Callback;)V

    return-void
.end method


# virtual methods
.method public onCreatePanelView(I)Landroid/view/View;
    .registers 3

    if-nez p1, :cond_10

    new-instance p1, Landroid/view/View;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$づざかべべ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 1
    :cond_10
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2, p3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 2
    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$づざかべべ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    iget-boolean p3, p2, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->〺つふすそ:Z

    if-nez p3, :cond_18

    iget-object p2, p2, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->setMenuPrepared()V

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$づざかべべ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    const/4 p3, 0x1

    iput-boolean p3, p2, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->〺つふすそ:Z

    :cond_18
    return p1
.end method
