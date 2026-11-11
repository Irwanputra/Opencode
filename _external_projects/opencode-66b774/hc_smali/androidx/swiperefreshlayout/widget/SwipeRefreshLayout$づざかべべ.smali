.class public Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$づざかべべ;
.super Landroid/view/animation/Animation;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method public constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .registers 2

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$づざかべべ;->〺つふすそ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .registers 5

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$づざかべべ;->〺つふすそ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-boolean v0, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->けときぜと:Z

    if-nez v0, :cond_10

    iget v0, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇ〳〲〺すっ:I

    iget p2, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉ〲なぱぽた:I

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    sub-int/2addr v0, p2

    goto :goto_12

    :cond_10
    iget v0, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇ〳〲〺すっ:I

    :goto_12
    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$づざかべべ;->〺つふすそ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget v1, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぶでにく〼〳:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    mul-float v0, v0, p1

    float-to-int v0, v0

    add-int/2addr v1, v0

    iget-object p2, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p2}, Landroid/widget/ImageView;->getTop()I

    move-result p2

    sub-int/2addr v1, p2

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$づざかべべ;->〺つふすそ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {p2, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$づざかべべ;->〺つふすそ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object p2, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    .line 1
    iget-object p1, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 2
    iget v1, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぇぬぎばつ:F

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_39

    iput v0, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぇぬぎばつ:F

    .line 3
    :cond_39
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
