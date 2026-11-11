.class public Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;
.super Landroid/view/ViewGroup;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;


# static fields
.field public static final なぶひせが:[I

.field public static final びえぁぜい:[I


# instance fields
.field public final 〳ぜぞぜべっ:Landroid/view/View$OnClickListener;

.field public final 〺つふすそ:Landroidx/transition/TransitionSet;

.field public 〻ぞまぎな〻:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/google/android/material/badge/BadgeDrawable;",
            ">;"
        }
    .end annotation
.end field

.field public final ぁごぐすすぃ:I

.field public いいにぽつ:Z

.field public ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

.field public ぇぬぎばつ:I

.field public ぉ〲なぱぽた:Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;

.field public ぉざぅち〻:Landroid/content/res/ColorStateList;

.field public おぐぴう〸ず:Landroid/content/res/ColorStateList;

.field public final くし〴〺ぅ:I

.field public ごづごきえ:I

.field public ざっざへづ:Landroid/graphics/drawable/Drawable;

.field public final ざとぅぼこ〺:Landroid/content/res/ColorStateList;

.field public final づざかべべ:I

.field public てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

.field public でどあくず:I

.field public final なぎぱいぢぎ:I

.field public のぷのちつ:I

.field public は〲ぱなで:I

.field public final びぐびあび:I

.field public ぶでにく〼〳:[I

.field public へぬ〴づぞ:I

.field public final ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u3066\u305c\u304d\u307d\u304f/\u304f\u3057\u3034\u303a\u3045<",
            "Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;",
            ">;"
        }
    .end annotation
.end field

.field public ぺふねづ〺:I


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, 0x10100a0

    const/4 v3, 0x0

    aput v2, v1, v3

    sput-object v1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->びえぁぜい:[I

    new-array v0, v0, [I

    const v1, -0x101009e

    aput v1, v0, v3

    sput-object v0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->なぶひせが:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/びぐびあび;

    const/4 p2, 0x5

    invoke-direct {p1, p2}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/びぐびあび;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->のぷのちつ:I

    iput p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->へぬ〴づぞ:I

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0, p2}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->〻ぞまぎな〻:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->design_bottom_navigation_item_max_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->くし〴〺ぅ:I

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->design_bottom_navigation_item_min_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->びぐびあび:I

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->design_bottom_navigation_active_item_max_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->づざかべべ:I

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->design_bottom_navigation_active_item_min_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->なぎぱいぢぎ:I

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->design_bottom_navigation_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぁごぐすすぃ:I

    const v0, 0x1010038

    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ざとぅぼこ〺:Landroid/content/res/ColorStateList;

    new-instance v0, Landroidx/transition/AutoTransition;

    invoke-direct {v0}, Landroidx/transition/AutoTransition;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->〺つふすそ:Landroidx/transition/TransitionSet;

    invoke-virtual {v0, p1}, Landroidx/transition/TransitionSet;->ぇとしたべど(I)Landroidx/transition/TransitionSet;

    const-wide/16 v1, 0x73

    invoke-virtual {v0, v1, v2}, Landroidx/transition/TransitionSet;->おかぷせ〱(J)Landroidx/transition/TransitionSet;

    new-instance p1, Lづざかべべ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {p1}, Lづざかべべ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;-><init>()V

    invoke-virtual {v0, p1}, Landroidx/transition/TransitionSet;->〺でおいここ(Landroid/animation/TimeInterpolator;)Landroidx/transition/TransitionSet;

    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ぺぁあねじ;

    invoke-direct {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ぺぁあねじ;-><init>()V

    invoke-virtual {v0, p1}, Landroidx/transition/TransitionSet;->ぷぞてのほき(Landroidx/transition/Transition;)Landroidx/transition/TransitionSet;

    new-instance p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView$げつ〴ぬぐ;

    invoke-direct {p1, p0}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView$げつ〴ぬぐ;-><init>(Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;)V

    iput-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->〳ぜぞぜべっ:Landroid/view/View$OnClickListener;

    new-array p1, p2, [I

    iput-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぶでにく〼〳:[I

    const/4 p1, 0x1

    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ておぞぞはね(Landroid/view/View;I)V

    return-void
.end method

.method private getNewItem()Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    if-nez v0, :cond_13

    new-instance v0, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;-><init>(Landroid/content/Context;)V

    :cond_13
    return-object v0
.end method

.method private setBadgeIfNeeded(Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;)V
    .registers 4

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_9

    const/4 v1, 0x1

    goto :goto_a

    :cond_9
    const/4 v1, 0x0

    :goto_a
    if-nez v1, :cond_d

    return-void

    :cond_d
    iget-object v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->〻ぞまぎな〻:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/badge/BadgeDrawable;

    if-eqz v0, :cond_1a

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setBadge(Lcom/google/android/material/badge/BadgeDrawable;)V

    :cond_1a
    return-void
.end method


# virtual methods
.method public getBadgeDrawables()Landroid/util/SparseArray;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Lcom/google/android/material/badge/BadgeDrawable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->〻ぞまぎな〻:Landroid/util/SparseArray;

    return-object v0
.end method

.method public getIconTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->おぐぴう〸ず:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    if-eqz v0, :cond_f

    array-length v1, v0

    if-lez v1, :cond_f

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_f
    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ざっざへづ:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getItemBackgroundRes()I
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->でどあくず:I

    return v0
.end method

.method public getItemIconSize()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇぬぎばつ:I

    return v0
.end method

.method public getItemTextAppearanceActive()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ごづごきえ:I

    return v0
.end method

.method public getItemTextAppearanceInactive()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->は〲ぱなで:I

    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぉざぅち〻:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getLabelVisibilityMode()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぺふねづ〺:I

    return v0
.end method

.method public getSelectedItemId()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->のぷのちつ:I

    return v0
.end method

.method public getWindowAnimations()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 5

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->てぜきぽく()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v2, v0, v1, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$〺つふすそ;->げつ〴ぬぐ(IIZI)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$〺つふすそ;

    move-result-object v0

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_20

    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$〺つふすそ;->げつ〴ぬぐ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    :cond_20
    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 10

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 v0, 0x0

    :goto_9
    if-ge p3, p1, :cond_3b

    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_18

    goto :goto_38

    :cond_18
    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2b

    sub-int v2, p4, v0

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    sub-int v3, v2, v3

    invoke-virtual {v1, v3, p2, v2, p5}, Landroid/view/View;->layout(IIII)V

    goto :goto_33

    :cond_2b
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {v1, v0, p2, v2, p5}, Landroid/view/View;->layout(IIII)V

    :goto_33
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v0, v1

    :goto_38
    add-int/lit8 p3, p3, 0x1

    goto :goto_9

    :cond_3b
    return-void
.end method

.method public onMeasure(II)V
    .registers 13

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iget-object p2, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->てぜきぽく()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぁごぐすすぃ:I

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    iget v3, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぺふねづ〺:I

    invoke-virtual {p0, v3, p2}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->びぐびあび(II)Z

    move-result v3

    const/16 v4, 0x8

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_9f

    iget-boolean v3, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->いいにぽつ:Z

    if-eqz v3, :cond_9f

    iget v3, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->へぬ〴づぞ:I

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    iget v7, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->なぎぱいぢぎ:I

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-eq v8, v4, :cond_4b

    iget v8, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->づざかべべ:I

    const/high16 v9, -0x80000000

    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    invoke-virtual {v3, v8, v1}, Landroid/view/View;->measure(II)V

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    :cond_4b
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-eq v3, v4, :cond_53

    const/4 v3, 0x1

    goto :goto_54

    :cond_53
    const/4 v3, 0x0

    :goto_54
    sub-int/2addr p2, v3

    iget v3, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->びぐびあび:I

    mul-int v3, v3, p2

    sub-int v3, p1, v3

    iget v8, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->づざかべべ:I

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr p1, v3

    if-nez p2, :cond_6a

    const/4 v7, 0x1

    goto :goto_6b

    :cond_6a
    move v7, p2

    :goto_6b
    div-int v7, p1, v7

    iget v8, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->くし〴〺ぅ:I

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    mul-int p2, p2, v7

    sub-int/2addr p1, p2

    const/4 p2, 0x0

    :goto_77
    if-ge p2, v0, :cond_d1

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-eq v8, v4, :cond_98

    iget-object v8, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぶでにく〼〳:[I

    iget v9, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->へぬ〴づぞ:I

    if-ne p2, v9, :cond_8b

    move v9, v3

    goto :goto_8c

    :cond_8b
    move v9, v7

    :goto_8c
    aput v9, v8, p2

    if-lez p1, :cond_9c

    aget v9, v8, p2

    add-int/2addr v9, v5

    aput v9, v8, p2

    add-int/lit8 p1, p1, -0x1

    goto :goto_9c

    :cond_98
    iget-object v8, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぶでにく〼〳:[I

    aput v6, v8, p2

    :cond_9c
    :goto_9c
    add-int/lit8 p2, p2, 0x1

    goto :goto_77

    :cond_9f
    if-nez p2, :cond_a3

    const/4 v3, 0x1

    goto :goto_a4

    :cond_a3
    move v3, p2

    :goto_a4
    div-int v3, p1, v3

    iget v7, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->づざかべべ:I

    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v3

    mul-int p2, p2, v3

    sub-int/2addr p1, p2

    const/4 p2, 0x0

    :goto_b0
    if-ge p2, v0, :cond_d1

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eq v7, v4, :cond_ca

    iget-object v7, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぶでにく〼〳:[I

    aput v3, v7, p2

    if-lez p1, :cond_ce

    aget v8, v7, p2

    add-int/2addr v8, v5

    aput v8, v7, p2

    add-int/lit8 p1, p1, -0x1

    goto :goto_ce

    :cond_ca
    iget-object v7, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぶでにく〼〳:[I

    aput v6, v7, p2

    :cond_ce
    :goto_ce
    add-int/lit8 p2, p2, 0x1

    goto :goto_b0

    :cond_d1
    const/4 p1, 0x0

    const/4 p2, 0x0

    :goto_d3
    if-ge p1, v0, :cond_fd

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-ne v5, v4, :cond_e0

    goto :goto_fa

    :cond_e0
    iget-object v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぶでにく〼〳:[I

    aget v5, v5, p1

    invoke-static {v5, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-virtual {v3, v5, v1}, Landroid/view/View;->measure(II)V

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    iput v7, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    add-int/2addr p2, v3

    :goto_fa
    add-int/lit8 p1, p1, 0x1

    goto :goto_d3

    :cond_fd
    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-static {p2, p1, v6}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    iget p2, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぁごぐすすぃ:I

    invoke-static {p2, v1, v6}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public setBadgeDrawables(Landroid/util/SparseArray;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Lcom/google/android/material/badge/BadgeDrawable;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->〻ぞまぎな〻:Landroid/util/SparseArray;

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    if-eqz v0, :cond_1c

    array-length v1, v0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v1, :cond_1c

    aget-object v3, v0, v2

    invoke-virtual {v3}, Landroid/widget/FrameLayout;->getId()I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/badge/BadgeDrawable;

    invoke-virtual {v3, v4}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setBadge(Lcom/google/android/material/badge/BadgeDrawable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_1c
    return-void
.end method

.method public setIconTintList(Landroid/content/res/ColorStateList;)V
    .registers 6

    iput-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->おぐぴう〸ず:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    if-eqz v0, :cond_12

    array-length v1, v0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v1, :cond_12

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setIconTintList(Landroid/content/res/ColorStateList;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_12
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .registers 6

    iput-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ざっざへづ:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    if-eqz v0, :cond_12

    array-length v1, v0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v1, :cond_12

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_12
    return-void
.end method

.method public setItemBackgroundRes(I)V
    .registers 6

    iput p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->でどあくず:I

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    if-eqz v0, :cond_12

    array-length v1, v0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v1, :cond_12

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setItemBackground(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_12
    return-void
.end method

.method public setItemHorizontalTranslationEnabled(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->いいにぽつ:Z

    return-void
.end method

.method public setItemIconSize(I)V
    .registers 6

    iput p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇぬぎばつ:I

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    if-eqz v0, :cond_12

    array-length v1, v0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v1, :cond_12

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setIconSize(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_12
    return-void
.end method

.method public setItemTextAppearanceActive(I)V
    .registers 7

    iput p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ごづごきえ:I

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    if-eqz v0, :cond_19

    array-length v1, v0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v1, :cond_19

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setTextAppearanceActive(I)V

    iget-object v4, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぉざぅち〻:Landroid/content/res/ColorStateList;

    if-eqz v4, :cond_16

    invoke-virtual {v3, v4}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_16
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_19
    return-void
.end method

.method public setItemTextAppearanceInactive(I)V
    .registers 7

    iput p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->は〲ぱなで:I

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    if-eqz v0, :cond_19

    array-length v1, v0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v1, :cond_19

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setTextAppearanceInactive(I)V

    iget-object v4, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぉざぅち〻:Landroid/content/res/ColorStateList;

    if-eqz v4, :cond_16

    invoke-virtual {v3, v4}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_16
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_19
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .registers 6

    iput-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぉざぅち〻:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    if-eqz v0, :cond_12

    array-length v1, v0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v1, :cond_12

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_12
    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぺふねづ〺:I

    return-void
.end method

.method public setPresenter(Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぉ〲なぱぽた:Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;

    return-void
.end method

.method public 〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    return-void
.end method

.method public くし〴〺ぅ(I)Landroid/content/res/ColorStateList;
    .registers 12

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_16

    return-object v1

    :cond_16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    iget v3, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-static {p1, v3}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    sget v4, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->colorPrimary:I

    invoke-virtual {v3, v4, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v3

    if-nez v3, :cond_31

    return-object v1

    :cond_31
    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    new-instance v3, Landroid/content/res/ColorStateList;

    const/4 v4, 0x3

    new-array v5, v4, [[I

    sget-object v6, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->なぶひせが:[I

    const/4 v7, 0x0

    aput-object v6, v5, v7

    sget-object v8, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->びえぁぜい:[I

    aput-object v8, v5, v2

    sget-object v8, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    const/4 v9, 0x2

    aput-object v8, v5, v9

    new-array v4, v4, [I

    invoke-virtual {p1, v6, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    aput p1, v4, v7

    aput v0, v4, v2

    aput v1, v4, v9

    invoke-direct {v3, v5, v4}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v3
.end method

.method public げつ〴ぬぐ()V
    .registers 11

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_36

    array-length v4, v0

    const/4 v5, 0x0

    :goto_c
    if-ge v5, v4, :cond_36

    aget-object v6, v0, v5

    if-eqz v6, :cond_33

    iget-object v7, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {v7, v6}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    .line 1
    iget-object v7, v6, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->〳ぜぞぜべっ:Landroid/widget/ImageView;

    .line 2
    invoke-virtual {v6}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->くし〴〺ぅ()Z

    move-result v8

    if-nez v8, :cond_20

    goto :goto_33

    :cond_20
    if-eqz v7, :cond_31

    invoke-virtual {v6, v3}, Landroid/widget/FrameLayout;->setClipChildren(Z)V

    invoke-virtual {v6, v3}, Landroid/widget/FrameLayout;->setClipToPadding(Z)V

    iget-object v8, v6, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->ぇぬぎばつ:Lcom/google/android/material/badge/BadgeDrawable;

    invoke-virtual {v6, v7}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->〺つふすそ(Landroid/view/View;)Landroid/widget/FrameLayout;

    move-result-object v9

    invoke-static {v8, v7, v9}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ(Lcom/google/android/material/badge/BadgeDrawable;Landroid/view/View;Landroid/widget/FrameLayout;)V

    :cond_31
    iput-object v1, v6, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->ぇぬぎばつ:Lcom/google/android/material/badge/BadgeDrawable;

    :cond_33
    :goto_33
    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    .line 3
    :cond_36
    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->size()I

    move-result v0

    if-nez v0, :cond_45

    iput v2, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->のぷのちつ:I

    iput v2, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->へぬ〴づぞ:I

    iput-object v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    return-void

    .line 4
    :cond_45
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    :goto_4b
    iget-object v4, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v4}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->size()I

    move-result v4

    if-ge v1, v4, :cond_67

    iget-object v4, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v4, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v4

    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_4b

    :cond_67
    const/4 v1, 0x0

    :goto_68
    iget-object v4, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->〻ぞまぎな〻:Landroid/util/SparseArray;

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ge v1, v4, :cond_88

    iget-object v4, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->〻ぞまぎな〻:Landroid/util/SparseArray;

    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_85

    iget-object v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->〻ぞまぎな〻:Landroid/util/SparseArray;

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->delete(I)V

    :cond_85
    add-int/lit8 v1, v1, 0x1

    goto :goto_68

    .line 5
    :cond_88
    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    iput-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    iget v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぺふねづ〺:I

    iget-object v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->てぜきぽく()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->びぐびあび(II)Z

    move-result v0

    const/4 v1, 0x0

    :goto_a3
    iget-object v4, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v4}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->size()I

    move-result v4

    if-ge v1, v4, :cond_128

    iget-object v4, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぉ〲なぱぽた:Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;

    .line 6
    iput-boolean v3, v4, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->びぐびあび:Z

    .line 7
    iget-object v4, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v4, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v4

    invoke-interface {v4, v3}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    iget-object v4, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぉ〲なぱぽた:Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;

    .line 8
    iput-boolean v2, v4, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->びぐびあび:Z

    .line 9
    invoke-direct {p0}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->getNewItem()Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    aput-object v4, v5, v1

    iget-object v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->おぐぴう〸ず:Landroid/content/res/ColorStateList;

    invoke-virtual {v4, v5}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setIconTintList(Landroid/content/res/ColorStateList;)V

    iget v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇぬぎばつ:I

    invoke-virtual {v4, v5}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setIconSize(I)V

    iget-object v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ざとぅぼこ〺:Landroid/content/res/ColorStateList;

    invoke-virtual {v4, v5}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->は〲ぱなで:I

    invoke-virtual {v4, v5}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setTextAppearanceInactive(I)V

    iget v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ごづごきえ:I

    invoke-virtual {v4, v5}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setTextAppearanceActive(I)V

    iget-object v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぉざぅち〻:Landroid/content/res/ColorStateList;

    invoke-virtual {v4, v5}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ざっざへづ:Landroid/graphics/drawable/Drawable;

    if-eqz v5, :cond_ea

    invoke-virtual {v4, v5}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_ef

    :cond_ea
    iget v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->でどあくず:I

    invoke-virtual {v4, v5}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setItemBackground(I)V

    :goto_ef
    invoke-virtual {v4, v0}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setShifting(Z)V

    iget v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぺふねづ〺:I

    invoke-virtual {v4, v5}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setLabelVisibilityMode(I)V

    iget-object v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v5, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    check-cast v5, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    invoke-virtual {v4, v5, v2}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;I)V

    invoke-virtual {v4, v1}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setItemPosition(I)V

    iget-object v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->〳ぜぞぜべっ:Landroid/view/View$OnClickListener;

    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->のぷのちつ:I

    if-eqz v5, :cond_11e

    iget-object v5, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v5, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    move-result v5

    iget v6, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->のぷのちつ:I

    if-ne v5, v6, :cond_11e

    iput v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->へぬ〴づぞ:I

    :cond_11e
    invoke-direct {p0, v4}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->setBadgeIfNeeded(Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;)V

    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_a3

    :cond_128
    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->size()I

    move-result v0

    sub-int/2addr v0, v3

    iget v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->へぬ〴づぞ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->へぬ〴づぞ:I

    iget-object v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public final びぐびあび(II)Z
    .registers 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne p1, v2, :cond_9

    const/4 p1, 0x3

    if-le p2, p1, :cond_c

    goto :goto_d

    :cond_9
    if-nez p1, :cond_c

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    return v0
.end method
