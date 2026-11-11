.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ;
.super Landroidx/recyclerview/widget/RecyclerView$ぺふねづ〺;
.source ""


# instance fields
.field public げつ〴ぬぐ:I


# direct methods
.method public constructor <init>(IIZ)V
    .registers 4

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ぺふねづ〺;-><init>()V

    iput p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ;->げつ〴ぬぐ:I

    return-void
.end method


# virtual methods
.method public びぐびあび(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 7

    .line 1
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object p2

    if-eqz p2, :cond_b

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->づざかべべ()I

    move-result p2

    goto :goto_c

    :cond_b
    const/4 p2, -0x1

    :goto_c
    const/4 p3, 0x2

    .line 2
    rem-int/lit8 p4, p2, 0x2

    iget v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ;->げつ〴ぬぐ:I

    mul-int v1, p4, v0

    div-int/2addr v1, p3

    iput v1, p1, Landroid/graphics/Rect;->left:I

    add-int/lit8 p4, p4, 0x1

    mul-int p4, p4, v0

    div-int/2addr p4, p3

    sub-int p4, v0, p4

    iput p4, p1, Landroid/graphics/Rect;->right:I

    if-lt p2, p3, :cond_23

    iput v0, p1, Landroid/graphics/Rect;->top:I

    :cond_23
    return-void
.end method
