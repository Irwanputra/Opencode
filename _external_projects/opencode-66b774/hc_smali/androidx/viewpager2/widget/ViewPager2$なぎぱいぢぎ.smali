.class public Landroidx/viewpager2/widget/ViewPager2$なぎぱいぢぎ;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u306a\u304e\u3071\u3044\u3062\u304e"
.end annotation


# instance fields
.field public final synthetic ぉひのべい:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2;Landroid/content/Context;)V
    .registers 3

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$なぎぱいぢぎ;->ぉひのべい:Landroidx/viewpager2/widget/ViewPager2;

    const/4 p1, 0x1

    const/4 p2, 0x0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(IZ)V

    return-void
.end method


# virtual methods
.method public 〻だくけはく(Landroidx/recyclerview/widget/RecyclerView$でどあくず;[I)V
    .registers 5

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$なぎぱいぢぎ;->ぉひのべい:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getOffscreenPageLimit()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_d

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->〻だくけはく(Landroidx/recyclerview/widget/RecyclerView$でどあくず;[I)V

    return-void

    :cond_d
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$なぎぱいぢぎ;->ぉひのべい:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getPageSize()I

    move-result p1

    mul-int p1, p1, v0

    const/4 v0, 0x0

    aput p1, p2, v0

    const/4 v0, 0x1

    aput p1, p2, v0

    return-void
.end method

.method public いたぷすいだ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;ILandroid/os/Bundle;)Z
    .registers 6

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$なぎぱいぢぎ;->ぉひのべい:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->いたぷすいだ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public びがえ〱な(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .registers 6

    const/4 p1, 0x0

    return p1
.end method

.method public びちづぼぬ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V
    .registers 4

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->びちづぼぬ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$なぎぱいぢぎ;->ぉひのべい:Landroidx/viewpager2/widget/ViewPager2;

    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
