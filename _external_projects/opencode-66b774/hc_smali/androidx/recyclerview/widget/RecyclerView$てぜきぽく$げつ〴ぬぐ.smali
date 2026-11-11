.class public Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい$〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)V
    .registers 2

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/View;)I
    .registers 4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぅみぱぎぎ(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public くし〴〺ぅ(I)Landroid/view/View;
    .registers 3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public げつ〴ぬぐ()I
    .registers 3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    .line 1
    iget v1, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぃぜぶの〸ぃ()I

    move-result v0

    sub-int/2addr v1, v0

    return v1
.end method

.method public づざかべべ(Landroid/view/View;)I
    .registers 4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉひのべい(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public びぐびあび()I
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result v0

    return v0
.end method
