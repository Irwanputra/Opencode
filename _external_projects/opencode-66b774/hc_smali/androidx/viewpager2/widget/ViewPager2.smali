.class public final Landroidx/viewpager2/widget/ViewPager2;
.super Landroid/view/ViewGroup;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/viewpager2/widget/ViewPager2$づざかべべ;,
        Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;,
        Landroidx/viewpager2/widget/ViewPager2$びぐびあび;,
        Landroidx/viewpager2/widget/ViewPager2$ぺぁあねじ;,
        Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;,
        Landroidx/viewpager2/widget/ViewPager2$てぜきぽく;,
        Landroidx/viewpager2/widget/ViewPager2$いいにぽつ;,
        Landroidx/viewpager2/widget/ViewPager2$なぎぱいぢぎ;,
        Landroidx/viewpager2/widget/ViewPager2$ぺふねづ〺;,
        Landroidx/viewpager2/widget/ViewPager2$SavedState;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Landroidx/recyclerview/widget/LinearLayoutManager;

.field public final 〺つふすそ:Landroid/graphics/Rect;

.field public ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$なぎぱいぢぎ;

.field public いいにぽつ:Landroid/os/Parcelable;

.field public ぇぬぎばつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/づざかべべ;

.field public ぉざぅち〻:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

.field public おぐぴう〸ず:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/びぐびあび;

.field public final くし〴〺ぅ:Landroid/graphics/Rect;

.field public ごづごきえ:I

.field public ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

.field public ざとぅぼこ〺:Z

.field public づざかべべ:I

.field public てぜきぽく:Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;

.field public なぎぱいぢぎ:Z

.field public のぷのちつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;

.field public は〲ぱなで:Z

.field public びぐびあび:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

.field public へぬ〴づぞ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

.field public ぺぁあねじ:I

