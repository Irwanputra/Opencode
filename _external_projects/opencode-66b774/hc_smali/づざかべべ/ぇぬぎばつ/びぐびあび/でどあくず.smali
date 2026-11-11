.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public くし〴〺ぅ(I)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_10

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->ぇぬぎばつ(Landroid/view/View;)V

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    :cond_10
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    return-void
.end method

.method public げつ〴ぬぐ(I)Landroid/view/View;
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
