.class public Landroidx/appcompat/widget/ActivityChooserView;
.super Landroid/view/ViewGroup;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ActivityChooserView$InnerLayout;,
        Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;,
        Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;
    }
.end annotation


# instance fields
.field public final 〳ぜぞぜべっ:Landroid/widget/FrameLayout;

.field public final 〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

.field public final ぁごぐすすぃ:Landroid/widget/ImageView;

.field public final いいにぽつ:I

.field public ぇぬぎばつ:I

.field public ぉざぅち〻:Z

.field public おぐぴう〸ず:Landroid/widget/PopupWindow$OnDismissListener;

.field public final くし〴〺ぅ:Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;

.field public ざとぅぼこ〺:I

.field public final づざかべべ:Landroid/graphics/drawable/Drawable;

.field public final てぜきぽく:Landroid/database/DataSetObserver;

.field public final なぎぱいぢぎ:Landroid/widget/FrameLayout;

.field public final のぷのちつ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public final びぐびあび:Landroid/view/View;

.field public へぬ〴づぞ:Landroidx/appcompat/widget/ListPopupWindow;

.field public final ぺぁあねじ:Landroid/widget/ImageView;

.field public ぺふねづ〺:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 13

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Landroidx/appcompat/widget/ActivityChooserView$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ActivityChooserView$げつ〴ぬぐ;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->てぜきぽく:Landroid/database/DataSetObserver;

    new-instance v0, Landroidx/appcompat/widget/ActivityChooserView$〺つふすそ;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ActivityChooserView$〺つふすそ;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->のぷのちつ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    const/4 v0, 0x4

    iput v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ぇぬぎばつ:I

    sget-object v3, Lづざかべべ/〺つふすそ/いいにぽつ;->ActivityChooserView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v3, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v8

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, v8

    move v6, p3

    invoke-static/range {v1 .. v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->けときぜと(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActivityChooserView_initialActivityCount:I

    invoke-virtual {v8, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/widget/ActivityChooserView;->ぇぬぎばつ:I

    sget p2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActivityChooserView_expandActivityOverflowButtonDrawable:I

    invoke-virtual {v8, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    sget v0, Lづざかべべ/〺つふすそ/ぁごぐすすぃ;->abc_activity_chooser_view:I

    const/4 v1, 0x1

    invoke-virtual {p3, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    new-instance p3, Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;

    invoke-direct {p3, p0}, Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    iput-object p3, p0, Landroidx/appcompat/widget/ActivityChooserView;->くし〴〺ぅ:Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;

    sget v0, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->activity_chooser_view_content:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->びぐびあび:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->づざかべべ:Landroid/graphics/drawable/Drawable;

    sget v0, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->default_activity_button:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->〳ぜぞぜべっ:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p3}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0, p3}, Landroid/widget/FrameLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    sget v1, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->image:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ぺぁあねじ:Landroid/widget/ImageView;

    sget v0, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->expand_activities_button:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-virtual {v0, p3}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p3, Landroidx/appcompat/widget/ActivityChooserView$くし〴〺ぅ;

    invoke-direct {p3, p0}, Landroidx/appcompat/widget/ActivityChooserView$くし〴〺ぅ;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    invoke-virtual {v0, p3}, Landroid/widget/FrameLayout;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    new-instance p3, Landroidx/appcompat/widget/ActivityChooserView$びぐびあび;

    invoke-direct {p3, p0, v0}, Landroidx/appcompat/widget/ActivityChooserView$びぐびあび;-><init>(Landroidx/appcompat/widget/ActivityChooserView;Landroid/view/View;)V

    invoke-virtual {v0, p3}, Landroid/widget/FrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->なぎぱいぢぎ:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    iput-object p3, p0, Landroidx/appcompat/widget/ActivityChooserView;->ぁごぐすすぃ:Landroid/widget/ImageView;

    invoke-virtual {p3, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance p2, Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    invoke-direct {p2, p0}, Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    iput-object p2, p0, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    new-instance p3, Landroidx/appcompat/widget/ActivityChooserView$づざかべべ;

    invoke-direct {p3, p0}, Landroidx/appcompat/widget/ActivityChooserView$づざかべべ;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    invoke-virtual {p2, p3}, Landroid/widget/BaseAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 p2, p2, 0x2

    sget p3, Lづざかべべ/〺つふすそ/びぐびあび;->abc_config_prefDialogWidth:I

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->いいにぽつ:I

    return-void
.end method


# virtual methods
.method public getDataModel()Lづざかべべ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return-object v0
.end method

.method public getListPopupWindow()Landroidx/appcompat/widget/ListPopupWindow;
    .registers 5

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->へぬ〴づぞ:Landroidx/appcompat/widget/ListPopupWindow;

    if-nez v0, :cond_2a

    new-instance v0, Landroidx/appcompat/widget/ListPopupWindow;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 1
    sget v2, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->listPopupWindowStyle:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Landroidx/appcompat/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->へぬ〴づぞ:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ListPopupWindow;->おぐぴう〸ず(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->へぬ〴づぞ:Landroidx/appcompat/widget/ListPopupWindow;

    .line 3
    iput-object p0, v0, Landroidx/appcompat/widget/ListPopupWindow;->ぉざぅち〻:Landroid/view/View;

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ListPopupWindow;->ざとぅぼこ〺(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->へぬ〴づぞ:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->くし〴〺ぅ:Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;

    .line 5
    iput-object v1, v0, Landroidx/appcompat/widget/ListPopupWindow;->ざとぅぼこ〺:Landroid/widget/AdapterView$OnItemClickListener;

    .line 6
    iget-object v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->びえぁぜい:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 7
    :cond_2a
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->へぬ〴づぞ:Landroidx/appcompat/widget/ListPopupWindow;

    return-object v0
.end method

.method public onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ぉざぅち〻:Z

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 3

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_17

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->のぷのちつ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_17
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->げつ〴ぬぐ()Z

    :cond_20
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ぉざぅち〻:Z

    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 6

    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->びぐびあび:Landroid/view/View;

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ()Z

    move-result p1

    if-nez p1, :cond_11

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->げつ〴ぬぐ()Z

    :cond_11
    return-void
.end method

.method public onMeasure(II)V
    .registers 5

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->びぐびあび:Landroid/view/View;

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->〳ぜぞぜべっ:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_14

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    :cond_14
    invoke-virtual {p0, v0, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public setActivityChooserModel(Lづざかべべ/〺つふすそ/ぉざぅち〻/くし〴〺ぅ;)V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    .line 1
    iget-object v1, v0, Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;->づざかべべ:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v1, v1, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_1a

    .line 3
    iget-object p1, v0, Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;->づざかべべ:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->isShown()Z

    move-result p1

    if-nez p1, :cond_14

    goto :goto_1a

    :cond_14
    iget-object p1, v0, Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;->づざかべべ:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActivityChooserView;->てぜきぽく:Landroid/database/DataSetObserver;

    const/4 p1, 0x0

    throw p1

    :cond_1a
    :goto_1a
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ()Z

    move-result p1

    if-eqz p1, :cond_29

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->げつ〴ぬぐ()Z

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->くし〴〺ぅ()Z

    :cond_29
    return-void
.end method

.method public setDefaultActionButtonContentDescription(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->ざとぅぼこ〺:I

    return-void
.end method

.method public setExpandActivityOverflowButtonContentDescription(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ぁごぐすすぃ:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setExpandActivityOverflowButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ぁごぐすすぃ:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setInitialActivityCount(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->ぇぬぎばつ:I

    return-void
.end method

.method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->おぐぴう〸ず:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public setProvider(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->ぺふねづ〺:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;

    return-void
.end method

.method public 〺つふすそ()Z
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Landroidx/appcompat/widget/ListPopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->〺つふすそ()Z

    move-result v0

    return v0
.end method

.method public くし〴〺ぅ()Z
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ()Z

    move-result v0

    if-nez v0, :cond_12

    iget-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ぉざぅち〻:Z

    if-nez v0, :cond_b

    goto :goto_12

    :cond_b
    iget v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ぇぬぎばつ:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ActivityChooserView;->びぐびあび(I)V

    const/4 v0, 0x0

    throw v0

    :cond_12
    :goto_12
    const/4 v0, 0x0

    return v0
.end method

.method public げつ〴ぬぐ()Z
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Landroidx/appcompat/widget/ListPopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->dismiss()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_1c

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->のぷのちつ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1c
    const/4 v0, 0x1

    return v0
.end method

.method public びぐびあび(I)V
    .registers 3

    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No data model. Did you call #setDataModel?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
