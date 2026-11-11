.class public Lcom/google/android/material/transformation/FabTransformationSheetBehavior;
.super Lcom/google/android/material/transformation/FabTransformationBehavior;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public ぺぁあねじ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/material/transformation/FabTransformationBehavior;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/google/android/material/transformation/FabTransformationBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public どぇぞほだ(Landroid/view/View;Landroid/view/View;ZZ)Z
    .registers 14

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const/4 v2, 0x1

    if-nez v1, :cond_b

    goto/16 :goto_7a

    :cond_b
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x10

    if-lt v3, v4, :cond_20

    if-eqz p3, :cond_20

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v3, p0, Lcom/google/android/material/transformation/FabTransformationSheetBehavior;->ぺぁあねじ:Ljava/util/Map;

    :cond_20
    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_22
    if-ge v5, v1, :cond_75

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    instance-of v7, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    if-eqz v7, :cond_3e

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    .line 2
    iget-object v7, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->げつ〴ぬぐ:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    .line 3
    instance-of v7, v7, Lcom/google/android/material/transformation/FabTransformationScrimBehavior;

    if-eqz v7, :cond_3e

    const/4 v7, 0x1

    goto :goto_3f

    :cond_3e
    const/4 v7, 0x0

    :goto_3f
    if-eq v6, p2, :cond_72

    if-eqz v7, :cond_44

    goto :goto_72

    :cond_44
    if-nez p3, :cond_5d

    iget-object v7, p0, Lcom/google/android/material/transformation/FabTransformationSheetBehavior;->ぺぁあねじ:Ljava/util/Map;

    if-eqz v7, :cond_72

    invoke-interface {v7, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_72

    iget-object v7, p0, Lcom/google/android/material/transformation/FabTransformationSheetBehavior;->ぺぁあねじ:Ljava/util/Map;

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_6f

    :cond_5d
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v7, v4, :cond_6e

    iget-object v7, p0, Lcom/google/android/material/transformation/FabTransformationSheetBehavior;->ぺぁあねじ:Ljava/util/Map;

    invoke-virtual {v6}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6e
    const/4 v7, 0x4

    :goto_6f
    invoke-static {v6, v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ておぞぞはね(Landroid/view/View;I)V

    :cond_72
    :goto_72
    add-int/lit8 v5, v5, 0x1

    goto :goto_22

    :cond_75
    if-nez p3, :cond_7a

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationSheetBehavior;->ぺぁあねじ:Ljava/util/Map;

    .line 4
    :cond_7a
    :goto_7a
    invoke-super {p0, p1, p2, p3, p4}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;->どぇぞほだ(Landroid/view/View;Landroid/view/View;ZZ)Z

    return v2
.end method

.method public ながふずは(Landroid/content/Context;Z)Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;
    .registers 5

    if-eqz p2, :cond_5

    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/げつ〴ぬぐ;->mtrl_fab_transformation_sheet_expand_spec:I

    goto :goto_7

    :cond_5
    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/げつ〴ぬぐ;->mtrl_fab_transformation_sheet_collapse_spec:I

    :goto_7
    new-instance v0, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;

    invoke-direct {v0}, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;-><init>()V

    invoke-static {p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->〺つふすそ(Landroid/content/Context;I)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    move-result-object p1

    iput-object p1, v0, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;

    const/16 p2, 0x11

    const/4 v1, 0x0

    invoke-direct {p1, p2, v1, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;-><init>(IFF)V

    iput-object p1, v0, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;

    return-object v0
.end method
