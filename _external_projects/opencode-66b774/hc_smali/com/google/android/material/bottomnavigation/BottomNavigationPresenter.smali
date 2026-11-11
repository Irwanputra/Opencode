.class public Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter$SavedState;
    }
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

.field public くし〴〺ぅ:Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

.field public づざかべべ:I

.field public びぐびあび:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->びぐびあび:Z

    return-void
.end method


# virtual methods
.method public getId()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->づざかべべ:I

    return v0
.end method

.method public 〳ぜぞぜべっ()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public ぁごぐすすぃ(Z)V
    .registers 8

    iget-boolean v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->びぐびあび:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    if-eqz p1, :cond_e

    iget-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->くし〴〺ぅ:Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    invoke-virtual {p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->げつ〴ぬぐ()V

    goto/16 :goto_8a

    :cond_e
    iget-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->くし〴〺ぅ:Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    .line 1
    iget-object v0, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v0, :cond_8a

    iget-object v1, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    if-nez v1, :cond_19

    goto :goto_8a

    :cond_19
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->size()I

    move-result v0

    iget-object v1, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    array-length v1, v1

    if-eq v0, v1, :cond_26

    invoke-virtual {p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->げつ〴ぬぐ()V

    goto :goto_8a

    :cond_26
    iget v1, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->のぷのちつ:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2a
    if-ge v3, v0, :cond_43

    iget-object v4, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v4, v3}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v4

    invoke-interface {v4}, Landroid/view/MenuItem;->isChecked()Z

    move-result v5

    if-eqz v5, :cond_40

    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    move-result v4

    iput v4, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->のぷのちつ:I

    iput v3, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->へぬ〴づぞ:I

    :cond_40
    add-int/lit8 v3, v3, 0x1

    goto :goto_2a

    :cond_43
    iget v3, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->のぷのちつ:I

    if-eq v1, v3, :cond_4c

    iget-object v1, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->〺つふすそ:Landroidx/transition/TransitionSet;

    invoke-static {p1, v1}, Lづざかべべ/は〲ぱなで/でどあくず;->げつ〴ぬぐ(Landroid/view/ViewGroup;Landroidx/transition/Transition;)V

    :cond_4c
    iget v1, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぺふねづ〺:I

    iget-object v3, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->てぜきぽく()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {p1, v1, v3}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->びぐびあび(II)Z

    move-result v1

    const/4 v3, 0x0

    :goto_5d
    if-ge v3, v0, :cond_8a

    iget-object v4, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぉ〲なぱぽた:Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;

    const/4 v5, 0x1

    .line 2
    iput-boolean v5, v4, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->びぐびあび:Z

    .line 3
    iget-object v4, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    aget-object v4, v4, v3

    iget v5, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぺふねづ〺:I

    invoke-virtual {v4, v5}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setLabelVisibilityMode(I)V

    iget-object v4, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    aget-object v4, v4, v3

    invoke-virtual {v4, v1}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->setShifting(Z)V

    iget-object v4, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->てぜきぽく:[Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    aget-object v4, v4, v3

    iget-object v5, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v5, v3}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    check-cast v5, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    invoke-virtual {v4, v5, v2}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;I)V

    iget-object v4, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぉ〲なぱぽた:Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;

    .line 4
    iput-boolean v2, v4, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->びぐびあび:Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_5d

    :cond_8a
    :goto_8a
    return-void
.end method

.method public いいにぽつ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)Z
    .registers 3

    const/4 p1, 0x0

    return p1
.end method

.method public くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 3

    iput-object p2, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    iget-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->くし〴〺ぅ:Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    .line 1
    iput-object p2, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Z)V
    .registers 3

    return-void
.end method

