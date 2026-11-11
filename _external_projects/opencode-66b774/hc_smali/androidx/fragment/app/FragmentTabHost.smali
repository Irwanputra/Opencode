.class public Landroidx/fragment/app/FragmentTabHost;
.super Landroid/widget/TabHost;
.source ""

# interfaces
.implements Landroid/widget/TabHost$OnTabChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/FragmentTabHost$SavedState;,
        Landroidx/fragment/app/FragmentTabHost$げつ〴ぬぐ;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public final 〺つふすそ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/FragmentTabHost$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public ぁごぐすすぃ:Landroid/widget/TabHost$OnTabChangeListener;

.field public くし〴〺ぅ:Landroid/widget/FrameLayout;

.field public づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

.field public なぎぱいぢぎ:I

.field public びぐびあび:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/widget/TabHost;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/FragmentTabHost;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/FragmentTabHost;->びぐびあび(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0, p1, p2}, Landroid/widget/TabHost;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/FragmentTabHost;->びぐびあび(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .registers 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0}, Landroid/widget/TabHost;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/widget/TabHost;->getCurrentTabTag()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/FragmentTabHost;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_e
    const/4 v3, 0x0

    if-ge v2, v1, :cond_2f

    iget-object v4, p0, Landroidx/fragment/app/FragmentTabHost;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/FragmentTabHost$げつ〴ぬぐ;

    iget-object v5, p0, Landroidx/fragment/app/FragmentTabHost;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v5

    iput-object v5, v4, Landroidx/fragment/app/FragmentTabHost$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/fragment/app/Fragment;

    if-eqz v5, :cond_2c

    .line 1
    iget-boolean v4, v5, Landroidx/fragment/app/Fragment;->びえぁぜい:Z

    if-eqz v4, :cond_2b

    goto :goto_2c

    .line 2
    :cond_2b
    throw v3

    :cond_2c
    :goto_2c
    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_2f
    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/fragment/app/FragmentTabHost;->〳ぜぞぜべっ:Z

    invoke-virtual {p0, v0, v3}, Landroidx/fragment/app/FragmentTabHost;->げつ〴ぬぐ(Ljava/lang/String;Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    move-result-object v0

    if-eqz v0, :cond_45

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->くし〴〺ぅ()I

    iget-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    check-cast v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 3
    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ばおぢでぎか()Z

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->くねねぱす〻()V

    :cond_45
    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0}, Landroid/widget/TabHost;->onDetachedFromWindow()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/FragmentTabHost;->〳ぜぞぜべっ:Z

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3
    .param p1    # Landroid/os/Parcelable;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    instance-of v0, p1, Landroidx/fragment/app/FragmentTabHost$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/widget/TabHost;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Landroidx/fragment/app/FragmentTabHost$SavedState;

    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/TabHost;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object p1, p1, Landroidx/fragment/app/FragmentTabHost$SavedState;->〺つふすそ:Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/widget/TabHost;->setCurrentTabByTag(Ljava/lang/String;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0}, Landroid/widget/TabHost;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/FragmentTabHost$SavedState;

    invoke-direct {v1, v0}, Landroidx/fragment/app/FragmentTabHost$SavedState;-><init>(Landroid/os/Parcelable;)V

    invoke-virtual {p0}, Landroid/widget/TabHost;->getCurrentTabTag()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Landroidx/fragment/app/FragmentTabHost$SavedState;->〺つふすそ:Ljava/lang/String;

    return-object v1
.end method

