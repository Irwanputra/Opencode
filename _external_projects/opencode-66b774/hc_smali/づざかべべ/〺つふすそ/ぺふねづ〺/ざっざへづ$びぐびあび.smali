.class public final Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->くし〴〺ぅ:Landroid/view/Window$Callback;

    if-eqz v1, :cond_2b

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->げつ〴ぬぐ()Z

    move-result v0

    const/16 v1, 0x6c

    if-eqz v0, :cond_18

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->くし〴〺ぅ:Landroid/view/Window$Callback;

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_2b

    :cond_18
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->くし〴〺ぅ:Landroid/view/Window$Callback;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_2b

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->くし〴〺ぅ:Landroid/view/Window$Callback;

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_2b
    :goto_2b
    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/MenuItem;)Z
    .registers 3

    const/4 p1, 0x0

    return p1
.end method
