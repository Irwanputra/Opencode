.class public Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:I

.field public づざかべべ:Landroid/view/animation/Interpolator;

.field public なぎぱいぢぎ:Z

.field public びぐびあび:I


# direct methods
.method public constructor <init>(II)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->びぐびあび:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->ぁごぐすすぃ:I

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->〺つふすそ:I

    const/high16 p1, -0x80000000

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->くし〴〺ぅ:I

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->づざかべべ:Landroid/view/animation/Interpolator;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(IIILandroid/view/animation/Interpolator;)V
    .registers 5

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->〺つふすそ:I

    iput p3, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->くし〴〺ぅ:I

    iput-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->づざかべべ:Landroid/view/animation/Interpolator;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    return-void
.end method

.method public げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 8

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->びぐびあび:I

    const/4 v1, 0x0

    if-ltz v0, :cond_e

    const/4 v2, -0x1

    iput v2, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->びぐびあび:I

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->ぃぜぶの〸ぃ(I)V

    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    return-void

    :cond_e
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_41

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->づざかべべ:Landroid/view/animation/Interpolator;

    const/4 v2, 0x1

    if-eqz v0, :cond_24

    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-lt v3, v2, :cond_1c

    goto :goto_24

    :cond_1c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "If you provide an interpolator, you must set a positive duration"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_24
    :goto_24
    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-lt v3, v2, :cond_39

    .line 2
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->くぎぶ〼のそ:Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;

    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    iget v5, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {p1, v4, v5, v3, v0}, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->〺つふすそ(IIILandroid/view/animation/Interpolator;)V

    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->ぁごぐすすぃ:I

    add-int/2addr p1, v2

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->ぁごぐすすぃ:I

    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    goto :goto_43

    .line 3
    :cond_39
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Scroll duration must be a positive number"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_41
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->ぁごぐすすぃ:I

    :goto_43
    return-void
.end method