.field public ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 5

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->〺つふすそ:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->くし〴〺ぅ:Landroid/graphics/Rect;

    new-instance v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;-><init>(I)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->びぐびあび:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->なぎぱいぢぎ:Z

    new-instance v1, Landroidx/viewpager2/widget/ViewPager2$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Landroidx/viewpager2/widget/ViewPager2$げつ〴ぬぐ;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$なぎぱいぢぎ;

    const/4 v1, -0x1

    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺぁあねじ:I

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->ぉざぅち〻:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざとぅぼこ〺:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->は〲ぱなで:Z

    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ごづごきえ:I

    invoke-virtual {p0, p1, v2}, Landroidx/viewpager2/widget/ViewPager2;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->〺つふすそ:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->くし〴〺ぅ:Landroid/graphics/Rect;

    new-instance v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;-><init>(I)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->びぐびあび:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->なぎぱいぢぎ:Z

    new-instance v1, Landroidx/viewpager2/widget/ViewPager2$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Landroidx/viewpager2/widget/ViewPager2$げつ〴ぬぐ;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$なぎぱいぢぎ;

    const/4 v1, -0x1

    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺぁあねじ:I

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->ぉざぅち〻:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざとぅぼこ〺:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->は〲ぱなで:Z

    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ごづごきえ:I

    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->〺つふすそ:Landroid/graphics/Rect;

    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->くし〴〺ぅ:Landroid/graphics/Rect;

    new-instance p3, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    const/4 v0, 0x3

    invoke-direct {p3, v0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;-><init>(I)V

    iput-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->びぐびあび:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    const/4 p3, 0x0

    iput-boolean p3, p0, Landroidx/viewpager2/widget/ViewPager2;->なぎぱいぢぎ:Z

    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Landroidx/viewpager2/widget/ViewPager2$げつ〴ぬぐ;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$なぎぱいぢぎ;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺぁあねじ:I

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぉざぅち〻:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    iput-boolean p3, p0, Landroidx/viewpager2/widget/ViewPager2;->ざとぅぼこ〺:Z

    const/4 p3, 0x1

    iput-boolean p3, p0, Landroidx/viewpager2/widget/ViewPager2;->は〲ぱなで:Z

    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ごづごきえ:I

    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public canScrollHorizontally(I)Z
    .registers 3

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result p1

    return p1
.end method

.method public canScrollVertically(I)Z
    .registers 3

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result p1

    return p1
.end method

.method public dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    instance-of v1, v0, Landroidx/viewpager2/widget/ViewPager2$SavedState;

    if-eqz v1, :cond_22

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2$SavedState;

    iget v0, v0, Landroidx/viewpager2/widget/ViewPager2$SavedState;->〺つふすそ:I

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getId()I

    move-result v1

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->remove(I)V

    :cond_22
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchRestoreInstanceState(Landroid/util/SparseArray;)V

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->くし〴〺ぅ()V

    return-void
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "androidx.viewpager.widget.ViewPager"

    return-object v0
.end method

.method public getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;
    .registers 2

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentItem()I
    .registers 2

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    return v0
.end method

.method public getItemDecorationCount()I
    .registers 2

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    return v0
.end method

.method public getOffscreenPageLimit()I
    .registers 2

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ごづごきえ:I

    return v0
.end method

.method public getOrientation()I
    .registers 2

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1
    iget v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    return v0
.end method

.method public getPageSize()I
    .registers 4

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    move-result v1

    if-nez v1, :cond_16

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v0

    goto :goto_23

    :cond_16
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v0

    :goto_23
    sub-int/2addr v1, v0

    return v1
.end method

.method public getScrollState()I
    .registers 2

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->のぷのちつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;

    .line 1
    iget v0, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    return v0
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 7

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    .line 1
    iget-object v1, v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_31

    iget-object v1, v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    move-result v1

    if-ne v1, v2, :cond_24

    iget-object v1, v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v1

    goto :goto_32

    :cond_24
    iget-object v1, v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v1

    move v4, v1

    const/4 v1, 0x0

    goto :goto_33

    :cond_31
    const/4 v1, 0x0

    :goto_32
    const/4 v4, 0x0

    :goto_33
    invoke-static {v1, v4, v3, v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$〺つふすそ;->げつ〴ぬぐ(IIZI)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$〺つふすそ;

    move-result-object v1

    .line 2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x13

    if-lt v3, v4, :cond_44

    iget-object v1, v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$〺つふすそ;->げつ〴ぬぐ:Ljava/lang/Object;

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    :cond_44
    const/16 v1, 0x10

    if-lt v3, v1, :cond_76

    .line 3
    iget-object v1, v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v1

    if-nez v1, :cond_51

    goto :goto_76

    :cond_51
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v1

    if-eqz v1, :cond_76

    iget-object v3, v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    .line 4
    iget-boolean v4, v3, Landroidx/viewpager2/widget/ViewPager2;->は〲ぱなで:Z

    if-nez v4, :cond_5e

    goto :goto_76

    .line 5
    :cond_5e
    iget v3, v3, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    if-lez v3, :cond_67

    const/16 v3, 0x2000

    invoke-virtual {p1, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_67
    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    iget v0, v0, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_73

    const/16 v0, 0x1000

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_73
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    :cond_76
    :goto_76
    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 9

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result p1

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v0

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->〺つふすそ:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    iput v2, v1, Landroid/graphics/Rect;->left:I

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->〺つふすそ:Landroid/graphics/Rect;

    sub-int/2addr p4, p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result p2

    sub-int/2addr p4, p2

    iput p4, v1, Landroid/graphics/Rect;->right:I

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->〺つふすそ:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p4

    iput p4, p2, Landroid/graphics/Rect;->top:I

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->〺つふすそ:Landroid/graphics/Rect;

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p5, p3

    iput p5, p2, Landroid/graphics/Rect;->bottom:I

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->〺つふすそ:Landroid/graphics/Rect;

    iget-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->くし〴〺ぅ:Landroid/graphics/Rect;

    const p4, 0x800033

    invoke-static {p4, p1, v0, p2, p3}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->くし〴〺ぅ:Landroid/graphics/Rect;

    iget p3, p2, Landroid/graphics/Rect;->left:I

    iget p4, p2, Landroid/graphics/Rect;->top:I

    iget p5, p2, Landroid/graphics/Rect;->right:I

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, p3, p4, p5, p2}, Landroid/view/ViewGroup;->layout(IIII)V

    iget-boolean p1, p0, Landroidx/viewpager2/widget/ViewPager2;->なぎぱいぢぎ:Z

    if-eqz p1, :cond_50

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ()V

    :cond_50
    return-void
.end method

.method public onMeasure(II)V
    .registers 8

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, v0, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v1

    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getMeasuredState()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v4, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, v0

    add-int/2addr v3, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, p1, v2}, Landroid/view/ViewGroup;->resolveSizeAndState(III)I

    move-result p1

    shl-int/lit8 v0, v2, 0x10

    invoke-static {v1, p2, v0}, Landroid/view/ViewGroup;->resolveSizeAndState(III)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    instance-of v0, p1, Landroidx/viewpager2/widget/ViewPager2$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2$SavedState;

    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget v0, p1, Landroidx/viewpager2/widget/ViewPager2$SavedState;->くし〴〺ぅ:I

    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺぁあねじ:I

    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2$SavedState;->びぐびあび:Landroid/os/Parcelable;

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->いいにぽつ:Landroid/os/Parcelable;

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 4

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Landroidx/viewpager2/widget/ViewPager2$SavedState;

    invoke-direct {v1, v0}, Landroidx/viewpager2/widget/ViewPager2$SavedState;-><init>(Landroid/os/Parcelable;)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getId()I

    move-result v0

    iput v0, v1, Landroidx/viewpager2/widget/ViewPager2$SavedState;->〺つふすそ:I

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺぁあねじ:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_18

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    :cond_18
    iput v0, v1, Landroidx/viewpager2/widget/ViewPager2$SavedState;->くし〴〺ぅ:I

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->いいにぽつ:Landroid/os/Parcelable;

    if-eqz v0, :cond_21

    :goto_1e
    iput-object v0, v1, Landroidx/viewpager2/widget/ViewPager2$SavedState;->びぐびあび:Landroid/os/Parcelable;

    goto :goto_32

    :cond_21
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v0

    instance-of v2, v0, Lづざかべべ/ぶでにく〼〳/〺つふすそ/げつ〴ぬぐ;

    if-eqz v2, :cond_32

    check-cast v0, Lづざかべべ/ぶでにく〼〳/〺つふすそ/げつ〴ぬぐ;

    invoke-interface {v0}, Lづざかべべ/ぶでにく〼〳/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ()Landroid/os/Parcelable;

    move-result-object v0

    goto :goto_1e

    :cond_32
    :goto_32
    return-object v1
.end method

.method public onViewAdded(Landroid/view/View;)V
    .registers 4

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " does not support direct child views"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .registers 8

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x1000

    const/16 v3, 0x2000

    if-eq p1, v3, :cond_14

    if-ne p1, v2, :cond_12

    goto :goto_14

    :cond_12
    const/4 v4, 0x0

    goto :goto_15

    :cond_14
    :goto_14
    const/4 v4, 0x1

    :goto_15
    if-eqz v4, :cond_40

    .line 2
    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    check-cast p2, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq p1, v3, :cond_22

    if-ne p1, v2, :cond_23

    :cond_22
    const/4 v0, 0x1

    :cond_23
    if-eqz v0, :cond_3a

    if-ne p1, v3, :cond_2f

    iget-object p1, p2, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result p1

    sub-int/2addr p1, v1

    goto :goto_36

    :cond_2f
    iget-object p1, p2, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result p1

    add-int/2addr p1, v1

    :goto_36
    invoke-virtual {p2, p1}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->くし〴〺ぅ(I)V

    return v1

    :cond_3a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 4
    :cond_40
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public setAdapter(Landroidx/recyclerview/widget/RecyclerView$びぐびあび;)V
    .registers 5

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v0

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    check-cast v1, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    .line 1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v0, :cond_16

    iget-object v1, v1, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$なぎぱいぢぎ;

    .line 2
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$づざかべべ;

    invoke-virtual {v2, v1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    :cond_16
    if-eqz v0, :cond_1f

    .line 3
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$なぎぱいぢぎ;

    .line 4
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$づざかべべ;

    invoke-virtual {v0, v1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    .line 5
    :cond_1f
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$びぐびあび;)V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->くし〴〺ぅ()V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    .line 6
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび()V

    if-eqz p1, :cond_3a

    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$なぎぱいぢぎ;

    .line 7
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$づざかべべ;

    invoke-virtual {v1, v0}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    :cond_3a
    if-eqz p1, :cond_43

    .line 8
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$なぎぱいぢぎ;

    .line 9
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$づざかべべ;

    invoke-virtual {p1, v0}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    :cond_43
    return-void
.end method

.method public setCurrentItem(I)V
    .registers 3

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    return-void
.end method

.method public setCurrentItem(IZ)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->おぐぴう〸ず:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/びぐびあび;

    .line 2
    iget-object v0, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/びぐびあび;->げつ〴ぬぐ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;

    .line 3
    iget-boolean v0, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->のぷのちつ:Z

    if-nez v0, :cond_c

    .line 4
    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->びぐびあび(IZ)V

    return-void

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot change current item when ViewPager2 is fake dragging"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLayoutDirection(I)V
    .registers 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setLayoutDirection(I)V

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    check-cast p1, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    .line 1
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび()V

    return-void
.end method

.method public setOffscreenPageLimit(I)V
    .registers 3

    const/4 v0, 0x1

    if-ge p1, v0, :cond_f

    const/4 v0, -0x1

    if-ne p1, v0, :cond_7

    goto :goto_f

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    :goto_f
    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ごづごきえ:I

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public setOrientation(I)V
    .registers 3

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ほ〱たうえの(I)V

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    check-cast p1, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    .line 1
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび()V

    return-void
.end method

.method public setPageTransformer(Landroidx/viewpager2/widget/ViewPager2$ぺぁあねじ;)V
    .registers 6

    iget-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざとぅぼこ〺:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_18

    if-nez v0, :cond_12

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    move-result-object v0

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぉざぅち〻:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざとぅぼこ〺:Z

    :cond_12
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;)V

    goto :goto_26

    :cond_18
    if-eqz v0, :cond_26

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->ぉざぅち〻:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;)V

    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぉざぅち〻:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざとぅぼこ〺:Z

    :cond_26
    :goto_26
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぇぬぎばつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/づざかべべ;

    .line 1
    iget-object v1, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/づざかべべ;->〺つふすそ:Landroidx/viewpager2/widget/ViewPager2$ぺぁあねじ;

    if-ne p1, v1, :cond_2d

    return-void

    .line 2
    :cond_2d
    iput-object p1, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/づざかべべ;->〺つふすそ:Landroidx/viewpager2/widget/ViewPager2$ぺぁあねじ;

    if-nez p1, :cond_32

    goto :goto_75

    .line 3
    :cond_32
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->のぷのちつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;

    .line 4
    invoke-virtual {p1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ()V

    iget-object p1, p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    iget v0, p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    int-to-double v0, v0

    iget p1, p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:F

    float-to-double v2, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v0, v2

    double-to-int p1, v0

    int-to-double v2, p1

    .line 5
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v0, v2

    double-to-float v0, v0

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getPageSize()I

    move-result v1

    int-to-float v1, v1

    mul-float v1, v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->ぇぬぎばつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/づざかべべ;

    invoke-virtual {v2, p1, v0, v1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/づざかべべ;->〺つふすそ(IFI)V

    :goto_75
    return-void
.end method

.method public setUserInputEnabled(Z)V
    .registers 4

    iput-boolean p1, p0, Landroidx/viewpager2/widget/ViewPager2;->は〲ぱなで:Z

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    check-cast p1, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    .line 1
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_16

    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    const/16 v0, 0x800

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    :cond_16
    return-void
.end method

.method public 〺つふすそ()Z
    .registers 3

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->おかぷせ〱()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_a

    goto :goto_b

    :cond_a
    const/4 v1, 0x0

    :goto_b
    return v1
.end method

.method public final くし〴〺ぅ()V
    .registers 5

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺぁあねじ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_6

    return-void

    :cond_6
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v0

    if-nez v0, :cond_d

    return-void

    :cond_d
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->いいにぽつ:Landroid/os/Parcelable;

    if-eqz v2, :cond_1e

    instance-of v3, v0, Lづざかべべ/ぶでにく〼〳/〺つふすそ/げつ〴ぬぐ;

    if-eqz v3, :cond_1b

    move-object v3, v0

    check-cast v3, Lづざかべべ/ぶでにく〼〳/〺つふすそ/げつ〴ぬぐ;

    invoke-interface {v3, v2}, Lづざかべべ/ぶでにく〼〳/〺つふすそ/げつ〴ぬぐ;->〺つふすそ(Landroid/os/Parcelable;)V

    :cond_1b
    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->いいにぽつ:Landroid/os/Parcelable;

    :cond_1e
    const/4 v2, 0x0

    iget v3, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺぁあねじ:I

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺぁあねじ:I

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->きぬどぼみ〸(I)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    .line 1
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび()V

    return-void
.end method

.method public final げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 12

    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    invoke-direct {v0, p0}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$ぺふねづ〺;

    invoke-direct {v0, p0, p1}, Landroidx/viewpager2/widget/ViewPager2$ぺふねづ〺;-><init>(Landroidx/viewpager2/widget/ViewPager2;Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->なぎぱいぢぎ()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setId(I)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    const/high16 v1, 0x20000

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$なぎぱいぢぎ;

    invoke-direct {v0, p0, p1}, Landroidx/viewpager2/widget/ViewPager2$なぎぱいぢぎ;-><init>(Landroidx/viewpager2/widget/ViewPager2;Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollingTouchSlop(I)V

    .line 1
    sget-object v4, Lづざかべべ/ぶでにく〼〳/げつ〴ぬぐ;->ViewPager2:[I

    invoke-virtual {p1, p2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_43

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, v0

    invoke-virtual/range {v2 .. v8}, Landroid/view/ViewGroup;->saveAttributeDataForStyleable(Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :cond_43
    :try_start_43
    sget p1, Lづざかべべ/ぶでにく〼〳/げつ〴ぬぐ;->ViewPager2_android_orientation:I

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setOrientation(I)V
    :try_end_4d
    .catchall {:try_start_43 .. :try_end_4d} :catchall_e3

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 2
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    new-instance v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/ぁごぐすすぃ;

    invoke-direct {v0, p0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/ぁごぐすすぃ;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    .line 4
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView;->なぶひせが:Ljava/util/List;

    if-nez v1, :cond_6d

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p1, Landroidx/recyclerview/widget/RecyclerView;->なぶひせが:Ljava/util/List;

    :cond_6d
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->なぶひせが:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;

    invoke-direct {p1, p0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->のぷのちつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;

    new-instance v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/びぐびあび;

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {v0, p0, p1, v1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/びぐびあび;-><init>(Landroidx/viewpager2/widget/ViewPager2;Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->おぐぴう〸ず:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/びぐびあび;

    new-instance p1, Landroidx/viewpager2/widget/ViewPager2$いいにぽつ;

    invoke-direct {p1, p0}, Landroidx/viewpager2/widget/ViewPager2$いいにぽつ;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->てぜきぽく:Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->のぷのちつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->〳ぜぞぜべっ(Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;)V

    new-instance p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;-><init>(I)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->へぬ〴づぞ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->のぷのちつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;

    .line 6
    iput-object p1, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;

    .line 7
    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$〺つふすそ;

    invoke-direct {v0, p0}, Landroidx/viewpager2/widget/ViewPager2$〺つふすそ;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    new-instance v1, Landroidx/viewpager2/widget/ViewPager2$くし〴〺ぅ;

    invoke-direct {v1, p0}, Landroidx/viewpager2/widget/ViewPager2$くし〴〺ぅ;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    .line 8
    iget-object p1, p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->へぬ〴づぞ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    .line 10
    iget-object p1, p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->へぬ〴づぞ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0, v1}, Landroidx/viewpager2/widget/ViewPager2$びぐびあび;->げつ〴ぬぐ(Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->へぬ〴づぞ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->びぐびあび:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    .line 12
    iget-object p1, p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    new-instance p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/づざかべべ;

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p1, v0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/づざかべべ;-><init>(Landroidx/recyclerview/widget/LinearLayoutManager;)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぇぬぎばつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/づざかべべ;

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->へぬ〴づぞ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    .line 14
    iget-object v0, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Landroid/view/ViewGroup;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    :catchall_e3
    move-exception p1

    .line 16
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public づざかべべ()V
    .registers 3

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->てぜきぽく:Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;

    if-eqz v0, :cond_26

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->びぐびあび(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_d

    return-void

    :cond_d
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v0

    iget v1, p0, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    if-eq v0, v1, :cond_22

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getScrollState()I

    move-result v1

    if-nez v1, :cond_22

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->へぬ〴づぞ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;

    invoke-virtual {v1, v0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;->くし〴〺ぅ(I)V

    :cond_22
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->なぎぱいぢぎ:Z

    return-void

    :cond_26
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Design assumption violated."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public びぐびあび(IZ)V
    .registers 12

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_13

    iget p2, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺぁあねじ:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_12

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺぁあねじ:I

    :cond_12
    return-void

    :cond_13
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v2

    if-gtz v2, :cond_1a

    return-void

    :cond_1a
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    if-ne p1, v0, :cond_38

    iget-object v3, p0, Landroidx/viewpager2/widget/ViewPager2;->のぷのちつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;

    .line 1
    iget v3, v3, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    if-nez v3, :cond_34

    const/4 v3, 0x1

    goto :goto_35

    :cond_34
    const/4 v3, 0x0

    :goto_35
    if-eqz v3, :cond_38

    return-void

    :cond_38
    if-ne p1, v0, :cond_3d

    if-eqz p2, :cond_3d

    return-void

    :cond_3d
    int-to-double v3, v0

    .line 2
    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    .line 3
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび()V

    .line 4
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->のぷのちつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;

    .line 5
    iget v5, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    if-nez v5, :cond_4f

    const/4 v5, 0x1

    goto :goto_50

    :cond_4f
    const/4 v5, 0x0

    :goto_50
    if-nez v5, :cond_70

    .line 6
    invoke-virtual {v0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ()V

    iget-object v0, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    iget v3, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    int-to-double v3, v3

    iget v0, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:F

    float-to-double v5, v0

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v3, v5

    .line 7
    :cond_70
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->のぷのちつ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;

    const/4 v5, 0x2

    if-eqz p2, :cond_77

    const/4 v6, 0x2

    goto :goto_78

    :cond_77
    const/4 v6, 0x3

    .line 8
    :goto_78
    iput v6, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ:I

    iput-boolean v1, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->のぷのちつ:Z

    iget v6, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぺぁあねじ:I

    if-eq v6, p1, :cond_81

    const/4 v1, 0x1

    :cond_81
    iput p1, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぺぁあねじ:I

    invoke-virtual {v0, v5}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび(I)V

    if-eqz v1, :cond_8f

    .line 9
    iget-object v0, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;

    if-eqz v0, :cond_8f

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;->くし〴〺ぅ(I)V

    :cond_8f
    if-nez p2, :cond_97

    .line 10
    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->きぬどぼみ〸(I)V

    return-void

    :cond_97
    int-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v5, v0, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    move-result-wide v5

    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    cmpl-double p2, v5, v7

    if-lez p2, :cond_c3

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    cmpl-double v2, v0, v3

    if-lez v2, :cond_b3

    add-int/lit8 v0, p1, -0x3

    goto :goto_b5

    :cond_b3
    add-int/lit8 v0, p1, 0x3

    :goto_b5
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->きぬどぼみ〸(I)V

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$てぜきぽく;

    invoke-direct {v0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2$てぜきぽく;-><init>(ILandroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    goto :goto_c8

    :cond_c3
    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->びちづぼぬ(I)V

    :goto_c8
    return-void
.end method
