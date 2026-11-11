.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 7

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->ごづごきえ()Landroid/view/Menu;

    move-result-object v1

    instance-of v2, v1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    const/4 v3, 0x0

    if-eqz v2, :cond_f

    move-object v2, v1

    check-cast v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    goto :goto_10

    :cond_f
    move-object v2, v3

    :goto_10
    if-eqz v2, :cond_15

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->どぇぞほだ()V

    :cond_15
    :try_start_15
    invoke-interface {v1}, Landroid/view/Menu;->clear()V

    iget-object v4, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->くし〴〺ぅ:Landroid/view/Window$Callback;

    const/4 v5, 0x0

    invoke-interface {v4, v5, v1}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v4

    if-eqz v4, :cond_29

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->くし〴〺ぅ:Landroid/view/Window$Callback;

    invoke-interface {v0, v5, v3, v1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_2c

    :cond_29
    invoke-interface {v1}, Landroid/view/Menu;->clear()V
    :try_end_2c
    .catchall {:try_start_15 .. :try_end_2c} :catchall_32

    :cond_2c
    if-eqz v2, :cond_31

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->なぶひせが()V

    :cond_31
    return-void

    :catchall_32
    move-exception v0

    if-eqz v2, :cond_38

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->なぶひせが()V

    :cond_38
    throw v0
.end method
