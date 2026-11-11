.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ$げつ〴ぬぐ;
.super Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ぉざぅち〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;Landroid/content/Context;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ$げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;

    invoke-direct {p0, p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;)V
    .registers 6

    iget-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ$げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;

    iget-object v0, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->〺つふすそ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Landroid/view/View;)[I

    move-result-object p1

    const/4 p2, 0x0

    aget p2, p1, p2

    const/4 v0, 0x1

    aget p1, p1, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->なぎぱいぢぎ(I)I

    move-result v0

    if-lez v0, :cond_29

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->いいにぽつ:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p3, p2, p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->〺つふすそ(IIILandroid/view/animation/Interpolator;)V

    :cond_29
    return-void
.end method

.method public ぁごぐすすぃ(I)I
    .registers 3

    invoke-super {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぁごぐすすぃ(I)I

    move-result p1

    const/16 v0, 0x64

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public づざかべべ(Landroid/util/DisplayMetrics;)F
    .registers 3

    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr v0, p1

    return v0
.end method
