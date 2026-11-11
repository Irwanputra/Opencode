.class public final Lcom/google/android/material/tabs/TabLayout$TabView;
.super Landroid/widget/LinearLayout;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/tabs/TabLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "TabView"
.end annotation


# static fields
.field public static final synthetic のぷのちつ:I


# instance fields
.field public 〳ぜぞぜべっ:Landroid/widget/TextView;

.field public 〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

.field public ぁごぐすすぃ:Landroid/view/View;

.field public いいにぽつ:Landroid/graphics/drawable/Drawable;

.field public くし〴〺ぅ:Landroid/widget/TextView;

.field public づざかべべ:Landroid/view/View;

.field public final synthetic てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

.field public なぎぱいぢぎ:Lcom/google/android/material/badge/BadgeDrawable;

.field public びぐびあび:Landroid/widget/ImageView;

.field public ぺぁあねじ:Landroid/widget/ImageView;

.field public ぺふねづ〺:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;Landroid/content/Context;)V
    .registers 8

    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    invoke-direct {p0, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぺふねづ〺:I

    invoke-virtual {p0, p2}, Lcom/google/android/material/tabs/TabLayout$TabView;->ぺぁあねじ(Landroid/content/Context;)V

    iget p2, p1, Lcom/google/android/material/tabs/TabLayout;->なぎぱいぢぎ:I

    iget v0, p1, Lcom/google/android/material/tabs/TabLayout;->ぁごぐすすぃ:I

    iget v1, p1, Lcom/google/android/material/tabs/TabLayout;->〳ぜぞぜべっ:I

    iget v2, p1, Lcom/google/android/material/tabs/TabLayout;->ぺぁあねじ:I

    .line 1
    sget-object v3, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x11

    if-lt v3, v4, :cond_1f

    invoke-virtual {p0, p2, v0, v1, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    goto :goto_22

    :cond_1f
    invoke-virtual {p0, p2, v0, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 2
    :goto_22
    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    iget-boolean p1, p1, Lcom/google/android/material/tabs/TabLayout;->なぶひせが:Z

    const/4 p2, 0x1

    xor-int/2addr p1, p2

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setClickable(Z)V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 p2, 0x3ea

    invoke-static {p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/のぷのちつ;->げつ〴ぬぐ(Landroid/content/Context;I)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/のぷのちつ;

    move-result-object p1

    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ばおぢでぎか(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/のぷのちつ;)V

    return-void
.end method

.method private getBadge()Lcom/google/android/material/badge/BadgeDrawable;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->なぎぱいぢぎ:Lcom/google/android/material/badge/BadgeDrawable;

    return-object v0
.end method

.method private getContentWidth()I
    .registers 10

    const/4 v0, 0x3

    new-array v1, v0, [Landroid/view/View;

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび:Landroid/widget/ImageView;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぁごぐすすぃ:Landroid/view/View;

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_15
    if-ge v3, v0, :cond_43

    aget-object v7, v1, v3

    if-eqz v7, :cond_40

    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-nez v8, :cond_40

    if-eqz v6, :cond_2c

    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v8

    invoke-static {v5, v8}, Ljava/lang/Math;->min(II)I

    move-result v5

    goto :goto_30

    :cond_2c
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v5

    :goto_30
    if-eqz v6, :cond_3b

    invoke-virtual {v7}, Landroid/view/View;->getRight()I

    move-result v6

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_3f

    :cond_3b
    invoke-virtual {v7}, Landroid/view/View;->getRight()I

    move-result v2

    :goto_3f
    const/4 v6, 0x1

    :cond_40
    add-int/lit8 v3, v3, 0x1

    goto :goto_15

    :cond_43
    sub-int/2addr v2, v5

    return v2
.end method

.method private getOrCreateBadge()Lcom/google/android/material/badge/BadgeDrawable;
    .registers 14

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->なぎぱいぢぎ:Lcom/google/android/material/badge/BadgeDrawable;

    if-nez v0, :cond_8a

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 1
    sget v7, Lcom/google/android/material/badge/BadgeDrawable;->は〲ぱなで:I

    sget v8, Lcom/google/android/material/badge/BadgeDrawable;->ざとぅぼこ〺:I

    .line 2
    new-instance v9, Lcom/google/android/material/badge/BadgeDrawable;

    invoke-direct {v9, v0}, Lcom/google/android/material/badge/BadgeDrawable;-><init>(Landroid/content/Context;)V

    .line 3
    sget-object v10, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Badge:[I

    const/4 v11, 0x0

    new-array v6, v11, [I

    const/4 v12, 0x0

    .line 4
    invoke-static {v0, v12, v7, v8}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v2, 0x0

    move-object v1, v0

    move-object v3, v10

    move v4, v7

    move v5, v8

    invoke-static/range {v1 .. v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->〺つふすそ(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    invoke-virtual {v0, v12, v10, v7, v8}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 5
    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Badge_maxCharacterCount:I

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-virtual {v9, v2}, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ(I)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Badge_number:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3f

    invoke-virtual {v1, v2, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-virtual {v9, v2}, Lcom/google/android/material/badge/BadgeDrawable;->いいにぽつ(I)V

    :cond_3f
    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Badge_backgroundColor:I

    .line 6
    invoke-static {v0, v1, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    .line 7
    invoke-virtual {v9, v2}, Lcom/google/android/material/badge/BadgeDrawable;->なぎぱいぢぎ(I)V

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Badge_badgeTextColor:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_5f

    .line 8
    invoke-static {v0, v1, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    .line 9
    invoke-virtual {v9, v0}, Lcom/google/android/material/badge/BadgeDrawable;->〳ぜぞぜべっ(I)V

    :cond_5f
    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Badge_badgeGravity:I

    const v2, 0x800035

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/google/android/material/badge/BadgeDrawable;->ぁごぐすすぃ(I)V

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Badge_horizontalOffset:I

    invoke-virtual {v1, v0, v11}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    .line 10
    iget-object v2, v9, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 11
    iput v0, v2, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->ぺふねづ〺:I

    .line 12
    invoke-virtual {v9}, Lcom/google/android/material/badge/BadgeDrawable;->ぺふねづ〺()V

    .line 13
    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->Badge_verticalOffset:I

    invoke-virtual {v1, v0, v11}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    .line 14
    iget-object v2, v9, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 15
    iput v0, v2, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->てぜきぽく:I

    .line 16
    invoke-virtual {v9}, Lcom/google/android/material/badge/BadgeDrawable;->ぺふねづ〺()V

    .line 17
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 18
    iput-object v9, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->なぎぱいぢぎ:Lcom/google/android/material/badge/BadgeDrawable;

    :cond_8a
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$TabView;->なぎぱいぢぎ()V

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->なぎぱいぢぎ:Lcom/google/android/material/badge/BadgeDrawable;

    if-eqz v0, :cond_92

    return-object v0

    :cond_92
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unable to create badge"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic げつ〴ぬぐ(Lcom/google/android/material/tabs/TabLayout$TabView;)I
    .registers 1

    invoke-direct {p0}, Lcom/google/android/material/tabs/TabLayout$TabView;->getContentWidth()I

    move-result p0

    return p0
.end method


# virtual methods
.method public drawableStateChanged()V
    .registers 4

    invoke-super {p0}, Landroid/widget/LinearLayout;->drawableStateChanged()V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getDrawableState()[I

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->いいにぽつ:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    if-eqz v1, :cond_19

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_19

    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->いいにぽつ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    or-int/2addr v2, v0

    :cond_19
    if-eqz v2, :cond_23

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    :cond_23
    return-void
.end method

.method public getTab()Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    return-object v0
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 9

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->なぎぱいぢぎ:Lcom/google/android/material/badge/BadgeDrawable;

    if-eqz v0, :cond_2e

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->なぎぱいぢぎ:Lcom/google/android/material/badge/BadgeDrawable;

    invoke-virtual {v0}, Lcom/google/android/material/badge/BadgeDrawable;->くし〴〺ぅ()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_2e
    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    .line 1
    iget v3, v0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->びぐびあび:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 2
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->isSelected()Z

    move-result v6

    invoke-static/range {v1 .. v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$くし〴〺ぅ;->げつ〴ぬぐ(IIIIZZ)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$くし〴〺ぅ;

    move-result-object v0

    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_4b

    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 4
    :cond_4b
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_62

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 6
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    const/16 v3, 0x15

    if-lt v1, v3, :cond_62

    .line 7
    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->removeAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)Z

    :cond_62
    if-lt v1, v2, :cond_6f

    .line 8
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "AccessibilityNodeInfo.roleDescription"

    const-string v1, "Tab"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_6f
    return-void
.end method

.method public onMeasure(II)V
    .registers 10

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout;->getTabMaxWidth()I

    move-result v2

    if-lez v2, :cond_1e

    if-eqz v1, :cond_14

    if-le v0, v2, :cond_1e

    :cond_14
    iget-object p1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget p1, p1, Lcom/google/android/material/tabs/TabLayout;->は〲ぱなで:I

    const/high16 v0, -0x80000000

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :cond_1e
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    if-eqz v0, :cond_a8

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget v0, v0, Lcom/google/android/material/tabs/TabLayout;->ぇぬぎばつ:F

    iget v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぺふねづ〺:I

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび:Landroid/widget/ImageView;

    const/4 v3, 0x1

    if-eqz v2, :cond_38

    invoke-virtual {v2}, Landroid/widget/ImageView;->getVisibility()I

    move-result v2

    if-nez v2, :cond_38

    const/4 v1, 0x1

    goto :goto_46

    :cond_38
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    if-eqz v2, :cond_46

    invoke-virtual {v2}, Landroid/widget/TextView;->getLineCount()I

    move-result v2

    if-le v2, v3, :cond_46

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget v0, v0, Lcom/google/android/material/tabs/TabLayout;->ぉざぅち〻:F

    :cond_46
    :goto_46
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTextSize()F

    move-result v2

    iget-object v4, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getLineCount()I

    move-result v4

    iget-object v5, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-static {v5}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〺でおいここ(Landroid/widget/TextView;)I

    move-result v5

    cmpl-float v6, v0, v2

    if-nez v6, :cond_60

    if-ltz v5, :cond_a8

    if-eq v1, v5, :cond_a8

    :cond_60
    iget-object v5, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget v5, v5, Lcom/google/android/material/tabs/TabLayout;->びえぁぜい:I

    const/4 v6, 0x0

    if-ne v5, v3, :cond_99

    cmpl-float v2, v0, v2

    if-lez v2, :cond_99

    if-ne v4, v3, :cond_99

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v2

    if-eqz v2, :cond_98

    .line 1
    invoke-virtual {v2, v6}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v4

    invoke-virtual {v2}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-virtual {v2}, Landroid/text/TextPaint;->getTextSize()F

    move-result v2

    div-float v2, v0, v2

    mul-float v2, v2, v4

    .line 2
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getPaddingLeft()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getPaddingRight()I

    move-result v5

    sub-int/2addr v4, v5

    int-to-float v4, v4

    cmpl-float v2, v2, v4

    if-lez v2, :cond_99

    :cond_98
    const/4 v3, 0x0

    :cond_99
    if-eqz v3, :cond_a8

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v2, v6, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    :cond_a8
    return-void
.end method

.method public performClick()Z
    .registers 4

    invoke-super {p0}, Landroid/widget/LinearLayout;->performClick()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    if-eqz v1, :cond_21

    if-nez v0, :cond_e

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->playSoundEffect(I)V

    :cond_e
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    .line 1
    iget-object v1, v0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->なぎぱいぢぎ:Lcom/google/android/material/tabs/TabLayout;

    if-eqz v1, :cond_19

    const/4 v2, 0x1

    .line 2
    invoke-virtual {v1, v0, v2}, Lcom/google/android/material/tabs/TabLayout;->ぺふねづ〺(Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;Z)V

    return v2

    .line 3
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Tab not attached to a TabLayout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    return v0
.end method

.method public setSelected(Z)V
    .registers 4

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->isSelected()Z

    move-result v0

    if-eq v0, p1, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setSelected(Z)V

    if-eqz v0, :cond_1a

    if-eqz p1, :cond_1a

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_1a

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->sendAccessibilityEvent(I)V

    :cond_1a
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    if-eqz v0, :cond_21

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setSelected(Z)V

    :cond_21
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび:Landroid/widget/ImageView;

    if-eqz v0, :cond_28

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    :cond_28
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぁごぐすすぃ:Landroid/view/View;

    if-eqz v0, :cond_2f

    invoke-virtual {v0, p1}, Landroid/view/View;->setSelected(Z)V

    :cond_2f
    return-void
.end method

.method public setTab(Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    if-eq p1, v0, :cond_9

    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$TabView;->〳ぜぞぜべっ()V

    :cond_9
    return-void
.end method

.method public final 〳ぜぞぜべっ()V
    .registers 8

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    .line 1
    iget-object v2, v0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->づざかべべ:Landroid/view/View;

    goto :goto_9

    :cond_8
    move-object v2, v1

    :goto_9
    if-eqz v2, :cond_51

    .line 2
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eq v3, p0, :cond_1b

    if-eqz v3, :cond_18

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_18
    invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :cond_1b
    iput-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぁごぐすすぃ:Landroid/view/View;

    iget-object v3, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    const/16 v4, 0x8

    if-eqz v3, :cond_26

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_26
    iget-object v3, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび:Landroid/widget/ImageView;

    if-eqz v3, :cond_32

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v3, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび:Landroid/widget/ImageView;

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_32
    const v3, 0x1020014

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〳ぜぞぜべっ:Landroid/widget/TextView;

    if-eqz v3, :cond_45

    invoke-static {v3}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〺でおいここ(Landroid/widget/TextView;)I

    move-result v3

    iput v3, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぺふねづ〺:I

    :cond_45
    const v3, 0x1020006

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぺぁあねじ:Landroid/widget/ImageView;

    goto :goto_5e

    :cond_51
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぁごぐすすぃ:Landroid/view/View;

    if-eqz v2, :cond_5a

    invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    iput-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぁごぐすすぃ:Landroid/view/View;

    :cond_5a
    iput-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〳ぜぞぜべっ:Landroid/widget/TextView;

    iput-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぺぁあねじ:Landroid/widget/ImageView;

    :goto_5e
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぁごぐすすぃ:Landroid/view/View;

    const/4 v3, 0x0

    if-nez v2, :cond_12b

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび:Landroid/widget/ImageView;

    const/4 v4, -0x2

    if-nez v2, :cond_97

    .line 3
    sget-boolean v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz v2, :cond_81

    .line 4
    new-instance v2, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v2, v5}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v5}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    invoke-virtual {p0, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    goto :goto_82

    :cond_81
    move-object v2, p0

    :goto_82
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    sget v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;->design_layout_tab_icon:I

    invoke-virtual {v5, v6, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    iput-object v5, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび:Landroid/widget/ImageView;

    invoke-virtual {v2, v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :cond_97
    if-eqz v0, :cond_a5

    .line 6
    iget-object v2, v0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_a5

    .line 7
    invoke-static {v2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱〴なぱへて(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_a5
    if-eqz v1, :cond_b7

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget-object v2, v2, Lcom/google/android/material/tabs/TabLayout;->てぜきぽく:Landroid/content/res/ColorStateList;

    invoke-static {v1, v2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget-object v2, v2, Lcom/google/android/material/tabs/TabLayout;->おぐぴう〸ず:Landroid/graphics/PorterDuff$Mode;

    if-eqz v2, :cond_b7

    invoke-static {v1, v2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->しげにけぃ(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_b7
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    if-nez v1, :cond_f2

    .line 8
    sget-boolean v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz v1, :cond_d4

    .line 9
    new-instance v1, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_d5

    :cond_d4
    move-object v1, p0

    :goto_d5
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;->design_layout_tab_text:I

    invoke-virtual {v2, v4, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 11
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-static {v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〺でおいここ(Landroid/widget/TextView;)I

    move-result v1

    iput v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぺふねづ〺:I

    :cond_f2
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget v2, v2, Lcom/google/android/material/tabs/TabLayout;->いいにぽつ:I

    invoke-static {v1, v2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅばづそほせ(Landroid/widget/TextView;I)V

    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget-object v1, v1, Lcom/google/android/material/tabs/TabLayout;->ぺふねづ〺:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_106

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_106
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび:Landroid/widget/ImageView;

    invoke-virtual {p0, v1, v2}, Lcom/google/android/material/tabs/TabLayout$TabView;->いいにぽつ(Landroid/widget/TextView;Landroid/widget/ImageView;)V

    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$TabView;->なぎぱいぢぎ()V

    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび:Landroid/widget/ImageView;

    if-nez v1, :cond_115

    goto :goto_11d

    .line 12
    :cond_115
    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/けときぜと/げつ〴ぬぐ;

    invoke-direct {v2, p0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/けときぜと/げつ〴ぬぐ;-><init>(Lcom/google/android/material/tabs/TabLayout$TabView;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 13
    :goto_11d
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    if-nez v1, :cond_122

    goto :goto_138

    .line 14
    :cond_122
    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/けときぜと/げつ〴ぬぐ;

    invoke-direct {v2, p0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/けときぜと/げつ〴ぬぐ;-><init>(Lcom/google/android/material/tabs/TabLayout$TabView;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    goto :goto_138

    .line 15
    :cond_12b
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〳ぜぞぜべっ:Landroid/widget/TextView;

    if-nez v1, :cond_133

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぺぁあねじ:Landroid/widget/ImageView;

    if-eqz v2, :cond_138

    :cond_133
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぺぁあねじ:Landroid/widget/ImageView;

    invoke-virtual {p0, v1, v2}, Lcom/google/android/material/tabs/TabLayout$TabView;->いいにぽつ(Landroid/widget/TextView;Landroid/widget/ImageView;)V

    :cond_138
    :goto_138
    if-eqz v0, :cond_147

    .line 16
    iget-object v1, v0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/CharSequence;

    .line 17
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_147

    .line 18
    iget-object v1, v0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/CharSequence;

    .line 19
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_147
    const/4 v1, 0x1

    if-eqz v0, :cond_165

    .line 20
    iget-object v2, v0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->なぎぱいぢぎ:Lcom/google/android/material/tabs/TabLayout;

    if-eqz v2, :cond_15d

    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result v2

    iget v0, v0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->びぐびあび:I

    if-ne v2, v0, :cond_158

    const/4 v0, 0x1

    goto :goto_159

    :cond_158
    const/4 v0, 0x0

    :goto_159
    if-eqz v0, :cond_165

    const/4 v3, 0x1

    goto :goto_165

    :cond_15d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Tab not attached to a TabLayout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 21
    :cond_165
    :goto_165
    invoke-virtual {p0, v3}, Lcom/google/android/material/tabs/TabLayout$TabView;->setSelected(Z)V

    return-void
.end method

.method public final 〺つふすそ(Landroid/view/View;)Landroid/widget/FrameLayout;
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq p1, v0, :cond_a

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    if-eq p1, v0, :cond_a

    return-object v1

    :cond_a
    sget-boolean v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_15

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/widget/FrameLayout;

    :cond_15
    return-object v1
.end method

.method public final ぁごぐすすぃ(Landroid/view/View;)V
    .registers 4

    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ()Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->づざかべべ:Landroid/view/View;

    if-ne p1, v0, :cond_13

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->なぎぱいぢぎ:Lcom/google/android/material/badge/BadgeDrawable;

    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ(Landroid/view/View;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->〺つふすそ(Lcom/google/android/material/badge/BadgeDrawable;Landroid/view/View;Landroid/widget/FrameLayout;)V

    :cond_13
    return-void
.end method

.method public final いいにぽつ(Landroid/widget/TextView;Landroid/widget/ImageView;)V
    .registers 8

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    const/4 v1, 0x0

    if-eqz v0, :cond_12

    .line 1
    iget-object v0, v0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_12

    .line 2
    invoke-static {v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱〴なぱへて(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_13

    :cond_12
    move-object v0, v1

    :goto_13
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    if-eqz v2, :cond_1a

    .line 3
    iget-object v2, v2, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->〺つふすそ:Ljava/lang/CharSequence;

    goto :goto_1b

    :cond_1a
    move-object v2, v1

    :goto_1b
    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eqz p2, :cond_32

    if-eqz v0, :cond_2c

    .line 4
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_32

    :cond_2c
    invoke-virtual {p2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_32
    :goto_32
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz p1, :cond_51

    if-eqz v0, :cond_4b

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    .line 5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_51

    :cond_4b
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_51
    :goto_51
    if-eqz p2, :cond_96

    invoke-virtual {p2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_6b

    invoke-virtual {p2}, Landroid/widget/ImageView;->getVisibility()I

    move-result v2

    if-nez v2, :cond_6b

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぇぬぎばつ(Landroid/content/Context;I)F

    move-result v2

    float-to-int v2, v2

    goto :goto_6c

    :cond_6b
    const/4 v2, 0x0

    :goto_6c
    iget-object v3, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget-boolean v3, v3, Lcom/google/android/material/tabs/TabLayout;->なぶひせが:Z

    if-eqz v3, :cond_7e

    invoke-static {p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->けときぜと(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result v3

    if-eq v2, v3, :cond_96

    invoke-static {p1, v2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->しぷげへが(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    iput v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    goto :goto_90

    :cond_7e
    iget v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    if-eq v2, v3, :cond_96

    iput v2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 7
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v2, v3, :cond_8e

    invoke-virtual {p1, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    goto :goto_90

    :cond_8e
    iput v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 8
    :goto_90
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p2}, Landroid/widget/ImageView;->requestLayout()V

    :cond_96
    iget-object p1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    if-eqz p1, :cond_9d

    .line 9
    iget-object p1, p1, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/CharSequence;

    goto :goto_9e

    :cond_9d
    move-object p1, v1

    :goto_9e
    if-eqz v0, :cond_a1

    goto :goto_a2

    :cond_a1
    move-object v1, p1

    .line 10
    :goto_a2
    invoke-static {p0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〺〲に〼へ〸(Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final くし〴〺ぅ()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->なぎぱいぢぎ:Lcom/google/android/material/badge/BadgeDrawable;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    return v0
.end method

.method public final づざかべべ()V
    .registers 4

    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ()Z

    move-result v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setClipChildren(Z)V

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setClipToPadding(Z)V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1c

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 2
    :cond_1c
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->づざかべべ:Landroid/view/View;

    if-eqz v0, :cond_2c

    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->なぎぱいぢぎ:Lcom/google/android/material/badge/BadgeDrawable;

    invoke-virtual {p0, v0}, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ(Landroid/view/View;)Landroid/widget/FrameLayout;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ(Lcom/google/android/material/badge/BadgeDrawable;Landroid/view/View;Landroid/widget/FrameLayout;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->づざかべべ:Landroid/view/View;

    :cond_2c
    return-void
.end method

.method public final なぎぱいぢぎ()V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ()Z

    move-result v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->ぁごぐすすぃ:Landroid/view/View;

    if-eqz v0, :cond_f

    :cond_b
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$TabView;->づざかべべ()V

    goto :goto_46

    :cond_f
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび:Landroid/widget/ImageView;

    if-eqz v0, :cond_2c

    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    if-eqz v1, :cond_2c

    .line 1
    iget-object v1, v1, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_2c

    .line 2
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->づざかべべ:Landroid/view/View;

    if-eq v1, v0, :cond_28

    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$TabView;->づざかべべ()V

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび:Landroid/widget/ImageView;

    :goto_24
    invoke-virtual {p0, v0}, Lcom/google/android/material/tabs/TabLayout$TabView;->びぐびあび(Landroid/view/View;)V

    goto :goto_46

    :cond_28
    invoke-virtual {p0, v0}, Lcom/google/android/material/tabs/TabLayout$TabView;->ぁごぐすすぃ(Landroid/view/View;)V

    goto :goto_46

    :cond_2c
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->づざかべべ:Landroid/view/View;

    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    if-eq v0, v1, :cond_43

    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$TabView;->づざかべべ()V

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ:Landroid/widget/TextView;

    goto :goto_24

    :cond_43
    invoke-virtual {p0, v1}, Lcom/google/android/material/tabs/TabLayout$TabView;->ぁごぐすすぃ(Landroid/view/View;)V

    :goto_46
    return-void
.end method

.method public final びぐびあび(Landroid/view/View;)V
    .registers 5

    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$TabView;->くし〴〺ぅ()Z

    move-result v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    if-eqz p1, :cond_38

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setClipChildren(Z)V

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setClipToPadding(Z)V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1e

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 2
    :cond_1e
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->なぎぱいぢぎ:Lcom/google/android/material/badge/BadgeDrawable;

    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout$TabView;->〺つふすそ(Landroid/view/View;)Landroid/widget/FrameLayout;

    move-result-object v1

    .line 3
    invoke-static {v0, p1, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->〺つふすそ(Lcom/google/android/material/badge/BadgeDrawable;Landroid/view/View;Landroid/widget/FrameLayout;)V

    sget-boolean v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz v2, :cond_2f

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_36

    :cond_2f
    invoke-virtual {p1}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewOverlay;->add(Landroid/graphics/drawable/Drawable;)V

    .line 4
    :goto_36
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->づざかべべ:Landroid/view/View;

    :cond_38
    return-void
.end method

.method public final ぺぁあねじ(Landroid/content/Context;)V
    .registers 8

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget v0, v0, Lcom/google/android/material/tabs/TabLayout;->ざとぅぼこ〺:I

    const/4 v1, 0x0

    if-eqz v0, :cond_1f

    invoke-static {p1, v0}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->いいにぽつ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_21

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p1

    if-eqz p1, :cond_21

    iget-object p1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->いいにぽつ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_21

    :cond_1f
    iput-object v1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->いいにぽつ:Landroid/graphics/drawable/Drawable;

    :cond_21
    :goto_21
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget-object v2, v2, Lcom/google/android/material/tabs/TabLayout;->のぷのちつ:Landroid/content/res/ColorStateList;

    if-eqz v2, :cond_74

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v3, 0x3727c5ac    # 1.0E-5f

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget-object v3, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget-object v3, v3, Lcom/google/android/material/tabs/TabLayout;->のぷのちつ:Landroid/content/res/ColorStateList;

    invoke-static {v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/じぜこほぱ/〺つふすそ;->げつ〴ぬぐ(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v3

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x15

    if-lt v4, v5, :cond_5f

    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    iget-object v4, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    iget-boolean v4, v4, Lcom/google/android/material/tabs/TabLayout;->ぅみぱぎぎ:Z

    if-eqz v4, :cond_56

    move-object p1, v1

    :cond_56
    if-eqz v4, :cond_59

    goto :goto_5a

    :cond_59
    move-object v1, v2

    :goto_5a
    invoke-direct {v0, v3, p1, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    move-object p1, v0

    goto :goto_74

    :cond_5f
    invoke-static {v2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱〴なぱへて(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1, v3}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    new-instance v2, Landroid/graphics/drawable/LayerDrawable;

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    aput-object p1, v3, v0

    const/4 p1, 0x1

    aput-object v1, v3, p1

    invoke-direct {v2, v3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    move-object p1, v2

    .line 1
    :cond_74
    :goto_74
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_80

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_83

    :cond_80
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    :goto_83
    iget-object p1, p0, Lcom/google/android/material/tabs/TabLayout$TabView;->てぜきぽく:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p1}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method
