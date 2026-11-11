.class public final Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public 〺つふすそ:Z

.field public final synthetic くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->くし〴〺ぅ:Landroid/view/Window$Callback;

    if-eqz v0, :cond_d

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    const/4 p1, 0x1

    return p1

    :cond_d
    const/4 p1, 0x0

    return p1
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Z)V
    .registers 4

    iget-boolean p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$くし〴〺ぅ;->〺つふすそ:Z

    if-eqz p2, :cond_5

    return-void

    :cond_5
    const/4 p2, 0x1

    iput-boolean p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$くし〴〺ぅ;->〺つふすそ:Z

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    iget-object p2, p2, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->なぎぱいぢぎ()V

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    iget-object p2, p2, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->くし〴〺ぅ:Landroid/view/Window$Callback;

    if-eqz p2, :cond_1a

    const/16 v0, 0x6c

    invoke-interface {p2, v0, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_1a
    const/4 p1, 0x0

    iput-boolean p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$くし〴〺ぅ;->〺つふすそ:Z

    return-void
.end method