.method public onTabChanged(Ljava/lang/String;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Landroidx/fragment/app/FragmentTabHost;->〳ぜぞぜべっ:Z

    if-eqz v0, :cond_e

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/FragmentTabHost;->げつ〴ぬぐ(Ljava/lang/String;Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->くし〴〺ぅ()I

    :cond_e
    iget-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->ぁごぐすすぃ:Landroid/widget/TabHost$OnTabChangeListener;

    if-eqz v0, :cond_15

    invoke-interface {v0, p1}, Landroid/widget/TabHost$OnTabChangeListener;->onTabChanged(Ljava/lang/String;)V

    :cond_15
    return-void
.end method

.method public setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Landroidx/fragment/app/FragmentTabHost;->ぁごぐすすぃ:Landroid/widget/TabHost$OnTabChangeListener;

    return-void
.end method

.method public setup()V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must call setup() that takes a Context and FragmentManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setup(Landroid/content/Context;Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentTabHost;->くし〴〺ぅ(Landroid/content/Context;)V

    invoke-super {p0}, Landroid/widget/TabHost;->setup()V

    iput-object p1, p0, Landroidx/fragment/app/FragmentTabHost;->びぐびあび:Landroid/content/Context;

    iput-object p2, p0, Landroidx/fragment/app/FragmentTabHost;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentTabHost;->〺つふすそ()V

    return-void
.end method

.method public setup(Landroid/content/Context;Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;I)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentTabHost;->くし〴〺ぅ(Landroid/content/Context;)V

    invoke-super {p0}, Landroid/widget/TabHost;->setup()V

    iput-object p1, p0, Landroidx/fragment/app/FragmentTabHost;->びぐびあび:Landroid/content/Context;

    iput-object p2, p0, Landroidx/fragment/app/FragmentTabHost;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    iput p3, p0, Landroidx/fragment/app/FragmentTabHost;->なぎぱいぢぎ:I

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentTabHost;->〺つふすそ()V

    iget-object p1, p0, Landroidx/fragment/app/FragmentTabHost;->くし〴〺ぅ:Landroid/widget/FrameLayout;

    invoke-virtual {p1, p3}, Landroid/widget/FrameLayout;->setId(I)V

    invoke-virtual {p0}, Landroid/widget/TabHost;->getId()I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_21

    const p1, 0x1020012

    invoke-virtual {p0, p1}, Landroid/widget/TabHost;->setId(I)V

    :cond_21
    return-void
.end method

.method public final 〺つふすそ()V
    .registers 4

    iget-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->くし〴〺ぅ:Landroid/widget/FrameLayout;

    if-nez v0, :cond_26

    iget v0, p0, Landroidx/fragment/app/FragmentTabHost;->なぎぱいぢぎ:I

    invoke-virtual {p0, v0}, Landroid/widget/TabHost;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->くし〴〺ぅ:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_11

    goto :goto_26

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No tab content FrameLayout found for id "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Landroidx/fragment/app/FragmentTabHost;->なぎぱいぢぎ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_26
    :goto_26
    return-void
.end method

.method public final くし〴〺ぅ(Landroid/content/Context;)V
    .registers 9

    const v0, 0x1020013

    invoke-virtual {p0, v0}, Landroid/widget/TabHost;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_5a

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v1, v2}, Landroid/widget/TabHost;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/TabWidget;

    invoke-direct {v2, p1}, Landroid/widget/TabWidget;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v0}, Landroid/widget/TabWidget;->setId(I)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/TabWidget;->setOrientation(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x2

    const/4 v6, 0x0

    invoke-direct {v4, v3, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v2, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const v4, 0x1020011

    invoke-virtual {v2, v4}, Landroid/widget/FrameLayout;->setId(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v0, v0, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v2, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Landroidx/fragment/app/FragmentTabHost;->くし〴〺ぅ:Landroid/widget/FrameLayout;

    iget p1, p0, Landroidx/fragment/app/FragmentTabHost;->なぎぱいぢぎ:I

    invoke-virtual {v2, p1}, Landroid/widget/FrameLayout;->setId(I)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {p1, v3, v0, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v2, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_5a
    return-void
.end method

.method public final げつ〴ぬぐ(Ljava/lang/String;Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;
    .registers 4

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/FragmentTabHost;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p2, 0x0

    if-gtz p1, :cond_a

    return-object p2

    :cond_a
    iget-object p1, p0, Landroidx/fragment/app/FragmentTabHost;->〺つふすそ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentTabHost$げつ〴ぬぐ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw p2
.end method

.method public final びぐびあび(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    const/4 v0, 0x1

    new-array v0, v0, [I

    const v1, 0x10100f3

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-virtual {p1, p2, v0, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Landroidx/fragment/app/FragmentTabHost;->なぎぱいぢぎ:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-super {p0, p0}, Landroid/widget/TabHost;->setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V

    return-void
.end method
