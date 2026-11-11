.class public Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method public constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .registers 2

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .registers 4

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-boolean v0, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび:Z

    if-eqz v0, :cond_38

    iget-object p1, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->setAlpha(I)V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object p1, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    invoke-virtual {p1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->start()V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-boolean v0, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->せづっ〸ちね:Z

    if-eqz v0, :cond_2d

    iget-object p1, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->くし〴〺ぅ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$〳ぜぞぜべっ;

    if-eqz p1, :cond_2d

    check-cast p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ$〺つふすそ;

    .line 1
    iget-object v0, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;

    .line 2
    iget-object v0, v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;->くぎぶ〼のそ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    iget-object p1, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;

    .line 4
    invoke-virtual {p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;->へ〱そかのず()V

    .line 5
    :cond_2d
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object v0, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTop()I

    move-result v0

    iput v0, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ:I

    goto :goto_3b

    :cond_38
    invoke-virtual {p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ()V

    :goto_3b
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method
