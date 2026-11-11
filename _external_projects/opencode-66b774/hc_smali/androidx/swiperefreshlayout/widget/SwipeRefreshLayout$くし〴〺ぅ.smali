.class public Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$くし〴〺ぅ;
.super Landroid/view/animation/Animation;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇぬぎばつ(II)Landroid/view/animation/Animation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:I

.field public final synthetic びぐびあび:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method public constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;II)V
    .registers 4

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$くし〴〺ぅ;->びぐびあび:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iput p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$くし〴〺ぅ;->〺つふすそ:I

    iput p3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$くし〴〺ぅ;->くし〴〺ぅ:I

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .registers 6

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$くし〴〺ぅ;->びぐびあび:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object p2, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$くし〴〺ぅ;->〺つふすそ:I

    int-to-float v1, v0

    iget v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$くし〴〺ぅ;->くし〴〺ぅ:I

    sub-int/2addr v2, v0

    int-to-float v0, v2

    mul-float v0, v0, p1

    add-float/2addr v0, v1

    float-to-int p1, v0

    invoke-virtual {p2, p1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->setAlpha(I)V

    return-void
.end method
