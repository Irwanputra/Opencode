.class public Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/なぎぱいぢぎ;
.super Landroid/view/animation/Animation;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method public constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .registers 5

    iget-object p2, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget v0, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〻ぞまぎな〻:F

    neg-float v1, v0

    mul-float v1, v1, p1

    add-float/2addr v1, v0

    invoke-virtual {p2, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setAnimationProgress(F)V

    iget-object p2, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {p2, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺぁあねじ(F)V

    return-void
.end method