.method public づざかべべ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;)Z
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public びぐびあび(Landroid/os/Parcelable;)V
    .registers 10

    instance-of v0, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter$SavedState;

    if-eqz v0, :cond_97

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->くし〴〺ぅ:Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    check-cast p1, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter$SavedState;

    iget v1, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter$SavedState;->〺つふすそ:I

    .line 1
    iget-object v2, v0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_12
    if-ge v4, v2, :cond_2c

    iget-object v5, v0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v5, v4}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    move-result v6

    if-ne v1, v6, :cond_29

    iput v1, v0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->のぷのちつ:I

    iput v4, v0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->へぬ〴づぞ:I

    const/4 v0, 0x1

    invoke-interface {v5, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    goto :goto_2c

    :cond_29
    add-int/lit8 v4, v4, 0x1

    goto :goto_12

    .line 2
    :cond_2c
    :goto_2c
    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->くし〴〺ぅ:Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter$SavedState;->くし〴〺ぅ:Lcom/google/android/material/internal/ParcelableSparseArray;

    .line 3
    sget-boolean v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    new-instance v1, Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v2

    invoke-direct {v1, v2}, Landroid/util/SparseArray;-><init>(I)V

    :goto_3f
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v3, v2, :cond_92

    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    if-eqz v4, :cond_8a

    .line 4
    new-instance v5, Lcom/google/android/material/badge/BadgeDrawable;

    invoke-direct {v5, v0}, Lcom/google/android/material/badge/BadgeDrawable;-><init>(Landroid/content/Context;)V

    .line 5
    iget v6, v4, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->なぎぱいぢぎ:I

    .line 6
    invoke-virtual {v5, v6}, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ(I)V

    .line 7
    iget v6, v4, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->づざかべべ:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_63

    .line 8
    invoke-virtual {v5, v6}, Lcom/google/android/material/badge/BadgeDrawable;->いいにぽつ(I)V

    .line 9
    :cond_63
    iget v6, v4, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->〺つふすそ:I

    .line 10
    invoke-virtual {v5, v6}, Lcom/google/android/material/badge/BadgeDrawable;->なぎぱいぢぎ(I)V

    .line 11
    iget v6, v4, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->くし〴〺ぅ:I

    .line 12
    invoke-virtual {v5, v6}, Lcom/google/android/material/badge/BadgeDrawable;->〳ぜぞぜべっ(I)V

    .line 13
    iget v6, v4, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->いいにぽつ:I

    .line 14
    invoke-virtual {v5, v6}, Lcom/google/android/material/badge/BadgeDrawable;->ぁごぐすすぃ(I)V

    .line 15
    iget v6, v4, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->ぺふねづ〺:I

    .line 16
    iget-object v7, v5, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 17
    iput v6, v7, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->ぺふねづ〺:I

    .line 18
    invoke-virtual {v5}, Lcom/google/android/material/badge/BadgeDrawable;->ぺふねづ〺()V

    .line 19
    iget v4, v4, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->てぜきぽく:I

    .line 20
    iget-object v6, v5, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 21
    iput v4, v6, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->てぜきぽく:I

    .line 22
    invoke-virtual {v5}, Lcom/google/android/material/badge/BadgeDrawable;->ぺふねづ〺()V

    .line 23
    invoke-virtual {v1, v2, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3f

    :cond_8a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "BadgeDrawable\'s savedState cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :cond_92
    iget-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->くし〴〺ぅ:Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    invoke-virtual {p1, v1}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->setBadgeDrawables(Landroid/util/SparseArray;)V

    :cond_97
    return-void
.end method

.method public ぺぁあねじ()Landroid/os/Parcelable;
    .registers 7

    new-instance v0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter$SavedState;

    invoke-direct {v0}, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter$SavedState;-><init>()V

    iget-object v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->くし〴〺ぅ:Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    invoke-virtual {v1}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->getSelectedItemId()I

    move-result v1

    iput v1, v0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter$SavedState;->〺つふすそ:I

    iget-object v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;->くし〴〺ぅ:Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    invoke-virtual {v1}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->getBadgeDrawables()Landroid/util/SparseArray;

    move-result-object v1

    .line 1
    sget-boolean v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    new-instance v2, Lcom/google/android/material/internal/ParcelableSparseArray;

    invoke-direct {v2}, Lcom/google/android/material/internal/ParcelableSparseArray;-><init>()V

    const/4 v3, 0x0

    :goto_1b
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ge v3, v4, :cond_3d

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/material/badge/BadgeDrawable;

    if-eqz v5, :cond_35

    .line 2
    iget-object v5, v5, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 3
    invoke-virtual {v2, v4, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1b

    :cond_35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "badgeDrawable cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_3d
    iput-object v2, v0, Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter$SavedState;->くし〴〺ぅ:Lcom/google/android/material/internal/ParcelableSparseArray;

    return-object v0
.end method

.method public ぺふねづ〺(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)Z
    .registers 3

    const/4 p1, 0x0

    return p1
.end method
