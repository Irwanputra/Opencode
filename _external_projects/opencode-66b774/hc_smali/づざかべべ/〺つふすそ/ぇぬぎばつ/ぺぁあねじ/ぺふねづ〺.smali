.class public abstract Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぇぬぎばつ;
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public 〺つふすそ:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static おぐぴう〸ず(Landroid/widget/ListAdapter;Landroid/view/ViewGroup;Landroid/content/Context;I)I
    .registers 13

    const/4 p1, 0x0

    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    check-cast p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->getCount()I

    move-result v2

    const/4 v3, 0x0

    move-object v6, v3

    move-object v7, v6

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_14
    if-ge p1, v2, :cond_39

    invoke-interface {p0, p1}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v8

    if-eq v8, v5, :cond_1e

    move-object v7, v3

    move v5, v8

    :cond_1e
    if-nez v6, :cond_25

    new-instance v6, Landroid/widget/FrameLayout;

    invoke-direct {v6, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    :cond_25
    invoke-interface {p0, p1, v7, v6}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7, v0, v1}, Landroid/view/View;->measure(II)V

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    if-lt v8, p3, :cond_33

    return p3

    :cond_33
    if-le v8, v4, :cond_36

    move v4, v8

    :cond_36
    add-int/lit8 p1, p1, 0x1

    goto :goto_14

    :cond_39
    return v4
.end method

.method public static ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)Z
    .registers 6

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v0, :cond_1d

    invoke-virtual {p0, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/MenuItem;->isVisible()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-interface {v3}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1a

    const/4 v1, 0x1

    goto :goto_1d

    :cond_1a
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_1d
    :goto_1d
    return v1
.end method


# virtual methods
.method public getId()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object p1

    check-cast p1, Landroid/widget/ListAdapter;

    .line 1
    instance-of p2, p1, Landroid/widget/HeaderViewListAdapter;

    if-eqz p2, :cond_14

    move-object p2, p1

    check-cast p2, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {p2}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object p2

    check-cast p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;

    goto :goto_17

    :cond_14
    move-object p2, p1

    check-cast p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;

    .line 2
    :goto_17
    iget-object p2, p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {p1, p3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/MenuItem;

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->へぬ〴づぞ()Z

    move-result p3

    if-eqz p3, :cond_27

    const/4 p3, 0x0

    goto :goto_28

    :cond_27
    const/4 p3, 0x4

    :goto_28
    invoke-virtual {p2, p1, p0, p3}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで(Landroid/view/MenuItem;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;I)Z

    return-void
.end method

.method public いいにぽつ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)Z
    .registers 3

    const/4 p1, 0x0

    return p1
.end method

.method public abstract ぇぬぎばつ(Landroid/view/View;)V
.end method

.method public abstract ぉざぅち〻(Z)V
.end method

.method public くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 3

    return-void
.end method

.method public abstract ごづごきえ(Landroid/widget/PopupWindow$OnDismissListener;)V
.end method

.method public abstract ざっざへづ(Z)V
.end method

.method public abstract ざとぅぼこ〺(I)V
.end method

.method public abstract でどあくず(I)V
.end method

.method public abstract のぷのちつ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
.end method

.method public abstract は〲ぱなで(I)V
.end method

.method public へぬ〴づぞ()Z
    .registers 2

    const/4 v0, 0x1

    return v0
.end method

.method public ぺふねづ〺(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)Z
    .registers 3

    const/4 p1, 0x0

    return p1
.end method
