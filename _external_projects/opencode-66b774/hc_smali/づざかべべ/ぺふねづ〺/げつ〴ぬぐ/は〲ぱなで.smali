.class public final Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〳ぜぞぜべっ:Landroid/graphics/Rect;

.field public final synthetic 〺つふすそ:Landroidx/fragment/app/Fragment;

.field public final synthetic ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;

.field public final synthetic くし〴〺ぅ:Landroidx/fragment/app/Fragment;

.field public final synthetic づざかべべ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

.field public final synthetic なぎぱいぢぎ:Landroid/view/View;

.field public final synthetic びぐびあび:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLづざかべべ/づざかべべ/げつ〴ぬぐ;Landroid/view/View;Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;Landroid/graphics/Rect;)V
    .registers 8

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->〺つふすそ:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->くし〴〺ぅ:Landroidx/fragment/app/Fragment;

    iput-boolean p3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->びぐびあび:Z

    iput-object p4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->づざかべべ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    iput-object p5, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->なぎぱいぢぎ:Landroid/view/View;

    iput-object p6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;

    iput-object p7, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->〳ぜぞぜべっ:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 6

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->〺つふすそ:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->くし〴〺ぅ:Landroidx/fragment/app/Fragment;

    iget-boolean v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->びぐびあび:Z

    iget-object v3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->づざかべべ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ざっざへづ;->くし〴〺ぅ(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLづざかべべ/づざかべべ/げつ〴ぬぐ;Z)V

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->なぎぱいぢぎ:Landroid/view/View;

    if-eqz v0, :cond_17

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/は〲ぱなで;->〳ぜぞぜべっ:Landroid/graphics/Rect;

    invoke-virtual {v1, v0, v2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;->いいにぽつ(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_17
    return-void
.end method
